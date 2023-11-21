package com.recepies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u000f\u001a\u0002H\u0010\"\u0006\b\u0000\u0010\u0010\u0018\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0086\b\u00a2\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u0004\u0018\u00010\u0012\"\u0006\b\u0000\u0010\u0010\u0018\u00012\u0006\u0010\u0015\u001a\u0002H\u0010H\u0086\b\u00a2\u0006\u0002\u0010\u0016JE\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u0002H\u0010\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u0018\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u0018H\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJK\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u0010\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u0018\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00122\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120 H\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!JU\u0010\"\u001a\u0012\u0012\u0004\u0012\u0002H\u0010\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u0018\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020$2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120 H\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/recepies/network/NetworkHelper;", "", "()V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "retrofitClient", "Lcom/recepies/network/RetrofitClient;", "getRetrofitClient", "()Lcom/recepies/network/RetrofitClient;", "setRetrofitClient", "(Lcom/recepies/network/RetrofitClient;)V", "convert", "T", "response", "", "(Ljava/lang/String;)Ljava/lang/Object;", "convertObjectToString", "data", "(Ljava/lang/Object;)Ljava/lang/String;", "getResponse", "Lcom/recepies/network/NetworkResponse;", "Ljava/lang/Error;", "Lkotlin/Error;", "callObject", "(Lcom/recepies/network/NetworkResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeGetRequest", "url", "header", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makePostRequest", "body", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_debug"})
public final class NetworkHelper {
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.network.NetworkHelper INSTANCE = null;
    public static com.recepies.network.RetrofitClient retrofitClient;
    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy gson$delegate = null;
    
    private NetworkHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recepies.network.RetrofitClient getRetrofitClient() {
        return null;
    }
    
    public final void setRetrofitClient(@org.jetbrains.annotations.NotNull
    com.recepies.network.RetrofitClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.gson.Gson getGson() {
        return null;
    }
}
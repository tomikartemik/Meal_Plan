// Generated by Dagger (https://dagger.dev).
package com.recepies.network;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitClient_Factory implements Factory<RetrofitClient> {
  private final Provider<ApiService> apiServiceProvider;

  public RetrofitClient_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RetrofitClient get() {
    return newInstance(apiServiceProvider.get());
  }

  public static RetrofitClient_Factory create(Provider<ApiService> apiServiceProvider) {
    return new RetrofitClient_Factory(apiServiceProvider);
  }

  public static RetrofitClient newInstance(ApiService apiService) {
    return new RetrofitClient(apiService);
  }
}
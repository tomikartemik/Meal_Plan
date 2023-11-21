// Generated by Dagger (https://dagger.dev).
package com.recepies.network.di;

import com.recepies.network.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideApiServieFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideApiServieFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiServie(retrofitProvider.get());
  }

  public static NetworkModule_ProvideApiServieFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideApiServieFactory(retrofitProvider);
  }

  public static ApiService provideApiServie(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideApiServie(retrofit));
  }
}

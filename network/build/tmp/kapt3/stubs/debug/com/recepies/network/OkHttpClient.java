package com.recepies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/recepies/network/OkHttpClient;", "", "()V", "Companion", "network_debug"})
public final class OkHttpClient {
    @org.jetbrains.annotations.NotNull
    public static final com.recepies.network.OkHttpClient.Companion Companion = null;
    private static com.recepies.network.NetworkConfiguration networkConfiguration;
    
    private OkHttpClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/recepies/network/OkHttpClient$Companion;", "", "()V", "networkConfiguration", "Lcom/recepies/network/NetworkConfiguration;", "getOkhttpClientInterceptor", "Lokhttp3/OkHttpClient;", "setNetworkConfiguration", "", "network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setNetworkConfiguration(@org.jetbrains.annotations.NotNull
        com.recepies.network.NetworkConfiguration networkConfiguration) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final okhttp3.OkHttpClient getOkhttpClientInterceptor() {
            return null;
        }
    }
}
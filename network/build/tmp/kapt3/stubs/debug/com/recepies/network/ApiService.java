package com.recepies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0014\b\u0003\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJK\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\r2\u0014\b\u0003\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/recepies/network/ApiService;", "", "makeGetRequest", "Lcom/recepies/network/NetworkResponse;", "", "Ljava/lang/Error;", "Lkotlin/Error;", "url", "header", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makePostRequest", "body", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "network_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET
    public abstract java.lang.Object makeGetRequest(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Url
    java.lang.String url, @org.jetbrains.annotations.NotNull
    @retrofit2.http.HeaderMap
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.network.NetworkResponse<java.lang.String, ? extends java.lang.Error>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST
    public abstract java.lang.Object makePostRequest(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Url
    java.lang.String url, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.google.gson.JsonObject body, @org.jetbrains.annotations.NotNull
    @retrofit2.http.HeaderMap
    java.util.Map<java.lang.String, java.lang.String> header, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.recepies.network.NetworkResponse<java.lang.String, ? extends java.lang.Error>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}
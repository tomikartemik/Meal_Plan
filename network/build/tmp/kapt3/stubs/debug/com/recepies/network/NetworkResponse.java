package com.recepies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/recepies/network/NetworkResponse;", "T", "", "U", "()V", "ApiError", "NetworkError", "Success", "UnknownError", "Lcom/recepies/network/NetworkResponse$ApiError;", "Lcom/recepies/network/NetworkResponse$NetworkError;", "Lcom/recepies/network/NetworkResponse$Success;", "Lcom/recepies/network/NetworkResponse$UnknownError;", "network_debug"})
public abstract class NetworkResponse<T extends java.lang.Object, U extends java.lang.Object> {
    
    private NetworkResponse() {
        super();
    }
    
    /**
     * Success response with body
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0007H\u00c6\u0003J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/recepies/network/NetworkResponse$Success;", "T", "", "Lcom/recepies/network/NetworkResponse;", "", "body", "code", "", "(Ljava/lang/Object;I)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()I", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/recepies/network/NetworkResponse$Success;", "equals", "", "other", "hashCode", "toString", "", "network_debug"})
    public static final class Success<T extends java.lang.Object> extends com.recepies.network.NetworkResponse {
        @org.jetbrains.annotations.NotNull
        private final T body = null;
        private final int code = 0;
        
        /**
         * Success response with body
         */
        @org.jetbrains.annotations.NotNull
        public final com.recepies.network.NetworkResponse.Success<T> copy(@org.jetbrains.annotations.NotNull
        T body, int code) {
            return null;
        }
        
        /**
         * Success response with body
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Success response with body
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Success response with body
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public Success(@org.jetbrains.annotations.NotNull
        T body, int code) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final T getBody() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getCode() {
            return 0;
        }
    }
    
    /**
     * Failure response with body
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0002H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0007H\u00c6\u0003J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0013\u0010\u0005\u001a\u00028\u0002\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/recepies/network/NetworkResponse$ApiError;", "U", "", "Lcom/recepies/network/NetworkResponse;", "", "body", "code", "", "(Ljava/lang/Object;I)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()I", "component1", "component2", "copy", "(Ljava/lang/Object;I)Lcom/recepies/network/NetworkResponse$ApiError;", "equals", "", "other", "hashCode", "toString", "", "network_debug"})
    public static final class ApiError<U extends java.lang.Object> extends com.recepies.network.NetworkResponse {
        @org.jetbrains.annotations.NotNull
        private final U body = null;
        private final int code = 0;
        
        /**
         * Failure response with body
         */
        @org.jetbrains.annotations.NotNull
        public final com.recepies.network.NetworkResponse.ApiError<U> copy(@org.jetbrains.annotations.NotNull
        U body, int code) {
            return null;
        }
        
        /**
         * Failure response with body
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Failure response with body
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Failure response with body
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public ApiError(@org.jetbrains.annotations.NotNull
        U body, int code) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final U component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final U getBody() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getCode() {
            return 0;
        }
    }
    
    /**
     * Network error
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/recepies/network/NetworkResponse$NetworkError;", "Lcom/recepies/network/NetworkResponse;", "", "error", "Ljava/io/IOException;", "(Ljava/io/IOException;)V", "getError", "()Ljava/io/IOException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "network_debug"})
    public static final class NetworkError extends com.recepies.network.NetworkResponse {
        @org.jetbrains.annotations.NotNull
        private final java.io.IOException error = null;
        
        /**
         * Network error
         */
        @org.jetbrains.annotations.NotNull
        public final com.recepies.network.NetworkResponse.NetworkError copy(@org.jetbrains.annotations.NotNull
        java.io.IOException error) {
            return null;
        }
        
        /**
         * Network error
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * Network error
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * Network error
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public NetworkError(@org.jetbrains.annotations.NotNull
        java.io.IOException error) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.io.IOException component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.io.IOException getError() {
            return null;
        }
    }
    
    /**
     * For recepies, json parsing error
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/recepies/network/NetworkResponse$UnknownError;", "Lcom/recepies/network/NetworkResponse;", "", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "network_debug"})
    public static final class UnknownError extends com.recepies.network.NetworkResponse {
        @org.jetbrains.annotations.Nullable
        private final java.lang.Throwable error = null;
        
        /**
         * For recepies, json parsing error
         */
        @org.jetbrains.annotations.NotNull
        public final com.recepies.network.NetworkResponse.UnknownError copy(@org.jetbrains.annotations.Nullable
        java.lang.Throwable error) {
            return null;
        }
        
        /**
         * For recepies, json parsing error
         */
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        /**
         * For recepies, json parsing error
         */
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        /**
         * For recepies, json parsing error
         */
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public UnknownError(@org.jetbrains.annotations.Nullable
        java.lang.Throwable error) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable getError() {
            return null;
        }
    }
}
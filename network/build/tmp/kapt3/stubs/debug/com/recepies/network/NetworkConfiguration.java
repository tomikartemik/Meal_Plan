package com.recepies.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B3\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/recepies/network/NetworkConfiguration;", "", "baseHeader", "", "", "requestTimeOut", "", "connectionTimeOut", "readTimeOut", "(Ljava/util/Map;JJJ)V", "getBaseHeader", "()Ljava/util/Map;", "getConnectionTimeOut", "()J", "getReadTimeOut", "getRequestTimeOut", "Builder", "network_debug"})
public final class NetworkConfiguration {
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, java.lang.String> baseHeader = null;
    private final long requestTimeOut = 0L;
    private final long connectionTimeOut = 0L;
    private final long readTimeOut = 0L;
    
    private NetworkConfiguration(java.util.Map<java.lang.String, java.lang.String> baseHeader, long requestTimeOut, long connectionTimeOut, long readTimeOut) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> getBaseHeader() {
        return null;
    }
    
    public final long getRequestTimeOut() {
        return 0L;
    }
    
    public final long getConnectionTimeOut() {
        return 0L;
    }
    
    public final long getReadTimeOut() {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0006\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/recepies/network/NetworkConfiguration$Builder;", "", "()V", "baseHeader", "", "", "connectionTimeOut", "", "readTimeOut", "requestTimeOut", "", "header", "build", "Lcom/recepies/network/NetworkConfiguration;", "connectionTimeOutInMIlli", "readTimeOutInMIlli", "requestTimeOutInMIlli", "network_debug"})
    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> baseHeader;
        private long connectionTimeOut = 5000L;
        private long requestTimeOut = 5000L;
        private long readTimeOut = 5000L;
        
        public Builder() {
            super();
        }
        
        public final void baseHeader(@org.jetbrains.annotations.NotNull
        java.util.Map<java.lang.String, java.lang.String> header) {
        }
        
        public final void connectionTimeOut(long connectionTimeOutInMIlli) {
        }
        
        public final void requestTimeOut(long requestTimeOutInMIlli) {
        }
        
        public final void readTimeOut(long readTimeOutInMIlli) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.recepies.network.NetworkConfiguration build() {
            return null;
        }
    }
}
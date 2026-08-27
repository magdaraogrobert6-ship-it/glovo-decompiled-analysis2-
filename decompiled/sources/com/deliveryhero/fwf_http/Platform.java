package com.deliveryhero.fwf_http;

/* JADX INFO: loaded from: classes2.dex */
public interface Platform {
    PlatformName getDeviceOS();

    String getDeviceVersion();

    boolean isServer();
}

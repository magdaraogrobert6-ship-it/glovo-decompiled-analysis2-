package com.deliveryhero.fwf_http;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidPlatform implements Platform {
    private final PlatformName deviceOS = PlatformName.ANDROID;
    private final String deviceVersion = String.valueOf(Build.VERSION.SDK_INT);
    private final boolean isServer;

    @Override // com.deliveryhero.fwf_http.Platform
    public PlatformName getDeviceOS() {
        return this.deviceOS;
    }

    @Override // com.deliveryhero.fwf_http.Platform
    public String getDeviceVersion() {
        return this.deviceVersion;
    }

    @Override // com.deliveryhero.fwf_http.Platform
    public boolean isServer() {
        return this.isServer;
    }
}

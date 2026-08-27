package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxOptionsImpl {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class MapboxOptionsImplPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapboxOptionsImpl.cleanNativePeer(this.peer);
        }

        public MapboxOptionsImplPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native String getAccessToken();

    public static native String getTokenForService(String str);

    public static native boolean getUseStaging(String str);

    private static native void nativeSelfRegister();

    public static native void setAccessToken(String str);

    public static native void setStagingAccessToken(String str);

    public static native void setTokenForService(String str, String str2);

    public static native void setUseStaging(String str, boolean z);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapboxOptionsImpl(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapboxOptionsImplPeerCleaner(j));
    }
}

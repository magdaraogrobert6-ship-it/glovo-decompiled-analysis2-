package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
public final class Version {
    protected long peer;

    public static class VersionPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Version.cleanNativePeer(this.peer);
        }

        public VersionPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native int getMajorVersion();

    public static native int getMinorVersion();

    public static native int getPatchVersion();

    public static native String getRevisionString();

    public static native String getVersionString();

    private static native void nativeSelfRegister();

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Version(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new VersionPeerCleaner(j));
    }
}

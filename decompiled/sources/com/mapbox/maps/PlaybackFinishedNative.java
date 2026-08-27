package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class PlaybackFinishedNative implements PlaybackFinished {
    private long peer;

    public static class PlaybackFinishedPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            PlaybackFinishedNative.cleanNativePeer(this.peer);
        }

        public PlaybackFinishedPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.PlaybackFinished
    public native void run();

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private PlaybackFinishedNative(long j) {
        this.peer = j;
        CleanerService.register(this, new PlaybackFinishedPeerCleaner(j));
    }
}

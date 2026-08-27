package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes4.dex */
final class MapRecorder {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class MapRecorderPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            MapRecorder.cleanNativePeer(this.peer);
        }

        public MapRecorderPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native Expected<String, MapRecorder> createInstance(Map map);

    private static native void nativeSelfRegister();

    public native String getPlaybackState();

    public native void replay(DataRef dataRef, MapPlayerOptions mapPlayerOptions, PlaybackFinished playbackFinished);

    public native void startRecording(MapRecorderOptions mapRecorderOptions);

    public native DataRef stopRecording();

    public native void togglePauseReplay();

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapRecorder(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapRecorderPeerCleaner(j));
    }
}

package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
final class VoiceInstructionsRetrieverCallbackNative implements VoiceInstructionsRetrieverCallback {
    private long peer;

    public static class VoiceInstructionsRetrieverCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            VoiceInstructionsRetrieverCallbackNative.cleanNativePeer(this.peer);
        }

        public VoiceInstructionsRetrieverCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.VoiceInstructionsRetrieverCallback
    public native void run(VoiceInstructionsRetriever voiceInstructionsRetriever);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private VoiceInstructionsRetrieverCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new VoiceInstructionsRetrieverCallbackPeerCleaner(j));
    }
}

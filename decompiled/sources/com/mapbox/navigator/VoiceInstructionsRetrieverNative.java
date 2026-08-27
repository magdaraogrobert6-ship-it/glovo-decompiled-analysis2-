package com.mapbox.navigator;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
final class VoiceInstructionsRetrieverNative implements VoiceInstructionsRetriever {
    protected long peer;

    public static class VoiceInstructionsRetrieverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            VoiceInstructionsRetrieverNative.cleanNativePeer(this.peer);
        }

        public VoiceInstructionsRetrieverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.VoiceInstructionsRetriever
    public native void getRelevantVoiceInstructions(VoiceInstructionsCallback voiceInstructionsCallback);

    @Override // com.mapbox.navigator.VoiceInstructionsRetriever
    public native boolean isInstructionAvailable();

    @Override // com.mapbox.navigator.VoiceInstructionsRetriever
    public native void subscribe(VoiceInstructionsAvailabilityObserver voiceInstructionsAvailabilityObserver);

    @Override // com.mapbox.navigator.VoiceInstructionsRetriever
    public native void unsubscribe(VoiceInstructionsAvailabilityObserver voiceInstructionsAvailabilityObserver);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public VoiceInstructionsRetrieverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new VoiceInstructionsRetrieverPeerCleaner(j));
    }
}

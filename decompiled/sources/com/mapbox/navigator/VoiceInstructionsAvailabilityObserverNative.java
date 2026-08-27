package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class VoiceInstructionsAvailabilityObserverNative implements VoiceInstructionsAvailabilityObserver {
    protected long peer;

    public static class VoiceInstructionsAvailabilityObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            VoiceInstructionsAvailabilityObserverNative.cleanNativePeer(this.peer);
        }

        public VoiceInstructionsAvailabilityObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.VoiceInstructionsAvailabilityObserver
    public native void onVoiceInstructionAvailabilityChanged(boolean z);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public VoiceInstructionsAvailabilityObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new VoiceInstructionsAvailabilityObserverPeerCleaner(j));
    }
}

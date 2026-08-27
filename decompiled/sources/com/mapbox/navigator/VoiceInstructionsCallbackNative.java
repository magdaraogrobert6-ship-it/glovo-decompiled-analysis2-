package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class VoiceInstructionsCallbackNative implements VoiceInstructionsCallback {
    private long peer;

    public static class VoiceInstructionsCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            VoiceInstructionsCallbackNative.cleanNativePeer(this.peer);
        }

        public VoiceInstructionsCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.VoiceInstructionsCallback
    public native void run(List<VoiceInstruction> list);

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private VoiceInstructionsCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new VoiceInstructionsCallbackPeerCleaner(j));
    }
}

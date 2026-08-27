package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes5.dex */
final class OnValueChangedNative implements OnValueChanged {
    private long peer;

    public static class OnValueChangedPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            OnValueChangedNative.cleanNativePeer(this.peer);
        }

        public OnValueChangedPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.OnValueChanged
    public native void run(String str, Value value, Value value2);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private OnValueChangedNative(long j) {
        this.peer = j;
        CleanerService.register(this, new OnValueChangedPeerCleaner(j));
    }
}

package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;

/* JADX INFO: loaded from: classes5.dex */
final class EventsServiceResponseCallbackNative implements EventsServiceResponseCallback {
    private long peer;

    public static class EventsServiceResponseCallbackPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceResponseCallbackNative.cleanNativePeer(this.peer);
        }

        public EventsServiceResponseCallbackPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public native void run(Expected<EventsServiceError, None> expected);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    private EventsServiceResponseCallbackNative(long j) {
        this.peer = j;
        CleanerService.register(this, new EventsServiceResponseCallbackPeerCleaner(j));
    }
}

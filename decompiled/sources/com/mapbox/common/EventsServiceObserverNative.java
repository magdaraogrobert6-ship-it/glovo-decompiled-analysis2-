package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes5.dex */
final class EventsServiceObserverNative implements EventsServiceObserver {
    protected long peer;

    public static class EventsServiceObserverPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            EventsServiceObserverNative.cleanNativePeer(this.peer);
        }

        public EventsServiceObserverPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didEncounterError(EventsServiceError eventsServiceError, Value value);

    @Override // com.mapbox.common.EventsServiceObserver
    public native void didSendEvents(Value value);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public EventsServiceObserverNative(long j) {
        this.peer = j;
        CleanerService.register(this, new EventsServiceObserverPeerCleaner(j));
    }
}

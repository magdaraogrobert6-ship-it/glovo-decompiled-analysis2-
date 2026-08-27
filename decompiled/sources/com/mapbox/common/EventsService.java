package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;

/* JADX INFO: loaded from: classes2.dex */
public final class EventsService implements EventsServiceInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes4.dex */
    public static class EventsServicePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            EventsService.cleanNativePeer(this.peer);
        }

        public EventsServicePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native EventsService getOrCreate(EventsServerOptions eventsServerOptions);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.common.EventsServiceInterface
    public native void flush(FlushOperationResultCallback flushOperationResultCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void registerObserver(EventsServiceObserver eventsServiceObserver);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendCrashEvent(CrashEvent crashEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendEvent(Event event, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void sendTurnstileEvent(TurnstileEvent turnstileEvent, EventsServiceResponseCallback eventsServiceResponseCallback);

    @Override // com.mapbox.common.EventsServiceInterface
    public native void unregisterObserver(EventsServiceObserver eventsServiceObserver);

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public EventsService(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new EventsServicePeerCleaner(j));
    }
}

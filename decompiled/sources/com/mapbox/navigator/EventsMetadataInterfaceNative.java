package com.mapbox.navigator;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;

/* JADX INFO: loaded from: classes5.dex */
final class EventsMetadataInterfaceNative implements EventsMetadataInterface {
    protected long peer;

    public static class EventsMetadataInterfacePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            EventsMetadataInterfaceNative.cleanNativePeer(this.peer);
        }

        public EventsMetadataInterfacePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.EventsMetadataInterface
    public native EventsMetadata provideEventsMetadata();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public EventsMetadataInterfaceNative(long j) {
        this.peer = j;
        CleanerService.register(this, new EventsMetadataInterfacePeerCleaner(j));
    }
}

package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
final class InteractionHandlerNative implements InteractionHandler {
    protected long peer;

    public static class InteractionHandlerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            InteractionHandlerNative.cleanNativePeer(this.peer);
        }

        public InteractionHandlerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.InteractionHandler
    public native boolean handleBegin(QueriedFeature queriedFeature, InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleChange(InteractionContext interactionContext);

    @Override // com.mapbox.maps.InteractionHandler
    public native void handleEnd(InteractionContext interactionContext);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public InteractionHandlerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new InteractionHandlerPeerCleaner(j));
    }
}

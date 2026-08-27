package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class ViewAnnotationPositionsUpdateListenerNative implements ViewAnnotationPositionsUpdateListener {
    protected long peer;

    public static class ViewAnnotationPositionsUpdateListenerPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            ViewAnnotationPositionsUpdateListenerNative.cleanNativePeer(this.peer);
        }

        public ViewAnnotationPositionsUpdateListenerPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.maps.ViewAnnotationPositionsUpdateListener
    public native void onViewAnnotationPositionsUpdate(List<ViewAnnotationPositionDescriptor> list);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public ViewAnnotationPositionsUpdateListenerNative(long j) {
        this.peer = j;
        CleanerService.register(this, new ViewAnnotationPositionsUpdateListenerPeerCleaner(j));
    }
}

package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class Observable {
    protected long peer;

    public static class ObservablePeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            Observable.cleanNativePeer(this.peer);
        }

        public ObservablePeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    public native Cancelable subscribe(CameraChangedCallback cameraChangedCallback);

    @com.mapbox.annotation.MapboxExperimental
    public native Cancelable subscribe(CameraChangedCoalescedCallback cameraChangedCoalescedCallback);

    public native Cancelable subscribe(MapIdleCallback mapIdleCallback);

    public native Cancelable subscribe(MapLoadedCallback mapLoadedCallback);

    public native Cancelable subscribe(MapLoadingErrorCallback mapLoadingErrorCallback);

    public native Cancelable subscribe(RenderFrameFinishedCallback renderFrameFinishedCallback);

    public native Cancelable subscribe(RenderFrameStartedCallback renderFrameStartedCallback);

    public native Cancelable subscribe(ResourceRequestCallback resourceRequestCallback);

    public native Cancelable subscribe(SourceAddedCallback sourceAddedCallback);

    public native Cancelable subscribe(SourceDataLoadedCallback sourceDataLoadedCallback);

    public native Cancelable subscribe(SourceRemovedCallback sourceRemovedCallback);

    public native Cancelable subscribe(StyleAttributionsChangedCallback styleAttributionsChangedCallback);

    public native Cancelable subscribe(StyleDataLoadedCallback styleDataLoadedCallback);

    public native Cancelable subscribe(StyleImageMissingCallback styleImageMissingCallback);

    public native Cancelable subscribe(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback);

    public native Cancelable subscribe(StyleLoadedCallback styleLoadedCallback);

    public native Cancelable subscribe(String str, GenericEventCallback genericEventCallback);

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Observable(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new ObservablePeerCleaner(j));
    }
}

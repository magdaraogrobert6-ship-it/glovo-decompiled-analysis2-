package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.geojson.Point;

/* JADX INFO: loaded from: classes4.dex */
@MapboxExperimental
public final class TileRegionApplyUpdateOptions {
    protected long peer;

    /* JADX INFO: loaded from: classes5.dex */
    public static class TileRegionApplyUpdateOptionsPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            TileRegionApplyUpdateOptions.cleanNativePeer(this.peer);
        }

        public TileRegionApplyUpdateOptionsPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native TileRegionApplyUpdateOptions make();

    private native NetworkRestriction nativeGetNetworkRestriction();

    private native Integer nativeGetPriorityRadius();

    private native TileRegionCallback nativeGetPriorityRadiusCallback();

    private native Point nativeGetStartLocation();

    private static native void nativeSelfRegister();

    private native void nativeSetNetworkRestriction(NetworkRestriction networkRestriction);

    private native void nativeSetPriorityRadius(Integer num);

    private native void nativeSetPriorityRadiusCallback(TileRegionCallback tileRegionCallback);

    private native void nativeSetStartLocation(Point point);

    public NetworkRestriction getNetworkRestriction() {
        return nativeGetNetworkRestriction();
    }

    public Integer getPriorityRadius() {
        return nativeGetPriorityRadius();
    }

    public TileRegionCallback getPriorityRadiusCallback() {
        return nativeGetPriorityRadiusCallback();
    }

    public Point getStartLocation() {
        return nativeGetStartLocation();
    }

    public void setNetworkRestriction(NetworkRestriction networkRestriction) {
        nativeSetNetworkRestriction(networkRestriction);
    }

    public void setPriorityRadius(Integer num) {
        nativeSetPriorityRadius(num);
    }

    public void setPriorityRadiusCallback(TileRegionCallback tileRegionCallback) {
        nativeSetPriorityRadiusCallback(tileRegionCallback);
    }

    public void setStartLocation(Point point) {
        nativeSetStartLocation(point);
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileRegionApplyUpdateOptions(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileRegionApplyUpdateOptionsPeerCleaner(j));
    }
}

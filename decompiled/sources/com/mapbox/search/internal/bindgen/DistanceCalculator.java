package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;

/* JADX INFO: loaded from: classes5.dex */
public class DistanceCalculator implements DistanceCalculatorInterface {
    protected long peer;

    public static class DistanceCalculatorPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            DistanceCalculator.cleanNativePeer(this.peer);
        }

        public DistanceCalculatorPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    public static native double distanceOnSphere(Point point, Point point2);

    private native void initialize(double d);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.search.internal.bindgen.DistanceCalculatorInterface
    public native double distance(Point point, Point point2);

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public DistanceCalculator(double d) {
        initialize(d);
    }

    public DistanceCalculator(long j) {
        setPeer(j);
    }

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new DistanceCalculatorPeerCleaner(j));
    }
}

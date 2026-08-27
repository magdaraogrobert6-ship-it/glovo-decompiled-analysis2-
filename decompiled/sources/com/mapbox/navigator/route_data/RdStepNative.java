package com.mapbox.navigator.route_data;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class RdStepNative implements RdStep {
    protected long peer;

    public static class RdStepPeerCleaner implements Runnable {
        private long peer;

        @Override // java.lang.Runnable
        public void run() {
            RdStepNative.cleanNativePeer(this.peer);
        }

        public RdStepPeerCleaner(long j) {
            this.peer = j;
        }
    }

    public static native void cleanNativePeer(long j);

    private static native void nativeSelfRegister();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native double distance();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native RdDrivingSide drivingSide();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native double duration();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native RdCoordinateArray geometry();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native RdIntersectionArray intersections();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native RdManeuver maneuver();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native String name();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native RdRoadShield roadShield();

    @Override // com.mapbox.navigator.route_data.RdStep
    public native List<RdVoiceInstruction> voiceInstructions();

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public RdStepNative(long j) {
        this.peer = j;
        CleanerService.register(this, new RdStepPeerCleaner(j));
    }
}

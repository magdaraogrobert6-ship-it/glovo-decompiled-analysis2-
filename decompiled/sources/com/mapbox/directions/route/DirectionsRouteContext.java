package com.mapbox.directions.route;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.experimental.MapboxSupport$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectionsRouteContext {
    public static final Companion Companion;
    private long peer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    public final native boolean equal(DirectionsRouteContext directionsRouteContext);

    public final native Expected<String, DataRef> extractRoadCameras();

    public final native DataRef getCompoundManeuverGeometryPoints(double d, double d2);

    public final native DataRef getData();

    public final native DataRef getIntersectionsDistances(double d);

    public final native DataRef getStepCoordinates();

    public final native List<List<List<Point>>> getStepGeometryAhead(int i);

    public final native Expected<String, DirectionsRouteContext> refreshRoute(DataRef dataRef, int i, Integer num);

    public final native DataRef simplifyRouteGeometry(int i);

    public final native int stepsCount();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPeer$lambda$0(long j) {
        Companion.cleanNativePeer(j);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cleanNativePeer(long j) {
            DirectionsRouteContext.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            DirectionsRouteContext.nativeSelfRegister();
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        BaseMapboxInitializer.Companion.init(MapboxNavigationNativeInitializerImpl.class);
        try {
            companion.nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public DirectionsRouteContext(long j) {
        setPeer(j);
    }

    public final void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapboxSupport$$ExternalSyntheticLambda0(j, 1));
    }
}

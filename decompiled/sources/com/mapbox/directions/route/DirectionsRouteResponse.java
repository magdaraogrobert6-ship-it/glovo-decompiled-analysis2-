package com.mapbox.directions.route;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.experimental.MapboxSupport$$ExternalSyntheticLambda0;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public final class DirectionsRouteResponse {
    public static final Companion Companion;
    private long peer;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void cleanNativePeer(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSelfRegister();

    @MapboxExperimental
    public static final native Expected<String, List<DirectionsRouteContext>> parseDirectionsRoutesJson(DataRef dataRef);

    @MapboxExperimental
    public static final native Expected<String, List<DirectionsRouteContext>> parseDirectionsRoutesJson(DataRef dataRef, String str);

    @MapboxExperimental
    public static final native Expected<String, List<DirectionsRouteContext>> parseMapMatchingJson(DataRef dataRef, String str);

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
            DirectionsRouteResponse.cleanNativePeer(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void nativeSelfRegister() {
            DirectionsRouteResponse.nativeSelfRegister();
        }

        @MapboxExperimental
        public final Expected<String, List<DirectionsRouteContext>> parseDirectionsRoutesJson(DataRef dataRef) {
            return DirectionsRouteResponse.parseDirectionsRoutesJson(dataRef);
        }

        @MapboxExperimental
        public final Expected<String, List<DirectionsRouteContext>> parseMapMatchingJson(DataRef dataRef, String str) {
            return DirectionsRouteResponse.parseMapMatchingJson(dataRef, str);
        }

        private Companion() {
        }

        @MapboxExperimental
        public final Expected<String, List<DirectionsRouteContext>> parseDirectionsRoutesJson(DataRef dataRef, String str) {
            return DirectionsRouteResponse.parseDirectionsRoutesJson(dataRef, str);
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

    public DirectionsRouteResponse(long j) {
        setPeer(j);
    }

    public final void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapboxSupport$$ExternalSyntheticLambda0(j, 2));
    }
}

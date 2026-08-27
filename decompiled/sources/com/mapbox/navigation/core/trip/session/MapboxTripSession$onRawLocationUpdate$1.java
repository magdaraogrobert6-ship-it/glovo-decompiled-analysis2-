package com.mapbox.navigation.core.trip.session;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.common.location.Location;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Lambda;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTripSession$onRawLocationUpdate$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapboxTripSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxTripSession$onRawLocationUpdate$1(MapboxTripSession mapboxTripSession, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = mapboxTripSession;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MapboxTripSession mapboxTripSession = this.this$0;
        if (i == 0) {
            Location location = (Location) obj;
            location.getClass();
            mapboxTripSession.rawLocationState.IconCompatParcelizer(location);
            return createfromparcel;
        }
        ((BannerInstructions) obj).getClass();
        PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
        CopyOnWriteArraySet copyOnWriteArraySet = mapboxTripSession.bannerInstructionsObservers;
        if (PerformanceTracker.getTrackingIsActive()) {
            PerformanceTracker.syncSectionStarted("MapboxTripSession#updateRouteProgress-dispatch-banner-instruction");
            try {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                Iterator it = copyOnWriteArraySet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateRouteProgress-dispatch-banner-instruction", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
            } catch (Throwable th) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateRouteProgress-dispatch-banner-instruction", null);
                throw th;
            }
        } else {
            Iterator it2 = copyOnWriteArraySet.iterator();
            if (it2.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it2);
            }
        }
        return createfromparcel;
    }
}

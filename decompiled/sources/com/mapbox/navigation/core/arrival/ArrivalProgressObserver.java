package com.mapbox.navigation.core.arrival;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteProgressState;
import com.mapbox.navigation.core.accounts.BillingController$arrivalObserver$1;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.MapboxTripSession$updateLegIndex$1;
import com.mapbox.navigation.core.trip.session.RouteProgressObserver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.cancelPendingWebViewPause;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrivalProgressObserver implements RouteProgressObserver {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final CopyOnWriteArraySet arrivalObservers = new CopyOnWriteArraySet();
    public NavigationRoute routeArrived;
    public RouteLeg routeLegArrived;
    public final MapboxTripSession tripSession;

    public ArrivalProgressObserver(MapboxTripSession mapboxTripSession) {
        this.tripSession = mapboxTripSession;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    @Override // com.mapbox.navigation.core.trip.session.RouteProgressObserver
    public final void onRouteProgressChanged(RouteProgress routeProgress) {
        NavigationRoute navigationRoute;
        RouteLegProgress routeLegProgress;
        RouteLeg routeLeg;
        Integer numValueOf;
        Integer numValueOf2;
        NavigationRoute navigationRoute2;
        DirectionsRoute directionsRoute;
        int i = 2 % 2;
        int i2 = serializer + 45;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = 0;
        if (i2 % 2 == 0) {
            routeProgress.getClass();
            navigationRoute = routeProgress.navigationRoute;
            routeLegProgress = routeProgress.currentLegProgress;
            routeLeg = routeLegProgress.routeLeg;
            int i4 = 40 / 0;
            if (routeProgress.currentState != RouteProgressState.COMPLETE) {
                return;
            }
        } else {
            routeProgress.getClass();
            navigationRoute = routeProgress.navigationRoute;
            routeLegProgress = routeProgress.currentLegProgress;
            routeLeg = routeLegProgress.routeLeg;
            if (routeProgress.currentState != RouteProgressState.COMPLETE) {
                return;
            }
        }
        if (routeProgress.stale) {
            return;
        }
        int i5 = routeLegProgress.legIndex;
        List<RouteLeg> listLegs = navigationRoute.directionsRoute.legs();
        Object obj = null;
        if (listLegs != null) {
            numValueOf = Integer.valueOf(listLegs.size() - 1);
        } else {
            int i6 = serializer + 23;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 4 % 4;
            }
            numValueOf = null;
        }
        CopyOnWriteArraySet<BillingController$arrivalObserver$1> copyOnWriteArraySet = this.arrivalObservers;
        if (numValueOf == null || Integer.valueOf(i5).intValue() >= numValueOf.intValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeArrived, navigationRoute}, getCieXyz.write())).booleanValue()) {
                return;
            }
            this.routeArrived = navigationRoute;
            for (BillingController$arrivalObserver$1 billingController$arrivalObserver$1 : copyOnWriteArraySet) {
                int i8 = billingController$arrivalObserver$1.$r8$classId;
                routeProgress.getClass();
                if (i8 != 0) {
                    ((ProducerCoroutine) ((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) billingController$arrivalObserver$1.this$0)).b_(routeProgress);
                }
            }
            return;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routeLegArrived, routeLeg}, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.routeLegArrived = routeLeg;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            int i9 = serializer + 123;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = ((BillingController$arrivalObserver$1) it.next()).$r8$classId;
                obj.hashCode();
                throw null;
            }
            int i11 = ((BillingController$arrivalObserver$1) it.next()).$r8$classId;
            routeProgress.getClass();
            int i12 = RemoteActionCompatParcelizer + 33;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        MapboxTripSession mapboxTripSession = this.tripSession;
        RouteProgress routeProgress2 = mapboxTripSession.routeProgress;
        if (routeProgress2 == null || (navigationRoute2 = routeProgress2.navigationRoute) == null || (directionsRoute = navigationRoute2.directionsRoute) == null) {
            numValueOf2 = null;
        } else {
            int i14 = serializer + 61;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            List<RouteLeg> listLegs2 = directionsRoute.legs();
            if (listLegs2 != null) {
                numValueOf2 = Integer.valueOf(listLegs2.size());
            } else {
                numValueOf2 = null;
            }
        }
        if (numValueOf2 == null) {
            return;
        }
        RouteLegProgress routeLegProgress2 = routeProgress2.currentLegProgress;
        int iIntValue = Integer.valueOf(routeLegProgress2.legIndex).intValue() + 1;
        if (iIntValue >= numValueOf2.intValue()) {
            return;
        }
        mapboxTripSession.updateLegIndexJob = BuildersKt.RemoteActionCompatParcelizer(mapboxTripSession.mainJobController.scope, null, null, new MapboxTripSession$updateLegIndex$1(mapboxTripSession, new cancelPendingWebViewPause(), iIntValue, new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, i3, routeLegProgress2), null), 3);
    }
}

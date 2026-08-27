package com.mapbox.navigation.core;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.core.view.ViewKt$allViews$1;
import androidx.sqlite.SQLite;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.navigation.base.internal.trip.model.RouteIndices;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteProgressState;
import com.mapbox.navigation.core.directions.session.DirectionsSessionKt;
import com.mapbox.navigation.core.directions.session.DirectionsSessionRoutes;
import com.mapbox.navigation.core.directions.session.IgnoredRoute;
import com.mapbox.navigation.core.directions.session.MapboxDirectionsSession;
import com.mapbox.navigation.core.internal.RouteProgressData;
import com.mapbox.navigation.core.internal.RoutesProgressData;
import com.mapbox.navigation.core.trip.session.RouteProgressObserver;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessisRelatedToAutoCommit;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onMove;
import o.r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA;
import o.removeNodeAtDepth;
import o.requestDisplayInAppMessagelambda7;
import o.requestDisplayInAppMessagelambda8;
import o.requestDisplayInAppMessagelambda9;
import o.resetAfterInAppMessageCloselambda2;
import o.resumeWebviewIfNecessarylambda0;
import o.verifyOrientationStatuslambda2;
import o.verifyOrientationStatuslambda3;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesProgressDataProvider implements RouteProgressObserver {
    public final /* synthetic */ int $r8$classId = 0;
    public Object continuation;
    public Object routesProgressData;

    public RoutesProgressDataProvider() {
        new RouteProgressData(0, 0, null);
    }

    @Override // com.mapbox.navigation.core.trip.session.RouteProgressObserver
    public final void onRouteProgressChanged(RouteProgress routeProgress) throws Exception {
        requestDisplayInAppMessagelambda9 requestdisplayinappmessagelambda9;
        int iIntValue;
        int i = this.$r8$classId;
        routeProgress.getClass();
        if (i == 0) {
            RouteLegProgress routeLegProgress = routeProgress.currentLegProgress;
            int i2 = routeLegProgress.legIndex;
            int i3 = routeProgress.currentRouteGeometryIndex;
            Integer numValueOf = Integer.valueOf(routeLegProgress.geometryIndex);
            RouteProgressData routeProgressData = new RouteProgressData(i2, i3, numValueOf);
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (routeProgress.currentState == RouteProgressState.COMPLETE) {
                int iIntValue2 = numValueOf.intValue();
                RouteLeg routeLeg = routeLegProgress.routeLeg;
                if (routeLeg != null) {
                    LegAnnotation legAnnotationAnnotation = routeLeg.annotation();
                    int i4 = 2;
                    resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0IconCompatParcelizer = onContentCardClicked.IconCompatParcelizer((Object[]) new resumeWebviewIfNecessarylambda0[]{legAnnotationAnnotation != null ? new verifyOrientationStatuslambda2(i4, new ViewKt$allViews$1(legAnnotationAnnotation, shortNewsContentCardView, 5)) : requestDisplayInAppMessagelambda8.IconCompatParcelizer, new verifyOrientationStatuslambda2(i4, new ForEachGestureKt.C00342(routeLeg, shortNewsContentCardView, 4))});
                    BrazeInAppMessageManagerExternalSyntheticLambda45 brazeInAppMessageManagerExternalSyntheticLambda45 = new BrazeInAppMessageManagerExternalSyntheticLambda45(24);
                    if (resumewebviewifnecessarylambda0IconCompatParcelizer instanceof verifyOrientationStatuslambda3) {
                        verifyOrientationStatuslambda3 verifyorientationstatuslambda3 = (verifyOrientationStatuslambda3) resumewebviewifnecessarylambda0IconCompatParcelizer;
                        requestdisplayinappmessagelambda9 = new requestDisplayInAppMessagelambda9(verifyorientationstatuslambda3.read, verifyorientationstatuslambda3.serializer, brazeInAppMessageManagerExternalSyntheticLambda45);
                    } else {
                        requestdisplayinappmessagelambda9 = new requestDisplayInAppMessagelambda9(resumewebviewifnecessarylambda0IconCompatParcelizer, new accessisRelatedToAutoCommit(29), brazeInAppMessageManagerExternalSyntheticLambda45);
                    }
                    Integer num = (Integer) resetAfterInAppMessageCloselambda2.serializer(new requestDisplayInAppMessagelambda7(requestdisplayinappmessagelambda9, false, new r8lambdahiM_4JAoe8VoNLZ8t21EAnaoFaA(i4)));
                    if (num != null && iIntValue2 >= (iIntValue = num.intValue())) {
                        int i5 = iIntValue - 1;
                        routeProgressData = new RouteProgressData(i2, i3 - (iIntValue2 - i5), Integer.valueOf(i5));
                    }
                }
            }
            Set<Map.Entry> setEntrySet = routeProgress.alternativeRoutesIndices.entrySet();
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(setEntrySet, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), new RouteProgressData(((RouteIndices) entry.getValue()).legIndex, ((RouteIndices) entry.getValue()).routeGeometryIndex, Integer.valueOf(((RouteIndices) entry.getValue()).legGeometryIndex)));
            }
            RoutesProgressData routesProgressData = new RoutesProgressData(routeProgressData, linkedHashMap);
            CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.resumeWith(routesProgressData);
            }
            this.continuation = null;
            this.routesProgressData = routesProgressData;
            return;
        }
        MapboxDirectionsSession mapboxDirectionsSession = (MapboxDirectionsSession) this.routesProgressData;
        ArrayList routesPlusIgnored = DirectionsSessionKt.getRoutesPlusIgnored(mapboxDirectionsSession);
        if (routesPlusIgnored.isEmpty()) {
            return;
        }
        NavigationRoute navigationRoute = (NavigationRoute) routesPlusIgnored.get(0);
        List listSerializer = onContentCardDismissed.serializer(routesPlusIgnored, 1);
        LinkedHashMap linkedHashMap2 = routeProgress.alternativeRoutesIndices;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (((RouteIndices) entry2.getValue()).isForkPointPassed) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        List list = listSerializer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (linkedHashMap3.containsKey(((NavigationRoute) obj).id)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new IgnoredRoute((NavigationRoute) it.next(), "Alternative fork point passed"));
        }
        List ignoredRoutes = mapboxDirectionsSession.getIgnoredRoutes();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : ignoredRoutes) {
            if (!((IgnoredRoute) obj2).reason.equals("Alternative fork point passed")) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayList3, arrayList2);
        List list2 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{navigationRoute}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            NavigationRoute navigationRoute2 = (NavigationRoute) obj3;
            if (!arrayListIconCompatParcelizer.isEmpty()) {
                Iterator it2 = arrayListIconCompatParcelizer.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((IgnoredRoute) it2.next()).navigationRoute.id, navigationRoute2.id}, getCieXyz.write())).booleanValue());
            }
            arrayList4.add(obj3);
        }
        ArrayList arrayListIconCompatParcelizer2 = onContentCardDismissed.IconCompatParcelizer(arrayList4, list2);
        DirectionsSessionRoutes directionsSessionRoutes = new DirectionsSessionRoutes(arrayListIconCompatParcelizer2, arrayListIconCompatParcelizer, new SetRoutes$Alternatives(((Number) ((MapboxNavigation.AnonymousClass15) this.continuation).invoke()).intValue()));
        if (arrayListIconCompatParcelizer.equals(mapboxDirectionsSession.getIgnoredRoutes()) && arrayListIconCompatParcelizer2.equals(mapboxDirectionsSession.getRoutes())) {
            return;
        }
        if (!arrayListIconCompatParcelizer.isEmpty()) {
            LoggerProviderKt.logD("Hiding alternatives due to fork point has passed: " + arrayListIconCompatParcelizer, "ForkPointPassedObserver");
        }
        if (!arrayListIconCompatParcelizer2.equals(mapboxDirectionsSession.getRoutes())) {
            LoggerProviderKt.logD("Settigns new routes due to fork point changes: " + arrayListIconCompatParcelizer2, "ForkPointPassedObserver");
        }
        mapboxDirectionsSession.setNavigationRoutesFinished(directionsSessionRoutes);
    }

    public RoutesProgressDataProvider(MapboxDirectionsSession mapboxDirectionsSession, MapboxNavigation.AnonymousClass15 anonymousClass15) {
        this.routesProgressData = mapboxDirectionsSession;
        this.continuation = anonymousClass15;
    }
}

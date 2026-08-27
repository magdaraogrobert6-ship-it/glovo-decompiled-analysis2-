package com.mapbox.navigation.core.reroute;

import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import coil3.RealImageLoader;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.base.internal.trip.model.RouteIndices;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.RouterOrigin;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$1$1$1$1;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$1;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.le;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRerouteController$rerouteInternal$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ Object $callback;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $relevantAlternative;
    public final /* synthetic */ Object $routeAlternativeId;
    public final /* synthetic */ Object $routes;
    public /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRerouteController$rerouteInternal$2(MapboxRerouteController mapboxRerouteController, String str, ArrayList arrayList, NavigationRoute navigationRoute, MapboxNavigation$$ExternalSyntheticLambda4 mapboxNavigation$$ExternalSyntheticLambda4, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$r8$classId = 0;
        this.this$0 = mapboxRerouteController;
        this.$routeAlternativeId = str;
        this.$routes = arrayList;
        this.$relevantAlternative = navigationRoute;
        this.$callback = mapboxNavigation$$ExternalSyntheticLambda4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRerouteController$rerouteInternal$2(Object obj, Object obj2, Object obj3, Object obj4, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.$r8$classId = i;
        this.$routeAlternativeId = obj;
        this.$routes = obj2;
        this.$relevantAlternative = obj3;
        this.$callback = obj4;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 83;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ((MapboxRerouteController$rerouteInternal$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = write + 63;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        if (i4 == 1) {
            return ((MapboxRerouteController$rerouteInternal$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i4 == 2) {
            return ((MapboxRerouteController$rerouteInternal$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        ((MapboxRerouteController$rerouteInternal$2) create((le) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        Object obj2 = this.$callback;
        Object obj3 = this.$relevantAlternative;
        Object obj4 = this.$routes;
        Object obj5 = this.$routeAlternativeId;
        if (i4 == 0) {
            return new MapboxRerouteController$rerouteInternal$2((MapboxRerouteController) this.this$0, (String) obj5, (ArrayList) obj4, (NavigationRoute) obj3, (MapboxNavigation$$ExternalSyntheticLambda4) obj2, shortNewsContentCardView);
        }
        if (i4 == 1) {
            MapboxRerouteController$rerouteInternal$2 mapboxRerouteController$rerouteInternal$2 = new MapboxRerouteController$rerouteInternal$2((BringIntoViewResponderNode) obj5, (LayoutCoordinates) obj4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, (n$$ExternalSyntheticLambda3) obj2, shortNewsContentCardView, 1);
            mapboxRerouteController$rerouteInternal$2.this$0 = obj;
            return mapboxRerouteController$rerouteInternal$2;
        }
        if (i4 == 2) {
            MapboxRerouteController$rerouteInternal$2 mapboxRerouteController$rerouteInternal$3 = new MapboxRerouteController$rerouteInternal$2((MapboxRouteLineView) obj5, (onViewAttachedToWindowlambda0) obj4, (Style) obj3, (RouteLineViewOptionsData) obj2, shortNewsContentCardView, 2);
            mapboxRerouteController$rerouteInternal$3.this$0 = obj;
            return mapboxRerouteController$rerouteInternal$3;
        }
        MapboxRerouteController$rerouteInternal$2 mapboxRerouteController$rerouteInternal$4 = new MapboxRerouteController$rerouteInternal$2((getContentViewGroupParentLayout) obj5, (MapNavigationImpl) obj4, (LocationComponentPluginImpl) obj3, (MapboxMap) obj2, shortNewsContentCardView, 3);
        mapboxRerouteController$rerouteInternal$4.this$0 = obj;
        int i5 = serializer + 55;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return mapboxRerouteController$rerouteInternal$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        RouteIndices routeIndices;
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = write + 23;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.$callback;
        Object obj3 = this.$relevantAlternative;
        Object obj4 = this.$routeAlternativeId;
        Object obj5 = this.$routes;
        int i7 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            NavigationRoute navigationRoute = (NavigationRoute) obj3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MapboxRerouteController mapboxRerouteController = (MapboxRerouteController) this.this$0;
            RouteProgress routeProgress = mapboxRerouteController.tripSession.routeProgress;
            if (routeProgress == null || (routeIndices = (RouteIndices) routeProgress.alternativeRoutesIndices.get((String) obj4)) == null) {
                i = 0;
            } else {
                int i8 = write + 81;
                serializer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = routeIndices.legIndex;
                    throw null;
                }
                i = routeIndices.legIndex;
            }
            ArrayList arrayList = new ArrayList((ArrayList) obj5);
            arrayList.remove(navigationRoute);
            arrayList.add(0, navigationRoute);
            LoggerProviderKt.logI("Reroute switch to alternative", "MapboxRerouteController");
            RouterOrigin routerOrigin = navigationRoute.nativeRoute.getRouterOrigin();
            routerOrigin.getClass();
            String strMapToSdkRouteOrigin = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
            mapboxRerouteController.setStateV2(new RerouteStateV2$RouteFetched(strMapToSdkRouteOrigin));
            mapboxRerouteController.setStateV2(((MapboxNavigation$$ExternalSyntheticLambda4) obj2).onNewRoutes(new RerouteResult(i, strMapToSdkRouteOrigin, arrayList)) ? new RerouteStateV2$Deviation$ApplyingRoute() : new RerouteStateV2$Deviation$RouteIgnored());
            mapboxRerouteController.setStateV2(new RerouteStateV2$Idle());
            int i10 = serializer + 87;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return createfromparcel;
        }
        int i12 = 1;
        int i13 = 3;
        if (i6 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.this$0;
            BringIntoViewResponderNode bringIntoViewResponderNode = (BringIntoViewResponderNode) obj4;
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RealImageLoader.AnonymousClass2(bringIntoViewResponderNode, (LayoutCoordinates) obj5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3, null, 13), 3);
            return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BlockRunner$maybeRun$1(bringIntoViewResponderNode, (n$$ExternalSyntheticLambda3) obj2, shortNewsContentCardView, 12), 3);
        }
        if (i6 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return BuildersKt.IconCompatParcelizer((getContentViewGroupParentLayout) this.this$0, null, null, new NavHostKt$NavHost$29$1((MapboxRouteLineView) obj4, (onViewAttachedToWindowlambda0) obj5, (Style) obj3, (RouteLineViewOptionsData) obj2, null, 14), 3);
        }
        le leVar = (le) this.this$0;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MapboxNavigation mapboxNavigation = leVar.write;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) obj4;
        MapNavigationImpl mapNavigationImpl = (MapNavigationImpl) obj5;
        LocationComponentPluginImpl locationComponentPluginImpl = (LocationComponentPluginImpl) obj3;
        MapboxMap mapboxMap = (MapboxMap) obj2;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$1(mapNavigationImpl, mapboxNavigation, locationComponentPluginImpl, mapboxMap, (ShortNewsContentCardView) null), 3);
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$2(mapNavigationImpl, mapboxNavigation, mapboxMap, shortNewsContentCardView2, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$2(mapNavigationImpl, mapboxNavigation, mapboxMap, shortNewsContentCardView2, 2), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$1$1$1$1(mapNavigationImpl, mapboxNavigation, shortNewsContentCardView, i12), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$1$1$1$1(mapNavigationImpl, mapboxNavigation, shortNewsContentCardView, i2), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$1$1$1$1(mapNavigationImpl, mapboxNavigation, shortNewsContentCardView, i13), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$7(mapNavigationImpl, shortNewsContentCardView, i7), 3);
        int i14 = 4;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$1$1$1$1(mapNavigationImpl, mapboxNavigation, shortNewsContentCardView, i14), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$1(mapNavigationImpl, mapboxNavigation, mapboxMap, locationComponentPluginImpl, (ShortNewsContentCardView) null), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$7(mapNavigationImpl, shortNewsContentCardView, i12), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$7(mapNavigationImpl, shortNewsContentCardView, i2), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$7(mapNavigationImpl, shortNewsContentCardView, i13), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$7(mapNavigationImpl, shortNewsContentCardView, i14), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout2, null, null, new MapNavigationImpl$processFlows$2$1$1$2(mapNavigationImpl, mapboxNavigation, mapboxMap, null, 1), 3);
        return createfromparcel;
    }
}

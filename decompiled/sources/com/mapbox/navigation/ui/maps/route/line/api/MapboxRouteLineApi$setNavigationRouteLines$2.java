package com.mapbox.navigation.ui.maps.route.line.api;

import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.internal.performance.AsyncSection;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.ui.base.util.MapboxNavigationConsumer;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusher;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusherProvider;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$$ExternalSyntheticLambda6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getOrElse;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setCustomInAppMessageAnimationFactorylambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi$setNavigationRouteLines$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ List $alternativeRoutesMetadata;
    public final /* synthetic */ RouteLineApi$$ExternalSyntheticLambda6 $consumer;
    public final /* synthetic */ ArrayList $newRoutes;
    public final /* synthetic */ AsyncSection $setNavigationRouteLinesSection;
    public setCustomInAppMessageAnimationFactorylambda0 L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public AsyncSection L$4;
    public RouteLineApi$$ExternalSyntheticLambda6 L$5;
    public int label;
    public final /* synthetic */ MapboxRouteLineApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineApi$setNavigationRouteLines$2(MapboxRouteLineApi mapboxRouteLineApi, ArrayList arrayList, List list, AsyncSection asyncSection, RouteLineApi$$ExternalSyntheticLambda6 routeLineApi$$ExternalSyntheticLambda6, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.this$0 = mapboxRouteLineApi;
        this.$newRoutes = arrayList;
        this.$alternativeRoutesMetadata = list;
        this.$setNavigationRouteLinesSection = asyncSection;
        this.$consumer = routeLineApi$$ExternalSyntheticLambda6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new MapboxRouteLineApi$setNavigationRouteLines$2(this.this$0, this.$newRoutes, this.$alternativeRoutesMetadata, this.$setNavigationRouteLinesSection, this.$consumer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((MapboxRouteLineApi$setNavigationRouteLines$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MapboxRouteLineApi mapboxRouteLineApi;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        List list;
        List list2;
        AsyncSection asyncSection;
        RouteLineApi$$ExternalSyntheticLambda6 routeLineApi$$ExternalSyntheticLambda6;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        List list3;
        MapboxRouteLineApi mapboxRouteLineApi2;
        MapboxNavigationConsumer mapboxNavigationConsumer;
        AsyncSection asyncSection2;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                mapboxRouteLineApi = this.this$0;
                setcustominappmessageanimationfactorylambda0 = mapboxRouteLineApi.mutex;
                this.L$0 = setcustominappmessageanimationfactorylambda0;
                this.L$1 = mapboxRouteLineApi;
                list = this.$newRoutes;
                this.L$2 = list;
                list2 = this.$alternativeRoutesMetadata;
                this.L$3 = list2;
                asyncSection = this.$setNavigationRouteLinesSection;
                this.L$4 = asyncSection;
                routeLineApi$$ExternalSyntheticLambda6 = this.$consumer;
                this.L$5 = routeLineApi$$ExternalSyntheticLambda6;
                this.label = 1;
                if (setcustominappmessageanimationfactorylambda0.lock(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mapboxNavigationConsumer = (MapboxNavigationConsumer) this.L$2;
                asyncSection2 = (AsyncSection) this.L$1;
                setcustominappmessageanimationfactorylambda2 = this.L$0;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                    PerformanceTracker.asyncSectionCompleted(asyncSection2);
                    mapboxNavigationConsumer.accept((Expected) obj);
                    setcustominappmessageanimationfactorylambda2.write(null);
                    return createFromParcel.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda2;
                    setcustominappmessageanimationfactorylambda1.write(null);
                    throw th;
                }
            }
            routeLineApi$$ExternalSyntheticLambda6 = this.L$5;
            AsyncSection asyncSection3 = this.L$4;
            list2 = (List) this.L$3;
            list = (List) this.L$2;
            mapboxRouteLineApi = (MapboxRouteLineApi) this.L$1;
            setcustominappmessageanimationfactorylambda0 = this.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            asyncSection = asyncSection3;
            getOrElse getorelse = mapboxRouteLineApi2.sender;
            MapboxRouteLineApiOptions mapboxRouteLineApiOptions = mapboxRouteLineApi2.routeLineOptions;
            getorelse.getClass();
            mapboxRouteLineApiOptions.getClass();
            RouteLineHistoryRecordingPusher routeLineHistoryRecordingPusher = RouteLineHistoryRecordingPusherProvider.instance;
            routeLineHistoryRecordingPusher.pushEventOrAddToQueue(new FlowLiveDataConversions$asFlow$1$1(getorelse, mapboxRouteLineApiOptions, (ShortNewsContentCardView) null, 23));
            getOrElse getorelse2 = mapboxRouteLineApi2.sender;
            getorelse2.getClass();
            list.getClass();
            routeLineHistoryRecordingPusher.pushEventIfEnabled(new RealImageLoader$execute$2$job$1(getorelse2, 0, list, (ShortNewsContentCardView) null));
            MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
            SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1 = new SearchOptionsKt$validateLimit$1(17, list);
            List list4 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(((NavigationRouteLine) it.next()).getRoute());
            }
            this.L$0 = setcustominappmessageanimationfactorylambda1;
            this.L$1 = asyncSection;
            this.L$2 = routeLineApi$$ExternalSyntheticLambda6;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 2;
            Object objAccess$setNewRouteData = MapboxRouteLineApi.access$setNewRouteData(mapboxRouteLineApi2, arrayList, searchOptionsKt$validateLimit$1, list3, 0, this);
            if (objAccess$setNewRouteData != coroutineSingletons) {
                mapboxNavigationConsumer = routeLineApi$$ExternalSyntheticLambda6;
                asyncSection2 = asyncSection;
                obj = objAccess$setNewRouteData;
                setcustominappmessageanimationfactorylambda2 = setcustominappmessageanimationfactorylambda1;
                PerformanceTracker performanceTracker2 = PerformanceTracker.INSTANCE;
                PerformanceTracker.asyncSectionCompleted(asyncSection2);
                mapboxNavigationConsumer.accept((Expected) obj);
                setcustominappmessageanimationfactorylambda2.write(null);
                return createFromParcel.INSTANCE;
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            setcustominappmessageanimationfactorylambda1.write(null);
            throw th;
        }
        setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
        list3 = list2;
        mapboxRouteLineApi2 = mapboxRouteLineApi;
    }
}

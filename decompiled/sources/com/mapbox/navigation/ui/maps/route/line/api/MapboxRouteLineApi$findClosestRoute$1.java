package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxMap;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$findClosestRoute$2$1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi$findClosestRoute$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ MapboxMap $mapboxMap;
    public final /* synthetic */ float $padding;
    public final /* synthetic */ RouteLineApi$findClosestRoute$2$1 $resultConsumer;
    public final /* synthetic */ Point $target;
    public createInAppMessageEventSubscriber L$0;
    public Object L$1;
    public Object L$2;
    public MapboxRouteLineApi L$3;
    public RouteLineApi$findClosestRoute$2$1 L$4;
    public int label;
    public final /* synthetic */ MapboxRouteLineApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineApi$findClosestRoute$1(MapboxMap mapboxMap, RouteLineApi$findClosestRoute$2$1 routeLineApi$findClosestRoute$2$1, MapboxRouteLineApi mapboxRouteLineApi, Point point, float f, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$mapboxMap = mapboxMap;
        this.$resultConsumer = routeLineApi$findClosestRoute$2$1;
        this.this$0 = mapboxRouteLineApi;
        this.$target = point;
        this.$padding = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new MapboxRouteLineApi$findClosestRoute$1(this.$mapboxMap, this.$resultConsumer, this.this$0, this.$target, this.$padding, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((MapboxRouteLineApi$findClosestRoute$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r7.lock(r13) == r8) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$findClosestRoute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

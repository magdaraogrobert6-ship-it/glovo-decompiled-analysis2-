package com.mapbox.navigation.ui.maps.route.line.api;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi$findClosestRoute$2 extends ContinuationImpl {
    public List L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MapboxRouteLineApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineApi$findClosestRoute$2(MapboxRouteLineApi mapboxRouteLineApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mapboxRouteLineApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MapboxRouteLineApi.access$findClosestRoute(this.this$0, null, null, 0.0f, null, this);
    }
}

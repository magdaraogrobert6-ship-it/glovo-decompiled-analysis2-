package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineApi$setNewRouteData$1 extends ContinuationImpl {
    public int I$0;
    public MapboxRouteLineApi L$0;
    public SearchOptionsKt$validateLimit$1 L$1;
    public ArrayList L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MapboxRouteLineApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineApi$setNewRouteData$1(MapboxRouteLineApi mapboxRouteLineApi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mapboxRouteLineApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MapboxRouteLineApi.access$setNewRouteData(this.this$0, null, null, null, 0, this);
    }
}

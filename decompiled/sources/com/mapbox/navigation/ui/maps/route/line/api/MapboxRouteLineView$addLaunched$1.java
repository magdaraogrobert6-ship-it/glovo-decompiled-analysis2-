package com.mapbox.navigation.ui.maps.route.line.api;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineView$addLaunched$1 extends ContinuationImpl {
    public List L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MapboxRouteLineView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineView$addLaunched$1(MapboxRouteLineView mapboxRouteLineView, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mapboxRouteLineView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MapboxRouteLineView.access$addLaunched(this.this$0, null, null, this);
    }
}

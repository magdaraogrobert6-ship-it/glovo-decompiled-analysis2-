package com.mapbox.navigation.core.routerefresh;

import com.mapbox.navigation.base.internal.RouteRefreshRequestData;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.core.internal.RouteProgressData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteRefresher$refreshRoute$1 extends ContinuationImpl {
    public RouteRefresher L$0;
    public NavigationRoute L$1;
    public RouteProgressData L$2;
    public RouteRefreshRequestData L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RouteRefresher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteRefresher$refreshRoute$1(RouteRefresher routeRefresher, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = routeRefresher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RouteRefresher.access$refreshRoute(this.this$0, null, null, this);
    }
}

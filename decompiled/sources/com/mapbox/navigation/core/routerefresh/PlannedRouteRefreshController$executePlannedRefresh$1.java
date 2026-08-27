package com.mapbox.navigation.core.routerefresh;

import com.sentiance.core.model.events.I$b;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PlannedRouteRefreshController$executePlannedRefresh$1 extends ContinuationImpl {
    public I$b L$0;
    public List L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ I$b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlannedRouteRefreshController$executePlannedRefresh$1(I$b i$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = i$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return I$b.access$executePlannedRefresh(this.this$0, null, false, this);
    }
}

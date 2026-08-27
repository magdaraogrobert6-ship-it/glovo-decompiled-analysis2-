package com.mapbox.navigation.core;

import com.mapbox.search.analytics.AnalyticsServiceImpl;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesRefreshDataProvider$getRoutesRefreshData$1 extends ContinuationImpl {
    public List L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AnalyticsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutesRefreshDataProvider$getRoutesRefreshData$1(AnalyticsServiceImpl analyticsServiceImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = analyticsServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRoutesRefreshData(null, this);
    }
}

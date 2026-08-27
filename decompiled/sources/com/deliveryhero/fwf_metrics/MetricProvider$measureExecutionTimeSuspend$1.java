package com.deliveryhero.fwf_metrics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricProvider$measureExecutionTimeSuspend$1<T> extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricProvider$measureExecutionTimeSuspend$1(MetricProvider metricProvider, ShortNewsContentCardView<? super MetricProvider$measureExecutionTimeSuspend$1> shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = metricProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.measureExecutionTimeSuspend$fwf_client_release(null, null, null, this);
    }
}

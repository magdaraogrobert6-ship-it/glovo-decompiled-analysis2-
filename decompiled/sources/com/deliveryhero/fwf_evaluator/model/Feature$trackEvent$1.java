package com.deliveryhero.fwf_evaluator.model;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class Feature$trackEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Feature this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Feature$trackEvent$1(Feature feature, ShortNewsContentCardView<? super Feature$trackEvent$1> shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = feature;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.trackEvent$fwf_client_release(null, null, null, this);
    }
}

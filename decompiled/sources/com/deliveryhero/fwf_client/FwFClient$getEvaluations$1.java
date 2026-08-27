package com.deliveryhero.fwf_client;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClient$getEvaluations$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FwFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFClient$getEvaluations$1(FwFClient fwFClient, ShortNewsContentCardView<? super FwFClient$getEvaluations$1> shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = fwFClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getEvaluations$fwf_client_release(null, null, null, null, this);
    }
}

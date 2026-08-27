package com.deliveryhero.fwf_client;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClient$syncClient$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FwFClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFClient$syncClient$1(FwFClient fwFClient, ShortNewsContentCardView<? super FwFClient$syncClient$1> shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = fwFClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.syncClient$fwf_client_release(this);
    }
}

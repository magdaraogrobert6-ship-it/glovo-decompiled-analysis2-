package com.deliveryhero.fwf_tracking;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFTrackingService$trackEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FwFTrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFTrackingService$trackEvent$1(FwFTrackingService fwFTrackingService, ShortNewsContentCardView<? super FwFTrackingService$trackEvent$1> shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = fwFTrackingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.trackEvent$fwf_client_release(null, null, null, this);
    }
}

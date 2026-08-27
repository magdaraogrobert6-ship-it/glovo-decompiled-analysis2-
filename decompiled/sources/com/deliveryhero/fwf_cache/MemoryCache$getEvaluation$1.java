package com.deliveryhero.fwf_cache;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryCache$getEvaluation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemoryCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryCache$getEvaluation$1(MemoryCache memoryCache, ShortNewsContentCardView<? super MemoryCache$getEvaluation$1> shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = memoryCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getEvaluation$fwf_client_release(null, this);
    }
}

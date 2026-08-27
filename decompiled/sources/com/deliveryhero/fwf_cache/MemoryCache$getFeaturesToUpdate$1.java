package com.deliveryhero.fwf_cache;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryCache$getFeaturesToUpdate$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MemoryCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryCache$getFeaturesToUpdate$1(MemoryCache memoryCache, ShortNewsContentCardView<? super MemoryCache$getFeaturesToUpdate$1> shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = memoryCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getFeaturesToUpdate$fwf_client_release(null, 0L, this);
    }
}

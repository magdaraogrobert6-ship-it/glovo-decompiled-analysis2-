package com.mapbox.navigation.core.reroute;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeMapboxRerouteController$handleRerouteResponse$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NativeMapboxRerouteController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeMapboxRerouteController$handleRerouteResponse$1(NativeMapboxRerouteController nativeMapboxRerouteController, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nativeMapboxRerouteController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NativeMapboxRerouteController.access$handleRerouteResponse(this.this$0, null, null, null, this);
    }
}

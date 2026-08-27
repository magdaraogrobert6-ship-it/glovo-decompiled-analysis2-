package com.mapbox.navigation.core.preview;

import com.huawei.wisesecurity.ucs_credential.g0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class NativeRoutesDataParser$parse$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeRoutesDataParser$parse$1(g0 g0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.parse(null, this);
    }
}

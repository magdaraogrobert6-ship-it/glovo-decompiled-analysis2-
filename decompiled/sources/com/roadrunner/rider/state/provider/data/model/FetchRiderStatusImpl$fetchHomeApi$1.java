package com.roadrunner.rider.state.provider.data.model;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRiderStatusImpl$fetchHomeApi$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ FetchRiderStatusImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRiderStatusImpl$fetchHomeApi$1(FetchRiderStatusImpl fetchRiderStatusImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = fetchRiderStatusImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.write.m5028fetchHomeApiIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5028fetchHomeApiIoAF18A = this.write.m5028fetchHomeApiIoAF18A(this);
        if (objM5028fetchHomeApiIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM5028fetchHomeApiIoAF18A);
            int i3 = serializer + 31;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return onitemdismiss;
        }
        int i5 = IconCompatParcelizer + 73;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objM5028fetchHomeApiIoAF18A;
        }
        obj2.hashCode();
        throw null;
    }
}

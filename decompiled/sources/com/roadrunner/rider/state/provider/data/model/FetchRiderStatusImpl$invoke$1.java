package com.roadrunner.rider.state.provider.data.model;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRiderStatusImpl$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ FetchRiderStatusImpl IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchRiderStatusImpl$invoke$1(FetchRiderStatusImpl fetchRiderStatusImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = fetchRiderStatusImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5029invokeIoAF18A = this.IconCompatParcelizer.m5029invokeIoAF18A(this);
        if (objM5029invokeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = RemoteActionCompatParcelizer + 59;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 86 / 0;
            }
            return objM5029invokeIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5029invokeIoAF18A);
        int i4 = RemoteActionCompatParcelizer + 105;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}

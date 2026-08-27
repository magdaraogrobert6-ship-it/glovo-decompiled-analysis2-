package com.roadrunner.delivery.accept.laststop.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopRepositoryImpl$saveLastStopAddress$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ LastStopRepositoryImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastStopRepositoryImpl$saveLastStopAddress$1(LastStopRepositoryImpl lastStopRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = lastStopRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 105;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4904saveLastStopAddressyxL6bBk = this.write.m4904saveLastStopAddressyxL6bBk(null, null, null, null, this);
        if (objM4904saveLastStopAddressyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4904saveLastStopAddressyxL6bBk;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4904saveLastStopAddressyxL6bBk);
        int i4 = RemoteActionCompatParcelizer + 15;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}

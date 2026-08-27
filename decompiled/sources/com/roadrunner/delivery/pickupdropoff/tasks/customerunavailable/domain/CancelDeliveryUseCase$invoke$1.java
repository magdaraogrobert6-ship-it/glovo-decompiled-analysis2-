package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CancelDeliveryUseCase$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ InitiateTransferChangeUseCase serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancelDeliveryUseCase$invoke$1(InitiateTransferChangeUseCase initiateTransferChangeUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = initiateTransferChangeUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4930invokegIAlus = this.serializer.m4930invokegIAlus(null, this);
        if (objM4930invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4930invokegIAlus);
            int i4 = RemoteActionCompatParcelizer + 85;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onitemdismiss;
        }
        int i6 = RemoteActionCompatParcelizer + 39;
        int i7 = i6 % Fields.SpotShadowColor;
        write = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 21;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            return objM4930invokegIAlus;
        }
        throw null;
    }
}

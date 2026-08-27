package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository$handleConfirmationRequest$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ ConfirmationRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationRepository$handleConfirmationRequest$1(ConfirmationRepository confirmationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = confirmationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 39;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4924handleConfirmationRequestgIAlus = this.write.m4924handleConfirmationRequestgIAlus(null, this);
        if (objM4924handleConfirmationRequestgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4924handleConfirmationRequestgIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4924handleConfirmationRequestgIAlus);
        int i4 = read + 47;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}

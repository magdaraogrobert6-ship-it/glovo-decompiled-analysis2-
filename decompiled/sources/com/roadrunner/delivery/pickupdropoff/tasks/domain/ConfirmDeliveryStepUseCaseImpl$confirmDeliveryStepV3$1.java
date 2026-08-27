package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ ConfirmDeliveryStepUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmDeliveryStepUseCaseImpl$confirmDeliveryStepV3$1(ConfirmDeliveryStepUseCaseImpl confirmDeliveryStepUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = confirmDeliveryStepUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4937confirmDeliveryStepV3gIAlus = this.write.m4937confirmDeliveryStepV3gIAlus(null, this);
        if (objM4937confirmDeliveryStepV3gIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4937confirmDeliveryStepV3gIAlus);
        }
        int i4 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4937confirmDeliveryStepV3gIAlus;
    }
}

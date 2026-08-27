package com.roadrunner.delivery.pickupdropoff.tasks.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmDeliveryStepUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ConfirmDeliveryStepUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmDeliveryStepUseCaseImpl$invoke$1(ConfirmDeliveryStepUseCaseImpl confirmDeliveryStepUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = confirmDeliveryStepUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.write.m4938invokegIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4938invokegIAlus = this.write.m4938invokegIAlus(null, this);
        if (objM4938invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4938invokegIAlus);
        }
        int i3 = serializer + 35;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objM4938invokegIAlus;
    }
}

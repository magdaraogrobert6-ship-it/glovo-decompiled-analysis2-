package com.roadrunner.delivery.accept.repository;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptDataRepository$autoAcceptDelivery$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ DeliveryAcceptDataRepository serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAcceptDataRepository$autoAcceptDelivery$1(DeliveryAcceptDataRepository deliveryAcceptDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = deliveryAcceptDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4910autoAcceptDeliverygIAlus = this.serializer.m4910autoAcceptDeliverygIAlus(null, this);
        if (objM4910autoAcceptDeliverygIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4910autoAcceptDeliverygIAlus);
        }
        int i4 = IconCompatParcelizer + 17;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM4910autoAcceptDeliverygIAlus;
        }
        throw null;
    }
}

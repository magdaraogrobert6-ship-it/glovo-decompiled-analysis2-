package com.roadrunner.delivery.accept.repository;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptDataRepository$acceptDelivery$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ DeliveryAcceptDataRepository RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAcceptDataRepository$acceptDelivery$1(DeliveryAcceptDataRepository deliveryAcceptDataRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = deliveryAcceptDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4908acceptDeliverygIAlus = this.RemoteActionCompatParcelizer.m4908acceptDeliverygIAlus(null, this);
        if (objM4908acceptDeliverygIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4908acceptDeliverygIAlus);
        }
        int i2 = read;
        int i3 = i2 + 119;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objM4908acceptDeliverygIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}

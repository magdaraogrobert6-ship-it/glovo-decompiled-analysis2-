package com.roadrunner.delivery.accept.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptDeliveryImpl$autoAcceptDelivery$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ AutoAcceptDeliveryImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAcceptDeliveryImpl$autoAcceptDelivery$1(AutoAcceptDeliveryImpl autoAcceptDeliveryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = autoAcceptDeliveryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.write.m4899autoAcceptDelivery0E7RQCE(null, null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4899autoAcceptDelivery0E7RQCE = this.write.m4899autoAcceptDelivery0E7RQCE(null, null, this);
        if (objM4899autoAcceptDelivery0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4899autoAcceptDelivery0E7RQCE);
        }
        int i3 = IconCompatParcelizer + 67;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objM4899autoAcceptDelivery0E7RQCE;
        }
        obj2.hashCode();
        throw null;
    }
}

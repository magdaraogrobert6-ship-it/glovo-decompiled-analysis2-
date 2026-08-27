package com.roadrunner.delivery.ontheway.destination.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetDestinationAddressImpl$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ GetDestinationAddressImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDestinationAddressImpl$invoke$1(GetDestinationAddressImpl getDestinationAddressImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = getDestinationAddressImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4917invokegIAlus = this.write.m4917invokegIAlus(null, this);
        if (objM4917invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4917invokegIAlus);
            int i2 = read + 79;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return onitemdismiss;
        }
        int i4 = read + 31;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM4917invokegIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}

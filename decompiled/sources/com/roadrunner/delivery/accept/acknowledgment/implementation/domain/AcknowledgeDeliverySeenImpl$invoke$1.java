package com.roadrunner.delivery.accept.acknowledgment.implementation.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AcknowledgeDeliverySeenImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ AcknowledgeDeliverySeenImpl RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgeDeliverySeenImpl$invoke$1(AcknowledgeDeliverySeenImpl acknowledgeDeliverySeenImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = acknowledgeDeliverySeenImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4897invokeyxL6bBk = this.RemoteActionCompatParcelizer.m4897invokeyxL6bBk(null, null, null, 0L, this);
        if (objM4897invokeyxL6bBk == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4897invokeyxL6bBk;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4897invokeyxL6bBk);
        int i4 = serializer + 119;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}

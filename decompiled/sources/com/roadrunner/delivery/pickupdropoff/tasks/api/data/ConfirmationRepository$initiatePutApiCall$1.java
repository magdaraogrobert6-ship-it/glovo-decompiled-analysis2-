package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository$initiatePutApiCall$1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ ConfirmationRepository IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationRepository$initiatePutApiCall$1(ConfirmationRepository confirmationRepository, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = confirmationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4926initiatePutApiCall0E7RQCE = this.IconCompatParcelizer.m4926initiatePutApiCall0E7RQCE(null, null, this);
        if (objM4926initiatePutApiCall0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = serializer + 95;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4926initiatePutApiCall0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4926initiatePutApiCall0E7RQCE);
        int i4 = read + 99;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}

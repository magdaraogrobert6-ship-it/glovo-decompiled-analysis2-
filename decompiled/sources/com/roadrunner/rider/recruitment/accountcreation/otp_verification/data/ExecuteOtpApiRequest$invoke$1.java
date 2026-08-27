package com.roadrunner.rider.recruitment.accountcreation.otp_verification.data;

import androidx.compose.ui.graphics.Fields;
import com.sentiance.core.model.events.H$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteOtpApiRequest$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ H$b read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteOtpApiRequest$invoke$1(H$b h$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = h$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5076invokegIAlus = this.read.m5076invokegIAlus(null, this);
        if (objM5076invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5076invokegIAlus);
        }
        int i4 = RemoteActionCompatParcelizer + 39;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return objM5076invokegIAlus;
    }
}

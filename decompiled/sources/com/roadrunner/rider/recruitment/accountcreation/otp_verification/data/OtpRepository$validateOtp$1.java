package com.roadrunner.rider.recruitment.accountcreation.otp_verification.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpRepository$validateOtp$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ FormBody.Builder serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpRepository$validateOtp$1(FormBody.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5160validateOtpBWLJW6A$implementation = this.serializer.m5160validateOtpBWLJW6A$implementation(null, null, null, this);
        if (objM5160validateOtpBWLJW6A$implementation == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = write + 93;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return objM5160validateOtpBWLJW6A$implementation;
            }
            throw null;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5160validateOtpBWLJW6A$implementation);
        int i3 = write + 91;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return onitemdismiss;
        }
        throw null;
    }
}

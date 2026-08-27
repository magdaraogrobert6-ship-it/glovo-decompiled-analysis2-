package com.roadrunner.rider.recruitment.accountcreation.otp_verification.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpRepository$sendOtp$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ FormBody.Builder RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpRepository$sendOtp$1(FormBody.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5159sendOtpgIAlus$implementation = this.RemoteActionCompatParcelizer.m5159sendOtpgIAlus$implementation(null, this);
        if (objM5159sendOtpgIAlus$implementation == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5159sendOtpgIAlus$implementation;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5159sendOtpgIAlus$implementation);
        int i4 = IconCompatParcelizer + 123;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onitemdismiss;
        }
        throw null;
    }
}

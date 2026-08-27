package com.roadrunner.login.data.forgotpassword;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.SignInDataStore;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ForgotPasswordRepository$forgotPassword$1 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SignInDataStore RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordRepository$forgotPassword$1(SignInDataStore signInDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = signInDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4864forgotPasswordgIAlus = this.RemoteActionCompatParcelizer.m4864forgotPasswordgIAlus(null, this);
        if (objM4864forgotPasswordgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4864forgotPasswordgIAlus);
        }
        int i2 = read + 105;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = i3 + 29;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4864forgotPasswordgIAlus;
    }
}

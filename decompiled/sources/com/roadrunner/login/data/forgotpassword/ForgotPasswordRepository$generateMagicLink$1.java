package com.roadrunner.login.data.forgotpassword;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.auth.data.SignInDataStore;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ForgotPasswordRepository$generateMagicLink$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ SignInDataStore write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordRepository$generateMagicLink$1(SignInDataStore signInDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = signInDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.write.m4865generateMagicLinkhUnOzRk(null, null, null, null, null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4865generateMagicLinkhUnOzRk = this.write.m4865generateMagicLinkhUnOzRk(null, null, null, null, null, this);
        if (objM4865generateMagicLinkhUnOzRk == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4865generateMagicLinkhUnOzRk;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4865generateMagicLinkhUnOzRk);
        int i3 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}

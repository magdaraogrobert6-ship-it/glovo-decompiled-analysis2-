package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthRepository$logoutUser$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ AuthRepository serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepository$logoutUser$1(AuthRepository authRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = authRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.m4860logoutUsergIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4860logoutUsergIAlus = this.serializer.m4860logoutUsergIAlus(null, this);
        if (objM4860logoutUsergIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i3 = write + 51;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objM4860logoutUsergIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4860logoutUsergIAlus);
        int i5 = write + 63;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onitemdismiss;
    }
}

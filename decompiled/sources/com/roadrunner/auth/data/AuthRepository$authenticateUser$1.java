package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthRepository$authenticateUser$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ AuthRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepository$authenticateUser$1(AuthRepository authRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = authRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4858authenticateUser0E7RQCE = this.write.m4858authenticateUser0E7RQCE(null, null, this);
        if (objM4858authenticateUser0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = serializer + 61;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objM4858authenticateUser0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4858authenticateUser0E7RQCE);
        int i6 = serializer + 115;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return onitemdismiss;
    }
}

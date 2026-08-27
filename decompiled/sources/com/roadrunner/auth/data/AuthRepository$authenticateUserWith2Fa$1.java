package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthRepository$authenticateUserWith2Fa$1 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ AuthRepository IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepository$authenticateUserWith2Fa$1(AuthRepository authRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = authRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4859authenticateUserWith2Fa0E7RQCE = this.IconCompatParcelizer.m4859authenticateUserWith2Fa0E7RQCE(null, null, this);
        if (objM4859authenticateUserWith2Fa0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = write + 17;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 61 / 0;
            }
            return objM4859authenticateUserWith2Fa0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4859authenticateUserWith2Fa0E7RQCE);
        int i4 = serializer + 103;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}

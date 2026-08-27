package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthRepository$verifyMagicLink$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ AuthRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthRepository$verifyMagicLink$1(AuthRepository authRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = authRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4861verifyMagicLink0E7RQCE = this.write.m4861verifyMagicLink0E7RQCE(null, null, this);
        if (objM4861verifyMagicLink0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4861verifyMagicLink0E7RQCE);
            int i2 = serializer + 51;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return onitemdismiss;
        }
        int i4 = serializer + 85;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objM4861verifyMagicLink0E7RQCE;
        }
        obj2.hashCode();
        throw null;
    }
}

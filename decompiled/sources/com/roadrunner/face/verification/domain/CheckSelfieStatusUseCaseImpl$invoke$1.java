package com.roadrunner.face.verification.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckSelfieStatusUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ CheckSelfieStatusUseCaseImpl RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckSelfieStatusUseCaseImpl$invoke$1(CheckSelfieStatusUseCaseImpl checkSelfieStatusUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = checkSelfieStatusUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.m4960invokeIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4960invokeIoAF18A = this.RemoteActionCompatParcelizer.m4960invokeIoAF18A(this);
        if (objM4960invokeIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i3 = IconCompatParcelizer + 29;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objM4960invokeIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4960invokeIoAF18A);
        int i5 = serializer + 43;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return onitemdismiss;
    }
}

package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveLastStopAddressUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SendTestPushUseCase read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveLastStopAddressUseCaseImpl$invoke$1(SendTestPushUseCase sendTestPushUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = sendTestPushUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4954invokeBWLJW6A = this.read.m4954invokeBWLJW6A(null, null, null, this);
        if (objM4954invokeBWLJW6A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4954invokeBWLJW6A);
            int i2 = serializer + 25;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return onitemdismiss;
        }
        int i4 = write + 23;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objM4954invokeBWLJW6A;
        }
        obj2.hashCode();
        throw null;
    }
}

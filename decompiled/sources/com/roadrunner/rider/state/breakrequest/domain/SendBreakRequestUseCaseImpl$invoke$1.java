package com.roadrunner.rider.state.breakrequest.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SendBreakRequestUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ SendBreakRequestUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendBreakRequestUseCaseImpl$invoke$1(SendBreakRequestUseCaseImpl sendBreakRequestUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = sendBreakRequestUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM5025invokegIAlus = this.write.m5025invokegIAlus(null, this);
        if (objM5025invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5025invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5025invokegIAlus);
        int i4 = RemoteActionCompatParcelizer + 125;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}

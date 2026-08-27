package com.roadrunner.delivery.ontheway.phonecall.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.getSpanVerticalAligndo9XGg;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchPhoneNumber$invoke$1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ SendTestPushUseCase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPhoneNumber$invoke$1(SendTestPushUseCase sendTestPushUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = sendTestPushUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4957invokegIAlus = this.write.m4957invokegIAlus((getSpanVerticalAligndo9XGg) null, this);
        if (objM4957invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4957invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4957invokegIAlus);
        int i4 = read + 67;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}

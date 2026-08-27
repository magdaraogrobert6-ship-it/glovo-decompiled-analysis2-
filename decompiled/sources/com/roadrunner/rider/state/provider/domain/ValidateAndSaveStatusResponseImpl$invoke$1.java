package com.roadrunner.rider.state.provider.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidateAndSaveStatusResponseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ ValidateAndSaveStatusResponseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateAndSaveStatusResponseImpl$invoke$1(ValidateAndSaveStatusResponseImpl validateAndSaveStatusResponseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = validateAndSaveStatusResponseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.write.m5031invokegIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5031invokegIAlus = this.write.m5031invokegIAlus(null, this);
        if (objM5031invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM5031invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5031invokegIAlus);
        int i3 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}

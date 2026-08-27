package com.roadrunner.delivery.accept.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ AutoAcceptEarningsUseCaseImpl read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAcceptEarningsUseCaseImpl$autoAcceptEarnings$1(AutoAcceptEarningsUseCaseImpl autoAcceptEarningsUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = autoAcceptEarningsUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4900autoAcceptEarningsgIAlus = this.read.m4900autoAcceptEarningsgIAlus(null, this);
        if (objM4900autoAcceptEarningsgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4900autoAcceptEarningsgIAlus);
            int i2 = IconCompatParcelizer + 87;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return onitemdismiss;
            }
            obj2.hashCode();
            throw null;
        }
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 43;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = i3 + 117;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return objM4900autoAcceptEarningsgIAlus;
    }
}

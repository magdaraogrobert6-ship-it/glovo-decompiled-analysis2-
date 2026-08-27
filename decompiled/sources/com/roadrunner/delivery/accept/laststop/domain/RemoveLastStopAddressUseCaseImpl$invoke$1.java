package com.roadrunner.delivery.accept.laststop.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoveLastStopAddressUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ RemoveLastStopAddressUseCaseImpl read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveLastStopAddressUseCaseImpl$invoke$1(RemoveLastStopAddressUseCaseImpl removeLastStopAddressUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = removeLastStopAddressUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4906invokegIAlus = this.read.m4906invokegIAlus(null, this);
        if (objM4906invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = serializer + 39;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 93 / 0;
            }
            return objM4906invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4906invokegIAlus);
        int i4 = serializer + 83;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
        return onitemdismiss;
    }
}

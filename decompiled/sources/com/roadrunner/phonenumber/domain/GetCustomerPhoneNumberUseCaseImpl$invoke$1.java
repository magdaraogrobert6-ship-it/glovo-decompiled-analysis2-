package com.roadrunner.phonenumber.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetCustomerPhoneNumberUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetCustomerPhoneNumberUseCaseImpl read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerPhoneNumberUseCaseImpl$invoke$1(GetCustomerPhoneNumberUseCaseImpl getCustomerPhoneNumberUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = getCustomerPhoneNumberUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5002invokegIAlus = this.read.m5002invokegIAlus(null, this);
        if (objM5002invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5002invokegIAlus);
        }
        int i2 = write + 75;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 77;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objM5002invokegIAlus;
    }
}

package com.roadrunner.rider.recruitment.accountcreation.email_and_phone.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneValidationUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ PhoneValidationUseCase RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneValidationUseCase$invoke$1(PhoneValidationUseCase phoneValidationUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = phoneValidationUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5019invoke0E7RQCE$implementation = this.RemoteActionCompatParcelizer.m5019invoke0E7RQCE$implementation(null, null, this);
        if (objM5019invoke0E7RQCE$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5019invoke0E7RQCE$implementation);
        }
        int i2 = IconCompatParcelizer + 87;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = i3 + 79;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return objM5019invoke0E7RQCE$implementation;
    }
}

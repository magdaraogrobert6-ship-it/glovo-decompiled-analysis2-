package com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneValidationRepository$validatePhoneNumber$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ PhoneValidationRepository RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneValidationRepository$validatePhoneNumber$1(PhoneValidationRepository phoneValidationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = phoneValidationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 27;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5018validatePhoneNumberBWLJW6A$implementation = this.RemoteActionCompatParcelizer.m5018validatePhoneNumberBWLJW6A$implementation(null, null, null, this);
        if (objM5018validatePhoneNumberBWLJW6A$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5018validatePhoneNumberBWLJW6A$implementation);
        }
        int i4 = write;
        int i5 = i4 + 109;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 51;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objM5018validatePhoneNumberBWLJW6A$implementation;
    }
}

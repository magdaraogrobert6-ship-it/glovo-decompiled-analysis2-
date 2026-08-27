package com.roadrunner.rider.recruitment.accountcreation.pass_verification.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PassVerificationRepository$getIdentityVerificationUrl$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ PhoneValidationRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassVerificationRepository$getIdentityVerificationUrl$1(PhoneValidationRepository phoneValidationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = phoneValidationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5017getIdentityVerificationUrlIoAF18A$implementation = this.write.m5017getIdentityVerificationUrlIoAF18A$implementation(this);
        if (objM5017getIdentityVerificationUrlIoAF18A$implementation != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5017getIdentityVerificationUrlIoAF18A$implementation);
        }
        int i4 = RemoteActionCompatParcelizer + 121;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM5017getIdentityVerificationUrlIoAF18A$implementation;
    }
}

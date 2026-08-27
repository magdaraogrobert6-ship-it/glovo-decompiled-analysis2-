package com.roadrunner.rider.recruitment.accountcreation.email_and_phone.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.recruitment.accountcreation.analytics.AccountCreationLogger;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.boundingRectInRoot;
import o.isItemDismissable;
import o.metaMarkUpdatedAndHasCallbacks;
import o.onItemDismiss;
import o.processDeeplink;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneValidationUseCase {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final AccountCreationLogger RemoteActionCompatParcelizer;
    public final PhoneValidationRepository serializer;
    public final boundingRectInRoot write;

    public PhoneValidationUseCase(PhoneValidationRepository phoneValidationRepository, boundingRectInRoot boundingrectinroot, AccountCreationLogger accountCreationLogger) {
        phoneValidationRepository.getClass();
        boundingrectinroot.getClass();
        accountCreationLogger.getClass();
        this.serializer = phoneValidationRepository;
        this.write = boundingrectinroot;
        this.RemoteActionCompatParcelizer = accountCreationLogger;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX INFO: renamed from: invoke-0E7RQCE$implementation, reason: not valid java name */
    public final Object m5019invoke0E7RQCE$implementation(String str, String str2, ContinuationImpl continuationImpl) {
        PhoneValidationUseCase$invoke$1 phoneValidationUseCase$invoke$1;
        Object objM5018validatePhoneNumberBWLJW6A$implementation;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof PhoneValidationUseCase$invoke$1) {
            int i2 = IconCompatParcelizer + 97;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((PhoneValidationUseCase$invoke$1) continuationImpl).write;
                obj.hashCode();
                throw null;
            }
            phoneValidationUseCase$invoke$1 = (PhoneValidationUseCase$invoke$1) continuationImpl;
            int i4 = phoneValidationUseCase$invoke$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                phoneValidationUseCase$invoke$1.write = i4 - Integer.MIN_VALUE;
            } else {
                phoneValidationUseCase$invoke$1 = new PhoneValidationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            phoneValidationUseCase$invoke$1 = new PhoneValidationUseCase$invoke$1(this, continuationImpl);
        }
        Object obj2 = phoneValidationUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = phoneValidationUseCase$invoke$1.write;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            metaMarkUpdatedAndHasCallbacks metamarkupdatedandhascallbacksWrite = this.write.write();
            String strRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str2, str);
            String str3 = metamarkupdatedandhascallbacksWrite.brand;
            String str4 = metamarkupdatedandhascallbacksWrite.countryIsoCode;
            phoneValidationUseCase$invoke$1.write = 1;
            objM5018validatePhoneNumberBWLJW6A$implementation = this.serializer.m5018validatePhoneNumberBWLJW6A$implementation(strRemoteActionCompatParcelizer, str3, str4, phoneValidationUseCase$invoke$1);
            if (objM5018validatePhoneNumberBWLJW6A$implementation == coroutineSingletons) {
                int i6 = read + 19;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = read + 83;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM5018validatePhoneNumberBWLJW6A$implementation = ((onItemDismiss) obj2).IconCompatParcelizer;
        }
        boolean z = objM5018validatePhoneNumberBWLJW6A$implementation instanceof isItemDismissable;
        AccountCreationLogger accountCreationLogger = this.RemoteActionCompatParcelizer;
        if (!z) {
            accountCreationLogger.RemoteActionCompatParcelizer.logEvent("phone_validation_success", null);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5018validatePhoneNumberBWLJW6A$implementation);
        if (thSerializer != null) {
            accountCreationLogger.getClass();
            accountCreationLogger.RemoteActionCompatParcelizer.logEvent("phone_validation_fail", accountCreationLogger.write(thSerializer));
            int i9 = IconCompatParcelizer + 11;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        return !z ? ((processDeeplink) objM5018validatePhoneNumberBWLJW6A$implementation).phoneNumber : objM5018validatePhoneNumberBWLJW6A$implementation;
    }
}

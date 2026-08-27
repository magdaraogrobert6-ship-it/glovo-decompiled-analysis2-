package com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.rider.recruitment.accountcreation.data.ExecuteAccountCreationApiRequest;
import com.roadrunner.rider.recruitment.accountcreation.pass_verification.data.PassVerificationRepository$getIdentityVerificationUrl$1;
import com.roadrunner.rider.safety.log.data.SubmitSafetyLogEventWorker$doWork$result$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;
import o.onResumeI;

/* JADX INFO: loaded from: classes3.dex */
public final class PhoneValidationRepository {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final onResumeI serializer;
    public final ExecuteAccountCreationApiRequest write;

    public PhoneValidationRepository(ExecuteAccountCreationApiRequest executeAccountCreationApiRequest, onResumeI onresumei, int i) {
        if (i != 1) {
            executeAccountCreationApiRequest.getClass();
            onresumei.getClass();
            this.write = executeAccountCreationApiRequest;
            this.serializer = onresumei;
            return;
        }
        executeAccountCreationApiRequest.getClass();
        onresumei.getClass();
        this.write = executeAccountCreationApiRequest;
        this.serializer = onresumei;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX INFO: renamed from: getIdentityVerificationUrl-IoAF18A$implementation, reason: not valid java name */
    public Object m5017getIdentityVerificationUrlIoAF18A$implementation(ContinuationImpl continuationImpl) {
        PassVerificationRepository$getIdentityVerificationUrl$1 passVerificationRepository$getIdentityVerificationUrl$1;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof PassVerificationRepository$getIdentityVerificationUrl$1;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (!(continuationImpl instanceof PassVerificationRepository$getIdentityVerificationUrl$1)) {
            passVerificationRepository$getIdentityVerificationUrl$1 = new PassVerificationRepository$getIdentityVerificationUrl$1(this, continuationImpl);
        } else {
            passVerificationRepository$getIdentityVerificationUrl$1 = (PassVerificationRepository$getIdentityVerificationUrl$1) continuationImpl;
            int i3 = passVerificationRepository$getIdentityVerificationUrl$1.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                passVerificationRepository$getIdentityVerificationUrl$1.serializer = i3 - Integer.MIN_VALUE;
            } else {
                passVerificationRepository$getIdentityVerificationUrl$1 = new PassVerificationRepository$getIdentityVerificationUrl$1(this, continuationImpl);
            }
        }
        Object obj = passVerificationRepository$getIdentityVerificationUrl$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = passVerificationRepository$getIdentityVerificationUrl$1.serializer;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 21);
            passVerificationRepository$getIdentityVerificationUrl$1.serializer = 1;
            Object objM5016invokegIAlus = this.write.m5016invokegIAlus(mapboxNavigation$parsing$2, passVerificationRepository$getIdentityVerificationUrl$1);
            if (objM5016invokegIAlus != coroutineSingletons) {
                return objM5016invokegIAlus;
            }
            int i5 = RemoteActionCompatParcelizer + 117;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return coroutineSingletons;
        }
        int i7 = IconCompatParcelizer;
        int i8 = i7 + 15;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        if (i4 == 1) {
            int i10 = i7 + 63;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i12 = RemoteActionCompatParcelizer + 99;
        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
        if (i12 % 2 == 0) {
            int i13 = 85 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: validatePhoneNumber-BWLJW6A$implementation, reason: not valid java name */
    public Object m5018validatePhoneNumberBWLJW6A$implementation(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PhoneValidationRepository$validatePhoneNumber$1 phoneValidationRepository$validatePhoneNumber$1;
        int i = 2 % 2;
        if (continuationImpl instanceof PhoneValidationRepository$validatePhoneNumber$1) {
            phoneValidationRepository$validatePhoneNumber$1 = (PhoneValidationRepository$validatePhoneNumber$1) continuationImpl;
            int i2 = phoneValidationRepository$validatePhoneNumber$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = IconCompatParcelizer + 59;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                phoneValidationRepository$validatePhoneNumber$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                phoneValidationRepository$validatePhoneNumber$1 = new PhoneValidationRepository$validatePhoneNumber$1(this, continuationImpl);
            }
        } else {
            phoneValidationRepository$validatePhoneNumber$1 = new PhoneValidationRepository$validatePhoneNumber$1(this, continuationImpl);
        }
        PhoneValidationRepository$validatePhoneNumber$1 phoneValidationRepository$validatePhoneNumber$2 = phoneValidationRepository$validatePhoneNumber$1;
        Object obj = phoneValidationRepository$validatePhoneNumber$2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = phoneValidationRepository$validatePhoneNumber$2.IconCompatParcelizer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SubmitSafetyLogEventWorker$doWork$result$1 submitSafetyLogEventWorker$doWork$result$1 = new SubmitSafetyLogEventWorker$doWork$result$1(this, str, str2, str3, null, 2);
            phoneValidationRepository$validatePhoneNumber$2.IconCompatParcelizer = 1;
            Object objM5016invokegIAlus = this.write.m5016invokegIAlus(submitSafetyLogEventWorker$doWork$result$1, phoneValidationRepository$validatePhoneNumber$2);
            if (objM5016invokegIAlus != coroutineSingletons) {
                return objM5016invokegIAlus;
            }
            int i6 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 65 / 0;
            }
            return coroutineSingletons;
        }
        int i8 = IconCompatParcelizer;
        int i9 = i8 + 35;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (i5 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i11 = RemoteActionCompatParcelizer + 93;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 36 / 0;
            }
            return null;
        }
        int i13 = i8 + 69;
        RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
        throw null;
    }
}

package com.roadrunner.rider.recruitment.accountcreation.navigation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.data.ApplicationUrlRepository$getApplicationUrl$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandler46;
import o.ActivityPackage;
import o.ShortNewsContentCardView;
import o.getQueryContext;
import o.getSdkEnablementProviderandroid_sdk_base_release;
import o.gotOptOutResponse;
import o.launchAttributionResponseTasks;
import o.launchSdkClickResponseTasks;
import o.launchSessionResponseTasks;
import o.prepareForActivityTransitionCarryover;
import o.readObject;
import o.setExternalDeviceIdInDelay;
import o.setPlayStoreKidsComplianceInDelay;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountCreationButtonUiModelImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public final setPlayStoreKidsComplianceInDelay IconCompatParcelizer;
    public final setTransactionSuccessful RatingCompat;
    public final getSdkEnablementProviderandroid_sdk_base_release RemoteActionCompatParcelizer;
    public final readObject read;
    public final transferSessionPackageI serializer;
    public final getQueryContext write;

    public AccountCreationButtonUiModelImpl(getQueryContext getquerycontext, transferSessionPackageI transfersessionpackagei, readObject readobject, setPlayStoreKidsComplianceInDelay setplaystorekidscomplianceindelay, setTransactionSuccessful settransactionsuccessful, getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release) {
        getquerycontext.getClass();
        transfersessionpackagei.getClass();
        readobject.getClass();
        setplaystorekidscomplianceindelay.getClass();
        settransactionsuccessful.getClass();
        getsdkenablementproviderandroid_sdk_base_release.getClass();
        this.write = getquerycontext;
        this.serializer = transfersessionpackagei;
        this.read = readobject;
        this.IconCompatParcelizer = setplaystorekidscomplianceindelay;
        this.RatingCompat = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = getsdkenablementproviderandroid_sdk_base_release;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r1 r4
  0x002b: PHI (r1v18 o.setExternalDeviceIdInDelay) = (r1v17 o.setExternalDeviceIdInDelay), (r1v20 o.setExternalDeviceIdInDelay) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x002b: PHI (r4v7 int) = (r4v6 int), (r4v9 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    public final Object getAccountCreationButtonUiState(ContinuationImpl continuationImpl) {
        setExternalDeviceIdInDelay setexternaldeviceidindelay;
        String str;
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = 0;
        if (continuationImpl instanceof setExternalDeviceIdInDelay) {
            int i4 = MediaMetadataCompat + 53;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                setexternaldeviceidindelay = (setExternalDeviceIdInDelay) continuationImpl;
                i = setexternaldeviceidindelay.write;
                int i5 = 11 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    setexternaldeviceidindelay.write = i - Integer.MIN_VALUE;
                } else {
                    setexternaldeviceidindelay = new setExternalDeviceIdInDelay(this, continuationImpl);
                }
            } else {
                setexternaldeviceidindelay = (setExternalDeviceIdInDelay) continuationImpl;
                i = setexternaldeviceidindelay.write;
                if ((i & Integer.MIN_VALUE) != 0) {
                    setexternaldeviceidindelay.write = i - Integer.MIN_VALUE;
                } else {
                    setexternaldeviceidindelay = new setExternalDeviceIdInDelay(this, continuationImpl);
                }
            }
        } else {
            setexternaldeviceidindelay = new setExternalDeviceIdInDelay(this, continuationImpl);
        }
        Object objIconCompatParcelizer = setexternaldeviceidindelay.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = setexternaldeviceidindelay.write;
        setTransactionSuccessful settransactionsuccessful = this.RatingCompat;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            setexternaldeviceidindelay.write = 1;
            objIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(setexternaldeviceidindelay);
            if (objIconCompatParcelizer == coroutineSingletons) {
                int i7 = MediaDescriptionCompat + 55;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        } else {
            if (i6 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = setexternaldeviceidindelay.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        }
        str2 = (String) objIconCompatParcelizer;
        if (str2 == null) {
            return new launchAttributionResponseTasks(settransactionsuccessful.IconCompatParcelizer(R.string.login_welcome_become_a_rider_button), new launchSdkClickResponseTasks(str));
        }
        ActivityHandler46 activityHandler46 = ActivityHandler46.WELCOME;
        this.RemoteActionCompatParcelizer.getClass();
        return new launchAttributionResponseTasks(settransactionsuccessful.IconCompatParcelizer(R.string.rider_recruitment_continue_application), new launchSdkClickResponseTasks(getSdkEnablementProviderandroid_sdk_base_release.IconCompatParcelizer(activityHandler46, str2)));
        String str3 = (String) objIconCompatParcelizer;
        if (str3 == null) {
            int i9 = MediaMetadataCompat + 63;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            gotOptOutResponse gotoptoutresponse = gotOptOutResponse.IconCompatParcelizer;
            int i11 = MediaDescriptionCompat + 125;
            MediaMetadataCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 0 / 0;
            }
            return gotoptoutresponse;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_NATIVE_ACCOUNT_CREATION_ENABLED)) {
            return new launchAttributionResponseTasks(settransactionsuccessful.IconCompatParcelizer(R.string.login_welcome_become_a_rider_button), launchSessionResponseTasks.RemoteActionCompatParcelizer);
        }
        setexternaldeviceidindelay.serializer = str3;
        setexternaldeviceidindelay.write = 2;
        ActivityPackage activityPackage = this.read.RemoteActionCompatParcelizer;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ApplicationUrlRepository$getApplicationUrl$2(activityPackage, shortNewsContentCardView, i3), setexternaldeviceidindelay);
        if (objWithContext != coroutineSingletons) {
            str = str3;
            objIconCompatParcelizer = objWithContext;
            str2 = (String) objIconCompatParcelizer;
            if (str2 == null) {
                return new launchAttributionResponseTasks(settransactionsuccessful.IconCompatParcelizer(R.string.login_welcome_become_a_rider_button), new launchSdkClickResponseTasks(str));
            }
            ActivityHandler46 activityHandler47 = ActivityHandler46.WELCOME;
            this.RemoteActionCompatParcelizer.getClass();
            return new launchAttributionResponseTasks(settransactionsuccessful.IconCompatParcelizer(R.string.rider_recruitment_continue_application), new launchSdkClickResponseTasks(getSdkEnablementProviderandroid_sdk_base_release.IconCompatParcelizer(activityHandler47, str2)));
        }
        return coroutineSingletons;
    }
}

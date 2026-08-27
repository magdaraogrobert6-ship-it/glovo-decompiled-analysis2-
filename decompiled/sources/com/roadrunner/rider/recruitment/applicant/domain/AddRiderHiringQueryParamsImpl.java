package com.roadrunner.rider.recruitment.applicant.domain;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler45;
import o.ActivityHandler49;
import o.ActivityHandler50;
import o.ActivityHandler9;
import o.isDisabled;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class AddRiderHiringQueryParamsImpl {
    private static int serializer = 1;
    private static int write;
    public final ApplicantRepository RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;

    public AddRiderHiringQueryParamsImpl(ApplicantRepository applicantRepository, isDisabled isdisabled, transferSessionPackageI transfersessionpackagei) {
        this.RemoteActionCompatParcelizer = applicantRepository;
        this.read = transfersessionpackagei;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c4 A[PHI: r9
  0x00c4: PHI (r9v15 o.ActivityHandler45) = (r9v14 o.ActivityHandler45), (r9v19 o.ActivityHandler45) binds: [B:31:0x00c1, B:28:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final Object invoke(String str, ContinuationImpl continuationImpl) {
        ActivityHandler9 activityHandler9;
        Uri.Builder builderBuildUpon;
        ActivityHandler45 activityHandler45;
        int i = 2 % 2;
        int i2 = write + 101;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof ActivityHandler9;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof ActivityHandler9) {
            activityHandler9 = (ActivityHandler9) continuationImpl;
            int i3 = activityHandler9.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                activityHandler9.serializer = i3 - Integer.MIN_VALUE;
                int i4 = write + 123;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                activityHandler9 = new ActivityHandler9(this, continuationImpl);
            }
        } else {
            activityHandler9 = new ActivityHandler9(this, continuationImpl);
        }
        Object objIconCompatParcelizer = activityHandler9.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = activityHandler9.serializer;
        transferSessionPackageI transfersessionpackagei = this.read;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            if (!((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_RIDER_RECRUITMENT_PHASE_2_ENABLED)) {
                int i7 = write;
                int i8 = i7 + 45;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                int i10 = i7 + 35;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            str.getClass();
            builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.getClass();
            activityHandler9.write = builderBuildUpon;
            activityHandler9.serializer = 1;
            objIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(activityHandler9);
            if (objIconCompatParcelizer == coroutineSingletons) {
                int i11 = write + 39;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
            int i13 = serializer + 109;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            builderBuildUpon = activityHandler9.write;
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            int i15 = serializer + 7;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        ActivityHandler49 activityHandler49 = (ActivityHandler49) objIconCompatParcelizer;
        if (activityHandler49 instanceof ActivityHandler50) {
            int i17 = serializer + 27;
            write = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                activityHandler45 = ((ActivityHandler50) activityHandler49).read();
                int i18 = 26 / 0;
                if (!((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.USE_JS_ACCESS_TOKEN_ENABLED)) {
                    builderBuildUpon.appendQueryParameter("access_token", activityHandler45.read()).appendQueryParameter("refresh_token", activityHandler45.write()).appendQueryParameter(RemoteMessageConst.DEVICE_TOKEN, activityHandler45.IconCompatParcelizer());
                }
            } else {
                activityHandler45 = ((ActivityHandler50) activityHandler49).read();
                if (!((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.USE_JS_ACCESS_TOKEN_ENABLED)) {
                    builderBuildUpon.appendQueryParameter("access_token", activityHandler45.read()).appendQueryParameter("refresh_token", activityHandler45.write()).appendQueryParameter(RemoteMessageConst.DEVICE_TOKEN, activityHandler45.IconCompatParcelizer());
                }
            }
            builderBuildUpon.appendQueryParameter("country_code", activityHandler45.serializer());
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }
}

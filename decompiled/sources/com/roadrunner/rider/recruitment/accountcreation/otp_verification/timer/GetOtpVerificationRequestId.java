package com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandlerExternalSyntheticLambda26;
import o.ShortNewsContentCardView;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOtpVerificationRequestId {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final DropShadowEffect RemoteActionCompatParcelizer;

    public GetOtpVerificationRequestId(DropShadowEffect dropShadowEffect, int i) {
        dropShadowEffect.getClass();
        if (i != 1) {
            this.RemoteActionCompatParcelizer = dropShadowEffect;
        } else {
            this.RemoteActionCompatParcelizer = dropShadowEffect;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public Object invoke(ContinuationImpl continuationImpl) {
        ActivityHandlerExternalSyntheticLambda26 activityHandlerExternalSyntheticLambda26;
        int i = 2 % 2;
        int i2 = read + 13;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof ActivityHandlerExternalSyntheticLambda26;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (continuationImpl instanceof ActivityHandlerExternalSyntheticLambda26) {
            activityHandlerExternalSyntheticLambda26 = (ActivityHandlerExternalSyntheticLambda26) continuationImpl;
            int i3 = activityHandlerExternalSyntheticLambda26.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = read + 55;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                activityHandlerExternalSyntheticLambda26.write = i3 - Integer.MIN_VALUE;
            } else {
                activityHandlerExternalSyntheticLambda26 = new ActivityHandlerExternalSyntheticLambda26(this, continuationImpl);
            }
        } else {
            activityHandlerExternalSyntheticLambda26 = new ActivityHandlerExternalSyntheticLambda26(this, continuationImpl);
        }
        Object objFirstOrNull = activityHandlerExternalSyntheticLambda26.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = activityHandlerExternalSyntheticLambda26.write;
        int i7 = 1;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            DropShadowEffect dropShadowEffect = this.RemoteActionCompatParcelizer;
            OtpVerificationTimerDataStore$get$$inlined$map$1 otpVerificationTimerDataStore$get$$inlined$map$1 = new OtpVerificationTimerDataStore$get$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(((performCustomExitMxy_nc0) dropShadowEffect.read).serializer(), new OtpVerificationTimerDataStore$get$1(3, i7, shortNewsContentCardView)), dropShadowEffect, 1);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) dropShadowEffect.RatingCompat)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(otpVerificationTimerDataStore$get$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
            activityHandlerExternalSyntheticLambda26.write = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowRemoteActionCompatParcelizer, activityHandlerExternalSyntheticLambda26);
            if (objFirstOrNull == coroutineSingletons) {
                int i8 = read + 37;
                int i9 = i8 % Fields.SpotShadowColor;
                IconCompatParcelizer = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 37;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        String str = (String) objFirstOrNull;
        if (str == null) {
            int i13 = read + 87;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return "";
        }
        int i15 = read + 73;
        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
        int i16 = i15 % 2;
        return str;
    }
}

package com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.data.NafathTimerDataStore$set$2;
import java.time.Clock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandler10;
import o.ActivityHandlerExternalSyntheticLambda2;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRemainingOtpVerificationTimerIfRunning {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final Clock RemoteActionCompatParcelizer;
    public final DropShadowEffect write;

    public GetRemainingOtpVerificationTimerIfRunning(DropShadowEffect dropShadowEffect, Clock clock, int i) {
        dropShadowEffect.getClass();
        clock.getClass();
        if (i != 1) {
            this.write = dropShadowEffect;
            this.RemoteActionCompatParcelizer = clock;
        } else {
            this.write = dropShadowEffect;
            this.RemoteActionCompatParcelizer = clock;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    public Object invoke(String str, ContinuationImpl continuationImpl) {
        ActivityHandlerExternalSyntheticLambda2 activityHandlerExternalSyntheticLambda2;
        int i = 2 % 2;
        int i2 = read + 119;
        int i3 = i2 % Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof ActivityHandlerExternalSyntheticLambda2;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (!(continuationImpl instanceof ActivityHandlerExternalSyntheticLambda2)) {
            activityHandlerExternalSyntheticLambda2 = new ActivityHandlerExternalSyntheticLambda2(this, continuationImpl);
        } else {
            int i4 = i3 + 55;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = ((ActivityHandlerExternalSyntheticLambda2) continuationImpl).read;
                throw null;
            }
            activityHandlerExternalSyntheticLambda2 = (ActivityHandlerExternalSyntheticLambda2) continuationImpl;
            int i6 = activityHandlerExternalSyntheticLambda2.read;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                activityHandlerExternalSyntheticLambda2.read = i6 - Integer.MIN_VALUE;
            } else {
                activityHandlerExternalSyntheticLambda2 = new ActivityHandlerExternalSyntheticLambda2(this, continuationImpl);
            }
        }
        Object objFirstOrNull = activityHandlerExternalSyntheticLambda2.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = activityHandlerExternalSyntheticLambda2.read;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            DropShadowEffect dropShadowEffect = this.write;
            OtpVerificationTimerDataStore$get$$inlined$map$1 otpVerificationTimerDataStore$get$$inlined$map$1 = new OtpVerificationTimerDataStore$get$$inlined$map$1(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(((performCustomExitMxy_nc0) dropShadowEffect.read).serializer(), new OtpVerificationTimerDataStore$get$1(3, 0, shortNewsContentCardView)), dropShadowEffect, 0);
            ((inCompatibilityMode) ((isOpenInternalroom_runtime) dropShadowEffect.RatingCompat)).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Flow flowRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(otpVerificationTimerDataStore$get$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
            activityHandlerExternalSyntheticLambda2.RemoteActionCompatParcelizer = str;
            activityHandlerExternalSyntheticLambda2.read = 1;
            objFirstOrNull = FlowKt.firstOrNull(flowRemoteActionCompatParcelizer, activityHandlerExternalSyntheticLambda2);
            if (objFirstOrNull == coroutineSingletons) {
                int i8 = IconCompatParcelizer + 97;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = IconCompatParcelizer + 119;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                String str2 = activityHandlerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                throw null;
            }
            str = activityHandlerExternalSyntheticLambda2.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
        }
        ActivityHandler10 activityHandler10 = (ActivityHandler10) objFirstOrNull;
        if (activityHandler10 == null) {
            return new Long(0L);
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{activityHandler10.phoneNumber, str}, getCieXyz.write())).booleanValue()) {
            return new Long(0L);
        }
        long jMillis = (activityHandler10.timerEndTimeInMillis - this.RemoteActionCompatParcelizer.millis()) / 1000;
        return new Long(jMillis >= 0 ? jMillis : 0L);
    }

    public Object invoke(long j, String str, SuspendLambda suspendLambda) {
        int i = 2 % 2;
        ActivityHandler10 activityHandler10 = new ActivityHandler10((j * 1000) + this.RemoteActionCompatParcelizer.millis(), str);
        DropShadowEffect dropShadowEffect = this.write;
        Object objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) dropShadowEffect.read, new NafathTimerDataStore$set$2(dropShadowEffect, activityHandler10, null, 11), suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        if (objSerializer == coroutineSingletons) {
            int i2 = IconCompatParcelizer + 117;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objSerializer;
        }
        int i4 = read + 43;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }
}

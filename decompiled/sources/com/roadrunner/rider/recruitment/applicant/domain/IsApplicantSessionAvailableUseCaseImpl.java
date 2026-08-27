package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler49;
import o.ActivityHandler50;
import o.ActivityHandlerInternalState;

/* JADX INFO: loaded from: classes3.dex */
public final class IsApplicantSessionAvailableUseCaseImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final ApplicantRepository RemoteActionCompatParcelizer;

    public IsApplicantSessionAvailableUseCaseImpl(ApplicantRepository applicantRepository) {
        this.RemoteActionCompatParcelizer = applicantRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        ActivityHandlerInternalState activityHandlerInternalState;
        int i = 2 % 2;
        int i2 = write + 47;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof ActivityHandlerInternalState) {
            activityHandlerInternalState = (ActivityHandlerInternalState) continuationImpl;
            int i4 = activityHandlerInternalState.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IconCompatParcelizer + 41;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                activityHandlerInternalState.read = i4 - Integer.MIN_VALUE;
            } else {
                activityHandlerInternalState = new ActivityHandlerInternalState(this, continuationImpl);
            }
        } else {
            activityHandlerInternalState = new ActivityHandlerInternalState(this, continuationImpl);
        }
        Object objIconCompatParcelizer = activityHandlerInternalState.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = activityHandlerInternalState.read;
        if (i7 != 0) {
            int i8 = IconCompatParcelizer;
            int i9 = i8 + 43;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = i8 + 93;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            activityHandlerInternalState.read = 1;
            objIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(activityHandlerInternalState);
            if (objIconCompatParcelizer == coroutineSingletons) {
                int i13 = write + 105;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        }
        return Boolean.valueOf(((ActivityHandler49) objIconCompatParcelizer) instanceof ActivityHandler50);
    }
}

package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler49;
import o.ActivityHandler50;
import o.hasSessionResponseNotBeenProcessed;

/* JADX INFO: loaded from: classes3.dex */
public final class GetApplicantTokenExpiryUseCaseImpl {
    private static int read = 1;
    private static int serializer;
    public final ApplicantRepository write;

    public GetApplicantTokenExpiryUseCaseImpl(ApplicantRepository applicantRepository) {
        this.write = applicantRepository;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        hasSessionResponseNotBeenProcessed hassessionresponsenotbeenprocessed;
        int i = 2 % 2;
        int i2 = serializer + 107;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof hasSessionResponseNotBeenProcessed;
            throw null;
        }
        if (continuationImpl instanceof hasSessionResponseNotBeenProcessed) {
            hassessionresponsenotbeenprocessed = (hasSessionResponseNotBeenProcessed) continuationImpl;
            int i3 = hassessionresponsenotbeenprocessed.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = read + 21;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    hassessionresponsenotbeenprocessed.serializer = i3 >> Integer.MIN_VALUE;
                } else {
                    hassessionresponsenotbeenprocessed.serializer = i3 - Integer.MIN_VALUE;
                }
            } else {
                hassessionresponsenotbeenprocessed = new hasSessionResponseNotBeenProcessed(this, continuationImpl);
            }
        } else {
            hassessionresponsenotbeenprocessed = new hasSessionResponseNotBeenProcessed(this, continuationImpl);
        }
        Object objIconCompatParcelizer = hassessionresponsenotbeenprocessed.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = hassessionresponsenotbeenprocessed.serializer;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            hassessionresponsenotbeenprocessed.serializer = 1;
            objIconCompatParcelizer = this.write.IconCompatParcelizer(hassessionresponsenotbeenprocessed);
            if (objIconCompatParcelizer == coroutineSingletons) {
                int i6 = serializer + 73;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            int i8 = read + 125;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        ActivityHandler49 activityHandler49 = (ActivityHandler49) objIconCompatParcelizer;
        if (!(activityHandler49 instanceof ActivityHandler50)) {
            return null;
        }
        Long l = new Long(((ActivityHandler50) activityHandler49).IconCompatParcelizer.expiry);
        int i10 = serializer + 55;
        read = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return l;
    }
}

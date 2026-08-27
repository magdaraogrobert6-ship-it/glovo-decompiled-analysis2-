package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandler52;
import o.createFromParcel;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearApplicantDataImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final ApplicantRepository read;

    public ClearApplicantDataImpl(ApplicantRepository applicantRepository) {
        this.read = applicantRepository;
    }

    public final Object invoke(ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        ActivityHandler52 activityHandler52 = this.read.serializer;
        isOpenInternalroom_runtime isopeninternalroom_runtime = activityHandler52.serializer;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ApplicantDataSource$load$2(activityHandler52, null, 1), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objWithContext == coroutineSingletons) {
            int i2 = serializer + 29;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            objWithContext = createfromparcel;
        }
        if (objWithContext != coroutineSingletons) {
            int i4 = IconCompatParcelizer + 13;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            objWithContext = createfromparcel;
        }
        return objWithContext == coroutineSingletons ? objWithContext : createfromparcel;
    }
}

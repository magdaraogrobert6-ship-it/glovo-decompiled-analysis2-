package com.roadrunner.rider.recruitment.applicant.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActivityHandler45;
import o.ActivityHandler49;
import o.ActivityHandler52;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicantRepository {
    private static int read = 0;
    private static int write = 1;
    public final ActivityHandler52 serializer;

    public ApplicantRepository(ActivityHandler52 activityHandler52) {
        activityHandler52.getClass();
        this.serializer = activityHandler52;
    }

    public final Object IconCompatParcelizer(ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 15;
        read = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        ActivityHandler52 activityHandler52 = this.serializer;
        ActivityHandler49 activityHandler49 = (ActivityHandler49) activityHandler52.write.get();
        if (activityHandler49 != null) {
            return activityHandler49;
        }
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ApplicantDataSource$load$2(activityHandler52, shortNewsContentCardView, 0), continuationImpl);
        int i3 = write + 69;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objWithContext;
    }

    public final Object storeApplicantData(ActivityHandler45 activityHandler45, ContinuationImpl continuationImpl) throws Throwable {
        int i = 2 % 2;
        ActivityHandler52 activityHandler52 = this.serializer;
        isOpenInternalroom_runtime isopeninternalroom_runtime = activityHandler52.serializer;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PhotoIdUiModelImpl$1$1(activityHandler52, activityHandler45, null, 12), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objWithContext == coroutineSingletons) {
            int i2 = read + 7;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            objWithContext = createfromparcel;
        }
        if (objWithContext != coroutineSingletons) {
            return createfromparcel;
        }
        int i4 = read + 25;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return objWithContext;
    }
}

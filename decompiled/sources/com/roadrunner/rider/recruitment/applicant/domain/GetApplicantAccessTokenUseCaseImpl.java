package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ActivityHandler49;
import o.ActivityHandler50;
import o.isFirstLaunch;

/* JADX INFO: loaded from: classes3.dex */
public final class GetApplicantAccessTokenUseCaseImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final ApplicantRepository serializer;

    public GetApplicantAccessTokenUseCaseImpl(ApplicantRepository applicantRepository) {
        this.serializer = applicantRepository;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        isFirstLaunch isfirstlaunch;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = continuationImpl instanceof isFirstLaunch;
            obj.hashCode();
            throw null;
        }
        if (continuationImpl instanceof isFirstLaunch) {
            isfirstlaunch = (isFirstLaunch) continuationImpl;
            int i3 = isfirstlaunch.write;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                isfirstlaunch.write = i3 - Integer.MIN_VALUE;
            } else {
                isfirstlaunch = new isFirstLaunch(this, continuationImpl);
                int i4 = RemoteActionCompatParcelizer + 91;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } else {
            isfirstlaunch = new isFirstLaunch(this, continuationImpl);
            int i6 = RemoteActionCompatParcelizer + 91;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        Object objIconCompatParcelizer = isfirstlaunch.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = isfirstlaunch.write;
        if (i8 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
            isfirstlaunch.write = 1;
            objIconCompatParcelizer = this.serializer.IconCompatParcelizer(isfirstlaunch);
            if (objIconCompatParcelizer == coroutineSingletons) {
                int i9 = RemoteActionCompatParcelizer + 23;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = write + 107;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(objIconCompatParcelizer);
        }
        ActivityHandler49 activityHandler49 = (ActivityHandler49) objIconCompatParcelizer;
        if (!(activityHandler49 instanceof ActivityHandler50)) {
            int i13 = write + 71;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            return null;
        }
        String str = ((ActivityHandler50) activityHandler49).IconCompatParcelizer.accessToken;
        int i15 = RemoteActionCompatParcelizer + 125;
        write = i15 % Fields.SpotShadowColor;
        if (i15 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }
}

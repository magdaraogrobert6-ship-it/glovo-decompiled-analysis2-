package com.roadrunner.rider.recruitment.applicant.domain;

import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository;
import o.boundingRectInRoot;
import o.setConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class SetApplicantIdUseCaseImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final ApplicantRepository IconCompatParcelizer;
    public final AppEventInfoChangeHandler RemoteActionCompatParcelizer;
    public final boundingRectInRoot read;
    public final setConfig write;

    public SetApplicantIdUseCaseImpl(AppEventInfoChangeHandler appEventInfoChangeHandler, ApplicantRepository applicantRepository, boundingRectInRoot boundingrectinroot, setConfig setconfig) {
        this.RemoteActionCompatParcelizer = appEventInfoChangeHandler;
        this.IconCompatParcelizer = applicantRepository;
        this.read = boundingrectinroot;
        this.write = setconfig;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r10 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r10 instanceof o.ActivityKind
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L21
            int r1 = com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.serializer
            int r1 = r1 + 25
            int r3 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.MediaBrowserCompatMediaItem = r3
            int r1 = r1 % r0
            r1 = r10
            o.ActivityKind r1 = (o.ActivityKind) r1
            int r3 = r1.read
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L21
            int r3 = r3 + r4
            r1.read = r3
            goto L26
        L21:
            o.ActivityKind r1 = new o.ActivityKind
            r1.<init>(r9, r10)
        L26:
            java.lang.Object r10 = r1.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.read
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            r6 = 0
            if (r4 == 0) goto L4c
            if (r4 == r2) goto L48
            if (r4 != r0) goto L42
            int r1 = com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.serializer
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            return r5
        L42:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r10)
            return r6
        L48:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            goto L5a
        L4c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r10)
            r1.read = r2
            com.roadrunner.rider.recruitment.applicant.data.ApplicantRepository r10 = r9.IconCompatParcelizer
            java.lang.Object r10 = r10.IconCompatParcelizer(r1)
            if (r10 != r3) goto L5a
            goto Lb0
        L5a:
            o.ActivityHandler49 r10 = (o.ActivityHandler49) r10
            boolean r2 = r10 instanceof o.ActivityHandler5
            if (r2 == 0) goto L61
            goto Lba
        L61:
            r10.getClass()
            o.ActivityHandler50 r10 = (o.ActivityHandler50) r10
            o.ActivityHandler45 r10 = r10.IconCompatParcelizer
            java.lang.String r10 = r10.userId
            java.lang.String r10 = java.lang.String.valueOf(r10)
            o.boundingRectInRoot r2 = r9.read
            o.metaMarkUpdatedAndHasCallbacks r2 = r2.write()
            java.lang.String r2 = r2.countryCode
            o.setConfig r4 = r9.write
            o.setMaxElementsWrap r4 = r4.read
            o.setPaddingLeft r4 = r4.write
            o.isAdapterPositionOnScreen r4 = r4.serializer
            java.lang.Object r4 = r4.MediaSessionCompatResultReceiverWrapper()
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            o.ExecutableQueryexecuteAsOneOrNull1 r7 = new o.ExecutableQueryexecuteAsOneOrNull1
            r7.<init>(r10, r2, r4)
            r1.read = r0
            com.roadrunner.logger.info.AppEventInfoChangeHandler r10 = r9.RemoteActionCompatParcelizer
            o.getAllSemanticsNodesToMap r2 = r10.MediaMetadataCompat
            com.roadrunner.auth.data.AuthRepository$logoutUser$2 r4 = new com.roadrunner.auth.data.AuthRepository$logoutUser$2
            r8 = 19
            r4.<init>(r10, r7, r6, r8)
            com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit r2 = (com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit) r2
            java.lang.String r10 = "asti_app_event_update_user_properties"
            java.lang.Object r10 = r2.ofSuspend(r10, r4, r1)
            if (r10 != r3) goto Lad
            int r1 = com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.MediaBrowserCompatMediaItem
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.serializer = r2
            int r1 = r1 % r0
            goto Lae
        Lad:
            r10 = r5
        Lae:
            if (r10 != r3) goto Lba
        Lb0:
            int r10 = com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.MediaBrowserCompatMediaItem
            int r10 = r10 + 71
            int r1 = r10 % 128
            com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.serializer = r1
            int r10 = r10 % r0
            return r3
        Lba:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

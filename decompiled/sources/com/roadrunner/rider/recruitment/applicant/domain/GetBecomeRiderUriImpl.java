package com.roadrunner.rider.recruitment.applicant.domain;

import o.RectManager;
import o.isDisabled;
import o.readObject;

/* JADX INFO: loaded from: classes3.dex */
public final class GetBecomeRiderUriImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final AddRiderHiringQueryParamsImpl IconCompatParcelizer;
    public final readObject serializer;
    public final RectManager write;

    public GetBecomeRiderUriImpl(RectManager rectManager, AddRiderHiringQueryParamsImpl addRiderHiringQueryParamsImpl, readObject readobject, isDisabled isdisabled, isDisabled isdisabled2) {
        this.write = rectManager;
        this.IconCompatParcelizer = addRiderHiringQueryParamsImpl;
        this.serializer = readobject;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if (r9 == r3) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable invoke(kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.read
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto Lc1
            boolean r1 = r9 instanceof o.hasPreinstallBeenRead
            if (r1 == 0) goto L22
            r1 = r9
            o.hasPreinstallBeenRead r1 = (o.hasPreinstallBeenRead) r1
            int r3 = r1.write
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L22
            int r3 = r3 + r4
            r1.write = r3
            goto L27
        L22:
            o.hasPreinstallBeenRead r1 = new o.hasPreinstallBeenRead
            r1.<init>(r8, r9)
        L27:
            java.lang.Object r9 = r1.IconCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.write
            r5 = 1
            if (r4 == 0) goto L50
            int r6 = com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.read
            int r6 = r6 + 61
            int r7 = r6 % 128
            com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.RemoteActionCompatParcelizer = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L3e
            if (r4 == 0) goto L4c
            goto L40
        L3e:
            if (r4 == r5) goto L4c
        L40:
            if (r4 != r0) goto L46
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L9a
        L46:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r9)
            return r2
        L4c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L6a
        L50:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            r1.write = r5
            o.readObject r9 = r8.serializer
            o.ActivityPackage r9 = r9.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultScheduler r4 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultIoScheduler r4 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer
            com.roadrunner.rider.recruitment.data.ApplicationUrlRepository$getApplicationUrl$2 r5 = new com.roadrunner.rider.recruitment.data.ApplicationUrlRepository$getApplicationUrl$2
            r6 = 0
            r5.<init>(r9, r2, r6)
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r9 != r3) goto L6a
            goto L8d
        L6a:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L83
            o.RectManager r9 = r8.write
            o.metaMarkUpdatedAndHasCallbacks r9 = r9.serializer()
            if (r9 == 0) goto L79
            java.lang.String r9 = r9.registerUrl
            goto L7a
        L79:
            r9 = r2
        L7a:
            if (r9 == 0) goto L7d
            goto L83
        L7d:
            java.lang.String r9 = "At this point, the country config url should be available, for better understanding, please check the implementation of ShouldNavigateToRecruitmentScreen"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r9)
            return r2
        L83:
            r1.write = r0
            com.roadrunner.rider.recruitment.applicant.domain.AddRiderHiringQueryParamsImpl r4 = r8.IconCompatParcelizer
            java.lang.Object r9 = r4.invoke(r9, r1)
            if (r9 != r3) goto L9a
        L8d:
            int r9 = com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.read
            int r9 = r9 + 27
            int r1 = r9 % 128
            com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.RemoteActionCompatParcelizer = r1
            int r9 = r9 % r0
            if (r9 == 0) goto L99
            return r3
        L99:
            throw r2
        L9a:
            java.lang.String r9 = (java.lang.String) r9
            r9.getClass()
            java.lang.String r1 = "roadrunner://rider_hiring/applicant?action=OPEN&link="
            java.lang.String r9 = r1.concat(r9)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.net.Uri$Builder r9 = r9.buildUpon()
            r9.getClass()
            android.net.Uri r9 = r9.build()
            r9.getClass()
            int r1 = com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.RemoteActionCompatParcelizer
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.read = r2
            int r1 = r1 % r0
            return r9
        Lc1:
            boolean r9 = r9 instanceof o.hasPreinstallBeenRead
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl.invoke(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Comparable");
    }
}

package com.roadrunner.rider.recruitment.applicant.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ActivityHandler52;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicantDataSource$load$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ ActivityHandler52 IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplicantDataSource$load$2(ActivityHandler52 activityHandler52, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = activityHandler52;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        if (this.serializer != 0) {
            ApplicantDataSource$load$2 applicantDataSource$load$2 = new ApplicantDataSource$load$2(this.IconCompatParcelizer, shortNewsContentCardView, 1);
            int i2 = RemoteActionCompatParcelizer + 1;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return applicantDataSource$load$2;
        }
        ApplicantDataSource$load$2 applicantDataSource$load$3 = new ApplicantDataSource$load$2(this.IconCompatParcelizer, shortNewsContentCardView, 0);
        int i4 = RemoteActionCompatParcelizer + 5;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return applicantDataSource$load$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            ((ApplicantDataSource$load$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            return createfromparcel2;
        }
        Object objInvokeSuspend = ((ApplicantDataSource$load$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = read + 37;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return o.createFromParcel.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
        r7 = ((android.content.SharedPreferences) r4.RemoteActionCompatParcelizer.write()).getString("APPLICANT_SHARED_PREF_AUTH_DATA", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r1 = com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.read + 47;
        com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        r1 = o.resetTransientState.read;
        r1.getClass();
        r3 = (o.ActivityHandler45) r1.serializer(r7, o.ActivityHandler45.Companion.serializer());
        r7 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r1 = o.resetTransientState.read;
        r1.getClass();
        r3 = (o.ActivityHandler45) r1.serializer(r7, o.ActivityHandler45.Companion.serializer());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        r7 = o.ActivityHandler5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        r7 = new o.ActivityHandler50(r3);
        r1 = com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.RemoteActionCompatParcelizer + 69;
        com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        r4.write.set(r7);
        r1 = com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.read + 107;
        com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
        r4.write.set(null);
        r7 = r4.RemoteActionCompatParcelizer.write();
        r7.getClass();
        r7 = ((android.content.SharedPreferences) r7).edit();
        r7.remove("APPLICANT_SHARED_PREF_AUTH_DATA");
        r7.apply();
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.RemoteActionCompatParcelizer
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.read = r2
            int r1 = r1 % r0
            java.lang.String r2 = "APPLICANT_SHARED_PREF_AUTH_DATA"
            r3 = 0
            if (r1 == 0) goto L1c
            int r1 = r6.serializer
            o.ActivityHandler52 r4 = r6.IconCompatParcelizer
            r5 = 11
            int r5 = r5 / 0
            if (r1 == 0) goto L44
            goto L22
        L1c:
            int r1 = r6.serializer
            o.ActivityHandler52 r4 = r6.IconCompatParcelizer
            if (r1 == 0) goto L44
        L22:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r4.write
            r7.set(r3)
            dagger.Lazy r7 = r4.RemoteActionCompatParcelizer
            java.lang.Object r7 = r7.write()
            r7.getClass()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r7.remove(r2)
            r7.apply()
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        L44:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            dagger.Lazy r7 = r4.RemoteActionCompatParcelizer
            java.lang.Object r7 = r7.write()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r7 = r7.getString(r2, r3)
            if (r7 == 0) goto L91
            int r1 = com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.read
            int r1 = r1 + 47
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L7c
            o.isVerticalSwipeInAllowedDirection r1 = o.resetTransientState.read
            r1.getClass()
            com.roadrunner.rider.recruitment.api.applicant.model.ApplicantData$Companion r2 = o.ActivityHandler45.Companion
            o.setGraphicModalMaxWidthDp r2 = r2.serializer()
            r3 = r2
            o.setGraphicModalMaxWidthDp r3 = (o.setGraphicModalMaxWidthDp) r3
            java.lang.Object r7 = r1.serializer(r7, r2)
            r3 = r7
            o.ActivityHandler45 r3 = (o.ActivityHandler45) r3
            r7 = 74
            int r7 = r7 / 0
            goto L91
        L7c:
            o.isVerticalSwipeInAllowedDirection r1 = o.resetTransientState.read
            r1.getClass()
            com.roadrunner.rider.recruitment.api.applicant.model.ApplicantData$Companion r2 = o.ActivityHandler45.Companion
            o.setGraphicModalMaxWidthDp r2 = r2.serializer()
            r3 = r2
            o.setGraphicModalMaxWidthDp r3 = (o.setGraphicModalMaxWidthDp) r3
            java.lang.Object r7 = r1.serializer(r7, r2)
            r3 = r7
            o.ActivityHandler45 r3 = (o.ActivityHandler45) r3
        L91:
            if (r3 != 0) goto L96
            o.ActivityHandler5 r7 = o.ActivityHandler5.write
            goto La4
        L96:
            o.ActivityHandler50 r7 = new o.ActivityHandler50
            r7.<init>(r3)
            int r1 = com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.RemoteActionCompatParcelizer
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.read = r2
            int r1 = r1 % r0
        La4:
            java.util.concurrent.atomic.AtomicReference r1 = r4.write
            r1.set(r7)
            int r1 = com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.read
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.applicant.data.ApplicantDataSource$load$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

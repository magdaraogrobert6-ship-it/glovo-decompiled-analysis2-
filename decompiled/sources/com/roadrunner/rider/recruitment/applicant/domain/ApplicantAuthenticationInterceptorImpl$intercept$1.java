package com.roadrunner.rider.recruitment.applicant.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ActivityHandler6;
import o.InAppMessageModalView;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicantAuthenticationInterceptorImpl$intercept$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public int MediaSessionCompatQueueItem;
    public Object RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public Object read;
    public String serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicantAuthenticationInterceptorImpl$intercept$1(TurnByTurnNavigationLogger turnByTurnNavigationLogger, boolean z, String str, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RatingCompat = turnByTurnNavigationLogger;
        this.RemoteActionCompatParcelizer = z;
        this.write = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicantAuthenticationInterceptorImpl$intercept$1(TurnByTurnNavigationLogger turnByTurnNavigationLogger, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = turnByTurnNavigationLogger;
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicantAuthenticationInterceptorImpl$intercept$1(ActivityHandler6 activityHandler6, InAppMessageModalView inAppMessageModalView, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RatingCompat = activityHandler6;
        this.write = inAppMessageModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj2 = this.write;
        if (i4 != 0) {
            return i4 != 1 ? new ApplicantAuthenticationInterceptorImpl$intercept$1((TurnByTurnNavigationLogger) this.RatingCompat, this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView) : new ApplicantAuthenticationInterceptorImpl$intercept$1((TurnByTurnNavigationLogger) obj2, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        }
        ApplicantAuthenticationInterceptorImpl$intercept$1 applicantAuthenticationInterceptorImpl$intercept$1 = new ApplicantAuthenticationInterceptorImpl$intercept$1((ActivityHandler6) this.RatingCompat, (InAppMessageModalView) obj2, shortNewsContentCardView);
        int i5 = MediaBrowserCompatMediaItem + 93;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return applicantAuthenticationInterceptorImpl$intercept$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return i3 != 1 ? ((ApplicantAuthenticationInterceptorImpl$intercept$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((ApplicantAuthenticationInterceptorImpl$intercept$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((ApplicantAuthenticationInterceptorImpl$intercept$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaMetadataCompat + 121;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01b0 A[PHI: r4
  0x01b0: PHI (r4v2 boolean) = (r4v3 boolean), (r4v3 boolean), (r4v4 boolean), (r4v4 boolean), (r4v4 boolean) binds: [B:66:0x0189, B:67:0x018b, B:58:0x0168, B:59:0x016a, B:61:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0182, code lost:
    
        if (r14 == r2) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.recruitment.applicant.domain.ApplicantAuthenticationInterceptorImpl$intercept$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

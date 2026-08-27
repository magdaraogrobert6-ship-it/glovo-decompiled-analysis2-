package o;

import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ApplicantAuthenticationInterceptorImpl$intercept$1;
import com.roadrunner.rider.recruitment.applicant.domain.ApplicantRefreshAccessTokenUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantAccessTokenUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantTokenExpiryUseCaseImpl;
import dagger.Lazy;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler6 implements getShortEdge {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final AnalyticsServiceImpl IconCompatParcelizer;
    public final a9 MediaMetadataCompat;
    public final GetApplicantTokenExpiryUseCaseImpl RemoteActionCompatParcelizer;
    public final ApplicantRefreshAccessTokenUseCaseImpl read;
    public final Lazy serializer;
    public final GetApplicantAccessTokenUseCaseImpl write;

    public ActivityHandler6(GetApplicantAccessTokenUseCaseImpl getApplicantAccessTokenUseCaseImpl, Lazy lazy, GetApplicantTokenExpiryUseCaseImpl getApplicantTokenExpiryUseCaseImpl, ApplicantRefreshAccessTokenUseCaseImpl applicantRefreshAccessTokenUseCaseImpl, a9 a9Var, AnalyticsServiceImpl analyticsServiceImpl) {
        this.write = getApplicantAccessTokenUseCaseImpl;
        this.serializer = lazy;
        this.RemoteActionCompatParcelizer = getApplicantTokenExpiryUseCaseImpl;
        this.read = applicantRefreshAccessTokenUseCaseImpl;
        this.MediaMetadataCompat = a9Var;
        this.IconCompatParcelizer = analyticsServiceImpl;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        _get_messageWebView_lambda1 _get_messagewebview_lambda1 = (_get_messageWebView_lambda1) BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new ApplicantAuthenticationInterceptorImpl$intercept$1(this, (InAppMessageModalView) getmessageheadertextview, (ShortNewsContentCardView) null));
        int i2 = MediaBrowserCompatMediaItem + 9;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return _get_messagewebview_lambda1;
    }
}

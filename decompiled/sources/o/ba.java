package o;

import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase;
import com.roadrunner.login.legacy.data.LoginStorageManager;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ba implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatToken = 1;
    private static int RatingCompat;
    public final getColorIntegerOrNulllambda0 IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final getColorIntegerOrNulllambda0 MediaSessionCompatQueueItem;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public ba(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, isHiddenannotations ishiddenannotations, SimpleExecutableQuery simpleExecutableQuery, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, executeQuery executequery, mergeJsonObjects mergejsonobjects3, onCapabilitiesChanged oncapabilitieschanged) {
        this.RemoteActionCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.MediaSessionCompatQueueItem = ishiddenannotations;
        this.MediaBrowserCompatMediaItem = simpleExecutableQuery;
        this.MediaDescriptionCompat = mergejsonobjects;
        this.MediaMetadataCompat = mergejsonobjects2;
        this.IconCompatParcelizer = executequery;
        this.serializer = mergejsonobjects3;
        this.write = oncapabilitieschanged;
    }

    public ba(AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, PreferenceGroupAdapter preferenceGroupAdapter, applyLayoutFeatures applylayoutfeatures, applyLayoutFeatures applylayoutfeatures2, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, mergeJsonObjects mergejsonobjects, acquire acquireVar, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo) {
        this.MediaMetadataCompat = androidIndirectPointerEvent_androidKt;
        this.serializer = preferenceGroupAdapter;
        this.write = applylayoutfeatures;
        this.MediaSessionCompatQueueItem = applylayoutfeatures2;
        this.RemoteActionCompatParcelizer = requestsinglelocationupdatelambda1;
        this.MediaBrowserCompatMediaItem = mergejsonobjects;
        this.IconCompatParcelizer = acquireVar;
        this.MediaDescriptionCompat = r8lambdazphrebez5dkhsk62azggxj52jpo;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 37;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        mergeJsonObjects mergejsonobjects = this.MediaDescriptionCompat;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects2 = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects3 = this.RemoteActionCompatParcelizer;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda1 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects4 = this.write;
        mergeJsonObjects mergejsonobjects5 = this.serializer;
        mergeJsonObjects mergejsonobjects6 = this.MediaMetadataCompat;
        if (i4 == 0) {
            return new OtpViewModel((CountDownTimerUiModel) mergejsonobjects3.write(), (androidx.lifecycle.BlockRunner) ((isHiddenannotations) getcolorintegerornulllambda1).write(), (LoginStorageManager) mergejsonobjects2.write(), (setTransactionSuccessful) mergejsonobjects.write(), (transferSessionPackageI) mergejsonobjects6.write(), (OtpLogger) ((executeQuery) getcolorintegerornulllambda0).write(), (ForgotPasswordPersistedTimerManager) mergejsonobjects5.write(), (getBindingAdapter) mergejsonobjects4.write(), new getQueryContext());
        }
        notifyFocusedRect notifyfocusedrect = new notifyFocusedRect(new getQueryContext(), (Parser.Pair) ((AndroidIndirectPointerEvent_androidKt) mergejsonobjects6).write(), (Vw$Vw) ((PreferenceGroupAdapter) mergejsonobjects5).write(), (ReportPictureUseCase) ((applyLayoutFeatures) mergejsonobjects4).write(), (ReportPictureUseCase) ((applyLayoutFeatures) getcolorintegerornulllambda1).write(), (UpdateStateUseCaseImpl) mergejsonobjects3.write(), (setTransactionSuccessful) mergejsonobjects2.write(), new com.huawei.wisesecurity.ucs_credential.n0(0), (getDoneeUduSuo) ((acquire) getcolorintegerornulllambda0).write(), (hasFlag) mergejsonobjects.write());
        int i5 = MediaSessionCompatToken + 49;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return notifyfocusedrect;
    }
}

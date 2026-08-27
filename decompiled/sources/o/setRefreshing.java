package o;

import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.declinebutton.domain.AcceptOrderClickEventRetriever;
import com.roadrunner.delivery.accept.declinebutton.domain.DeclineOrderClickEventRetriever;
import com.roadrunner.delivery.accept.domain.AcceptDeliveriesUseCaseImpl;
import com.roadrunner.delivery.accept.domain.DeclineDeliveriesUseCaseImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.liveness.recording.domain.LogUnexpectedLivenessError;
import com.roadrunner.liveness.recording.domain.livenessimage.ImageCaptureUseCaseImpl;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;

/* JADX INFO: loaded from: classes3.dex */
public final class setRefreshing implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final getColorIntegerOrNulllambda0 MediaSessionCompatQueueItem;
    public final getColorIntegerOrNulllambda0 ParcelableVolumeInfo;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public setRefreshing(getFailureMessage getfailuremessage, executeQuery executequery, lambda31 lambda31Var, readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery, isHiddenannotations ishiddenannotations, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, newTransaction newtransaction, mergeJsonObjects mergejsonobjects3, executeQuery executequery2) {
        this.IconCompatParcelizer = 2;
        this.MediaMetadataCompat = getfailuremessage;
        this.RemoteActionCompatParcelizer = executequery;
        this.MediaBrowserCompatMediaItem = lambda31Var;
        this.ParcelableVolumeInfo = readinstallreferrerhuaweiappgallery;
        this.MediaSessionCompatQueueItem = ishiddenannotations;
        this.read = mergejsonobjects;
        this.write = mergejsonobjects2;
        this.serializer = newtransaction;
        this.RatingCompat = mergejsonobjects3;
        this.MediaDescriptionCompat = executequery2;
    }

    public /* synthetic */ setRefreshing(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, getColorIntegerOrNulllambda0 getcolorintegerornulllambda3, getColorIntegerOrNulllambda0 getcolorintegerornulllambda4, getColorIntegerOrNulllambda0 getcolorintegerornulllambda5, getColorIntegerOrNulllambda0 getcolorintegerornulllambda6, getColorIntegerOrNulllambda0 getcolorintegerornulllambda7, getColorIntegerOrNulllambda0 getcolorintegerornulllambda8, mergeJsonObjects mergejsonobjects, int i) {
        this.IconCompatParcelizer = i;
        this.read = getcolorintegerornulllambda0;
        this.write = getcolorintegerornulllambda1;
        this.serializer = getcolorintegerornulllambda2;
        this.MediaMetadataCompat = getcolorintegerornulllambda3;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda4;
        this.MediaBrowserCompatMediaItem = getcolorintegerornulllambda5;
        this.ParcelableVolumeInfo = getcolorintegerornulllambda6;
        this.MediaSessionCompatQueueItem = getcolorintegerornulllambda7;
        this.RatingCompat = getcolorintegerornulllambda8;
        this.MediaDescriptionCompat = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 83;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects2 = this.RatingCompat;
        mergeJsonObjects mergejsonobjects3 = this.serializer;
        mergeJsonObjects mergejsonobjects4 = this.write;
        mergeJsonObjects mergejsonobjects5 = this.read;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.MediaSessionCompatQueueItem;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda1 = this.ParcelableVolumeInfo;
        mergeJsonObjects mergejsonobjects6 = this.MediaBrowserCompatMediaItem;
        mergeJsonObjects mergejsonobjects7 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects8 = this.MediaMetadataCompat;
        if (i4 != 0) {
            return i4 != 1 ? new C0180k((ag) ((getFailureMessage) mergejsonobjects8).write(), (OtpLogger) ((executeQuery) mergejsonobjects7).write(), (N$b) ((lambda31) mergejsonobjects6).write(), new BrazeExternalSyntheticLambda5(1), (GetAppStateImpl) ((readInstallReferrerHuaweiAppGallery) getcolorintegerornulllambda1).write(), (androidx.lifecycle.BlockRunner) ((isHiddenannotations) getcolorintegerornulllambda0).write(), new stopInstancelambda11(2), (transferSessionPackageI) mergejsonobjects5.write(), (setTransactionSuccessful) mergejsonobjects4.write(), (QueryResultCompanion) mergejsonobjects3.write(), (ForgotPasswordPersistedTimerManager) mergejsonobjects2.write(), (unpackInt2) ((executeQuery) mergejsonobjects).write(), new getQueryContext()) : new BoringLayoutFactory33ExternalSyntheticApiModelOutline0(new SharedResourcePool(24), (hasSameLayoutAffectingAttributes) mergejsonobjects5.write(), (AcceptDeliveriesUseCaseImpl) mergejsonobjects4.write(), (UpdateStateUseCaseImpl) mergejsonobjects3.write(), (DeclineDeliveriesUseCaseImpl) mergejsonobjects8.write(), (FontVariationSettingTextUnit) mergejsonobjects7.write(), (DeliveryAcceptanceLogger) mergejsonobjects6.write(), (DeclineOrderClickEventRetriever) ((AndroidIndirectPointerEvent_androidKt) getcolorintegerornulllambda1).write(), (AcceptOrderClickEventRetriever) ((AndroidIndirectPointerEvent_androidKt) getcolorintegerornulllambda0).write(), new com.huawei.wisesecurity.ucs_credential.g0(0), (BackToBackOrdersDataRepositoryImpl) mergejsonobjects2.write(), (DeliveryErrorProviderImpl) mergejsonobjects.write());
        }
        RecordingViewModel recordingViewModel = new RecordingViewModel((onAnimationStart) mergejsonobjects5.write(), (ImageCaptureUseCaseImpl) mergejsonobjects4.write(), (setBackgroundColor) mergejsonobjects3.write(), (setDistanceToTriggerSync) ((executeQuery) mergejsonobjects8).write(), (LogUnexpectedLivenessError) ((onAnimationCancel) mergejsonobjects7).write(), (BrazeExternalSyntheticLambda28) ((executeQuery) mergejsonobjects6).write(), (BrazeExternalSyntheticLambda28) ((executeQuery) getcolorintegerornulllambda1).write(), new BrazeCompanionExternalSyntheticLambda21(1), (BrazeExternalSyntheticLambda28) ((executeQuery) getcolorintegerornulllambda0).write(), (LogUnexpectedLivenessError) ((onAnimationCancel) mergejsonobjects2).write(), (OtpLogger) ((executeQuery) mergejsonobjects).write(), new getQueryContext());
        int i5 = MediaSessionCompatResultReceiverWrapper + 15;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return recordingViewModel;
    }
}

package com.roadrunner.liveness.failure.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.ViewModel;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import com.roadrunner.liveness.api.recording.CameraImage;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.FlowUtilcreateFlowinlinedmap1;
import o.RoomDatabaseExternalSyntheticLambda2;
import o.RoomDatabaseperformClear11;
import o.accessnotifyInvalidation;
import o.accessstopTrackingTable;
import o.generatePOSTBodyString;
import o.getBitmapui_graphics;
import o.getQueryContext;
import o.getUseEvaluationsCachefwf_client_release;
import o.onUpgrade;
import o.setDistanceToTriggerSync;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FailureViewModel extends ViewModel {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final accessnotifyInvalidation IconCompatParcelizer;
    public final OtpLogger MediaBrowserCompatMediaItem;
    public final RoomDatabaseExternalSyntheticLambda2 MediaDescriptionCompat;
    public final generatePOSTBodyString MediaMetadataCompat;
    public final NetworkErrorMapperImpl MediaSessionCompatQueueItem;
    public final StateFlow ParcelableVolumeInfo;
    public final BlockRunner PlaybackStateCompat;
    public final getUseEvaluationsCachefwf_client_release RatingCompat;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final RoomDatabaseperformClear11 read;
    public final CompleteIdentityVerificationUseCaseImpl serializer;
    public final MutableStateFlow write;

    /* JADX WARN: Code duplicated, block: B:23:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:26:0x0114  */
    /* JADX WARN: Code duplicated, block: B:27:0x011c  */
    /* JADX WARN: Code duplicated, block: B:30:0x012f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0133  */
    /* JADX WARN: Code duplicated, block: B:33:0x0137  */
    /* JADX WARN: Code duplicated, block: B:34:0x013b  */
    /* JADX WARN: Code duplicated, block: B:35:0x013f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0143  */
    /* JADX WARN: Code duplicated, block: B:38:0x014e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0152  */
    /* JADX WARN: Code duplicated, block: B:41:0x0157  */
    public FailureViewModel(RoomDatabaseperformClear11 roomDatabaseperformClear11, RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2, getBitmapui_graphics getbitmapui_graphics, boolean z, setDistanceToTriggerSync setdistancetotriggersync, onUpgrade onupgrade, setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei, BlockRunner blockRunner, OtpLogger otpLogger, getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release, NetworkErrorMapperImpl networkErrorMapperImpl, CompleteIdentityVerificationUseCaseImpl completeIdentityVerificationUseCaseImpl, getQueryContext getquerycontext) {
        String strIconCompatParcelizer;
        int i;
        int i2;
        setdistancetotriggersync.getClass();
        onupgrade.getClass();
        settransactionsuccessful.getClass();
        transfersessionpackagei.getClass();
        blockRunner.getClass();
        otpLogger.getClass();
        getuseevaluationscachefwf_client_release.getClass();
        networkErrorMapperImpl.getClass();
        completeIdentityVerificationUseCaseImpl.getClass();
        getquerycontext.getClass();
        this.read = roomDatabaseperformClear11;
        this.MediaDescriptionCompat = roomDatabaseExternalSyntheticLambda2;
        this.PlaybackStateCompat = blockRunner;
        this.MediaBrowserCompatMediaItem = otpLogger;
        this.RatingCompat = getuseevaluationscachefwf_client_release;
        this.MediaSessionCompatQueueItem = networkErrorMapperImpl;
        this.serializer = completeIdentityVerificationUseCaseImpl;
        this.RemoteActionCompatParcelizer = getquerycontext;
        CameraImage cameraImageRemoteActionCompatParcelizer = setdistancetotriggersync.IconCompatParcelizer.RemoteActionCompatParcelizer();
        Object obj = null;
        if (cameraImageRemoteActionCompatParcelizer != null ? cameraImageRemoteActionCompatParcelizer.IconCompatParcelizer : false) {
            CameraImage cameraImageRemoteActionCompatParcelizer2 = onupgrade.RemoteActionCompatParcelizer();
            if (cameraImageRemoteActionCompatParcelizer2 != null) {
                getbitmapui_graphics.RemoteActionCompatParcelizer("liveness_camera_image", cameraImageRemoteActionCompatParcelizer2);
            } else {
                Timber.RemoteActionCompatParcelizer.write(new Throwable("Camera Image value not available when fetching from the repository."));
            }
            this.IconCompatParcelizer = new accessnotifyInvalidation(settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_title), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_description), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_button), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_reasons));
            this.MediaMetadataCompat = new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_description), null, null, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_tertiary_action_button), 76, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_warning_action_button));
            String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_failure_button_retry);
            if (z) {
                int i3 = MediaSessionCompatToken + 87;
                PlaybackStateCompatCustomAction = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_LIVENESS_PROCEED_ANYWAY_BUTTON_DISABLED)) {
                    strIconCompatParcelizer = null;
                } else {
                    strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_failure_button_proceed);
                }
            } else {
                strIconCompatParcelizer = null;
            }
            String strIconCompatParcelizer3 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_failure_title);
            switch (FlowUtilcreateFlowinlinedmap1.IconCompatParcelizer[roomDatabaseperformClear11.ordinal()]) {
                case 1:
                    int i5 = 2 % 2;
                    i = R.string.liveness_fail_reason_no_face;
                    break;
                case 2:
                    i2 = PlaybackStateCompatCustomAction + 33;
                    MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i6 = 5 / 4;
                    } else {
                        int i7 = 2 % 2;
                    }
                    i = R.string.liveness_fail_reason_multiple_faces;
                    break;
                case 3:
                    i = R.string.liveness_fail_reason_camera_error;
                    break;
                case 4:
                    i = R.string.liveness_fail_reason_face_detection_library_error;
                    break;
                case 5:
                    i = R.string.liveness_fail_reason_timer_passed;
                    break;
                case 6:
                    i = R.string.liveness_fail_reason_max_wrong_movement_made;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    throw null;
            }
            MutableStateFlow mutableStateFlow = StateFlowKt.read(new accessstopTrackingTable(strIconCompatParcelizer2, strIconCompatParcelizer, strIconCompatParcelizer3, settransactionsuccessful.IconCompatParcelizer(i), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_title), null, null));
            this.write = mutableStateFlow;
            this.ParcelableVolumeInfo = mutableStateFlow;
        }
        CameraImage cameraImage = (CameraImage) getbitmapui_graphics.write("liveness_camera_image");
        if (cameraImage != null) {
            int i8 = MediaSessionCompatToken + 83;
            PlaybackStateCompatCustomAction = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                Timber.RemoteActionCompatParcelizer.getClass();
                onupgrade.serializer = cameraImage;
                obj.hashCode();
                throw null;
            }
            Timber.RemoteActionCompatParcelizer.getClass();
            onupgrade.serializer = cameraImage;
        } else {
            Timber.RemoteActionCompatParcelizer.write(new Throwable("Camera Image value not available when storing the image in repository."));
        }
        int i9 = 2 % 2;
        this.IconCompatParcelizer = new accessnotifyInvalidation(settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_title), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_description), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_button), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_reasons));
        this.MediaMetadataCompat = new generatePOSTBodyString(settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_title), false, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_description), null, null, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_tertiary_action_button), 76, settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_force_proceed_warning_action_button));
        String strIconCompatParcelizer4 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_failure_button_retry);
        if (z) {
            int i10 = MediaSessionCompatToken + 87;
            PlaybackStateCompatCustomAction = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_LIVENESS_PROCEED_ANYWAY_BUTTON_DISABLED)) {
                strIconCompatParcelizer = null;
            } else {
                strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_failure_button_proceed);
            }
        } else {
            strIconCompatParcelizer = null;
        }
        String strIconCompatParcelizer5 = settransactionsuccessful.IconCompatParcelizer(R.string.liveness_detection_failure_title);
        switch (FlowUtilcreateFlowinlinedmap1.IconCompatParcelizer[roomDatabaseperformClear11.ordinal()]) {
            case 1:
                int i12 = 2 % 2;
                i = R.string.liveness_fail_reason_no_face;
                break;
            case 2:
                i2 = PlaybackStateCompatCustomAction + 33;
                MediaSessionCompatToken = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i13 = 5 / 4;
                } else {
                    int i14 = 2 % 2;
                }
                i = R.string.liveness_fail_reason_multiple_faces;
                break;
            case 3:
                i = R.string.liveness_fail_reason_camera_error;
                break;
            case 4:
                i = R.string.liveness_fail_reason_face_detection_library_error;
                break;
            case 5:
                i = R.string.liveness_fail_reason_timer_passed;
                break;
            case 6:
                i = R.string.liveness_fail_reason_max_wrong_movement_made;
                break;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
        }
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(new accessstopTrackingTable(strIconCompatParcelizer4, strIconCompatParcelizer, strIconCompatParcelizer5, settransactionsuccessful.IconCompatParcelizer(i), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_fail_popup_title), null, null));
        this.write = mutableStateFlow2;
        this.ParcelableVolumeInfo = mutableStateFlow2;
    }
}

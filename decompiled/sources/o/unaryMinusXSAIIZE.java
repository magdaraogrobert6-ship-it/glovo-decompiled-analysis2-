package o;

import android.net.Uri;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.delivery.pickupdropoff.tasks.takepicture.model.InAppCameraWithTagsArgs;
import com.roadrunner.face.verification.domain.ImageCaptureUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class unaryMinusXSAIIZE extends androidx.lifecycle.ViewModel {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public final GetTaskByTypeAndIdUseCaseImpl IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 MediaBrowserCompatMediaItem;
    public setNavigationOnClickListener MediaDescriptionCompat;
    public final setNavigationOnClickListener MediaMetadataCompat;
    public final getQueryContext MediaSessionCompatQueueItem;
    public final com.huawei.wisesecurity.ucs_credential.n0 MediaSessionCompatToken;
    public final roundToIntSizeuvyYCjk ParcelableVolumeInfo;
    public final getCenterozmzZPIannotations RatingCompat;
    public final com.huawei.wisesecurity.ucs_credential.g0 RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final MutableStateFlow serializer;
    public final transferSessionPackageI write;

    public unaryMinusXSAIIZE(roundToIntSizeuvyYCjk roundtointsizeuvyycjk, getCenterozmzZPIannotations getcenterozmzzpiannotations, transferSessionPackageI transfersessionpackagei, GetTaskByTypeAndIdUseCaseImpl getTaskByTypeAndIdUseCaseImpl, com.huawei.wisesecurity.ucs_credential.n0 n0Var, com.huawei.wisesecurity.ucs_credential.g0 g0Var, getQueryContext getquerycontext, ImageCaptureUseCaseImpl imageCaptureUseCaseImpl) {
        roundtointsizeuvyycjk.getClass();
        getcenterozmzzpiannotations.getClass();
        transfersessionpackagei.getClass();
        getTaskByTypeAndIdUseCaseImpl.getClass();
        n0Var.getClass();
        g0Var.getClass();
        getquerycontext.getClass();
        imageCaptureUseCaseImpl.getClass();
        this.ParcelableVolumeInfo = roundtointsizeuvyycjk;
        this.RatingCompat = getcenterozmzzpiannotations;
        this.write = transfersessionpackagei;
        this.IconCompatParcelizer = getTaskByTypeAndIdUseCaseImpl;
        this.MediaSessionCompatToken = n0Var;
        this.RemoteActionCompatParcelizer = g0Var;
        this.MediaSessionCompatQueueItem = getquerycontext;
        Uri uri = Uri.EMPTY;
        uri.getClass();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.MediaBrowserCompatMediaItem = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(new isEmimpl(uri, "", new LayoutDirection("", "", instance_delegatelambda0Var)));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new toIntRectozmzZPI(instance_delegatelambda0Var, instance_delegatelambda0Var));
        this.serializer = mutableStateFlow;
        this.read = mutableStateFlow;
        this.MediaMetadataCompat = (setNavigationOnClickListener) imageCaptureUseCaseImpl.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        this.MediaDescriptionCompat = new getCameraProvider(2).write();
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 83;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem.serializer(getRawTypeannotations.serializer);
        int i4 = PlaybackStateCompat + 35;
        PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    public final isEmimpl serializer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 93;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        isEmimpl isemimpl = (isEmimpl) this.MediaBrowserCompatMediaItem.getValue();
        int i3 = PlaybackStateCompatCustomAction + 99;
        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return isemimpl;
    }

    public final setNavigationOnClickListener write() {
        int i = 2 % 2;
        if (!RemoteActionCompatParcelizer()) {
            setNavigationOnClickListener setnavigationonclicklistener = this.MediaMetadataCompat;
            int i2 = PlaybackStateCompatCustomAction + 11;
            PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return setnavigationonclicklistener;
        }
        int i4 = PlaybackStateCompatCustomAction + 115;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return this.MediaDescriptionCompat;
        }
        int i5 = 26 / 0;
        return this.MediaDescriptionCompat;
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean zIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 93;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.write;
            firebaseRemoteConfigImpl.getClass();
            zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_TAKE_PICTURE_CAMERA_SECURITY_EXCEPTION_FIX_ENABLED);
            int i3 = 25 / 0;
        } else {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.write;
            firebaseRemoteConfigImpl2.getClass();
            zIconCompatParcelizer = firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_TAKE_PICTURE_CAMERA_SECURITY_EXCEPTION_FIX_ENABLED);
        }
        int i4 = PlaybackStateCompatCustomAction + 79;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zIconCompatParcelizer;
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        str.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new QrCodeScanTaskUiModelImpl$1(this, str, null, 28), 3);
        int i2 = PlaybackStateCompatCustomAction + 57;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void write(String str) {
        int i = 2 % 2;
        str.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new SwitcherUiModelImpl$1.AnonymousClass1(this, str, null, 29), 3);
        int i2 = PlaybackStateCompatCustomAction + 65;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
    }

    public final void write(Uri uri) {
        isEmimpl isemimplRemoteActionCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 41;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            uri.getClass();
            isemimplRemoteActionCompatParcelizer = isEmimpl.RemoteActionCompatParcelizer(serializer(), uri, null, null, 78);
            populateViewStructure_androidKtpopulate7 = this.MediaBrowserCompatMediaItem;
        } else {
            uri.getClass();
            isemimplRemoteActionCompatParcelizer = isEmimpl.RemoteActionCompatParcelizer(serializer(), uri, null, null, 6);
            populateViewStructure_androidKtpopulate7 = this.MediaBrowserCompatMediaItem;
        }
        ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(isemimplRemoteActionCompatParcelizer);
        int i3 = PlaybackStateCompat + 117;
        PlaybackStateCompatCustomAction = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void write(InAppCameraWithTagsArgs inAppCameraWithTagsArgs) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 23;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!((FirebaseRemoteConfigImpl) this.RatingCompat.IconCompatParcelizer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.TAKE_PICTURE_TASK_NEW_CAMERA_OVERLAY_KILL_SWITCH_ENABLED.getFirebaseFlagName())) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new QrCodeScanTaskUiModelImpl$1(this, inAppCameraWithTagsArgs, null, 27), 3);
        } else {
            int i4 = PlaybackStateCompat + 51;
            PlaybackStateCompatCustomAction = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}

package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import android.net.Uri;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.huawei.wisesecurity.ucs_credential.p0;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraArgs;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.face.verification.domain.ImageCaptureUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlinx.coroutines.BuildersKt;
import o.CursorAnchorInfoApi34Helper;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TypefaceResultAsync;
import o.getCameraProvider;
import o.getQueryContext;
import o.onShowTranslationui;
import o.setNavigationOnClickListener;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraWithTagsViewModel extends ViewModel {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final transferSessionPackageI IconCompatParcelizer;
    public final IsFixableByRetry MediaSessionCompatQueueItem;
    public final getQueryContext RatingCompat;
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final p0 read;
    public setNavigationOnClickListener serializer;
    public final setNavigationOnClickListener write;

    public InAppCameraWithTagsViewModel(transferSessionPackageI transfersessionpackagei, IsFixableByRetry isFixableByRetry, p0 p0Var, getQueryContext getquerycontext, ImageCaptureUseCaseImpl imageCaptureUseCaseImpl) {
        transfersessionpackagei.getClass();
        isFixableByRetry.getClass();
        p0Var.getClass();
        getquerycontext.getClass();
        imageCaptureUseCaseImpl.getClass();
        this.IconCompatParcelizer = transfersessionpackagei;
        this.MediaSessionCompatQueueItem = isFixableByRetry;
        this.read = p0Var;
        this.RatingCompat = getquerycontext;
        Uri uri = Uri.EMPTY;
        uri.getClass();
        this.RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(new CursorAnchorInfoApi34Helper(uri, "", InAppCameraOverlay.None.read, false, false));
        this.write = (setNavigationOnClickListener) imageCaptureUseCaseImpl.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        this.serializer = new getCameraProvider(2).write();
    }

    public final void serializer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat.serializer(TypefaceResultAsync.write);
        int i4 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final CursorAnchorInfoApi34Helper IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (CursorAnchorInfoApi34Helper) this.RemoteActionCompatParcelizer.getValue();
        }
        throw null;
    }

    public final setNavigationOnClickListener write() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer();
            throw null;
        }
        if (!RemoteActionCompatParcelizer()) {
            return this.write;
        }
        int i3 = MediaBrowserCompatMediaItem + 31;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaMetadataCompat = i4;
        int i5 = i3 % 2;
        setNavigationOnClickListener setnavigationonclicklistener = this.serializer;
        int i6 = i4 + 125;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return setnavigationonclicklistener;
        }
        throw null;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 125;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.IconCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_TAKE_PICTURE_CAMERA_SECURITY_EXCEPTION_FIX_ENABLED);
            throw null;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) this.IconCompatParcelizer;
        firebaseRemoteConfigImpl2.getClass();
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl2.IconCompatParcelizer(updateAdidI.IS_TAKE_PICTURE_CAMERA_SECURITY_EXCEPTION_FIX_ENABLED);
        int i3 = MediaBrowserCompatMediaItem + 43;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 69 / 0;
        }
        return zIconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Uri uri) {
        CursorAnchorInfoApi34Helper cursorAnchorInfoApi34HelperRemoteActionCompatParcelizer;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 37;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            uri.getClass();
            cursorAnchorInfoApi34HelperRemoteActionCompatParcelizer = CursorAnchorInfoApi34Helper.RemoteActionCompatParcelizer(IconCompatParcelizer(), uri, null, null, true, false, 3);
            populateViewStructure_androidKtpopulate7 = this.RemoteActionCompatParcelizer;
        } else {
            uri.getClass();
            cursorAnchorInfoApi34HelperRemoteActionCompatParcelizer = CursorAnchorInfoApi34Helper.RemoteActionCompatParcelizer(IconCompatParcelizer(), uri, null, null, false, false, 30);
            populateViewStructure_androidKtpopulate7 = this.RemoteActionCompatParcelizer;
        }
        ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(cursorAnchorInfoApi34HelperRemoteActionCompatParcelizer);
        int i3 = MediaBrowserCompatMediaItem + 53;
        MediaMetadataCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void IconCompatParcelizer(InAppCameraArgs inAppCameraArgs) {
        int i = 2 % 2;
        ((onShowTranslationui) this.RemoteActionCompatParcelizer).setValue(CursorAnchorInfoApi34Helper.RemoteActionCompatParcelizer(IconCompatParcelizer(), null, null, inAppCameraArgs.RemoteActionCompatParcelizer, inAppCameraArgs.read, inAppCameraArgs.write, 3));
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new BridgeManager$trackEvent$2(this, inAppCameraArgs, (ShortNewsContentCardView) null, 27), 3);
        int i2 = MediaBrowserCompatMediaItem + 111;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }
}

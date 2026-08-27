package com.roadrunner.face.verification.presentation.selfie;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.ViewModel;
import com.huawei.location.Vw$Vw;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.face.verification.api.selfie.CameraImage;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import o.CoordinatorLayout;
import o.displayInAppMessagelambda1;
import o.getBitmapui_graphics;
import o.onDependentViewRemoved;
import o.recreateDisplayListIfNeeded;
import o.setGuidelineBegin;
import o.setGuidelineEnd;
import o.setInsetOffsetX;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfieFlowViewModel extends ViewModel {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final SharedFlowImpl IconCompatParcelizer;
    public final OtpLogger MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final SharedFlowImpl MediaMetadataCompat;
    public final getBitmapui_graphics MediaSessionCompatQueueItem;
    public final MutableStateFlow MediaSessionCompatToken;
    public final SignInDataStore RatingCompat;
    public final Vw$Vw RemoteActionCompatParcelizer;
    public final CompleteIdentityVerificationUseCaseImpl read;
    public final IdentityVerificationParams serializer;
    public final MutableStateFlow write;

    /* JADX WARN: Code duplicated, block: B:15:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b6  */
    public SelfieFlowViewModel(setGuidelineBegin setguidelinebegin, SignInDataStore signInDataStore, OtpLogger otpLogger, Vw$Vw vw$Vw, CompleteIdentityVerificationUseCaseImpl completeIdentityVerificationUseCaseImpl, setGuidelineEnd setguidelineend, getBitmapui_graphics getbitmapui_graphics, IdentityVerificationParams identityVerificationParams) throws IOException {
        CameraImage cameraImage;
        boolean z;
        setguidelinebegin.getClass();
        signInDataStore.getClass();
        otpLogger.getClass();
        vw$Vw.getClass();
        completeIdentityVerificationUseCaseImpl.getClass();
        setguidelineend.getClass();
        identityVerificationParams.getClass();
        this.RatingCompat = signInDataStore;
        this.MediaBrowserCompatMediaItem = otpLogger;
        this.RemoteActionCompatParcelizer = vw$Vw;
        this.read = completeIdentityVerificationUseCaseImpl;
        this.MediaSessionCompatQueueItem = getbitmapui_graphics;
        this.serializer = identityVerificationParams;
        CameraImage cameraImage2 = (CameraImage) getbitmapui_graphics.write("camera_image");
        if (cameraImage2 == null) {
            String str = identityVerificationParams.write;
            str.getClass();
            String strConcat = "JPEG_".concat(str);
            recreateDisplayListIfNeeded recreatedisplaylistifneeded = (recreateDisplayListIfNeeded) setguidelinebegin.write;
            File fileIconCompatParcelizer = recreatedisplaylistifneeded.IconCompatParcelizer(strConcat);
            Uri uri = recreatedisplaylistifneeded.read(fileIconCompatParcelizer);
            String absolutePath = fileIconCompatParcelizer.getAbsolutePath();
            absolutePath.getClass();
            cameraImage = new CameraImage(str, uri, absolutePath);
            getbitmapui_graphics.RemoteActionCompatParcelizer("camera_image", cameraImage);
        } else {
            int i = 2 % 2;
            cameraImage = cameraImage2;
        }
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) setguidelineend.RemoteActionCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_SELFIE_CONSENT_ENABLED)) {
            int i2 = ParcelableVolumeInfo + 11;
            PlaybackStateCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 7 / 0;
                if (((CoordinatorLayout) ((Gen2FunWithFlagsConfigRepository) setguidelineend.read.serializer).serializer(setInsetOffsetX.RemoteActionCompatParcelizer, displayInAppMessagelambda1.serializer(CoordinatorLayout.class))) == CoordinatorLayout.TREATMENT_1) {
                    int i4 = 2 % 2;
                    z = true;
                } else {
                    int i5 = PlaybackStateCompat + 19;
                    ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                    z = false;
                }
            } else {
                if (((CoordinatorLayout) ((Gen2FunWithFlagsConfigRepository) setguidelineend.read.serializer).serializer(setInsetOffsetX.RemoteActionCompatParcelizer, displayInAppMessagelambda1.serializer(CoordinatorLayout.class))) == CoordinatorLayout.TREATMENT_1) {
                    int i8 = 2 % 2;
                    z = true;
                } else {
                    int i9 = PlaybackStateCompat + 19;
                    ParcelableVolumeInfo = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    int i11 = 2 % 2;
                    z = false;
                }
            }
        } else {
            int i12 = PlaybackStateCompat + 19;
            ParcelableVolumeInfo = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
            z = false;
        }
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new onDependentViewRemoved(cameraImage, false, false, false, 0, true, z));
        this.write = mutableStateFlow;
        this.MediaSessionCompatToken = mutableStateFlow;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 0, null, 7);
        this.IconCompatParcelizer = sharedFlowImplRemoteActionCompatParcelizer;
        this.MediaMetadataCompat = sharedFlowImplRemoteActionCompatParcelizer;
    }
}

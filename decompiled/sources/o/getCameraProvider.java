package o;

import android.util.Rational;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class getCameraProvider implements StreamSharingExternalSyntheticLambda0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final CameraProviderInitRetryPolicy serializer;

    @Override // o.StreamSharingExternalSyntheticLambda0
    public final ImageUtilCodecFailedException RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy = this.serializer;
        if (i == 0) {
            return new DeferrableSurfaceSurfaceClosedException(CameraRepository.serializer(cameraProviderInitRetryPolicy));
        }
        if (i != 1) {
            return i != 2 ? new getValueFromNanos(CameraRepository.serializer(cameraProviderInitRetryPolicy)) : new UseCase(CameraRepository.serializer(cameraProviderInitRetryPolicy));
        }
        return new SurfaceRequestRequestCancelledException(CameraRepository.serializer(cameraProviderInitRetryPolicy));
    }

    public setNavigationOnClickListener write() {
        Integer numValueOf = Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationX);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = UseCase.read;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy = this.serializer;
        Integer num = (Integer) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk, null);
        if (num != null) {
            cameraProviderInitRetryPolicy.IconCompatParcelizer(getFeatureGroupUseCaseType.b_, num);
        } else {
            setTitleMarginEnd settitlemarginend = setNavigationOnClickListener.read;
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = UseCase.MediaMetadataCompat;
            if (Objects.equals(cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk2, null), 2)) {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 32);
            } else if (Objects.equals(cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk2, null), 3)) {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 32);
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getFeatureGroupUseCaseType.ParcelableVolumeInfo, numValueOf);
            } else if (Objects.equals(cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk2, null), 1)) {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 4101);
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getFeatureGroupUseCaseType.a_, getNavigationIcon.MediaMetadataCompat);
            } else {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getFeatureGroupUseCaseType.b_, numValueOf);
            }
        }
        UseCase useCase = new UseCase(CameraRepository.serializer(cameraProviderInitRetryPolicy));
        getImageFormatdefault.read(useCase);
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener(useCase);
        android.util.Size size = (android.util.Size) cameraProviderInitRetryPolicy.read(getImageFormatdefault.k_, null);
        if (size != null) {
            setnavigationonclicklistener.write = new Rational(size.getWidth(), size.getHeight());
        }
        coil3.util.UtilsKt.IconCompatParcelizer((Executor) cameraProviderInitRetryPolicy.read(getController.m_, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.RemoteActionCompatParcelizer()), "The IO executor can't be null");
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk3 = UseCase.write;
        if (cameraProviderInitRetryPolicy.RemoteActionCompatParcelizer.containsKey(jpegCaptureDownsizingQuirk3)) {
            Integer num2 = (Integer) cameraProviderInitRetryPolicy.write(jpegCaptureDownsizingQuirk3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                Gson$$ExternalSyntheticBUOutline0.m(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && cameraProviderInitRetryPolicy.read(UseCase.MediaDescriptionCompat, null) == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return setnavigationonclicklistener;
    }

    @Override // o.getTitleMarginTop
    public final CameraProviderInitRetryPolicy serializer() {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            return this.serializer;
        }
        if (i != 1) {
            return i != 2 ? this.serializer : this.serializer;
        }
        return this.serializer;
    }

    public getCameraProvider(CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy, int i) {
        this.IconCompatParcelizer = i;
        if (i == 1) {
            this.serializer = cameraProviderInitRetryPolicy;
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getPreviewStreamState.MediaSessionCompatResultReceiverWrapper;
            Class cls = (Class) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk, null);
            if (cls != null && !cls.equals(getWrapper.class)) {
                getOffVariationName.read("Invalid target class configuration for ", this, ": ", cls);
                throw null;
            }
            cameraProviderInitRetryPolicy.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, VideoCapture.IMAGE_ANALYSIS);
            cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk, getWrapper.class);
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = getPreviewStreamState.PlaybackStateCompat;
            if (cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk2, null) == null) {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, getWrapper.class.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        if (i == 2) {
            this.serializer = cameraProviderInitRetryPolicy;
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk3 = getPreviewStreamState.MediaSessionCompatResultReceiverWrapper;
            Class cls2 = (Class) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk3, null);
            if (cls2 != null && !cls2.equals(setNavigationOnClickListener.class)) {
                getOffVariationName.read("Invalid target class configuration for ", this, ": ", cls2);
                throw null;
            }
            cameraProviderInitRetryPolicy.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, VideoCapture.IMAGE_CAPTURE);
            cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk3, setNavigationOnClickListener.class);
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk4 = getPreviewStreamState.PlaybackStateCompat;
            if (cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk4, null) == null) {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk4, setNavigationOnClickListener.class.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        if (i != 3) {
            this.serializer = cameraProviderInitRetryPolicy;
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk5 = getPreviewStreamState.MediaSessionCompatResultReceiverWrapper;
            Class cls3 = (Class) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk5, null);
            if (cls3 != null && !cls3.equals(AuthenticatorUtils.class)) {
                getOffVariationName.read("Invalid target class configuration for ", this, ": ", cls3);
                throw null;
            }
            cameraProviderInitRetryPolicy.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, VideoCapture.PREVIEW);
            cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk5, AuthenticatorUtils.class);
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk6 = getPreviewStreamState.PlaybackStateCompat;
            if (cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk6, null) == null) {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk6, AuthenticatorUtils.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk7 = getImageFormatdefault.g_;
            if (((Integer) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk7, -1)).intValue() == -1) {
                cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk7, 2);
                return;
            }
            return;
        }
        this.serializer = cameraProviderInitRetryPolicy;
        if (!cameraProviderInitRetryPolicy.RemoteActionCompatParcelizer.containsKey(getValueFromNanos.write)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("VideoOutput is required");
            throw null;
        }
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk8 = getPreviewStreamState.MediaSessionCompatResultReceiverWrapper;
        Class cls4 = (Class) cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk8, null);
        if (cls4 != null && !cls4.equals(androidx.camera.video.VideoCapture.class)) {
            getOffVariationName.read("Invalid target class configuration for ", this, ": ", cls4);
            throw null;
        }
        cameraProviderInitRetryPolicy.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, VideoCapture.VIDEO_CAPTURE);
        cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk8, androidx.camera.video.VideoCapture.class);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk9 = getPreviewStreamState.PlaybackStateCompat;
        if (cameraProviderInitRetryPolicy.read(jpegCaptureDownsizingQuirk9, null) == null) {
            cameraProviderInitRetryPolicy.IconCompatParcelizer(jpegCaptureDownsizingQuirk9, androidx.camera.video.VideoCapture.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public AuthenticatorUtils IconCompatParcelizer() {
        DeferrableSurfaceSurfaceClosedException deferrableSurfaceSurfaceClosedException = new DeferrableSurfaceSurfaceClosedException(CameraRepository.serializer(this.serializer));
        getImageFormatdefault.read(deferrableSurfaceSurfaceClosedException);
        AuthenticatorUtils authenticatorUtils = new AuthenticatorUtils(deferrableSurfaceSurfaceClosedException);
        authenticatorUtils.MediaMetadataCompat = AuthenticatorUtils.IconCompatParcelizer;
        return authenticatorUtils;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getCameraProvider(int i) {
        this(CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(), 0);
        this.IconCompatParcelizer = i;
        if (i == 1) {
            this(CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(), 1);
        } else if (i != 2) {
        } else {
            this(CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(), 2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getCameraProvider(CubicBezierEasing cubicBezierEasing) {
        this.IconCompatParcelizer = 3;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getValueFromNanos.write, cubicBezierEasing);
        this(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer, 3);
    }
}

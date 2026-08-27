package o;

import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class AuthenticatorUtils extends androidx.camera.core.UseCase {
    public BiometricFragmentExternalSyntheticLambda7 MediaBrowserCompatMediaItem;
    public Camera2CameraFactory MediaDescriptionCompat;
    public Executor MediaMetadataCompat;
    public UseCaseAdditionSimulator MediaSessionCompatQueueItem;
    public setBrightness RemoteActionCompatParcelizer;
    public androidx.camera.core.SurfaceRequest serializer;
    public InterruptedRuntimeException write;
    public static final BiometricFragment read = new BiometricFragment();
    public static final ReportedVideoQualityNotSupportedQuirk IconCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer();

    @Override // androidx.camera.core.UseCase
    public final void serializer() {
        read();
    }

    public final void write(DeferrableSurfaceSurfaceClosedException deferrableSurfaceSurfaceClosedException, SmallDisplaySizeQuirk smallDisplaySizeQuirk) {
        android.graphics.Rect rect;
        PrematureEndOfStreamVideoQuirk.write();
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        Objects.requireNonNull(imageCapture1RatingCompat);
        read();
        int i = 0;
        coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, this.RemoteActionCompatParcelizer == null);
        android.graphics.Matrix matrix = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        boolean zC_ = imageCapture1RatingCompat.c_();
        android.util.Size size = smallDisplaySizeQuirk.MediaMetadataCompat;
        android.graphics.Rect rect2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (rect2 != null) {
            rect = rect2;
        } else if (size != null) {
            rect2 = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
            rect = rect2;
        } else {
            rect = null;
        }
        Objects.requireNonNull(rect);
        setBrightness setbrightness = new setBrightness(1, 34, smallDisplaySizeQuirk, matrix, zC_, rect, serializer(imageCapture1RatingCompat, write(imageCapture1RatingCompat)), MediaMetadataCompat(), imageCapture1RatingCompat.c_() && write(imageCapture1RatingCompat));
        this.RemoteActionCompatParcelizer = setbrightness;
        setbrightness.read(new Preview$$ExternalSyntheticLambda0(i, this));
        androidx.camera.core.SurfaceRequest surfaceRequestRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(imageCapture1RatingCompat, true);
        this.serializer = surfaceRequestRemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = surfaceRequestRemoteActionCompatParcelizer.write;
        if (this.MediaBrowserCompatMediaItem != null) {
            ImageCapture1 imageCapture1RatingCompat2 = RatingCompat();
            setBrightness setbrightness2 = this.RemoteActionCompatParcelizer;
            if (imageCapture1RatingCompat2 != null && setbrightness2 != null) {
                PrematureEndOfStreamVideoQuirk.write(new ScreenFlashView2(setbrightness2, serializer(imageCapture1RatingCompat2, write(imageCapture1RatingCompat2)), MediaMetadataCompat()));
            }
            BiometricFragmentExternalSyntheticLambda7 biometricFragmentExternalSyntheticLambda7 = this.MediaBrowserCompatMediaItem;
            biometricFragmentExternalSyntheticLambda7.getClass();
            androidx.camera.core.SurfaceRequest surfaceRequest = this.serializer;
            surfaceRequest.getClass();
            this.MediaMetadataCompat.execute(new CameraX$$ExternalSyntheticLambda2(biometricFragmentExternalSyntheticLambda7, 15, surfaceRequest));
        }
        UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = UseCaseAdditionSimulator.IconCompatParcelizer(deferrableSurfaceSurfaceClosedException, smallDisplaySizeQuirk.MediaMetadataCompat);
        abandonFocus abandonfocus = useCaseAdditionSimulatorIconCompatParcelizer.serializer;
        useCaseAdditionSimulatorIconCompatParcelizer.MediaSessionCompatQueueItem = smallDisplaySizeQuirk.MediaDescriptionCompat;
        serializer(useCaseAdditionSimulatorIconCompatParcelizer, smallDisplaySizeQuirk);
        int iSerializer = deferrableSurfaceSurfaceClosedException.serializer();
        if (iSerializer != 0) {
            abandonfocus.getClass();
            if (iSerializer != 0) {
                ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, Integer.valueOf(iSerializer));
            }
        }
        InitializationException initializationException = smallDisplaySizeQuirk.serializer;
        if (initializationException != null) {
            abandonfocus.RemoteActionCompatParcelizer(initializationException);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            useCaseAdditionSimulatorIconCompatParcelizer.serializer(this.MediaDescriptionCompat, smallDisplaySizeQuirk.read, ((Integer) ((getImageFormatdefault) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read(getImageFormatdefault.g_, -1)).intValue());
        }
        InterruptedRuntimeException interruptedRuntimeException = this.write;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
        }
        InterruptedRuntimeException interruptedRuntimeException2 = new InterruptedRuntimeException(new BiometricFragmentExternalSyntheticLambda1(i, this));
        this.write = interruptedRuntimeException2;
        useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer = interruptedRuntimeException2;
        this.MediaSessionCompatQueueItem = useCaseAdditionSimulatorIconCompatParcelizer;
        Object[] objArr = {useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
    }

    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException IconCompatParcelizer(boolean z, Recorder3 recorder3) {
        read.getClass();
        DeferrableSurfaceSurfaceClosedException deferrableSurfaceSurfaceClosedException = BiometricFragment.serializer;
        InitializationException initializationExceptionRemoteActionCompatParcelizer = recorder3.RemoteActionCompatParcelizer(deferrableSurfaceSurfaceClosedException.write(), 1);
        if (z) {
            initializationExceptionRemoteActionCompatParcelizer = InitializationException.RemoteActionCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer, deferrableSurfaceSurfaceClosedException);
        }
        if (initializationExceptionRemoteActionCompatParcelizer == null) {
            return null;
        }
        return new DeferrableSurfaceSurfaceClosedException(CameraRepository.serializer(((getCameraProvider) IconCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer)).serializer));
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSharingExternalSyntheticLambda0 IconCompatParcelizer(InitializationException initializationException) {
        return new getCameraProvider(CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(initializationException), 0);
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk RemoteActionCompatParcelizer(InitializationException initializationException) {
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(initializationException);
        Object[] objArr = {this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
        RepeatingStreamConstraintForVideoRecordingQuirk repeatingStreamConstraintForVideoRecordingQuirk = this.MediaSessionCompatToken.read();
        repeatingStreamConstraintForVideoRecordingQuirk.IconCompatParcelizer = initializationException;
        return repeatingStreamConstraintForVideoRecordingQuirk.read();
    }

    @Override // androidx.camera.core.UseCase
    public final Set e_() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final void write(android.graphics.Rect rect) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = rect;
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        setBrightness setbrightness = this.RemoteActionCompatParcelizer;
        if (imageCapture1RatingCompat == null || setbrightness == null) {
            return;
        }
        PrematureEndOfStreamVideoQuirk.write(new ScreenFlashView2(setbrightness, serializer(imageCapture1RatingCompat, write(imageCapture1RatingCompat)), MediaMetadataCompat()));
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk write(SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2) {
        Objects.toString(smallDisplaySizeQuirk);
        Objects.toString(smallDisplaySizeQuirk2);
        setInflatedId.IconCompatParcelizer(3, "Preview");
        write((DeferrableSurfaceSurfaceClosedException) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, smallDisplaySizeQuirk);
        return smallDisplaySizeQuirk;
    }

    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException RemoteActionCompatParcelizer(FocusMeteringAction focusMeteringAction, StreamSharingExternalSyntheticLambda0 streamSharingExternalSyntheticLambda0) {
        streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 34);
        return streamSharingExternalSyntheticLambda0.RemoteActionCompatParcelizer();
    }

    public final void read() {
        InterruptedRuntimeException interruptedRuntimeException = this.write;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
            this.write = null;
        }
        Camera2CameraFactory camera2CameraFactory = this.MediaDescriptionCompat;
        if (camera2CameraFactory != null) {
            camera2CameraFactory.write();
            this.MediaDescriptionCompat = null;
        }
        setBrightness setbrightness = this.RemoteActionCompatParcelizer;
        if (setbrightness != null) {
            setbrightness.read();
            this.RemoteActionCompatParcelizer = null;
        }
        androidx.camera.core.SurfaceRequest surfaceRequest = this.serializer;
        if (surfaceRequest != null) {
            synchronized (surfaceRequest.MediaDescriptionCompat) {
                surfaceRequest.ResultReceiver = null;
                surfaceRequest.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
            }
        }
        this.serializer = null;
    }

    public final void IconCompatParcelizer(BiometricFragmentExternalSyntheticLambda7 biometricFragmentExternalSyntheticLambda7) {
        PrematureEndOfStreamVideoQuirk.write();
        if (biometricFragmentExternalSyntheticLambda7 == null) {
            this.MediaBrowserCompatMediaItem = null;
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = values.INACTIVE;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            return;
        }
        this.MediaBrowserCompatMediaItem = biometricFragmentExternalSyntheticLambda7;
        this.MediaMetadataCompat = IconCompatParcelizer;
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.MediaSessionCompatToken;
        if ((smallDisplaySizeQuirk != null ? smallDisplaySizeQuirk.MediaMetadataCompat : null) != null) {
            write((DeferrableSurfaceSurfaceClosedException) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, smallDisplaySizeQuirk);
            ParcelableVolumeInfo();
        }
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = values.ACTIVE;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    public final String toString() {
        return "Preview:".concat(MediaSessionCompatToken());
    }

    public AuthenticatorUtils(ImageUtilCodecFailedException imageUtilCodecFailedException) {
        super(imageUtilCodecFailedException);
    }
}

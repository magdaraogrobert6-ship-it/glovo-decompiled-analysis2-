package o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import androidx.camera.core.ImageCapture$1;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class setNavigationOnClickListener extends androidx.camera.core.UseCase {
    public static final setTitleMarginEnd read = new setTitleMarginEnd();
    public InterruptedRuntimeException IconCompatParcelizer;
    public final ImageCapture$1 MediaBrowserCompatMediaItem;
    public final AtomicReference MediaDescriptionCompat;
    public com.airbnb.lottie.parser.DropShadowEffect MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public IncorrectCaptureStateQuirk ParcelableVolumeInfo;
    public UseCaseAdditionSimulator PlaybackStateCompat;
    public getBitmap RatingCompat;
    public int RemoteActionCompatParcelizer;
    public final int serializer;
    public Rational write;

    /* JADX WARN: Code duplicated, block: B:19:0x008f  */
    public final UseCaseAdditionSimulator serializer(String str, UseCase useCase, SmallDisplaySizeQuirk smallDisplaySizeQuirk) {
        HashSet hashSet;
        Camera2CameraFactory camera2CameraFactory;
        InitializationException initializationExceptionRemoteActionCompatParcelizer;
        PrematureEndOfStreamVideoQuirk.write();
        Objects.toString(smallDisplaySizeQuirk);
        android.util.Size size = smallDisplaySizeQuirk.MediaMetadataCompat;
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        Objects.requireNonNull(imageCapture1RatingCompat);
        boolean z = !imageCapture1RatingCompat.c_();
        CameraCharacteristics cameraCharacteristics = null;
        if (this.MediaMetadataCompat != null) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, z);
            this.MediaMetadataCompat.IconCompatParcelizer();
        }
        FocusMeteringAction focusMeteringActionResultReceiver = RatingCompat().ResultReceiver();
        if ((focusMeteringActionResultReceiver instanceof InvalidVideoProfilesQuirk) && (initializationExceptionRemoteActionCompatParcelizer = ((Recorder3) ((InvalidVideoProfilesQuirk) focusMeteringActionResultReceiver).IconCompatParcelizer.read(CameraControlOperationCanceledException.serializer, Recorder3.IconCompatParcelizer)).RemoteActionCompatParcelizer(VideoCapture.IMAGE_CAPTURE, 1)) != null) {
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getImageFormatdefault.i_;
            CameraRepository cameraRepository = (CameraRepository) initializationExceptionRemoteActionCompatParcelizer;
            if (cameraRepository.RemoteActionCompatParcelizer.containsKey(jpegCaptureDownsizingQuirk)) {
                hashSet = new HashSet();
                hashSet.add(0);
                Iterator it = ((List) cameraRepository.write(jpegCaptureDownsizingQuirk)).iterator();
                while (it.hasNext()) {
                    if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
            } else {
                hashSet = null;
            }
        } else {
            hashSet = null;
        }
        int i = 2;
        if (hashSet == null) {
            hashSet = new HashSet();
            hashSet.add(0);
            if (focusMeteringActionResultReceiver != null && focusMeteringActionResultReceiver.PlaybackStateCompat().contains(4101)) {
                hashSet.add(1);
            }
            if (focusMeteringActionResultReceiver != null && focusMeteringActionResultReceiver.RemoteActionCompatParcelizer().contains(3) && focusMeteringActionResultReceiver.PlaybackStateCompat().contains(32)) {
                hashSet.add(2);
                hashSet.add(3);
            }
        }
        ImageUtilCodecFailedException imageUtilCodecFailedException = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = UseCase.MediaMetadataCompat;
        Integer num = (Integer) imageUtilCodecFailedException.read(jpegCaptureDownsizingQuirk2, 0);
        num.getClass();
        boolean zContains = hashSet.contains(num);
        StringBuilder sb = new StringBuilder("The specified output format (");
        Integer num2 = (Integer) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(jpegCaptureDownsizingQuirk2, 0);
        num2.getClass();
        sb.append(num2.intValue());
        sb.append(") is not supported by current configuration. Supported output formats: ");
        sb.append(hashSet);
        coil3.util.UtilsKt.IconCompatParcelizer(sb.toString(), zContains);
        if (((Boolean) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(UseCase.RatingCompat, Boolean.FALSE)).booleanValue()) {
            useCase.RemoteActionCompatParcelizer();
            RatingCompat().MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer();
        }
        if (RatingCompat() != null) {
            try {
                Object objIconCompatParcelizer = RatingCompat().MediaMetadataCompat().IconCompatParcelizer();
                if (objIconCompatParcelizer instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objIconCompatParcelizer;
                }
            } catch (Exception e) {
                SentryLogcatAdapter.read("ImageCapture", "getCameraCharacteristics failed", e);
            }
        }
        this.MediaMetadataCompat = new com.airbnb.lottie.parser.DropShadowEffect(useCase, size, cameraCharacteristics, z);
        if (this.ParcelableVolumeInfo == null) {
            Objects.requireNonNull((ImageUtil) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(ImageUtilCodecFailedException.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, new ImageUtil()));
            this.ParcelableVolumeInfo = new IncorrectCaptureStateQuirk(this.MediaBrowserCompatMediaItem);
        }
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk = this.ParcelableVolumeInfo;
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = this.MediaMetadataCompat;
        incorrectCaptureStateQuirk.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        incorrectCaptureStateQuirk.RemoteActionCompatParcelizer = dropShadowEffect;
        dropShadowEffect.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        androidx.lifecycle.BlockRunner blockRunner = (androidx.lifecycle.BlockRunner) dropShadowEffect.write;
        blockRunner.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("The ImageReader is not initialized.", ((AuthPromptFailureException) blockRunner.serializer) != null);
        AuthPromptFailureException authPromptFailureException = (AuthPromptFailureException) blockRunner.serializer;
        synchronized (authPromptFailureException.read) {
            authPromptFailureException.IconCompatParcelizer = incorrectCaptureStateQuirk;
        }
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect2 = this.MediaMetadataCompat;
        UseCaseAdditionSimulator useCaseAdditionSimulatorIconCompatParcelizer = UseCaseAdditionSimulator.IconCompatParcelizer((UseCase) dropShadowEffect2.read, smallDisplaySizeQuirk.MediaMetadataCompat);
        ConfigureSurfaceToSecondarySessionFailQuirk configureSurfaceToSecondarySessionFailQuirk = (ConfigureSurfaceToSecondarySessionFailQuirk) dropShadowEffect2.MediaDescriptionCompat;
        Camera2CameraFactory camera2CameraFactory2 = configureSurfaceToSecondarySessionFailQuirk.MediaDescriptionCompat;
        Objects.requireNonNull(camera2CameraFactory2);
        getNavigationIcon getnavigationicon = getNavigationIcon.MediaDescriptionCompat;
        PreviewStretchWhenVideoCaptureIsBoundQuirk previewStretchWhenVideoCaptureIsBoundQuirk = Preview3AThreadCrashQuirk.read(camera2CameraFactory2);
        previewStretchWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer = getnavigationicon;
        useCaseAdditionSimulatorIconCompatParcelizer.write.add(previewStretchWhenVideoCaptureIsBoundQuirk.serializer());
        if (configureSurfaceToSecondarySessionFailQuirk.MediaBrowserCompatMediaItem.size() > 1 && (camera2CameraFactory = configureSurfaceToSecondarySessionFailQuirk.RatingCompat) != null) {
            PreviewStretchWhenVideoCaptureIsBoundQuirk previewStretchWhenVideoCaptureIsBoundQuirk2 = Preview3AThreadCrashQuirk.read(camera2CameraFactory);
            previewStretchWhenVideoCaptureIsBoundQuirk2.IconCompatParcelizer = getnavigationicon;
            useCaseAdditionSimulatorIconCompatParcelizer.write.add(previewStretchWhenVideoCaptureIsBoundQuirk2.serializer());
        }
        Camera2CameraFactory camera2CameraFactory3 = configureSurfaceToSecondarySessionFailQuirk.write;
        if (camera2CameraFactory3 != null) {
            useCaseAdditionSimulatorIconCompatParcelizer.MediaMetadataCompat = Preview3AThreadCrashQuirk.read(camera2CameraFactory3).serializer();
        }
        useCaseAdditionSimulatorIconCompatParcelizer.MediaSessionCompatQueueItem = smallDisplaySizeQuirk.MediaDescriptionCompat;
        if (this.serializer == 2 && !smallDisplaySizeQuirk.RatingCompat) {
            MediaDescriptionCompat().write(useCaseAdditionSimulatorIconCompatParcelizer);
        }
        InitializationException initializationException = smallDisplaySizeQuirk.serializer;
        if (initializationException != null) {
            useCaseAdditionSimulatorIconCompatParcelizer.serializer.RemoteActionCompatParcelizer(initializationException);
        }
        InterruptedRuntimeException interruptedRuntimeException = this.IconCompatParcelizer;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
        }
        InterruptedRuntimeException interruptedRuntimeException2 = new InterruptedRuntimeException(new BiometricFragmentExternalSyntheticLambda1(i, this));
        this.IconCompatParcelizer = interruptedRuntimeException2;
        useCaseAdditionSimulatorIconCompatParcelizer.RemoteActionCompatParcelizer = interruptedRuntimeException2;
        return useCaseAdditionSimulatorIconCompatParcelizer;
    }

    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException IconCompatParcelizer(boolean z, Recorder3 recorder3) {
        read.getClass();
        UseCase useCase = setTitleMarginEnd.RemoteActionCompatParcelizer;
        InitializationException initializationExceptionRemoteActionCompatParcelizer = recorder3.RemoteActionCompatParcelizer(useCase.write(), this.serializer);
        if (z) {
            initializationExceptionRemoteActionCompatParcelizer = InitializationException.RemoteActionCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer, useCase);
        }
        if (initializationExceptionRemoteActionCompatParcelizer == null) {
            return null;
        }
        return new UseCase(CameraRepository.serializer(((getCameraProvider) IconCompatParcelizer(initializationExceptionRemoteActionCompatParcelizer)).serializer));
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSharingExternalSyntheticLambda0 IconCompatParcelizer(InitializationException initializationException) {
        return new getCameraProvider(CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(initializationException), 2);
    }

    @Override // androidx.camera.core.UseCase
    public final void MediaBrowserCompatMediaItem() {
        getBitmap getbitmap = this.RatingCompat;
        getbitmap.IconCompatParcelizer();
        getbitmap.write();
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk = this.ParcelableVolumeInfo;
        if (incorrectCaptureStateQuirk != null) {
            incorrectCaptureStateQuirk.read();
        }
    }

    public final void MediaSessionCompatQueueItem() {
        synchronized (this.MediaDescriptionCompat) {
            if (this.MediaDescriptionCompat.get() != null) {
                return;
            }
            MediaDescriptionCompat().IconCompatParcelizer(read());
        }
    }

    @Override // androidx.camera.core.UseCase
    public final ImageUtilCodecFailedException RemoteActionCompatParcelizer(FocusMeteringAction focusMeteringAction, StreamSharingExternalSyntheticLambda0 streamSharingExternalSyntheticLambda0) {
        Integer numValueOf = Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationX);
        HashSet<Camera2DeviceSurfaceManager> hashSet = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        boolean z = false;
        if (hashSet != null) {
            int i = 0;
            for (Camera2DeviceSurfaceManager camera2DeviceSurfaceManager : hashSet) {
                if (camera2DeviceSurfaceManager instanceof AeFpsRangeLegacyQuirk) {
                    i = ((AeFpsRangeLegacyQuirk) camera2DeviceSurfaceManager).RemoteActionCompatParcelizer;
                }
            }
            streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(UseCase.MediaMetadataCompat, Integer.valueOf(i));
        }
        if (focusMeteringAction.serializer().RemoteActionCompatParcelizer(androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicySerializer = streamSharingExternalSyntheticLambda0.serializer();
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = UseCase.MediaSessionCompatToken;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(cameraProviderInitRetryPolicySerializer.read(jpegCaptureDownsizingQuirk, bool2))) {
                setInflatedId.read("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                setInflatedId.IconCompatParcelizer(4, "ImageCapture");
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(jpegCaptureDownsizingQuirk, bool2);
            }
        }
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicySerializer2 = streamSharingExternalSyntheticLambda0.serializer();
        Boolean bool3 = Boolean.TRUE;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = UseCase.MediaSessionCompatToken;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(cameraProviderInitRetryPolicySerializer2.read(jpegCaptureDownsizingQuirk2, bool4))) {
            if (RatingCompat() != null) {
                RatingCompat().MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer();
            }
            Integer num = (Integer) cameraProviderInitRetryPolicySerializer2.read(UseCase.read, null);
            if (num == null || num.intValue() == 256) {
                z = true;
            } else {
                setInflatedId.read("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z) {
                setInflatedId.read("ImageCapture", "Unable to support software JPEG. Disabling.");
                cameraProviderInitRetryPolicySerializer2.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, bool4);
            }
        }
        Integer num2 = (Integer) streamSharingExternalSyntheticLambda0.serializer().read(UseCase.read, null);
        if (num2 != null) {
            if (RatingCompat() != null) {
                RatingCompat().MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer();
            }
            streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicySerializer3 = streamSharingExternalSyntheticLambda0.serializer();
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk3 = UseCase.MediaMetadataCompat;
            if (Objects.equals(cameraProviderInitRetryPolicySerializer3.read(jpegCaptureDownsizingQuirk3, null), 2)) {
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 32);
            } else if (Objects.equals(streamSharingExternalSyntheticLambda0.serializer().read(jpegCaptureDownsizingQuirk3, null), 3)) {
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 32);
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.ParcelableVolumeInfo, numValueOf);
            } else if (Objects.equals(streamSharingExternalSyntheticLambda0.serializer().read(jpegCaptureDownsizingQuirk3, null), 1)) {
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 4101);
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.a_, getNavigationIcon.MediaMetadataCompat);
            } else if (z) {
                streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 35);
            } else {
                List list = (List) streamSharingExternalSyntheticLambda0.serializer().read(getImageFormatdefault.i_, null);
                if (list == null || RemoteActionCompatParcelizer(androidx.compose.ui.graphics.Fields.RotationX, list)) {
                    streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, numValueOf);
                } else if (RemoteActionCompatParcelizer(35, list)) {
                    streamSharingExternalSyntheticLambda0.serializer().IconCompatParcelizer(getFeatureGroupUseCaseType.b_, 35);
                }
            }
        }
        return streamSharingExternalSyntheticLambda0.RemoteActionCompatParcelizer();
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk RemoteActionCompatParcelizer(InitializationException initializationException) {
        this.PlaybackStateCompat.RemoteActionCompatParcelizer(initializationException);
        Object[] objArr = {this.PlaybackStateCompat.RemoteActionCompatParcelizer()};
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
        hashSet.add(4);
        return hashSet;
    }

    public final int read() {
        int iIntValue;
        synchronized (this.MediaDescriptionCompat) {
            iIntValue = this.RemoteActionCompatParcelizer;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((UseCase) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read(UseCase.write, 2)).intValue();
            }
        }
        return iIntValue;
    }

    @Override // androidx.camera.core.UseCase
    public final void serializer() {
        getBitmap getbitmap = this.RatingCompat;
        getbitmap.IconCompatParcelizer();
        getbitmap.write();
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk = this.ParcelableVolumeInfo;
        if (incorrectCaptureStateQuirk != null) {
            incorrectCaptureStateQuirk.read();
        }
        read(false);
        MediaDescriptionCompat().serializer((setTitleMarginBottom) null);
    }

    @Override // androidx.camera.core.UseCase
    public final void g_() {
        setInflatedId.IconCompatParcelizer(3, "ImageCapture");
        MediaSessionCompatQueueItem();
        MediaDescriptionCompat().serializer(this.RatingCompat);
    }

    public final void read(boolean z) {
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk;
        PrematureEndOfStreamVideoQuirk.write();
        InterruptedRuntimeException interruptedRuntimeException = this.IconCompatParcelizer;
        if (interruptedRuntimeException != null) {
            interruptedRuntimeException.write();
            this.IconCompatParcelizer = null;
        }
        com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect = this.MediaMetadataCompat;
        if (dropShadowEffect != null) {
            dropShadowEffect.IconCompatParcelizer();
            this.MediaMetadataCompat = null;
        }
        if (!z && (incorrectCaptureStateQuirk = this.ParcelableVolumeInfo) != null) {
            incorrectCaptureStateQuirk.read();
            this.ParcelableVolumeInfo = null;
        }
        MediaDescriptionCompat().IconCompatParcelizer();
    }

    @Override // androidx.camera.core.UseCase
    public final SmallDisplaySizeQuirk write(SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2) {
        Objects.toString(smallDisplaySizeQuirk);
        Objects.toString(smallDisplaySizeQuirk2);
        setInflatedId.IconCompatParcelizer(3, "ImageCapture");
        UseCaseAdditionSimulator useCaseAdditionSimulatorSerializer = serializer(PlaybackStateCompatCustomAction(), (UseCase) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, smallDisplaySizeQuirk);
        this.PlaybackStateCompat = useCaseAdditionSimulatorSerializer;
        Object[] objArr = {useCaseAdditionSimulatorSerializer.RemoteActionCompatParcelizer()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        RemoteActionCompatParcelizer(Collections.unmodifiableList(arrayList));
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = values.ACTIVE;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        return smallDisplaySizeQuirk;
    }

    public static boolean RemoteActionCompatParcelizer(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void read(int i) {
        int iMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper();
        if (!write(i) || this.write == null) {
            return;
        }
        this.write = androidx.camera.core.internal.utils.ImageUtil.serializer(Math.abs(copyWithMergingEnabledui.serializer(i) - copyWithMergingEnabledui.serializer(iMediaSessionCompatResultReceiverWrapper)), this.write);
    }

    public final void serializer(valueOf valueof, Executor executor, setSubtitleTextColor setsubtitletextcolor) {
        android.graphics.Rect rect;
        int iRound;
        int i;
        int i2;
        int i3;
        int iIntValue;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I(this, valueof, executor, setsubtitletextcolor, 1));
            return;
        }
        PrematureEndOfStreamVideoQuirk.write();
        if (read() == 3 && this.RatingCompat.read == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        android.graphics.Rect rect2 = null;
        if (imageCapture1RatingCompat == null || !this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            setsubtitletextcolor.write(new androidx.camera.core.ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null));
            return;
        }
        boolean z = ((Integer) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(getFeatureGroupUseCaseType.ParcelableVolumeInfo, 0)).intValue() != 0;
        if (z) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Simultaneous capture RAW and JPEG needs two output file options");
            return;
        }
        IncorrectCaptureStateQuirk incorrectCaptureStateQuirk = this.ParcelableVolumeInfo;
        Objects.requireNonNull(incorrectCaptureStateQuirk);
        android.graphics.Rect rect3 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.MediaSessionCompatToken;
        android.util.Size size = smallDisplaySizeQuirk != null ? smallDisplaySizeQuirk.MediaMetadataCompat : null;
        Objects.requireNonNull(size);
        if (rect3 != null) {
            rect = rect3;
        } else {
            Rational rational = this.write;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect = new android.graphics.Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                ImageCapture1 imageCapture1RatingCompat2 = RatingCompat();
                Objects.requireNonNull(imageCapture1RatingCompat2);
                int iSerializer = serializer(imageCapture1RatingCompat2, false);
                Rational rational2 = new Rational(this.write.getDenominator(), this.write.getNumerator());
                if (!MediaStoreVideoCannotWrite.serializer(iSerializer)) {
                    rational2 = this.write;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    setInflatedId.read("ImageUtil", "Invalid view ratio.");
                } else {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int iRound2 = Math.round((f / numerator) * denominator);
                        i3 = (height - iRound2) / 2;
                        i2 = iRound2;
                        iRound = width;
                        i = 0;
                    } else {
                        iRound = Math.round((f2 / denominator) * numerator);
                        i = (width - iRound) / 2;
                        i2 = height;
                        i3 = 0;
                    }
                    rect2 = new android.graphics.Rect(i, i3, iRound + i, i2 + i3);
                }
                Objects.requireNonNull(rect2);
                rect = rect2;
            }
        }
        android.graphics.Matrix matrix = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int iSerializer2 = serializer(imageCapture1RatingCompat, false);
        UseCase useCase = (UseCase) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = UseCase.MediaBrowserCompatMediaItem;
        if (useCase.read(jpegCaptureDownsizingQuirk)) {
            iIntValue = ((Integer) useCase.write(jpegCaptureDownsizingQuirk)).intValue();
        } else {
            int i4 = this.serializer;
            if (i4 == 0) {
                iIntValue = 100;
            } else {
                if (i4 != 1 && i4 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i4, "CaptureMode ", " is invalid"));
                    return;
                }
                iIntValue = 95;
            }
        }
        int i5 = iIntValue;
        List listUnmodifiableList = Collections.unmodifiableList(this.PlaybackStateCompat.MediaDescriptionCompat);
        coil3.util.UtilsKt.IconCompatParcelizer("onDiskCallback and outputFileOptions should be both null or both non-null.", true);
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = new ExtraSupportedOutputSizeQuirk(executor, setsubtitletextcolor, valueof, rect, matrix, iSerializer2, i5, this.serializer, z, listUnmodifiableList);
        if (z) {
            Boolean bool = Boolean.FALSE;
            HashMap map = extraSupportedOutputSizeQuirk.read;
            map.put(32, bool);
            map.put(Integer.valueOf(androidx.compose.ui.graphics.Fields.RotationX), bool);
        }
        PrematureEndOfStreamVideoQuirk.write();
        incorrectCaptureStateQuirk.write.offer(extraSupportedOutputSizeQuirk);
        incorrectCaptureStateQuirk.IconCompatParcelizer();
    }

    public setNavigationOnClickListener(UseCase useCase) {
        super(useCase);
        this.MediaDescriptionCompat = new AtomicReference(null);
        this.RemoteActionCompatParcelizer = -1;
        this.write = null;
        this.MediaBrowserCompatMediaItem = new ImageCapture$1(0, this);
        UseCase useCase2 = (UseCase) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = UseCase.RemoteActionCompatParcelizer;
        if (useCase2.read(jpegCaptureDownsizingQuirk)) {
            this.serializer = ((Integer) useCase2.write(jpegCaptureDownsizingQuirk)).intValue();
        } else {
            this.serializer = 1;
        }
        this.MediaSessionCompatQueueItem = ((Integer) useCase2.read(UseCase.IconCompatParcelizer, 0)).intValue();
        this.RatingCompat = new getBitmap((setTitleMarginBottom) useCase2.read(UseCase.MediaDescriptionCompat, null));
    }

    @Override // androidx.camera.core.UseCase
    public final void f_() {
        coil3.util.UtilsKt.IconCompatParcelizer(RatingCompat(), "Attached camera cannot be null");
        if (read() == 3) {
            ImageCapture1 imageCapture1RatingCompat = RatingCompat();
            if (imageCapture1RatingCompat == null || imageCapture1RatingCompat.ResultReceiver().MediaBrowserCompatMediaItem() != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(MediaSessionCompatToken());
    }
}

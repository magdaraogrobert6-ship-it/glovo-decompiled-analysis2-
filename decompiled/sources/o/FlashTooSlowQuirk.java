package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import android.os.Build;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCapture$Metadata;
import androidx.transition.Transition$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.Timestamp;
import com.sentiance.okhttp3.u$a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class FlashTooSlowQuirk {
    public Timestamp.Companion IconCompatParcelizer;
    public androidx.camera.view.PendingValue MediaBrowserCompatMediaItem;
    public toContentCaptureSession MediaDescriptionCompat;
    public Transition$1 MediaMetadataCompat;
    public toContentCaptureSession MediaSessionCompatQueueItem;
    public com.huawei.hmf.tasks.a.j MediaSessionCompatResultReceiverWrapper;
    public Timestamp.Companion MediaSessionCompatToken;
    public final u$a ParcelableVolumeInfo;
    public Transition$1 PlaybackStateCompat;
    public CaptureSessionShouldUseMrirQuirk RatingCompat;
    public final Executor RemoteActionCompatParcelizer;
    public final boolean read;
    public androidx.camera.view.PendingValue serializer;
    public final CameraCharacteristics write;

    public FlashTooSlowQuirk(Executor executor, CameraCharacteristics cameraCharacteristics) {
        u$a u_a = getSurfaceProvider.read;
        if (getSurfaceProvider.read.read(androidx.camera.core.internal.compat.quirk.LowMemoryQuirk.class) != null) {
            this.RemoteActionCompatParcelizer = new PreviewFreezeAfterHighSpeedRecordingQuirk(executor);
        } else {
            this.RemoteActionCompatParcelizer = executor;
        }
        this.write = cameraCharacteristics;
        this.ParcelableVolumeInfo = u_a;
        this.read = u_a.RemoteActionCompatParcelizer(androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class);
    }

    public final ImageCapture$1 IconCompatParcelizer(CaptureSessionStuckQuirk captureSessionStuckQuirk) throws Exception {
        ArrayList arrayList = this.RatingCompat.read;
        coil3.util.UtilsKt.serializer(!arrayList.isEmpty());
        Integer num = (Integer) arrayList.get(0);
        int iIntValue = num.intValue();
        coil3.util.UtilsKt.IconCompatParcelizer("On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num, androidx.camera.core.internal.utils.ImageUtil.read(iIntValue) || iIntValue == 32);
        ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = captureSessionStuckQuirk.write;
        valueOf valueof = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaMetadataCompat;
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaSessionCompatResultReceiverWrapper;
        int i = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer;
        coil3.util.UtilsKt.IconCompatParcelizer("OutputFileOptions cannot be empty", valueof != null);
        getViewPort getviewport = (getViewPort) this.MediaSessionCompatQueueItem.read(captureSessionStuckQuirk);
        getViewPort getviewport2 = null;
        if (arrayList.size() > 1) {
            coil3.util.UtilsKt.IconCompatParcelizer("The number of OutputFileOptions for simultaneous capture should be at least two", false);
            if (getviewport.serializer != 32) {
                throw null;
            }
            Objects.requireNonNull(valueof);
            ImageCapture$1 imageCapture$1Serializer = serializer(getviewport, valueof);
            extraSupportedOutputSizeQuirk.read(32);
            return imageCapture$1Serializer;
        }
        if (iIntValue == 32) {
            Objects.requireNonNull(valueof);
            return serializer(getviewport, valueof);
        }
        Objects.requireNonNull(valueof);
        getViewPort getviewport3 = (getViewPort) this.MediaBrowserCompatMediaItem.IconCompatParcelizer((Object) new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk(getviewport, i));
        if (MediaStoreVideoCannotWrite.write(getviewport3.RemoteActionCompatParcelizer, getviewport3.MediaSessionCompatQueueItem)) {
            coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, androidx.camera.core.internal.utils.ImageUtil.read(getviewport3.serializer));
            this.MediaDescriptionCompat.getClass();
            android.graphics.Rect rect = getviewport3.RemoteActionCompatParcelizer;
            byte[] bArr = (byte[]) getviewport3.read;
            try {
                Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = getviewport3.IconCompatParcelizer;
                Objects.requireNonNull(deactivateEncoderSurfaceBeforeStopEncoderQuirk);
                android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                int i2 = getviewport3.MediaMetadataCompat;
                android.graphics.Matrix matrix = getviewport3.MediaBrowserCompatMediaItem;
                RectF rectF = MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer;
                android.graphics.Matrix matrix2 = new android.graphics.Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = getviewport3.write;
                android.util.Size size = new android.util.Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
                if (cameraXExternalSyntheticLambda0 != null) {
                    this.IconCompatParcelizer.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                    getviewport2 = new getViewPort(byteArrayOutputStream.toByteArray(), deactivateEncoderSurfaceBeforeStopEncoderQuirk, (Build.VERSION.SDK_INT < 34 || !saveFocusedChild.IconCompatParcelizer(bitmapDecodeRegion)) ? androidx.compose.ui.graphics.Fields.RotationX : 4101, size, rect2, i2, matrix2, cameraXExternalSyntheticLambda0);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null cameraCaptureResult");
                }
            } catch (IOException e) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to decode JPEG.", e);
            }
        } else {
            getviewport2 = getviewport3;
        }
        com.huawei.hmf.tasks.a.j jVar = this.MediaSessionCompatResultReceiverWrapper;
        Objects.requireNonNull(valueof);
        jVar.getClass();
        File fileIconCompatParcelizer = runInTransaction.IconCompatParcelizer(valueof);
        byte[] bArr2 = (byte[]) getviewport2.read;
        try {
            FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(fileIconCompatParcelizer), fileIconCompatParcelizer);
            try {
                int i3 = 7;
                fileOutputStreamWrite.write(bArr2, 0, new androidx.camera.view.PendingValue(7).RemoteActionCompatParcelizer(bArr2));
                fileOutputStreamWrite.close();
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk2 = getviewport2.IconCompatParcelizer;
                Objects.requireNonNull(deactivateEncoderSurfaceBeforeStopEncoderQuirk2);
                int i4 = getviewport2.MediaMetadataCompat;
                try {
                    getE gete = DeactivateEncoderSurfaceBeforeStopEncoderQuirk.serializer;
                    takeOrElse3MmeM6k takeorelse3mmem6k = new takeOrElse3MmeM6k(fileIconCompatParcelizer.toString());
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk3 = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk(takeorelse3mmem6k);
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk2.IconCompatParcelizer(deactivateEncoderSurfaceBeforeStopEncoderQuirk3);
                    if (deactivateEncoderSurfaceBeforeStopEncoderQuirk3.write() == 0 && i4 != 0) {
                        deactivateEncoderSurfaceBeforeStopEncoderQuirk3.IconCompatParcelizer(i4);
                    }
                    if (((ImageCapture$Metadata) valueof.IconCompatParcelizer).IconCompatParcelizer) {
                        switch (takeorelse3mmem6k.serializer(0, "Orientation")) {
                            case 2:
                                i3 = 1;
                                break;
                            case 3:
                                i3 = 4;
                                break;
                            case 4:
                                i3 = 3;
                                break;
                            case 5:
                                i3 = 6;
                                break;
                            case 6:
                                i3 = 5;
                                break;
                            case 7:
                                i3 = 8;
                                break;
                            case 8:
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                        takeorelse3mmem6k.write("Orientation", String.valueOf(i3));
                    }
                    deactivateEncoderSurfaceBeforeStopEncoderQuirk3.RemoteActionCompatParcelizer();
                    return new ImageCapture$1(27, runInTransaction.RemoteActionCompatParcelizer(fileIconCompatParcelizer, valueof));
                } catch (IOException e2) {
                    throw new androidx.camera.core.ImageCaptureException(1, "Failed to update Exif data", e2);
                }
            } catch (Throwable th) {
                try {
                    fileOutputStreamWrite.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to temp file", e3);
        }
    }

    public final getInflatedId serializer(CaptureSessionStuckQuirk captureSessionStuckQuirk) {
        ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = captureSessionStuckQuirk.write;
        getViewPort getviewport = (getViewPort) this.MediaSessionCompatQueueItem.read(captureSessionStuckQuirk);
        ArrayList arrayList = this.RatingCompat.read;
        coil3.util.UtilsKt.serializer(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        if ((getviewport.serializer == 35 || this.read) && iIntValue == 256) {
            getViewPort getviewport2 = (getViewPort) this.MediaBrowserCompatMediaItem.IconCompatParcelizer((Object) new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk(getviewport, imageCaptureFailedWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer));
            android.util.Size size = getviewport2.MediaSessionCompatQueueItem;
            this.MediaSessionCompatToken.getClass();
            AuthPromptFailureException authPromptFailureException = new AuthPromptFailureException(r8lambda4MdKbfiHpQQwW57A4NP6ZCybbFA.IconCompatParcelizer(size.getWidth(), size.getHeight(), androidx.compose.ui.graphics.Fields.RotationX, 2));
            getInflatedId getinflatedidWrite = androidx.camera.core.ImageProcessingUtil.write(authPromptFailureException, (byte[]) getviewport2.read);
            authPromptFailureException.MediaSessionCompatQueueItem();
            Objects.requireNonNull(getinflatedidWrite);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = getviewport2.IconCompatParcelizer;
            Objects.requireNonNull(deactivateEncoderSurfaceBeforeStopEncoderQuirk);
            android.graphics.Rect rect = getviewport2.RemoteActionCompatParcelizer;
            int i = getviewport2.MediaMetadataCompat;
            android.graphics.Matrix matrix = getviewport2.MediaBrowserCompatMediaItem;
            CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0 = getviewport2.write;
            getTitleTextView gettitletextview = (getTitleTextView) getinflatedidWrite;
            android.util.Size size2 = new android.util.Size(gettitletextview.RatingCompat(), gettitletextview.serializer());
            gettitletextview.write();
            getviewport = new getViewPort(getinflatedidWrite, deactivateEncoderSurfaceBeforeStopEncoderQuirk, gettitletextview.write(), size2, rect, i, matrix, cameraXExternalSyntheticLambda0);
        }
        this.PlaybackStateCompat.getClass();
        getInflatedId getinflatedid = (getInflatedId) getviewport.read;
        FeatureCombinationQueryImplExternalSyntheticLambda2 featureCombinationQueryImplExternalSyntheticLambda2 = new FeatureCombinationQueryImplExternalSyntheticLambda2(getinflatedid, getviewport.MediaSessionCompatQueueItem, new getCollapseIcon(getinflatedid.read().IconCompatParcelizer(), getinflatedid.read().serializer(), getviewport.MediaMetadataCompat, getviewport.MediaBrowserCompatMediaItem, getinflatedid.read().RemoteActionCompatParcelizer()));
        featureCombinationQueryImplExternalSyntheticLambda2.read(getviewport.RemoteActionCompatParcelizer);
        if (arrayList.size() > 1) {
            imageCaptureFailedWhenVideoCaptureIsBoundQuirk.MediaSessionCompatResultReceiverWrapper.read(featureCombinationQueryImplExternalSyntheticLambda2.write());
        }
        return featureCombinationQueryImplExternalSyntheticLambda2;
    }

    public final ImageCapture$1 serializer(getViewPort getviewport, valueOf valueof) throws Exception {
        int i = 0;
        if (this.serializer == null) {
            CameraCharacteristics cameraCharacteristics = this.write;
            if (cameraCharacteristics == null) {
                throw new androidx.camera.core.ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (getviewport.write.IconCompatParcelizer() == null) {
                throw new androidx.camera.core.ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResultIconCompatParcelizer = getviewport.write.IconCompatParcelizer();
            Objects.requireNonNull(captureResultIconCompatParcelizer);
            DngCreator dngCreator = new DngCreator(cameraCharacteristics, captureResultIconCompatParcelizer);
            androidx.camera.view.PendingValue pendingValue = new androidx.camera.view.PendingValue(1, false);
            pendingValue.serializer = dngCreator;
            this.serializer = pendingValue;
        }
        androidx.camera.view.PendingValue pendingValue2 = this.serializer;
        getInflatedId getinflatedid = (getInflatedId) getviewport.read;
        int i2 = getviewport.MediaMetadataCompat;
        Objects.requireNonNull(valueof);
        if (getinflatedid == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null imageProxy");
            return null;
        }
        pendingValue2.getClass();
        File fileIconCompatParcelizer = runInTransaction.IconCompatParcelizer(valueof);
        DngCreator dngCreator2 = (DngCreator) pendingValue2.serializer;
        try {
            try {
                try {
                    FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(fileIconCompatParcelizer), fileIconCompatParcelizer);
                    if (i2 == 0) {
                        i = 1;
                    } else if (i2 == 90) {
                        i = 6;
                    } else if (i2 == 180) {
                        i = 3;
                    } else if (i2 == 270) {
                        i = 8;
                    }
                    try {
                        dngCreator2.setOrientation(i);
                        dngCreator2.writeImage(fileOutputStreamWrite, getinflatedid.RemoteActionCompatParcelizer());
                        fileOutputStreamWrite.close();
                        getinflatedid.close();
                        return new ImageCapture$1(27, runInTransaction.RemoteActionCompatParcelizer(fileIconCompatParcelizer, valueof));
                    } catch (Throwable th) {
                        try {
                            fileOutputStreamWrite.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to temp file", e);
                }
            } catch (IllegalArgumentException e2) {
                throw new androidx.camera.core.ImageCaptureException(1, "Image with an unsupported format was used", e2);
            } catch (IllegalStateException e3) {
                throw new androidx.camera.core.ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e3);
            }
        } catch (Throwable th3) {
            getinflatedid.close();
            throw th3;
        }
    }
}

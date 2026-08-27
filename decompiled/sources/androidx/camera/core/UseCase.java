package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import o.AfRegionFlipHorizontallyQuirk;
import o.AspectRatioLegacyApi21Quirk;
import o.AuthenticatorUtils;
import o.AutoFlashUnderExposedQuirk;
import o.Camera2CameraControlImpl;
import o.Camera2CapturePipelineScreenFlashTask;
import o.Camera2DeviceSurfaceManager;
import o.CameraManagerCompatApi29Impl;
import o.CameraProviderInitRetryPolicy;
import o.ImageCapture1;
import o.ImageCaptureMetadata;
import o.ImageUtilCodecFailedException;
import o.JpegCaptureDownsizingQuirk;
import o.MediaStoreVideoCannotWrite;
import o.PreviewExternalSyntheticLambda0;
import o.Recorder3;
import o.SmallDisplaySizeQuirk;
import o.StreamSharingExternalSyntheticLambda0;
import o.UseCaseAdditionSimulator;
import o.abandonFocus;
import o.copyWithMergingEnabledui;
import o.getCameraProvider;
import o.getFeatureGroupUseCaseType;
import o.getImageFormatdefault;
import o.getNavigationIcon;
import o.getPreviewStreamState;
import o.mapToBase;
import o.nativeGetYUVImageVUOff;
import o.setInflatedId;
import o.setUseCompatPadding;
import o.values;

/* JADX INFO: loaded from: classes.dex */
public abstract class UseCase {
    public ImageUtilCodecFailedException ComponentActivity;
    public SmallDisplaySizeQuirk MediaSessionCompatToken;
    public ImageUtilCodecFailedException r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public ImageCapture1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public ImageUtilCodecFailedException r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public HashSet r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public ImageCapture1 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public Rect r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public ImageUtilCodecFailedException r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
    public final HashSet r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new HashSet();
    public final Object ResultReceiver = new Object();
    public values r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = values.INACTIVE;
    public Matrix r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Matrix();
    public mapToBase MediaSessionCompatResultReceiverWrapper = mapToBase.IconCompatParcelizer();
    public mapToBase PlaybackStateCompatCustomAction = mapToBase.IconCompatParcelizer();

    public abstract ImageUtilCodecFailedException IconCompatParcelizer(boolean z, Recorder3 recorder3);

    public abstract StreamSharingExternalSyntheticLambda0 IconCompatParcelizer(o.InitializationException initializationException);

    public void MediaBrowserCompatMediaItem() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = false;
    }

    public abstract ImageUtilCodecFailedException RemoteActionCompatParcelizer(o.FocusMeteringAction focusMeteringAction, StreamSharingExternalSyntheticLambda0 streamSharingExternalSyntheticLambda0);

    public abstract SmallDisplaySizeQuirk RemoteActionCompatParcelizer(o.InitializationException initializationException);

    public void ResultReceiver() {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
    }

    public Set e_() {
        return Collections.EMPTY_SET;
    }

    public void f_() {
    }

    public void g_() {
    }

    public Set read(o.FocusMeteringAction focusMeteringAction) {
        return null;
    }

    public void serializer() {
    }

    public abstract SmallDisplaySizeQuirk write(SmallDisplaySizeQuirk smallDisplaySizeQuirk, SmallDisplaySizeQuirk smallDisplaySizeQuirk2);

    public void write(Rect rect) {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = rect;
    }

    public void IconCompatParcelizer(Matrix matrix) {
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Matrix(matrix);
    }

    public final ImageCaptureMetadata MediaDescriptionCompat() {
        synchronized (this.ResultReceiver) {
            ImageCapture1 imageCapture1 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (imageCapture1 == null) {
                return ImageCaptureMetadata.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            }
            return imageCapture1.MediaSessionCompatQueueItem();
        }
    }

    public final int MediaMetadataCompat() {
        return ((Integer) ((getImageFormatdefault) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read(getImageFormatdefault.c_, -1)).intValue();
    }

    public final int MediaSessionCompatResultReceiverWrapper() {
        return ((getImageFormatdefault) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).write(0);
    }

    public final void ParcelableVolumeInfo() {
        Iterator it = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.iterator();
        while (it.hasNext()) {
            ((Camera2CapturePipelineScreenFlashTask) it.next()).IconCompatParcelizer(this);
        }
    }

    public final ImageCapture1 PlaybackStateCompat() {
        ImageCapture1 imageCapture1;
        synchronized (this.ResultReceiver) {
            imageCapture1 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        return imageCapture1;
    }

    public final ImageCapture1 RatingCompat() {
        ImageCapture1 imageCapture1;
        synchronized (this.ResultReceiver) {
            imageCapture1 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        return imageCapture1;
    }

    public final void RemoteActionCompatParcelizer(ImageCapture1 imageCapture1, ImageCapture1 imageCapture2, ImageUtilCodecFailedException imageUtilCodecFailedException, ImageUtilCodecFailedException imageUtilCodecFailedException2) {
        synchronized (this.ResultReceiver) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = imageCapture1;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = imageCapture2;
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.add(imageCapture1);
            if (imageCapture2 != null) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.add(imageCapture2);
            }
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = imageUtilCodecFailedException;
        this.ComponentActivity = imageUtilCodecFailedException2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = read(imageCapture1.MediaMetadataCompat(), this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.ComponentActivity);
        f_();
    }

    public final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int iOrdinal = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.ordinal();
        HashSet hashSet = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Camera2CapturePipelineScreenFlashTask) it.next()).serializer(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((Camera2CapturePipelineScreenFlashTask) it2.next()).RemoteActionCompatParcelizer(this);
            }
        }
    }

    public final ImageUtilCodecFailedException read(o.FocusMeteringAction focusMeteringAction, ImageUtilCodecFailedException imageUtilCodecFailedException, ImageUtilCodecFailedException imageUtilCodecFailedException2) {
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer;
        if (imageUtilCodecFailedException2 != null) {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(imageUtilCodecFailedException2);
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.remove(getPreviewStreamState.PlaybackStateCompat);
        } else {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        }
        TreeMap treeMap = cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(getImageFormatdefault.j_) || this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.read(getImageFormatdefault.k_)) {
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = getImageFormatdefault.h_;
            if (treeMap.containsKey(jpegCaptureDownsizingQuirk)) {
                treeMap.remove(jpegCaptureDownsizingQuirk);
            }
        }
        ImageUtilCodecFailedException imageUtilCodecFailedException3 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = getImageFormatdefault.h_;
        if (imageUtilCodecFailedException3.read(jpegCaptureDownsizingQuirk2)) {
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk3 = getImageFormatdefault.f_;
            if (treeMap.containsKey(jpegCaptureDownsizingQuirk3) && ((setUseCompatPadding) this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write(jpegCaptureDownsizingQuirk2)).IconCompatParcelizer != null) {
                treeMap.remove(jpegCaptureDownsizingQuirk3);
            }
        }
        Iterator it = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.MediaBrowserCompatMediaItem().iterator();
        while (it.hasNext()) {
            o.InitializationException.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer, cameraProviderInitRetryPolicyRemoteActionCompatParcelizer, this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, (JpegCaptureDownsizingQuirk) it.next());
        }
        if (imageUtilCodecFailedException != null) {
            for (JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk4 : imageUtilCodecFailedException.MediaBrowserCompatMediaItem()) {
                if (!jpegCaptureDownsizingQuirk4.RemoteActionCompatParcelizer.equals(getPreviewStreamState.PlaybackStateCompat.RemoteActionCompatParcelizer)) {
                    o.InitializationException.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer, cameraProviderInitRetryPolicyRemoteActionCompatParcelizer, imageUtilCodecFailedException, jpegCaptureDownsizingQuirk4);
                }
            }
        }
        if (treeMap.containsKey(getImageFormatdefault.k_)) {
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk5 = getImageFormatdefault.j_;
            if (treeMap.containsKey(jpegCaptureDownsizingQuirk5)) {
                treeMap.remove(jpegCaptureDownsizingQuirk5);
            }
        }
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk6 = getImageFormatdefault.h_;
        if (treeMap.containsKey(jpegCaptureDownsizingQuirk6)) {
            ((setUseCompatPadding) cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.write(jpegCaptureDownsizingQuirk6)).getClass();
        }
        Objects.toString(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        toString();
        setInflatedId.IconCompatParcelizer(3, "UseCase");
        HashSet<Camera2DeviceSurfaceManager> hashSet = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (hashSet != null) {
            int i = CameraManagerCompatApi29Impl.read;
            Range range = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
            AutoFlashUnderExposedQuirk autoFlashUnderExposedQuirk = AspectRatioLegacyApi21Quirk.write;
            getNavigationIcon getnavigationicon = getNavigationIcon.MediaDescriptionCompat;
            for (Camera2DeviceSurfaceManager camera2DeviceSurfaceManager : hashSet) {
                if (camera2DeviceSurfaceManager instanceof CameraManagerCompatApi29Impl) {
                    getnavigationicon = ((CameraManagerCompatApi29Impl) camera2DeviceSurfaceManager).RemoteActionCompatParcelizer;
                } else if (camera2DeviceSurfaceManager instanceof AfRegionFlipHorizontallyQuirk) {
                    AfRegionFlipHorizontallyQuirk afRegionFlipHorizontallyQuirk = (AfRegionFlipHorizontallyQuirk) camera2DeviceSurfaceManager;
                    range = new Range(Integer.valueOf(afRegionFlipHorizontallyQuirk.serializer), Integer.valueOf(afRegionFlipHorizontallyQuirk.read));
                } else if (camera2DeviceSurfaceManager instanceof AspectRatioLegacyApi21Quirk) {
                    autoFlashUnderExposedQuirk = ((AspectRatioLegacyApi21Quirk) camera2DeviceSurfaceManager).read;
                }
            }
            if ((this instanceof AuthenticatorUtils) || CameraUseCaseAdapter.IconCompatParcelizer(this)) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getFeatureGroupUseCaseType.a_, getnavigationicon);
            }
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, range);
            int i2 = Camera2CameraControlImpl.RemoteActionCompatParcelizer[autoFlashUnderExposedQuirk.ordinal()];
            if (i2 == 1) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 1);
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, 1);
            } else if (i2 == 2) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 0);
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, 2);
            } else if (i2 == 3) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 2);
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, 0);
            }
        }
        return RemoteActionCompatParcelizer(focusMeteringAction, IconCompatParcelizer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer));
    }

    public final void serializer(UseCaseAdditionSimulator useCaseAdditionSimulator, SmallDisplaySizeQuirk smallDisplaySizeQuirk) {
        Range range = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
        if (!range.equals(smallDisplaySizeQuirk.IconCompatParcelizer)) {
            Range range2 = smallDisplaySizeQuirk.IconCompatParcelizer;
            abandonFocus abandonfocus = useCaseAdditionSimulator.serializer;
            abandonfocus.getClass();
            ((CameraProviderInitRetryPolicy) abandonfocus.RemoteActionCompatParcelizer).IconCompatParcelizer(nativeGetYUVImageVUOff.write, range2);
            return;
        }
        synchronized (this.ResultReceiver) {
            ImageCapture1 imageCapture1 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            imageCapture1.getClass();
            ArrayList arrayListSerializer = imageCapture1.MediaMetadataCompat().serializer().serializer(AeFpsRangeQuirk.class);
            boolean z = true;
            if (arrayListSerializer.size() > 1) {
                z = false;
            }
            UtilsKt.IconCompatParcelizer("There should not have more than one AeFpsRangeQuirk.", z);
            if (!arrayListSerializer.isEmpty()) {
                Range range3 = ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) arrayListSerializer.get(0))).IconCompatParcelizer;
                if (range3 != null) {
                    range = range3;
                }
                abandonFocus abandonfocus2 = useCaseAdditionSimulator.serializer;
                abandonfocus2.getClass();
                ((CameraProviderInitRetryPolicy) abandonfocus2.RemoteActionCompatParcelizer).IconCompatParcelizer(nativeGetYUVImageVUOff.write, range);
            }
        }
    }

    public final boolean write(int i) {
        Size size;
        int iWrite = ((getImageFormatdefault) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).write(-1);
        if (iWrite != -1 && iWrite == i) {
            return false;
        }
        StreamSharingExternalSyntheticLambda0 streamSharingExternalSyntheticLambda0IconCompatParcelizer = IconCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
        getImageFormatdefault getimageformatdefault = (getImageFormatdefault) streamSharingExternalSyntheticLambda0IconCompatParcelizer.RemoteActionCompatParcelizer();
        int iWrite2 = getimageformatdefault.write(-1);
        if (iWrite2 == -1 || iWrite2 != i) {
            getCameraProvider getcameraprovider = (getCameraProvider) streamSharingExternalSyntheticLambda0IconCompatParcelizer;
            int i2 = getcameraprovider.IconCompatParcelizer;
            if (i2 == 0) {
                CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy = getcameraprovider.serializer;
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getImageFormatdefault.l_, Integer.valueOf(i));
                cameraProviderInitRetryPolicy.IconCompatParcelizer(getImageFormatdefault.c_, Integer.valueOf(i));
            } else if (i2 == 1 || i2 != 2) {
                getcameraprovider.serializer.IconCompatParcelizer(getImageFormatdefault.l_, Integer.valueOf(i));
            } else {
                getcameraprovider.serializer.IconCompatParcelizer(getImageFormatdefault.l_, Integer.valueOf(i));
            }
        }
        if (iWrite2 != -1 && i != -1 && iWrite2 != i) {
            if (Math.abs(copyWithMergingEnabledui.serializer(i) - copyWithMergingEnabledui.serializer(iWrite2)) % 180 == 90 && (size = (Size) getimageformatdefault.read(getImageFormatdefault.k_, null)) != null) {
                getCameraProvider getcameraprovider2 = (getCameraProvider) streamSharingExternalSyntheticLambda0IconCompatParcelizer;
                Size size2 = new Size(size.getHeight(), size.getWidth());
                int i3 = getcameraprovider2.IconCompatParcelizer;
                if (i3 != 0 && i3 != 1 && i3 != 2) {
                    throw new UnsupportedOperationException("setTargetResolution is not supported.");
                }
                getcameraprovider2.serializer.IconCompatParcelizer(getImageFormatdefault.k_, size2);
            }
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = streamSharingExternalSyntheticLambda0IconCompatParcelizer.RemoteActionCompatParcelizer();
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        if (imageCapture1RatingCompat == null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        } else {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = read(imageCapture1RatingCompat.MediaMetadataCompat(), this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.ComponentActivity);
        }
        return true;
    }

    public final boolean write(ImageCapture1 imageCapture1) {
        int iIntValue = ((Integer) ((getImageFormatdefault) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read(getImageFormatdefault.g_, -1)).intValue();
        if (iIntValue == -1 || iIntValue == 0) {
            return false;
        }
        if (iIntValue == 1) {
            return true;
        }
        if (iIntValue == 2) {
            return imageCapture1.d_();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) c8$$ExternalSyntheticOutline0.m(iIntValue, "Unknown mirrorMode: "));
        return false;
    }

    public final void RemoteActionCompatParcelizer(ImageCapture1 imageCapture1) {
        serializer();
        synchronized (this.ResultReceiver) {
            ImageCapture1 imageCapture2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (imageCapture1 == imageCapture2) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.remove(imageCapture2);
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            }
            ImageCapture1 imageCapture3 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (imageCapture1 == imageCapture3) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.remove(imageCapture3);
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            }
        }
        this.MediaSessionCompatToken = null;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = null;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        this.ComponentActivity = null;
    }

    public UseCase(ImageUtilCodecFailedException imageUtilCodecFailedException) {
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = imageUtilCodecFailedException;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = imageUtilCodecFailedException;
    }

    public final int serializer(ImageCapture1 imageCapture1, boolean z) {
        int iRemoteActionCompatParcelizer = imageCapture1.MediaMetadataCompat().RemoteActionCompatParcelizer(MediaSessionCompatResultReceiverWrapper());
        return (imageCapture1.c_() || !z) ? iRemoteActionCompatParcelizer : MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer(-iRemoteActionCompatParcelizer);
    }

    public final String MediaSessionCompatToken() {
        String str = (String) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(getPreviewStreamState.PlaybackStateCompat, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final String PlaybackStateCompatCustomAction() {
        ImageCapture1 imageCapture1RatingCompat = RatingCompat();
        UtilsKt.IconCompatParcelizer(imageCapture1RatingCompat, "No camera attached to use case: " + this);
        return imageCapture1RatingCompat.MediaMetadataCompat().read();
    }

    public final void RemoteActionCompatParcelizer(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = (mapToBase) list.get(0);
        if (list.size() > 1) {
            this.PlaybackStateCompatCustomAction = (mapToBase) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 : ((mapToBase) it.next()).RemoteActionCompatParcelizer()) {
                if (previewExternalSyntheticLambda0.MediaDescriptionCompat == null) {
                    previewExternalSyntheticLambda0.MediaDescriptionCompat = getClass();
                }
            }
        }
    }
}

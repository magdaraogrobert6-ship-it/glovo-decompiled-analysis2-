package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCapture$1;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgh;
import com.huawei.location.lite.common.util.DeviceInfoUtil$DeviceType;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class setLineHeight implements FocusMeteringAction {
    public final u$a MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final MediaFormatMustNotUseFrameRateToFindEncoderQuirk MediaSessionCompatQueueItem;
    public final getThumbTintList RemoteActionCompatParcelizer;
    public final ImageCapture$1 read;
    public androidx.camera.camera2.internal.Camera2CameraControlImpl serializer;
    public final DeviceInfoUtil$DeviceType write;
    public final Object RatingCompat = new Object();
    public MediaFormatMustNotUseFrameRateToFindEncoderQuirk MediaMetadataCompat = null;
    public MediaFormatMustNotUseFrameRateToFindEncoderQuirk PlaybackStateCompat = null;
    public ArrayList IconCompatParcelizer = null;

    @Override // o.FocusMeteringAction
    public final shutdown MediaMetadataCompat() {
        return this.write;
    }

    @Override // o.FocusMeteringAction
    public final String read() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.FocusMeteringAction
    public final u$a serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.FocusMeteringAction
    public final accessunregisterComponentCallback write() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.FocusMeteringAction
    public final boolean ComponentActivity() {
        getThumbTintList getthumbtintlist = this.RemoteActionCompatParcelizer;
        Objects.requireNonNull(getthumbtintlist);
        return getMotionEventToComposePointerIdMapui.serializer(new setStacked(getthumbtintlist, 0));
    }

    @Override // o.FocusMeteringAction
    public final Object IconCompatParcelizer() {
        return (CameraCharacteristics) this.RemoteActionCompatParcelizer.read.MediaSessionCompatQueueItem;
    }

    @Override // o.FocusMeteringAction
    public final int MediaBrowserCompatMediaItem() {
        Integer num = (Integer) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.LENS_FACING);
        coil3.util.UtilsKt.IconCompatParcelizer("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        setInflatedId.read("LensFacingUtil", "The given lens facing integer: " + iIntValue + " can not be recognized.");
        return -1;
    }

    @Override // o.FocusMeteringAction
    public final android.graphics.Rect MediaSessionCompatQueueItem() {
        android.graphics.Rect rect = (android.graphics.Rect) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new android.graphics.Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // o.FocusMeteringAction
    public final List MediaSessionCompatResultReceiverWrapper() {
        android.util.Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((ImageCapture$1) this.RemoteActionCompatParcelizer.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getHighSpeedVideoSizes();
        return highSpeedVideoSizes != null ? Arrays.asList(highSpeedVideoSizes) : Collections.EMPTY_LIST;
    }

    @Override // o.FocusMeteringAction
    public final Set MediaSessionCompatToken() {
        return ((setSplitTrack) getTrackTintList.serializer(this.RemoteActionCompatParcelizer).serializer).serializer();
    }

    @Override // o.FocusMeteringAction
    public final PreviewGreenTintQuirk ParcelableVolumeInfo() {
        Integer num = (Integer) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? PreviewGreenTintQuirk.UPTIME : PreviewGreenTintQuirk.REALTIME;
    }

    @Override // o.FocusMeteringAction
    public final Set PlaybackStateCompat() {
        int[] outputFormats;
        ImageCapture$1 imageCapture$1 = (ImageCapture$1) this.RemoteActionCompatParcelizer.serializer().MediaSessionCompatQueueItem;
        imageCapture$1.getClass();
        try {
            outputFormats = ((StreamConfigurationMap) imageCapture$1.MediaSessionCompatQueueItem).getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e) {
            setInflatedId.RemoteActionCompatParcelizer("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
            outputFormats = null;
        }
        int[] iArr = outputFormats != null ? (int[]) outputFormats.clone() : null;
        if (iArr == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    @Override // o.FocusMeteringAction
    public final accessunregisterComponentCallback PlaybackStateCompatCustomAction() {
        synchronized (this.RatingCompat) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.serializer;
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.MediaMetadataCompat;
            if (camera2CameraControlImpl == null) {
                if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk == null) {
                    this.MediaMetadataCompat = new MediaFormatMustNotUseFrameRateToFindEncoderQuirk(0);
                }
                return this.MediaMetadataCompat;
            }
            if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
                return mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
            }
            return camera2CameraControlImpl.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.MediaDescriptionCompat;
        }
    }

    @Override // o.FocusMeteringAction
    public final String RatingCompat() {
        Integer num = (Integer) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // o.FocusMeteringAction
    public final int RemoteActionCompatParcelizer(int i) {
        Integer num = (Integer) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return copyWithMergingEnabledui.write(copyWithMergingEnabledui.serializer(i), num.intValue(), 1 == MediaBrowserCompatMediaItem());
    }

    @Override // o.FocusMeteringAction
    public final List RemoteActionCompatParcelizer(Range range) {
        android.util.Size[] highSpeedVideoSizesFor;
        try {
            highSpeedVideoSizesFor = ((StreamConfigurationMap) ((ImageCapture$1) this.RemoteActionCompatParcelizer.serializer().MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).getHighSpeedVideoSizesFor(range);
        } catch (IllegalArgumentException e) {
            setInflatedId.RemoteActionCompatParcelizer("Camera2CameraInfo", "Can't get high speed resolutions for " + range, e);
            highSpeedVideoSizesFor = null;
        }
        return highSpeedVideoSizesFor != null ? Arrays.asList(highSpeedVideoSizesFor) : Collections.EMPTY_LIST;
    }

    @Override // o.FocusMeteringAction
    public final Set RemoteActionCompatParcelizer() {
        HashSet hashSet = new HashSet();
        int[] iArr = (int[]) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        }
        return hashSet;
    }

    @Override // o.FocusMeteringAction
    public final void RemoteActionCompatParcelizer(StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk) {
        synchronized (this.RatingCompat) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.serializer;
            if (camera2CameraControlImpl != null) {
                camera2CameraControlImpl.MediaDescriptionCompat.execute(new CameraX$$ExternalSyntheticLambda2(camera2CameraControlImpl, 3, stillCaptureFlashStopRepeatingQuirk));
                return;
            }
            ArrayList arrayList = this.IconCompatParcelizer;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Pair) it.next()).first == stillCaptureFlashStopRepeatingQuirk) {
                    it.remove();
                }
            }
        }
    }

    @Override // o.FocusMeteringAction
    public final accessunregisterComponentCallback ResultReceiver() {
        synchronized (this.RatingCompat) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.serializer;
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.PlaybackStateCompat;
            if (camera2CameraControlImpl != null) {
                if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
                    return mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
                }
                return camera2CameraControlImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaBrowserCompatMediaItem;
            }
            if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk == null) {
                getSwitchMinWidth getswitchminwidthSerializer = androidx.camera.camera2.internal.ZoomControl.serializer(this.RemoteActionCompatParcelizer);
                getTextOn gettexton = new getTextOn(getswitchminwidthSerializer.IconCompatParcelizer(), getswitchminwidthSerializer.RemoteActionCompatParcelizer());
                gettexton.RemoteActionCompatParcelizer(1.0f);
                this.PlaybackStateCompat = new MediaFormatMustNotUseFrameRateToFindEncoderQuirk(getViewPortScaleType.read(gettexton));
            }
            return this.PlaybackStateCompat;
        }
    }

    @Override // o.FocusMeteringAction
    public final boolean r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        int[] iArr = (int[]) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.FocusMeteringAction
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int[] iArr = (int[]) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void read(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.RatingCompat) {
            this.serializer = camera2CameraControlImpl;
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.PlaybackStateCompat;
            if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk != null) {
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.serializer(camera2CameraControlImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.MediaBrowserCompatMediaItem);
            }
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 = this.MediaMetadataCompat;
            if (mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 != null) {
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk2.serializer(this.serializer.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.MediaDescriptionCompat);
            }
            ArrayList<Pair> arrayList = this.IconCompatParcelizer;
            if (arrayList != null) {
                for (Pair pair : arrayList) {
                    androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl2 = this.serializer;
                    camera2CameraControlImpl2.MediaDescriptionCompat.execute(new WorkerKt$$ExternalSyntheticLambda2(camera2CameraControlImpl2, (Executor) pair.second, (StillCaptureFlashStopRepeatingQuirk) pair.first, 1));
                }
                this.IconCompatParcelizer = null;
            }
        }
        ((Integer) this.RemoteActionCompatParcelizer.write(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
        setInflatedId.IconCompatParcelizer(4, "Camera2CameraInfo");
    }

    @Override // o.FocusMeteringAction
    public final List serializer(int i) {
        android.util.Size[] sizeArrIconCompatParcelizer = this.RemoteActionCompatParcelizer.serializer().IconCompatParcelizer(i);
        return sizeArrIconCompatParcelizer != null ? Arrays.asList(sizeArrIconCompatParcelizer) : Collections.EMPTY_LIST;
    }

    @Override // o.FocusMeteringAction
    public final void serializer(Executor executor, AbstractClickableNodeonPointerEvent1 abstractClickableNodeonPointerEvent1) {
        synchronized (this.RatingCompat) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.serializer;
            if (camera2CameraControlImpl != null) {
                camera2CameraControlImpl.MediaDescriptionCompat.execute(new WorkerKt$$ExternalSyntheticLambda2(camera2CameraControlImpl, executor, abstractClickableNodeonPointerEvent1, 1));
                return;
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new ArrayList();
            }
            this.IconCompatParcelizer.add(new Pair(abstractClickableNodeonPointerEvent1, executor));
        }
    }

    public setLineHeight(androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, String str) {
        str.getClass();
        this.MediaDescriptionCompat = str;
        getThumbTintList getthumbtintlistSerializer = cameraManagerCompat.serializer(str);
        this.RemoteActionCompatParcelizer = getthumbtintlistSerializer;
        ImageCapture$1 imageCapture$1 = new ImageCapture$1(22);
        imageCapture$1.MediaSessionCompatQueueItem = this;
        this.read = imageCapture$1;
        u$a u_a = zzgh.read(getthumbtintlistSerializer);
        this.MediaBrowserCompatMediaItem = u_a;
        this.write = new DeviceInfoUtil$DeviceType(str, u_a);
        this.MediaSessionCompatQueueItem = new MediaFormatMustNotUseFrameRateToFindEncoderQuirk(new getCurrentMenuItems(getLogo.CLOSED, null));
    }

    @Override // o.FocusMeteringAction
    public final int MediaDescriptionCompat() {
        return RemoteActionCompatParcelizer(0);
    }
}

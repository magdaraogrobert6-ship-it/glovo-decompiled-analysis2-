package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCapture$Metadata;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class abandonFocus {
    public final Object IconCompatParcelizer;
    public int MediaMetadataCompat;
    public final Object MediaSessionCompatQueueItem;
    public boolean RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public boolean serializer;
    public final Object write;

    public void read(StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk) {
        ArrayList arrayList = (ArrayList) this.write;
        if (arrayList.contains(stillCaptureFlashStopRepeatingQuirk)) {
            return;
        }
        arrayList.add(stillCaptureFlashStopRepeatingQuirk);
    }

    public void write(PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0) {
        ((HashSet) this.MediaSessionCompatQueueItem).add(previewExternalSyntheticLambda0);
    }

    public static boolean read(int i, TotalCaptureResult totalCaptureResult) {
        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    public getFixedWidthMajor read(int i, int i2, int i3) {
        boolean z;
        androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = (androidx.camera.camera2.internal.Camera2CameraControlImpl) this.MediaSessionCompatQueueItem;
        u$a u_a = (u$a) this.write;
        FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo = new FlowLayoutBuildingBlocks$WrapInfo(u_a, 2);
        int i4 = this.MediaMetadataCompat;
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = (PreviewFreezeAfterHighSpeedRecordingQuirk) this.IconCompatParcelizer;
        getFixedWidthMajor getfixedwidthmajor = new getFixedWidthMajor(i4, previewFreezeAfterHighSpeedRecordingQuirk, (ReportedVideoQualityNotSupportedQuirk) this.read, camera2CameraControlImpl, this.RatingCompat, flowLayoutBuildingBlocks$WrapInfo);
        ArrayList arrayList = getfixedwidthmajor.MediaBrowserCompatMediaItem;
        if (i == 0) {
            arrayList.add(new setTypeface(camera2CameraControlImpl));
        }
        if (i2 == 3) {
            arrayList.add(new Camera2CapturePipeline$ScreenFlashTask(camera2CameraControlImpl, previewFreezeAfterHighSpeedRecordingQuirk, (ReportedVideoQualityNotSupportedQuirk) this.read, new ImageCapture$1(u_a, 21)));
        } else if (this.serializer) {
            boolean z2 = ((ImageCapture$Metadata) this.RemoteActionCompatParcelizer).IconCompatParcelizer;
            if (z2 || this.MediaMetadataCompat == 3 || i3 == 1) {
                if (z2) {
                    z = false;
                } else {
                    int i5 = ((AtomicInteger) camera2CameraControlImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.RemoteActionCompatParcelizer).get();
                    setInflatedId.IconCompatParcelizer(3, "Camera2CameraControlImp");
                    if (i5 > 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                arrayList.add(new getBaseline(camera2CameraControlImpl, i2, previewFreezeAfterHighSpeedRecordingQuirk, (ReportedVideoQualityNotSupportedQuirk) this.read, z));
            } else {
                arrayList.add(new getFixedHeightMinor(camera2CameraControlImpl, i2, flowLayoutBuildingBlocks$WrapInfo));
            }
        }
        Objects.toString(arrayList);
        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
        return getfixedwidthmajor;
    }

    public nativeGetYUVImageVUOff IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList((HashSet) this.MediaSessionCompatQueueItem);
        CameraRepository cameraRepositorySerializer = CameraRepository.serializer((CameraProviderInitRetryPolicy) this.RemoteActionCompatParcelizer);
        int i = this.MediaMetadataCompat;
        boolean z = this.serializer;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.write);
        boolean z2 = this.RatingCompat;
        CameraControlInternalCameraControlException cameraControlInternalCameraControlException = (CameraControlInternalCameraControlException) this.IconCompatParcelizer;
        OnePixelShiftQuirk onePixelShiftQuirk = OnePixelShiftQuirk.read;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : cameraControlInternalCameraControlException.IconCompatParcelizer.keySet()) {
            arrayMap.put(str, cameraControlInternalCameraControlException.IconCompatParcelizer.get(str));
        }
        return new nativeGetYUVImageVUOff(arrayList, cameraRepositorySerializer, i, z, arrayList2, z2, new OnePixelShiftQuirk(arrayMap), (CameraXExternalSyntheticLambda0) this.read);
    }

    public void RemoteActionCompatParcelizer(InitializationException initializationException) {
        for (JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk : initializationException.MediaBrowserCompatMediaItem()) {
            ((CameraProviderInitRetryPolicy) this.RemoteActionCompatParcelizer).read(jpegCaptureDownsizingQuirk, null);
            ((CameraProviderInitRetryPolicy) this.RemoteActionCompatParcelizer).IconCompatParcelizer(jpegCaptureDownsizingQuirk, initializationException.RemoteActionCompatParcelizer(jpegCaptureDownsizingQuirk), initializationException.write(jpegCaptureDownsizingQuirk));
        }
    }

    public void serializer(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            read((StillCaptureFlashStopRepeatingQuirk) it.next());
        }
    }

    public abandonFocus(nativeGetYUVImageVUOff nativegetyuvimagevuoff) {
        HashSet hashSet = new HashSet();
        this.MediaSessionCompatQueueItem = hashSet;
        this.RemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        this.MediaMetadataCompat = -1;
        this.serializer = false;
        ArrayList arrayList = new ArrayList();
        this.write = arrayList;
        this.RatingCompat = false;
        this.IconCompatParcelizer = CameraControlInternalCameraControlException.write();
        hashSet.addAll(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem);
        this.RemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(nativegetyuvimagevuoff.MediaDescriptionCompat);
        this.MediaMetadataCompat = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
        arrayList.addAll(nativegetyuvimagevuoff.IconCompatParcelizer);
        this.RatingCompat = nativegetyuvimagevuoff.ParcelableVolumeInfo;
        OnePixelShiftQuirk onePixelShiftQuirk = nativegetyuvimagevuoff.RatingCompat;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : onePixelShiftQuirk.IconCompatParcelizer.keySet()) {
            arrayMap.put(str, onePixelShiftQuirk.IconCompatParcelizer.get(str));
        }
        this.IconCompatParcelizer = new CameraControlInternalCameraControlException(arrayMap);
        this.serializer = nativegetyuvimagevuoff.MediaMetadataCompat;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    public static boolean RemoteActionCompatParcelizer(TotalCaptureResult totalCaptureResult, boolean z) {
        Camera2CameraCoordinator camera2CameraCoordinator;
        YuvImageOnePixelShiftQuirk yuvImageOnePixelShiftQuirk;
        CameraClosedException cameraClosedException;
        if (totalCaptureResult != null) {
            accessgetGreencp accessgetgreencp = new accessgetGreencp(OnePixelShiftQuirk.read, 3, totalCaptureResult);
            Set set = ProcessingException.write;
            Integer num = (Integer) ((CaptureResult) accessgetgreencp.write).get(CaptureResult.CONTROL_AF_MODE);
            if (num == null) {
                camera2CameraCoordinator = Camera2CameraCoordinator.UNKNOWN;
            } else {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    camera2CameraCoordinator = Camera2CameraCoordinator.OFF;
                } else if (iIntValue == 1 || iIntValue == 2) {
                    camera2CameraCoordinator = Camera2CameraCoordinator.ON_MANUAL_AUTO;
                } else if (iIntValue == 3 || iIntValue == 4) {
                    camera2CameraCoordinator = Camera2CameraCoordinator.ON_CONTINUOUS_AUTO;
                } else if (iIntValue != 5) {
                    setInflatedId.serializer("C2CameraCaptureResult", "Undefined af mode: " + num);
                    camera2CameraCoordinator = Camera2CameraCoordinator.UNKNOWN;
                } else {
                    camera2CameraCoordinator = Camera2CameraCoordinator.OFF;
                }
            }
            boolean z2 = camera2CameraCoordinator == Camera2CameraCoordinator.OFF || ProcessingException.write.contains(accessgetgreencp.serializer());
            Integer num2 = (Integer) ((CaptureResult) accessgetgreencp.write).get(CaptureResult.CONTROL_AE_MODE);
            if (num2 == null) {
                yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.UNKNOWN;
            } else {
                int iIntValue2 = num2.intValue();
                if (iIntValue2 == 0) {
                    yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.OFF;
                } else if (iIntValue2 == 1) {
                    yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.ON;
                } else if (iIntValue2 == 2) {
                    yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.ON_AUTO_FLASH;
                } else if (iIntValue2 == 3) {
                    yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.ON_ALWAYS_FLASH;
                } else if (iIntValue2 == 4) {
                    yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.ON_AUTO_FLASH_REDEYE;
                } else if (iIntValue2 != 5) {
                    yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.UNKNOWN;
                } else {
                    yuvImageOnePixelShiftQuirk = YuvImageOnePixelShiftQuirk.ON_EXTERNAL_FLASH;
                }
            }
            boolean z3 = yuvImageOnePixelShiftQuirk == YuvImageOnePixelShiftQuirk.OFF;
            boolean z4 = !z ? !(z3 || ProcessingException.read.contains(accessgetgreencp.write())) : !(z3 || ProcessingException.IconCompatParcelizer.contains(accessgetgreencp.write()));
            Integer num3 = (Integer) ((CaptureResult) accessgetgreencp.write).get(CaptureResult.CONTROL_AWB_MODE);
            if (num3 == null) {
                cameraClosedException = CameraClosedException.UNKNOWN;
            } else {
                switch (num3.intValue()) {
                    case 0:
                        cameraClosedException = CameraClosedException.OFF;
                        break;
                    case 1:
                        cameraClosedException = CameraClosedException.AUTO;
                        break;
                    case 2:
                        cameraClosedException = CameraClosedException.INCANDESCENT;
                        break;
                    case 3:
                        cameraClosedException = CameraClosedException.FLUORESCENT;
                        break;
                    case 4:
                        cameraClosedException = CameraClosedException.WARM_FLUORESCENT;
                        break;
                    case 5:
                        cameraClosedException = CameraClosedException.DAYLIGHT;
                        break;
                    case 6:
                        cameraClosedException = CameraClosedException.CLOUDY_DAYLIGHT;
                        break;
                    case 7:
                        cameraClosedException = CameraClosedException.TWILIGHT;
                        break;
                    case 8:
                        cameraClosedException = CameraClosedException.SHADE;
                        break;
                    default:
                        cameraClosedException = CameraClosedException.UNKNOWN;
                        break;
                }
            }
            boolean z5 = cameraClosedException == CameraClosedException.OFF || ProcessingException.RemoteActionCompatParcelizer.contains(accessgetgreencp.read());
            Objects.toString(accessgetgreencp.write());
            Objects.toString(accessgetgreencp.serializer());
            Objects.toString(accessgetgreencp.read());
            setInflatedId.IconCompatParcelizer(3, "ConvergenceUtils");
            if (z2 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    public abandonFocus() {
        this.MediaSessionCompatQueueItem = new HashSet();
        this.RemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        this.MediaMetadataCompat = -1;
        this.serializer = false;
        this.write = new ArrayList();
        this.RatingCompat = false;
        this.IconCompatParcelizer = CameraControlInternalCameraControlException.write();
    }

    public abandonFocus(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, getThumbTintList getthumbtintlist, u$a u_a, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk) {
        this.MediaMetadataCompat = 1;
        this.MediaSessionCompatQueueItem = camera2CameraControlImpl;
        Integer num = (Integer) getthumbtintlist.write(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.RatingCompat = num != null && num.intValue() == 2;
        this.IconCompatParcelizer = previewFreezeAfterHighSpeedRecordingQuirk;
        this.read = reportedVideoQualityNotSupportedQuirk;
        this.write = u_a;
        this.RemoteActionCompatParcelizer = new ImageCapture$Metadata(u_a, 4);
        this.serializer = getMotionEventToComposePointerIdMapui.serializer(new setStacked(getthumbtintlist, 1));
    }
}

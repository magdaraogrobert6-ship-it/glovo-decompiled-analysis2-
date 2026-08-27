package o;

import android.content.Context;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class getDividerPadding implements Recorder3 {
    public final androidx.camera.camera2.internal.DisplayInfoManager write;

    public getDividerPadding(Context context) {
        this.write = androidx.camera.camera2.internal.DisplayInfoManager.IconCompatParcelizer(context);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0117 A[LOOP:1: B:19:0x0111->B:21:0x0117, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0142  */
    /* JADX WARN: Code duplicated, block: B:25:0x0145  */
    /* JADX WARN: Code duplicated, block: B:28:0x014e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0174  */
    @Override // o.Recorder3
    public final InitializationException RemoteActionCompatParcelizer(VideoCapture videoCapture, int i) {
        int i2;
        ArrayMap arrayMap;
        Object obj;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer2 = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        CameraControlInternalCameraControlException cameraControlInternalCameraControlExceptionWrite = CameraControlInternalCameraControlException.write();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iSerializer = getSplitTrack.serializer(videoCapture, i);
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = ImageUtilCodecFailedException.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        CameraRepository cameraRepositorySerializer = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        OnePixelShiftQuirk onePixelShiftQuirk = OnePixelShiftQuirk.read;
        ArrayMap arrayMap2 = new ArrayMap();
        for (Iterator it = cameraControlInternalCameraControlExceptionWrite.IconCompatParcelizer.keySet().iterator(); it.hasNext(); it = it) {
            String str = (String) it.next();
            arrayMap2.put(str, cameraControlInternalCameraControlExceptionWrite.IconCompatParcelizer.get(str));
        }
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk, new mapToBase(arrayList5, arrayList6, arrayList7, arrayList8, new nativeGetYUVImageVUOff(arrayList9, cameraRepositorySerializer, iSerializer, false, arrayList10, false, new OnePixelShiftQuirk(arrayMap2), null), null, null, 0, null));
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, getBaselineAlignedChildIndex.read);
        HashSet hashSet2 = new HashSet();
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer3 = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        ArrayList arrayList11 = new ArrayList();
        CameraControlInternalCameraControlException cameraControlInternalCameraControlExceptionWrite2 = CameraControlInternalCameraControlException.write();
        int i3 = getCompoundPaddingLeft.read[videoCapture.ordinal()];
        int i4 = 2;
        if (i3 != 1) {
            if (i3 == 2 && setThumbTintList.RemoteActionCompatParcelizer.read(androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk.class) == null) {
                i4 = 3;
            } else {
                i2 = 1;
            }
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk2 = ImageUtilCodecFailedException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            ArrayList arrayList12 = new ArrayList(hashSet2);
            CameraRepository cameraRepositorySerializer2 = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer3);
            ArrayList arrayList13 = new ArrayList(arrayList11);
            OnePixelShiftQuirk onePixelShiftQuirk2 = OnePixelShiftQuirk.read;
            arrayMap = new ArrayMap();
            for (String str2 : cameraControlInternalCameraControlExceptionWrite2.IconCompatParcelizer.keySet()) {
                arrayMap.put(str2, cameraControlInternalCameraControlExceptionWrite2.IconCompatParcelizer.get(str2));
            }
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk2, new nativeGetYUVImageVUOff(arrayList12, cameraRepositorySerializer2, i2, false, arrayList13, false, new OnePixelShiftQuirk(arrayMap), null));
            JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk3 = ImageUtilCodecFailedException.ComponentActivity;
            if (videoCapture == VideoCapture.IMAGE_CAPTURE) {
                obj = setImeVisibility.read;
            } else {
                obj = setAllowStacking.write;
            }
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk3, obj);
            if (videoCapture == VideoCapture.PREVIEW) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getImageFormatdefault.f_, this.write.RemoteActionCompatParcelizer());
            }
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getImageFormatdefault.l_, Integer.valueOf(this.write.serializer(true).getRotation()));
            if (videoCapture != VideoCapture.VIDEO_CAPTURE || videoCapture == VideoCapture.STREAM_SHARING) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, Boolean.TRUE);
            }
            return CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
        }
        if (i == 2) {
            i4 = 5;
        }
        i2 = i4;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk4 = ImageUtilCodecFailedException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        ArrayList arrayList14 = new ArrayList(hashSet2);
        CameraRepository cameraRepositorySerializer3 = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer3);
        ArrayList arrayList15 = new ArrayList(arrayList11);
        OnePixelShiftQuirk onePixelShiftQuirk3 = OnePixelShiftQuirk.read;
        arrayMap = new ArrayMap();
        while (r4.hasNext()) {
            arrayMap.put(str2, cameraControlInternalCameraControlExceptionWrite2.IconCompatParcelizer.get(str2));
        }
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk4, new nativeGetYUVImageVUOff(arrayList14, cameraRepositorySerializer3, i2, false, arrayList15, false, new OnePixelShiftQuirk(arrayMap), null));
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk5 = ImageUtilCodecFailedException.ComponentActivity;
        if (videoCapture == VideoCapture.IMAGE_CAPTURE) {
            obj = setImeVisibility.read;
        } else {
            obj = setAllowStacking.write;
        }
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(jpegCaptureDownsizingQuirk5, obj);
        if (videoCapture == VideoCapture.PREVIEW) {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getImageFormatdefault.f_, this.write.RemoteActionCompatParcelizer());
        }
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(getImageFormatdefault.l_, Integer.valueOf(this.write.serializer(true).getRotation()));
        if (videoCapture != VideoCapture.VIDEO_CAPTURE) {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, Boolean.TRUE);
        } else {
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, Boolean.TRUE);
        }
        return CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
    }
}

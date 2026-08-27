package o;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import androidx.camera.core.ImageCapture$1;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class setAllowStacking {
    public static final setAllowStacking write = new setAllowStacking();

    public void IconCompatParcelizer(ImageUtilCodecFailedException imageUtilCodecFailedException, abandonFocus abandonfocus) {
        int i;
        nativeGetYUVImageVUOff nativegetyuvimagevuoff = (nativeGetYUVImageVUOff) imageUtilCodecFailedException.read(ImageUtilCodecFailedException.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, null);
        CameraRepository cameraRepository = CameraRepository.read;
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = nativeGetYUVImageVUOff.RemoteActionCompatParcelizer;
        HashSet hashSet = new HashSet();
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        CameraControlInternalCameraControlException cameraControlInternalCameraControlExceptionWrite = CameraControlInternalCameraControlException.write();
        ArrayList arrayList2 = new ArrayList(hashSet);
        CameraRepository cameraRepositorySerializer = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
        ArrayList arrayList3 = new ArrayList(arrayList);
        OnePixelShiftQuirk onePixelShiftQuirk = OnePixelShiftQuirk.read;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = cameraControlInternalCameraControlExceptionWrite.IconCompatParcelizer;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        new nativeGetYUVImageVUOff(arrayList2, cameraRepositorySerializer, -1, false, arrayList3, false, new OnePixelShiftQuirk(arrayMap), null);
        if (nativegetyuvimagevuoff != null) {
            int i2 = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
            abandonfocus.serializer(nativegetyuvimagevuoff.IconCompatParcelizer);
            cameraRepository = nativegetyuvimagevuoff.MediaDescriptionCompat;
            i = i2;
        } else {
            i = -1;
        }
        abandonfocus.RemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(cameraRepository);
        abandonfocus.MediaMetadataCompat = ((Integer) imageUtilCodecFailedException.read(access701.MediaMetadataCompat, Integer.valueOf(i))).intValue();
        abandonfocus.read(new getWeightSum((CameraCaptureSession.CaptureCallback) imageUtilCodecFailedException.read(access701.serializer, new getFixedHeightMajor())));
        abandonfocus.RemoteActionCompatParcelizer(new ImageCapture$1(23, CameraRepository.serializer(getOuterActionMenuPresenter.IconCompatParcelizer(imageUtilCodecFailedException).read)));
    }
}

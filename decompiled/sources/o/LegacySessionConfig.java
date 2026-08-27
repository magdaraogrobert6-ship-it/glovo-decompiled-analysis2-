package o;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySessionConfig {
    public final nativeGetYUVImageVUOff read;

    public LegacySessionConfig() {
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
        this.read = new nativeGetYUVImageVUOff(arrayList2, cameraRepositorySerializer, -1, false, arrayList3, false, new OnePixelShiftQuirk(arrayMap), null);
    }
}

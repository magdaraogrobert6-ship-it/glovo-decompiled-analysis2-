package o;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class MutableSetWrapperiterator1iterator1 implements trimToSize {
    public final CameraDevice.CameraDeviceSetup IconCompatParcelizer;

    @Override // o.trimToSize
    public final getUseEvaluationsCachefwf_client_release RemoteActionCompatParcelizer(SessionConfiguration sessionConfiguration) {
        int i = this.IconCompatParcelizer.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2;
        String property = System.getProperty("ro.build.date.utc");
        if (property != null) {
            try {
                Long.parseLong(property);
            } catch (NumberFormatException unused) {
            }
        }
        return new getUseEvaluationsCachefwf_client_release((byte) 0, i, 1);
    }

    public MutableSetWrapperiterator1iterator1(CameraManager cameraManager, String str) {
        this.IconCompatParcelizer = cameraManager.getCameraDeviceSetup(str);
    }
}

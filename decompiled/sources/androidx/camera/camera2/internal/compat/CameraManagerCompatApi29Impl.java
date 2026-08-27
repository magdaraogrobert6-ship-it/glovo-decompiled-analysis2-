package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.core.ImageCapture$1;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class CameraManagerCompatApi29Impl extends ImageCapture$1 {
    @Override // androidx.camera.core.ImageCapture$1
    public final CameraCharacteristics read(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.MediaSessionCompatQueueItem).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    @Override // androidx.camera.core.ImageCapture$1
    public final void write(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            ((CameraManager) this.MediaSessionCompatQueueItem).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public CameraManagerCompatApi29Impl(Context context, int i) {
        super(context, i);
    }
}

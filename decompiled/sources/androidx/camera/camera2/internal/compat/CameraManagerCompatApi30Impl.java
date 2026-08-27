package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class CameraManagerCompatApi30Impl extends CameraManagerCompatApi29Impl {
    @Override // androidx.camera.core.ImageCapture$1
    public final Set serializer() throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.MediaSessionCompatQueueItem).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public CameraManagerCompatApi30Impl(Context context, int i) {
        super(context, i);
    }
}

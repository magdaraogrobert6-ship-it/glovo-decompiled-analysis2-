package o;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public final class setCompoundDrawablesWithIntrinsicBounds extends CameraManager.AvailabilityCallback {
    public boolean RemoteActionCompatParcelizer = true;
    public final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl read;
    public final String write;

    public setCompoundDrawablesWithIntrinsicBounds(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl, String str) {
        this.read = camera2CameraImpl;
        this.write = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) throws Throwable {
        if (this.write.equals(str)) {
            this.RemoteActionCompatParcelizer = true;
            if (this.read._init_lambda1 == setTextFuture.PENDING_OPEN || this.read._init_lambda1 == setTextFuture.OPENING_WITH_ERROR) {
                this.read.serializer(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.write.equals(str)) {
            this.RemoteActionCompatParcelizer = false;
        }
    }
}

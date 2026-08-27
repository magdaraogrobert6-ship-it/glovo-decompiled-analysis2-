package o;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public final class setListSelectionHidden extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ setSelector serializer;

    public setListSelectionHidden(setSelector setselector) {
        this.serializer = setselector;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer(new EncodeException((onDrawBehind) this.serializer.RemoteActionCompatParcelizer(), 1));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        coil3.util.UtilsKt.RemoteActionCompatParcelizer(new EncodeException((onDrawBehind) this.serializer.RemoteActionCompatParcelizer(), 1));
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        str.getClass();
        coil3.util.UtilsKt.RemoteActionCompatParcelizer(new EncodeException((onDrawBehind) this.serializer.RemoteActionCompatParcelizer(), 1));
    }
}

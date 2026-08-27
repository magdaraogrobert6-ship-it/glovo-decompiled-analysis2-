package o;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class getSwitchPadding implements onDetachedFromWindow {
    public final /* synthetic */ androidx.camera.camera2.internal.ZoomControl RemoteActionCompatParcelizer;

    @Override // o.onDetachedFromWindow
    public final boolean RemoteActionCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        this.RemoteActionCompatParcelizer.write.IconCompatParcelizer(totalCaptureResult);
        return false;
    }

    public getSwitchPadding(androidx.camera.camera2.internal.ZoomControl zoomControl) {
        this.RemoteActionCompatParcelizer = zoomControl;
    }
}

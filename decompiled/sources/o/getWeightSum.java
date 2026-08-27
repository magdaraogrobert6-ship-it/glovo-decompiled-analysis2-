package o;

import android.hardware.camera2.CameraCaptureSession;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getWeightSum extends StillCaptureFlashStopRepeatingQuirk {
    public final CameraCaptureSession.CaptureCallback serializer;

    public getWeightSum(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.serializer = captureCallback;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("captureCallback is null");
            throw null;
        }
    }
}

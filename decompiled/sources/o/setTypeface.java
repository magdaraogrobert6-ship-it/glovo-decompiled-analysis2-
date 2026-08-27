package o;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class setTypeface implements setAttachListener {
    public boolean IconCompatParcelizer = false;
    public final androidx.camera.camera2.internal.Camera2CameraControlImpl serializer;

    @Override // o.setAttachListener
    public final boolean read() {
        return true;
    }

    @Override // o.setAttachListener
    public final DrawModifierNodeKt IconCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        Integer num;
        int iIntValue;
        EncoderImplMediaCodecCallback encoderImplMediaCodecCallback = VideoQualityQuirk.read(Boolean.TRUE);
        if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
            setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
                this.IconCompatParcelizer = true;
                this.serializer.PlaybackStateCompatCustomAction.IconCompatParcelizer(false);
            }
        }
        return encoderImplMediaCodecCallback;
    }

    public setTypeface(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl) {
        this.serializer = camera2CameraControlImpl;
    }

    @Override // o.setAttachListener
    public final void serializer() {
        if (this.IconCompatParcelizer) {
            setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
            this.serializer.PlaybackStateCompatCustomAction.read(true, false);
        }
    }
}

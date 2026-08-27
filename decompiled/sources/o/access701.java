package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.ImageCapture$1;

/* JADX INFO: loaded from: classes.dex */
public final class access701 extends ImageCapture$1 {
    public static final JpegCaptureDownsizingQuirk MediaMetadataCompat = new JpegCaptureDownsizingQuirk("camera2.captureRequest.templateType", Integer.TYPE, null);
    public static final JpegCaptureDownsizingQuirk IconCompatParcelizer = new JpegCaptureDownsizingQuirk("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);
    public static final JpegCaptureDownsizingQuirk read = new JpegCaptureDownsizingQuirk("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final JpegCaptureDownsizingQuirk write = new JpegCaptureDownsizingQuirk("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);
    public static final JpegCaptureDownsizingQuirk serializer = new JpegCaptureDownsizingQuirk("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);
    public static final JpegCaptureDownsizingQuirk RemoteActionCompatParcelizer = new JpegCaptureDownsizingQuirk("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static JpegCaptureDownsizingQuirk serializer(CaptureRequest.Key key) {
        return new JpegCaptureDownsizingQuirk("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    public access701(int i, Object obj) {
        super(i, obj);
    }
}

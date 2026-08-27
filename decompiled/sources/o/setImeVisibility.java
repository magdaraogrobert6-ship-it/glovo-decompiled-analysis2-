package o;

import android.hardware.camera2.CaptureRequest;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class setImeVisibility extends setAllowStacking {
    public static final setImeVisibility read = new setImeVisibility();

    @Override // o.setAllowStacking
    public final void IconCompatParcelizer(ImageUtilCodecFailedException imageUtilCodecFailedException, abandonFocus abandonfocus) {
        super.IconCompatParcelizer(imageUtilCodecFailedException, abandonfocus);
        if (!(imageUtilCodecFailedException instanceof UseCase)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("config is not ImageCaptureConfig");
            return;
        }
        UseCase useCase = (UseCase) imageUtilCodecFailedException;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = UseCase.RemoteActionCompatParcelizer;
        if (useCase.read(jpegCaptureDownsizingQuirk)) {
            int iIntValue = ((Integer) useCase.write(jpegCaptureDownsizingQuirk)).intValue();
            if (((androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk) setThumbTintList.RemoteActionCompatParcelizer.read(androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk.class)) != null) {
                if (iIntValue == 0) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(key), Boolean.TRUE);
                } else if (iIntValue == 1) {
                    CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                    cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(key2), Boolean.FALSE);
                }
            }
        }
        abandonfocus.RemoteActionCompatParcelizer(new access701(23, CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)));
    }
}

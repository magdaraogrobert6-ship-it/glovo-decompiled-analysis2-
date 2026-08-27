package o;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface CameraXExternalSyntheticLambda0 {
    default CaptureResult IconCompatParcelizer() {
        return null;
    }

    OnePixelShiftQuirk MediaBrowserCompatMediaItem();

    long RatingCompat();

    CaptureRequestOptionsBuilderExternalSyntheticLambda0 read();

    Camera2CameraControlExternalSyntheticLambda1 serializer();

    ZslDisablerQuirk u_();

    TorchIsClosedAfterImageCapturingQuirk write();

    default void write(ExcludeStretchedVideoQualityQuirk excludeStretchedVideoQualityQuirk) {
        int i;
        ArrayList arrayList = excludeStretchedVideoQualityQuirk.serializer;
        ZslDisablerQuirk zslDisablerQuirkU_ = u_();
        if (zslDisablerQuirkU_ == ZslDisablerQuirk.UNKNOWN) {
            return;
        }
        int i2 = CameraUseInconsistentTimebaseQuirk.RemoteActionCompatParcelizer[zslDisablerQuirkU_.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 32;
        } else {
            if (i2 != 3) {
                setInflatedId.read("ExifData", "Unknown flash state: " + zslDisablerQuirkU_);
                return;
            }
            i = 1;
        }
        if ((i & 1) == 1) {
            excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("LightSource", String.valueOf(4), arrayList);
        }
        excludeStretchedVideoQualityQuirk.RemoteActionCompatParcelizer("Flash", String.valueOf(i), arrayList);
    }
}

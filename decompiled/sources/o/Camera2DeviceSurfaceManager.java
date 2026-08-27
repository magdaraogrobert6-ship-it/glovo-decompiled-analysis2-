package o;

import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Camera2DeviceSurfaceManager {
    public boolean IconCompatParcelizer(androidx.camera.core.LegacySessionConfig legacySessionConfig, FocusMeteringAction focusMeteringAction) {
        return true;
    }

    public abstract ZoomControl write();

    static {
        new CameraManagerCompatApi29Impl();
        new AfRegionFlipHorizontallyQuirk();
        new AspectRatioLegacyApi21Quirk(AutoFlashUnderExposedQuirk.PREVIEW);
        new AeFpsRangeLegacyQuirk();
    }

    public Camera2DeviceSurfaceManager() {
        new isAdapterPositionOnScreen(new CoroutineLiveData$$ExternalSyntheticLambda0(1, this));
    }
}

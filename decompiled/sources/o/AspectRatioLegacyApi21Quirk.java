package o;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioLegacyApi21Quirk extends Camera2DeviceSurfaceManager {
    public static final AutoFlashUnderExposedQuirk write = AutoFlashUnderExposedQuirk.OFF;
    public final ZoomControl RemoteActionCompatParcelizer;
    public final AutoFlashUnderExposedQuirk read;

    @Override // o.Camera2DeviceSurfaceManager
    public final ZoomControl write() {
        return this.RemoteActionCompatParcelizer;
    }

    public AspectRatioLegacyApi21Quirk(AutoFlashUnderExposedQuirk autoFlashUnderExposedQuirk) {
        autoFlashUnderExposedQuirk.getClass();
        this.read = autoFlashUnderExposedQuirk;
        this.RemoteActionCompatParcelizer = ZoomControl.VIDEO_STABILIZATION;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.read.name() + ')';
    }
}

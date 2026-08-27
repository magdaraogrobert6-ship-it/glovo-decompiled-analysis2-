package o;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class CameraManagerCompatApi29Impl extends Camera2DeviceSurfaceManager {
    public static final /* synthetic */ int read = 0;
    public final getNavigationIcon RemoteActionCompatParcelizer = getNavigationIcon.read;
    public final ZoomControl serializer = ZoomControl.DYNAMIC_RANGE;

    @Override // o.Camera2DeviceSurfaceManager
    public final ZoomControl write() {
        return this.serializer;
    }

    @Override // o.Camera2DeviceSurfaceManager
    public final boolean IconCompatParcelizer(androidx.camera.core.LegacySessionConfig legacySessionConfig, FocusMeteringAction focusMeteringAction) {
        Set setMediaSessionCompatToken = focusMeteringAction.MediaSessionCompatToken();
        setMediaSessionCompatToken.getClass();
        setMediaSessionCompatToken.toString();
        toString();
        setInflatedId.IconCompatParcelizer(3, "DynamicRangeFeature");
        getNavigationIcon getnavigationicon = this.RemoteActionCompatParcelizer;
        if (!setMediaSessionCompatToken.contains(getnavigationicon)) {
            return false;
        }
        for (androidx.camera.core.UseCase useCase : (List) legacySessionConfig.RatingCompat) {
            Set set = useCase.read(focusMeteringAction);
            Objects.toString(set);
            toString();
            useCase.toString();
            setInflatedId.IconCompatParcelizer(3, "DynamicRangeFeature");
            if (set != null && !set.contains(getnavigationicon)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.RemoteActionCompatParcelizer + ')';
    }
}

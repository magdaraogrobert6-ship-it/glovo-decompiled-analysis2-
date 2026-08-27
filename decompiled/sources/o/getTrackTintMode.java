package o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class getTrackTintMode implements setSplitTrack {
    public static final getTrackTintList write = new getTrackTintList(new getTrackTintMode(), false);
    public static final Set IconCompatParcelizer = Collections.singleton(getNavigationIcon.MediaDescriptionCompat);

    @Override // o.setSplitTrack
    public final DynamicRangeProfiles ap_() {
        return null;
    }

    @Override // o.setSplitTrack
    public final Set serializer() {
        return IconCompatParcelizer;
    }

    @Override // o.setSplitTrack
    public final Set read(getNavigationIcon getnavigationicon) {
        coil3.util.UtilsKt.IconCompatParcelizer("DynamicRange is not supported: " + getnavigationicon, getNavigationIcon.MediaDescriptionCompat.equals(getnavigationicon));
        return IconCompatParcelizer;
    }
}

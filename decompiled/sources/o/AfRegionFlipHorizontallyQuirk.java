package o;

import android.util.Range;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class AfRegionFlipHorizontallyQuirk extends Camera2DeviceSurfaceManager {
    public static final Range RemoteActionCompatParcelizer = new Range(30, 30);
    public final int serializer = 60;
    public final int read = 60;
    public final ZoomControl IconCompatParcelizer = ZoomControl.FPS_RANGE;

    @Override // o.Camera2DeviceSurfaceManager
    public final ZoomControl write() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.serializer);
        sb.append(", maxFps=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}

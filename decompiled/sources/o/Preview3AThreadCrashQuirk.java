package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Preview3AThreadCrashQuirk {
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final List read;
    public final PreviewExternalSyntheticLambda0 serializer;
    public final getNavigationIcon write;

    public static PreviewStretchWhenVideoCaptureIsBoundQuirk read(PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0) {
        PreviewStretchWhenVideoCaptureIsBoundQuirk previewStretchWhenVideoCaptureIsBoundQuirk = new PreviewStretchWhenVideoCaptureIsBoundQuirk();
        if (previewExternalSyntheticLambda0 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null surface");
            return null;
        }
        previewStretchWhenVideoCaptureIsBoundQuirk.serializer = previewExternalSyntheticLambda0;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sharedSurfaces");
            return null;
        }
        previewStretchWhenVideoCaptureIsBoundQuirk.read = list;
        previewStretchWhenVideoCaptureIsBoundQuirk.write = -1;
        previewStretchWhenVideoCaptureIsBoundQuirk.RemoteActionCompatParcelizer = -1;
        previewStretchWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer = getNavigationIcon.MediaDescriptionCompat;
        return previewStretchWhenVideoCaptureIsBoundQuirk;
    }

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int i = this.RemoteActionCompatParcelizer;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * (-721379959)) ^ i) * 1000003) ^ this.IconCompatParcelizer) * 1000003) ^ this.write.hashCode();
    }

    public Preview3AThreadCrashQuirk(PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0, List list, int i, int i2, getNavigationIcon getnavigationicon) {
        this.serializer = previewExternalSyntheticLambda0;
        this.read = list;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.write = getnavigationicon;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Preview3AThreadCrashQuirk)) {
            return false;
        }
        Preview3AThreadCrashQuirk preview3AThreadCrashQuirk = (Preview3AThreadCrashQuirk) obj;
        return this.serializer.equals(preview3AThreadCrashQuirk.serializer) && this.read.equals(preview3AThreadCrashQuirk.read) && this.RemoteActionCompatParcelizer == preview3AThreadCrashQuirk.RemoteActionCompatParcelizer && this.IconCompatParcelizer == preview3AThreadCrashQuirk.IconCompatParcelizer && this.write.equals(preview3AThreadCrashQuirk.write);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.serializer + ", sharedSurfaces=" + this.read + ", physicalCameraId=null, mirrorMode=" + this.RemoteActionCompatParcelizer + ", surfaceGroupId=" + this.IconCompatParcelizer + ", dynamicRange=" + this.write + "}";
    }
}

package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class CaptureSessionShouldUseMrirQuirk {
    public final int RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final setScreenFlashOverlayColor serializer;
    public final setScreenFlashOverlayColor write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.write.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.RemoteActionCompatParcelizer) * 1000003) ^ this.read.hashCode();
    }

    public CaptureSessionShouldUseMrirQuirk(setScreenFlashOverlayColor setscreenflashoverlaycolor, setScreenFlashOverlayColor setscreenflashoverlaycolor2, int i, ArrayList arrayList) {
        this.serializer = setscreenflashoverlaycolor;
        this.write = setscreenflashoverlaycolor2;
        this.RemoteActionCompatParcelizer = i;
        this.read = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CaptureSessionShouldUseMrirQuirk) {
            CaptureSessionShouldUseMrirQuirk captureSessionShouldUseMrirQuirk = (CaptureSessionShouldUseMrirQuirk) obj;
            if (this.serializer == captureSessionShouldUseMrirQuirk.serializer && this.write == captureSessionShouldUseMrirQuirk.write && this.RemoteActionCompatParcelizer == captureSessionShouldUseMrirQuirk.RemoteActionCompatParcelizer && this.read.equals(captureSessionShouldUseMrirQuirk.read)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "In{edge=" + this.serializer + ", postviewEdge=" + this.write + ", inputFormat=" + this.RemoteActionCompatParcelizer + ", outputFormats=" + this.read + "}";
    }
}

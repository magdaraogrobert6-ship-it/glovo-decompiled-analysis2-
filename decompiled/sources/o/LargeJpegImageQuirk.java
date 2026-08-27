package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class LargeJpegImageQuirk {
    public final HashMap IconCompatParcelizer;
    public final int read;
    public final HashMap write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return Integer.hashCode(this.read) + ((this.IconCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    public LargeJpegImageQuirk(HashMap map, HashMap map2, int i) {
        this.write = map;
        this.IconCompatParcelizer = map2;
        this.read = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LargeJpegImageQuirk)) {
            return false;
        }
        LargeJpegImageQuirk largeJpegImageQuirk = (LargeJpegImageQuirk) obj;
        return this.write.equals(largeJpegImageQuirk.write) && this.IconCompatParcelizer.equals(largeJpegImageQuirk.IconCompatParcelizer) && this.read == largeJpegImageQuirk.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.write);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", maxSupportedFrameRate=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}

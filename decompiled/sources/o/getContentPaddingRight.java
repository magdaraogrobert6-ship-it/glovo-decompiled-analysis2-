package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class getContentPaddingRight {
    public final setBrightness IconCompatParcelizer;
    public final setBrightness RemoteActionCompatParcelizer;
    public final ArrayList write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.write.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getContentPaddingRight)) {
            return false;
        }
        getContentPaddingRight getcontentpaddingright = (getContentPaddingRight) obj;
        return this.IconCompatParcelizer.equals(getcontentpaddingright.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(getcontentpaddingright.RemoteActionCompatParcelizer) && this.write.equals(getcontentpaddingright.write);
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.IconCompatParcelizer + ", secondarySurfaceEdge=" + this.RemoteActionCompatParcelizer + ", outConfigs=" + this.write + "}";
    }

    public getContentPaddingRight(setBrightness setbrightness, setBrightness setbrightness2, ArrayList arrayList) {
        if (setbrightness == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null primarySurfaceEdge");
            throw null;
        }
        this.IconCompatParcelizer = setbrightness;
        if (setbrightness2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null secondarySurfaceEdge");
            throw null;
        }
        this.RemoteActionCompatParcelizer = setbrightness2;
        this.write = arrayList;
    }
}

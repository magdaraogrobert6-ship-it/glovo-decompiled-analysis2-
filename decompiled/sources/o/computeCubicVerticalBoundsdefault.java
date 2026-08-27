package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class computeCubicVerticalBoundsdefault {
    public final List IconCompatParcelizer;
    public final int read;

    public computeCubicVerticalBoundsdefault(List list, int i) {
        this.IconCompatParcelizer = list;
        this.read = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read(ff$$ExternalSyntheticOutline0.m(i, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), androidx.sqlite.SQLite.write((Collection) list2), "'.");
        throw null;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.read * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.read);
        sb.append(", mergedHistory=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.IconCompatParcelizer, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || computeCubicVerticalBoundsdefault.class != obj.getClass()) {
            return false;
        }
        computeCubicVerticalBoundsdefault computecubicverticalboundsdefault = (computeCubicVerticalBoundsdefault) obj;
        if (this.read != computecubicverticalboundsdefault.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, computecubicverticalboundsdefault.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public computeCubicVerticalBoundsdefault() {
        this(instance_delegatelambda0.write, -1);
    }
}

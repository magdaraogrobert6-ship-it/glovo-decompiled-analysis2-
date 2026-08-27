package bo.app;

import java.util.LinkedHashSet;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements t9 {
    public final LinkedHashSet a;
    public final boolean b;

    @Override // bo.app.t9
    public final boolean isEmpty() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public o1(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        this.a = linkedHashSet;
        this.b = linkedHashSet.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((o1) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BrazeEventContainer(eventsList=" + this.a + ")";
    }
}

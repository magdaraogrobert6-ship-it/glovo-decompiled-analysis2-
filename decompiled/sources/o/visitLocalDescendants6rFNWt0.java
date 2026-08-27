package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class visitLocalDescendants6rFNWt0 extends visitSelfAndChildrenYYKmho implements Serializable {
    public final visitLocalDescendantsdefault RemoteActionCompatParcelizer;
    public final visitLocalDescendantsdefault write;

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() ^ this.write.hashCode();
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer + ".converterTo(" + this.write + ")";
    }

    public visitLocalDescendants6rFNWt0(visitLocalDescendantsdefault visitlocaldescendantsdefault, visitLocalDescendantsdefault visitlocaldescendantsdefault2) {
        this.RemoteActionCompatParcelizer = visitlocaldescendantsdefault;
        visitlocaldescendantsdefault2.getClass();
        this.write = visitlocaldescendantsdefault2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof visitLocalDescendants6rFNWt0)) {
            return false;
        }
        visitLocalDescendants6rFNWt0 visitlocaldescendants6rfnwt0 = (visitLocalDescendants6rFNWt0) obj;
        return this.RemoteActionCompatParcelizer.equals(visitlocaldescendants6rfnwt0.RemoteActionCompatParcelizer) && this.write.equals(visitlocaldescendants6rfnwt0.write);
    }
}

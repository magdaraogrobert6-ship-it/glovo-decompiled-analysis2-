package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class requestRelayout extends MeasureScopeWithLayoutNodeKt {
    public final List IconCompatParcelizer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() ^ 1000003;
    }

    public requestRelayout(List list) {
        this.IconCompatParcelizer = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeasureScopeWithLayoutNodeKt)) {
            return false;
        }
        return this.IconCompatParcelizer.equals(((requestRelayout) ((MeasureScopeWithLayoutNodeKt) obj)).IconCompatParcelizer);
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read(new StringBuilder("RolloutsState{rolloutAssignments="), this.IconCompatParcelizer, "}");
    }
}

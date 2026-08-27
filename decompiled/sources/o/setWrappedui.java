package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.model.SnapshotVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class setWrappedui implements Comparable {
    public static final setWrappedui RemoteActionCompatParcelizer = new setWrappedui(SnapshotVersion.IconCompatParcelizer, visitNodes.RemoteActionCompatParcelizer(), -1);
    public static final wg$$ExternalSyntheticLambda0 read = new wg$$ExternalSyntheticLambda0(13);
    public final int IconCompatParcelizer;
    public final SnapshotVersion serializer;
    public final visitNodes write;

    public static setWrappedui RemoteActionCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        return new setWrappedui(nodeCoordinatorCompanionPointerInputSource1.IconCompatParcelizer, nodeCoordinatorCompanionPointerInputSource1.read, -1);
    }

    public final int hashCode() {
        int iHashCode = this.serializer.read.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.write.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.IconCompatParcelizer;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final int compareTo(setWrappedui setwrappedui) {
        int iCompareTo = this.serializer.compareTo(setwrappedui.serializer);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.write.compareTo(setwrappedui.write);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(this.IconCompatParcelizer, setwrappedui.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setWrappedui)) {
            return false;
        }
        setWrappedui setwrappedui = (setWrappedui) obj;
        return this.serializer.equals(setwrappedui.serializer) && this.write.equals(setwrappedui.write) && this.IconCompatParcelizer == setwrappedui.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexOffset{readTime=");
        sb.append(this.serializer);
        sb.append(", documentKey=");
        sb.append(this.write);
        sb.append(", largestBatchId=");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "}", sb);
    }

    public setWrappedui(SnapshotVersion snapshotVersion, visitNodes visitnodes, int i) {
        if (snapshotVersion == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null readTime");
            throw null;
        }
        this.serializer = snapshotVersion;
        if (visitnodes == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null documentKey");
            throw null;
        }
        this.write = visitnodes;
        this.IconCompatParcelizer = i;
    }
}

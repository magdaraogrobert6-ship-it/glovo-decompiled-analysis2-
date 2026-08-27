package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class shouldSharePointerInputWithSiblings implements Comparable {
    public final childHitTestqzLsGqo IconCompatParcelizer;
    public final NodeCoordinatorCompanion RemoteActionCompatParcelizer;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings = (shouldSharePointerInputWithSiblings) obj;
        int iCompareTo = this.IconCompatParcelizer.compareTo(shouldsharepointerinputwithsiblings.IconCompatParcelizer);
        return iCompareTo != 0 ? iCompareTo : this.RemoteActionCompatParcelizer.compareTo(shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return ((this.IconCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof shouldSharePointerInputWithSiblings)) {
            return false;
        }
        shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings = (shouldSharePointerInputWithSiblings) obj;
        return this.IconCompatParcelizer.equals(shouldsharepointerinputwithsiblings.IconCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "Segment{fieldPath=" + this.IconCompatParcelizer + ", kind=" + this.RemoteActionCompatParcelizer + "}";
    }

    public shouldSharePointerInputWithSiblings(childHitTestqzLsGqo childhittestqzlsgqo, NodeCoordinatorCompanion nodeCoordinatorCompanion) {
        if (childhittestqzlsgqo == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null fieldPath");
            throw null;
        }
        this.IconCompatParcelizer = childhittestqzlsgqo;
        if (nodeCoordinatorCompanion != null) {
            this.RemoteActionCompatParcelizer = nodeCoordinatorCompanion;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null kind");
            throw null;
        }
    }
}

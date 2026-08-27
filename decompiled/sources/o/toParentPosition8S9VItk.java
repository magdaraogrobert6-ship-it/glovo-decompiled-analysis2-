package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class toParentPosition8S9VItk {
    public static final touchBoundsInRoot serializer = new touchBoundsInRoot(0, setWrappedui.RemoteActionCompatParcelizer);
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final touchBoundsInRoot read;
    public final ArrayList write;

    public final ArrayList RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        for (shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings : this.write) {
            if (!shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer.equals(NodeCoordinatorCompanion.CONTAINS)) {
                arrayList.add(shouldsharepointerinputwithsiblings);
            }
        }
        return arrayList;
    }

    public final shouldSharePointerInputWithSiblings write() {
        for (shouldSharePointerInputWithSiblings shouldsharepointerinputwithsiblings : this.write) {
            if (shouldsharepointerinputwithsiblings.RemoteActionCompatParcelizer.equals(NodeCoordinatorCompanion.CONTAINS)) {
                return shouldsharepointerinputwithsiblings;
            }
        }
        return null;
    }

    public toParentPosition8S9VItk(int i, String str, ArrayList arrayList, touchBoundsInRoot touchboundsinroot) {
        this.RemoteActionCompatParcelizer = i;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null collectionGroup");
            throw null;
        }
        this.IconCompatParcelizer = str;
        this.write = arrayList;
        if (touchboundsinroot != null) {
            this.read = touchboundsinroot;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null indexState");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof toParentPosition8S9VItk)) {
            return false;
        }
        toParentPosition8S9VItk toparentposition8s9vitk = (toParentPosition8S9VItk) obj;
        return this.RemoteActionCompatParcelizer == toparentposition8s9vitk.RemoteActionCompatParcelizer && this.IconCompatParcelizer.equals(toparentposition8s9vitk.IconCompatParcelizer) && this.write.equals(toparentposition8s9vitk.write) && this.read.equals(toparentposition8s9vitk.read);
    }

    public final String toString() {
        return "FieldIndex{indexId=" + this.RemoteActionCompatParcelizer + ", collectionGroup=" + this.IconCompatParcelizer + ", segments=" + this.write + ", indexState=" + this.read + "}";
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return ((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ this.write.hashCode()) * 1000003) ^ this.read.hashCode();
    }
}

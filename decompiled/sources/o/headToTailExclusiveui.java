package o;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class headToTailExclusiveui {
    public final visitNodes IconCompatParcelizer;
    public final FirebaseFirestore read;
    public final NodeCoordinatorCompanionPointerInputSource1 serializer;
    public final getBefore write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer.hashCode();
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = this.serializer;
        return this.write.hashCode() + ((((((iHashCode2 + (iHashCode * 31)) * 31) + (nodeCoordinatorCompanionPointerInputSource1 != null ? nodeCoordinatorCompanionPointerInputSource1.read.RemoteActionCompatParcelizer.hashCode() : 0)) * 31) + (nodeCoordinatorCompanionPointerInputSource1 != null ? nodeCoordinatorCompanionPointerInputSource1.write.hashCode() : 0)) * 31);
    }

    public headToTailExclusiveui(FirebaseFirestore firebaseFirestore, visitNodes visitnodes, NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, boolean z, boolean z2) {
        firebaseFirestore.getClass();
        this.read = firebaseFirestore;
        visitnodes.getClass();
        this.IconCompatParcelizer = visitnodes;
        this.serializer = nodeCoordinatorCompanionPointerInputSource1;
        this.write = new getBefore(z2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof headToTailExclusiveui)) {
            return false;
        }
        headToTailExclusiveui headtotailexclusiveui = (headToTailExclusiveui) obj;
        if (!this.read.equals(headtotailexclusiveui.read) || !this.IconCompatParcelizer.equals(headtotailexclusiveui.IconCompatParcelizer) || !this.write.equals(headtotailexclusiveui.write)) {
            return false;
        }
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = headtotailexclusiveui.serializer;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = this.serializer;
        if (nodeCoordinatorCompanionPointerInputSource2 == null) {
            return nodeCoordinatorCompanionPointerInputSource1 == null;
        }
        return nodeCoordinatorCompanionPointerInputSource1 != null && nodeCoordinatorCompanionPointerInputSource2.write.equals(nodeCoordinatorCompanionPointerInputSource1.write);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.IconCompatParcelizer + ", metadata=" + this.write + ", doc=" + this.serializer + '}';
    }

    public final HashMap write() {
        isUpdatingui isupdatingui = isUpdatingui.DEFAULT;
        onPreAttach.serializer(isupdatingui, "Provided serverTimestampBehavior value must not be null.");
        NodeChainDiffer nodeChainDiffer = new NodeChainDiffer(this.read, isupdatingui);
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = this.serializer;
        if (nodeCoordinatorCompanionPointerInputSource1 == null) {
            return null;
        }
        return nodeChainDiffer.write(nodeCoordinatorCompanionPointerInputSource1.write.serializer().getMapValue().getFieldsMap());
    }
}

package o;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.SnapshotVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinatoroutOfBoundsHit1 extends NodeCoordinatorKt {
    public final int hashCode() {
        return serializer();
    }

    @Override // o.NodeCoordinatorKt
    public final accesscompareEquals write() {
        return null;
    }

    @Override // o.NodeCoordinatorKt
    public final void IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, orH91voCI orh91voci) {
        serializer(nodeCoordinatorCompanionPointerInputSource1);
        getRectManager.RemoteActionCompatParcelizer(orh91voci.serializer.isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer(orh91voci.write);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_COMMITTED_MUTATIONS;
    }

    @Override // o.NodeCoordinatorKt
    public final accesscompareEquals read(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, accesscompareEquals accesscompareequals, Timestamp timestamp) {
        serializer(nodeCoordinatorCompanionPointerInputSource1);
        if (!this.serializer.serializer(nodeCoordinatorCompanionPointerInputSource1)) {
            return accesscompareequals;
        }
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_LOCAL_MUTATIONS;
        nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat = SnapshotVersion.IconCompatParcelizer;
        return null;
    }

    public final String toString() {
        return "DeleteMutation{" + RemoteActionCompatParcelizer() + "}";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NodeCoordinatoroutOfBoundsHit1.class != obj.getClass()) {
            return false;
        }
        return IconCompatParcelizer((NodeCoordinatoroutOfBoundsHit1) obj);
    }

    public NodeCoordinatoroutOfBoundsHit1(visitNodes visitnodes, accessnextUntilhw7D004 accessnextuntilhw7d004) {
        super(visitnodes, accessnextuntilhw7d004);
    }
}

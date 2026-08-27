package o;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nextUntilhw7D004 extends NodeCoordinatorKt {
    public final entityTypeOLwlOKw write;

    @Override // o.NodeCoordinatorKt
    public final accesscompareEquals write() {
        return null;
    }

    public nextUntilhw7D004(visitNodes visitnodes, entityTypeOLwlOKw entitytypeolwlokw, accessnextUntilhw7D004 accessnextuntilhw7d004, ArrayList arrayList) {
        super(visitnodes, accessnextuntilhw7d004, arrayList);
        this.write = entitytypeolwlokw;
    }

    @Override // o.NodeCoordinatorKt
    public final accesscompareEquals read(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, accesscompareEquals accesscompareequals, Timestamp timestamp) {
        serializer(nodeCoordinatorCompanionPointerInputSource1);
        if (!this.serializer.serializer(nodeCoordinatorCompanionPointerInputSource1)) {
            return accesscompareequals;
        }
        HashMap mapIconCompatParcelizer = IconCompatParcelizer(timestamp, nodeCoordinatorCompanionPointerInputSource1);
        entityTypeOLwlOKw entitytypeolwlokw = new entityTypeOLwlOKw(this.write.serializer());
        entitytypeolwlokw.read(mapIconCompatParcelizer);
        nodeCoordinatorCompanionPointerInputSource1.serializer(nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat, entitytypeolwlokw);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_LOCAL_MUTATIONS;
        nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat = SnapshotVersion.IconCompatParcelizer;
        return null;
    }

    public final String toString() {
        return "SetMutation{" + RemoteActionCompatParcelizer() + ", value=" + this.write + "}";
    }

    @Override // o.NodeCoordinatorKt
    public final void IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, orH91voCI orh91voci) {
        serializer(nodeCoordinatorCompanionPointerInputSource1);
        entityTypeOLwlOKw entitytypeolwlokw = new entityTypeOLwlOKw(this.write.serializer());
        entitytypeolwlokw.read(serializer(nodeCoordinatorCompanionPointerInputSource1, orh91voci.serializer));
        nodeCoordinatorCompanionPointerInputSource1.serializer(orh91voci.write, entitytypeolwlokw);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_COMMITTED_MUTATIONS;
    }

    public final int hashCode() {
        return this.write.hashCode() + (serializer() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nextUntilhw7D004.class != obj.getClass()) {
            return false;
        }
        nextUntilhw7D004 nextuntilhw7d004 = (nextUntilhw7D004) obj;
        return IconCompatParcelizer(nextuntilhw7d004) && this.write.equals(nextuntilhw7d004.write) && this.IconCompatParcelizer.equals(nextuntilhw7d004.IconCompatParcelizer);
    }
}

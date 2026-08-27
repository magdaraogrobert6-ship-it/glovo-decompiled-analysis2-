package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getInputModeManager extends getHapticFeedBack {
    public final List RemoteActionCompatParcelizer;
    public final List read;
    public final NodeCoordinatorCompanionPointerInputSource1 serializer;
    public final visitNodes write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.write.RemoteActionCompatParcelizer.hashCode();
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = this.serializer;
        return ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31) + (nodeCoordinatorCompanionPointerInputSource1 != null ? nodeCoordinatorCompanionPointerInputSource1.hashCode() : 0);
    }

    public getInputModeManager(List list, List list2, visitNodes visitnodes, NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        this.read = list;
        this.RemoteActionCompatParcelizer = list2;
        this.write = visitnodes;
        this.serializer = nodeCoordinatorCompanionPointerInputSource1;
    }

    public final String toString() {
        return "DocumentChange{updatedTargetIds=" + this.read + ", removedTargetIds=" + this.RemoteActionCompatParcelizer + ", key=" + this.write + ", newDocument=" + this.serializer + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getInputModeManager.class == obj.getClass()) {
            getInputModeManager getinputmodemanager = (getInputModeManager) obj;
            if (!this.read.equals(getinputmodemanager.read) || !this.RemoteActionCompatParcelizer.equals(getinputmodemanager.RemoteActionCompatParcelizer) || !this.write.equals(getinputmodemanager.write)) {
                return false;
            }
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = getinputmodemanager.serializer;
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = this.serializer;
            if (nodeCoordinatorCompanionPointerInputSource2 != null) {
                return nodeCoordinatorCompanionPointerInputSource2.equals(nodeCoordinatorCompanionPointerInputSource1);
            }
            if (nodeCoordinatorCompanionPointerInputSource1 == null) {
                return true;
            }
        }
        return false;
    }
}

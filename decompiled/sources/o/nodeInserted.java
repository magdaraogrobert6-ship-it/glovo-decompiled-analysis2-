package o;

/* JADX INFO: loaded from: classes2.dex */
public final class nodeInserted {
    public final NodeCoordinatorCompanionPointerInputSource1 IconCompatParcelizer;
    public final nodeRemoved read;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = this.IconCompatParcelizer;
        return nodeCoordinatorCompanionPointerInputSource1.write.hashCode() + ((nodeCoordinatorCompanionPointerInputSource1.read.RemoteActionCompatParcelizer.hashCode() + ((iHashCode + 1891) * 31)) * 31);
    }

    public nodeInserted(nodeRemoved noderemoved, NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        this.read = noderemoved;
        this.IconCompatParcelizer = nodeCoordinatorCompanionPointerInputSource1;
    }

    public final String toString() {
        return "DocumentViewChange(" + this.IconCompatParcelizer + "," + this.read + ")";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nodeInserted)) {
            return false;
        }
        nodeInserted nodeinserted = (nodeInserted) obj;
        return this.read.equals(nodeinserted.read) && this.IconCompatParcelizer.equals(nodeinserted.IconCompatParcelizer);
    }
}

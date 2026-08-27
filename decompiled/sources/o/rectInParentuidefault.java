package o;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rectInParentuidefault implements Comparator {
    public final /* synthetic */ Comparator serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ rectInParentuidefault(Comparator comparator, int i) {
        this.write = i;
        this.serializer = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.write;
        Comparator comparator = this.serializer;
        if (i == 0) {
            nodeInserted nodeinserted = (nodeInserted) obj;
            nodeInserted nodeinserted2 = (nodeInserted) obj2;
            int iCompare = Integer.compare(headNode.RemoteActionCompatParcelizer(nodeinserted), headNode.RemoteActionCompatParcelizer(nodeinserted2));
            return iCompare != 0 ? iCompare : comparator.compare(nodeinserted.IconCompatParcelizer, nodeinserted2.IconCompatParcelizer);
        }
        if (i != 1) {
            return comparator.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
        }
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource2 = (NodeCoordinatorCompanionPointerInputSource1) obj2;
        int iCompare2 = comparator.compare(nodeCoordinatorCompanionPointerInputSource1, nodeCoordinatorCompanionPointerInputSource2);
        return iCompare2 == 0 ? nodeCoordinatorCompanionPointerInputSource1.read.compareTo(nodeCoordinatorCompanionPointerInputSource2.read) : iCompare2;
    }
}

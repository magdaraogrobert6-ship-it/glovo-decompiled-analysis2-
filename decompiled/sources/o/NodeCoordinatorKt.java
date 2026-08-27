package o;

import com.google.firebase.Timestamp;
import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NodeCoordinatorKt {
    public final ArrayList IconCompatParcelizer;
    public final visitNodes read;
    public final accessnextUntilhw7D004 serializer;

    public abstract void IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, orH91voCI orh91voci);

    public abstract accesscompareEquals read(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, accesscompareEquals accesscompareequals, Timestamp timestamp);

    public abstract accesscompareEquals write();

    public final HashMap IconCompatParcelizer(Timestamp timestamp, NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        ArrayList<NodeCoordinatorspeculativeHit1> arrayList = this.IconCompatParcelizer;
        HashMap map = new HashMap(arrayList.size());
        for (NodeCoordinatorspeculativeHit1 nodeCoordinatorspeculativeHit1 : arrayList) {
            NodeKindKt nodeKindKt = nodeCoordinatorspeculativeHit1.serializer;
            childHitTestqzLsGqo childhittestqzlsgqo = nodeCoordinatorspeculativeHit1.write;
            map.put(childhittestqzlsgqo, nodeKindKt.write(nodeCoordinatorCompanionPointerInputSource1.write.write(childhittestqzlsgqo), timestamp));
        }
        return map;
    }

    public final boolean IconCompatParcelizer(NodeCoordinatorKt nodeCoordinatorKt) {
        return this.read.equals(nodeCoordinatorKt.read) && this.serializer.equals(nodeCoordinatorKt.serializer);
    }

    public final int serializer() {
        return this.serializer.hashCode() + (this.read.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public final HashMap serializer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, ArrayList arrayList) {
        ArrayList arrayList2 = this.IconCompatParcelizer;
        HashMap map = new HashMap(arrayList2.size());
        getRectManager.RemoteActionCompatParcelizer(arrayList2.size() == arrayList.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()));
        for (int i = 0; i < arrayList.size(); i++) {
            NodeCoordinatorspeculativeHit1 nodeCoordinatorspeculativeHit1 = (NodeCoordinatorspeculativeHit1) arrayList2.get(i);
            NodeKindKt nodeKindKt = nodeCoordinatorspeculativeHit1.serializer;
            childHitTestqzLsGqo childhittestqzlsgqo = nodeCoordinatorspeculativeHit1.write;
            map.put(childhittestqzlsgqo, nodeKindKt.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.write.write(childhittestqzlsgqo), (Value) arrayList.get(i)));
        }
        return map;
    }

    public final void serializer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        getRectManager.RemoteActionCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.read.equals(this.read), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    public NodeCoordinatorKt(visitNodes visitnodes, accessnextUntilhw7D004 accessnextuntilhw7d004, ArrayList arrayList) {
        this.read = visitnodes;
        this.serializer = accessnextuntilhw7d004;
        this.IconCompatParcelizer = arrayList;
    }

    public final String RemoteActionCompatParcelizer() {
        return "key=" + this.read + ", precondition=" + this.serializer;
    }

    public NodeCoordinatorKt(visitNodes visitnodes, accessnextUntilhw7D004 accessnextuntilhw7d004) {
        this(visitnodes, accessnextuntilhw7d004, new ArrayList());
    }
}

package o;

import com.google.firestore.v1.Value;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDrawBlockParentLayerp extends nodeReused {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: Illegal instructions before constructor call */
    public accessgetDrawBlockParentLayerp(childHitTestqzLsGqo childhittestqzlsgqo, Value value, int i) {
        this.write = i;
        if (i != 2) {
            updateUnsafe updateunsafe = updateUnsafe.IN;
            super(childhittestqzlsgqo, updateunsafe, value);
            ArrayList arrayList = new ArrayList();
            this.IconCompatParcelizer = arrayList;
            arrayList.addAll(IconCompatParcelizer(updateunsafe, value));
            return;
        }
        updateUnsafe updateunsafe2 = updateUnsafe.NOT_IN;
        super(childhittestqzlsgqo, updateunsafe2, value);
        ArrayList arrayList2 = new ArrayList();
        this.IconCompatParcelizer = arrayList2;
        arrayList2.addAll(IconCompatParcelizer(updateunsafe2, value));
    }

    @Override // o.nodeReused, o.fillVector
    public final boolean IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        int i = this.write;
        if (i != 0) {
            return i != 1 ? !((ArrayList) this.IconCompatParcelizer).contains(nodeCoordinatorCompanionPointerInputSource1.read) : ((ArrayList) this.IconCompatParcelizer).contains(nodeCoordinatorCompanionPointerInputSource1.read);
        }
        return IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1.read.compareTo((visitNodes) this.IconCompatParcelizer));
    }

    public static ArrayList IconCompatParcelizer(updateUnsafe updateunsafe, Value value) {
        getRectManager.RemoteActionCompatParcelizer(updateunsafe == updateUnsafe.IN || updateunsafe == updateUnsafe.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        getRectManager.RemoteActionCompatParcelizer(NodeCoordinatorCompaniononCommitAffectingLayer1.read(value), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        Iterator<Value> it = value.getArrayValue().getValuesList().iterator();
        while (it.hasNext()) {
            Value next = it.next();
            getRectManager.RemoteActionCompatParcelizer(next != null && next.hasReferenceValue(), "Comparing on key with " + updateunsafe.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(visitNodes.IconCompatParcelizer(next.getReferenceValue()));
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetDrawBlockParentLayerp(childHitTestqzLsGqo childhittestqzlsgqo, updateUnsafe updateunsafe, Value value) {
        super(childhittestqzlsgqo, updateunsafe, value);
        this.write = 0;
        NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
        getRectManager.RemoteActionCompatParcelizer(value != null && value.hasReferenceValue(), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.IconCompatParcelizer = visitNodes.IconCompatParcelizer(value.getReferenceValue());
    }
}

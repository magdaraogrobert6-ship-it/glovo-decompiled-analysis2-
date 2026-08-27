package o;

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinatordrawBlock1 extends NodeCoordinatorHitTestSource {
    @Override // o.NodeCoordinatorHitTestSource
    public final Value IconCompatParcelizer(Value value) {
        performActionHelper performactionhelperNewBuilder = NodeCoordinatorCompaniononCommitAffectingLayer1.read(value) ? (performActionHelper) value.getArrayValue().toBuilder() : ArrayValue.newBuilder();
        for (Value value2 : this.RemoteActionCompatParcelizer) {
            if (!NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(performactionhelperNewBuilder, value2)) {
                performactionhelperNewBuilder.RemoteActionCompatParcelizer();
                ((ArrayValue) performactionhelperNewBuilder.RemoteActionCompatParcelizer).addValues(value2);
            }
        }
        accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
        accesscontainsdescendantNewBuilder.serializer(performactionhelperNewBuilder);
        return (Value) accesscontainsdescendantNewBuilder.serializer();
    }

    public NodeCoordinatordrawBlock1(List list) {
        super(list);
    }
}

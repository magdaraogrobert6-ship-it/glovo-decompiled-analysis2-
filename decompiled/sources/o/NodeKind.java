package o;

import com.google.firebase.Timestamp;
import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeKind implements NodeKindKt {
    public Value IconCompatParcelizer;

    @Override // o.NodeKindKt
    public final Value RemoteActionCompatParcelizer(Value value, Value value2) {
        return value2;
    }

    public final double serializer() {
        Value value = this.IconCompatParcelizer;
        NodeCoordinatorCompaniononCommitAffectingLayer1 nodeCoordinatorCompaniononCommitAffectingLayer1 = NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer;
        if (value != null && value.hasDoubleValue()) {
            return value.getDoubleValue();
        }
        if (NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value)) {
            return value.getIntegerValue();
        }
        getRectManager.write("Expected 'operand' to be of Number type, but was " + value.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }

    @Override // o.NodeKindKt
    public final Value write(Value value, Timestamp timestamp) {
        Value value2;
        long integerValue;
        Value value3 = this.IconCompatParcelizer;
        if (NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value) || (value != null && value.hasDoubleValue())) {
            value2 = value;
        } else {
            accesscontainsDescendant accesscontainsdescendantNewBuilder = Value.newBuilder();
            accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer();
            ((Value) accesscontainsdescendantNewBuilder.RemoteActionCompatParcelizer).setIntegerValue(0L);
            value2 = (Value) accesscontainsdescendantNewBuilder.serializer();
        }
        boolean z = false;
        if (!NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value2) || !NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value3)) {
            if (NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value2)) {
                double integerValue2 = value2.getIntegerValue();
                double dSerializer = serializer();
                accesscontainsDescendant accesscontainsdescendantNewBuilder2 = Value.newBuilder();
                accesscontainsdescendantNewBuilder2.RemoteActionCompatParcelizer(dSerializer + integerValue2);
                return (Value) accesscontainsdescendantNewBuilder2.serializer();
            }
            if (value2 != null && value2.hasDoubleValue()) {
                z = true;
            }
            getRectManager.RemoteActionCompatParcelizer(z, "Expected NumberValue to be of type DoubleValue, but was ", value.getClass().getCanonicalName());
            double doubleValue = value2.getDoubleValue();
            double dSerializer2 = serializer();
            accesscontainsDescendant accesscontainsdescendantNewBuilder3 = Value.newBuilder();
            accesscontainsdescendantNewBuilder3.RemoteActionCompatParcelizer(dSerializer2 + doubleValue);
            return (Value) accesscontainsdescendantNewBuilder3.serializer();
        }
        long integerValue3 = value2.getIntegerValue();
        if (value3 != null && value3.hasDoubleValue()) {
            integerValue = (long) value3.getDoubleValue();
        } else {
            if (!NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value3)) {
                getRectManager.write("Expected 'operand' to be of Number type, but was " + value3.getClass().getCanonicalName(), new Object[0]);
                throw null;
            }
            integerValue = value3.getIntegerValue();
        }
        long j = integerValue3 + integerValue;
        if (((integerValue ^ j) & (integerValue3 ^ j)) < 0) {
            j = j >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        accesscontainsDescendant accesscontainsdescendantNewBuilder4 = Value.newBuilder();
        accesscontainsdescendantNewBuilder4.RemoteActionCompatParcelizer();
        ((Value) accesscontainsdescendantNewBuilder4.RemoteActionCompatParcelizer).setIntegerValue(j);
        return (Value) accesscontainsdescendantNewBuilder4.serializer();
    }
}

package o;

import com.google.firestore.v1.Value;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class accessdrawContainedDrawModifiers extends nodeReused {
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ accessdrawContainedDrawModifiers(childHitTestqzLsGqo childhittestqzlsgqo, updateUnsafe updateunsafe, Value value, int i) {
        super(childhittestqzlsgqo, updateunsafe, value);
        this.write = i;
    }

    @Override // o.nodeReused, o.fillVector
    public final boolean IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        Value valueWrite;
        int i = this.write;
        Value value = this.RemoteActionCompatParcelizer;
        childHitTestqzLsGqo childhittestqzlsgqo = this.serializer;
        if (i == 0) {
            return (NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value.getArrayValue(), NodeCoordinatorCompaniononCommitAffectingLayer1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) || (valueWrite = nodeCoordinatorCompanionPointerInputSource1.write.write(childhittestqzlsgqo)) == null || valueWrite.hasNullValue() || NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value.getArrayValue(), valueWrite)) ? false : true;
        }
        if (i != 1) {
            Value valueWrite2 = nodeCoordinatorCompanionPointerInputSource1.write.write(childhittestqzlsgqo);
            return NodeCoordinatorCompaniononCommitAffectingLayer1.read(valueWrite2) && NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(valueWrite2.getArrayValue(), value);
        }
        Value valueWrite3 = nodeCoordinatorCompanionPointerInputSource1.write.write(childhittestqzlsgqo);
        if (NodeCoordinatorCompaniononCommitAffectingLayer1.read(valueWrite3)) {
            Iterator<Value> it = valueWrite3.getArrayValue().getValuesList().iterator();
            while (it.hasNext()) {
                if (NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(value.getArrayValue(), it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}

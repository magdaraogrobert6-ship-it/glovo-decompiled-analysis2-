package o;

import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public final class actionForModifiers extends nodeReused {
    @Override // o.nodeReused, o.fillVector
    public final boolean IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        Value valueWrite = nodeCoordinatorCompanionPointerInputSource1.write.write(this.serializer);
        return valueWrite != null && NodeCoordinatorCompaniononCommitAffectingLayer1.serializer(this.RemoteActionCompatParcelizer.getArrayValue(), valueWrite);
    }

    public actionForModifiers(childHitTestqzLsGqo childhittestqzlsgqo, updateUnsafe updateunsafe, Value value) {
        super(childhittestqzlsgqo, updateunsafe, value);
    }
}

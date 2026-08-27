package o;

import com.google.firestore.v1.Value;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class nodeReused extends fillVector {
    public final Value RemoteActionCompatParcelizer;
    public final updateUnsafe read;
    public final childHitTestqzLsGqo serializer;

    @Override // o.fillVector
    public final List RemoteActionCompatParcelizer() {
        return Collections.singletonList(this);
    }

    @Override // o.fillVector
    public final List read() {
        return Collections.singletonList(this);
    }

    public final String toString() {
        return serializer();
    }

    public static nodeReused IconCompatParcelizer(childHitTestqzLsGqo childhittestqzlsgqo, updateUnsafe updateunsafe, Value value) {
        int i = 2;
        int i2 = 0;
        char c = 1;
        if (childhittestqzlsgqo.equals(childHitTestqzLsGqo.write)) {
            if (updateunsafe == updateUnsafe.IN) {
                return new accessgetDrawBlockParentLayerp(childhittestqzlsgqo, value, 1);
            }
            if (updateunsafe == updateUnsafe.NOT_IN) {
                return new accessgetDrawBlockParentLayerp(childhittestqzlsgqo, value, 2);
            }
            getRectManager.RemoteActionCompatParcelizer((updateunsafe == updateUnsafe.ARRAY_CONTAINS || updateunsafe == updateUnsafe.ARRAY_CONTAINS_ANY) ? false : true, updateunsafe.toString() + "queries don't make sense on document keys", new Object[0]);
            return new accessgetDrawBlockParentLayerp(childhittestqzlsgqo, updateunsafe, value);
        }
        updateUnsafe updateunsafe2 = updateUnsafe.ARRAY_CONTAINS;
        if (updateunsafe == updateunsafe2) {
            return new accessdrawContainedDrawModifiers(childhittestqzlsgqo, updateunsafe2, value, i);
        }
        updateUnsafe updateunsafe3 = updateUnsafe.IN;
        if (updateunsafe == updateunsafe3) {
            actionForModifiers actionformodifiers = new actionForModifiers(childhittestqzlsgqo, updateunsafe3, value);
            getRectManager.RemoteActionCompatParcelizer(NodeCoordinatorCompaniononCommitAffectingLayer1.read(value), "InFilter expects an ArrayValue", new Object[0]);
            return actionformodifiers;
        }
        updateUnsafe updateunsafe4 = updateUnsafe.ARRAY_CONTAINS_ANY;
        if (updateunsafe == updateunsafe4) {
            accessdrawContainedDrawModifiers accessdrawcontaineddrawmodifiers = new accessdrawContainedDrawModifiers(childhittestqzlsgqo, updateunsafe4, value, c == true ? 1 : 0);
            getRectManager.RemoteActionCompatParcelizer(NodeCoordinatorCompaniononCommitAffectingLayer1.read(value), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
            return accessdrawcontaineddrawmodifiers;
        }
        updateUnsafe updateunsafe5 = updateUnsafe.NOT_IN;
        if (updateunsafe != updateunsafe5) {
            return new nodeReused(childhittestqzlsgqo, updateunsafe, value);
        }
        accessdrawContainedDrawModifiers accessdrawcontaineddrawmodifiers2 = new accessdrawContainedDrawModifiers(childhittestqzlsgqo, updateunsafe5, value, i2);
        getRectManager.RemoteActionCompatParcelizer(NodeCoordinatorCompaniononCommitAffectingLayer1.read(value), "NotInFilter expects an ArrayValue", new Object[0]);
        return accessdrawcontaineddrawmodifiers2;
    }

    public final boolean IconCompatParcelizer(int i) {
        int[] iArr = accessfillVector.write;
        updateUnsafe updateunsafe = this.read;
        switch (iArr[updateunsafe.ordinal()]) {
            case 1:
                return i < 0;
            case 2:
                return i <= 0;
            case 3:
                return i == 0;
            case 4:
                return i != 0;
            case 5:
                return i > 0;
            case 6:
                return i >= 0;
            default:
                getRectManager.write("Unknown FieldFilter operator: %s", updateunsafe);
                throw null;
        }
    }

    @Override // o.fillVector
    public boolean IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        Value valueWrite = nodeCoordinatorCompanionPointerInputSource1.write.write(this.serializer);
        updateUnsafe updateunsafe = this.read;
        updateUnsafe updateunsafe2 = updateUnsafe.NOT_EQUAL;
        Value value = this.RemoteActionCompatParcelizer;
        if (updateunsafe == updateunsafe2) {
            return (valueWrite == null || valueWrite.hasNullValue() || !IconCompatParcelizer(NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(valueWrite, value))) ? false : true;
        }
        return valueWrite != null && NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(valueWrite) == NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(value) && IconCompatParcelizer(NodeCoordinatorCompaniononCommitAffectingLayer1.RemoteActionCompatParcelizer(valueWrite, value));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof nodeReused)) {
            return false;
        }
        nodeReused nodereused = (nodeReused) obj;
        return this.read == nodereused.read && this.serializer.equals(nodereused.serializer) && this.RemoteActionCompatParcelizer.equals(nodereused.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return this.RemoteActionCompatParcelizer.hashCode() + ((this.serializer.hashCode() + ((iHashCode + 1147) * 31)) * 31);
    }

    @Override // o.fillVector
    public final String serializer() {
        return this.serializer.write() + this.read.toString() + NodeCoordinatorCompaniononCommitAffectingLayer1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final boolean write() {
        return Arrays.asList(updateUnsafe.LESS_THAN, updateUnsafe.LESS_THAN_OR_EQUAL, updateUnsafe.GREATER_THAN, updateUnsafe.GREATER_THAN_OR_EQUAL, updateUnsafe.NOT_EQUAL, updateUnsafe.NOT_IN).contains(this.read);
    }

    public nodeReused(childHitTestqzLsGqo childhittestqzlsgqo, updateUnsafe updateunsafe, Value value) {
        this.serializer = childhittestqzlsgqo;
        this.read = updateunsafe;
        this.RemoteActionCompatParcelizer = value;
    }
}

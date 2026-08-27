package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getSuppressMovementConsumption extends HoverIconModifierNodefindOverridingAncestorNode1 implements Set {
    public transient getMotionEvent serializer;

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return ApproachLayoutModifierNodemeasure11.serializer(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}

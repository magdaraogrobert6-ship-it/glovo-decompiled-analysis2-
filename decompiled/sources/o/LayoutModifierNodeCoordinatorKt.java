package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinatorKt {
    public final Class RemoteActionCompatParcelizer;
    public final Class read;

    public final int hashCode() {
        return Objects.hash(this.RemoteActionCompatParcelizer, this.read);
    }

    public final String toString() {
        return this.RemoteActionCompatParcelizer.getSimpleName() + " with serialization type: " + this.read.getSimpleName();
    }

    public LayoutModifierNodeCoordinatorKt(Class cls, Class cls2) {
        this.RemoteActionCompatParcelizer = cls;
        this.read = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LayoutModifierNodeCoordinatorKt)) {
            return false;
        }
        LayoutModifierNodeCoordinatorKt layoutModifierNodeCoordinatorKt = (LayoutModifierNodeCoordinatorKt) obj;
        return layoutModifierNodeCoordinatorKt.RemoteActionCompatParcelizer.equals(this.RemoteActionCompatParcelizer) && layoutModifierNodeCoordinatorKt.read.equals(this.read);
    }
}

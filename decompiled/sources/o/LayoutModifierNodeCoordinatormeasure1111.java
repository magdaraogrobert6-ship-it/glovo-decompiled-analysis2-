package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutModifierNodeCoordinatormeasure1111 {
    public final Class RemoteActionCompatParcelizer;
    public final Class serializer;

    public final int hashCode() {
        return Objects.hash(this.serializer, this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return this.serializer.getSimpleName() + " with primitive type: " + this.RemoteActionCompatParcelizer.getSimpleName();
    }

    public LayoutModifierNodeCoordinatormeasure1111(Class cls, Class cls2) {
        this.serializer = cls;
        this.RemoteActionCompatParcelizer = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LayoutModifierNodeCoordinatormeasure1111)) {
            return false;
        }
        LayoutModifierNodeCoordinatormeasure1111 layoutModifierNodeCoordinatormeasure1111 = (LayoutModifierNodeCoordinatormeasure1111) obj;
        return layoutModifierNodeCoordinatormeasure1111.serializer.equals(this.serializer) && layoutModifierNodeCoordinatormeasure1111.RemoteActionCompatParcelizer.equals(this.RemoteActionCompatParcelizer);
    }
}

package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImplmoveFocusfocusSearchSuccess1 {
    public final Object IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Object obj = this.RemoteActionCompatParcelizer;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public FocusOwnerImplmoveFocusfocusSearchSuccess1(Object obj, Object obj2) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    public final String toString() {
        return "Pair{" + this.IconCompatParcelizer + " " + this.RemoteActionCompatParcelizer + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FocusOwnerImplmoveFocusfocusSearchSuccess1)) {
            return false;
        }
        FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1 = (FocusOwnerImplmoveFocusfocusSearchSuccess1) obj;
        return focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer.equals(this.IconCompatParcelizer) && Objects.equals(focusOwnerImplmoveFocusfocusSearchSuccess1.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
    }
}

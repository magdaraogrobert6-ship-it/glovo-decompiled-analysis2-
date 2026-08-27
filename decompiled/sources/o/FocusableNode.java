package o;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class FocusableNode {
    public final setTitleMarginBottom RemoteActionCompatParcelizer;
    public final applySemantics serializer;

    public final int hashCode() {
        return Objects.hash(this.serializer, this.RemoteActionCompatParcelizer);
    }

    public FocusableNode(applySemantics applysemantics, setTitleMarginBottom settitlemarginbottom) {
        this.serializer = applysemantics;
        this.RemoteActionCompatParcelizer = settitlemarginbottom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusableNode)) {
            return false;
        }
        FocusableNode focusableNode = (FocusableNode) obj;
        return this.serializer == focusableNode.serializer && Objects.equals(this.RemoteActionCompatParcelizer, focusableNode.RemoteActionCompatParcelizer);
    }
}

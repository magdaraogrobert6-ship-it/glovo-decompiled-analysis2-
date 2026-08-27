package o;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setActiveFocusTargetNode {
    public List RemoteActionCompatParcelizer;
    public String read;
    public String write;

    public final int hashCode() {
        return Objects.hash(this.read, this.write, this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setActiveFocusTargetNode)) {
            return false;
        }
        setActiveFocusTargetNode setactivefocustargetnode = (setActiveFocusTargetNode) obj;
        return Objects.equals(this.read, setactivefocustargetnode.read) && Objects.equals(this.write, setactivefocustargetnode.write) && Objects.equals(this.RemoteActionCompatParcelizer, setactivefocustargetnode.RemoteActionCompatParcelizer);
    }
}

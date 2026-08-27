package o;

import com.google.firestore.v1.Value;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setBefore {
    public final boolean RemoteActionCompatParcelizer;
    public final List write;

    public final String RemoteActionCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Value value : this.write) {
            if (!z) {
                sb.append(",");
            }
            sb.append(NodeCoordinatorCompaniononCommitAffectingLayer1.IconCompatParcelizer(value));
            z = false;
        }
        return sb.toString();
    }

    public setBefore(List list, boolean z) {
        this.write = list;
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        return this.write.hashCode() + ((this.RemoteActionCompatParcelizer ? 1 : 0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Bound(inclusive=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", position=");
        int i = 0;
        while (true) {
            List list = this.write;
            if (i < list.size()) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(NodeCoordinatorCompaniononCommitAffectingLayer1.IconCompatParcelizer((Value) list.get(i)));
                i++;
            } else {
                sb.append(")");
                return sb.toString();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || setBefore.class != obj.getClass()) {
            return false;
        }
        setBefore setbefore = (setBefore) obj;
        return this.RemoteActionCompatParcelizer == setbefore.RemoteActionCompatParcelizer && this.write.equals(setbefore.write);
    }
}

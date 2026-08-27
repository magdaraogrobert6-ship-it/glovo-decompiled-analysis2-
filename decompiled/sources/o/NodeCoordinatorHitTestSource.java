package o;

import com.google.firebase.Timestamp;
import com.google.firestore.v1.Value;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NodeCoordinatorHitTestSource implements NodeKindKt {
    public final List RemoteActionCompatParcelizer;

    public abstract Value IconCompatParcelizer(Value value);

    @Override // o.NodeKindKt
    public final Value RemoteActionCompatParcelizer(Value value, Value value2) {
        return IconCompatParcelizer(value);
    }

    @Override // o.NodeKindKt
    public final Value write(Value value, Timestamp timestamp) {
        return IconCompatParcelizer(value);
    }

    public NodeCoordinatorHitTestSource(List list) {
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList(list);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (getClass().hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.RemoteActionCompatParcelizer.equals(((NodeCoordinatorHitTestSource) obj).RemoteActionCompatParcelizer);
    }
}

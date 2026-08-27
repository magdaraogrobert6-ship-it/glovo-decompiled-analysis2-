package o;

import bo.app.af$$ExternalSyntheticOutline1;
import com.google.firebase.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeCoordinatorupdateLayerParameters1 {
    public final ArrayList IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final ArrayList serializer;
    public final Timestamp write;

    public final HashSet IconCompatParcelizer() {
        HashSet hashSet = new HashSet();
        Iterator it = this.serializer.iterator();
        while (it.hasNext()) {
            hashSet.add(((NodeCoordinatorKt) it.next()).read);
        }
        return hashSet;
    }

    public NodeCoordinatorupdateLayerParameters1(int i, Timestamp timestamp, ArrayList arrayList, ArrayList arrayList2) {
        getRectManager.RemoteActionCompatParcelizer(!arrayList2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.RemoteActionCompatParcelizer = i;
        this.write = timestamp;
        this.IconCompatParcelizer = arrayList;
        this.serializer = arrayList2;
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = this.write.hashCode();
        return this.serializer.hashCode() + ((this.IconCompatParcelizer.hashCode() + ((iHashCode + (i * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutationBatch(batchId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", localWriteTime=");
        sb.append(this.write);
        sb.append(", baseMutations=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mutations=");
        return af$$ExternalSyntheticOutline1.m(sb, this.serializer, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NodeCoordinatorupdateLayerParameters1.class != obj.getClass()) {
            return false;
        }
        NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1 = (NodeCoordinatorupdateLayerParameters1) obj;
        return this.RemoteActionCompatParcelizer == nodeCoordinatorupdateLayerParameters1.RemoteActionCompatParcelizer && this.write.equals(nodeCoordinatorupdateLayerParameters1.write) && this.IconCompatParcelizer.equals(nodeCoordinatorupdateLayerParameters1.IconCompatParcelizer) && this.serializer.equals(nodeCoordinatorupdateLayerParameters1.serializer);
    }
}

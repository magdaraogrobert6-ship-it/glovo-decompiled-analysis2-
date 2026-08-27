package o;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class compareEquals extends NodeCoordinatorKt {
    public final accesscompareEquals RemoteActionCompatParcelizer;
    public final entityTypeOLwlOKw write;

    @Override // o.NodeCoordinatorKt
    public final accesscompareEquals write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final HashMap read() {
        HashMap map = new HashMap();
        for (childHitTestqzLsGqo childhittestqzlsgqo : this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
            if (!childhittestqzlsgqo.IconCompatParcelizer()) {
                map.put(childhittestqzlsgqo, this.write.write(childhittestqzlsgqo));
            }
        }
        return map;
    }

    public compareEquals(visitNodes visitnodes, entityTypeOLwlOKw entitytypeolwlokw, accesscompareEquals accesscompareequals, accessnextUntilhw7D004 accessnextuntilhw7d004, ArrayList arrayList) {
        super(visitnodes, accessnextuntilhw7d004, arrayList);
        this.write = entitytypeolwlokw;
        this.RemoteActionCompatParcelizer = accesscompareequals;
    }

    @Override // o.NodeCoordinatorKt
    public final void IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, orH91voCI orh91voci) {
        serializer(nodeCoordinatorCompanionPointerInputSource1);
        if (!this.serializer.serializer(nodeCoordinatorCompanionPointerInputSource1)) {
            nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat = orh91voci.write;
            nodeCoordinatorCompanionPointerInputSource1.serializer = getSemanticsSource.UNKNOWN_DOCUMENT;
            nodeCoordinatorCompanionPointerInputSource1.write = new entityTypeOLwlOKw();
            nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_COMMITTED_MUTATIONS;
            return;
        }
        HashMap mapSerializer = serializer(nodeCoordinatorCompanionPointerInputSource1, orh91voci.serializer);
        entityTypeOLwlOKw entitytypeolwlokw = nodeCoordinatorCompanionPointerInputSource1.write;
        entitytypeolwlokw.read(read());
        entitytypeolwlokw.read(mapSerializer);
        nodeCoordinatorCompanionPointerInputSource1.serializer(orh91voci.write, nodeCoordinatorCompanionPointerInputSource1.write);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_COMMITTED_MUTATIONS;
    }

    @Override // o.NodeCoordinatorKt
    public final accesscompareEquals read(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1, accesscompareEquals accesscompareequals, Timestamp timestamp) {
        serializer(nodeCoordinatorCompanionPointerInputSource1);
        if (!this.serializer.serializer(nodeCoordinatorCompanionPointerInputSource1)) {
            return accesscompareequals;
        }
        HashMap mapIconCompatParcelizer = IconCompatParcelizer(timestamp, nodeCoordinatorCompanionPointerInputSource1);
        HashMap map = read();
        entityTypeOLwlOKw entitytypeolwlokw = nodeCoordinatorCompanionPointerInputSource1.write;
        entitytypeolwlokw.read(map);
        entitytypeolwlokw.read(mapIconCompatParcelizer);
        nodeCoordinatorCompanionPointerInputSource1.serializer(nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat, nodeCoordinatorCompanionPointerInputSource1.write);
        nodeCoordinatorCompanionPointerInputSource1.RemoteActionCompatParcelizer = getPointerInputSource.HAS_LOCAL_MUTATIONS;
        nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat = SnapshotVersion.IconCompatParcelizer;
        if (accesscompareequals == null) {
            return null;
        }
        HashSet hashSet = new HashSet(accesscompareequals.RemoteActionCompatParcelizer);
        hashSet.addAll(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(((NodeCoordinatorspeculativeHit1) it.next()).write);
        }
        hashSet.addAll(arrayList);
        return new accesscompareEquals(hashSet);
    }

    public final String toString() {
        return "PatchMutation{" + RemoteActionCompatParcelizer() + ", mask=" + this.RemoteActionCompatParcelizer + ", value=" + this.write + "}";
    }

    public final int hashCode() {
        return this.write.hashCode() + (serializer() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || compareEquals.class != obj.getClass()) {
            return false;
        }
        compareEquals compareequals = (compareEquals) obj;
        return IconCompatParcelizer(compareequals) && this.write.equals(compareequals.write) && this.IconCompatParcelizer.equals(compareequals.IconCompatParcelizer);
    }
}

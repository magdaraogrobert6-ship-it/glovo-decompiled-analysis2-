package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetPointerInputSourcecp {
    public static final accessgetSnapshotObserver IconCompatParcelizer;
    public static final accessgetSnapshotObserver serializer;
    public final shareWithSiblings MediaSessionCompatQueueItem;
    public List RemoteActionCompatParcelizer;
    public fromParentRect read;
    public final accesssetDrawBlockParentLayerp write;

    public final List read() {
        List list;
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                for (accessgetSnapshotObserver accessgetsnapshotobserver : Collections.EMPTY_LIST) {
                    arrayList.add(accessgetsnapshotobserver);
                    hashSet.add(accessgetsnapshotobserver.RemoteActionCompatParcelizer.write());
                }
                List list2 = Collections.EMPTY_LIST;
                accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp = list2.size() > 0 ? ((accessgetSnapshotObserver) list2.get(list2.size() - 1)).write : accessgetOnCommitAffectingLayercp.ASCENDING;
                for (childHitTestqzLsGqo childhittestqzlsgqo : write()) {
                    if (!hashSet.contains(childhittestqzlsgqo.write()) && !childhittestqzlsgqo.equals(childHitTestqzLsGqo.write)) {
                        arrayList.add(new accessgetSnapshotObserver(accessgetoncommitaffectinglayercp, childhittestqzlsgqo));
                    }
                }
                if (!hashSet.contains(childHitTestqzLsGqo.write.write())) {
                    arrayList.add(accessgetoncommitaffectinglayercp.equals(accessgetOnCommitAffectingLayercp.ASCENDING) ? serializer : IconCompatParcelizer);
                }
                this.RemoteActionCompatParcelizer = Collections.unmodifiableList(arrayList);
            }
            list = this.RemoteActionCompatParcelizer;
        }
        return list;
    }

    public final fromParentRect read(List list) {
        synchronized (this) {
            if (this.write == accesssetDrawBlockParentLayerp.LIMIT_TO_FIRST) {
                return new fromParentRect(this.MediaSessionCompatQueueItem, null, Collections.EMPTY_LIST, list, -1L, null, null);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                accessgetSnapshotObserver accessgetsnapshotobserver = (accessgetSnapshotObserver) it.next();
                accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp = accessgetsnapshotobserver.write;
                accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp2 = accessgetOnCommitAffectingLayercp.DESCENDING;
                if (accessgetoncommitaffectinglayercp == accessgetoncommitaffectinglayercp2) {
                    accessgetoncommitaffectinglayercp2 = accessgetOnCommitAffectingLayercp.ASCENDING;
                }
                arrayList.add(new accessgetSnapshotObserver(accessgetoncommitaffectinglayercp2, accessgetsnapshotobserver.RemoteActionCompatParcelizer));
            }
            return new fromParentRect(this.MediaSessionCompatQueueItem, null, Collections.EMPTY_LIST, arrayList, -1L, null, null);
        }
    }

    static {
        accessgetOnCommitAffectingLayercp accessgetoncommitaffectinglayercp = accessgetOnCommitAffectingLayercp.ASCENDING;
        childHitTestqzLsGqo childhittestqzlsgqo = childHitTestqzLsGqo.write;
        serializer = new accessgetSnapshotObserver(accessgetoncommitaffectinglayercp, childhittestqzlsgqo);
        IconCompatParcelizer = new accessgetSnapshotObserver(accessgetOnCommitAffectingLayercp.DESCENDING, childhittestqzlsgqo);
    }

    public accessgetPointerInputSourcecp(shareWithSiblings sharewithsiblings, accesssetDrawBlockParentLayerp accesssetdrawblockparentlayerp) {
        List list = Collections.EMPTY_LIST;
        this.MediaSessionCompatQueueItem = sharewithsiblings;
        this.write = accesssetdrawblockparentlayerp;
    }

    public static accessgetPointerInputSourcecp IconCompatParcelizer(shareWithSiblings sharewithsiblings) {
        List list = Collections.EMPTY_LIST;
        return new accessgetPointerInputSourcecp(sharewithsiblings, accesssetDrawBlockParentLayerp.LIMIT_TO_FIRST);
    }

    public final boolean RemoteActionCompatParcelizer() {
        List list = Collections.EMPTY_LIST;
        return list.isEmpty() && (list.isEmpty() || (list.size() == 1 && ((accessgetSnapshotObserver) list.get(0)).RemoteActionCompatParcelizer.equals(childHitTestqzLsGqo.write)));
    }

    public final TreeSet write() {
        TreeSet treeSet = new TreeSet();
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            for (nodeReused nodereused : ((fillVector) it.next()).read()) {
                if (nodereused.write()) {
                    treeSet.add(nodereused.serializer);
                }
            }
        }
        return treeSet;
    }

    public final int hashCode() {
        return this.write.hashCode() + (serializer().hashCode() * 31);
    }

    public final String toString() {
        return "Query(target=" + serializer().toString() + ";limitType=" + this.write.toString() + ")";
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:1: B:30:0x0082->B:45:?, LOOP_END, SYNTHETIC] */
    public final boolean IconCompatParcelizer(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        Iterator it;
        if (nodeCoordinatorCompanionPointerInputSource1.read()) {
            shareWithSiblings sharewithsiblings = nodeCoordinatorCompanionPointerInputSource1.read.RemoteActionCompatParcelizer;
            shareWithSiblings sharewithsiblings2 = this.MediaSessionCompatQueueItem;
            if (!visitNodes.serializer(sharewithsiblings2)) {
                List list = sharewithsiblings2.IconCompatParcelizer;
                if (list.size() <= sharewithsiblings.IconCompatParcelizer.size()) {
                    for (int i = 0; i < list.size(); i++) {
                        if (sharewithsiblings2.RemoteActionCompatParcelizer(i).equals(sharewithsiblings.RemoteActionCompatParcelizer(i))) {
                        }
                    }
                    if (sharewithsiblings2.IconCompatParcelizer.size() == sharewithsiblings.IconCompatParcelizer.size() - 1) {
                        for (accessgetSnapshotObserver accessgetsnapshotobserver : read()) {
                            if (!accessgetsnapshotobserver.RemoteActionCompatParcelizer.equals(childHitTestqzLsGqo.write)) {
                                if (nodeCoordinatorCompanionPointerInputSource1.write.write(accessgetsnapshotobserver.RemoteActionCompatParcelizer) == null) {
                                }
                            }
                        }
                        it = Collections.EMPTY_LIST.iterator();
                        while (it.hasNext()) {
                            if (!((fillVector) it.next()).IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1)) {
                            }
                        }
                        return true;
                    }
                }
            } else if (sharewithsiblings2.equals(sharewithsiblings)) {
                while (r0.hasNext()) {
                    if (!accessgetsnapshotobserver.RemoteActionCompatParcelizer.equals(childHitTestqzLsGqo.write)) {
                        if (nodeCoordinatorCompanionPointerInputSource1.write.write(accessgetsnapshotobserver.RemoteActionCompatParcelizer) == null) {
                        }
                    }
                }
                it = Collections.EMPTY_LIST.iterator();
                while (it.hasNext()) {
                    if (!((fillVector) it.next()).IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || accessgetPointerInputSourcecp.class != obj.getClass()) {
            return false;
        }
        accessgetPointerInputSourcecp accessgetpointerinputsourcecp = (accessgetPointerInputSourcecp) obj;
        if (this.write != accessgetpointerinputsourcecp.write) {
            return false;
        }
        return serializer().equals(accessgetpointerinputsourcecp.serializer());
    }

    public final fromParentRect serializer() {
        fromParentRect fromparentrect;
        synchronized (this) {
            if (this.read == null) {
                this.read = read(read());
            }
            fromparentrect = this.read;
        }
        return fromparentrect;
    }
}

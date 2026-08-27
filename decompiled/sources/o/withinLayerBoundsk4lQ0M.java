package o;

import com.google.android.gms.internal.gtm.zzkh;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class withinLayerBoundsk4lQ0M implements Iterable {
    public final accessswap RemoteActionCompatParcelizer;
    public final asList serializer;

    public final int hashCode() {
        Iterator it = this.serializer.iterator();
        int iHashCode = 0;
        while (true) {
            zzkh zzkhVar = (zzkh) it;
            if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                return iHashCode;
            }
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) zzkhVar.next();
            iHashCode = nodeCoordinatorCompanionPointerInputSource1.write.hashCode() + ((nodeCoordinatorCompanionPointerInputSource1.read.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.serializer.iterator();
    }

    public final withinLayerBoundsk4lQ0M read(visitNodes visitnodes) {
        accessswap accessswapVar = this.RemoteActionCompatParcelizer;
        NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) accessswapVar.IconCompatParcelizer(visitnodes);
        return nodeCoordinatorCompanionPointerInputSource1 == null ? this : new withinLayerBoundsk4lQ0M(accessswapVar.RemoteActionCompatParcelizer(visitnodes), this.serializer.read(nodeCoordinatorCompanionPointerInputSource1));
    }

    public withinLayerBoundsk4lQ0M(accessswap accessswapVar, asList aslist) {
        this.RemoteActionCompatParcelizer = accessswapVar;
        this.serializer = aslist;
    }

    public static withinLayerBoundsk4lQ0M IconCompatParcelizer(Comparator comparator) {
        return new withinLayerBoundsk4lQ0M(withPositionTranslation.read, new asList(Collections.EMPTY_LIST, new rectInParentuidefault(comparator, 1)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = this.serializer.iterator();
        boolean z = true;
        while (true) {
            zzkh zzkhVar = (zzkh) it;
            if (((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) zzkhVar.next();
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(nodeCoordinatorCompanionPointerInputSource1);
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public final boolean equals(Object obj) {
        zzkh zzkhVar;
        if (this == obj) {
            return true;
        }
        if (obj == null || withinLayerBoundsk4lQ0M.class != obj.getClass()) {
            return false;
        }
        withinLayerBoundsk4lQ0M withinlayerboundsk4lq0m = (withinLayerBoundsk4lQ0M) obj;
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer() != withinlayerboundsk4lq0m.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            return false;
        }
        Iterator it = this.serializer.iterator();
        Iterator it2 = withinlayerboundsk4lq0m.serializer.iterator();
        do {
            zzkhVar = (zzkh) it;
            if (!((Iterator) zzkhVar.RemoteActionCompatParcelizer).hasNext()) {
                return true;
            }
        } while (((NodeCoordinatorCompanionPointerInputSource1) zzkhVar.next()).equals((NodeCoordinatorCompanionPointerInputSource1) ((zzkh) it2).next()));
        return false;
    }
}

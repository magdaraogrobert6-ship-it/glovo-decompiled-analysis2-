package bo.app;

import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class dh {
    public final List a;
    public final fh b;
    public final List c;

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        fh fhVar = this.b;
        return this.c.hashCode() + (((iHashCode * 31) + (fhVar == null ? 0 : fhVar.hashCode())) * 31);
    }

    public final String toString() {
        List list = this.a;
        fh fhVar = this.b;
        List list2 = this.c;
        StringBuilder sb = new StringBuilder("TriggeredActionsReceivedEvent(triggeredActions=");
        sb.append(list);
        sb.append(", triggersChecksum=");
        sb.append(fhVar);
        sb.append(", reuseByIdReferences=");
        return MediaSessionCompatQueueItem.read(sb, list2, ")");
    }

    public dh(List list, fh fhVar, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = fhVar;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, dhVar.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, dhVar.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, dhVar.c}, getCieXyz.write())).booleanValue();
    }
}

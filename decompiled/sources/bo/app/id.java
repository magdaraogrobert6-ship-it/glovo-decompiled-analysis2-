package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class id {
    public final l2 a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public id(l2 l2Var) {
        l2Var.getClass();
        this.a = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((id) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RequestDispatchCompletedEvent(request=" + this.a + ")";
    }
}

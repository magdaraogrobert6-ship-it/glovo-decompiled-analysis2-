package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class mg {
    public final r4 a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public mg(r4 r4Var) {
        r4Var.getClass();
        this.a = r4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((mg) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.a + ")";
    }
}

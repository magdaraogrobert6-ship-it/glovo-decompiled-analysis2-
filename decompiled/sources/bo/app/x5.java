package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class x5 {
    public final l9 a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public x5(l9 l9Var) {
        l9Var.getClass();
        this.a = l9Var;
        l9Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((x5) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "DispatchFailedEvent(request=" + this.a + ")";
    }
}

package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final k0 a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public j0(k0 k0Var) {
        k0Var.getClass();
        this.a = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((j0) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BannersRequestSuccessEvent(request=" + this.a + ")";
    }
}

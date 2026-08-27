package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class jd {
    public final l2 a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public jd(l2 l2Var) {
        l2Var.getClass();
        this.a = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((jd) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RequestDispatchStartedEvent(request=" + this.a + ")";
    }
}

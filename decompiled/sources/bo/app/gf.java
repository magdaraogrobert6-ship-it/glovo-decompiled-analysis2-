package bo.app;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class gf {
    public final hb a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public gf(hb hbVar) {
        hbVar.getClass();
        this.a = hbVar;
        if (hbVar.d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Session created events cannot be created with already sealed sessions.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((gf) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.a + ")";
    }
}

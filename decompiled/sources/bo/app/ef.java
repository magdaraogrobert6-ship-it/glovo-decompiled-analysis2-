package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class ef {
    public final ba a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ef(ba baVar) {
        baVar.getClass();
        this.a = baVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((ef) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.a + ")";
    }
}

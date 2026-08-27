package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class jf {
    public final ff a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public jf(ff ffVar) {
        ffVar.getClass();
        this.a = ffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((jf) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.a + ")";
    }
}

package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class qg {
    public final na a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public qg(na naVar) {
        naVar.getClass();
        this.a = naVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((qg) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.a + ")";
    }
}

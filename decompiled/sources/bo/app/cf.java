package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class cf {
    public final af a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public cf(af afVar) {
        afVar.getClass();
        this.a = afVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((cf) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.a + ")";
    }
}

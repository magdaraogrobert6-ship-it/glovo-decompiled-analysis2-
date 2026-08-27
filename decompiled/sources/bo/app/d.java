package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final c c = new c();
    public final String a;
    public final long b;

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("AcknowledgedBannerDismissal(bannerId=", this.a, this.b, ", dismissalTimeMs=");
        sbM.append(")");
        return sbM.toString();
    }

    public d(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, dVar.a}, getCieXyz.write())).booleanValue() && this.b == dVar.b;
    }
}

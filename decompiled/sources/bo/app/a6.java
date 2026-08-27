package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class a6 {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        return iM + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        Long l = this.d;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DustConfigReceivedEvent(mite=", str, ", host=", str2, ", auth=");
        sbM.append(str3);
        sbM.append(", expirationSeconds=");
        sbM.append(l);
        sbM.append(")");
        return sbM.toString();
    }

    public a6(String str, String str2, String str3, Long l) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, a6Var.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, a6Var.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, a6Var.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, a6Var.d}, getCieXyz.write())).booleanValue();
    }
}

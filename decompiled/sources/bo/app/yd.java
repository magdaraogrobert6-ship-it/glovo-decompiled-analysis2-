package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class yd implements ba {
    public final l9 a;
    public final int b;
    public final String c;
    public final String d;

    @Override // bo.app.ba
    public final String a() {
        return this.d;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        return ((iM + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.b;
        String str = this.c;
        return ff$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m("{code = ", i, ", reason = ", str, ", message = "), this.d, "}");
    }

    public yd(l9 l9Var, int i, String str, String str2) {
        l9Var.getClass();
        this.a = l9Var;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd)) {
            return false;
        }
        yd ydVar = (yd) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ydVar.a}, getCieXyz.write())).booleanValue() || this.b != ydVar.b) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, ydVar.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, ydVar.d}, getCieXyz.write())).booleanValue();
    }
}

package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class te implements ba {
    public final l9 a;
    public final int b;
    public final String c;

    @Override // bo.app.ba
    public final String a() {
        return null;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{code = " + this.b + ", reason = " + this.c + "}";
    }

    public te(l9 l9Var, int i, String str) {
        l9Var.getClass();
        this.a = l9Var;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, teVar.a}, getCieXyz.write())).booleanValue() || this.b != teVar.b) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, teVar.c}, getCieXyz.write())).booleanValue();
    }
}

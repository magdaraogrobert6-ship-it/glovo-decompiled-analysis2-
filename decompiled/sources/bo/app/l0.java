package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements ba {
    public final String a;
    public final l9 b;

    @Override // bo.app.ba
    public final String a() {
        return this.a;
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.a + ", originalRequest=" + this.b + ")";
    }

    public l0(String str, l9 l9Var) {
        l9Var.getClass();
        this.a = str;
        this.b = l9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, l0Var.a}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, l0Var.b}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

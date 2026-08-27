package bo.app;

import java.util.List;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class u5 {
    public static final s5 e = new s5();
    public final t5 a;
    public final List b;
    public final hf c;
    public final l9 d;

    public final int hashCode() {
        int iM = c8$$ExternalSyntheticOutline0.m(this.b, this.a.hashCode() * 31, 31);
        hf hfVar = this.c;
        int iHashCode = hfVar == null ? 0 : hfVar.a.hashCode();
        l9 l9Var = this.d;
        return ((iM + iHashCode) * 31) + (l9Var != null ? l9Var.hashCode() : 0);
    }

    public final String toString() {
        return "DispatchCommandEvent(commandType=" + this.a + ", brazeEvents=" + this.b + ", sessionId=" + this.c + ", brazeRequest=" + this.d + ")";
    }

    public u5(t5 t5Var, List list, hf hfVar, l2 l2Var, int i) {
        list = (i & 2) != 0 ? instance_delegatelambda0.write : list;
        hfVar = (i & 4) != 0 ? null : hfVar;
        l2Var = (i & 8) != 0 ? null : l2Var;
        t5Var.getClass();
        list.getClass();
        this.a = t5Var;
        this.b = list;
        this.c = hfVar;
        this.d = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        if (this.a != u5Var.a) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.b, u5Var.b}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, u5Var.c}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.d, u5Var.d}, getCieXyz.write())).booleanValue();
    }
}

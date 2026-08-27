package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class lb {
    public final kb a;
    public final kb b;

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.a + ", newNetworkLevel=" + this.b + ")";
    }

    public lb(kb kbVar, kb kbVar2) {
        kbVar.getClass();
        kbVar2.getClass();
        this.a = kbVar;
        this.b = kbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return this.a == lbVar.a && this.b == lbVar.b;
    }
}

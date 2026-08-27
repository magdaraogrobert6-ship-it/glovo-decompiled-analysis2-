package bo.app;

import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public final Class a;

    public final int hashCode() {
        return this.a.hashCode();
    }

    public f(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.a, ((f) obj).a}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return d$$ExternalSyntheticOutline0.m(this.a, "ActivitySessionWrapper(javaClass=", ")");
    }
}

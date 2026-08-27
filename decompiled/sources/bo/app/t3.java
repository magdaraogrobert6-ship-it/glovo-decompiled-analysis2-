package bo.app;

import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class t3 {
    public final int a;
    public final long b;
    public final Map c;

    public final int hashCode() {
        return this.c.hashCode() + d$$ExternalSyntheticOutline0.m(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ChecksumObjectFields(version=" + this.a + ", generatedAtUnixSeconds=" + this.b + ", messageIdentifierToChecksumMap=" + this.c + ")";
    }

    public t3(int i, long j, Map map) {
        map.getClass();
        this.a = i;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        if (this.a != t3Var.a || this.b != t3Var.b) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.c, t3Var.c}, getCieXyz.write())).booleanValue();
    }
}

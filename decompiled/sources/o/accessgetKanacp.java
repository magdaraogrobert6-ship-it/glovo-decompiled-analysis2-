package o;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetKanacp {
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final Set write;

    public accessgetKanacp(long j, long j2, Set set) {
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
        this.write = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetKanacp)) {
            return false;
        }
        accessgetKanacp accessgetkanacp = (accessgetKanacp) obj;
        return this.RemoteActionCompatParcelizer == accessgetkanacp.RemoteActionCompatParcelizer && this.IconCompatParcelizer == accessgetkanacp.IconCompatParcelizer && this.write.equals(accessgetkanacp.write);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.RemoteActionCompatParcelizer + ", maxAllowedDelay=" + this.IconCompatParcelizer + ", flags=" + this.write + "}";
    }

    public final int hashCode() {
        long j = this.RemoteActionCompatParcelizer;
        long j2 = this.IconCompatParcelizer;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.write.hashCode();
    }
}

package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetJcp {
    public final HashMap RemoteActionCompatParcelizer;
    public final accessgetMediaPlaycp serializer;

    public final int hashCode() {
        return ((this.serializer.hashCode() ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode();
    }

    public final long read(accessgetBrowsercp accessgetbrowsercp, long j, int i) {
        long jIconCompatParcelizer = this.serializer.IconCompatParcelizer();
        accessgetKanacp accessgetkanacp = (accessgetKanacp) this.RemoteActionCompatParcelizer.get(accessgetbrowsercp);
        long j2 = accessgetkanacp.RemoteActionCompatParcelizer;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), j - jIconCompatParcelizer), accessgetkanacp.IconCompatParcelizer);
    }

    public accessgetJcp(accessgetMediaPlaycp accessgetmediaplaycp, HashMap map) {
        this.serializer = accessgetmediaplaycp;
        this.RemoteActionCompatParcelizer = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetJcp)) {
            return false;
        }
        accessgetJcp accessgetjcp = (accessgetJcp) obj;
        return this.serializer.equals(accessgetjcp.serializer) && this.RemoteActionCompatParcelizer.equals(accessgetjcp.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.serializer + ", values=" + this.RemoteActionCompatParcelizer + "}";
    }
}

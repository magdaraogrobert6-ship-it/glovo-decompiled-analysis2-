package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class initBanner {
    private final long IconCompatParcelizer;
    private final long read;
    private final long write;

    public final long IconCompatParcelizer() {
        return this.write;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final long read() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Long.hashCode(this.write) + d$$ExternalSyntheticOutline0.m(Long.hashCode(this.IconCompatParcelizer) * 31, 31, this.read);
    }

    public initBanner(long j, long j2, long j3) {
        this.IconCompatParcelizer = j;
        this.read = j2;
        this.write = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof initBanner)) {
            return false;
        }
        initBanner initbanner = (initBanner) obj;
        return this.IconCompatParcelizer == initbanner.IconCompatParcelizer && this.read == initbanner.read && this.write == initbanner.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViolationData(previousWaypointTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currentWaypointTime=");
        sb.append(this.read);
        sb.append(", interpolatedTimestamp=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.write, ')');
    }
}

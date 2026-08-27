package o;

/* JADX INFO: loaded from: classes3.dex */
final class setExtras {
    private final long IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;

    public final long read() {
        return this.IconCompatParcelizer;
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return Long.hashCode(this.IconCompatParcelizer) + (Long.hashCode(this.RemoteActionCompatParcelizer) * 31);
    }

    public setExtras(long j, long j2) {
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setExtras)) {
            return false;
        }
        setExtras setextras = (setExtras) obj;
        return this.RemoteActionCompatParcelizer == setextras.RemoteActionCompatParcelizer && this.IconCompatParcelizer == setextras.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", end=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.IconCompatParcelizer, ')');
    }
}

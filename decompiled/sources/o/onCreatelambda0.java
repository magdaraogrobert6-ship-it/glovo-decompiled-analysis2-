package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class onCreatelambda0 {
    private final double IconCompatParcelizer;
    private final double RemoteActionCompatParcelizer;
    private final long read;
    private final double serializer;
    private final double write;

    public final long IconCompatParcelizer() {
        return this.read;
    }

    public final double RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final double read() {
        return this.serializer;
    }

    public final double serializer() {
        return this.IconCompatParcelizer;
    }

    public final double write() {
        return this.write;
    }

    public final int hashCode() {
        return Double.hashCode(this.serializer) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, Long.hashCode(this.read) * 31, 31), 31), 31);
    }

    public onCreatelambda0(long j, double d, double d2, double d3, double d4) {
        this.read = j;
        this.write = d;
        this.RemoteActionCompatParcelizer = d2;
        this.IconCompatParcelizer = d3;
        this.serializer = d4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onCreatelambda0)) {
            return false;
        }
        onCreatelambda0 oncreatelambda0 = (onCreatelambda0) obj;
        return this.read == oncreatelambda0.read && Double.compare(this.write, oncreatelambda0.write) == 0 && Double.compare(this.RemoteActionCompatParcelizer, oncreatelambda0.RemoteActionCompatParcelizer) == 0 && Double.compare(this.IconCompatParcelizer, oncreatelambda0.IconCompatParcelizer) == 0 && Double.compare(this.serializer, oncreatelambda0.serializer) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Quaternion(timestamp=");
        sb.append(this.read);
        sb.append(", w=");
        sb.append(this.write);
        sb.append(", x=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", y=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", z=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, ')');
    }
}

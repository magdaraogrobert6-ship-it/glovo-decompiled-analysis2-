package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class isOutMostLookaheadRoot {
    public final long IconCompatParcelizer;
    public final long serializer;
    public final long write;

    public isOutMostLookaheadRoot(long j, long j2, long j3) {
        this.write = j;
        this.serializer = j2;
        this.IconCompatParcelizer = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof isOutMostLookaheadRoot)) {
            return false;
        }
        isOutMostLookaheadRoot isoutmostlookaheadroot = (isOutMostLookaheadRoot) obj;
        return this.write == isoutmostlookaheadroot.write && this.serializer == isoutmostlookaheadroot.serializer && this.IconCompatParcelizer == isoutmostlookaheadroot.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.write);
        sb.append(", elapsedRealtime=");
        sb.append(this.serializer);
        sb.append(", uptimeMillis=");
        return c8$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "}", sb);
    }

    public final int hashCode() {
        long j = this.write;
        long j2 = this.serializer;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.IconCompatParcelizer;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }
}

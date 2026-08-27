package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollStateExternalSyntheticLambda3 {
    public final long RemoteActionCompatParcelizer;

    public static long write(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final int hashCode() {
        return Long.hashCode(this.RemoteActionCompatParcelizer);
    }

    public /* synthetic */ ScrollStateExternalSyntheticLambda3(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.RemoteActionCompatParcelizer;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return af$$ExternalSyntheticOutline0.m(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollStateExternalSyntheticLambda3) {
            return this.RemoteActionCompatParcelizer == ((ScrollStateExternalSyntheticLambda3) obj).RemoteActionCompatParcelizer;
        }
        return false;
    }
}

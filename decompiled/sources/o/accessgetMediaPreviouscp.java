package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMediaPreviouscp implements Comparable {
    public int RemoteActionCompatParcelizer;
    public int write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        accessgetMediaPreviouscp accessgetmediapreviouscp = (accessgetMediaPreviouscp) obj;
        int i = this.write;
        int i2 = accessgetmediapreviouscp.write;
        return i != i2 ? i - i2 : this.RemoteActionCompatParcelizer - accessgetmediapreviouscp.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.write);
        sb.append(", index=");
        return af$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, '}');
    }
}

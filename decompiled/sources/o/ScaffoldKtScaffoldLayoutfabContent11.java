package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class ScaffoldKtScaffoldLayoutfabContent11 {
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public ScaffoldKtScaffoldLayoutfabContent11(int i, int i2, int i3, int i4) {
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.serializer = i3;
        this.read = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaffoldKtScaffoldLayoutfabContent11)) {
            return false;
        }
        ScaffoldKtScaffoldLayoutfabContent11 scaffoldKtScaffoldLayoutfabContent11 = (ScaffoldKtScaffoldLayoutfabContent11) obj;
        return this.RemoteActionCompatParcelizer == scaffoldKtScaffoldLayoutfabContent11.RemoteActionCompatParcelizer && this.write == scaffoldKtScaffoldLayoutfabContent11.write && this.serializer == scaffoldKtScaffoldLayoutfabContent11.serializer && this.read == scaffoldKtScaffoldLayoutfabContent11.read;
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        return (((((i * 31) + i2) * 31) + this.serializer) * 31) + this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", top=");
        sb.append(this.write);
        sb.append(", right=");
        sb.append(this.serializer);
        sb.append(", bottom=");
        return af$$ExternalSyntheticOutline0.m(sb, this.read, ')');
    }
}

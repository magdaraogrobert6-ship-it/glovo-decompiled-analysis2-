package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class accessfoldInjd {
    public final long IconCompatParcelizer;
    public final androidx.compose.ui.text.style.ResolvedTextDirection read;
    public final int write;

    public final int hashCode() {
        return Long.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline0.m(this.write, this.read.hashCode() * 31, 31);
    }

    public accessfoldInjd(androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, int i, long j) {
        this.read = resolvedTextDirection;
        this.write = i;
        this.IconCompatParcelizer = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessfoldInjd)) {
            return false;
        }
        accessfoldInjd accessfoldinjd = (accessfoldInjd) obj;
        return this.read == accessfoldinjd.read && this.write == accessfoldinjd.write && this.IconCompatParcelizer == accessfoldinjd.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.read);
        sb.append(", offset=");
        sb.append(this.write);
        sb.append(", selectableId=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.IconCompatParcelizer, ')');
    }
}

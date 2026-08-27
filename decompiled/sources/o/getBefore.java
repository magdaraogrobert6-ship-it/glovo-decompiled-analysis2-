package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getBefore {
    public final boolean IconCompatParcelizer;
    public final boolean read;

    public getBefore(boolean z, boolean z2) {
        this.read = z;
        this.IconCompatParcelizer = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getBefore)) {
            return false;
        }
        getBefore getbefore = (getBefore) obj;
        return this.read == getbefore.read && this.IconCompatParcelizer == getbefore.IconCompatParcelizer;
    }

    public final int hashCode() {
        return ((this.read ? 1 : 0) * 31) + (this.IconCompatParcelizer ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnapshotMetadata{hasPendingWrites=");
        sb.append(this.read);
        sb.append(", isFromCache=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.IconCompatParcelizer, '}');
    }
}

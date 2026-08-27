package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetBackslashcp implements accessgetAvReceiverInputcp {
    public final boolean read;

    public final int hashCode() {
        return Boolean.hashCode(this.read);
    }

    public accessgetBackslashcp(boolean z) {
        this.read = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof accessgetBackslashcp) && this.read == ((accessgetBackslashcp) obj).read;
    }

    public final String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("Denied(shouldShowRationale="), this.read, ')');
    }
}

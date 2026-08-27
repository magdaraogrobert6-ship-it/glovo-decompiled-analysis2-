package o;

/* JADX INFO: loaded from: classes4.dex */
public final class setName {
    public final int IconCompatParcelizer;
    public final long read;

    public final int hashCode() {
        return Long.hashCode(this.read) + (Integer.hashCode(this.IconCompatParcelizer) * 31);
    }

    public setName(int i, long j) {
        this.IconCompatParcelizer = i;
        this.read = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setName)) {
            return false;
        }
        setName setname = (setName) obj;
        return this.IconCompatParcelizer == setname.IconCompatParcelizer && this.read == setname.read;
    }

    public final String toString() {
        return "OneShotKey(windowId=" + this.IconCompatParcelizer + ", frameStartNanos=" + this.read + ")";
    }
}

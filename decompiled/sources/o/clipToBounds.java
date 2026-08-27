package o;

/* JADX INFO: loaded from: classes.dex */
public final class clipToBounds {
    public final Object read;
    public final ClipKt serializer;

    public final int hashCode() {
        return this.serializer.hashCode() + (this.read.hashCode() * 31);
    }

    public clipToBounds(Object obj, ClipKt clipKt) {
        this.read = obj;
        this.serializer = clipKt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clipToBounds)) {
            return false;
        }
        clipToBounds cliptobounds = (clipToBounds) obj;
        return this.read.equals(cliptobounds.read) && this.serializer.equals(cliptobounds.serializer);
    }

    public final String toString() {
        return "BaselineAnchor(id=" + this.read + ", reference=" + this.serializer + ')';
    }
}

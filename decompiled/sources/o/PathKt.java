package o;

/* JADX INFO: loaded from: classes.dex */
public final class PathKt {
    public final boolean RemoteActionCompatParcelizer;
    public final accessrewindjd serializer;

    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final accessrewindjd write() {
        return this.serializer;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + (this.serializer.hashCode() * 31);
    }

    public PathKt(accessrewindjd accessrewindjdVar, boolean z) {
        this.serializer = accessrewindjdVar;
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathKt)) {
            return false;
        }
        PathKt pathKt = (PathKt) obj;
        return this.serializer.equals(pathKt.serializer) && this.RemoteActionCompatParcelizer == pathKt.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "DecodeResult(image=" + this.serializer + ", isSampled=" + this.RemoteActionCompatParcelizer + ")";
    }
}

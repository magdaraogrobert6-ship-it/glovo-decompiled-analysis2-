package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetLayerBlockp {
    public static final accessgetLayerBlockp serializer;
    public final copyqcb84PMdefault IconCompatParcelizer;
    public final copyqcb84PMdefault read;

    static {
        copyqcb84PM copyqcb84pm = copyqcb84PM.RemoteActionCompatParcelizer;
        serializer = new accessgetLayerBlockp(copyqcb84pm, copyqcb84pm);
    }

    public final int hashCode() {
        return this.read.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public accessgetLayerBlockp(copyqcb84PMdefault copyqcb84pmdefault, copyqcb84PMdefault copyqcb84pmdefault2) {
        this.IconCompatParcelizer = copyqcb84pmdefault;
        this.read = copyqcb84pmdefault2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetLayerBlockp)) {
            return false;
        }
        accessgetLayerBlockp accessgetlayerblockp = (accessgetLayerBlockp) obj;
        return this.IconCompatParcelizer.equals(accessgetlayerblockp.IconCompatParcelizer) && this.read.equals(accessgetlayerblockp.read);
    }

    public final String toString() {
        return "Size(width=" + this.IconCompatParcelizer + ", height=" + this.read + ")";
    }
}

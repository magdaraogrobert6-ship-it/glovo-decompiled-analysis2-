package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetKeyMapdelegatecp {
    public final Object IconCompatParcelizer;
    public final int write;

    public final int hashCode() {
        return (System.identityHashCode(this.IconCompatParcelizer) * 65535) + this.write;
    }

    public accessgetKeyMapdelegatecp(int i, accessgetDiskCacheLockp accessgetdiskcachelockp) {
        this.IconCompatParcelizer = accessgetdiskcachelockp;
        this.write = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof accessgetKeyMapdelegatecp)) {
            return false;
        }
        accessgetKeyMapdelegatecp accessgetkeymapdelegatecp = (accessgetKeyMapdelegatecp) obj;
        return this.IconCompatParcelizer == accessgetkeymapdelegatecp.IconCompatParcelizer && this.write == accessgetkeymapdelegatecp.write;
    }
}

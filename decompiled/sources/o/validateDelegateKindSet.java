package o;

/* JADX INFO: loaded from: classes2.dex */
public final class validateDelegateKindSet implements DelegatingNode {
    public static final getAlignmentLinesMap IconCompatParcelizer = new getAlignmentLinesMap(4);
    public Object RemoteActionCompatParcelizer;
    public volatile DelegatingNode read;

    @Override // o.DelegatingNode
    public final Object B_() {
        DelegatingNode delegatingNode = this.read;
        getAlignmentLinesMap getalignmentlinesmap = IconCompatParcelizer;
        if (delegatingNode != getalignmentlinesmap) {
            synchronized (this) {
                if (this.read != getalignmentlinesmap) {
                    Object objB_ = this.read.B_();
                    this.RemoteActionCompatParcelizer = objB_;
                    this.read = getalignmentlinesmap;
                    return objB_;
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        Object obj = this.read;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == IconCompatParcelizer) {
            obj = "<supplier that returned " + this.RemoteActionCompatParcelizer + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}

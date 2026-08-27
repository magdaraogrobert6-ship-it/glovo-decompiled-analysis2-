package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class updateNodeKindSet implements DelegatingNode, Serializable {
    public volatile transient boolean IconCompatParcelizer;
    public final getFocusEK5gGoQ read;
    public transient Object write;

    public updateNodeKindSet(getFocusEK5gGoQ getfocusek5ggoq) {
        this.read = getfocusek5ggoq;
    }

    @Override // o.DelegatingNode
    public final Object B_() {
        if (!this.IconCompatParcelizer) {
            synchronized (this) {
                if (!this.IconCompatParcelizer) {
                    Object objB_ = this.read.B_();
                    this.write = objB_;
                    this.IconCompatParcelizer = true;
                    return objB_;
                }
            }
        }
        return this.write;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.IconCompatParcelizer) {
            obj = "<supplier that returned " + this.write + ">";
        } else {
            obj = this.read;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}

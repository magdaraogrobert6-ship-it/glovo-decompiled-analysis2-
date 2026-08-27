package androidx.compose.ui;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    private final Modifier inner;
    private final Modifier outer;

    public final Modifier getInner$ui() {
        return this.inner;
    }

    public final Modifier getOuter$ui() {
        return this.outer;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return this.outer.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm) && this.inner.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return this.outer.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm) || this.inner.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return (R) this.inner.foldIn(this.outer.foldIn(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return (R) this.outer.foldOut(this.inner.foldOut(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.outer, combinedModifier.outer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.inner, combinedModifier.inner}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("["), (String) foldIn("", new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.CombinedModifier.toString.1
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final String invoke(String str, Modifier.Element element) {
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            }
        }), ']');
    }
}

package androidx.compose.ui.node;

import java.util.List;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = 8;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 onVectorMutated;
    private final onCreateVirtualViewTranslationRequests vector;

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final onCreateVirtualViewTranslationRequests getVector() {
        return this.vector;
    }

    public final void add(int i, T t) {
        this.vector.read(i, t);
        this.onVectorMutated.invoke();
    }

    public final void clear() {
        this.vector.RemoteActionCompatParcelizer();
        this.onVectorMutated.invoke();
    }

    public final T removeAt(int i) {
        T t = (T) this.vector.write(i);
        this.onVectorMutated.invoke();
        return t;
    }

    public MutableVectorWithMutationTracking(onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.vector = oncreatevirtualviewtranslationrequests;
        this.onVectorMutated = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final List<T> asList() {
        return getVector().read();
    }

    public final void forEach(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        onCreateVirtualViewTranslationRequests vector = getVector();
        Object[] objArr = vector.write;
        int i = vector.read;
        for (int i2 = 0; i2 < i; i2++) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[i2]);
        }
    }

    public final T get(int i) {
        return (T) getVector().write[i];
    }

    public final int getSize() {
        return getVector().read;
    }
}

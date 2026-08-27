package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class DepthSortedSetKtDepthComparator1 extends same {
    public final /* synthetic */ Object serializer;
    public boolean write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.write;
    }

    public DepthSortedSetKtDepthComparator1(Object obj) {
        this.serializer = obj;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.write = true;
        return this.serializer;
    }
}

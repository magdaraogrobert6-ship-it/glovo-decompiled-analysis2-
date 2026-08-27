package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getSidePaddingValue implements Iterator, displayInAppMessagelambda121 {
    public abstract int RemoteActionCompatParcelizer();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Integer.valueOf(RemoteActionCompatParcelizer());
    }
}

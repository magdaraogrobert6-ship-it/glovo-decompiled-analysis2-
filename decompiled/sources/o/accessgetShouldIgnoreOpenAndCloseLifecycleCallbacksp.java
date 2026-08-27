package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp implements Iterator, displayInAppMessagelambda121 {
    public Object[] RemoteActionCompatParcelizer = r8lambdazCa9f5hibLISCeY3u5lKyCauzY.read.IconCompatParcelizer;
    public int read;
    public int serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer < this.read;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

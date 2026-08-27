package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class getSourceEventType implements Iterator {
    public Iterator serializer;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.serializer.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.serializer.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

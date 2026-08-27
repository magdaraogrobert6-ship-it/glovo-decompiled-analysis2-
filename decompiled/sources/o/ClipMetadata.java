package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClipMetadata implements Iterator {
    public abstract byte serializer();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(serializer());
    }
}

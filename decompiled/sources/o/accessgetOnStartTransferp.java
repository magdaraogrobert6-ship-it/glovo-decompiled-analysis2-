package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetOnStartTransferp implements ListIterator, displayInAppMessagelambda121 {
    public int IconCompatParcelizer;
    public int serializer;

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.serializer > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.serializer;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.serializer - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.serializer < this.IconCompatParcelizer;
    }

    public accessgetOnStartTransferp(int i, int i2) {
        this.serializer = i;
        this.IconCompatParcelizer = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

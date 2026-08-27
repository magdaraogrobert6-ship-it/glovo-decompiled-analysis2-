package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class getTriggerAction implements ListIterator {
    public ListIterator write;

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.write.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.write.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.write.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.write.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.write.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.write.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}

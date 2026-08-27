package o;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class triggerRepaint implements ListIterator {
    public ListIterator RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.read;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i != 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? this.RemoteActionCompatParcelizer.hasNext() : this.RemoteActionCompatParcelizer.hasNext();
        }
        return this.RemoteActionCompatParcelizer.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? this.RemoteActionCompatParcelizer.hasPrevious() : this.RemoteActionCompatParcelizer.hasPrevious();
        }
        return this.RemoteActionCompatParcelizer.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? (String) this.RemoteActionCompatParcelizer.next() : (String) this.RemoteActionCompatParcelizer.next();
        }
        return (String) this.RemoteActionCompatParcelizer.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? this.RemoteActionCompatParcelizer.nextIndex() : this.RemoteActionCompatParcelizer.nextIndex();
        }
        return this.RemoteActionCompatParcelizer.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? (String) this.RemoteActionCompatParcelizer.previous() : (String) this.RemoteActionCompatParcelizer.previous();
        }
        return (String) this.RemoteActionCompatParcelizer.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.read;
        if (i != 0) {
            return i != 1 ? this.RemoteActionCompatParcelizer.previousIndex() : this.RemoteActionCompatParcelizer.previousIndex();
        }
        return this.RemoteActionCompatParcelizer.previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.read;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i != 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.read;
        if (i == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 1) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }
}

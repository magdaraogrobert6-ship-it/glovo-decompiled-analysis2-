package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPad3EK5gGoQ implements ListIterator, Iterator {
    public final getNumPad7EK5gGoQ IconCompatParcelizer;
    public final int serializer;
    public int write;

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.write > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.write;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.write - 1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.write < this.serializer;
    }

    public final Object read(int i) {
        return this.IconCompatParcelizer.get(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public getNumPad3EK5gGoQ(getNumPad7EK5gGoQ getnumpad7ek5ggoq, int i) {
        int size = getnumpad7ek5ggoq.size();
        if (i < 0 || i > size) {
            DrawableTransformation.read(getNumLockEK5gGoQ.serializer(i, size, "index"));
            throw null;
        }
        this.serializer = size;
        this.write = i;
        this.IconCompatParcelizer = getnumpad7ek5ggoq;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.write;
        this.write = i + 1;
        return read(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.write - 1;
        this.write = i;
        return read(i);
    }
}

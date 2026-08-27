package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.ListIterator;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes2.dex */
public final class toLookaheadCoordinates implements ListIterator, Iterator {
    public final BeyondBoundsLayout IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public int read;

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.read > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.read;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.read - 1;
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        return this.IconCompatParcelizer.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.read < this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public toLookaheadCoordinates(BeyondBoundsLayout beyondBoundsLayout, int i) {
        int size = beyondBoundsLayout.size();
        if (i < 0 || i > size) {
            DrawableTransformation.read(DelayKt.write(i, size, "index"));
            throw null;
        }
        this.RemoteActionCompatParcelizer = size;
        this.read = i;
        this.IconCompatParcelizer = beyondBoundsLayout;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.read;
        this.read = i + 1;
        return RemoteActionCompatParcelizer(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.read - 1;
        this.read = i;
        return RemoteActionCompatParcelizer(i);
    }
}

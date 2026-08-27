package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class HoverIconModifierNodefindDescendantNodeWithCursorInBounds1 implements ListIterator, Iterator {
    public final getMotionEvent RemoteActionCompatParcelizer;
    public int read;
    public final int serializer;

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

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.read < this.serializer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object write(int i) {
        return this.RemoteActionCompatParcelizer.get(i);
    }

    public HoverIconModifierNodefindDescendantNodeWithCursorInBounds1(getMotionEvent getmotionevent, int i) {
        int size = getmotionevent.size();
        if (i < 0 || i > size) {
            DrawableTransformation.read(TuplesKt.read(i, size, "index"));
            throw null;
        }
        this.serializer = size;
        this.read = i;
        this.RemoteActionCompatParcelizer = getmotionevent;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.read;
        this.read = i + 1;
        return write(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.read - 1;
        this.read = i;
        return write(i);
    }
}

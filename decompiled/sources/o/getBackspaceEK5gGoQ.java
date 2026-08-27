package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getBackspaceEK5gGoQ extends getBrowserEK5gGoQ implements ListIterator {
    public final int read;
    public final getButton10EK5gGoQ serializer;
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

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.write < this.read;
    }

    public final Object serializer(int i) {
        return this.serializer.get(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBackspaceEK5gGoQ(getButton10EK5gGoQ getbutton10ek5ggoq, int i) {
        super(0);
        int size = getbutton10ek5ggoq.size();
        if (i < 0 || i > size) {
            DrawableTransformation.read(coil3.ExtrasKt.read(i, size, "index"));
            throw null;
        }
        this.read = size;
        this.write = i;
        this.serializer = getbutton10ek5ggoq;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.write;
        this.write = i + 1;
        return serializer(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.write - 1;
        this.write = i;
        return serializer(i);
    }
}

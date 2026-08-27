package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getInsertEK5gGoQ extends getMannerModeEK5gGoQ implements ListIterator {
    public int RemoteActionCompatParcelizer;
    public final int read;
    public final getLeftBracketEK5gGoQ serializer;

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.RemoteActionCompatParcelizer > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.RemoteActionCompatParcelizer - 1;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.RemoteActionCompatParcelizer < this.read;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object write(int i) {
        return this.serializer.get(i);
    }

    public getInsertEK5gGoQ(getLeftBracketEK5gGoQ getleftbracketek5ggoq, int i) {
        int size = getleftbracketek5ggoq.size();
        if (i < 0 || i > size) {
            DrawableTransformation.read(getKEK5gGoQ.read(i, size, "index"));
            throw null;
        }
        this.read = size;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = getleftbracketek5ggoq;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        return write(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.RemoteActionCompatParcelizer - 1;
        this.RemoteActionCompatParcelizer = i;
        return write(i);
    }
}

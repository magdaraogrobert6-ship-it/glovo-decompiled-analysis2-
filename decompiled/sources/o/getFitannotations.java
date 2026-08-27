package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getFitannotations extends getBrowserEK5gGoQ implements ListIterator {
    public final getCrop read;
    public int serializer;
    public final int write;

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

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.serializer < this.write;
    }

    public final Object read(int i) {
        return this.read.get(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFitannotations(getCrop getcrop, int i) {
        super(1);
        int size = getcrop.size();
        if (i >= 0 && i <= size) {
            this.write = size;
            this.serializer = i;
            this.read = getcrop;
        } else {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(size), "index"};
            DrawableTransformation.read((String) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -148287875, 148287875, trackEventI.IconCompatParcelizer(), objArr));
            throw null;
        }
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer;
        this.serializer = i + 1;
        return read(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.serializer - 1;
        this.serializer = i;
        return read(i);
    }
}

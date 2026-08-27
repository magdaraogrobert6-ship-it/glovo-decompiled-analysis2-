package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ListIterator;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class DepthSortedSet extends same implements ListIterator {
    public int IconCompatParcelizer;
    public final int read;
    public final delegateUnprotectedui serializer;

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.IconCompatParcelizer > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.IconCompatParcelizer;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.IconCompatParcelizer - 1;
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        return this.serializer.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.IconCompatParcelizer < this.read;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public DepthSortedSet(delegateUnprotectedui delegateunprotectedui, int i) {
        int size = delegateunprotectedui.size();
        TextStreamsKt.serializer(i, size);
        this.read = size;
        this.IconCompatParcelizer = i;
        this.serializer = delegateunprotectedui;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i + 1;
        return RemoteActionCompatParcelizer(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.IconCompatParcelizer - 1;
        this.IconCompatParcelizer = i;
        return RemoteActionCompatParcelizer(i);
    }
}

package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setDownChange implements ListIterator, Iterator {
    public final int RemoteActionCompatParcelizer;
    public final getOriginalEventPositionF1C5BW0ui serializer;
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

    public final Object IconCompatParcelizer(int i) {
        return this.serializer.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.write < this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public setDownChange(getOriginalEventPositionF1C5BW0ui getoriginaleventpositionf1c5bw0ui, int i) {
        int size = getoriginaleventpositionf1c5bw0ui.size();
        RangesKt.IconCompatParcelizer(i, size);
        this.RemoteActionCompatParcelizer = size;
        this.write = i;
        this.serializer = getoriginaleventpositionf1c5bw0ui;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.write;
        this.write = i + 1;
        return IconCompatParcelizer(i);
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i = this.write - 1;
        this.write = i;
        return IconCompatParcelizer(i);
    }
}

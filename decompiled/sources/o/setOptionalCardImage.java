package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class setOptionalCardImage implements ListIterator, displayInAppMessagelambda121 {
    public final BaseContentCardViewExternalSyntheticLambda0 IconCompatParcelizer;
    public int read;
    public int serializer;
    public int write = -1;

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

    public final void IconCompatParcelizer() {
        if (((AbstractList) this.IconCompatParcelizer).modCount == this.read) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.serializer < this.IconCompatParcelizer.write;
    }

    public setOptionalCardImage(BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0, int i) {
        this.IconCompatParcelizer = baseContentCardViewExternalSyntheticLambda0;
        this.serializer = i;
        this.read = ((AbstractList) baseContentCardViewExternalSyntheticLambda0).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        IconCompatParcelizer();
        int i = this.serializer;
        this.serializer = i + 1;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = this.IconCompatParcelizer;
        baseContentCardViewExternalSyntheticLambda0.add(i, obj);
        this.write = -1;
        this.read = ((AbstractList) baseContentCardViewExternalSyntheticLambda0).modCount;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        IconCompatParcelizer();
        int i = this.serializer;
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = this.IconCompatParcelizer;
        if (i >= baseContentCardViewExternalSyntheticLambda0.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        this.serializer = i + 1;
        this.write = i;
        return baseContentCardViewExternalSyntheticLambda0.RemoteActionCompatParcelizer[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        IconCompatParcelizer();
        int i = this.serializer;
        if (i <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        int i2 = i - 1;
        this.serializer = i2;
        this.write = i2;
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer[i2];
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        IconCompatParcelizer();
        int i = this.write;
        if (i == -1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Call next() or previous() before removing element from the iterator.");
            return;
        }
        BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = this.IconCompatParcelizer;
        baseContentCardViewExternalSyntheticLambda0.IconCompatParcelizer(i);
        this.serializer = this.write;
        this.write = -1;
        this.read = ((AbstractList) baseContentCardViewExternalSyntheticLambda0).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        IconCompatParcelizer();
        int i = this.write;
        if (i != -1) {
            this.IconCompatParcelizer.set(i, obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Call next() or previous() before replacing element from the iterator.");
        }
    }
}

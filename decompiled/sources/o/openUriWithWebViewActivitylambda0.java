package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class openUriWithWebViewActivitylambda0 extends AbstractCollection implements Queue, Serializable {
    public final int IconCompatParcelizer;
    public final transient Object[] RemoteActionCompatParcelizer;
    public transient int read = 0;
    public transient int write = 0;
    public transient boolean serializer = false;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.serializer = false;
        this.read = 0;
        this.write = 0;
        Arrays.fill(this.RemoteActionCompatParcelizer, (Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Attempted to add null object to queue");
            return false;
        }
        int size = size();
        int i = this.IconCompatParcelizer;
        if (size == i) {
            remove();
        }
        int i2 = this.write;
        int i3 = i2 + 1;
        this.write = i3;
        this.RemoteActionCompatParcelizer[i2] = obj;
        if (i3 >= i) {
            this.write = 0;
        }
        if (this.write == this.read) {
            this.serializer = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new openUriWithActionViewlambda0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.write;
        int i2 = this.read;
        int i3 = this.IconCompatParcelizer;
        if (i < i2) {
            return (i3 - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.serializer) {
            return i3;
        }
        return 0;
    }

    public openUriWithWebViewActivitylambda0(int i) {
        if (i <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The size must be greater than 0");
            throw null;
        }
        this.RemoteActionCompatParcelizer = new Object[i];
        this.IconCompatParcelizer = i;
    }

    @Override // java.util.Queue
    public final Object element() {
        if (!isEmpty()) {
            return peek();
        }
        DrawableTransformation.write("queue is empty");
        return null;
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            DrawableTransformation.write("queue is empty");
            return null;
        }
        int i = this.read;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.read = i2;
            objArr[i] = null;
            if (i2 >= this.IconCompatParcelizer) {
                this.read = 0;
            }
            this.serializer = false;
        }
        return obj;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.RemoteActionCompatParcelizer[this.read];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }
}

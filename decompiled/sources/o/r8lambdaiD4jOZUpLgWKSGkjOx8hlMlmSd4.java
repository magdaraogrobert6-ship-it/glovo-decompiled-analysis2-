package o;

import android.annotation.SuppressLint;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4<T> implements List<T> {
    final ArrayList<Object> IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private final r8lambdaiWaPmNaKCzmLBGPJrGa_X6apSc read;
    private final int serializer;
    private int write;

    public abstract Object IconCompatParcelizer(int i);

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.RemoteActionCompatParcelizer = 0;
        this.write = 0;
    }

    public abstract T read(Object obj, int i);

    public abstract Class serializer();

    public abstract void write(Object obj, int i, Object obj2);

    public static void write(r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4) {
        int i = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.write;
        ArrayList<Object> arrayList = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.IconCompatParcelizer;
        int i2 = i + 1;
        r8lambdaid4jozuplgwksgkjox8hlmlmsd4.write = i2;
        int i3 = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.serializer;
        if (i2 == i3) {
            r8lambdaid4jozuplgwksgkjox8hlmlmsd4.write = 0;
            int i4 = r8lambdaid4jozuplgwksgkjox8hlmlmsd4.RemoteActionCompatParcelizer + 1;
            r8lambdaid4jozuplgwksgkjox8hlmlmsd4.RemoteActionCompatParcelizer = i4;
            if (i4 == arrayList.size()) {
                arrayList.add(r8lambdaid4jozuplgwksgkjox8hlmlmsd4.IconCompatParcelizer(i3));
            }
        }
    }

    public final int RemoteActionCompatParcelizer(int i) {
        return i / this.serializer;
    }

    @Override // java.util.List, java.util.Collection
    @Deprecated
    public final boolean add(T t) {
        this.read.write(t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    @SuppressLint
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @SuppressLint
    public final T get(int i) {
        int i2 = this.serializer;
        int i3 = i / i2;
        int i4 = i % i2;
        int i5 = this.RemoteActionCompatParcelizer;
        if (i3 <= i5 && (i3 != i5 || i4 < this.write)) {
            return read(this.IconCompatParcelizer.get(i3), i4);
        }
        java.util.Locale locale = java.util.Locale.ENGLISH;
        DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Index ", size(), " is out of bounds. List size is "));
        return null;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new r8lambdahFeluNgtWth8e3SjRbHm2B4sJ4(this);
    }

    @Override // java.util.List
    @SuppressLint
    public final int lastIndexOf(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @SuppressLint
    public final ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    @SuppressLint
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    @SuppressLint
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    @SuppressLint
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @SuppressLint
    public final T set(int i, T t) {
        int i2 = this.serializer;
        int i3 = i / i2;
        int i4 = i % i2;
        int i5 = this.RemoteActionCompatParcelizer;
        if (i3 > i5 || (i3 == i5 && i4 >= this.write)) {
            java.util.Locale locale = java.util.Locale.ENGLISH;
            DrawableTransformation.read(af$$ExternalSyntheticOutline0.m(i, "Index ", size(), " is out of bounds. List size is "));
            return null;
        }
        ArrayList<Object> arrayList = this.IconCompatParcelizer;
        T t2 = read(arrayList.get(i3), i4);
        write(arrayList.get(i3), i4, t);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return (this.RemoteActionCompatParcelizer * this.serializer) + this.write;
    }

    @Override // java.util.List
    @SuppressLint
    public final List<T> subList(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public final int serializer(int i) {
        return i % this.serializer;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer + 1;
        if (isEmpty()) {
            i = 0;
        }
        ArrayList<Object> arrayList = this.IconCompatParcelizer;
        if (arrayList.size() > i) {
            arrayList.subList(i, arrayList.size()).clear();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj.getClass() == serializer()) {
            for (int i = 0; i <= this.RemoteActionCompatParcelizer; i++) {
                for (int i2 = 0; i2 < this.serializer && (i != this.RemoteActionCompatParcelizer || i2 < this.write); i2++) {
                    if (read(this.IconCompatParcelizer.get(i), i2) == obj) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj.getClass() != serializer()) {
            return -1;
        }
        for (int i = 0; i <= this.RemoteActionCompatParcelizer; i++) {
            int i2 = 0;
            while (true) {
                int i3 = this.serializer;
                if (i2 < i3 && (i != this.RemoteActionCompatParcelizer || i2 < this.write)) {
                    if (read(this.IconCompatParcelizer.get(i), i2) == obj) {
                        return (i * i3) + i2;
                    }
                    i2++;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.RemoteActionCompatParcelizer == 0 && this.write == 0;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i = 0;
        for (int i2 = 0; i2 <= this.RemoteActionCompatParcelizer; i2++) {
            int i3 = 0;
            while (i3 < this.serializer && (i2 != this.RemoteActionCompatParcelizer || i3 < this.write)) {
                objArr[i] = read(this.IconCompatParcelizer.get(i2), i3);
                i3++;
                i++;
            }
        }
        return objArr;
    }

    public r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4(int i) {
        this.IconCompatParcelizer = new ArrayList<>();
        this.read = new r8lambdaiWaPmNaKCzmLBGPJrGa_X6apSc(this);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = 0;
        this.write = 0;
    }

    @Override // java.util.List
    @SuppressLint
    public final ListIterator<T> listIterator(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @SuppressLint
    public final T remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @SuppressLint
    public final void add(int i, T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @SuppressLint
    public final boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4(List<T> list) {
        this(list, androidx.compose.ui.graphics.Fields.TransformOrigin);
    }

    public r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4(List<T> list, int i) {
        this(i);
        addAll(list);
    }

    public r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4() {
        this(androidx.compose.ui.graphics.Fields.TransformOrigin);
    }

    public static void read(r8lambdaiD4jOZUpLgWKSGkjOx8hlMlmSd4 r8lambdaid4jozuplgwksgkjox8hlmlmsd4) {
        r8lambdaid4jozuplgwksgkjox8hlmlmsd4.IconCompatParcelizer.add(r8lambdaid4jozuplgwksgkjox8hlmlmsd4.IconCompatParcelizer(r8lambdaid4jozuplgwksgkjox8hlmlmsd4.serializer));
    }

    @Override // java.util.List, java.util.Collection
    @SuppressLint
    public final <T> T[] toArray(T[] tArr) {
        throw new UnsupportedOperationException();
    }
}

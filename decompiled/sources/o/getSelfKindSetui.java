package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getSelfKindSetui extends AbstractCollection implements Serializable {
    public static final Object[] IconCompatParcelizer = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public abstract delegateUnprotectedui read();

    public abstract boolean serializer();

    public abstract int write(int i, Object[] objArr);

    public Object[] write() {
        return null;
    }

    public int IconCompatParcelizer() {
        throw new UnsupportedOperationException();
    }

    public int RemoteActionCompatParcelizer() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrWrite = write();
            if (objArrWrite != null) {
                return isNotEmpty.IconCompatParcelizer(IconCompatParcelizer(), RemoteActionCompatParcelizer(), objArrWrite, objArr);
            }
            objArr = isNotEmpty.write(size, objArr);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        write(0, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(IconCompatParcelizer);
    }
}

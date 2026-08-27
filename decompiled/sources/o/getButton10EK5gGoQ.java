package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getButton10EK5gGoQ extends getBreakEK5gGoQ implements List, RandomAccess {
    public static final getBackspaceEK5gGoQ MediaDescriptionCompat = new getBackspaceEK5gGoQ(getButton12EK5gGoQ.IconCompatParcelizer, 0);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                getBackspaceEK5gGoQ getbackspaceek5ggoqListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (getbackspaceek5ggoqListIterator.hasNext()) {
                    if (it.hasNext() && Objects.equals(getbackspaceek5ggoqListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getButton10EK5gGoQ subList(int i, int i2) {
        coil3.ExtrasKt.read(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? getButton12EK5gGoQ.IconCompatParcelizer : new getBrightnessUpEK5gGoQ(this, i, i3);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // o.getBreakEK5gGoQ
    public int RemoteActionCompatParcelizer(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: serializer, reason: merged with bridge method [inline-methods] */
    public final getBackspaceEK5gGoQ listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? MediaDescriptionCompat : new getBackspaceEK5gGoQ(this, i);
        }
        DrawableTransformation.read(coil3.ExtrasKt.read(i, size, "index"));
        return null;
    }

    public getButton10EK5gGoQ RemoteActionCompatParcelizer() {
        return size() <= 1 ? this : new getBookmarkEK5gGoQ(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }
}

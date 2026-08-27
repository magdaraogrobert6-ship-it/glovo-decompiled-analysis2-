package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getLeftBracketEK5gGoQ extends getKanaEK5gGoQ implements List, RandomAccess {
    public static final getInsertEK5gGoQ write = new getInsertEK5gGoQ(getLanguageSwitchEK5gGoQ.IconCompatParcelizer, 0);

    @Override // o.getKanaEK5gGoQ, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
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

    public static getLanguageSwitchEK5gGoQ RemoteActionCompatParcelizer(int i, Object[] objArr) {
        return i == 0 ? getLanguageSwitchEK5gGoQ.IconCompatParcelizer : new getLanguageSwitchEK5gGoQ(i, objArr);
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
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj2 = get(i);
                        Object obj3 = list.get(i);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                getInsertEK5gGoQ getinsertek5ggoqListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (getinsertek5ggoqListIterator.hasNext()) {
                    if (it.hasNext() && ((next = getinsertek5ggoqListIterator.next()) == (next2 = it.next()) || (next != null && next.equals(next2)))) {
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
    public final int indexOf(Object obj) {
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

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    @Override // java.util.List
    /* JADX INFO: renamed from: read */
    public getLeftBracketEK5gGoQ subList(int i, int i2) {
        getKEK5gGoQ.serializer(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? getLanguageSwitchEK5gGoQ.IconCompatParcelizer : new getLEK5gGoQ(this, i, i3);
    }

    @Override // o.getKanaEK5gGoQ
    public int read(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final getInsertEK5gGoQ listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? write : new getInsertEK5gGoQ(this, i);
        }
        DrawableTransformation.read(getKEK5gGoQ.read(i, size, "index"));
        return null;
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

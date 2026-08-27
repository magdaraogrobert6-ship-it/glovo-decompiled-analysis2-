package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getNumPad7EK5gGoQ extends getNumPad4EK5gGoQ implements List, RandomAccess {
    public static final getNumPad3EK5gGoQ RemoteActionCompatParcelizer = new getNumPad3EK5gGoQ(getNumPad5EK5gGoQ.serializer, 0);

    public static getNumPad5EK5gGoQ RemoteActionCompatParcelizer() {
        return getNumPad5EK5gGoQ.serializer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
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
                getNumPad3EK5gGoQ getnumpad3ek5ggoqListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (getnumpad3ek5ggoqListIterator.hasNext()) {
                    if (it.hasNext() && ((next = getnumpad3ek5ggoqListIterator.next()) == (next2 = it.next()) || (next != null && next.equals(next2)))) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static getNumPad7EK5gGoQ serializer(List list) {
        if (list instanceof getNumPad4EK5gGoQ) {
            getNumPad7EK5gGoQ getnumpad7ek5ggoq = (getNumPad7EK5gGoQ) ((getNumPad4EK5gGoQ) list);
            if (!getnumpad7ek5ggoq.IconCompatParcelizer()) {
                return getnumpad7ek5ggoq;
            }
            Object[] array = getnumpad7ek5ggoq.toArray(getNumPad4EK5gGoQ.IconCompatParcelizer);
            int length = array.length;
            return length == 0 ? getNumPad5EK5gGoQ.serializer : new getNumPad5EK5gGoQ(length, array);
        }
        Object[] array2 = list.toArray();
        int length2 = array2.length;
        for (int i = 0; i < length2; i++) {
            if (array2[i] == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(d$$ExternalSyntheticOutline0.m(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
                return null;
            }
        }
        return length2 == 0 ? getNumPad5EK5gGoQ.serializer : new getNumPad5EK5gGoQ(length2, array2);
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
    /* JADX INFO: renamed from: serializer */
    public getNumPad7EK5gGoQ subList(int i, int i2) {
        getNumLockEK5gGoQ.write(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? getNumPad5EK5gGoQ.serializer : new getNumPad6EK5gGoQ(this, i, i3);
    }

    @Override // o.getNumPad4EK5gGoQ
    public int read(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getNumPad3EK5gGoQ listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? RemoteActionCompatParcelizer : new getNumPad3EK5gGoQ(this, i);
        }
        DrawableTransformation.read(getNumLockEK5gGoQ.serializer(i, size, "index"));
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

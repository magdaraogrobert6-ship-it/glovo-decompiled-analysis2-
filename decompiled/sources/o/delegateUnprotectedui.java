package o;

import bo.app.w$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class delegateUnprotectedui extends getSelfKindSetui implements List, RandomAccess {
    public static final DepthSortedSet write = new DepthSortedSet(accessgetApproachSetp.read, 0);

    @Override // o.getSelfKindSetui, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // o.getSelfKindSetui
    public final delegateUnprotectedui read() {
        return this;
    }

    public static accessgetApproachSetp IconCompatParcelizer(int i, Object[] objArr) {
        return i == 0 ? accessgetApproachSetp.read : new accessgetApproachSetp(i, objArr);
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
                if (!(list instanceof RandomAccess)) {
                    return popEach.write(iterator(), list.iterator());
                }
                for (int i = 0; i < size; i++) {
                    if (TuplesKt.RemoteActionCompatParcelizer(get(i), list.get(i))) {
                    }
                }
                return true;
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
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final DepthSortedSet listIterator(int i) {
        TextStreamsKt.serializer(i, size());
        return isEmpty() ? write : new DepthSortedSet(this, i);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: read */
    public delegateUnprotectedui subList(int i, int i2) {
        TextStreamsKt.read(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(size())}, w$$ExternalSyntheticLambda0.write(), w$$ExternalSyntheticLambda0.write(), 298335113, w$$ExternalSyntheticLambda0.write(), -298335113, w$$ExternalSyntheticLambda0.write());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? accessgetApproachSetp.read : new undelegate(this, i, i3);
    }

    @Override // o.getSelfKindSetui
    public int write(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}

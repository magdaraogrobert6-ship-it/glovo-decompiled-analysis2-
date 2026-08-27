package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaY3Sk3_bCKw7cHfi7g4HzfmtF88Q implements Collection, displayInAppMessagelambda121 {
    public final Object[] RemoteActionCompatParcelizer;
    public final boolean serializer;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return onContentCardClicked.IconCompatParcelizer(this.RemoteActionCompatParcelizer, obj);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.RemoteActionCompatParcelizer.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return coil3.util.ContextsKt.write(this.RemoteActionCompatParcelizer);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.RemoteActionCompatParcelizer.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.RemoteActionCompatParcelizer;
        objArr.getClass();
        if (this.serializer && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public r8lambdaY3Sk3_bCKw7cHfi7g4HzfmtF88Q(Object[] objArr, boolean z) {
        objArr.getClass();
        this.RemoteActionCompatParcelizer = objArr;
        this.serializer = z;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!onContentCardClicked.IconCompatParcelizer(this.RemoteActionCompatParcelizer, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }
}

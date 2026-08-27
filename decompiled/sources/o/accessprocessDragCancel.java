package o;

import androidx.collection.Keys$iterator$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessprocessDragCancel implements Collection, displayInAppMessagelambda121 {
    public final DefaultScrollableState serializer;

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.serializer.RemoteActionCompatParcelizer(obj);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.serializer.read();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.serializer.serializer;
    }

    public accessprocessDragCancel(DefaultScrollableState defaultScrollableState) {
        defaultScrollableState.getClass();
        this.serializer = defaultScrollableState;
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
            if (!this.serializer.RemoteActionCompatParcelizer(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
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

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return LazyKt__LazyJVMKt.read(new Keys$iterator$1(this, null, 3));
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }
}

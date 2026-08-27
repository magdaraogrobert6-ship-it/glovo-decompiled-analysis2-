package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class EmptyContentCardsAdapter implements Collection, displayInAppMessagelambda121 {
    public final long[] write;

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.write);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.write.length == 0;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.write.length;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        loop0: for (Object obj : collection2) {
            if (obj instanceof describeContents) {
                long j = ((describeContents) obj).write;
                long[] jArr = this.write;
                int length = jArr.length;
                for (int i = 0; i < length; i++) {
                    if (j == jArr[i]) {
                        if (i < 0) {
                            break loop0;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new EmptyContentCardsAdapterNetworkUnavailableViewHolder(4, this.write);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
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

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.write) + ')';
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof EmptyContentCardsAdapter) {
            return this.write.equals(((EmptyContentCardsAdapter) obj).write);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof describeContents)) {
            return false;
        }
        long j = ((describeContents) obj).write;
        long[] jArr = this.write;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                if (i >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }
}

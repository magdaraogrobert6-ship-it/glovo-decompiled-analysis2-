package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultContentCardsUpdateHandlerCompanion implements Collection, displayInAppMessagelambda121 {
    public final short[] RemoteActionCompatParcelizer;

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.RemoteActionCompatParcelizer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.RemoteActionCompatParcelizer.length == 0;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.RemoteActionCompatParcelizer.length;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        loop0: for (Object obj : collection2) {
            if (obj instanceof DefaultContentCardsUpdateHandler) {
                short s = ((DefaultContentCardsUpdateHandler) obj).RemoteActionCompatParcelizer;
                short[] sArr = this.RemoteActionCompatParcelizer;
                int length = sArr.length;
                for (int i = 0; i < length; i++) {
                    if (s == sArr[i]) {
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
        return new EmptyContentCardsAdapterNetworkUnavailableViewHolder(5, this.RemoteActionCompatParcelizer);
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
        return "UShortArray(storage=" + Arrays.toString(this.RemoteActionCompatParcelizer) + ')';
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof DefaultContentCardsUpdateHandlerCompanion) {
            return this.RemoteActionCompatParcelizer.equals(((DefaultContentCardsUpdateHandlerCompanion) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof DefaultContentCardsUpdateHandler)) {
            return false;
        }
        short s = ((DefaultContentCardsUpdateHandler) obj).RemoteActionCompatParcelizer;
        short[] sArr = this.RemoteActionCompatParcelizer;
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
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

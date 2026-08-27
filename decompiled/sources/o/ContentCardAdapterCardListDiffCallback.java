package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class ContentCardAdapterCardListDiffCallback implements Collection, displayInAppMessagelambda121 {
    public final byte[] serializer;

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.serializer);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.serializer.length == 0;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.serializer.length;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof setImpressedCardIds)) {
                return false;
            }
            if (!onContentCardClicked.read(this.serializer, ((setImpressedCardIds) obj).serializer)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new EmptyContentCardsAdapterNetworkUnavailableViewHolder(3, this.serializer);
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
        return "UByteArray(storage=" + Arrays.toString(this.serializer) + ')';
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof ContentCardAdapterCardListDiffCallback) {
            return this.serializer.equals(((ContentCardAdapterCardListDiffCallback) obj).serializer);
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof setImpressedCardIds)) {
            return false;
        }
        return onContentCardClicked.read(this.serializer, ((setImpressedCardIds) obj).serializer);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }
}

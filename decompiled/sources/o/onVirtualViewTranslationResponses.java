package o;

import androidx.collection.Keys$iterator$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public final class onVirtualViewTranslationResponses implements Set, displayInAppMessagelambda121 {
    public final awaitTouchSlopOrCancellationjO51t88 IconCompatParcelizer;

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.IconCompatParcelizer.MediaBrowserCompatMediaItem(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.write();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.IconCompatParcelizer.write;
    }

    public onVirtualViewTranslationResponses(awaitTouchSlopOrCancellationjO51t88 awaittouchsloporcancellationjo51t88) {
        this.IconCompatParcelizer = awaittouchsloporcancellationjo51t88;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return LazyKt__LazyJVMKt.read(new Keys$iterator$1(this, null, 4));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }
}

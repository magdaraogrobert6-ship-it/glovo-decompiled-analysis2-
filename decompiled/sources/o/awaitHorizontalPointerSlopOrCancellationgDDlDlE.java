package o;

import androidx.collection.Keys$iterator$1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes.dex */
public class awaitHorizontalPointerSlopOrCancellationgDDlDlE implements Set, displayInAppMessagelambda121 {
    public final relocationOffsetfbGrOKE IconCompatParcelizer;

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.MediaBrowserCompatMediaItem(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.write();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.IconCompatParcelizer.write;
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }

    public awaitHorizontalPointerSlopOrCancellationgDDlDlE(relocationOffsetfbGrOKE relocationoffsetfbgroke) {
        this.IconCompatParcelizer = relocationoffsetfbgroke;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.IconCompatParcelizer.MediaBrowserCompatMediaItem(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return LazyKt__LazyJVMKt.read(new Keys$iterator$1(this, null, 2));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.IconCompatParcelizer.equals(((awaitHorizontalPointerSlopOrCancellationgDDlDlE) obj).IconCompatParcelizer);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }
}

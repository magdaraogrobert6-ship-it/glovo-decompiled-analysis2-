package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getDelegateui extends delegate implements Queue, Collection {
    @Override // java.util.Collection
    public final void clear() {
        ((forEachImmediateDelegateui) this).read.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return ((forEachImmediateDelegateui) this).read.contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return ((forEachImmediateDelegateui) this).read.containsAll(collection);
    }

    @Override // java.util.Queue
    public final Object element() {
        return ((forEachImmediateDelegateui) this).read.element();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return ((forEachImmediateDelegateui) this).read.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return ((forEachImmediateDelegateui) this).read.iterator();
    }

    @Override // java.util.Queue
    public final Object peek() {
        return ((forEachImmediateDelegateui) this).read.peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return ((forEachImmediateDelegateui) this).read.poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return ((forEachImmediateDelegateui) this).read.remove();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return ((forEachImmediateDelegateui) this).read.removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return ((forEachImmediateDelegateui) this).read.retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return ((forEachImmediateDelegateui) this).read.size();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return ((forEachImmediateDelegateui) this).read.toArray();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return ((forEachImmediateDelegateui) this).read.remove(obj);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return ((forEachImmediateDelegateui) this).read.toArray(objArr);
    }
}

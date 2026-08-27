package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes4.dex */
public final class setSdkDebuggerCallbackandroid_sdk_base_release implements List, displayInAppMessagelambda121 {
    public final List serializer;

    @Override // java.util.List
    public final Object get(int i) {
        return (BundleUtils) this.serializer.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.serializer.hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.serializer.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.serializer.iterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.serializer.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.serializer.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.serializer.subList(i, i2);
    }

    public setSdkDebuggerCallbackandroid_sdk_base_release(List list) {
        this.serializer = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.serializer.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setSdkDebuggerCallbackandroid_sdk_base_release) && this.serializer.equals(((setSdkDebuggerCallbackandroid_sdk_base_release) obj).serializer);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return MediaSessionCompatQueueItem.read("WeekListViewEntity(weeks=", ")", this.serializer);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof BundleUtils)) {
            return false;
        }
        return this.serializer.contains((BundleUtils) obj);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof BundleUtils)) {
            return -1;
        }
        return this.serializer.indexOf((BundleUtils) obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof BundleUtils)) {
            return -1;
        }
        return this.serializer.lastIndexOf((BundleUtils) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.serializer.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this);
    }
}

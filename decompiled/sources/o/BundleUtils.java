package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes4.dex */
public final class BundleUtils implements List, displayInAppMessagelambda121 {
    public final ArrayList IconCompatParcelizer;
    public final boolean write;

    @Override // java.util.List
    public final Object get(int i) {
        return (getSdkDebuggerCallbackandroid_sdk_base_release) this.IconCompatParcelizer.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return Boolean.hashCode(this.write) + (this.IconCompatParcelizer.hashCode() * 31);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.IconCompatParcelizer.iterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.IconCompatParcelizer.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.IconCompatParcelizer.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        return this.IconCompatParcelizer.subList(i, i2);
    }

    public BundleUtils(ArrayList arrayList, boolean z) {
        this.IconCompatParcelizer = arrayList;
        this.write = z;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.IconCompatParcelizer.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleUtils)) {
            return false;
        }
        BundleUtils bundleUtils = (BundleUtils) obj;
        return this.IconCompatParcelizer.equals(bundleUtils.IconCompatParcelizer) && this.write == bundleUtils.write;
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
        return "WeekViewEntity(days=" + this.IconCompatParcelizer + ", isSelected=" + this.write + ")";
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof getSdkDebuggerCallbackandroid_sdk_base_release)) {
            return false;
        }
        return this.IconCompatParcelizer.contains((getSdkDebuggerCallbackandroid_sdk_base_release) obj);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof getSdkDebuggerCallbackandroid_sdk_base_release)) {
            return -1;
        }
        return this.IconCompatParcelizer.indexOf((getSdkDebuggerCallbackandroid_sdk_base_release) obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof getSdkDebuggerCallbackandroid_sdk_base_release)) {
            return -1;
        }
        return this.IconCompatParcelizer.lastIndexOf((getSdkDebuggerCallbackandroid_sdk_base_release) obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return this.IconCompatParcelizer.listIterator(i);
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

package o;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray$Companion;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = performDismiss.class)
public final class requestDisallowParentIntercept extends SwipeDismissTouchListenerVerticalDismissDirection implements List<SwipeDismissTouchListenerVerticalDismissDirection>, displayInAppMessagelambda121 {
    public static final JsonArray$Companion Companion = new JsonArray$Companion();
    public final List content;

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        Object[] objArr = {this.content, obj};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // java.util.List
    public final SwipeDismissTouchListenerVerticalDismissDirection get(int i) {
        return (SwipeDismissTouchListenerVerticalDismissDirection) this.content.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.content.iterator();
    }

    @Override // java.util.List
    public final ListIterator<SwipeDismissTouchListenerVerticalDismissDirection> listIterator() {
        return this.content.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.content.size();
    }

    @Override // java.util.List
    public final List<SwipeDismissTouchListenerVerticalDismissDirection> subList(int i, int i2) {
        return this.content.subList(i, i2);
    }

    public requestDisallowParentIntercept(List list) {
        list.getClass();
        this.content = list;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        return this.content.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return r8lambdaqVbn3OIWZdo7bTYIpVpFSOvCjb4.read(this, objArr);
    }

    public final String toString() {
        return onContentCardDismissed.IconCompatParcelizer(this.content, ",", "[", "]", null, 56);
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends SwipeDismissTouchListenerVerticalDismissDirection> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<SwipeDismissTouchListenerVerticalDismissDirection> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ SwipeDismissTouchListenerVerticalDismissDirection set(int i, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void sort(Comparator<? super SwipeDismissTouchListenerVerticalDismissDirection> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof SwipeDismissTouchListenerVerticalDismissDirection)) {
            return false;
        }
        return this.content.contains((SwipeDismissTouchListenerVerticalDismissDirection) obj);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof SwipeDismissTouchListenerVerticalDismissDirection)) {
            return -1;
        }
        return this.content.indexOf((SwipeDismissTouchListenerVerticalDismissDirection) obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof SwipeDismissTouchListenerVerticalDismissDirection)) {
            return -1;
        }
        return this.content.lastIndexOf((SwipeDismissTouchListenerVerticalDismissDirection) obj);
    }

    @Override // java.util.List
    public final ListIterator<SwipeDismissTouchListenerVerticalDismissDirection> listIterator(int i) {
        return this.content.listIterator(i);
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

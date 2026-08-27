package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.DefaultContentCardsViewBindingHandlerCompanion;
import o.DefaultContentCardsViewBindingHandlerCompanionCREATOR1;
import o.getCieXyz;
import o.r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractList extends AbstractCollection implements List {
    public static final DefaultContentCardsViewBindingHandlerCompanionCREATOR1 MediaDescriptionCompat = new DefaultContentCardsViewBindingHandlerCompanionCREATOR1();

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        MediaDescriptionCompat.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Object> iterator() {
        return new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(this);
    }

    public List<Object> subList(int i, int i2) {
        return new MovingSubList(this, i, i2);
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return new DefaultContentCardsViewBindingHandlerCompanion(this, 0);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        MediaDescriptionCompat.getClass();
        if (size() == collection.size()) {
            Iterator it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                Object[] objArr = {it2.next(), it.next()};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                }
            }
            return true;
        }
        return false;
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            Object[] objArr = {listIterator.previous(), obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object[] objArr = {it.next(), obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public ListIterator<Object> listIterator(int i) {
        return new DefaultContentCardsViewBindingHandlerCompanion(this, i);
    }
}

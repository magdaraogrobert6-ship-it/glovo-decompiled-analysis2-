package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class getBeyondBoundsLayout extends AbstractCollection implements List {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ Serializable MediaBrowserCompatMediaItem;
    public final /* synthetic */ Serializable MediaDescriptionCompat;
    public Collection RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final Collection serializer;
    public final AbstractCollection write;

    public getBeyondBoundsLayout(getPointerIconService getpointericonservice, Object obj, List list, getBeyondBoundsLayout getbeyondboundslayout) {
        this.MediaDescriptionCompat = getpointericonservice;
        this.MediaBrowserCompatMediaItem = getpointericonservice;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = list;
        this.write = getbeyondboundslayout;
        this.serializer = getbeyondboundslayout == null ? null : getbeyondboundslayout.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer() {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Serializable serializable = this.MediaBrowserCompatMediaItem;
        AbstractCollection abstractCollection = this.write;
        if (i != 0) {
            getBeyondBoundsLayout getbeyondboundslayout = (getBeyondBoundsLayout) abstractCollection;
            if (getbeyondboundslayout != null) {
                getbeyondboundslayout.IconCompatParcelizer();
                return;
            } else {
                ((getPointerIconService) serializable).IconCompatParcelizer.put(obj, this.RemoteActionCompatParcelizer);
                return;
            }
        }
        getBeyondBoundsLayout getbeyondboundslayout2 = (getBeyondBoundsLayout) abstractCollection;
        if (getbeyondboundslayout2 != null) {
            getbeyondboundslayout2.IconCompatParcelizer();
        } else {
            ((getLambda641200809ui) serializable).serializer.put(obj, this.RemoteActionCompatParcelizer);
        }
    }

    public final void read() {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Serializable serializable = this.MediaBrowserCompatMediaItem;
        AbstractCollection abstractCollection = this.write;
        if (i != 0) {
            getBeyondBoundsLayout getbeyondboundslayout = (getBeyondBoundsLayout) abstractCollection;
            if (getbeyondboundslayout != null) {
                getbeyondboundslayout.read();
                return;
            } else {
                if (this.RemoteActionCompatParcelizer.isEmpty()) {
                    ((getPointerIconService) serializable).IconCompatParcelizer.remove(obj);
                    return;
                }
                return;
            }
        }
        getBeyondBoundsLayout getbeyondboundslayout2 = (getBeyondBoundsLayout) abstractCollection;
        if (getbeyondboundslayout2 != null) {
            getbeyondboundslayout2.read();
        } else if (this.RemoteActionCompatParcelizer.isEmpty()) {
            ((getLambda641200809ui) serializable).serializer.remove(obj);
        }
    }

    public final void serializer() {
        Collection collection;
        Collection collection2;
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        Serializable serializable = this.MediaBrowserCompatMediaItem;
        Collection collection3 = this.serializer;
        AbstractCollection abstractCollection = this.write;
        if (i != 0) {
            getBeyondBoundsLayout getbeyondboundslayout = (getBeyondBoundsLayout) abstractCollection;
            if (getbeyondboundslayout != null) {
                getbeyondboundslayout.serializer();
                if (getbeyondboundslayout.RemoteActionCompatParcelizer == collection3) {
                    return;
                }
                PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
                return;
            }
            if (!this.RemoteActionCompatParcelizer.isEmpty() || (collection2 = (Collection) ((getPointerIconService) serializable).IconCompatParcelizer.get(obj)) == null) {
                return;
            }
            this.RemoteActionCompatParcelizer = collection2;
            return;
        }
        getBeyondBoundsLayout getbeyondboundslayout2 = (getBeyondBoundsLayout) abstractCollection;
        if (getbeyondboundslayout2 != null) {
            getbeyondboundslayout2.serializer();
            if (getbeyondboundslayout2.RemoteActionCompatParcelizer == collection3) {
                return;
            }
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return;
        }
        if (!this.RemoteActionCompatParcelizer.isEmpty() || (collection = (Collection) ((getLambda641200809ui) serializable).serializer.get(obj)) == null) {
            return;
        }
        this.RemoteActionCompatParcelizer = collection;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.read;
        Serializable serializable = this.MediaDescriptionCompat;
        Object obj = this.IconCompatParcelizer;
        AbstractCollection abstractCollection = this.write;
        if (i3 != 0) {
            serializer();
            List listSubList = ((List) this.RemoteActionCompatParcelizer).subList(i, i2);
            getBeyondBoundsLayout getbeyondboundslayout = (getBeyondBoundsLayout) abstractCollection;
            if (getbeyondboundslayout == null) {
                getbeyondboundslayout = this;
            }
            getPointerIconService getpointericonservice = (getPointerIconService) serializable;
            return listSubList instanceof RandomAccess ? new getTouchBoundsExpansionRZrCHBk(getpointericonservice, obj, listSubList, getbeyondboundslayout) : new getBeyondBoundsLayout(getpointericonservice, obj, listSubList, getbeyondboundslayout);
        }
        serializer();
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) serializable;
        List listSubList2 = ((List) this.RemoteActionCompatParcelizer).subList(i, i2);
        getBeyondBoundsLayout getbeyondboundslayout2 = (getBeyondBoundsLayout) abstractCollection;
        if (getbeyondboundslayout2 == null) {
            getbeyondboundslayout2 = this;
        }
        return listSubList2 instanceof RandomAccess ? new BeyondBoundsLayoutProviderModifierNode(getlambda641200809ui, obj, listSubList2, getbeyondboundslayout2) : new getBeyondBoundsLayout(getlambda641200809ui, obj, listSubList2, getbeyondboundslayout2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (this.read != 0) {
            if (size() == 0) {
                return;
            }
            this.RemoteActionCompatParcelizer.clear();
            read();
            return;
        }
        int size = size();
        if (size == 0) {
            return;
        }
        this.RemoteActionCompatParcelizer.clear();
        ((getLambda641200809ui) this.MediaBrowserCompatMediaItem).read -= size;
        read();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (this.read != 0) {
            serializer();
            return this.RemoteActionCompatParcelizer.contains(obj);
        }
        serializer();
        return this.RemoteActionCompatParcelizer.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        if (this.read != 0) {
            serializer();
            return this.RemoteActionCompatParcelizer.containsAll(collection);
        }
        serializer();
        return this.RemoteActionCompatParcelizer.containsAll(collection);
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (this.read != 0) {
            serializer();
            return ((List) this.RemoteActionCompatParcelizer).get(i);
        }
        serializer();
        return ((List) this.RemoteActionCompatParcelizer).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        if (this.read != 0) {
            serializer();
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        serializer();
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (this.read != 0) {
            serializer();
            return ((List) this.RemoteActionCompatParcelizer).indexOf(obj);
        }
        serializer();
        return ((List) this.RemoteActionCompatParcelizer).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        if (this.read != 0) {
            serializer();
            return new findOverridingAncestorNode(this);
        }
        serializer();
        return new getLefthoxUOeE(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (this.read != 0) {
            serializer();
            return ((List) this.RemoteActionCompatParcelizer).lastIndexOf(obj);
        }
        serializer();
        return ((List) this.RemoteActionCompatParcelizer).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        if (this.read != 0) {
            serializer();
            return new getIcon(this);
        }
        serializer();
        return new BeyondBoundsLayoutKtModifierLocalBeyondBoundsLayout1(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        if (this.read != 0) {
            serializer();
            Object objRemove = ((List) this.RemoteActionCompatParcelizer).remove(i);
            read();
            return objRemove;
        }
        serializer();
        Object objRemove2 = ((List) this.RemoteActionCompatParcelizer).remove(i);
        ((getLambda641200809ui) this.MediaDescriptionCompat).read--;
        read();
        return objRemove2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        if (this.read != 0) {
            collection.getClass();
            size();
            boolean zRetainAll = this.RemoteActionCompatParcelizer.retainAll(collection);
            if (zRetainAll) {
                this.RemoteActionCompatParcelizer.size();
                read();
            }
            return zRetainAll;
        }
        collection.getClass();
        int size = size();
        boolean zRetainAll2 = this.RemoteActionCompatParcelizer.retainAll(collection);
        if (zRetainAll2) {
            int size2 = this.RemoteActionCompatParcelizer.size();
            ((getLambda641200809ui) this.MediaBrowserCompatMediaItem).read += size2 - size;
            read();
        }
        return zRetainAll2;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        if (this.read != 0) {
            serializer();
            return ((List) this.RemoteActionCompatParcelizer).set(i, obj);
        }
        serializer();
        return ((List) this.RemoteActionCompatParcelizer).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        if (this.read != 0) {
            serializer();
            return this.RemoteActionCompatParcelizer.size();
        }
        serializer();
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        if (this.read != 0) {
            serializer();
            return this.RemoteActionCompatParcelizer.toString();
        }
        serializer();
        return this.RemoteActionCompatParcelizer.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (this.read != 0) {
            serializer();
            boolean zIsEmpty = this.RemoteActionCompatParcelizer.isEmpty();
            boolean zAdd = this.RemoteActionCompatParcelizer.add(obj);
            if (!zAdd || !zIsEmpty) {
                return zAdd;
            }
            IconCompatParcelizer();
            return true;
        }
        serializer();
        boolean zIsEmpty2 = this.RemoteActionCompatParcelizer.isEmpty();
        boolean zAdd2 = this.RemoteActionCompatParcelizer.add(obj);
        if (zAdd2) {
            ((getLambda641200809ui) this.MediaBrowserCompatMediaItem).read++;
            if (zIsEmpty2) {
                IconCompatParcelizer();
                return true;
            }
        }
        return zAdd2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll = false;
        if (this.read != 0) {
            if (!collection.isEmpty()) {
                size();
                zRemoveAll = this.RemoteActionCompatParcelizer.removeAll(collection);
                if (zRemoveAll) {
                    this.RemoteActionCompatParcelizer.size();
                    read();
                }
            }
            return zRemoveAll;
        }
        if (!collection.isEmpty()) {
            int size = size();
            zRemoveAll = this.RemoteActionCompatParcelizer.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.RemoteActionCompatParcelizer.size();
                ((getLambda641200809ui) this.MediaBrowserCompatMediaItem).read += size2 - size;
                read();
            }
        }
        return zRemoveAll;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (this.read != 0) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = ((List) this.RemoteActionCompatParcelizer).addAll(i, collection);
            if (!zAddAll) {
                return zAddAll;
            }
            this.RemoteActionCompatParcelizer.size();
            if (size != 0) {
                return zAddAll;
            }
            IconCompatParcelizer();
            return true;
        }
        if (collection.isEmpty()) {
            return false;
        }
        int size2 = size();
        boolean zAddAll2 = ((List) this.RemoteActionCompatParcelizer).addAll(i, collection);
        if (!zAddAll2) {
            return zAddAll2;
        }
        int size3 = this.RemoteActionCompatParcelizer.size();
        ((getLambda641200809ui) this.MediaDescriptionCompat).read += size3 - size2;
        if (size2 != 0) {
            return zAddAll2;
        }
        IconCompatParcelizer();
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this.read != 0) {
            if (obj == this) {
                return true;
            }
            serializer();
            return this.RemoteActionCompatParcelizer.equals(obj);
        }
        if (obj == this) {
            return true;
        }
        serializer();
        return this.RemoteActionCompatParcelizer.equals(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        if (this.read != 0) {
            serializer();
            return new getIcon(this, i);
        }
        serializer();
        return new BeyondBoundsLayoutKtModifierLocalBeyondBoundsLayout1(this, i);
    }

    public getBeyondBoundsLayout(getLambda641200809ui getlambda641200809ui, Object obj, List list, getBeyondBoundsLayout getbeyondboundslayout) {
        this.MediaDescriptionCompat = getlambda641200809ui;
        this.MediaBrowserCompatMediaItem = getlambda641200809ui;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = list;
        this.write = getbeyondboundslayout;
        this.serializer = getbeyondboundslayout == null ? null : getbeyondboundslayout.RemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        if (this.read != 0) {
            serializer();
            boolean zRemove = this.RemoteActionCompatParcelizer.remove(obj);
            if (zRemove) {
                read();
            }
            return zRemove;
        }
        serializer();
        boolean zRemove2 = this.RemoteActionCompatParcelizer.remove(obj);
        if (zRemove2) {
            ((getLambda641200809ui) this.MediaBrowserCompatMediaItem).read--;
            read();
        }
        return zRemove2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        if (this.read != 0) {
            serializer();
            boolean zIsEmpty = this.RemoteActionCompatParcelizer.isEmpty();
            ((List) this.RemoteActionCompatParcelizer).add(i, obj);
            if (zIsEmpty) {
                IconCompatParcelizer();
                return;
            }
            return;
        }
        serializer();
        boolean zIsEmpty2 = this.RemoteActionCompatParcelizer.isEmpty();
        ((List) this.RemoteActionCompatParcelizer).add(i, obj);
        ((getLambda641200809ui) this.MediaDescriptionCompat).read++;
        if (zIsEmpty2) {
            IconCompatParcelizer();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (this.read != 0) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.RemoteActionCompatParcelizer.addAll(collection);
            if (!zAddAll) {
                return zAddAll;
            }
            this.RemoteActionCompatParcelizer.size();
            if (size != 0) {
                return zAddAll;
            }
            IconCompatParcelizer();
            return true;
        }
        if (collection.isEmpty()) {
            return false;
        }
        int size2 = size();
        boolean zAddAll2 = this.RemoteActionCompatParcelizer.addAll(collection);
        if (!zAddAll2) {
            return zAddAll2;
        }
        int size3 = this.RemoteActionCompatParcelizer.size();
        ((getLambda641200809ui) this.MediaBrowserCompatMediaItem).read += size3 - size2;
        if (size2 != 0) {
            return zAddAll2;
        }
        IconCompatParcelizer();
        return true;
    }
}

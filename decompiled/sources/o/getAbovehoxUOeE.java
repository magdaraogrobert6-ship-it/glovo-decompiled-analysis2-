package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getAbovehoxUOeE extends ContentScaleCompanionFillHeight1 {
    public final /* synthetic */ getLambda641200809ui RemoteActionCompatParcelizer;
    public final Map serializer;

    public getAbovehoxUOeE(getLambda641200809ui getlambda641200809ui, Map map) {
        this.RemoteActionCompatParcelizer = getlambda641200809ui;
        map.getClass();
        this.serializer = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.serializer.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.serializer.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.serializer.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.serializer.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.serializer.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new getLefthoxUOeE(this, this.serializer.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.serializer.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.RemoteActionCompatParcelizer.read -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.serializer.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            getLefthoxUOeE getlefthoxuoee = (getLefthoxUOeE) it;
            if (!getlefthoxuoee.hasNext()) {
                return;
            }
            getlefthoxuoee.next();
            getlefthoxuoee.remove();
        }
    }
}

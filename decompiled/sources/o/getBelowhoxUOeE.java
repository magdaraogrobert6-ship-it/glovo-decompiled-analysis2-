package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class getBelowhoxUOeE extends ContentScaleCompanionFillHeight1 {
    public final /* synthetic */ getAfterhoxUOeE read;

    public getBelowhoxUOeE(getAfterhoxUOeE getafterhoxuoee) {
        this.read = getafterhoxuoee;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.read.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.read.write.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.read.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new getLefthoxUOeE(this.read);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.read.write.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) this.read.read;
        Object key = entry.getKey();
        getFillWidthannotations getfillwidthannotations = getlambda641200809ui.serializer;
        getfillwidthannotations.getClass();
        try {
            objRemove = getfillwidthannotations.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        getlambda641200809ui.read -= size;
        return true;
    }

    @Override // o.ContentScaleCompanionFillHeight1, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        try {
            return ContentScaleCompanionFillWidth1.RemoteActionCompatParcelizer(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // o.ContentScaleCompanionFillHeight1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int iCeil;
        collection.getClass();
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                iCeil = size < 1073741824 ? (int) Math.ceil(((double) size) / 0.75d) : Integer.MAX_VALUE;
            } else {
                if (size < 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(size, "expectedSize cannot be negative but was: "));
                    return false;
                }
                iCeil = size + 1;
            }
            HashSet hashSet = new HashSet(iCeil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            getLambda641200809ui getlambda641200809ui = (getLambda641200809ui) this.read.read;
            getAbovehoxUOeE getabovehoxuoee = getlambda641200809ui.IconCompatParcelizer;
            if (getabovehoxuoee == null) {
                getAbovehoxUOeE getabovehoxuoee2 = new getAbovehoxUOeE(getlambda641200809ui, getlambda641200809ui.serializer);
                getlambda641200809ui.IconCompatParcelizer = getabovehoxuoee2;
                getabovehoxuoee = getabovehoxuoee2;
            }
            return getabovehoxuoee.retainAll(hashSet);
        }
    }
}

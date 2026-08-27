package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class onExit extends AbstractSet {
    public final /* synthetic */ int read = 0;
    public final Map write;

    public onExit(getPointerIconService getpointericonservice, Map map) {
        this.write = map;
    }

    public final boolean write(Collection collection) {
        return ApproachLayoutModifierNodemeasure11.write(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.read;
        Map map = this.write;
        if (i != 0) {
            return map.containsKey(obj);
        }
        Set setEntrySet = ((getAfterhoxUOeE) map).write.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.read;
        Map map = this.write;
        return i != 0 ? map.isEmpty() : ((getAfterhoxUOeE) map).isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.read;
        Map map = this.write;
        return i != 0 ? new getHeadsetHookEK5gGoQ(this, map.entrySet().iterator()) : new findOverridingAncestorNode((getAfterhoxUOeE) map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.read;
        Map map = this.write;
        return i != 0 ? map.size() : ((getAfterhoxUOeE) map).write.size();
    }

    public final boolean serializer(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        int i = this.read;
        Map map = this.write;
        if (i != 0) {
            Collection collection = (Collection) map.remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        try {
            objRemove = ((getPointerIconService) ((getAfterhoxUOeE) map).read).IconCompatParcelizer.remove(entry.getKey());
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection2 = (Collection) objRemove;
        if (collection2 == null) {
            return true;
        }
        collection2.size();
        collection2.clear();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.read == 0) {
            ((getAfterhoxUOeE) this.write).clear();
            return;
        }
        Iterator it = iterator();
        while (true) {
            getHeadsetHookEK5gGoQ getheadsethookek5ggoq = (getHeadsetHookEK5gGoQ) it;
            if (!getheadsethookek5ggoq.hasNext()) {
                return;
            }
            getheadsethookek5ggoq.next();
            getheadsethookek5ggoq.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        return this.read != 1 ? super.containsAll(collection) : this.write.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this.read != 1) {
            return super.equals(obj);
        }
        return this == obj || this.write.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.read != 1 ? super.hashCode() : this.write.keySet().hashCode();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        if (this.read != 0) {
            return write(collection);
        }
        collection.getClass();
        try {
            return ApproachLayoutModifierNodemeasure11.write(this, collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        int iCeil;
        if (this.read != 0) {
            return serializer(collection);
        }
        collection.getClass();
        try {
            return serializer(collection);
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
            return ((onExit) ((getPointerIconService) ((getAfterhoxUOeE) this.write).read).read()).retainAll(hashSet);
        }
    }

    public onExit(getAfterhoxUOeE getafterhoxuoee) {
        this.write = getafterhoxuoee;
    }
}

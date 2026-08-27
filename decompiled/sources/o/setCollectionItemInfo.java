package o;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class setCollectionItemInfo extends LinkedHashMap {
    public static final Object RemoteActionCompatParcelizer = new Object();

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        synchronized (RemoteActionCompatParcelizer) {
            super.clear();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set setEntrySet;
        synchronized (RemoteActionCompatParcelizer) {
            setEntrySet = super.entrySet();
        }
        return setEntrySet;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (RemoteActionCompatParcelizer) {
            obj2 = super.get(obj);
        }
        return obj2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (RemoteActionCompatParcelizer) {
            orDefault = super.getOrDefault(obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (RemoteActionCompatParcelizer) {
            objPut = super.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        synchronized (RemoteActionCompatParcelizer) {
            super.putAll(map);
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        synchronized (RemoteActionCompatParcelizer) {
            objPutIfAbsent = super.putIfAbsent(obj, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (RemoteActionCompatParcelizer) {
            objRemove = super.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String string;
        synchronized (RemoteActionCompatParcelizer) {
            string = super.toString();
        }
        return string;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collectionValues;
        synchronized (RemoteActionCompatParcelizer) {
            collectionValues = super.values();
        }
        return collectionValues;
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (RemoteActionCompatParcelizer) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }
}

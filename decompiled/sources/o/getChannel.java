package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class getChannel extends delegate implements Map {
    public final HashMap IconCompatParcelizer = new HashMap();

    @Override // o.delegate
    public final Object read() {
        return this.IconCompatParcelizer;
    }

    public final double IconCompatParcelizer() {
        HashMap map = this.IconCompatParcelizer;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            if (((UriAction) it.next()).RemoteActionCompatParcelizer()) {
                i++;
            }
        }
        return (((double) i) / ((double) i2)) * 100.0d;
    }

    @Override // java.util.Map
    public final void clear() {
        this.IconCompatParcelizer.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.IconCompatParcelizer.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.IconCompatParcelizer.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.IconCompatParcelizer.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.IconCompatParcelizer.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.IconCompatParcelizer.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.IconCompatParcelizer.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.IconCompatParcelizer.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.IconCompatParcelizer.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.IconCompatParcelizer.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.IconCompatParcelizer.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.IconCompatParcelizer.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.IconCompatParcelizer.values();
    }
}

package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getContentCardsViewFromCache implements Map, displayInAppMessagelambda121 {
    public static final DefaultContentCardsViewBindingHandler write = new DefaultContentCardsViewBindingHandler();

    public abstract Collection<Object> MediaSessionCompatQueueItem();

    public abstract int RemoteActionCompatParcelizer();

    @Override // java.util.Map
    public final Set<Map.Entry<Object, Object>> entrySet() {
        return write();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return read();
    }

    public abstract Set<Object> read();

    @Override // java.util.Map
    public final int size() {
        return RemoteActionCompatParcelizer();
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return MediaSessionCompatQueueItem();
    }

    public abstract Set write();

    public final boolean RemoteActionCompatParcelizer(Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj = get(key);
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{value, obj}, getCieXyz.write())).booleanValue()) {
            return obj != null || containsKey(key);
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<Object, Object>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Object[] objArr = {((Map.Entry) it.next()).getValue(), obj};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!RemoteActionCompatParcelizer((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<Object, Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return onContentCardDismissed.IconCompatParcelizer(entrySet(), ", ", "{", "}", new AbstractMap$$ExternalSyntheticLambda0(0, this), 24);
    }
}

package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchChangesdefault extends HistoricalChange {
    public final transient addHitPathQJqDSyo read;
    public final transient Object[] serializer;
    public final transient int write;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.write;
    }

    public dispatchChangesdefault(addHitPathQJqDSyo addhitpathqjqdsyo, Object[] objArr, int i) {
        this.read = addhitpathqjqdsyo;
        this.serializer = objArr;
        this.write = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.read.get(key));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        getOriginalEventPositionF1C5BW0ui hitPathTracker = this.RemoteActionCompatParcelizer;
        if (hitPathTracker == null) {
            hitPathTracker = new HitPathTracker(this);
            this.RemoteActionCompatParcelizer = hitPathTracker;
        }
        return hitPathTracker.listIterator(0);
    }

    @Override // o.getDownChange
    public final int write(Object[] objArr) {
        getOriginalEventPositionF1C5BW0ui hitPathTracker = this.RemoteActionCompatParcelizer;
        if (hitPathTracker == null) {
            hitPathTracker = new HitPathTracker(this);
            this.RemoteActionCompatParcelizer = hitPathTracker;
        }
        return hitPathTracker.write(objArr);
    }
}

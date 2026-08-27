package o;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationSubscriptionTypeCompanion extends AbstractSet {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ AbstractMap serializer;

    public /* synthetic */ NotificationSubscriptionTypeCompanion(AbstractMap abstractMap, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.serializer;
        if (i == 0) {
            ((GenderCompanion) abstractMap).clear();
            return;
        }
        if (i == 1) {
            ((getDualFloatInfinityBaseannotations) abstractMap).clear();
        } else if (i != 2) {
            ((performSave) abstractMap).clear();
        } else {
            ((NestedScrollDispatcherdispatchPreFling1) abstractMap).clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.serializer;
        if (i == 0) {
            return new accessgetMapcp((GenderCompanion) abstractMap, 0);
        }
        if (i != 1) {
            return i != 2 ? new accessgetMapcp((performSave) abstractMap, 3) : new accessgetMapcp((NestedScrollDispatcherdispatchPreFling1) abstractMap);
        }
        return new accessgetMapcp((getDualFloatInfinityBaseannotations) abstractMap, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.serializer;
        if (i == 0) {
            return ((GenderCompanion) abstractMap).size();
        }
        if (i != 1) {
            return i != 2 ? ((performSave) abstractMap).size() : ((NestedScrollDispatcherdispatchPreFling1) abstractMap).size();
        }
        return ((getDualFloatInfinityBaseannotations) abstractMap).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.serializer;
        if (i == 0) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            ((GenderCompanion) abstractMap).put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }
        if (i == 1) {
            Map.Entry entry2 = (Map.Entry) obj;
            if (contains(entry2)) {
                return false;
            }
            ((getDualFloatInfinityBaseannotations) abstractMap).serializer((Comparable) entry2.getKey(), entry2.getValue());
            return true;
        }
        if (i != 2) {
            Map.Entry entry3 = (Map.Entry) obj;
            if (contains(entry3)) {
                return false;
            }
            ((performSave) abstractMap).put((Comparable) entry3.getKey(), entry3.getValue());
            return true;
        }
        Map.Entry entry4 = (Map.Entry) obj;
        if (contains(entry4)) {
            return false;
        }
        ((NestedScrollDispatcherdispatchPreFling1) abstractMap).put((Comparable) entry4.getKey(), entry4.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.serializer;
        if (i == 0) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ((GenderCompanion) abstractMap).get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }
        if (i == 1) {
            Map.Entry entry2 = (Map.Entry) obj;
            Object obj3 = ((getDualFloatInfinityBaseannotations) abstractMap).get(entry2.getKey());
            Object value2 = entry2.getValue();
            return obj3 == value2 || (obj3 != null && obj3.equals(value2));
        }
        if (i != 2) {
            Map.Entry entry3 = (Map.Entry) obj;
            Object obj4 = ((performSave) abstractMap).get(entry3.getKey());
            Object value3 = entry3.getValue();
            return obj4 == value3 || (obj4 != null && obj4.equals(value3));
        }
        Map.Entry entry4 = (Map.Entry) obj;
        Object obj5 = ((NestedScrollDispatcherdispatchPreFling1) abstractMap).get(entry4.getKey());
        Object value4 = entry4.getValue();
        return obj5 == value4 || (obj5 != null && obj5.equals(value4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        AbstractMap abstractMap = this.serializer;
        if (i == 0) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            ((GenderCompanion) abstractMap).remove(entry.getKey());
            return true;
        }
        if (i == 1) {
            Map.Entry entry2 = (Map.Entry) obj;
            if (!contains(entry2)) {
                return false;
            }
            ((getDualFloatInfinityBaseannotations) abstractMap).remove(entry2.getKey());
            return true;
        }
        if (i != 2) {
            Map.Entry entry3 = (Map.Entry) obj;
            if (!contains(entry3)) {
                return false;
            }
            ((performSave) abstractMap).remove(entry3.getKey());
            return true;
        }
        Map.Entry entry4 = (Map.Entry) obj;
        if (!contains(entry4)) {
            return false;
        }
        ((NestedScrollDispatcherdispatchPreFling1) abstractMap).remove(entry4.getKey());
        return true;
    }
}

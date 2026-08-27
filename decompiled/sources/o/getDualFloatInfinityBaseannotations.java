package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class getDualFloatInfinityBaseannotations extends AbstractMap {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public Map MediaMetadataCompat;
    public Map MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public boolean read;
    public List serializer = Collections.EMPTY_LIST;
    public volatile NotificationSubscriptionTypeCompanion write;

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[SYNTHETIC] */
    public final int IconCompatParcelizer(Comparable comparable) {
        int i;
        int iCompareTo;
        int size = this.serializer.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                i = (size + i2) / 2;
                iCompareTo = comparable.compareTo(((getUint64High32annotations) this.serializer.get(i)).write());
                if (iCompareTo < 0) {
                    i2 = i - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i;
                    }
                    size = i + 1;
                }
            }
        } else {
            int iCompareTo2 = comparable.compareTo(((getUint64High32annotations) this.serializer.get(i2)).write());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                    i = (size + i2) / 2;
                    iCompareTo = comparable.compareTo(((getUint64High32annotations) this.serializer.get(i)).write());
                    if (iCompareTo < 0) {
                        i2 = i - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i;
                        }
                        size = i + 1;
                    }
                }
            }
        }
        return -(size + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return IconCompatParcelizer(comparable) >= 0 || this.MediaMetadataCompat.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iIconCompatParcelizer = IconCompatParcelizer(comparable);
        return iIconCompatParcelizer >= 0 ? ((getUint64High32annotations) this.serializer.get(iIconCompatParcelizer)).getValue() : this.MediaMetadataCompat.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.serializer.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((getUint64High32annotations) this.serializer.get(i)).hashCode();
        }
        return this.MediaMetadataCompat.size() > 0 ? this.MediaMetadataCompat.hashCode() + iHashCode : iHashCode;
    }

    public final Iterable serializer() {
        return this.MediaMetadataCompat.isEmpty() ? InlineClassHelperKt.serializer : this.MediaMetadataCompat.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.MediaMetadataCompat.size() + this.serializer.size();
    }

    public final Map.Entry write(int i) {
        return (Map.Entry) this.serializer.get(i);
    }

    public getDualFloatInfinityBaseannotations(int i) {
        this.RemoteActionCompatParcelizer = i;
        Map map = Collections.EMPTY_MAP;
        this.MediaMetadataCompat = map;
        this.MediaSessionCompatQueueItem = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        IconCompatParcelizer();
        if (!this.serializer.isEmpty()) {
            this.serializer.clear();
        }
        if (this.MediaMetadataCompat.isEmpty()) {
            return;
        }
        this.MediaMetadataCompat.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDualFloatInfinityBaseannotations)) {
            return super.equals(obj);
        }
        getDualFloatInfinityBaseannotations getdualfloatinfinitybaseannotations = (getDualFloatInfinityBaseannotations) obj;
        int size = size();
        if (size == getdualfloatinfinitybaseannotations.size()) {
            int size2 = this.serializer.size();
            if (size2 != getdualfloatinfinitybaseannotations.serializer.size()) {
                return ((AbstractSet) entrySet()).equals(getdualfloatinfinitybaseannotations.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (write(i).equals(getdualfloatinfinitybaseannotations.write(i))) {
                }
            }
            if (size2 != size) {
                return this.MediaMetadataCompat.equals(getdualfloatinfinitybaseannotations.MediaMetadataCompat);
            }
            return true;
        }
        return false;
    }

    public final Object read(int i) {
        IconCompatParcelizer();
        Object value = ((getUint64High32annotations) this.serializer.remove(i)).getValue();
        if (!this.MediaMetadataCompat.isEmpty()) {
            Iterator it = write().entrySet().iterator();
            this.serializer.add(new getUint64High32annotations(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        IconCompatParcelizer();
        Comparable comparable = (Comparable) obj;
        int iIconCompatParcelizer = IconCompatParcelizer(comparable);
        if (iIconCompatParcelizer >= 0) {
            return read(iIconCompatParcelizer);
        }
        if (this.MediaMetadataCompat.isEmpty()) {
            return null;
        }
        return this.MediaMetadataCompat.remove(comparable);
    }

    public final Object serializer(Comparable comparable, Object obj) {
        IconCompatParcelizer();
        int iIconCompatParcelizer = IconCompatParcelizer(comparable);
        if (iIconCompatParcelizer >= 0) {
            return ((getUint64High32annotations) this.serializer.get(iIconCompatParcelizer)).setValue(obj);
        }
        IconCompatParcelizer();
        boolean zIsEmpty = this.serializer.isEmpty();
        int i = this.RemoteActionCompatParcelizer;
        if (zIsEmpty && !(this.serializer instanceof ArrayList)) {
            this.serializer = new ArrayList(i);
        }
        int i2 = -(iIconCompatParcelizer + 1);
        if (i2 >= i) {
            return write().put(comparable, obj);
        }
        if (this.serializer.size() == i) {
            getUint64High32annotations getuint64high32annotations = (getUint64High32annotations) this.serializer.remove(i - 1);
            write().put(getuint64high32annotations.write(), getuint64high32annotations.getValue());
        }
        this.serializer.add(i2, new getUint64High32annotations(this, comparable, obj));
        return null;
    }

    public final SortedMap write() {
        IconCompatParcelizer();
        if (this.MediaMetadataCompat.isEmpty() && !(this.MediaMetadataCompat instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.MediaMetadataCompat = treeMap;
            this.MediaSessionCompatQueueItem = treeMap.descendingMap();
        }
        return (SortedMap) this.MediaMetadataCompat;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        m1$$ExternalSyntheticOutline0.m(obj);
        return serializer(null, obj2);
    }

    public final void IconCompatParcelizer() {
        if (this.read) {
            getAlignmentLinesMap.write();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.write == null) {
            this.write = new NotificationSubscriptionTypeCompanion(this, 1);
        }
        return this.write;
    }
}

package o;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class NestedScrollDispatcherdispatchPreFling1 extends AbstractMap {
    public Map IconCompatParcelizer;
    public Map MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public Object[] read;
    public boolean serializer;
    public volatile NotificationSubscriptionTypeCompanion write;

    public final Set IconCompatParcelizer() {
        return this.IconCompatParcelizer.isEmpty() ? Collections.EMPTY_SET : this.IconCompatParcelizer.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return read(comparable) >= 0 || this.IconCompatParcelizer.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int i = read(comparable);
        return i >= 0 ? ((NestedScrollElement) this.read[i]).write : this.IconCompatParcelizer.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.IconCompatParcelizer.size() + this.RemoteActionCompatParcelizer;
    }

    public NestedScrollDispatcherdispatchPreFling1() {
        Map map = Collections.EMPTY_MAP;
        this.IconCompatParcelizer = map;
        this.MediaMetadataCompat = map;
    }

    public final Object RemoteActionCompatParcelizer(int i) {
        write();
        Object[] objArr = this.read;
        Object obj = ((NestedScrollElement) objArr[i]).write;
        System.arraycopy(objArr, i + 1, objArr, i, (this.RemoteActionCompatParcelizer - i) - 1);
        this.RemoteActionCompatParcelizer--;
        if (!this.IconCompatParcelizer.isEmpty()) {
            Iterator it = RemoteActionCompatParcelizer().entrySet().iterator();
            Object[] objArr2 = this.read;
            int i2 = this.RemoteActionCompatParcelizer;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new NestedScrollElement(this, (Comparable) entry.getKey(), entry.getValue());
            this.RemoteActionCompatParcelizer++;
            it.remove();
        }
        return obj;
    }

    public final SortedMap RemoteActionCompatParcelizer() {
        write();
        if (this.IconCompatParcelizer.isEmpty() && !(this.IconCompatParcelizer instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.IconCompatParcelizer = treeMap;
            this.MediaMetadataCompat = treeMap.descendingMap();
        }
        return (SortedMap) this.IconCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        write();
        if (this.RemoteActionCompatParcelizer != 0) {
            this.read = null;
            this.RemoteActionCompatParcelizer = 0;
        }
        if (this.IconCompatParcelizer.isEmpty()) {
            return;
        }
        this.IconCompatParcelizer.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NestedScrollDispatcherdispatchPreFling1)) {
            return super.equals(obj);
        }
        NestedScrollDispatcherdispatchPreFling1 nestedScrollDispatcherdispatchPreFling1 = (NestedScrollDispatcherdispatchPreFling1) obj;
        int size = size();
        if (size == nestedScrollDispatcherdispatchPreFling1.size()) {
            int i = this.RemoteActionCompatParcelizer;
            if (i != nestedScrollDispatcherdispatchPreFling1.RemoteActionCompatParcelizer) {
                return entrySet().equals(nestedScrollDispatcherdispatchPreFling1.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (serializer(i2).equals(nestedScrollDispatcherdispatchPreFling1.serializer(i2))) {
                }
            }
            if (i != size) {
                return this.IconCompatParcelizer.equals(nestedScrollDispatcherdispatchPreFling1.IconCompatParcelizer);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        write();
        int i = read(comparable);
        if (i >= 0) {
            return ((NestedScrollElement) this.read[i]).setValue(obj);
        }
        write();
        if (this.read == null) {
            this.read = new Object[16];
        }
        int i2 = -(i + 1);
        if (i2 >= 16) {
            return RemoteActionCompatParcelizer().put(comparable, obj);
        }
        if (this.RemoteActionCompatParcelizer == 16) {
            NestedScrollElement nestedScrollElement = (NestedScrollElement) this.read[15];
            this.RemoteActionCompatParcelizer = 15;
            RemoteActionCompatParcelizer().put(nestedScrollElement.RemoteActionCompatParcelizer, nestedScrollElement.write);
        }
        Object[] objArr = this.read;
        int length = objArr.length;
        System.arraycopy(objArr, i2, objArr, i2 + 1, 15 - i2);
        this.read[i2] = new NestedScrollElement(this, comparable, obj);
        this.RemoteActionCompatParcelizer++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        write();
        Comparable comparable = (Comparable) obj;
        int i = read(comparable);
        if (i >= 0) {
            return RemoteActionCompatParcelizer(i);
        }
        if (this.IconCompatParcelizer.isEmpty()) {
            return null;
        }
        return this.IconCompatParcelizer.remove(comparable);
    }

    public final NestedScrollElement serializer(int i) {
        if (i < this.RemoteActionCompatParcelizer) {
            return (NestedScrollElement) this.read[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final void write() {
        if (this.serializer) {
            getAlignmentLinesMap.write();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.read[i2].hashCode();
        }
        return this.IconCompatParcelizer.size() > 0 ? this.IconCompatParcelizer.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.write == null) {
            this.write = new NotificationSubscriptionTypeCompanion(this, 2);
        }
        return this.write;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0031 A[SYNTHETIC] */
    public final int read(Comparable comparable) {
        int i;
        int iCompareTo;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = i2 - 1;
        if (i3 < 0) {
            i2 = 0;
            while (i2 <= i3) {
                i = (i2 + i3) / 2;
                iCompareTo = comparable.compareTo(((NestedScrollElement) this.read[i]).RemoteActionCompatParcelizer);
                if (iCompareTo < 0) {
                    i3 = i - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i;
                    }
                    i2 = i + 1;
                }
            }
        } else {
            int iCompareTo2 = comparable.compareTo(((NestedScrollElement) this.read[i3]).RemoteActionCompatParcelizer);
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i2 = 0;
                while (i2 <= i3) {
                    i = (i2 + i3) / 2;
                    iCompareTo = comparable.compareTo(((NestedScrollElement) this.read[i]).RemoteActionCompatParcelizer);
                    if (iCompareTo < 0) {
                        i3 = i - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i;
                        }
                        i2 = i + 1;
                    }
                }
            }
        }
        return -(i2 + 1);
    }
}

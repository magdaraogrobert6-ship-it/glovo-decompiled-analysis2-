package o;

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

/* JADX INFO: loaded from: classes3.dex */
public final class GenderCompanion extends AbstractMap {
    public static final /* synthetic */ int write = 0;
    public final int IconCompatParcelizer;
    public volatile getMonthlambda10 MediaDescriptionCompat;
    public Map MediaMetadataCompat;
    public volatile NotificationSubscriptionTypeCompanion RatingCompat;
    public List RemoteActionCompatParcelizer = Collections.EMPTY_LIST;
    public Map read;
    public boolean serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x003f A[SYNTHETIC] */
    public final int RemoteActionCompatParcelizer(Comparable comparable) {
        int i;
        int iCompareTo;
        int size = this.RemoteActionCompatParcelizer.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                i = (size + i2) / 2;
                iCompareTo = comparable.compareTo(((SdkFlavor) this.RemoteActionCompatParcelizer.get(i)).IconCompatParcelizer);
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
            int iCompareTo2 = comparable.compareTo(((SdkFlavor) this.RemoteActionCompatParcelizer.get(i2)).IconCompatParcelizer);
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                    i = (size + i2) / 2;
                    iCompareTo = comparable.compareTo(((SdkFlavor) this.RemoteActionCompatParcelizer.get(i)).IconCompatParcelizer);
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

    public final Iterable RemoteActionCompatParcelizer() {
        return this.read.isEmpty() ? r8lambdaWggvoTcww7zo6NKsYTr87Meq30.RemoteActionCompatParcelizer : this.read.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return RemoteActionCompatParcelizer(comparable) >= 0 || this.read.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        return iRemoteActionCompatParcelizer >= 0 ? ((SdkFlavor) this.RemoteActionCompatParcelizer.get(iRemoteActionCompatParcelizer)).read : this.read.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.RemoteActionCompatParcelizer.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((SdkFlavor) this.RemoteActionCompatParcelizer.get(i)).hashCode();
        }
        return this.read.size() > 0 ? this.read.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.read.size() + this.RemoteActionCompatParcelizer.size();
    }

    public GenderCompanion(int i) {
        this.IconCompatParcelizer = i;
        Map map = Collections.EMPTY_MAP;
        this.read = map;
        this.MediaMetadataCompat = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        IconCompatParcelizer();
        if (!this.RemoteActionCompatParcelizer.isEmpty()) {
            this.RemoteActionCompatParcelizer.clear();
        }
        if (this.read.isEmpty()) {
            return;
        }
        this.read.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderCompanion)) {
            return super.equals(obj);
        }
        GenderCompanion genderCompanion = (GenderCompanion) obj;
        int size = size();
        if (size == genderCompanion.size()) {
            int size2 = this.RemoteActionCompatParcelizer.size();
            if (size2 != genderCompanion.RemoteActionCompatParcelizer.size()) {
                return ((AbstractSet) entrySet()).equals(genderCompanion.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (write(i).equals(genderCompanion.write(i))) {
                }
            }
            if (size2 != size) {
                return this.read.equals(genderCompanion.read);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        IconCompatParcelizer();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        if (iRemoteActionCompatParcelizer >= 0) {
            return ((SdkFlavor) this.RemoteActionCompatParcelizer.get(iRemoteActionCompatParcelizer)).setValue(obj);
        }
        IconCompatParcelizer();
        boolean zIsEmpty = this.RemoteActionCompatParcelizer.isEmpty();
        int i = this.IconCompatParcelizer;
        if (zIsEmpty && !(this.RemoteActionCompatParcelizer instanceof ArrayList)) {
            this.RemoteActionCompatParcelizer = new ArrayList(i);
        }
        int i2 = -(iRemoteActionCompatParcelizer + 1);
        if (i2 >= i) {
            return serializer().put(comparable, obj);
        }
        if (this.RemoteActionCompatParcelizer.size() == i) {
            SdkFlavor sdkFlavor = (SdkFlavor) this.RemoteActionCompatParcelizer.remove(i - 1);
            serializer().put(sdkFlavor.IconCompatParcelizer, sdkFlavor.read);
        }
        this.RemoteActionCompatParcelizer.add(i2, new SdkFlavor(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        IconCompatParcelizer();
        Comparable comparable = (Comparable) obj;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        if (iRemoteActionCompatParcelizer >= 0) {
            return serializer(iRemoteActionCompatParcelizer);
        }
        if (this.read.isEmpty()) {
            return null;
        }
        return this.read.remove(comparable);
    }

    public final Object serializer(int i) {
        IconCompatParcelizer();
        Object obj = ((SdkFlavor) this.RemoteActionCompatParcelizer.remove(i)).read;
        if (!this.read.isEmpty()) {
            Iterator it = serializer().entrySet().iterator();
            List list = this.RemoteActionCompatParcelizer;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new SdkFlavor(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap serializer() {
        IconCompatParcelizer();
        if (this.read.isEmpty() && !(this.read instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.read = treeMap;
            this.MediaMetadataCompat = treeMap.descendingMap();
        }
        return (SortedMap) this.read;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.RatingCompat == null) {
            this.RatingCompat = new NotificationSubscriptionTypeCompanion(this, 0);
        }
        return this.RatingCompat;
    }

    public final Map.Entry write(int i) {
        return (Map.Entry) this.RemoteActionCompatParcelizer.get(i);
    }

    public final void IconCompatParcelizer() {
        if (this.serializer) {
            getAlignmentLinesMap.write();
        }
    }
}

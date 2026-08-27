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

/* JADX INFO: loaded from: classes2.dex */
public final class performSave extends AbstractMap {
    public static final /* synthetic */ int write = 0;
    public boolean IconCompatParcelizer;
    public Map MediaBrowserCompatMediaItem;
    public Map MediaDescriptionCompat;
    public final int RatingCompat;
    public List RemoteActionCompatParcelizer = Collections.EMPTY_LIST;
    public volatile NotificationSubscriptionTypeCompanion read;
    public volatile r8lambdavXWQ89TxHQ24MnxQcigE5jRzS1E serializer;

    public final Iterable IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.isEmpty() ? DisposableSaveableStateRegistry_androidKt.write : this.MediaBrowserCompatMediaItem.entrySet();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[SYNTHETIC] */
    public final int RemoteActionCompatParcelizer(Comparable comparable) {
        int i;
        int iCompareTo;
        int size = this.RemoteActionCompatParcelizer.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                i = (size + i2) / 2;
                iCompareTo = comparable.compareTo(((canBeSavedToBundle) this.RemoteActionCompatParcelizer.get(i)).serializer());
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
            int iCompareTo2 = comparable.compareTo(((canBeSavedToBundle) this.RemoteActionCompatParcelizer.get(i2)).serializer());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                    i = (size + i2) / 2;
                    iCompareTo = comparable.compareTo(((canBeSavedToBundle) this.RemoteActionCompatParcelizer.get(i)).serializer());
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
        return RemoteActionCompatParcelizer(comparable) >= 0 || this.MediaBrowserCompatMediaItem.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        return iRemoteActionCompatParcelizer >= 0 ? ((canBeSavedToBundle) this.RemoteActionCompatParcelizer.get(iRemoteActionCompatParcelizer)).getValue() : this.MediaBrowserCompatMediaItem.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.RemoteActionCompatParcelizer.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((canBeSavedToBundle) this.RemoteActionCompatParcelizer.get(i)).hashCode();
        }
        return this.MediaBrowserCompatMediaItem.size() > 0 ? this.MediaBrowserCompatMediaItem.hashCode() + iHashCode : iHashCode;
    }

    public final Map.Entry serializer(int i) {
        return (Map.Entry) this.RemoteActionCompatParcelizer.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.MediaBrowserCompatMediaItem.size() + this.RemoteActionCompatParcelizer.size();
    }

    public performSave(int i) {
        this.RatingCompat = i;
        Map map = Collections.EMPTY_MAP;
        this.MediaBrowserCompatMediaItem = map;
        this.MediaDescriptionCompat = map;
    }

    public final Object IconCompatParcelizer(int i) {
        RemoteActionCompatParcelizer();
        Object value = ((canBeSavedToBundle) this.RemoteActionCompatParcelizer.remove(i)).getValue();
        if (!this.MediaBrowserCompatMediaItem.isEmpty()) {
            Iterator it = read().entrySet().iterator();
            this.RemoteActionCompatParcelizer.add(new canBeSavedToBundle(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        RemoteActionCompatParcelizer();
        if (!this.RemoteActionCompatParcelizer.isEmpty()) {
            this.RemoteActionCompatParcelizer.clear();
        }
        if (this.MediaBrowserCompatMediaItem.isEmpty()) {
            return;
        }
        this.MediaBrowserCompatMediaItem.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof performSave)) {
            return super.equals(obj);
        }
        performSave performsave = (performSave) obj;
        int size = size();
        if (size == performsave.size()) {
            int size2 = this.RemoteActionCompatParcelizer.size();
            if (size2 != performsave.RemoteActionCompatParcelizer.size()) {
                return ((AbstractSet) entrySet()).equals(performsave.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (serializer(i).equals(performsave.serializer(i))) {
                }
            }
            if (size2 != size) {
                return this.MediaBrowserCompatMediaItem.equals(performsave.MediaBrowserCompatMediaItem);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        if (iRemoteActionCompatParcelizer >= 0) {
            return ((canBeSavedToBundle) this.RemoteActionCompatParcelizer.get(iRemoteActionCompatParcelizer)).setValue(obj);
        }
        RemoteActionCompatParcelizer();
        boolean zIsEmpty = this.RemoteActionCompatParcelizer.isEmpty();
        int i = this.RatingCompat;
        if (zIsEmpty && !(this.RemoteActionCompatParcelizer instanceof ArrayList)) {
            this.RemoteActionCompatParcelizer = new ArrayList(i);
        }
        int i2 = -(iRemoteActionCompatParcelizer + 1);
        if (i2 >= i) {
            return read().put(comparable, obj);
        }
        if (this.RemoteActionCompatParcelizer.size() == i) {
            canBeSavedToBundle canbesavedtobundle = (canBeSavedToBundle) this.RemoteActionCompatParcelizer.remove(i - 1);
            read().put(canbesavedtobundle.serializer(), canbesavedtobundle.getValue());
        }
        this.RemoteActionCompatParcelizer.add(i2, new canBeSavedToBundle(this, comparable, obj));
        return null;
    }

    public final SortedMap read() {
        RemoteActionCompatParcelizer();
        if (this.MediaBrowserCompatMediaItem.isEmpty() && !(this.MediaBrowserCompatMediaItem instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.MediaBrowserCompatMediaItem = treeMap;
            this.MediaDescriptionCompat = treeMap.descendingMap();
        }
        return (SortedMap) this.MediaBrowserCompatMediaItem;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        RemoteActionCompatParcelizer();
        Comparable comparable = (Comparable) obj;
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(comparable);
        if (iRemoteActionCompatParcelizer >= 0) {
            return IconCompatParcelizer(iRemoteActionCompatParcelizer);
        }
        if (this.MediaBrowserCompatMediaItem.isEmpty()) {
            return null;
        }
        return this.MediaBrowserCompatMediaItem.remove(comparable);
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            getAlignmentLinesMap.write();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.read == null) {
            this.read = new NotificationSubscriptionTypeCompanion(this, 3);
        }
        return this.read;
    }
}

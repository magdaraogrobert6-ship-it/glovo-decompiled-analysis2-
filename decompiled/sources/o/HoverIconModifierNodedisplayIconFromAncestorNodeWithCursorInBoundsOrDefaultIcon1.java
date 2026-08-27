package o;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class HoverIconModifierNodedisplayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon1 extends AbstractMap implements Serializable {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public transient Object[] IconCompatParcelizer;
    public transient int MediaBrowserCompatMediaItem = Math.min(Math.max(12, 1), 1073741823);
    public transient getFillHeightannotations MediaDescriptionCompat;
    public transient onCancelPointerInput MediaMetadataCompat;
    public transient int MediaSessionCompatQueueItem;
    public transient onCancelPointerInput RatingCompat;
    public transient int[] read;
    public transient Object serializer;
    public transient Object[] write;

    public final boolean IconCompatParcelizer() {
        return this.serializer == null;
    }

    public final int MediaSessionCompatQueueItem() {
        return (1 << (this.MediaBrowserCompatMediaItem & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Map RemoteActionCompatParcelizer() {
        Object obj = this.serializer;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Object[] read() {
        Object[] objArr = this.IconCompatParcelizer;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] serializer() {
        Object[] objArr = this.write;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int write(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objIconCompatParcelizer = FwFDataQueriesdeleteItem1.IconCompatParcelizer(i2);
        if (i4 != 0) {
            FwFDataQueriesdeleteItem1.write(i3 & i5, i4 + 1, objIconCompatParcelizer);
        }
        Object obj = this.serializer;
        Objects.requireNonNull(obj);
        int[] iArrWrite = write();
        for (int i6 = 0; i6 <= i; i6++) {
            int iIconCompatParcelizer = FwFDataQueriesdeleteItem1.IconCompatParcelizer(i6, obj);
            while (iIconCompatParcelizer != 0) {
                int i7 = iIconCompatParcelizer - 1;
                int i8 = iArrWrite[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iIconCompatParcelizer2 = FwFDataQueriesdeleteItem1.IconCompatParcelizer(i10, objIconCompatParcelizer);
                FwFDataQueriesdeleteItem1.write(i10, iIconCompatParcelizer, objIconCompatParcelizer);
                iArrWrite[i7] = ((~i5) & i9) | (iIconCompatParcelizer2 & i5);
                iIconCompatParcelizer = i8 & i;
            }
        }
        this.serializer = objIconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.MediaBrowserCompatMediaItem & (-32));
        return i5;
    }

    public final void write(int i, int i2) {
        Object obj = this.serializer;
        Objects.requireNonNull(obj);
        int[] iArrWrite = write();
        Object[] objArr = read();
        Object[] objArrSerializer = serializer();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArrSerializer[i] = null;
            iArrWrite[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArrSerializer[i] = objArrSerializer[i3];
        objArr[i3] = null;
        objArrSerializer[i3] = null;
        iArrWrite[i] = iArrWrite[i3];
        iArrWrite[i3] = 0;
        int i5 = ApproachMeasureScope.read(obj2) & i2;
        int iIconCompatParcelizer = FwFDataQueriesdeleteItem1.IconCompatParcelizer(i5, obj);
        if (iIconCompatParcelizer == size) {
            FwFDataQueriesdeleteItem1.write(i5, i4, obj);
            return;
        }
        while (true) {
            int i6 = iIconCompatParcelizer - 1;
            int i7 = iArrWrite[i6];
            int i8 = i7 & i2;
            if (i8 == size) {
                iArrWrite[i6] = (i7 & (~i2)) | (i2 & i4);
                return;
            }
            iIconCompatParcelizer = i8;
        }
    }

    public final int[] write() {
        int[] iArr = this.read;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.containsKey(obj);
        }
        return RemoteActionCompatParcelizer(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.get(obj);
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        if (iRemoteActionCompatParcelizer == -1) {
            return null;
        }
        return serializer()[iRemoteActionCompatParcelizer];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (IconCompatParcelizer()) {
            TuplesKt.RemoteActionCompatParcelizer(503622116, getSelectionEndui_text.IconCompatParcelizer(), new Object[]{"Arrays already allocated", Boolean.valueOf(IconCompatParcelizer())}, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -503622113);
            int i = this.MediaBrowserCompatMediaItem;
            int iMax = Math.max(i + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.serializer = FwFDataQueriesdeleteItem1.IconCompatParcelizer(iMax2);
            this.MediaBrowserCompatMediaItem = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.MediaBrowserCompatMediaItem & (-32));
            this.read = new int[i];
            this.IconCompatParcelizer = new Object[i];
            this.write = new Object[i];
        }
        Map mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.put(obj, obj2);
        }
        int[] iArrWrite = write();
        Object[] objArr = read();
        Object[] objArrSerializer = serializer();
        int i2 = this.MediaSessionCompatQueueItem;
        int i3 = i2 + 1;
        int i4 = ApproachMeasureScope.read(obj);
        int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        int i5 = i4 & iMediaSessionCompatQueueItem;
        Object obj3 = this.serializer;
        Objects.requireNonNull(obj3);
        int iIconCompatParcelizer = FwFDataQueriesdeleteItem1.IconCompatParcelizer(i5, obj3);
        if (iIconCompatParcelizer != 0) {
            int i6 = ~iMediaSessionCompatQueueItem;
            int i7 = 0;
            while (true) {
                int i8 = iIconCompatParcelizer - 1;
                int i9 = iArrWrite[i8];
                int i10 = i9 & i6;
                if (i10 == (i4 & i6) && FeatureFlagProvider.write(obj, objArr[i8])) {
                    Object obj4 = objArrSerializer[i8];
                    objArrSerializer[i8] = obj2;
                    return obj4;
                }
                int i11 = i9 & iMediaSessionCompatQueueItem;
                int i12 = i7 + 1;
                if (i11 != 0) {
                    i7 = i12;
                    iIconCompatParcelizer = i11;
                } else {
                    if (i12 < 9) {
                        if (i3 > iMediaSessionCompatQueueItem) {
                            iMediaSessionCompatQueueItem = write(iMediaSessionCompatQueueItem, (iMediaSessionCompatQueueItem + 1) * (iMediaSessionCompatQueueItem < 32 ? 4 : 2), i4, i2);
                            break;
                        }
                        iArrWrite[i8] = (i3 & iMediaSessionCompatQueueItem) | i10;
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(MediaSessionCompatQueueItem() + 1, 1.0f);
                    if (!isEmpty()) {
                        int i13 = -1;
                        while (i13 >= 0) {
                            linkedHashMap.put(read()[i13], serializer()[i13]);
                            int i14 = i13 + 1;
                            i13 = i14 < this.MediaSessionCompatQueueItem ? i14 : -1;
                        }
                        this.serializer = linkedHashMap;
                        this.read = null;
                        this.IconCompatParcelizer = null;
                        this.write = null;
                        this.MediaBrowserCompatMediaItem += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                }
            }
        } else if (i3 > iMediaSessionCompatQueueItem) {
            iMediaSessionCompatQueueItem = write(iMediaSessionCompatQueueItem, (iMediaSessionCompatQueueItem + 1) * (iMediaSessionCompatQueueItem < 32 ? 4 : 2), i4, i2);
        } else {
            Object obj5 = this.serializer;
            Objects.requireNonNull(obj5);
            FwFDataQueriesdeleteItem1.write(i5, i3, obj5);
        }
        int length = write().length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.read = Arrays.copyOf(write(), iMin);
            this.IconCompatParcelizer = Arrays.copyOf(read(), iMin);
            this.write = Arrays.copyOf(serializer(), iMin);
        }
        write()[i2] = (~iMediaSessionCompatQueueItem) & i4;
        read()[i2] = obj;
        serializer()[i2] = obj2;
        this.MediaSessionCompatQueueItem = i3;
        this.MediaBrowserCompatMediaItem += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.remove(obj);
        }
        Object objIconCompatParcelizer = IconCompatParcelizer(obj);
        if (objIconCompatParcelizer == RemoteActionCompatParcelizer) {
            return null;
        }
        return objIconCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        return mapRemoteActionCompatParcelizer != null ? mapRemoteActionCompatParcelizer.size() : this.MediaSessionCompatQueueItem;
    }

    public final Object IconCompatParcelizer(Object obj) {
        if (!IconCompatParcelizer()) {
            int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
            Object obj2 = this.serializer;
            Objects.requireNonNull(obj2);
            int iWrite = FwFDataQueriesdeleteItem1.write(obj, null, iMediaSessionCompatQueueItem, obj2, write(), read(), null);
            if (iWrite != -1) {
                Object obj3 = serializer()[iWrite];
                write(iWrite, iMediaSessionCompatQueueItem);
                this.MediaSessionCompatQueueItem--;
                this.MediaBrowserCompatMediaItem += 32;
                return obj3;
            }
        }
        return RemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (IconCompatParcelizer()) {
            return;
        }
        this.MediaBrowserCompatMediaItem += 32;
        Map mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            this.MediaBrowserCompatMediaItem = Math.min(Math.max(size(), 3), 1073741823);
            mapRemoteActionCompatParcelizer.clear();
            this.serializer = null;
            this.MediaSessionCompatQueueItem = 0;
            return;
        }
        Arrays.fill(read(), 0, this.MediaSessionCompatQueueItem, (Object) null);
        Arrays.fill(serializer(), 0, this.MediaSessionCompatQueueItem, (Object) null);
        Object obj = this.serializer;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(write(), 0, this.MediaSessionCompatQueueItem, 0);
        this.MediaSessionCompatQueueItem = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        onCancelPointerInput oncancelpointerinput = this.RatingCompat;
        if (oncancelpointerinput != null) {
            return oncancelpointerinput;
        }
        onCancelPointerInput oncancelpointerinput2 = new onCancelPointerInput(this, 0);
        this.RatingCompat = oncancelpointerinput2;
        return oncancelpointerinput2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        onCancelPointerInput oncancelpointerinput = this.MediaMetadataCompat;
        if (oncancelpointerinput != null) {
            return oncancelpointerinput;
        }
        onCancelPointerInput oncancelpointerinput2 = new onCancelPointerInput(this, 1);
        this.MediaMetadataCompat = oncancelpointerinput2;
        return oncancelpointerinput2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        getFillHeightannotations getfillheightannotations = this.MediaDescriptionCompat;
        if (getfillheightannotations != null) {
            return getfillheightannotations;
        }
        getFillHeightannotations getfillheightannotations2 = new getFillHeightannotations(this, 1);
        this.MediaDescriptionCompat = getfillheightannotations2;
        return getfillheightannotations2;
    }

    public final int RemoteActionCompatParcelizer(Object obj) {
        if (IconCompatParcelizer()) {
            return -1;
        }
        int i = ApproachMeasureScope.read(obj);
        int iMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        Object obj2 = this.serializer;
        Objects.requireNonNull(obj2);
        int iIconCompatParcelizer = FwFDataQueriesdeleteItem1.IconCompatParcelizer(i & iMediaSessionCompatQueueItem, obj2);
        if (iIconCompatParcelizer != 0) {
            int i2 = ~iMediaSessionCompatQueueItem;
            do {
                int i3 = iIconCompatParcelizer - 1;
                int i4 = write()[i3];
                if ((i4 & i2) == (i & i2) && FeatureFlagProvider.write(obj, read()[i3])) {
                    return i3;
                }
                iIconCompatParcelizer = i4 & iMediaSessionCompatQueueItem;
            } while (iIconCompatParcelizer != 0);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer != null) {
            return mapRemoteActionCompatParcelizer.containsValue(obj);
        }
        for (int i = 0; i < this.MediaSessionCompatQueueItem; i++) {
            if (FeatureFlagProvider.write(obj, serializer()[i])) {
                return true;
            }
        }
        return false;
    }
}

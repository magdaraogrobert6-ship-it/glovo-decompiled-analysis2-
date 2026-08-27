package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class getFillWidthannotations extends AbstractMap implements Serializable {
    public static final Object write = new Object();
    public transient int[] IconCompatParcelizer;
    public transient getFillHeightannotations MediaBrowserCompatMediaItem;
    public transient int MediaDescriptionCompat;
    public transient ComposableSingletonsSubcomposeLayoutKtlambda6412008091 MediaMetadataCompat;
    public transient ComposableSingletonsSubcomposeLayoutKtlambda6412008091 MediaSessionCompatQueueItem;
    public transient int RatingCompat = Math.min(Math.max(12, 1), 1073741823);
    public transient Object RemoteActionCompatParcelizer;
    public transient Object[] read;
    public transient Object[] serializer;

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int read() {
        return (1 << (this.RatingCompat & 31)) - 1;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        Object obj = this.RemoteActionCompatParcelizer;
        obj.getClass();
        int[] iArr = this.IconCompatParcelizer;
        iArr.getClass();
        Object[] objArr = this.read;
        objArr.getClass();
        Object[] objArr2 = this.serializer;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
        iArr[i] = iArr[i3];
        iArr[i3] = 0;
        int iSerializer = getFillBoundsannotations.serializer(obj2) & i2;
        int iIconCompatParcelizer = ContentScaleCompanion.IconCompatParcelizer(iSerializer, obj);
        if (iIconCompatParcelizer == size) {
            ContentScaleCompanion.write(iSerializer, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iIconCompatParcelizer - 1;
            int i5 = iArr[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArr[i4] = ((i + 1) & i2) | (i5 & (~i2));
                return;
            }
            iIconCompatParcelizer = i6;
        }
    }

    public final Map serializer() {
        Object obj = this.RemoteActionCompatParcelizer;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapSerializer = serializer();
        if (mapSerializer != null) {
            return mapSerializer.containsKey(obj);
        }
        return read(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapSerializer = serializer();
        if (mapSerializer != null) {
            return mapSerializer.get(obj);
        }
        int i = read(obj);
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.serializer;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        if (RemoteActionCompatParcelizer()) {
            if (RemoteActionCompatParcelizer()) {
                int i = this.RatingCompat;
                int iMax = Math.max(i + 1, 2);
                int iHighestOneBit = Integer.highestOneBit(iMax);
                if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                    iHighestOneBit = 1073741824;
                }
                int iMax2 = Math.max(4, iHighestOneBit);
                this.RemoteActionCompatParcelizer = ContentScaleCompanion.read(iMax2);
                this.RatingCompat = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.RatingCompat & (-32));
                this.IconCompatParcelizer = new int[i];
                this.read = new Object[i];
                this.serializer = new Object[i];
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Arrays already allocated");
                return null;
            }
        }
        Map mapSerializer = serializer();
        if (mapSerializer != null) {
            return mapSerializer.put(obj, obj2);
        }
        int[] iArr = this.IconCompatParcelizer;
        iArr.getClass();
        Object[] objArr = this.read;
        objArr.getClass();
        Object[] objArr2 = this.serializer;
        objArr2.getClass();
        int i2 = this.MediaDescriptionCompat;
        int i3 = i2 + 1;
        int iSerializer = getFillBoundsannotations.serializer(obj);
        int iSerializer2 = read();
        int i4 = iSerializer & iSerializer2;
        Object obj3 = this.RemoteActionCompatParcelizer;
        obj3.getClass();
        int iIconCompatParcelizer = ContentScaleCompanion.IconCompatParcelizer(i4, obj3);
        if (iIconCompatParcelizer != 0) {
            int i5 = ~iSerializer2;
            int i6 = 0;
            while (true) {
                int i7 = iIconCompatParcelizer - 1;
                int i8 = iArr[i7];
                int i9 = i8 & i5;
                if (i9 == (iSerializer & i5) && decodeInitialData.write(obj, objArr[i7])) {
                    Object obj4 = objArr2[i7];
                    objArr2[i7] = obj2;
                    return obj4;
                }
                int i10 = i8 & iSerializer2;
                int i11 = i6 + 1;
                if (i10 != 0) {
                    i6 = i11;
                    iIconCompatParcelizer = i10;
                } else {
                    if (i11 < 9) {
                        if (i3 > iSerializer2) {
                            iSerializer2 = serializer(iSerializer2, (iSerializer2 + 1) * (iSerializer2 < 32 ? 4 : 2), iSerializer, i2);
                            break;
                        }
                        iArr[i7] = i9 | (i3 & iSerializer2);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(read() + 1, 1.0f);
                    if (!isEmpty()) {
                        int i12 = -1;
                        while (i12 >= 0) {
                            Object[] objArr3 = this.read;
                            objArr3.getClass();
                            Object obj5 = objArr3[i12];
                            Object[] objArr4 = this.serializer;
                            objArr4.getClass();
                            linkedHashMap.put(obj5, objArr4[i12]);
                            int i13 = i12 + 1;
                            i12 = i13 < this.MediaDescriptionCompat ? i13 : -1;
                        }
                        this.RemoteActionCompatParcelizer = linkedHashMap;
                        this.IconCompatParcelizer = null;
                        this.read = null;
                        this.serializer = null;
                        this.RatingCompat += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                }
            }
        } else if (i3 > iSerializer2) {
            iSerializer2 = serializer(iSerializer2, (iSerializer2 + 1) * (iSerializer2 < 32 ? 4 : 2), iSerializer, i2);
        } else {
            Object obj6 = this.RemoteActionCompatParcelizer;
            obj6.getClass();
            ContentScaleCompanion.write(i4, i3, obj6);
        }
        int[] iArr2 = this.IconCompatParcelizer;
        iArr2.getClass();
        int length = iArr2.length;
        if (i3 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            int[] iArr3 = this.IconCompatParcelizer;
            iArr3.getClass();
            this.IconCompatParcelizer = Arrays.copyOf(iArr3, iMin);
            Object[] objArr5 = this.read;
            objArr5.getClass();
            this.read = Arrays.copyOf(objArr5, iMin);
            Object[] objArr6 = this.serializer;
            objArr6.getClass();
            this.serializer = Arrays.copyOf(objArr6, iMin);
        }
        int[] iArr4 = this.IconCompatParcelizer;
        iArr4.getClass();
        iArr4[i2] = (~iSerializer2) & iSerializer;
        Object[] objArr7 = this.read;
        objArr7.getClass();
        objArr7[i2] = obj;
        Object[] objArr8 = this.serializer;
        objArr8.getClass();
        objArr8[i2] = obj2;
        this.MediaDescriptionCompat = i3;
        this.RatingCompat += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapSerializer = serializer();
        if (mapSerializer != null) {
            return mapSerializer.remove(obj);
        }
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(obj);
        if (objRemoteActionCompatParcelizer == write) {
            return null;
        }
        return objRemoteActionCompatParcelizer;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapSerializer = serializer();
        return mapSerializer != null ? mapSerializer.size() : this.MediaDescriptionCompat;
    }

    public final Object RemoteActionCompatParcelizer(Object obj) {
        if (!RemoteActionCompatParcelizer()) {
            int i = read();
            Object obj2 = this.RemoteActionCompatParcelizer;
            obj2.getClass();
            int[] iArr = this.IconCompatParcelizer;
            iArr.getClass();
            Object[] objArr = this.read;
            objArr.getClass();
            int iSerializer = ContentScaleCompanion.serializer(obj, null, i, obj2, iArr, objArr, null);
            if (iSerializer != -1) {
                Object[] objArr2 = this.serializer;
                objArr2.getClass();
                Object obj3 = objArr2[iSerializer];
                RemoteActionCompatParcelizer(iSerializer, i);
                this.MediaDescriptionCompat--;
                this.RatingCompat += 32;
                return obj3;
            }
        }
        return write;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (RemoteActionCompatParcelizer()) {
            return;
        }
        this.RatingCompat += 32;
        Map mapSerializer = serializer();
        if (mapSerializer != null) {
            this.RatingCompat = Math.min(Math.max(size(), 3), 1073741823);
            mapSerializer.clear();
            this.RemoteActionCompatParcelizer = null;
            this.MediaDescriptionCompat = 0;
            return;
        }
        Object[] objArr = this.read;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.MediaDescriptionCompat, (Object) null);
        Object[] objArr2 = this.serializer;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.MediaDescriptionCompat, (Object) null);
        Object obj = this.RemoteActionCompatParcelizer;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.IconCompatParcelizer;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.MediaDescriptionCompat, 0);
        this.MediaDescriptionCompat = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ComposableSingletonsSubcomposeLayoutKtlambda6412008091 composableSingletonsSubcomposeLayoutKtlambda6412008091 = this.MediaSessionCompatQueueItem;
        if (composableSingletonsSubcomposeLayoutKtlambda6412008091 != null) {
            return composableSingletonsSubcomposeLayoutKtlambda6412008091;
        }
        ComposableSingletonsSubcomposeLayoutKtlambda6412008091 composableSingletonsSubcomposeLayoutKtlambda6412008092 = new ComposableSingletonsSubcomposeLayoutKtlambda6412008091(this, 0);
        this.MediaSessionCompatQueueItem = composableSingletonsSubcomposeLayoutKtlambda6412008092;
        return composableSingletonsSubcomposeLayoutKtlambda6412008092;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ComposableSingletonsSubcomposeLayoutKtlambda6412008091 composableSingletonsSubcomposeLayoutKtlambda6412008091 = this.MediaMetadataCompat;
        if (composableSingletonsSubcomposeLayoutKtlambda6412008091 != null) {
            return composableSingletonsSubcomposeLayoutKtlambda6412008091;
        }
        ComposableSingletonsSubcomposeLayoutKtlambda6412008091 composableSingletonsSubcomposeLayoutKtlambda6412008092 = new ComposableSingletonsSubcomposeLayoutKtlambda6412008091(this, 1);
        this.MediaMetadataCompat = composableSingletonsSubcomposeLayoutKtlambda6412008092;
        return composableSingletonsSubcomposeLayoutKtlambda6412008092;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        getFillHeightannotations getfillheightannotations = this.MediaBrowserCompatMediaItem;
        if (getfillheightannotations != null) {
            return getfillheightannotations;
        }
        getFillHeightannotations getfillheightannotations2 = new getFillHeightannotations(this, 0);
        this.MediaBrowserCompatMediaItem = getfillheightannotations2;
        return getfillheightannotations2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapSerializer = serializer();
        if (mapSerializer != null) {
            return mapSerializer.containsValue(obj);
        }
        for (int i = 0; i < this.MediaDescriptionCompat; i++) {
            Object[] objArr = this.serializer;
            objArr.getClass();
            if (decodeInitialData.write(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    public final int read(Object obj) {
        if (RemoteActionCompatParcelizer()) {
            return -1;
        }
        int iSerializer = getFillBoundsannotations.serializer(obj);
        int i = read();
        Object obj2 = this.RemoteActionCompatParcelizer;
        obj2.getClass();
        int iIconCompatParcelizer = ContentScaleCompanion.IconCompatParcelizer(iSerializer & i, obj2);
        if (iIconCompatParcelizer != 0) {
            int i2 = ~i;
            do {
                int i3 = iIconCompatParcelizer - 1;
                int[] iArr = this.IconCompatParcelizer;
                iArr.getClass();
                int i4 = iArr[i3];
                if ((i4 & i2) == (iSerializer & i2)) {
                    Object[] objArr = this.read;
                    objArr.getClass();
                    if (decodeInitialData.write(obj, objArr[i3])) {
                        return i3;
                    }
                }
                iIconCompatParcelizer = i4 & i;
            } while (iIconCompatParcelizer != 0);
        }
        return -1;
    }

    public final int serializer(int i, int i2, int i3, int i4) {
        Object obj = ContentScaleCompanion.read(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ContentScaleCompanion.write(i3 & i5, i4 + 1, obj);
        }
        Object obj2 = this.RemoteActionCompatParcelizer;
        obj2.getClass();
        int[] iArr = this.IconCompatParcelizer;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int iIconCompatParcelizer = ContentScaleCompanion.IconCompatParcelizer(i6, obj2);
            while (iIconCompatParcelizer != 0) {
                int i7 = iIconCompatParcelizer - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iIconCompatParcelizer2 = ContentScaleCompanion.IconCompatParcelizer(i10, obj);
                ContentScaleCompanion.write(i10, iIconCompatParcelizer, obj);
                iArr[i7] = ((~i5) & i9) | (iIconCompatParcelizer2 & i5);
                iIconCompatParcelizer = i8 & i;
            }
        }
        this.RemoteActionCompatParcelizer = obj;
        this.RatingCompat = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.RatingCompat & (-32));
        return i5;
    }
}

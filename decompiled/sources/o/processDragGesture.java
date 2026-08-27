package o;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class processDragGesture {
    public Object[] IconCompatParcelizer;
    public int MediaMetadataCompat;
    public int[] RemoteActionCompatParcelizer;

    public boolean containsKey(Object obj) {
        return IconCompatParcelizer(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return write(obj) >= 0;
    }

    public final boolean isEmpty() {
        return this.MediaMetadataCompat <= 0;
    }

    public final int size() {
        return this.MediaMetadataCompat;
    }

    public final int IconCompatParcelizer(Object obj) {
        return obj == null ? write() : read(obj.hashCode(), obj);
    }

    public final Object IconCompatParcelizer(int i) {
        if (i >= 0 && i < this.MediaMetadataCompat) {
            return this.IconCompatParcelizer[i << 1];
        }
        ForEachGestureKt.IconCompatParcelizer("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void RemoteActionCompatParcelizer(ImageKt imageKt) {
        int i = imageKt.MediaMetadataCompat;
        serializer(this.MediaMetadataCompat + i);
        if (this.MediaMetadataCompat != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(imageKt.IconCompatParcelizer(i2), imageKt.write(i2));
            }
        } else if (i > 0) {
            onContentCardClicked.IconCompatParcelizer(imageKt.RemoteActionCompatParcelizer, 0, this.RemoteActionCompatParcelizer, 0, i);
            onContentCardClicked.write(0, 0, i << 1, imageKt.IconCompatParcelizer, this.IconCompatParcelizer);
            this.MediaMetadataCompat = i;
        }
    }

    public int hashCode() {
        int[] iArr = this.RemoteActionCompatParcelizer;
        Object[] objArr = this.IconCompatParcelizer;
        int i = this.MediaMetadataCompat;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final void serializer(int i) {
        int i2 = this.MediaMetadataCompat;
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (iArr.length < i) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, i);
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i * 2);
        }
        if (this.MediaMetadataCompat == i2) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    public final Object write(int i) {
        if (i >= 0 && i < this.MediaMetadataCompat) {
            return this.IconCompatParcelizer[(i << 1) + 1];
        }
        ForEachGestureKt.IconCompatParcelizer("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public Object write(int i, Object obj) {
        if (i < 0 || i >= this.MediaMetadataCompat) {
            ForEachGestureKt.IconCompatParcelizer("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.IconCompatParcelizer;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object RemoteActionCompatParcelizer(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.MediaMetadataCompat)) {
            Object[] objArr = this.IconCompatParcelizer;
            int i3 = i << 1;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
                return obj;
            }
            int i4 = i2 - 1;
            int[] iArr = this.RemoteActionCompatParcelizer;
            if (iArr.length > 8 && i2 < iArr.length / 3) {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, i5);
                this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i5 << 1);
                if (i2 != this.MediaMetadataCompat) {
                    PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
                    return null;
                }
                if (i > 0) {
                    onContentCardClicked.IconCompatParcelizer(iArr, 0, this.RemoteActionCompatParcelizer, 0, i);
                    onContentCardClicked.write(0, 0, i3, objArr, this.IconCompatParcelizer);
                }
                if (i < i4) {
                    int i6 = i + 1;
                    onContentCardClicked.IconCompatParcelizer(iArr, i, this.RemoteActionCompatParcelizer, i6, i2);
                    onContentCardClicked.write(i3, i6 << 1, i2 << 1, objArr, this.IconCompatParcelizer);
                }
            } else {
                if (i < i4) {
                    int i7 = i + 1;
                    onContentCardClicked.IconCompatParcelizer(iArr, i, iArr, i7, i2);
                    Object[] objArr2 = this.IconCompatParcelizer;
                    onContentCardClicked.write(i3, i7 << 1, i2 << 1, objArr2, objArr2);
                }
                Object[] objArr3 = this.IconCompatParcelizer;
                int i8 = i4 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            }
            if (i2 == this.MediaMetadataCompat) {
                this.MediaMetadataCompat = i4;
                return obj;
            }
            PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
            return null;
        }
        ForEachGestureKt.IconCompatParcelizer("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    public void clear() {
        if (this.MediaMetadataCompat > 0) {
            this.RemoteActionCompatParcelizer = DragGestureNodestartListeningForEvents1.serializer;
            this.IconCompatParcelizer = DragGestureNodestartListeningForEvents1.IconCompatParcelizer;
            this.MediaMetadataCompat = 0;
        }
        if (this.MediaMetadataCompat <= 0) {
            return;
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
    }

    public Object put(Object obj, Object obj2) {
        int i = this.MediaMetadataCompat;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iWrite = obj != null ? read(iHashCode, obj) : write();
        if (iWrite >= 0) {
            int i2 = (iWrite << 1) + 1;
            Object[] objArr = this.IconCompatParcelizer;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iWrite;
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.RemoteActionCompatParcelizer = Arrays.copyOf(iArr, i4);
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, i4 << 1);
            if (i != this.MediaMetadataCompat) {
                PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.RemoteActionCompatParcelizer;
            int i5 = i3 + 1;
            onContentCardClicked.IconCompatParcelizer(iArr2, i5, iArr2, i3, i);
            Object[] objArr2 = this.IconCompatParcelizer;
            onContentCardClicked.write(i5 << 1, i3 << 1, this.MediaMetadataCompat << 1, objArr2, objArr2);
        }
        int i6 = this.MediaMetadataCompat;
        if (i == i6) {
            int[] iArr3 = this.RemoteActionCompatParcelizer;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.IconCompatParcelizer;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.MediaMetadataCompat = i6 + 1;
                return null;
            }
        }
        PlatformMagnifierFactoryApi29Impl.IconCompatParcelizer();
        return null;
    }

    public final int write(Object obj) {
        int i = this.MediaMetadataCompat * 2;
        Object[] objArr = this.IconCompatParcelizer;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public processDragGesture(int i) {
        this.RemoteActionCompatParcelizer = i == 0 ? DragGestureNodestartListeningForEvents1.serializer : new int[i];
        this.IconCompatParcelizer = i == 0 ? DragGestureNodestartListeningForEvents1.IconCompatParcelizer : new Object[i << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof processDragGesture) {
                int i = this.MediaMetadataCompat;
                if (i != ((processDragGesture) obj).MediaMetadataCompat) {
                    return false;
                }
                processDragGesture processdraggesture = (processDragGesture) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objIconCompatParcelizer = IconCompatParcelizer(i2);
                    Object objWrite = write(i2);
                    Object obj2 = processdraggesture.get(objIconCompatParcelizer);
                    if (objWrite == null) {
                        if (obj2 != null || !processdraggesture.containsKey(objIconCompatParcelizer)) {
                            return false;
                        }
                    } else if (!objWrite.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.MediaMetadataCompat != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.MediaMetadataCompat;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objIconCompatParcelizer2 = IconCompatParcelizer(i4);
                Object objWrite2 = write(i4);
                Object obj3 = ((Map) obj).get(objIconCompatParcelizer2);
                if (objWrite2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objIconCompatParcelizer2)) {
                        return false;
                    }
                } else if (!objWrite2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iIconCompatParcelizer = IconCompatParcelizer(obj);
        if (iIconCompatParcelizer >= 0) {
            return this.IconCompatParcelizer[(iIconCompatParcelizer << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iIconCompatParcelizer = IconCompatParcelizer(obj);
        return iIconCompatParcelizer >= 0 ? this.IconCompatParcelizer[(iIconCompatParcelizer << 1) + 1] : obj2;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final int read(int i, Object obj) {
        int i2 = this.MediaMetadataCompat;
        if (i2 == 0) {
            return -1;
        }
        int iSerializer = DragGestureNodestartListeningForEvents1.serializer(this.RemoteActionCompatParcelizer, i2, i);
        if (iSerializer >= 0) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.IconCompatParcelizer[iSerializer << 1]}, getCieXyz.write())).booleanValue()) {
                int i3 = iSerializer + 1;
                while (i3 < i2 && this.RemoteActionCompatParcelizer[i3] == i) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.IconCompatParcelizer[i3 << 1]}, getCieXyz.write())).booleanValue()) {
                        return i3;
                    }
                    i3++;
                }
                for (int i4 = iSerializer - 1; i4 >= 0 && this.RemoteActionCompatParcelizer[i4] == i; i4--) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj, this.IconCompatParcelizer[i4 << 1]}, getCieXyz.write())).booleanValue()) {
                        return i4;
                    }
                }
                return ~i3;
            }
        }
        return iSerializer;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iIconCompatParcelizer = IconCompatParcelizer(obj);
        if (iIconCompatParcelizer < 0) {
            return false;
        }
        Object[] objArr = {obj2, write(iIconCompatParcelizer)};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        RemoteActionCompatParcelizer(iIconCompatParcelizer);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iIconCompatParcelizer = IconCompatParcelizer(obj);
        if (iIconCompatParcelizer < 0) {
            return false;
        }
        Object[] objArr = {obj2, write(iIconCompatParcelizer)};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        write(iIconCompatParcelizer, obj3);
        return true;
    }

    public final int write() {
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            return -1;
        }
        int iSerializer = DragGestureNodestartListeningForEvents1.serializer(this.RemoteActionCompatParcelizer, i, 0);
        if (iSerializer < 0 || this.IconCompatParcelizer[iSerializer << 1] == null) {
            return iSerializer;
        }
        int i2 = iSerializer + 1;
        while (i2 < i && this.RemoteActionCompatParcelizer[i2] == 0) {
            if (this.IconCompatParcelizer[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iSerializer - 1; i3 >= 0 && this.RemoteActionCompatParcelizer[i3] == 0; i3--) {
            if (this.IconCompatParcelizer[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.MediaMetadataCompat * 28);
        sb.append('{');
        int i = this.MediaMetadataCompat;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objIconCompatParcelizer = IconCompatParcelizer(i2);
            if (objIconCompatParcelizer != sb) {
                sb.append(objIconCompatParcelizer);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objWrite = write(i2);
            if (objWrite != sb) {
                sb.append(objWrite);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iIconCompatParcelizer = IconCompatParcelizer(obj);
        if (iIconCompatParcelizer >= 0) {
            return RemoteActionCompatParcelizer(iIconCompatParcelizer);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iIconCompatParcelizer = IconCompatParcelizer(obj);
        if (iIconCompatParcelizer >= 0) {
            return write(iIconCompatParcelizer, obj2);
        }
        return null;
    }
}

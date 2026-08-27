package com.squareup.moshi;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getLocalBitmaplambda3;
import o.getLocalBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonValueReader extends getDisplayHeightAndWidthPixels {
    public static final Object MediaBrowserCompatMediaItem = new Object();
    public Object[] MediaMetadataCompat;

    @Override // o.getDisplayHeightAndWidthPixels
    public final void MediaSessionCompatResultReceiverWrapper() {
        IconCompatParcelizer(Void.class, getLocalBitmaplambda3.NULL);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final boolean RatingCompat() {
        Boolean bool = (Boolean) IconCompatParcelizer(Boolean.class, getLocalBitmaplambda3.BOOLEAN);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        return bool.booleanValue();
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        int i = this.MediaDescriptionCompat;
        if (i == this.MediaMetadataCompat.length) {
            if (i == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(RemoteActionCompatParcelizer()), 0);
            }
            int[] iArr = this.read;
            this.read = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.IconCompatParcelizer;
            this.IconCompatParcelizer = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.serializer;
            this.serializer = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.MediaMetadataCompat;
            this.MediaMetadataCompat = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.MediaMetadataCompat;
        int i2 = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i2 + 1;
        objArr2[i2] = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.MediaMetadataCompat, 0, this.MediaDescriptionCompat, (Object) null);
        this.MediaMetadataCompat[0] = MediaBrowserCompatMediaItem;
        this.read[0] = 8;
        this.MediaDescriptionCompat = 1;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void read() {
        Map map = (Map) IconCompatParcelizer(Map.class, getLocalBitmaplambda3.BEGIN_OBJECT);
        getLocalBitmaplambda4 getlocalbitmaplambda4 = new getLocalBitmaplambda4(getLocalBitmaplambda3.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.MediaMetadataCompat;
        int i = this.MediaDescriptionCompat - 1;
        objArr[i] = getlocalbitmaplambda4;
        this.read[i] = 3;
        if (getlocalbitmaplambda4.hasNext()) {
            RemoteActionCompatParcelizer(getlocalbitmaplambda4.next());
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void serializer() {
        List list = (List) IconCompatParcelizer(List.class, getLocalBitmaplambda3.BEGIN_ARRAY);
        getLocalBitmaplambda4 getlocalbitmaplambda4 = new getLocalBitmaplambda4(getLocalBitmaplambda3.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.MediaMetadataCompat;
        int i = this.MediaDescriptionCompat - 1;
        objArr[i] = getlocalbitmaplambda4;
        this.read[i] = 1;
        this.serializer[i] = 0;
        if (getlocalbitmaplambda4.hasNext()) {
            RemoteActionCompatParcelizer(getlocalbitmaplambda4.next());
        }
    }

    public JsonValueReader(Object obj) {
        int[] iArr = this.read;
        int i = this.MediaDescriptionCompat;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.MediaMetadataCompat = objArr;
        this.MediaDescriptionCompat = i + 1;
        objArr[i] = obj;
    }

    public final String ComponentActivity() {
        getLocalBitmaplambda3 getlocalbitmaplambda3 = getLocalBitmaplambda3.NAME;
        Map.Entry entry = (Map.Entry) IconCompatParcelizer(Map.Entry.class, getlocalbitmaplambda3);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw write(key, getlocalbitmaplambda3);
        }
        String str = (String) key;
        this.MediaMetadataCompat[this.MediaDescriptionCompat - 1] = entry.getValue();
        this.IconCompatParcelizer[this.MediaDescriptionCompat - 2] = str;
        return str;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void IconCompatParcelizer() {
        getLocalBitmaplambda3 getlocalbitmaplambda3 = getLocalBitmaplambda3.END_OBJECT;
        getLocalBitmaplambda4 getlocalbitmaplambda4 = (getLocalBitmaplambda4) IconCompatParcelizer(getLocalBitmaplambda4.class, getlocalbitmaplambda3);
        if (getlocalbitmaplambda4.IconCompatParcelizer != getlocalbitmaplambda3 || getlocalbitmaplambda4.hasNext()) {
            throw write(getlocalbitmaplambda4, getlocalbitmaplambda3);
        }
        this.IconCompatParcelizer[this.MediaDescriptionCompat - 1] = null;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final long MediaDescriptionCompat() {
        long jLongValueExact;
        getLocalBitmaplambda3 getlocalbitmaplambda3 = getLocalBitmaplambda3.NUMBER;
        Object objIconCompatParcelizer = IconCompatParcelizer(Object.class, getlocalbitmaplambda3);
        if (objIconCompatParcelizer instanceof Number) {
            jLongValueExact = ((Number) objIconCompatParcelizer).longValue();
        } else {
            if (!(objIconCompatParcelizer instanceof String)) {
                throw write(objIconCompatParcelizer, getlocalbitmaplambda3);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objIconCompatParcelizer);
                } catch (NumberFormatException unused) {
                    throw write(objIconCompatParcelizer, getLocalBitmaplambda3.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objIconCompatParcelizer).longValueExact();
            }
        }
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        return jLongValueExact;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final double MediaMetadataCompat() throws JsonEncodingException {
        double dDoubleValue;
        getLocalBitmaplambda3 getlocalbitmaplambda3 = getLocalBitmaplambda3.NUMBER;
        Object objIconCompatParcelizer = IconCompatParcelizer(Object.class, getlocalbitmaplambda3);
        if (objIconCompatParcelizer instanceof Number) {
            dDoubleValue = ((Number) objIconCompatParcelizer).doubleValue();
        } else {
            if (!(objIconCompatParcelizer instanceof String)) {
                throw write(objIconCompatParcelizer, getlocalbitmaplambda3);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objIconCompatParcelizer);
            } catch (NumberFormatException unused) {
                throw write(objIconCompatParcelizer, getLocalBitmaplambda3.NUMBER);
            }
        }
        if (this.write || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            return dDoubleValue;
        }
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(dDoubleValue, "JSON forbids NaN and infinities: ", " at path ");
        sbM.append(RemoteActionCompatParcelizer());
        throw new JsonEncodingException(sbM.toString(), 0);
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final int MediaSessionCompatQueueItem() {
        int iIntValueExact;
        getLocalBitmaplambda3 getlocalbitmaplambda3 = getLocalBitmaplambda3.NUMBER;
        Object objIconCompatParcelizer = IconCompatParcelizer(Object.class, getlocalbitmaplambda3);
        if (objIconCompatParcelizer instanceof Number) {
            iIntValueExact = ((Number) objIconCompatParcelizer).intValue();
        } else {
            if (!(objIconCompatParcelizer instanceof String)) {
                throw write(objIconCompatParcelizer, getlocalbitmaplambda3);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objIconCompatParcelizer);
                } catch (NumberFormatException unused) {
                    throw write(objIconCompatParcelizer, getLocalBitmaplambda3.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objIconCompatParcelizer).intValueExact();
            }
        }
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
        return iIntValueExact;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final getLocalBitmaplambda3 MediaSessionCompatToken() {
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            return getLocalBitmaplambda3.END_DOCUMENT;
        }
        Object obj = this.MediaMetadataCompat[i - 1];
        if (obj instanceof getLocalBitmaplambda4) {
            return ((getLocalBitmaplambda4) obj).IconCompatParcelizer;
        }
        if (obj instanceof List) {
            return getLocalBitmaplambda3.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return getLocalBitmaplambda3.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return getLocalBitmaplambda3.NAME;
        }
        if (obj instanceof String) {
            return getLocalBitmaplambda3.STRING;
        }
        if (obj instanceof Boolean) {
            return getLocalBitmaplambda3.BOOLEAN;
        }
        if (obj instanceof Number) {
            return getLocalBitmaplambda3.NUMBER;
        }
        if (obj == null) {
            return getLocalBitmaplambda3.NULL;
        }
        if (obj != MediaBrowserCompatMediaItem) {
            throw write(obj, "a JSON value");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonReader is closed");
        return null;
    }

    public final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        int i = this.MediaDescriptionCompat;
        int i2 = i - 1;
        this.MediaDescriptionCompat = i2;
        Object[] objArr = this.MediaMetadataCompat;
        objArr[i2] = null;
        this.read[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.serializer;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i3];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    RemoteActionCompatParcelizer(it.next());
                }
            }
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        if (this.RemoteActionCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(MediaSessionCompatToken());
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            sb.append(" at ");
            sb.append(strRemoteActionCompatParcelizer);
            throw new JsonDataException(sb.toString(), 0);
        }
        int i = this.MediaDescriptionCompat;
        if (i > 1) {
            this.IconCompatParcelizer[i - 2] = "null";
        }
        Object obj = i != 0 ? this.MediaMetadataCompat[i - 1] : null;
        if (obj instanceof getLocalBitmaplambda4) {
            StringBuilder sb2 = new StringBuilder("Expected a value but was ");
            sb2.append(MediaSessionCompatToken());
            String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            sb2.append(" at path ");
            sb2.append(strRemoteActionCompatParcelizer2);
            throw new JsonDataException(sb2.toString(), 0);
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.MediaMetadataCompat;
            int i2 = i - 1;
            objArr[i2] = ((Map.Entry) objArr[i2]).getValue();
        } else {
            if (i > 0) {
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return;
            }
            StringBuilder sb3 = new StringBuilder("Expected a value but was ");
            sb3.append(MediaSessionCompatToken());
            String strRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
            sb3.append(" at path ");
            sb3.append(strRemoteActionCompatParcelizer3);
            throw new JsonDataException(sb3.toString(), 0);
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final int serializer(getLocalBitmap getlocalbitmap) {
        getLocalBitmaplambda3 getlocalbitmaplambda3 = getLocalBitmaplambda3.NAME;
        Map.Entry entry = (Map.Entry) IconCompatParcelizer(Map.Entry.class, getlocalbitmaplambda3);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw write(key, getlocalbitmaplambda3);
        }
        String str = (String) key;
        int length = getlocalbitmap.RemoteActionCompatParcelizer.length;
        for (int i = 0; i < length; i++) {
            if (getlocalbitmap.RemoteActionCompatParcelizer[i].equals(str)) {
                this.MediaMetadataCompat[this.MediaDescriptionCompat - 1] = entry.getValue();
                this.IconCompatParcelizer[this.MediaDescriptionCompat - 2] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final int write(getLocalBitmap getlocalbitmap) {
        int i = this.MediaDescriptionCompat;
        Object obj = i != 0 ? this.MediaMetadataCompat[i - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != MediaBrowserCompatMediaItem) {
                return -1;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonReader is closed");
            return 0;
        }
        String str = (String) obj;
        int length = getlocalbitmap.RemoteActionCompatParcelizer.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (getlocalbitmap.RemoteActionCompatParcelizer[i2].equals(str)) {
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
                return i2;
            }
        }
        return -1;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void write() {
        getLocalBitmaplambda3 getlocalbitmaplambda3 = getLocalBitmaplambda3.END_ARRAY;
        getLocalBitmaplambda4 getlocalbitmaplambda4 = (getLocalBitmaplambda4) IconCompatParcelizer(getLocalBitmaplambda4.class, getlocalbitmaplambda3);
        if (getlocalbitmaplambda4.IconCompatParcelizer != getlocalbitmaplambda3 || getlocalbitmaplambda4.hasNext()) {
            throw write(getlocalbitmaplambda4, getlocalbitmaplambda3);
        }
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
    }

    public final Object IconCompatParcelizer(Class cls, getLocalBitmaplambda3 getlocalbitmaplambda3) {
        int i = this.MediaDescriptionCompat;
        Object obj = i != 0 ? this.MediaMetadataCompat[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && getlocalbitmaplambda3 == getLocalBitmaplambda3.NULL) {
            return null;
        }
        if (obj != MediaBrowserCompatMediaItem) {
            throw write(obj, getlocalbitmaplambda3);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonReader is closed");
        return null;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final boolean MediaBrowserCompatMediaItem() {
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            return false;
        }
        Object obj = this.MediaMetadataCompat[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final String PlaybackStateCompat() {
        int i = this.MediaDescriptionCompat;
        Object obj = i != 0 ? this.MediaMetadataCompat[i - 1] : null;
        if (obj instanceof String) {
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            return (String) obj;
        }
        if (obj instanceof Number) {
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();
            return obj.toString();
        }
        if (obj != MediaBrowserCompatMediaItem) {
            throw write(obj, getLocalBitmaplambda3.STRING);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("JsonReader is closed");
        return null;
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void ParcelableVolumeInfo() {
        if (MediaBrowserCompatMediaItem()) {
            RemoteActionCompatParcelizer(ComponentActivity());
        }
    }

    @Override // o.getDisplayHeightAndWidthPixels
    public final void PlaybackStateCompatCustomAction() {
        if (!this.RemoteActionCompatParcelizer) {
            this.MediaMetadataCompat[this.MediaDescriptionCompat - 1] = ((Map.Entry) IconCompatParcelizer(Map.Entry.class, getLocalBitmaplambda3.NAME)).getValue();
            this.IconCompatParcelizer[this.MediaDescriptionCompat - 2] = "null";
            return;
        }
        getLocalBitmaplambda3 getlocalbitmaplambda3MediaSessionCompatToken = MediaSessionCompatToken();
        ComponentActivity();
        StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
        sb.append(getlocalbitmaplambda3MediaSessionCompatToken);
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        sb.append(" at ");
        sb.append(strRemoteActionCompatParcelizer);
        throw new JsonDataException(sb.toString(), 0);
    }
}

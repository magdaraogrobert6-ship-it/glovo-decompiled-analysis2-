package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdvertisingInfoObject extends getAppSetId {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final boolean IconCompatParcelizer;
    public final int MediaSessionCompatQueueItem;
    public final boolean RemoteActionCompatParcelizer;
    public final Long read;
    public final int serializer;
    public final boolean write;

    public getAdvertisingInfoObject(int i, int i2, boolean z, boolean z2, boolean z3, Long l) {
        this.MediaSessionCompatQueueItem = i;
        this.serializer = i2;
        this.IconCompatParcelizer = z;
        this.write = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.read = l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f A[PHI: r2 r3
  0x001f: PHI (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:8:0x001d, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]
  0x001f: PHI (r3v2 int) = (r3v1 int), (r3v4 int) binds: [B:8:0x001d, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    public static getAdvertisingInfoObject write(getAdvertisingInfoObject getadvertisinginfoobject, boolean z, boolean z2, boolean z3, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = MediaBrowserCompatMediaItem;
        int i7 = i6 + 75;
        MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            i2 = getadvertisinginfoobject.MediaSessionCompatQueueItem;
            i3 = getadvertisinginfoobject.serializer;
            if ((i & 4) != 0) {
                i4 = i6 + 91;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    boolean z4 = getadvertisinginfoobject.IconCompatParcelizer;
                    throw null;
                }
                z = getadvertisinginfoobject.IconCompatParcelizer;
            }
        } else {
            i2 = getadvertisinginfoobject.MediaSessionCompatQueueItem;
            i3 = getadvertisinginfoobject.serializer;
            if ((i & 4) != 0) {
                i4 = i6 + 91;
                MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    boolean z5 = getadvertisinginfoobject.IconCompatParcelizer;
                    throw null;
                }
                z = getadvertisinginfoobject.IconCompatParcelizer;
            }
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z2 = getadvertisinginfoobject.write;
        }
        Long l = getadvertisinginfoobject.read;
        getadvertisinginfoobject.getClass();
        getAdvertisingInfoObject getadvertisinginfoobject2 = new getAdvertisingInfoObject(i2, i3, z6, z2, z3, l);
        int i8 = MediaBrowserCompatMediaItem + 65;
        MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return getadvertisinginfoobject2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer, Integer.hashCode(this.MediaSessionCompatQueueItem) * 31, 31), 31, this.IconCompatParcelizer), 31, this.write), 31, this.RemoteActionCompatParcelizer);
        Long l = this.read;
        if (l == null) {
            int i2 = MediaMetadataCompat + 15;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = l.hashCode();
            int i4 = MediaBrowserCompatMediaItem + 29;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = iM + iHashCode;
        int i7 = MediaBrowserCompatMediaItem + 55;
        MediaMetadataCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return i6;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 35;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(this.MediaSessionCompatQueueItem, this.serializer, "Available(text=", ", description=", ", showDescription=");
        af$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", isShiftExtensionRequested=", this.write, ", isShiftExtensionToggleEnabled=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(", shiftId=");
        sbM.append(this.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 27;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 91;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof getAdvertisingInfoObject)) {
                return false;
            }
            getAdvertisingInfoObject getadvertisinginfoobject = (getAdvertisingInfoObject) obj;
            if (this.MediaSessionCompatQueueItem != getadvertisinginfoobject.MediaSessionCompatQueueItem || this.serializer != getadvertisinginfoobject.serializer) {
                return false;
            }
            if (this.IconCompatParcelizer != getadvertisinginfoobject.IconCompatParcelizer) {
                int i4 = i2 + 51;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (this.write != getadvertisinginfoobject.write || this.RemoteActionCompatParcelizer != getadvertisinginfoobject.RemoteActionCompatParcelizer) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getadvertisinginfoobject.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}

package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class startFirstSessionI {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final teardownEventMetadataS IconCompatParcelizer;
    public final String RatingCompat;
    public final double RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final double write;

    public startFirstSessionI(String str, String str2, String str3, teardownEventMetadataS teardowneventmetadatas, double d, double d2) {
        str.getClass();
        str2.getClass();
        this.serializer = str;
        this.read = str2;
        this.RatingCompat = str3;
        this.IconCompatParcelizer = teardowneventmetadatas;
        this.write = d;
        this.RemoteActionCompatParcelizer = d2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 89;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DeliveryLocationViewEntity(name=", this.serializer, ", address=", this.read, ", specialInstructions=");
        sbM.append(this.RatingCompat);
        sbM.append(", phone=REDACTED, latitude=");
        sbM.append(this.write);
        sbM.append(", longitude=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 107;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[PHI: r1 r4
  0x0039: PHI (r1v17 int) = (r1v7 int), (r1v21 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0039: PHI (r4v4 java.lang.String) = (r4v1 java.lang.String), (r4v7 java.lang.String) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r1
  0x0037: PHI (r1v8 int) = (r1v7 int), (r1v21 int) binds: [B:8:0x0035, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() >> 80, 104, this.read);
            str = this.RatingCompat;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.read);
            str = this.RatingCompat;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
        }
        teardownEventMetadataS teardowneventmetadatas = this.IconCompatParcelizer;
        if (teardowneventmetadatas != null) {
            iHashCode2 = teardowneventmetadatas.hashCode();
            int i3 = MediaMetadataCompat + 29;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        return Double.hashCode(this.RemoteActionCompatParcelizer) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, (((iM + iHashCode) * 31) + iHashCode2) * 31, 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaMetadataCompat + 67;
            MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof startFirstSessionI) {
            startFirstSessionI startfirstsessioni = (startFirstSessionI) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, startfirstsessioni.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, startfirstsessioni.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, startfirstsessioni.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, startfirstsessioni.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i4 = MediaMetadataCompat + 71;
                MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (Double.compare(this.write, startfirstsessioni.write) == 0) {
                return Double.compare(this.RemoteActionCompatParcelizer, startfirstsessioni.RemoteActionCompatParcelizer) == 0;
            }
            int i6 = MediaBrowserCompatMediaItem + 115;
            MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = MediaBrowserCompatMediaItem + 123;
        MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}

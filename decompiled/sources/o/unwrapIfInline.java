package o;

import android.net.Uri;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class unwrapIfInline implements ResourceFontHelper {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final getEnterjXw82LU read;
    public final String serializer;
    public final Uri write;

    public unwrapIfInline(getEnterjXw82LU getenterjxw82lu, String str, Uri uri, String str2, String str3, String str4) {
        getenterjxw82lu.getClass();
        str.getClass();
        this.read = getenterjxw82lu;
        this.RemoteActionCompatParcelizer = str;
        this.write = uri;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
        this.MediaDescriptionCompat = str4;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int iHashCode3 = this.write.hashCode();
        String str = this.serializer;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = MediaSessionCompatQueueItem + 85;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            int i4 = MediaMetadataCompat + 65;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.MediaDescriptionCompat;
        return ((((((iHashCode3 + iM) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("OpenSoftPos(item=");
        sb.append(this.read);
        sb.append(", taskId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", softPostDeeplink=");
        sb.append(this.write);
        sb.append(", acceptanceEndpoint=");
        sb.append(this.serializer);
        sb.append(", orderId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ", transactionId=", this.MediaDescriptionCompat, ")");
        int i2 = MediaSessionCompatQueueItem + 23;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 11;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this != obj) {
            if (!(obj instanceof unwrapIfInline)) {
                return false;
            }
            unwrapIfInline unwrapifinline = (unwrapIfInline) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, unwrapifinline.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, unwrapifinline.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!this.write.equals(unwrapifinline.write)) {
                int i3 = MediaMetadataCompat + 95;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, unwrapifinline.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, unwrapifinline.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, unwrapifinline.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}

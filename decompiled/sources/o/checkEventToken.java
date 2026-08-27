package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class checkEventToken {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final boolean IconCompatParcelizer;
    public final Calendar MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final Calendar serializer;
    public final getFailureResponseData write;

    public checkEventToken(getFailureResponseData getfailureresponsedata, String str, Calendar calendar, Calendar calendar2, boolean z, boolean z2) {
        getfailureresponsedata.getClass();
        this.write = getfailureresponsedata;
        this.RemoteActionCompatParcelizer = str;
        this.MediaMetadataCompat = calendar;
        this.serializer = calendar2;
        this.IconCompatParcelizer = z;
        this.read = z2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        int iHashCode = this.MediaMetadataCompat.hashCode();
        int iHashCode2 = Boolean.hashCode(this.read) + d$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + ((iHashCode + iM) * 31)) * 31, 31, this.IconCompatParcelizer);
        int i4 = RatingCompat + 23;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CurrentShift(riderStatus=");
        sb.append(this.write);
        sb.append(", area=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", startTime=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", endTime=");
        sb.append(this.serializer);
        sb.append(", extensionAvailable=");
        String strSerializer = MediaSessionCompatQueueItem.serializer(sb, this.IconCompatParcelizer, ", extensionRequested=", this.read, ")");
        int i2 = MediaBrowserCompatMediaItem + 63;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return strSerializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 27;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof checkEventToken)) {
            return false;
        }
        checkEventToken checkeventtoken = (checkEventToken) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, checkeventtoken.write}, getCieXyz.write())).booleanValue() || !this.RemoteActionCompatParcelizer.equals(checkeventtoken.RemoteActionCompatParcelizer) || !this.MediaMetadataCompat.equals(checkeventtoken.MediaMetadataCompat)) {
            return false;
        }
        if (this.serializer.equals(checkeventtoken.serializer)) {
            return this.IconCompatParcelizer == checkeventtoken.IconCompatParcelizer && this.read == checkeventtoken.read;
        }
        int i4 = MediaBrowserCompatMediaItem + 67;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}

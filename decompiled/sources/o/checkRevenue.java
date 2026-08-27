package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class checkRevenue {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final boolean IconCompatParcelizer;
    public final getFailureResponseData MediaBrowserCompatMediaItem;
    public final List RatingCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final AdjustEvent read;
    public final boolean serializer;
    public final checkEventToken write;

    public checkRevenue(getFailureResponseData getfailureresponsedata, checkEventToken checkeventtoken, AdjustEvent adjustEvent, boolean z, boolean z2, boolean z3, List list) {
        getfailureresponsedata.getClass();
        this.MediaBrowserCompatMediaItem = getfailureresponsedata;
        this.write = checkeventtoken;
        this.read = adjustEvent;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = z2;
        this.IconCompatParcelizer = z3;
        this.RatingCompat = list;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.MediaBrowserCompatMediaItem.hashCode();
        checkEventToken checkeventtoken = this.write;
        int iHashCode4 = 0;
        if (checkeventtoken == null) {
            int i2 = MediaDescriptionCompat + 65;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = checkeventtoken.hashCode();
        }
        AdjustEvent adjustEvent = this.read;
        if (adjustEvent == null) {
            int i4 = MediaDescriptionCompat + 13;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = adjustEvent.hashCode();
        }
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31, 31, this.RemoteActionCompatParcelizer), 31, this.serializer), 31, this.IconCompatParcelizer);
        List list = this.RatingCompat;
        if (list != null) {
            iHashCode4 = list.hashCode();
            int i6 = MediaDescriptionCompat + 45;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 3 / 5;
            }
        }
        return iM + iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Status(riderStatus=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", currentShift=");
        sb.append(this.write);
        sb.append(", futureShift=");
        sb.append(this.read);
        sb.append(", isOnDemand=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isShiftEnded=");
        af$$ExternalSyntheticOutline0.m(sb, this.serializer, ", hasMultipleFutureShifts=", this.IconCompatParcelizer, ", shifts=");
        String str = MediaSessionCompatQueueItem.read(sb, this.RatingCompat, ")");
        int i2 = MediaSessionCompatQueueItem + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof checkRevenue)) {
            return false;
        }
        checkRevenue checkrevenue = (checkRevenue) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, checkrevenue.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, checkrevenue.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, checkrevenue.read}, getCieXyz.write())).booleanValue() || this.RemoteActionCompatParcelizer != checkrevenue.RemoteActionCompatParcelizer) {
            return false;
        }
        if (this.serializer != checkrevenue.serializer) {
            int i3 = MediaSessionCompatQueueItem + 85;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (this.IconCompatParcelizer == checkrevenue.IconCompatParcelizer) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, checkrevenue.RatingCompat}, getCieXyz.write())).booleanValue();
        }
        int i5 = MediaDescriptionCompat + 73;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}

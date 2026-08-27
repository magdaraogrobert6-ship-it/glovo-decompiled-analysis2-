package o;

import android.os.Process;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getFailureResponseData {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public static int MediaMetadataCompat;
    public static int MediaSessionCompatQueueItem;
    public final String IconCompatParcelizer;
    public final isTrackingEnabled RemoteActionCompatParcelizer;
    public final deepCopy read;
    public final String serializer;
    public final long write;

    public getFailureResponseData(isTrackingEnabled istrackingenabled, String str, String str2, deepCopy deepcopy, long j) {
        istrackingenabled.getClass();
        str.getClass();
        this.RemoteActionCompatParcelizer = istrackingenabled;
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.read = deepcopy;
        this.write = j;
    }

    public final int hashCode() {
        int iM;
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 81;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() >>> 23, 85, this.serializer);
            str = this.IconCompatParcelizer;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.serializer);
            str = this.IconCompatParcelizer;
            if (str == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
        }
        deepCopy deepcopy = this.read;
        if (deepcopy == null) {
            int i3 = MediaDescriptionCompat + 27;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            iHashCode = deepcopy.hashCode();
        }
        return Long.hashCode(this.write) + ((((iM + iHashCode2) * 31) + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("RiderStatus(type=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", text=");
        sb.append(this.serializer);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", action=");
        sb.append(this.read);
        sb.append(", timestamp=");
        String strM = c8$$ExternalSyntheticOutline0.m(this.write, ")", sb);
        int i2 = MediaDescriptionCompat + 85;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof getFailureResponseData)) {
                return false;
            }
            getFailureResponseData getfailureresponsedata = (getFailureResponseData) obj;
            if (this.RemoteActionCompatParcelizer != getfailureresponsedata.RemoteActionCompatParcelizer) {
                int i2 = MediaBrowserCompatMediaItem + 19;
                MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getfailureresponsedata.serializer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, getfailureresponsedata.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getfailureresponsedata.read}, getCieXyz.write())).booleanValue()) {
                        int i3 = MediaBrowserCompatMediaItem + 63;
                        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        return false;
                    }
                    if (this.write == getfailureresponsedata.write) {
                        return true;
                    }
                    int i5 = MediaDescriptionCompat + 33;
                    MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i5 % 2 == 0;
                }
                int i6 = MediaDescriptionCompat + 77;
                MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = MediaDescriptionCompat + 113;
            MediaBrowserCompatMediaItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = MediaBrowserCompatMediaItem + 73;
        MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i10 % 2 == 0;
    }

    public static int RemoteActionCompatParcelizer() {
        int i = MediaMetadataCompat;
        int i2 = i % 7891172;
        MediaMetadataCompat = i + 1;
        if (i2 != 0) {
            return MediaSessionCompatQueueItem;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        MediaSessionCompatQueueItem = startUptimeMillis;
        return startUptimeMillis;
    }
}

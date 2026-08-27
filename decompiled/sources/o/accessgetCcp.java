package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetCcp extends accessgetCtrlRightcp {
    public final long IconCompatParcelizer;
    public final accessgetDirectionDownRightcp MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final byte[] MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final accessgetChannelDowncp RemoteActionCompatParcelizer;
    public final Integer read;
    public final long serializer;
    public final accessgetCallcp write;

    public accessgetCcp(long j, Integer num, accessgetCallcp accessgetcallcp, long j2, byte[] bArr, String str, long j3, accessgetDirectionDownRightcp accessgetdirectiondownrightcp, accessgetChannelDowncp accessgetchanneldowncp) {
        this.IconCompatParcelizer = j;
        this.read = num;
        this.write = accessgetcallcp;
        this.serializer = j2;
        this.MediaSessionCompatQueueItem = bArr;
        this.RatingCompat = str;
        this.MediaMetadataCompat = j3;
        this.MediaDescriptionCompat = accessgetdirectiondownrightcp;
        this.RemoteActionCompatParcelizer = accessgetchanneldowncp;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetCtrlRightcp)) {
            return false;
        }
        accessgetCtrlRightcp accessgetctrlrightcp = (accessgetCtrlRightcp) obj;
        accessgetCcp accessgetccp = (accessgetCcp) accessgetctrlrightcp;
        if (this.IconCompatParcelizer != accessgetccp.IconCompatParcelizer) {
            return false;
        }
        Integer num = accessgetccp.read;
        Integer num2 = this.read;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        accessgetCallcp accessgetcallcp = accessgetccp.write;
        accessgetCallcp accessgetcallcp2 = this.write;
        if (accessgetcallcp2 == null) {
            if (accessgetcallcp != null) {
                return false;
            }
        } else if (!accessgetcallcp2.equals(accessgetcallcp)) {
            return false;
        }
        if (this.serializer != accessgetccp.serializer) {
            return false;
        }
        if (accessgetctrlrightcp instanceof accessgetCcp) {
            bArr = accessgetccp.MediaSessionCompatQueueItem;
        } else {
            bArr = accessgetccp.MediaSessionCompatQueueItem;
        }
        if (!Arrays.equals(this.MediaSessionCompatQueueItem, bArr)) {
            return false;
        }
        String str = accessgetccp.RatingCompat;
        String str2 = this.RatingCompat;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.MediaMetadataCompat != accessgetccp.MediaMetadataCompat) {
            return false;
        }
        accessgetDirectionDownRightcp accessgetdirectiondownrightcp = accessgetccp.MediaDescriptionCompat;
        accessgetDirectionDownRightcp accessgetdirectiondownrightcp2 = this.MediaDescriptionCompat;
        if (accessgetdirectiondownrightcp2 == null) {
            if (accessgetdirectiondownrightcp != null) {
                return false;
            }
        } else if (!accessgetdirectiondownrightcp2.equals(accessgetdirectiondownrightcp)) {
            return false;
        }
        accessgetChannelDowncp accessgetchanneldowncp = accessgetccp.RemoteActionCompatParcelizer;
        accessgetChannelDowncp accessgetchanneldowncp2 = this.RemoteActionCompatParcelizer;
        if (accessgetchanneldowncp2 == null) {
            if (accessgetchanneldowncp != null) {
                return false;
            }
        } else if (!accessgetchanneldowncp2.equals(accessgetchanneldowncp)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.IconCompatParcelizer + ", eventCode=" + this.read + ", complianceData=" + this.write + ", eventUptimeMs=" + this.serializer + ", sourceExtension=" + Arrays.toString(this.MediaSessionCompatQueueItem) + ", sourceExtensionJsonProto3=" + this.RatingCompat + ", timezoneOffsetSeconds=" + this.MediaMetadataCompat + ", networkConnectionInfo=" + this.MediaDescriptionCompat + ", experimentIds=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final int hashCode() {
        long j = this.IconCompatParcelizer;
        int i = (int) (j ^ (j >>> 32));
        Integer num = this.read;
        int iHashCode = num == null ? 0 : num.hashCode();
        accessgetCallcp accessgetcallcp = this.write;
        int iHashCode2 = accessgetcallcp == null ? 0 : accessgetcallcp.hashCode();
        long j2 = this.serializer;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int iHashCode3 = Arrays.hashCode(this.MediaSessionCompatQueueItem);
        String str = this.RatingCompat;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.MediaMetadataCompat;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        accessgetDirectionDownRightcp accessgetdirectiondownrightcp = this.MediaDescriptionCompat;
        int iHashCode5 = accessgetdirectiondownrightcp == null ? 0 : accessgetdirectiondownrightcp.hashCode();
        accessgetChannelDowncp accessgetchanneldowncp = this.RemoteActionCompatParcelizer;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ i2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ i3) * 1000003) ^ iHashCode5) * 1000003) ^ (accessgetchanneldowncp != null ? accessgetchanneldowncp.hashCode() : 0);
    }
}

package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonZcp extends accessgetDirectionDownLeftcp {
    public final accessgetDirectionCentercp IconCompatParcelizer;
    public final long MediaMetadataCompat;
    public final long RatingCompat;
    public final ArrayList RemoteActionCompatParcelizer;
    public final accessgetButtonL1cp read;
    public final Integer serializer;
    public final String write;

    public accessgetButtonZcp(long j, long j2, accessgetButtonL1cp accessgetbuttonl1cp, Integer num, String str, ArrayList arrayList, accessgetDirectionCentercp accessgetdirectioncentercp) {
        this.RatingCompat = j;
        this.MediaMetadataCompat = j2;
        this.read = accessgetbuttonl1cp;
        this.serializer = num;
        this.write = str;
        this.RemoteActionCompatParcelizer = arrayList;
        this.IconCompatParcelizer = accessgetdirectioncentercp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetDirectionDownLeftcp)) {
            return false;
        }
        accessgetButtonZcp accessgetbuttonzcp = (accessgetButtonZcp) ((accessgetDirectionDownLeftcp) obj);
        if (this.RatingCompat != accessgetbuttonzcp.RatingCompat || this.MediaMetadataCompat != accessgetbuttonzcp.MediaMetadataCompat || !this.read.equals(accessgetbuttonzcp.read)) {
            return false;
        }
        Integer num = accessgetbuttonzcp.serializer;
        Integer num2 = this.serializer;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = accessgetbuttonzcp.write;
        String str2 = this.write;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.RemoteActionCompatParcelizer.equals(accessgetbuttonzcp.RemoteActionCompatParcelizer)) {
            return false;
        }
        accessgetDirectionCentercp accessgetdirectioncentercp = accessgetbuttonzcp.IconCompatParcelizer;
        accessgetDirectionCentercp accessgetdirectioncentercp2 = this.IconCompatParcelizer;
        if (accessgetdirectioncentercp2 == null) {
            return accessgetdirectioncentercp == null;
        }
        return accessgetdirectioncentercp2.equals(accessgetdirectioncentercp);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.RatingCompat + ", requestUptimeMs=" + this.MediaMetadataCompat + ", clientInfo=" + this.read + ", logSource=" + this.serializer + ", logSourceName=" + this.write + ", logEvents=" + this.RemoteActionCompatParcelizer + ", qosTier=" + this.IconCompatParcelizer + "}";
    }

    public final int hashCode() {
        long j = this.RatingCompat;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.MediaMetadataCompat;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode = this.read.hashCode();
        Integer num = this.serializer;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.write;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        accessgetDirectionCentercp accessgetdirectioncentercp = this.IconCompatParcelizer;
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ (accessgetdirectioncentercp != null ? accessgetdirectioncentercp.hashCode() : 0);
    }
}

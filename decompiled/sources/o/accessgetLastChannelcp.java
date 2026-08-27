package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetLastChannelcp {
    public static final accessgetLastChannelcp RemoteActionCompatParcelizer = new accessgetLastChannelcp(10485760, 604800000, 200, 10000, 81920);
    public final int IconCompatParcelizer;
    public final long MediaDescriptionCompat;
    public final long read;
    public final int serializer;
    public final int write;

    public accessgetLastChannelcp(long j, long j2, int i, int i2, int i3) {
        this.MediaDescriptionCompat = j;
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.read = j2;
        this.serializer = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetLastChannelcp)) {
            return false;
        }
        accessgetLastChannelcp accessgetlastchannelcp = (accessgetLastChannelcp) obj;
        return this.MediaDescriptionCompat == accessgetlastchannelcp.MediaDescriptionCompat && this.IconCompatParcelizer == accessgetlastchannelcp.IconCompatParcelizer && this.write == accessgetlastchannelcp.write && this.read == accessgetlastchannelcp.read && this.serializer == accessgetlastchannelcp.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", loadBatchSize=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.write);
        sb.append(", eventCleanUpAge=");
        sb.append(this.read);
        sb.append(", maxBlobByteSizePerRow=");
        return af$$ExternalSyntheticOutline0.m(this.serializer, "}", sb);
    }

    public final int hashCode() {
        long j = this.MediaDescriptionCompat;
        int i = this.IconCompatParcelizer;
        int i2 = this.write;
        long j2 = this.read;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ this.serializer;
    }
}

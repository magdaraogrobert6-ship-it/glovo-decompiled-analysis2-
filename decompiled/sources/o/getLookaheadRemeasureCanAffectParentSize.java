package o;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getLookaheadRemeasureCanAffectParentSize extends MeasurePassDelegate {
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final long RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final List read;
    public final int serializer;
    public final int write;

    public getLookaheadRemeasureCanAffectParentSize(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.write = i;
        this.IconCompatParcelizer = str;
        this.MediaSessionCompatQueueItem = i2;
        this.serializer = i3;
        this.RemoteActionCompatParcelizer = j;
        this.RatingCompat = j2;
        this.MediaMetadataCompat = j3;
        this.MediaDescriptionCompat = str2;
        this.read = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MeasurePassDelegate)) {
            return false;
        }
        getLookaheadRemeasureCanAffectParentSize getlookaheadremeasurecanaffectparentsize = (getLookaheadRemeasureCanAffectParentSize) ((MeasurePassDelegate) obj);
        if (this.write != getlookaheadremeasurecanaffectparentsize.write || !this.IconCompatParcelizer.equals(getlookaheadremeasurecanaffectparentsize.IconCompatParcelizer) || this.MediaSessionCompatQueueItem != getlookaheadremeasurecanaffectparentsize.MediaSessionCompatQueueItem || this.serializer != getlookaheadremeasurecanaffectparentsize.serializer || this.RemoteActionCompatParcelizer != getlookaheadremeasurecanaffectparentsize.RemoteActionCompatParcelizer || this.RatingCompat != getlookaheadremeasurecanaffectparentsize.RatingCompat || this.MediaMetadataCompat != getlookaheadremeasurecanaffectparentsize.MediaMetadataCompat) {
            return false;
        }
        String str = getlookaheadremeasurecanaffectparentsize.MediaDescriptionCompat;
        String str2 = this.MediaDescriptionCompat;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        List list = getlookaheadremeasurecanaffectparentsize.read;
        List list2 = this.read;
        if (list2 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list2.equals(list)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.write);
        sb.append(", processName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", reasonCode=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", importance=");
        sb.append(this.serializer);
        sb.append(", pss=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", rss=");
        sb.append(this.RatingCompat);
        sb.append(", timestamp=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", traceFile=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", buildIdMappingForArch=");
        return MediaSessionCompatQueueItem.read(sb, this.read, "}");
    }

    public final int hashCode() {
        int i = this.write;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i2 = this.MediaSessionCompatQueueItem;
        int i3 = this.serializer;
        long j = this.RemoteActionCompatParcelizer;
        int i4 = (int) (j ^ (j >>> 32));
        long j2 = this.RatingCompat;
        int i5 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.MediaMetadataCompat;
        int i6 = (int) (j3 ^ (j3 >>> 32));
        String str = this.MediaDescriptionCompat;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List list = this.read;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ i6) * 1000003) ^ iHashCode2) * 1000003) ^ (list != null ? list.hashCode() : 0);
    }
}

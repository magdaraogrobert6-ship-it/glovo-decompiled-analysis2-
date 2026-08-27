package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonCcp extends accessgetButton14cp {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String ParcelableVolumeInfo;
    public final Integer PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.PlaybackStateCompatCustomAction.hashCode();
        int iHashCode2 = this.RatingCompat.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = this.ParcelableVolumeInfo.hashCode();
        int iHashCode6 = this.MediaSessionCompatQueueItem.hashCode();
        int iHashCode7 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode8 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode9 = this.MediaMetadataCompat.hashCode();
        int iHashCode10 = this.serializer.hashCode();
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ this.MediaDescriptionCompat.hashCode()) * 1000003) ^ this.read.hashCode();
    }

    public accessgetButtonCcp(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.PlaybackStateCompatCustomAction = num;
        this.RatingCompat = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.ParcelableVolumeInfo = str4;
        this.MediaSessionCompatQueueItem = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.RemoteActionCompatParcelizer = str7;
        this.MediaMetadataCompat = str8;
        this.serializer = str9;
        this.MediaDescriptionCompat = str10;
        this.read = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetButton14cp)) {
            return false;
        }
        accessgetButtonCcp accessgetbuttonccp = (accessgetButtonCcp) ((accessgetButton14cp) obj);
        if (!this.PlaybackStateCompatCustomAction.equals(accessgetbuttonccp.PlaybackStateCompatCustomAction)) {
            return false;
        }
        if (!this.RatingCompat.equals(accessgetbuttonccp.RatingCompat)) {
            return false;
        }
        if (!this.IconCompatParcelizer.equals(accessgetbuttonccp.IconCompatParcelizer)) {
            return false;
        }
        if (!this.write.equals(accessgetbuttonccp.write)) {
            return false;
        }
        if (!this.ParcelableVolumeInfo.equals(accessgetbuttonccp.ParcelableVolumeInfo)) {
            return false;
        }
        if (!this.MediaSessionCompatQueueItem.equals(accessgetbuttonccp.MediaSessionCompatQueueItem)) {
            return false;
        }
        if (!this.MediaBrowserCompatMediaItem.equals(accessgetbuttonccp.MediaBrowserCompatMediaItem)) {
            return false;
        }
        if (!this.RemoteActionCompatParcelizer.equals(accessgetbuttonccp.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (!this.MediaMetadataCompat.equals(accessgetbuttonccp.MediaMetadataCompat)) {
            return false;
        }
        if (!this.serializer.equals(accessgetbuttonccp.serializer)) {
            return false;
        }
        if (this.MediaDescriptionCompat.equals(accessgetbuttonccp.MediaDescriptionCompat)) {
            return this.read.equals(accessgetbuttonccp.read);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", model=");
        sb.append(this.RatingCompat);
        sb.append(", hardware=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", device=");
        sb.append(this.write);
        sb.append(", product=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", osBuild=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", manufacturer=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", fingerprint=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", locale=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", country=");
        sb.append(this.serializer);
        sb.append(", mccMnc=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", applicationBuild=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, "}");
    }
}

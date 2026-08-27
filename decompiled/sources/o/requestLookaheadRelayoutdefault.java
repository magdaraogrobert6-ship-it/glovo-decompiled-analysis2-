package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class requestLookaheadRelayoutdefault extends placeOuterCoordinatorMLgxB_4 {
    public final long IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final long MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final String serializer;
    public final String write;

    public requestLookaheadRelayoutdefault(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.RemoteActionCompatParcelizer = i;
        this.write = str;
        this.read = i2;
        this.MediaSessionCompatQueueItem = j;
        this.IconCompatParcelizer = j2;
        this.RatingCompat = z;
        this.MediaBrowserCompatMediaItem = i3;
        this.serializer = str2;
        this.MediaDescriptionCompat = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof placeOuterCoordinatorMLgxB_4)) {
            return false;
        }
        requestLookaheadRelayoutdefault requestlookaheadrelayoutdefault = (requestLookaheadRelayoutdefault) ((placeOuterCoordinatorMLgxB_4) obj);
        return this.RemoteActionCompatParcelizer == requestlookaheadrelayoutdefault.RemoteActionCompatParcelizer && this.write.equals(requestlookaheadrelayoutdefault.write) && this.read == requestlookaheadrelayoutdefault.read && this.MediaSessionCompatQueueItem == requestlookaheadrelayoutdefault.MediaSessionCompatQueueItem && this.IconCompatParcelizer == requestlookaheadrelayoutdefault.IconCompatParcelizer && this.RatingCompat == requestlookaheadrelayoutdefault.RatingCompat && this.MediaBrowserCompatMediaItem == requestlookaheadrelayoutdefault.MediaBrowserCompatMediaItem && this.serializer.equals(requestlookaheadrelayoutdefault.serializer) && this.MediaDescriptionCompat.equals(requestlookaheadrelayoutdefault.MediaDescriptionCompat);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", model=");
        sb.append(this.write);
        sb.append(", cores=");
        sb.append(this.read);
        sb.append(", ram=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", diskSpace=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", simulator=");
        sb.append(this.RatingCompat);
        sb.append(", state=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", manufacturer=");
        sb.append(this.serializer);
        sb.append(", modelClass=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaDescriptionCompat, "}");
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int iHashCode = this.write.hashCode();
        int i2 = this.read;
        long j = this.MediaSessionCompatQueueItem;
        int i3 = (int) (j ^ (j >>> 32));
        long j2 = this.IconCompatParcelizer;
        int i4 = (int) ((j2 >>> 32) ^ j2);
        int i5 = this.RatingCompat ? 1231 : 1237;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ this.MediaBrowserCompatMediaItem) * 1000003) ^ this.serializer.hashCode()) * 1000003) ^ this.MediaDescriptionCompat.hashCode();
    }
}

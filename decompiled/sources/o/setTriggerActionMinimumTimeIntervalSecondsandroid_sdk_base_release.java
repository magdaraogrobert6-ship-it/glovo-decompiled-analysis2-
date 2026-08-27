package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release {
    public final boolean IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatResultReceiverWrapper;
    public final boolean MediaSessionCompatToken;
    public String PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final boolean serializer;
    public final boolean write;

    public setTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.write = z;
        this.IconCompatParcelizer = z2;
        this.read = i;
        this.RemoteActionCompatParcelizer = i2;
        this.serializer = z3;
        this.MediaMetadataCompat = z4;
        this.MediaDescriptionCompat = z5;
        this.RatingCompat = i3;
        this.MediaSessionCompatQueueItem = i4;
        this.MediaBrowserCompatMediaItem = z6;
        this.MediaSessionCompatToken = z7;
        this.MediaSessionCompatResultReceiverWrapper = z8;
        this.PlaybackStateCompatCustomAction = str;
    }

    public final String toString() {
        String string;
        String str = this.PlaybackStateCompatCustomAction;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.write) {
            sb.append("no-cache, ");
        }
        if (this.IconCompatParcelizer) {
            sb.append("no-store, ");
        }
        int i = this.read;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.serializer) {
            sb.append("private, ");
        }
        if (this.MediaMetadataCompat) {
            sb.append("public, ");
        }
        if (this.MediaDescriptionCompat) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.RatingCompat;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.MediaSessionCompatQueueItem;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.MediaBrowserCompatMediaItem) {
            sb.append("only-if-cached, ");
        }
        if (this.MediaSessionCompatToken) {
            sb.append("no-transform, ");
        }
        if (this.MediaSessionCompatResultReceiverWrapper) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            string = "";
        } else {
            sb.delete(sb.length() - 2, sb.length());
            string = sb.toString();
        }
        this.PlaybackStateCompatCustomAction = string;
        return string;
    }
}

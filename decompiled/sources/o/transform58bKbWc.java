package o;

/* JADX INFO: loaded from: classes.dex */
public final class transform58bKbWc {
    public final int IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final boolean RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final int read;
    public final int serializer;
    public final int write;

    public transform58bKbWc(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.MediaBrowserCompatMediaItem = z;
        this.RatingCompat = z2;
        this.read = i;
        this.MediaSessionCompatQueueItem = z3;
        this.MediaDescriptionCompat = z4;
        this.serializer = i2;
        this.IconCompatParcelizer = i3;
        this.write = i4;
        this.RemoteActionCompatParcelizer = i5;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompatMediaItem;
        boolean z2 = this.RatingCompat;
        int i = this.read;
        String str = this.MediaMetadataCompat;
        int iHashCode = str != null ? str.hashCode() : 0;
        boolean z3 = this.MediaSessionCompatQueueItem;
        boolean z4 = this.MediaDescriptionCompat;
        int i2 = this.serializer;
        int i3 = this.IconCompatParcelizer;
        return ((((((((((((((((((z ? 1 : 0) * 31) + (z2 ? 1 : 0)) * 31) + i) * 31) + iHashCode) * 29791) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + i2) * 31) + i3) * 31) + this.write) * 31) + this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof transform58bKbWc)) {
            return false;
        }
        transform58bKbWc transform58bkbwc = (transform58bKbWc) obj;
        if (this.MediaBrowserCompatMediaItem != transform58bkbwc.MediaBrowserCompatMediaItem || this.RatingCompat != transform58bkbwc.RatingCompat || this.read != transform58bkbwc.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaMetadataCompat, transform58bkbwc.MediaMetadataCompat}, getCieXyz.write())).booleanValue() && this.MediaSessionCompatQueueItem == transform58bkbwc.MediaSessionCompatQueueItem && this.MediaDescriptionCompat == transform58bkbwc.MediaDescriptionCompat && this.serializer == transform58bkbwc.serializer && this.IconCompatParcelizer == transform58bkbwc.IconCompatParcelizer && this.write == transform58bkbwc.write && this.RemoteActionCompatParcelizer == transform58bkbwc.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        String str = this.MediaMetadataCompat;
        StringBuilder sb = new StringBuilder("NavOptions(");
        if (this.MediaBrowserCompatMediaItem) {
            sb.append("launchSingleTop ");
        }
        if (this.RatingCompat) {
            sb.append("restoreState ");
        }
        if ((str != null || this.read != -1) && str != null) {
            sb.append("popUpTo(");
            sb.append(str);
            if (this.MediaSessionCompatQueueItem) {
                sb.append(" inclusive");
            }
            if (this.MediaDescriptionCompat) {
                sb.append(" saveState");
            }
            sb.append(")");
        }
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.serializer;
        if (i4 != -1 || i3 != -1 || i2 != -1 || i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i4));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(i3));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(i2));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(")");
        }
        return sb.toString();
    }
}

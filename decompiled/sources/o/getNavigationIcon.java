package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getNavigationIcon {
    public final int MediaBrowserCompatMediaItem;
    public final int MediaSessionCompatQueueItem;
    public static final getNavigationIcon MediaMetadataCompat = new getNavigationIcon(0, 0);
    public static final getNavigationIcon MediaDescriptionCompat = new getNavigationIcon(1, 8);
    public static final getNavigationIcon read = new getNavigationIcon(3, 10);
    public static final getNavigationIcon serializer = new getNavigationIcon(4, 10);
    public static final getNavigationIcon write = new getNavigationIcon(5, 10);
    public static final getNavigationIcon IconCompatParcelizer = new getNavigationIcon(6, 10);
    public static final getNavigationIcon RemoteActionCompatParcelizer = new getNavigationIcon(6, 8);

    public getNavigationIcon(int i, int i2) {
        this.MediaSessionCompatQueueItem = i;
        this.MediaBrowserCompatMediaItem = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getNavigationIcon)) {
            return false;
        }
        getNavigationIcon getnavigationicon = (getNavigationIcon) obj;
        return this.MediaSessionCompatQueueItem == getnavigationicon.MediaSessionCompatQueueItem && this.MediaBrowserCompatMediaItem == getnavigationicon.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.MediaSessionCompatQueueItem) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return af$$ExternalSyntheticOutline0.m(this.MediaBrowserCompatMediaItem, "}", sb);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return serializer() && this.MediaSessionCompatQueueItem != 1 && this.MediaBrowserCompatMediaItem == 10;
    }

    public final int hashCode() {
        return ((this.MediaSessionCompatQueueItem ^ 1000003) * 1000003) ^ this.MediaBrowserCompatMediaItem;
    }

    public final boolean serializer() {
        int i = this.MediaSessionCompatQueueItem;
        return (i == 0 || i == 2 || this.MediaBrowserCompatMediaItem == 0) ? false : true;
    }
}

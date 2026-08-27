package o;

import kotlinx.datetime.DateTimePeriod$Companion;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes5.dex */
@Serializable(write = setGraphicModalMaxHeightDp.class)
public abstract class setBackButtonDismissesInAppMessageView {
    public static final DateTimePeriod$Companion Companion = new DateTimePeriod$Companion();

    public abstract int IconCompatParcelizer();

    public abstract int MediaBrowserCompatMediaItem();

    public abstract long MediaSessionCompatQueueItem();

    public final String toString() {
        int i;
        Object objValueOf;
        StringBuilder sb = new StringBuilder();
        if (MediaBrowserCompatMediaItem() > 0 || IconCompatParcelizer() > 0 || MediaSessionCompatQueueItem() > 0 || ((MediaBrowserCompatMediaItem() | IconCompatParcelizer()) == 0 && MediaSessionCompatQueueItem() == 0)) {
            i = 1;
        } else {
            sb.append('-');
            i = -1;
        }
        sb.append('P');
        if (MediaBrowserCompatMediaItem() / 12 != 0) {
            sb.append((MediaBrowserCompatMediaItem() / 12) * i);
            sb.append('Y');
        }
        if (MediaBrowserCompatMediaItem() % 12 != 0) {
            sb.append((MediaBrowserCompatMediaItem() % 12) * i);
            sb.append('M');
        }
        if (IconCompatParcelizer() != 0) {
            sb.append(IconCompatParcelizer() * i);
            sb.append('D');
        }
        String str = "T";
        String str2 = "";
        if (RemoteActionCompatParcelizer() != 0) {
            sb.append("T");
            sb.append(RemoteActionCompatParcelizer() * i);
            sb.append('H');
            str = "";
        }
        if (write() != 0) {
            sb.append(str);
            sb.append(write() * i);
            sb.append('M');
        } else {
            str2 = str;
        }
        if ((read() | serializer()) != 0) {
            sb.append(str2);
            if (read() != 0) {
                objValueOf = Integer.valueOf(read() * i);
            } else {
                objValueOf = serializer() * i < 0 ? "-0" : "0";
            }
            sb.append(objValueOf);
            if (serializer() != 0) {
                sb.append('.');
                sb.append(hideCurrentlyDisplayingInAppMessage.serializer(9, String.valueOf(Math.abs(serializer()))));
            }
            sb.append('S');
        }
        if (sb.length() == 1) {
            sb.append("0D");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setBackButtonDismissesInAppMessageView)) {
            return false;
        }
        setBackButtonDismissesInAppMessageView setbackbuttondismissesinappmessageview = (setBackButtonDismissesInAppMessageView) obj;
        return MediaBrowserCompatMediaItem() == setbackbuttondismissesinappmessageview.MediaBrowserCompatMediaItem() && IconCompatParcelizer() == setbackbuttondismissesinappmessageview.IconCompatParcelizer() && MediaSessionCompatQueueItem() == setbackbuttondismissesinappmessageview.MediaSessionCompatQueueItem();
    }

    public final int hashCode() {
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        return Long.hashCode(MediaSessionCompatQueueItem()) + ((IconCompatParcelizer() + (iMediaBrowserCompatMediaItem * 31)) * 31);
    }

    public int serializer() {
        return (int) (MediaSessionCompatQueueItem() % 1000000000);
    }

    public int RemoteActionCompatParcelizer() {
        return (int) (MediaSessionCompatQueueItem() / 3600000000000L);
    }

    public int read() {
        return (int) ((MediaSessionCompatQueueItem() % 60000000000L) / 1000000000);
    }

    public int write() {
        return (int) ((MediaSessionCompatQueueItem() % 3600000000000L) / 60000000000L);
    }
}

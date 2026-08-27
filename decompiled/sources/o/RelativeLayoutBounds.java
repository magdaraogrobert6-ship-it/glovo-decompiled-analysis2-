package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class RelativeLayoutBounds {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final long IconCompatParcelizer;
    public final copyOhffZ5M MediaMetadataCompat;
    public final int RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public RelativeLayoutBounds(String str, String str2, String str3, copyOhffZ5M copyohffz5m, int i, long j, String str4) {
        str.getClass();
        str2.getClass();
        copyohffz5m.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.serializer = str3;
        this.MediaMetadataCompat = copyohffz5m;
        this.RatingCompat = i;
        this.IconCompatParcelizer = j;
        this.read = str4;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write), 31, this.serializer);
        int iHashCode = this.read.hashCode() + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RatingCompat, (this.MediaMetadataCompat.hashCode() + iM) * 31, 31), 31, this.IconCompatParcelizer);
        int i4 = MediaBrowserCompatMediaItem + 109;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 55;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CustomerChatInfo(chatUrl=", this.RemoteActionCompatParcelizer, ", confirmationNumber=", this.write, ", customerName=");
        sbM.append(this.serializer);
        sbM.append(", deliveryStatus=");
        sbM.append(this.MediaMetadataCompat);
        sbM.append(", unreadMessageCount=");
        sbM.append(this.RatingCompat);
        sbM.append(", deliveryId=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", customerPhoneNumber=REDACTED)");
        String string = sbM.toString();
        int i4 = MediaBrowserCompatMediaItem + 89;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeLayoutBounds)) {
            return false;
        }
        RelativeLayoutBounds relativeLayoutBounds = (RelativeLayoutBounds) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, relativeLayoutBounds.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, relativeLayoutBounds.write}, getCieXyz.write())).booleanValue()) {
            if (!this.serializer.equals(relativeLayoutBounds.serializer)) {
                return false;
            }
            if (this.MediaMetadataCompat == relativeLayoutBounds.MediaMetadataCompat) {
                return this.RatingCompat == relativeLayoutBounds.RatingCompat && this.IconCompatParcelizer == relativeLayoutBounds.IconCompatParcelizer && this.read.equals(relativeLayoutBounds.read);
            }
            i = MediaBrowserCompatMediaItem + 31;
        } else {
            i = MediaBrowserCompatMediaItem + 55;
        }
        MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i % 2;
        return false;
    }
}

package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class fractionVisibleInRect {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final String serializer;
    public final String write;

    public fractionVisibleInRect(String str, String str2, String str3, String str4, String str5, long j, String str6, boolean z) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str5);
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.RatingCompat = str5;
        this.read = j;
        this.write = str6;
        this.MediaDescriptionCompat = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 111;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.MediaDescriptionCompat) + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.MediaBrowserCompatMediaItem), 31, this.RatingCompat), 31, this.read), 31, this.write);
        int i4 = MediaMetadataCompat + 1;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 85;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("CustomerChatUiState(chatUrl=", this.serializer, ", confirmationNumber=", this.IconCompatParcelizer, ", customerName=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ", deliveryStatus=", this.MediaBrowserCompatMediaItem, ", unreadMessageCount=");
        sbM.append(this.RatingCompat);
        sbM.append(", deliveryId=");
        sbM.append(this.read);
        sbM.append(", customerPhoneNumber=REDACTED, isUnread=");
        sbM.append(this.MediaDescriptionCompat);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaMetadataCompat + 23;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fractionVisibleInRect)) {
            return false;
        }
        fractionVisibleInRect fractionvisibleinrect = (fractionVisibleInRect) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, fractionvisibleinrect.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, fractionvisibleinrect.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer.equals(fractionvisibleinrect.RemoteActionCompatParcelizer)) {
            if (!this.MediaBrowserCompatMediaItem.equals(fractionvisibleinrect.MediaBrowserCompatMediaItem)) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, fractionvisibleinrect.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return this.read == fractionvisibleinrect.read && this.write.equals(fractionvisibleinrect.write) && this.MediaDescriptionCompat == fractionvisibleinrect.MediaDescriptionCompat;
            }
            int i2 = MediaSessionCompatQueueItem + 65;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            int i3 = 2 % 3;
            return false;
        }
        int i4 = MediaMetadataCompat + 63;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}

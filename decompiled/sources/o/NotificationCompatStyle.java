package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationCompatStyle implements NotificationCompatMessagingStyle {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int ParcelableVolumeInfo;
    public final String IconCompatParcelizer;
    public final onServiceConnected MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final instantiateActivity read;
    public final String serializer;
    public final boolean write;

    public NotificationCompatStyle(String str, onServiceConnected onserviceconnected, String str2, String str3, String str4, String str5, instantiateActivity instantiateactivity, boolean z, String str6, String str7) {
        str.getClass();
        onserviceconnected.getClass();
        str4.getClass();
        instantiateactivity.getClass();
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompatMediaItem = onserviceconnected;
        this.MediaSessionCompatQueueItem = str2;
        this.IconCompatParcelizer = str3;
        this.RatingCompat = str4;
        this.serializer = str5;
        this.read = instantiateactivity;
        this.write = z;
        this.RemoteActionCompatParcelizer = str6;
        this.MediaDescriptionCompat = str7;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = ParcelableVolumeInfo + 45;
        MediaSessionCompatResultReceiverWrapper = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = d$$ExternalSyntheticOutline0.m((this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((this.MediaBrowserCompatMediaItem.hashCode() + (this.MediaMetadataCompat.hashCode() * 31)) * 31, 31, this.MediaSessionCompatQueueItem), 31, this.IconCompatParcelizer), 31, this.RatingCompat), 31, this.serializer)) * 31, 31, this.write);
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i5 = MediaSessionCompatResultReceiverWrapper + 71;
            ParcelableVolumeInfo = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i = i5 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode = str.hashCode();
            int i6 = ParcelableVolumeInfo + 115;
            MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = iHashCode;
        }
        String str2 = this.MediaDescriptionCompat;
        return (((iM + i) * 31) + (str2 != null ? str2.hashCode() : 0)) * 29791;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("WorkNow(opportunityId=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", type=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", title=");
        c8$$ExternalSyntheticOutline0.m(sb, this.MediaSessionCompatQueueItem, ", buttonText=", this.IconCompatParcelizer, ", workNowDescription=");
        c8$$ExternalSyntheticOutline0.m(sb, this.RatingCompat, ", infraBoostDescription=", this.serializer, ", availability=");
        sb.append(this.read);
        sb.append(", isButtonEnabled=");
        sb.append(this.write);
        sb.append(", checkSchedule=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ", nextPossibleAvailability=", this.MediaDescriptionCompat, ", circleColor=null, amount=null, bonusIndicators=null)");
        int i2 = MediaSessionCompatResultReceiverWrapper + 43;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0158, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.MediaDescriptionCompat, r1.MediaDescriptionCompat}, o.getCieXyz.write())).booleanValue()) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.NotificationCompatStyle.equals(java.lang.Object):boolean");
    }
}

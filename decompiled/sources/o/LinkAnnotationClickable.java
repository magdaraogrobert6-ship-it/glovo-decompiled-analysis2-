package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class LinkAnnotationClickable {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int ParcelableVolumeInfo = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String MediaSessionCompatToken;
    public final String PlaybackStateCompat;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public LinkAnnotationClickable(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        af$$ExternalSyntheticOutline0.m3978m(str6, str10, str12);
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.serializer = str4;
        this.MediaBrowserCompatMediaItem = str5;
        this.MediaSessionCompatQueueItem = str6;
        this.MediaMetadataCompat = str7;
        this.MediaDescriptionCompat = str8;
        this.RatingCompat = str9;
        this.PlaybackStateCompat = str10;
        this.MediaSessionCompatToken = str11;
        this.read = str12;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 93;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("HelpCenterInitBasicRequest(appVersion=", this.write, ", bridge=false, email=REDACTED, globalEntityId=", this.RemoteActionCompatParcelizer, ", guest=false, locale=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.serializer, ", logCountryCode=", this.MediaBrowserCompatMediaItem, ", name=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.MediaSessionCompatQueueItem, ", p2pChatToken=REDACTED, p2pChatType=p2p, p2pSdkVersion=null, p2pChatCountry=", this.MediaDescriptionCompat, ", platformToken=REDACTED, serviceType=rider, userId=REDACTED, verificationToken=REDACTED, hostPerseusSessionId=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.read, ")");
        int i4 = ParcelableVolumeInfo + 27;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 121;
        ParcelableVolumeInfo = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, false), 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, false), 31, this.serializer), 31, this.MediaBrowserCompatMediaItem), 31, this.MediaSessionCompatQueueItem);
        int iM2 = af$$ExternalSyntheticOutline0.m((((this.MediaMetadataCompat.hashCode() + iM) * 31) + 109294) * 961, 31, this.MediaDescriptionCompat);
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((((this.RatingCompat.hashCode() + iM2) * 31) + 108508794) * 31, 31, this.PlaybackStateCompat), 31, this.MediaSessionCompatToken);
        int i4 = MediaSessionCompatResultReceiverWrapper + 33;
        ParcelableVolumeInfo = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r21 instanceof o.LinkAnnotationClickable) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r4 = r4 + 121;
        o.LinkAnnotationClickable.MediaSessionCompatResultReceiverWrapper = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r1 = (o.LinkAnnotationClickable) r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r20.write.equals(r1.write) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r20.IconCompatParcelizer.equals(r1.IconCompatParcelizer) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r20.RemoteActionCompatParcelizer.equals(r1.RemoteActionCompatParcelizer) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r20.serializer.equals(r1.serializer) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        r1 = o.LinkAnnotationClickable.ParcelableVolumeInfo + 11;
        o.LinkAnnotationClickable.MediaSessionCompatResultReceiverWrapper = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r20.MediaBrowserCompatMediaItem.equals(r1.MediaBrowserCompatMediaItem) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r11 = new java.lang.Object[]{r20.MediaSessionCompatQueueItem, r1.MediaSessionCompatQueueItem};
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r11, o.getCieXyz.write())).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        if (r20.MediaMetadataCompat.equals(r1.MediaMetadataCompat) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (r20.MediaDescriptionCompat.equals(r1.MediaDescriptionCompat) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        r1 = o.LinkAnnotationClickable.MediaSessionCompatResultReceiverWrapper + 79;
        o.LinkAnnotationClickable.ParcelableVolumeInfo = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (r20.RatingCompat.equals(r1.RatingCompat) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        r18 = new java.lang.Object[]{r20.PlaybackStateCompat, r1.PlaybackStateCompat};
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (r20.MediaSessionCompatToken.equals(r1.MediaSessionCompatToken) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0103, code lost:
    
        r18 = new java.lang.Object[]{r20.read, r1.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0129, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r4 = r4 + 89;
        o.LinkAnnotationClickable.MediaSessionCompatResultReceiverWrapper = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.LinkAnnotationClickable.equals(java.lang.Object):boolean");
    }
}

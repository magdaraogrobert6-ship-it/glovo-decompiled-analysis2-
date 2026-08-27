package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class createNotificationChannelGroupsCompat {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final boolean IconCompatParcelizer;
    public final sc MediaSessionCompatQueueItem;
    public final androidx.compose.ui.text.TextStyle RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int serializer;
    public final int write;

    public createNotificationChannelGroupsCompat(int i, String str, int i2, int i3, sc scVar, androidx.compose.ui.text.TextStyle textStyle, boolean z) {
        scVar.getClass();
        textStyle.getClass();
        this.write = i;
        this.read = str;
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.MediaSessionCompatQueueItem = scVar;
        this.RatingCompat = textStyle;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 29;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, af$$ExternalSyntheticOutline0.m(this.serializer, af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.write) * 31, 31, this.read), 31), 31);
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + MediaSessionCompatQueueItem.serializer(this.RatingCompat, (this.MediaSessionCompatQueueItem.hashCode() + iM) * 31, 31);
        int i4 = MediaBrowserCompatMediaItem + 23;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("WorkOpportunityTypeSelection(icon=", this.write, ", text=", this.read, ", backgroundColor=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.serializer, this.RemoteActionCompatParcelizer, ", textColor=", ", type=", sbM);
        sbM.append(this.MediaSessionCompatQueueItem);
        sbM.append(", textStyle=");
        sbM.append(this.RatingCompat);
        sbM.append(", showGreenDot=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ")");
        int i4 = MediaMetadataCompat + 9;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r11.IconCompatParcelizer == r12.IconCompatParcelizer) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.createNotificationChannelGroupsCompat.MediaMetadataCompat
            int r1 = r1 + 33
            int r2 = r1 % 128
            o.createNotificationChannelGroupsCompat.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            r1 = 64
            int r1 = r1 / r2
            if (r11 != r12) goto L18
            goto L78
        L15:
            if (r11 != r12) goto L18
            goto L78
        L18:
            boolean r1 = r12 instanceof o.createNotificationChannelGroupsCompat
            if (r1 != 0) goto L1d
            goto L77
        L1d:
            o.createNotificationChannelGroupsCompat r12 = (o.createNotificationChannelGroupsCompat) r12
            int r1 = r11.write
            int r3 = r12.write
            if (r1 == r3) goto L26
            goto L77
        L26:
            java.lang.String r1 = r11.read
            java.lang.String r3 = r12.read
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L77
        L31:
            int r1 = r11.serializer
            int r3 = r12.serializer
            if (r1 == r3) goto L38
            goto L77
        L38:
            int r1 = r11.RemoteActionCompatParcelizer
            int r3 = r12.RemoteActionCompatParcelizer
            if (r1 == r3) goto L3f
            goto L77
        L3f:
            o.sc r1 = r11.MediaSessionCompatQueueItem
            o.sc r3 = r12.MediaSessionCompatQueueItem
            if (r1 == r3) goto L46
            goto L77
        L46:
            androidx.compose.ui.text.TextStyle r1 = r11.RatingCompat
            androidx.compose.ui.text.TextStyle r3 = r12.RatingCompat
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r3}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L71
            goto L77
        L71:
            boolean r1 = r11.IconCompatParcelizer
            boolean r12 = r12.IconCompatParcelizer
            if (r1 == r12) goto L78
        L77:
            return r2
        L78:
            int r12 = o.createNotificationChannelGroupsCompat.MediaBrowserCompatMediaItem
            int r12 = r12 + 41
            int r1 = r12 % 128
            o.createNotificationChannelGroupsCompat.MediaMetadataCompat = r1
            int r12 = r12 % r0
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createNotificationChannelGroupsCompat.equals(java.lang.Object):boolean");
    }
}

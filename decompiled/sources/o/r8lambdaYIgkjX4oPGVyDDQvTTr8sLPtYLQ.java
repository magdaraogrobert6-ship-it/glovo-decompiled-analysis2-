package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ implements findDesignInfoProviderslambda10 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final boolean IconCompatParcelizer;
    public final WrapPreview MediaBrowserCompatMediaItem;
    public final Instant MediaMetadataCompat;
    public final WrapPreviewlambda0 RatingCompat;
    public final r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 RemoteActionCompatParcelizer;
    public final List read;
    public final accessgetFakeSavedStateRegistryOwnerp serializer;
    public final long write;

    public final Instant write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 119;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Instant instant = this.MediaMetadataCompat;
        int i4 = i2 + 35;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return instant;
        }
        obj.hashCode();
        throw null;
    }

    public r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ(WrapPreview wrapPreview, accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp, List list, r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0, WrapPreviewlambda0 wrapPreviewlambda0, long j, boolean z, Instant instant) {
        this.MediaBrowserCompatMediaItem = wrapPreview;
        this.serializer = accessgetfakesavedstateregistryownerp;
        this.read = list;
        this.RemoteActionCompatParcelizer = r8lambdamtsd8x0f0xutzn3oeie_s8mt0;
        this.RatingCompat = wrapPreviewlambda0;
        this.write = j;
        this.IconCompatParcelizer = z;
        this.MediaMetadataCompat = instant;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        WrapPreview wrapPreview = this.MediaBrowserCompatMediaItem;
        int iHashCode4 = 0;
        if (wrapPreview == null) {
            int i2 = MediaDescriptionCompat + 103;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 53;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = wrapPreview.hashCode();
        }
        accessgetFakeSavedStateRegistryOwnerp accessgetfakesavedstateregistryownerp = this.serializer;
        int iHashCode5 = accessgetfakesavedstateregistryownerp == null ? 0 : accessgetfakesavedstateregistryownerp.hashCode();
        List list = this.read;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        r8lambdaMtsD8x0F0XuTzn3OeIE_s8mt0 r8lambdamtsd8x0f0xutzn3oeie_s8mt0 = this.RemoteActionCompatParcelizer;
        if (r8lambdamtsd8x0f0xutzn3oeie_s8mt0 == null) {
            int i7 = MediaSessionCompatQueueItem + 67;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = r8lambdamtsd8x0f0xutzn3oeie_s8mt0.hashCode();
        }
        WrapPreviewlambda0 wrapPreviewlambda0 = this.RatingCompat;
        if (wrapPreviewlambda0 == null) {
            int i9 = MediaSessionCompatQueueItem + 115;
            MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = wrapPreviewlambda0.hashCode();
        }
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((((((((iHashCode * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode3) * 31, 31, this.write), 31, this.IconCompatParcelizer);
        Instant instant = this.MediaMetadataCompat;
        if (instant == null) {
            int i11 = MediaSessionCompatQueueItem + 49;
            MediaDescriptionCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                int i12 = 37 / 0;
            }
        } else {
            iHashCode4 = instant.hashCode();
        }
        return iM + iHashCode4;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderHeaderItemUiV1(statusItemUi=" + this.MediaBrowserCompatMediaItem + ", expandableButtonItemUi=" + this.serializer + ", detailItemUi=" + this.read + ", bagsAndItemsUi=" + this.RemoteActionCompatParcelizer + ", onlyBags=" + this.RatingCompat + ", deliveryId=" + this.write + ", isExpandable=" + this.IconCompatParcelizer + ", nextRefreshTime=" + this.MediaMetadataCompat + ")";
        int i2 = MediaSessionCompatQueueItem + 121;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4 = r4 + 61;
        o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaSessionCompatQueueItem = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ) r22;
        r12 = new java.lang.Object[]{r21.MediaBrowserCompatMediaItem, r1.MediaBrowserCompatMediaItem};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r19 = new java.lang.Object[]{r21.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        r19 = new java.lang.Object[]{r21.read, r1.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r19 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        r19 = new java.lang.Object[]{r21.RatingCompat, r1.RatingCompat};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f6, code lost:
    
        r1 = o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaSessionCompatQueueItem + 113;
        o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if ((r1 % 2) != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0103, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010a, code lost:
    
        if (r21.write == r1.write) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
    
        if (r21.IconCompatParcelizer == r1.IconCompatParcelizer) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0113, code lost:
    
        r1 = o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaSessionCompatQueueItem + 19;
        o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011d, code lost:
    
        r19 = new java.lang.Object[]{r21.MediaMetadataCompat, r1.MediaMetadataCompat};
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0142, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0144, code lost:
    
        r1 = o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaSessionCompatQueueItem + 85;
        o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
    
        if ((r1 % 2) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0150, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0154, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0155, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0156, code lost:
    
        r1 = o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaSessionCompatQueueItem + 71;
        o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015f, code lost:
    
        if ((r1 % 2) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0161, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0162, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaYIgkjX4oPGVyDDQvTTr8sLPtYLQ.equals(java.lang.Object):boolean");
    }
}

package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class currentTransaction extends QueryResultDefaultImpls {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final boolean IconCompatParcelizer;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final clearReturnedFromScrapFlag serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public currentTransaction(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, String str, String str2, String str3, clearReturnedFromScrapFlag clearreturnedfromscrapflag, boolean z) {
        super(new getBoolean(str, androidx.compose.ui.text.input.KeyboardType.Companion.m3317getEmailPjHm6EE(), str2, clearreturnedfromscrapflag, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z));
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        str2.getClass();
        clearreturnedfromscrapflag.getClass();
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.RemoteActionCompatParcelizer = str;
        this.RatingCompat = str2;
        this.MediaSessionCompatQueueItem = str3;
        this.serializer = clearreturnedfromscrapflag;
        this.IconCompatParcelizer = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.read.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i2 = MediaDescriptionCompat;
            int i3 = i2 + 107;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 45;
            MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 / 4;
            }
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(((iHashCode2 * 31) + iHashCode) * 31, 31, this.RatingCompat), 31, this.MediaSessionCompatQueueItem);
        return Boolean.hashCode(this.IconCompatParcelizer) + ((this.serializer.hashCode() + iM) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("EmailEntity(onTextChanged=");
        sb.append(this.read);
        sb.append(", hint=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", username=REDACTED, subTitle=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", inputValidator=");
        sb.append(this.serializer);
        sb.append(", isInitialState=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ")");
        int i2 = MediaBrowserCompatMediaItem + 117;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.currentTransaction) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = (o.currentTransaction) r22;
        r12 = new java.lang.Object[]{r21.read, r1.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r1 = o.currentTransaction.MediaBrowserCompatMediaItem + 87;
        o.currentTransaction.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r19 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r1 = o.currentTransaction.MediaBrowserCompatMediaItem + 11;
        r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.currentTransaction.MediaDescriptionCompat = r3;
        r1 = r1 % 2;
        r3 = r3 + 115;
        o.currentTransaction.MediaBrowserCompatMediaItem = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if ((r3 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0092, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        r19 = new java.lang.Object[]{r21.RatingCompat, r1.RatingCompat};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r19 = new java.lang.Object[]{r21.MediaSessionCompatQueueItem, r1.MediaSessionCompatQueueItem};
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        r1 = o.currentTransaction.MediaDescriptionCompat + 49;
        o.currentTransaction.MediaBrowserCompatMediaItem = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f1, code lost:
    
        r19 = new java.lang.Object[]{r21.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0118, code lost:
    
        r1 = o.currentTransaction.MediaBrowserCompatMediaItem + 125;
        o.currentTransaction.MediaDescriptionCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0121, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
    
        if (r21.IconCompatParcelizer == r1.IconCompatParcelizer) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0128, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0129, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.currentTransaction.equals(java.lang.Object):boolean");
    }
}

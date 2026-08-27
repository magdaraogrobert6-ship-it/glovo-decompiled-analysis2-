package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final String serializer;
    public final long write;

    public r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA(long j, long j2, String str, String str2, String str3) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = j;
        this.IconCompatParcelizer = str3;
        this.write = j2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 75;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = c8$$ExternalSyntheticOutline0.m(this.write, ")", c8$$ExternalSyntheticOutline0.m("Session(country=", this.serializer, ", countryUrl=REDACTED, userId=REDACTED, contract=", this.IconCompatParcelizer, ", cityId="));
        int i4 = MediaDescriptionCompat + 91;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.write) + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.read), 31, this.IconCompatParcelizer);
        int i4 = RatingCompat + 27;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r22 instanceof o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r4 = r4 + 45;
        o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA.RatingCompat = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r1 = (o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) r22;
        r12 = new java.lang.Object[]{r21.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r1 = o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA.MediaDescriptionCompat + 17;
        o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r19 = new java.lang.Object[]{r21.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r21.read == r1.read) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        r19 = new java.lang.Object[]{r21.IconCompatParcelizer, r1.IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() == true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        if (r21.write == r1.write) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c2, code lost:
    
        r1 = o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA.MediaDescriptionCompat + 25;
        o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA.RatingCompat = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cb, code lost:
    
        if ((r1 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
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
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA.equals(java.lang.Object):boolean");
    }
}

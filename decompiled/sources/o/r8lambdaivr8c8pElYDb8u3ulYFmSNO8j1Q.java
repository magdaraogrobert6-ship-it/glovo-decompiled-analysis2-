package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q {
    private static int RatingCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q(String str, int i, String str2, String str3) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = str2;
        this.write = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("WebAppDeepLinkResource(path=", this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, ", titleRes=", ", analyticsName="), this.serializer, ", tag=", this.write, ")");
        }
        ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("WebAppDeepLinkResource(path=", this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, ", titleRes=", ", analyticsName="), this.serializer, ", tag=", this.write, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 91;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer.hashCode() * 31, 31), 31, this.serializer);
        int i4 = RatingCompat + 83;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r4.write.equals(r5.write) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q.read
            int r1 = r1 + 65
            int r2 = r1 % 128
            o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q.RatingCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            r1 = 52
            int r1 = r1 / r2
            if (r4 != r5) goto L18
            goto L47
        L15:
            if (r4 != r5) goto L18
            goto L47
        L18:
            boolean r1 = r5 instanceof o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q
            if (r1 != 0) goto L1d
            goto L46
        L1d:
            o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q r5 = (o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q) r5
            java.lang.String r1 = r4.IconCompatParcelizer
            java.lang.String r3 = r5.IconCompatParcelizer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2a
            goto L46
        L2a:
            int r1 = r4.RemoteActionCompatParcelizer
            int r3 = r5.RemoteActionCompatParcelizer
            if (r1 == r3) goto L31
            goto L46
        L31:
            java.lang.String r1 = r4.serializer
            java.lang.String r3 = r5.serializer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L46
        L3c:
            java.lang.String r1 = r4.write
            java.lang.String r5 = r5.write
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L47
        L46:
            return r2
        L47:
            int r5 = o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q.RatingCompat
            int r5 = r5 + 49
            int r1 = r5 % 128
            o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q.read = r1
            int r5 = r5 % r0
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaivr8c8pElYDb8u3ulYFmSNO8j1Q.equals(java.lang.Object):boolean");
    }
}

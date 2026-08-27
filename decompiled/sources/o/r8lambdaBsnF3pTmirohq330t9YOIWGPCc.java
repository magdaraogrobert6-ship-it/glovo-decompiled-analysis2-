package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaBsnF3pTmirohq330t9YOIWGPCc extends r8lambda9Lt3kLpaW5zRqYNsCjcVpu8Vc {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String serializer;
    public final String write;

    public final String RemoteActionCompatParcelizer() {
        String str;
        int i = 2 % 2;
        int i2 = read + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            str = this.IconCompatParcelizer;
            int i4 = 40 / 0;
        } else {
            str = this.IconCompatParcelizer;
        }
        int i5 = i3 + 55;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.write;
        int i4 = i3 + 21;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = read + 29;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        String str = this.serializer;
        int i5 = i3 + 33;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public r8lambdaBsnF3pTmirohq330t9YOIWGPCc(String str, String str2, String str3) {
        this.write = str;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PassVerification(resultCode=", this.write, ", phoneNumber=REDACTED, originalMessageId=", this.IconCompatParcelizer, ")");
            int i3 = read + 95;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strWrite;
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PassVerification(resultCode=", this.write, ", phoneNumber=REDACTED, originalMessageId=", this.IconCompatParcelizer, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 37;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.serializer);
        int i4 = read + 37;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (r5.IconCompatParcelizer.equals(r6.IconCompatParcelizer) != true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            r2 = 1
            if (r5 != r6) goto L8
            goto L39
        L8:
            boolean r3 = r6 instanceof o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc
            if (r3 != 0) goto Ld
            goto L38
        Ld:
            o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc r6 = (o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc) r6
            java.lang.String r3 = r5.write
            java.lang.String r4 = r6.write
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1a
            goto L38
        L1a:
            java.lang.String r3 = r5.serializer
            java.lang.String r4 = r6.serializer
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2e
            int r6 = o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc.MediaDescriptionCompat
            int r6 = r6 + 55
            int r2 = r6 % 128
            o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc.read = r2
            int r6 = r6 % r0
            goto L38
        L2e:
            java.lang.String r3 = r5.IconCompatParcelizer
            java.lang.String r6 = r6.IconCompatParcelizer
            boolean r6 = r3.equals(r6)
            if (r6 == r2) goto L39
        L38:
            return r1
        L39:
            int r6 = o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc.MediaDescriptionCompat
            int r6 = r6 + 103
            int r3 = r6 % 128
            o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc.read = r3
            int r6 = r6 % r0
            if (r6 == 0) goto L46
            r6 = 3
            int r6 = r6 / r1
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaBsnF3pTmirohq330t9YOIWGPCc.equals(java.lang.Object):boolean");
    }
}

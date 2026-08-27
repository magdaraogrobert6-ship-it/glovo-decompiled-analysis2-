package o;

/* JADX INFO: loaded from: classes3.dex */
public final class sendReftagReferrer implements removeGlobalPartnerParametersI {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final ActivityHandler44 write;

    public sendReftagReferrer(ActivityHandler44 activityHandler44) {
        this.write = activityHandler44;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = RemoteActionCompatParcelizer + 87;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "GoToOtpScreen(argument=" + this.write + ")";
        int i2 = read + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if ((!r5.write.equals(((o.sendReftagReferrer) r6).write)) != true) goto L14;
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
            int r1 = o.sendReftagReferrer.RemoteActionCompatParcelizer
            int r1 = r1 + 25
            int r2 = r1 % 128
            o.sendReftagReferrer.read = r2
            int r1 = r1 % r0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L16
            r1 = 17
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L32
        L16:
            if (r5 != r6) goto L19
            goto L32
        L19:
            boolean r1 = r6 instanceof o.sendReftagReferrer
            if (r1 != 0) goto L25
            int r2 = r2 + 43
            int r6 = r2 % 128
            o.sendReftagReferrer.RemoteActionCompatParcelizer = r6
            int r2 = r2 % r0
            goto L33
        L25:
            o.sendReftagReferrer r6 = (o.sendReftagReferrer) r6
            o.ActivityHandler44 r1 = r5.write
            o.ActivityHandler44 r6 = r6.write
            boolean r6 = r1.equals(r6)
            r6 = r6 ^ r4
            if (r6 == r4) goto L33
        L32:
            return r4
        L33:
            int r6 = o.sendReftagReferrer.read
            int r6 = r6 + 25
            int r1 = r6 % 128
            o.sendReftagReferrer.RemoteActionCompatParcelizer = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.sendReftagReferrer.equals(java.lang.Object):boolean");
    }
}

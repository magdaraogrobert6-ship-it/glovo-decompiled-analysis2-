package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getGooglePlayInstallReferrer extends getDefaultInstance {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final boolean RemoteActionCompatParcelizer;

    public getGooglePlayInstallReferrer(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int i4 = IconCompatParcelizer + 111;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        String strSerializer;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strSerializer = MediaSessionCompatQueueItem.serializer("RequestBackgroundLocation(isRequestedBefore=", ")", this.RemoteActionCompatParcelizer);
            int i3 = 49 / 0;
        } else {
            strSerializer = MediaSessionCompatQueueItem.serializer("RequestBackgroundLocation(isRequestedBefore=", ")", this.RemoteActionCompatParcelizer);
        }
        int i4 = write + 13;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strSerializer;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof o.getGooglePlayInstallReferrer) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r5.RemoteActionCompatParcelizer == ((o.getGooglePlayInstallReferrer) r6).RemoteActionCompatParcelizer) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r2 = r2 + 97;
        o.getGooglePlayInstallReferrer.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 81;
        o.getGooglePlayInstallReferrer.IconCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
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
            int r1 = o.getGooglePlayInstallReferrer.IconCompatParcelizer
            int r1 = r1 + 111
            int r2 = r1 % 128
            o.getGooglePlayInstallReferrer.write = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 14
            int r1 = r1 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r2 = r2 + 81
            int r6 = r2 % 128
            o.getGooglePlayInstallReferrer.IconCompatParcelizer = r6
            int r2 = r2 % r0
            return r3
        L20:
            boolean r1 = r6 instanceof o.getGooglePlayInstallReferrer
            if (r1 != 0) goto L25
            return r4
        L25:
            o.getGooglePlayInstallReferrer r6 = (o.getGooglePlayInstallReferrer) r6
            boolean r1 = r5.RemoteActionCompatParcelizer
            boolean r6 = r6.RemoteActionCompatParcelizer
            if (r1 == r6) goto L35
            int r2 = r2 + 97
            int r6 = r2 % 128
            o.getGooglePlayInstallReferrer.IconCompatParcelizer = r6
            int r2 = r2 % r0
            return r4
        L35:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getGooglePlayInstallReferrer.equals(java.lang.Object):boolean");
    }
}

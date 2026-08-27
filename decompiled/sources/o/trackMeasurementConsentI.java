package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class trackMeasurementConsentI extends teardownAttributionS {
    private static int read = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;

    public trackMeasurementConsentI(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        this.RemoteActionCompatParcelizer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("NavigateToMaps(url=", this.RemoteActionCompatParcelizer, ")");
        int i4 = read + 15;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r3.RemoteActionCompatParcelizer.equals(((o.trackMeasurementConsentI) r4).RemoteActionCompatParcelizer) != true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r3 != r4) goto L7
            goto L2c
        L7:
            boolean r2 = r4 instanceof o.trackMeasurementConsentI
            if (r2 != 0) goto L15
            int r4 = o.trackMeasurementConsentI.read
            int r4 = r4 + 17
            int r1 = r4 % 128
            o.trackMeasurementConsentI.write = r1
            int r4 = r4 % r0
            goto L21
        L15:
            o.trackMeasurementConsentI r4 = (o.trackMeasurementConsentI) r4
            java.lang.String r2 = r3.RemoteActionCompatParcelizer
            java.lang.String r4 = r4.RemoteActionCompatParcelizer
            boolean r4 = r2.equals(r4)
            if (r4 == r1) goto L2c
        L21:
            int r4 = o.trackMeasurementConsentI.write
            int r4 = r4 + 47
            int r1 = r4 % 128
            o.trackMeasurementConsentI.read = r1
            int r4 = r4 % r0
            r4 = 0
            return r4
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.trackMeasurementConsentI.equals(java.lang.Object):boolean");
    }
}

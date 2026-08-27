package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class subscribeToFeatureFlagsUpdates {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final String read;
    public final String serializer;

    public subscribeToFeatureFlagsUpdates(String str, String str2, String str3) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.read.hashCode() / af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 93, 72, this.IconCompatParcelizer);
        } else {
            iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer);
        }
        int i3 = RemoteActionCompatParcelizer + 21;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 49;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("RecordedRequest(url=", this.serializer, ", method=", this.IconCompatParcelizer, ", body="), this.read, ")");
        int i4 = RemoteActionCompatParcelizer + 95;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r4.read.equals(r5.read) == false) goto L17;
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
            int r1 = o.subscribeToFeatureFlagsUpdates.write
            int r1 = r1 + 63
            int r2 = r1 % 128
            o.subscribeToFeatureFlagsUpdates.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L5e
            if (r4 != r5) goto L12
            goto L50
        L12:
            boolean r1 = r5 instanceof o.subscribeToFeatureFlagsUpdates
            if (r1 != 0) goto L17
            goto L42
        L17:
            o.subscribeToFeatureFlagsUpdates r5 = (o.subscribeToFeatureFlagsUpdates) r5
            java.lang.String r1 = r4.serializer
            java.lang.String r3 = r5.serializer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2d
            int r5 = o.subscribeToFeatureFlagsUpdates.write
            int r5 = r5 + 9
            int r1 = r5 % 128
            o.subscribeToFeatureFlagsUpdates.RemoteActionCompatParcelizer = r1
            int r5 = r5 % r0
            goto L42
        L2d:
            java.lang.String r1 = r4.IconCompatParcelizer
            java.lang.String r3 = r5.IconCompatParcelizer
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L38
            goto L42
        L38:
            java.lang.String r1 = r4.read
            java.lang.String r5 = r5.read
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L50
        L42:
            int r5 = o.subscribeToFeatureFlagsUpdates.RemoteActionCompatParcelizer
            int r5 = r5 + 95
            int r1 = r5 % 128
            o.subscribeToFeatureFlagsUpdates.write = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L4f
            r5 = 0
            return r5
        L4f:
            throw r2
        L50:
            int r5 = o.subscribeToFeatureFlagsUpdates.write
            int r5 = r5 + 107
            int r1 = r5 % 128
            o.subscribeToFeatureFlagsUpdates.RemoteActionCompatParcelizer = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L5d
            r5 = 1
            return r5
        L5d:
            throw r2
        L5e:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.subscribeToFeatureFlagsUpdates.equals(java.lang.Object):boolean");
    }
}

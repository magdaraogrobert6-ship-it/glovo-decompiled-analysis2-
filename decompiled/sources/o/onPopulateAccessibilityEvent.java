package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class onPopulateAccessibilityEvent extends getBridge {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String serializer;

    public final String write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.serializer;
        int i5 = i3 + 47;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public onPopulateAccessibilityEvent(String str) {
        this.serializer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 121;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("SelectedOpportunity(id=", this.serializer, ")");
        int i4 = read + 15;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((!r3.serializer.equals(((o.onPopulateAccessibilityEvent) r4).serializer)) != true) goto L10;
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
            goto L22
        L7:
            boolean r2 = r4 instanceof o.onPopulateAccessibilityEvent
            if (r2 != 0) goto L15
            int r4 = o.onPopulateAccessibilityEvent.RemoteActionCompatParcelizer
            int r4 = r4 + 75
            int r1 = r4 % 128
            o.onPopulateAccessibilityEvent.read = r1
            int r4 = r4 % r0
            goto L23
        L15:
            o.onPopulateAccessibilityEvent r4 = (o.onPopulateAccessibilityEvent) r4
            java.lang.String r2 = r3.serializer
            java.lang.String r4 = r4.serializer
            boolean r4 = r2.equals(r4)
            r4 = r4 ^ r1
            if (r4 == r1) goto L23
        L22:
            return r1
        L23:
            int r4 = o.onPopulateAccessibilityEvent.read
            int r4 = r4 + 101
            int r1 = r4 % 128
            o.onPopulateAccessibilityEvent.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onPopulateAccessibilityEvent.equals(java.lang.Object):boolean");
    }
}

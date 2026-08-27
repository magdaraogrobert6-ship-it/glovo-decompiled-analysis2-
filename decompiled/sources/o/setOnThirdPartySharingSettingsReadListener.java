package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnThirdPartySharingSettingsReadListener extends getOnAdidReadListener {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final boolean write;

    public setOnThirdPartySharingSettingsReadListener(String str, String str2, boolean z, boolean z2) {
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = z;
        this.write = z2;
    }

    public /* synthetic */ setOnThirdPartySharingSettingsReadListener(String str, String str2) {
        this(str, str2, true, false);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return MediaSessionCompatQueueItem.serializer(c8$$ExternalSyntheticOutline0.m("Displayable(title=", this.serializer, ", description=", this.RemoteActionCompatParcelizer, ", showIcon="), this.read, ", useAlertTitleColor=", this.write, ")");
        }
        MediaSessionCompatQueueItem.serializer(c8$$ExternalSyntheticOutline0.m("Displayable(title=", this.serializer, ", description=", this.RemoteActionCompatParcelizer, ", showIcon="), this.read, ", useAlertTitleColor=", this.write, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.write) + d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.read);
        int i4 = IconCompatParcelizer + 89;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        if (r20.write != r1.write) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.setOnThirdPartySharingSettingsReadListener.RatingCompat
            int r3 = r3 + 123
            int r4 = r3 % 128
            o.setOnThirdPartySharingSettingsReadListener.IconCompatParcelizer = r4
            int r3 = r3 % r2
            r3 = 0
            if (r0 != r1) goto L14
            goto L7b
        L14:
            boolean r4 = r1 instanceof o.setOnThirdPartySharingSettingsReadListener
            if (r4 != 0) goto L19
            goto L7a
        L19:
            o.setOnThirdPartySharingSettingsReadListener r1 = (o.setOnThirdPartySharingSettingsReadListener) r1
            java.lang.String r4 = r0.serializer
            java.lang.String r5 = r1.serializer
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r14 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r15 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r14
            r8 = r15
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L48
            goto L7a
        L48:
            java.lang.String r4 = r0.RemoteActionCompatParcelizer
            java.lang.String r5 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r5}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L6d
            goto L7a
        L6d:
            boolean r4 = r0.read
            boolean r5 = r1.read
            if (r4 == r5) goto L74
            goto L7a
        L74:
            boolean r4 = r0.write
            boolean r1 = r1.write
            if (r4 == r1) goto L7b
        L7a:
            return r3
        L7b:
            int r1 = o.setOnThirdPartySharingSettingsReadListener.RatingCompat
            int r1 = r1 + 7
            int r4 = r1 % 128
            o.setOnThirdPartySharingSettingsReadListener.IconCompatParcelizer = r4
            int r1 = r1 % r2
            r2 = 1
            if (r1 == 0) goto L8a
            r1 = 72
            int r1 = r1 / r3
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOnThirdPartySharingSettingsReadListener.equals(java.lang.Object):boolean");
    }
}

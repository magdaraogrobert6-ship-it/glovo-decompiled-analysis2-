package o;

import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String IconCompatParcelizer;
    public final setContentCardsUnreadVisualIndicatorEnabled read;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release(IOParser$Decoder iOParser$Decoder) {
        this.IconCompatParcelizer = (String) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.read = (setContentCardsUnreadVisualIndicatorEnabled) iOParser$Decoder.read;
    }

    public final String toString() {
        return "TripEvent{trip_id=" + this.IconCompatParcelizer + ", property=" + this.read + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r5 = r5.read;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release r5 = (o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) r5
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setContentCardsUnreadVisualIndicatorEnabled r5 = r5.read
            o.setContentCardsUnreadVisualIndicatorEnabled r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}

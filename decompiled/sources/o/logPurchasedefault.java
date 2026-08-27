package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class logPurchasedefault implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY read = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(24);
    public final Long IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final Long serializer;
    public final Boolean write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        Boolean bool = this.write;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (bool == null ? 0 : bool.hashCode())) * (-2128831035);
    }

    public logPurchasedefault(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.IconCompatParcelizer = (Long) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.serializer = (Long) iscontentcardsunreadvisualindicatorenabled.write;
        this.RemoteActionCompatParcelizer = (Integer) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.write = (Boolean) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepCountEvent{start_time=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", end_time=");
        sb.append(this.serializer);
        sb.append(", steps=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", did_device_reboot=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.write);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r5 = r5.write;
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
            boolean r2 = r5 instanceof o.logPurchasedefault
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.logPurchasedefault r5 = (o.logPurchasedefault) r5
            java.lang.Long r2 = r5.IconCompatParcelizer
            java.lang.Long r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L1b:
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L27:
            java.lang.Integer r2 = r5.RemoteActionCompatParcelizer
            java.lang.Integer r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L33:
            java.lang.Boolean r5 = r5.write
            java.lang.Boolean r2 = r4.write
            if (r2 == r5) goto L43
            if (r2 == 0) goto L42
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L42
            goto L43
        L42:
            return r1
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.logPurchasedefault.equals(java.lang.Object):boolean");
    }
}

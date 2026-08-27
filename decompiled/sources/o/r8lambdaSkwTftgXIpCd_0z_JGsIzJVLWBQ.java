package o;

import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final getSdkEnablementProviderandroid_sdk_base_release RemoteActionCompatParcelizer = new getSdkEnablementProviderandroid_sdk_base_release(17);
    public final handleIncomingIntent IconCompatParcelizer;
    public final BrazeCompanionExternalSyntheticLambda4 read;
    public final Long serializer;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        handleIncomingIntent handleincomingintent = this.IconCompatParcelizer;
        int iHashCode2 = handleincomingintent == null ? 0 : handleincomingintent.hashCode();
        Long l = this.write;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Long l2 = this.serializer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (l2 != null ? l2.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ(N$b n$b) {
        this.read = (BrazeCompanionExternalSyntheticLambda4) n$b.read;
        this.IconCompatParcelizer = (handleIncomingIntent) n$b.write;
        this.write = (Long) n$b.IconCompatParcelizer;
        this.serializer = (Long) n$b.serializer;
    }

    public final String toString() {
        return "TransportStateStationary{location=" + this.read + ", wifi_info=" + this.IconCompatParcelizer + ", preceding_moving_start_time=" + this.write + ", original_stationary_time=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ r5 = (o.r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ) r5
            o.BrazeCompanionExternalSyntheticLambda4 r2 = r5.read
            o.BrazeCompanionExternalSyntheticLambda4 r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L1b:
            o.handleIncomingIntent r2 = r5.IconCompatParcelizer
            o.handleIncomingIntent r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L29
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L29:
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L37
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L37:
            java.lang.Long r5 = r5.serializer
            java.lang.Long r2 = r4.serializer
            if (r2 == r5) goto L47
            if (r2 == 0) goto L46
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L46
            goto L47
        L46:
            return r1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaSkwTftgXIpCd_0z_JGsIzJVLWBQ.equals(java.lang.Object):boolean");
    }
}

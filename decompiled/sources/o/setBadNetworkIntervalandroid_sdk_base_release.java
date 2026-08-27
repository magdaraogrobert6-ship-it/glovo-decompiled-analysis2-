package o;

import com.sentiance.core.model.thrift.OS;

/* JADX INFO: loaded from: classes3.dex */
public final class setBadNetworkIntervalandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomEndpointandroid_sdk_base_release read = new setCustomEndpointandroid_sdk_base_release();
    public final Long IconCompatParcelizer;
    public final OS RemoteActionCompatParcelizer;
    public final Integer serializer;
    public final Short write;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        Short sh = this.write;
        int iHashCode2 = sh == null ? 0 : sh.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        Long l = this.IconCompatParcelizer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (l != null ? l.hashCode() : 0)) * (-2128831035);
    }

    public setBadNetworkIntervalandroid_sdk_base_release(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.serializer = (Integer) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.write = (Short) iscontentcardsunreadvisualindicatorenabled.write;
        this.RemoteActionCompatParcelizer = (OS) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (Long) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        return "Pedigree{true_as_of_secs=" + this.serializer + ", timezoneOffset=" + this.write + ", os=" + this.RemoteActionCompatParcelizer + ", true_as_of_millis=" + this.IconCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r5 = r5.IconCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setBadNetworkIntervalandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setBadNetworkIntervalandroid_sdk_base_release r5 = (o.setBadNetworkIntervalandroid_sdk_base_release) r5
            java.lang.Integer r2 = r5.serializer
            java.lang.Integer r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L1b:
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L29
            if (r3 == 0) goto L44
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L29:
            com.sentiance.core.model.thrift.OS r2 = r5.RemoteActionCompatParcelizer
            com.sentiance.core.model.thrift.OS r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L35
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L35:
            java.lang.Long r5 = r5.IconCompatParcelizer
            java.lang.Long r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L45
            if (r2 == 0) goto L44
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L44
            goto L45
        L44:
            return r1
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBadNetworkIntervalandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}

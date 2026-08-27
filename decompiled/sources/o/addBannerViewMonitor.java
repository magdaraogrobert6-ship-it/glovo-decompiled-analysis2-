package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class addBannerViewMonitor implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeCompanionExternalSyntheticLambda21 IconCompatParcelizer = new BrazeCompanionExternalSyntheticLambda21(27);
    public final Boolean read;
    public final validateAndStorePushId serializer;

    public final int hashCode() {
        validateAndStorePushId validateandstorepushid = this.serializer;
        int iHashCode = validateandstorepushid == null ? 0 : validateandstorepushid.hashCode();
        Boolean bool = this.read;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (bool != null ? bool.hashCode() : 0)) * (-2128831035);
    }

    public addBannerViewMonitor(IOParser$Decoder iOParser$Decoder) {
        this.serializer = (validateAndStorePushId) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.read = (Boolean) iOParser$Decoder.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkInitializedEvent{last_app_termination_reason=");
        sb.append(this.serializer);
        sb.append(", is_delayed_init=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.read);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.addBannerViewMonitor
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.addBannerViewMonitor r5 = (o.addBannerViewMonitor) r5
            o.validateAndStorePushId r2 = r5.serializer
            o.validateAndStorePushId r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Boolean r5 = r5.read
            java.lang.Boolean r2 = r4.read
            if (r2 == r5) goto L2d
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.addBannerViewMonitor.equals(java.lang.Object):boolean");
    }
}

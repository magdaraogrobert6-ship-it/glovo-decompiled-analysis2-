package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeFlushPushDeliveryReceiver implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Short RemoteActionCompatParcelizer;
    public final Short read;

    public final int hashCode() {
        Short sh = this.read;
        int iHashCode = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.RemoteActionCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (sh2 != null ? sh2.hashCode() : 0)) * (-2128831035);
    }

    public BrazeFlushPushDeliveryReceiver(NetworkBody networkBody) {
        this.read = (Short) networkBody.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Short) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "AccelerometerInfo{range_mps2=" + this.read + ", max_frequency_hertz=" + this.RemoteActionCompatParcelizer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r5 = r5.RemoteActionCompatParcelizer;
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
            boolean r2 = r5 instanceof o.BrazeFlushPushDeliveryReceiver
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.BrazeFlushPushDeliveryReceiver r5 = (o.BrazeFlushPushDeliveryReceiver) r5
            java.lang.Short r2 = r5.read
            java.lang.Short r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Short r5 = r5.RemoteActionCompatParcelizer
            java.lang.Short r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeFlushPushDeliveryReceiver.equals(java.lang.Object):boolean");
    }
}

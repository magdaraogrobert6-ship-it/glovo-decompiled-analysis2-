package o;

import io.sentry.util.network.NetworkBody;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setHomeCity implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setLastKnownLocation RemoteActionCompatParcelizer = new setLastKnownLocation();
    public final Short read;
    public final Map write;

    public final int hashCode() {
        return (((this.read.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public setHomeCity(NetworkBody networkBody) {
        this.read = (Short) networkBody.IconCompatParcelizer;
        this.write = Collections.unmodifiableMap((HashMap) networkBody.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppForegroundSessionConfiguration{location_fix_interval_seconds=");
        sb.append(this.read);
        sb.append(", enabled_sensors_and_frequencies_hertz=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.setHomeCity
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setHomeCity r5 = (o.setHomeCity) r5
            java.lang.Short r2 = r5.read
            java.lang.Short r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.util.Map r5 = r5.write
            java.util.Map r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHomeCity.equals(java.lang.Object):boolean");
    }
}

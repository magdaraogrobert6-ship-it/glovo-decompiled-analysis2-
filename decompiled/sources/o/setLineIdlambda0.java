package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setLineIdlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o serializer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(16);
    public final Map IconCompatParcelizer;
    public final Boolean write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        Map map = this.IconCompatParcelizer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (map == null ? 0 : map.hashCode())) * (-2128831035);
    }

    public setLineIdlambda0(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.write = (Boolean) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        HashMap map = (HashMap) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
        this.IconCompatParcelizer = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HardEventDetectionConfiguration{enabled=");
        sb.append(this.write);
        sb.append(", peak_check_config=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.IconCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.setLineIdlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLineIdlambda0 r5 = (o.setLineIdlambda0) r5
            java.lang.Boolean r2 = r5.write
            java.lang.Boolean r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            java.util.Map r5 = r5.IconCompatParcelizer
            java.util.Map r2 = r4.IconCompatParcelizer
            if (r2 == r5) goto L2b
            if (r2 == 0) goto L2a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setLineIdlambda0.equals(java.lang.Object):boolean");
    }
}

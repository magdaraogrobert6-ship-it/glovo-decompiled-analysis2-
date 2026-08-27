package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw IconCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(6);
    public final List RemoteActionCompatParcelizer;
    public final Long serializer;

    public final int hashCode() {
        return (((this.serializer.hashCode() ^ 16777619) * (-2128831035)) ^ this.RemoteActionCompatParcelizer.hashCode()) * (-2128831035);
    }

    public r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.serializer = (Long) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList((ArrayList) r8lambda1mnczrzuv4owduwgkg6cjtsws.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportWaypoints{base_timestamp=");
        sb.append(this.serializer);
        sb.append(", waypoints=");
        return MediaSessionCompatQueueItem.read(sb, this.RemoteActionCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU r5 = (o.r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU) r5
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.util.List r5 = r5.RemoteActionCompatParcelizer
            java.util.List r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda_Fm5wWOrZosAHEqCW4iTNpw4teU.equals(java.lang.Object):boolean");
    }
}

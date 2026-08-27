package o;

import com.sentiance.core.model.events.C$b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributeToSecondsFromEpoch implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw serializer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(21);
    public final Map RemoteActionCompatParcelizer;
    public final Byte read;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        Byte b = this.read;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        Map map = this.RemoteActionCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (map != null ? map.hashCode() : 0)) * (-2128831035);
    }

    public setCustomUserAttributeToSecondsFromEpoch(C$b c$b) {
        this.write = (Long) c$b.serializer;
        this.read = (Byte) c$b.write;
        HashMap map = (HashMap) c$b.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StationaryEnd{stop=");
        sb.append(this.write);
        sb.append(", close_reason=");
        sb.append(this.read);
        sb.append(", m7_data=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.RemoteActionCompatParcelizer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
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
            boolean r2 = r5 instanceof o.setCustomUserAttributeToSecondsFromEpoch
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomUserAttributeToSecondsFromEpoch r5 = (o.setCustomUserAttributeToSecondsFromEpoch) r5
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
        L1b:
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L29
            if (r3 == 0) goto L38
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L38
        L29:
            java.util.Map r5 = r5.RemoteActionCompatParcelizer
            java.util.Map r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L39
            if (r2 == 0) goto L38
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L38
            goto L39
        L38:
            return r1
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomUserAttributeToSecondsFromEpoch.equals(java.lang.Object):boolean");
    }
}

package o;

import com.sentiance.core.model.events.C$b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributeToSecondsFromEpochlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw read = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(13);
    public final Map RemoteActionCompatParcelizer;
    public final Short serializer;
    public final Short write;

    public final int hashCode() {
        Map map = this.RemoteActionCompatParcelizer;
        int iHashCode = map == null ? 0 : map.hashCode();
        Short sh = this.serializer;
        int iHashCode2 = sh == null ? 0 : sh.hashCode();
        Short sh2 = this.write;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (sh2 != null ? sh2.hashCode() : 0)) * (-2128831035);
    }

    public setCustomUserAttributeToSecondsFromEpochlambda0(C$b c$b) {
        HashMap map = (HashMap) c$b.serializer;
        this.RemoteActionCompatParcelizer = map == null ? null : Collections.unmodifiableMap(map);
        this.serializer = (Short) c$b.write;
        this.write = (Short) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        return "DrivingInsightsConfiguration{overall_safety_score_weights=" + this.RemoteActionCompatParcelizer + ", scoring_methodology_version=" + this.serializer + ", speed_limit_buffer_for_uae_in_kmph=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
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
            boolean r2 = r5 instanceof o.setCustomUserAttributeToSecondsFromEpochlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomUserAttributeToSecondsFromEpochlambda0 r5 = (o.setCustomUserAttributeToSecondsFromEpochlambda0) r5
            java.util.Map r2 = r5.RemoteActionCompatParcelizer
            java.util.Map r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L1d:
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L3a
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L3a
        L2b:
            java.lang.Short r5 = r5.write
            java.lang.Short r2 = r4.write
            if (r2 == r5) goto L3b
            if (r2 == 0) goto L3a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            return r1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomUserAttributeToSecondsFromEpochlambda0.equals(java.lang.Object):boolean");
    }
}

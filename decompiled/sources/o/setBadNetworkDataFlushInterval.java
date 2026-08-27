package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setBadNetworkDataFlushInterval implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8 serializer = new r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8(11);
    public final Integer IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final Integer read;
    public final Map write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        Map map = this.write;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (map == null ? 0 : map.hashCode())) * (-2128831035);
    }

    public setBadNetworkDataFlushInterval(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.RemoteActionCompatParcelizer = (Integer) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.read = (Integer) iscontentcardsunreadvisualindicatorenabled.write;
        this.IconCompatParcelizer = (Integer) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        HashMap map = (HashMap) iscontentcardsunreadvisualindicatorenabled.read;
        this.write = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Segment{segment_category=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", segment_subcategory=");
        sb.append(this.read);
        sb.append(", segment_type=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", attributes=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.IconCompatParcelizer;
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
            boolean r2 = r5 instanceof o.setBadNetworkDataFlushInterval
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setBadNetworkDataFlushInterval r5 = (o.setBadNetworkDataFlushInterval) r5
            java.lang.Integer r2 = r5.RemoteActionCompatParcelizer
            java.lang.Integer r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L1b:
            java.lang.Integer r2 = r5.read
            java.lang.Integer r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L27:
            java.lang.Integer r2 = r5.IconCompatParcelizer
            java.lang.Integer r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L42
        L33:
            java.util.Map r5 = r5.write
            java.util.Map r2 = r4.write
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
        throw new UnsupportedOperationException("Method not decompiled: o.setBadNetworkDataFlushInterval.equals(java.lang.Object):boolean");
    }
}

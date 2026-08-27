package o;

import com.sentiance.core.model.events.N$b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class onActivityCreatedlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeExternalSyntheticLambda5 serializer = new BrazeExternalSyntheticLambda5(18);
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final Byte read;
    public final Map write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        String str = this.IconCompatParcelizer;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Map map = this.write;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (map != null ? map.hashCode() : 0)) * (-2128831035);
    }

    public onActivityCreatedlambda0(N$b n$b) {
        this.RemoteActionCompatParcelizer = (String) n$b.read;
        this.read = (Byte) n$b.IconCompatParcelizer;
        this.IconCompatParcelizer = (String) n$b.write;
        HashMap map = (HashMap) n$b.serializer;
        this.write = map == null ? null : Collections.unmodifiableMap(map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{category=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", severity=");
        sb.append(this.read);
        sb.append(", message=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", data=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.write, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
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
            boolean r2 = r5 instanceof o.onActivityCreatedlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.onActivityCreatedlambda0 r5 = (o.onActivityCreatedlambda0) r5
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L1b:
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L27:
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L44
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L35:
            java.util.Map r5 = r5.write
            java.util.Map r2 = r4.write
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
        throw new UnsupportedOperationException("Method not decompiled: o.onActivityCreatedlambda0.equals(java.lang.Object):boolean");
    }
}

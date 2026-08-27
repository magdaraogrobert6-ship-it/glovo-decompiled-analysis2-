package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeInternal implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final stopInstancelambda11 write = new stopInstancelambda11(24);
    public final Boolean IconCompatParcelizer;
    public final Boolean RemoteActionCompatParcelizer;
    public final Boolean read;
    public final Byte serializer;

    public final int hashCode() {
        Boolean bool = this.RemoteActionCompatParcelizer;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.IconCompatParcelizer;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Byte b = this.serializer;
        int iHashCode3 = b == null ? 0 : b.hashCode();
        Boolean bool3 = this.read;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (bool3 != null ? bool3.hashCode() : 0)) * (-2128831035);
    }

    public BrazeInternal(N$b n$b) {
        this.RemoteActionCompatParcelizer = (Boolean) n$b.read;
        this.IconCompatParcelizer = (Boolean) n$b.write;
        this.serializer = (Byte) n$b.IconCompatParcelizer;
        this.read = (Boolean) n$b.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PowerInfoChangeEvent{battery_optimization_enabled=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", power_saving_enabled=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", standby_bucket=");
        sb.append(this.serializer);
        sb.append(", is_background_restricted=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.read);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
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
            boolean r2 = r5 instanceof o.BrazeInternal
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.BrazeInternal r5 = (o.BrazeInternal) r5
            java.lang.Boolean r2 = r5.RemoteActionCompatParcelizer
            java.lang.Boolean r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L1d:
            java.lang.Boolean r2 = r5.IconCompatParcelizer
            java.lang.Boolean r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L2b:
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L48
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L48
        L39:
            java.lang.Boolean r5 = r5.read
            java.lang.Boolean r2 = r4.read
            if (r2 == r5) goto L49
            if (r2 == 0) goto L48
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BrazeInternal.equals(java.lang.Object):boolean");
    }
}

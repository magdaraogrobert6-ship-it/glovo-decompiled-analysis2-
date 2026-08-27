package o;

import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final stopInstancelambda11 write = new stopInstancelambda11(29);
    public final Byte RemoteActionCompatParcelizer;
    public final Byte read;
    public final Byte serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        Byte b = this.read;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        Byte b2 = this.RemoteActionCompatParcelizer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (b2 != null ? b2.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM(C$b c$b) {
        this.serializer = (Byte) c$b.serializer;
        this.read = (Byte) c$b.write;
        this.RemoteActionCompatParcelizer = (Byte) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BatteryEvent{level=");
        sb.append(this.serializer);
        sb.append(", charging_state=");
        sb.append(this.read);
        sb.append(", charging_method=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.RemoteActionCompatParcelizer, "}");
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
            boolean r2 = r5 instanceof o.r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM r5 = (o.r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM) r5
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
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
            java.lang.Byte r5 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r2 = r4.RemoteActionCompatParcelizer
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
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaX8O0CQVGYSvyuZ1ZQ9WvuF9jtM.equals(java.lang.Object):boolean");
    }
}

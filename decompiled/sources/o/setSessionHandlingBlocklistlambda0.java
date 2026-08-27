package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setSessionHandlingBlocklistlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte RemoteActionCompatParcelizer;
    public final Byte serializer;

    public final int hashCode() {
        Byte b = this.RemoteActionCompatParcelizer;
        int iHashCode = b == null ? 0 : b.hashCode();
        Byte b2 = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (b2 != null ? b2.hashCode() : 0)) * (-2128831035);
    }

    public setSessionHandlingBlocklistlambda0(r8lambdaRBUg8qiONCPYgCSL25Td35Mcmxs r8lambdarbug8qioncpygcsl25td35mcmxs) {
        this.RemoteActionCompatParcelizer = r8lambdarbug8qioncpygcsl25td35mcmxs.IconCompatParcelizer;
        this.serializer = r8lambdarbug8qioncpygcsl25td35mcmxs.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MotionActivityConfidence{ios_confidence=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", android_confidence=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.serializer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.setSessionHandlingBlocklistlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setSessionHandlingBlocklistlambda0 r5 = (o.setSessionHandlingBlocklistlambda0) r5
            java.lang.Byte r2 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Byte r5 = r5.serializer
            java.lang.Byte r2 = r4.serializer
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
        throw new UnsupportedOperationException("Method not decompiled: o.setSessionHandlingBlocklistlambda0.equals(java.lang.Object):boolean");
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributelambda4 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Long serializer;
    public final Byte write;

    public final int hashCode() {
        return (((this.write.hashCode() ^ 16777619) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public setCustomUserAttributelambda4(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.write = (Byte) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        this.serializer = (Long) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        return "ScreenEvent{screen_event_type=" + this.write + ", timestamp=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.setCustomUserAttributelambda4
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomUserAttributelambda4 r5 = (o.setCustomUserAttributelambda4) r5
            java.lang.Byte r2 = r5.write
            java.lang.Byte r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Long r5 = r5.serializer
            java.lang.Long r2 = r4.serializer
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomUserAttributelambda4.equals(java.lang.Object):boolean");
    }
}

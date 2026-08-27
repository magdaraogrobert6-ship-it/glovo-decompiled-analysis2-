package o;

/* JADX INFO: loaded from: classes3.dex */
public final class incrementCustomUserAttributelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY serializer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(10);
    public final incrementCustomUserAttribute IconCompatParcelizer;
    public final setCustomEndpoint write;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public incrementCustomUserAttributelambda0(r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws) {
        this.IconCompatParcelizer = (incrementCustomUserAttribute) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
        this.write = (setCustomEndpoint) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer;
    }

    public final String toString() {
        return "RegisteredPersonEdge{location=" + this.IconCompatParcelizer + ", person=" + this.write + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.incrementCustomUserAttributelambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.incrementCustomUserAttributelambda0 r5 = (o.incrementCustomUserAttributelambda0) r5
            o.incrementCustomUserAttribute r2 = r5.IconCompatParcelizer
            o.incrementCustomUserAttribute r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setCustomEndpoint r5 = r5.write
            o.setCustomEndpoint r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.incrementCustomUserAttributelambda0.equals(java.lang.Object):boolean");
    }
}

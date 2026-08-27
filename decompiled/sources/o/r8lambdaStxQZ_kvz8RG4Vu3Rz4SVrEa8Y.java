package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE IconCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(3);
    public final Boolean RemoteActionCompatParcelizer;
    public final String read;
    public final Boolean serializer;
    public final Boolean write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        Boolean bool = this.serializer;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.write;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.RemoteActionCompatParcelizer;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (bool3 != null ? bool3.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.read = (String) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.serializer = (Boolean) iscontentcardsunreadvisualindicatorenabled.write;
        this.write = (Boolean) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Boolean) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExceptionEvent{stacktrace=");
        sb.append(this.read);
        sb.append(", is_debugger_connected=");
        sb.append(this.serializer);
        sb.append(", is_nonfatal=");
        sb.append(this.write);
        sb.append(", is_native_android_crash=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y r5 = (o.r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L1b:
            java.lang.Boolean r2 = r5.serializer
            java.lang.Boolean r3 = r4.serializer
            if (r3 == r2) goto L29
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L29:
            java.lang.Boolean r2 = r5.write
            java.lang.Boolean r3 = r4.write
            if (r3 == r2) goto L37
            if (r3 == 0) goto L46
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L46
        L37:
            java.lang.Boolean r5 = r5.RemoteActionCompatParcelizer
            java.lang.Boolean r2 = r4.RemoteActionCompatParcelizer
            if (r2 == r5) goto L47
            if (r2 == 0) goto L46
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L46
            goto L47
        L46:
            return r1
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaStxQZ_kvz8RG4Vu3Rz4SVrEa8Y.equals(java.lang.Object):boolean");
    }
}

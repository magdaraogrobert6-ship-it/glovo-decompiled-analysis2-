package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw RemoteActionCompatParcelizer = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(3);
    public final String serializer;
    public final Short write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        String str = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (str == null ? 0 : str.hashCode())) * (-2128831035);
    }

    public r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI(FormBody.Builder builder) {
        this.write = (Short) builder.serializer;
        this.serializer = (String) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimezoneChangeEvent{timezone=");
        sb.append(this.write);
        sb.append(", id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, "}");
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
            boolean r2 = r5 instanceof o.r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI r5 = (o.r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI) r5
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            java.lang.String r5 = r5.serializer
            java.lang.String r2 = r4.serializer
            if (r2 == r5) goto L2b
            if (r2 == 0) goto L2a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            return r1
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.equals(java.lang.Object):boolean");
    }
}

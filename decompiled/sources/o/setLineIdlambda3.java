package o;

import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class setLineIdlambda3 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY serializer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(16);
    public final setLanguagelambda0 IconCompatParcelizer;
    public final setPhoneNumberlambda0 read;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public setLineIdlambda3(FormBody.Builder builder) {
        this.IconCompatParcelizer = (setLanguagelambda0) builder.serializer;
        this.read = (setPhoneNumberlambda0) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        return "SensorProperty{id=" + this.IconCompatParcelizer + ", property=" + this.read + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
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
            boolean r2 = r5 instanceof o.setLineIdlambda3
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLineIdlambda3 r5 = (o.setLineIdlambda3) r5
            o.setLanguagelambda0 r2 = r5.IconCompatParcelizer
            o.setLanguagelambda0 r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            o.setPhoneNumberlambda0 r5 = r5.read
            o.setPhoneNumberlambda0 r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setLineIdlambda3.equals(java.lang.Object):boolean");
    }
}

package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class validateAndStorePushId implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final stopInstancelambda11 RemoteActionCompatParcelizer = new stopInstancelambda11(28);
    public final Long read;
    public final String serializer;
    public final Byte write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        String str = this.serializer;
        return (((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ (str == null ? 0 : str.hashCode())) * (-2128831035);
    }

    public validateAndStorePushId(C$b c$b) {
        this.write = (Byte) c$b.write;
        this.read = (Long) c$b.serializer;
        this.serializer = (String) c$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppTerminationReason{reason=");
        sb.append(this.write);
        sb.append(", timestamp=");
        sb.append(this.read);
        sb.append(", details=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.serializer, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
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
            boolean r2 = r5 instanceof o.validateAndStorePushId
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.validateAndStorePushId r5 = (o.validateAndStorePushId) r5
            java.lang.Byte r2 = r5.write
            java.lang.Byte r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L1b:
            java.lang.Long r2 = r5.read
            java.lang.Long r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L36
        L27:
            java.lang.String r5 = r5.serializer
            java.lang.String r2 = r4.serializer
            if (r2 == r5) goto L37
            if (r2 == 0) goto L36
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            return r1
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.validateAndStorePushId.equals(java.lang.Object):boolean");
    }
}

package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class retryInAppMessage implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte read;
    public final Boolean serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        Boolean bool = this.serializer;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (bool == null ? 0 : bool.hashCode())) * (-2128831035);
    }

    public retryInAppMessage(FormBody.Builder builder) {
        this.read = (Byte) builder.serializer;
        this.serializer = (Boolean) builder.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScreenEvent{type=");
        sb.append(this.read);
        sb.append(", is_keyguard_locked=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.serializer);
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
            boolean r2 = r5 instanceof o.retryInAppMessage
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.retryInAppMessage r5 = (o.retryInAppMessage) r5
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1b:
            java.lang.Boolean r5 = r5.serializer
            java.lang.Boolean r2 = r4.serializer
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
        throw new UnsupportedOperationException("Method not decompiled: o.retryInAppMessage.equals(java.lang.Object):boolean");
    }
}

package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeSuspendlambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte RemoteActionCompatParcelizer;
    public final Boolean read;

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public invokeSuspendlambda0(NetworkBody networkBody) {
        this.RemoteActionCompatParcelizer = (Byte) networkBody.IconCompatParcelizer;
        this.read = (Boolean) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffTheGridEvent{reason=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", enabled=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.read);
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
            boolean r2 = r5 instanceof o.invokeSuspendlambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.invokeSuspendlambda0 r5 = (o.invokeSuspendlambda0) r5
            java.lang.Byte r2 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Boolean r5 = r5.read
            java.lang.Boolean r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.invokeSuspendlambda0.equals(java.lang.Object):boolean");
    }
}

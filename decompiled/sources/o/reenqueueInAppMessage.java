package o;

import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class reenqueueInAppMessage implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final String IconCompatParcelizer;
    public final Byte write;

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() ^ 16777619) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035);
    }

    public reenqueueInAppMessage(NetworkBody networkBody) {
        this.IconCompatParcelizer = (String) networkBody.IconCompatParcelizer;
        this.write = (Byte) networkBody.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppForegroundSessionEvent{id=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", state=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.write, "}");
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
            boolean r2 = r5 instanceof o.reenqueueInAppMessage
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.reenqueueInAppMessage r5 = (o.reenqueueInAppMessage) r5
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Byte r5 = r5.write
            java.lang.Byte r2 = r4.write
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.reenqueueInAppMessage.equals(java.lang.Object):boolean");
    }
}

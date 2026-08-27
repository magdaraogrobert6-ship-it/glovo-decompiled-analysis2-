package o;

import io.socket.parser.IOParser$Decoder;

/* JADX INFO: loaded from: classes3.dex */
public final class IBrazeDeeplinkHandlerIntentFlagPurpose implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public final Byte read;
    public final Long serializer;

    public final int hashCode() {
        return (((this.serializer.hashCode() ^ 16777619) * (-2128831035)) ^ this.read.hashCode()) * (-2128831035);
    }

    public IBrazeDeeplinkHandlerIntentFlagPurpose(IOParser$Decoder iOParser$Decoder) {
        this.serializer = (Long) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.read = (Byte) iOParser$Decoder.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffTheGridStart{start=");
        sb.append(this.serializer);
        sb.append(", reason=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, "}");
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
            boolean r2 = r5 instanceof o.IBrazeDeeplinkHandlerIntentFlagPurpose
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.IBrazeDeeplinkHandlerIntentFlagPurpose r5 = (o.IBrazeDeeplinkHandlerIntentFlagPurpose) r5
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            java.lang.Byte r5 = r5.read
            java.lang.Byte r2 = r4.read
            if (r2 == r5) goto L29
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            return r1
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.IBrazeDeeplinkHandlerIntentFlagPurpose.equals(java.lang.Object):boolean");
    }
}

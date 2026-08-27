package o;

import io.socket.parser.IOParser$Decoder;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY serializer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(4);
    public final Map IconCompatParcelizer;
    public final Byte read;

    public final int hashCode() {
        Map map = this.IconCompatParcelizer;
        int iHashCode = map == null ? 0 : map.hashCode();
        Byte b = this.read;
        return (((iHashCode ^ 16777619) * (-2128831035)) ^ (b != null ? b.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I(IOParser$Decoder iOParser$Decoder) {
        Map map = (Map) iOParser$Decoder.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = map == null ? null : Collections.unmodifiableMap(map);
        this.read = (Byte) iOParser$Decoder.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForcedMovingStateEvent{metadata=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transport_mode_hint=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I r5 = (o.r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I) r5
            java.util.Map r2 = r5.IconCompatParcelizer
            java.util.Map r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L2c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2c
        L1d:
            java.lang.Byte r5 = r5.read
            java.lang.Byte r2 = r4.read
            if (r2 == r5) goto L2d
            if (r2 == 0) goto L2c
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaXnKp5mxO9ACT549dMvGqnYhj0I.equals(java.lang.Object):boolean");
    }
}

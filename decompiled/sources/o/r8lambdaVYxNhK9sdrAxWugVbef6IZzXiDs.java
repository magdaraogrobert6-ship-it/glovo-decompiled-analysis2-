package o;

import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw write = new r8lambdaIOEdR8Z56PU9mv1sxvTOEET1Ziw(4);
    public final Map IconCompatParcelizer;
    public final Map MediaBrowserCompatMediaItem;
    public final List RemoteActionCompatParcelizer;
    public final Integer read;
    public final Byte serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        Byte b = this.serializer;
        int iHashCode3 = b == null ? 0 : b.hashCode();
        List list = this.RemoteActionCompatParcelizer;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Map map = this.MediaBrowserCompatMediaItem;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (map != null ? map.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs(O$b o$b) {
        this.read = (Integer) o$b.write;
        this.IconCompatParcelizer = Collections.unmodifiableMap((HashMap) o$b.RemoteActionCompatParcelizer);
        this.serializer = (Byte) o$b.serializer;
        ArrayList arrayList = (ArrayList) o$b.read;
        this.RemoteActionCompatParcelizer = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        HashMap map = (HashMap) o$b.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = map != null ? Collections.unmodifiableMap(map) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransportClassificationEvent{duration_millis=");
        sb.append(this.read);
        sb.append(", confidences=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transport_mode=");
        sb.append(this.serializer);
        sb.append(", locations=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", confidences_double=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r5 = r5.MediaBrowserCompatMediaItem;
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
            boolean r2 = r5 instanceof o.r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs r5 = (o.r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs) r5
            java.lang.Integer r2 = r5.read
            java.lang.Integer r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L1b:
            java.util.Map r2 = r5.IconCompatParcelizer
            java.util.Map r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L27:
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L52
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L35:
            java.util.List r2 = r5.RemoteActionCompatParcelizer
            java.util.List r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L43
            if (r3 == 0) goto L52
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L43:
            java.util.Map r5 = r5.MediaBrowserCompatMediaItem
            java.util.Map r2 = r4.MediaBrowserCompatMediaItem
            if (r2 == r5) goto L53
            if (r2 == 0) goto L52
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L52
            goto L53
        L52:
            return r1
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.equals(java.lang.Object):boolean");
    }
}

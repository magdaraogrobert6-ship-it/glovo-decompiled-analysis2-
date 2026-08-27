package o;

import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TransportMode;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambday_ceLTp8M_7AEG0ljSnKoUxuAs IconCompatParcelizer = new r8lambday_ceLTp8M_7AEG0ljSnKoUxuAs();
    public final Byte RatingCompat;
    public final Long RemoteActionCompatParcelizer;
    public final TransportMode read;
    public final DetectionTrigger serializer;
    public final Map write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        TransportMode transportMode = this.read;
        int iHashCode3 = transportMode == null ? 0 : transportMode.hashCode();
        Map map = this.write;
        int iHashCode4 = map == null ? 0 : map.hashCode();
        Byte b = this.RatingCompat;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (b != null ? b.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4(O$b o$b) {
        this.RemoteActionCompatParcelizer = (Long) o$b.write;
        this.serializer = (DetectionTrigger) o$b.RemoteActionCompatParcelizer;
        this.read = (TransportMode) o$b.serializer;
        Map map = (Map) o$b.read;
        this.write = map == null ? null : Collections.unmodifiableMap(map);
        this.RatingCompat = (Byte) o$b.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripStart{start=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", trip_open_trigger=");
        sb.append(this.serializer);
        sb.append(", transport_mode_hint=");
        sb.append(this.read);
        sb.append(", metadata=");
        sb.append(this.write);
        sb.append(", trip_start_cause=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.RatingCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r5 = r5.RatingCompat;
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
            boolean r2 = r5 instanceof o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r5 = (o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4) r5
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L1b:
            com.sentiance.core.model.thrift.DetectionTrigger r2 = r5.serializer
            com.sentiance.core.model.thrift.DetectionTrigger r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L27:
            com.sentiance.core.model.thrift.TransportMode r2 = r5.read
            com.sentiance.core.model.thrift.TransportMode r3 = r4.read
            if (r3 == r2) goto L35
            if (r3 == 0) goto L52
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L35:
            java.util.Map r2 = r5.write
            java.util.Map r3 = r4.write
            if (r3 == r2) goto L43
            if (r3 == 0) goto L52
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L43:
            java.lang.Byte r5 = r5.RatingCompat
            java.lang.Byte r2 = r4.RatingCompat
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
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4.equals(java.lang.Object):boolean");
    }
}

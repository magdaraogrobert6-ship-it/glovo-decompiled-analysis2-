package o;

import com.sentiance.core.model.thrift.O$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY write = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(1);
    public final List IconCompatParcelizer;
    public final List MediaSessionCompatQueueItem;
    public final Short RemoteActionCompatParcelizer;
    public final Byte read;
    public final String serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        Short sh = this.RemoteActionCompatParcelizer;
        int iHashCode4 = sh == null ? 0 : sh.hashCode();
        List list = this.MediaSessionCompatQueueItem;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (list != null ? list.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc(O$b o$b) {
        this.serializer = (String) o$b.read;
        this.read = (Byte) o$b.write;
        this.IconCompatParcelizer = Collections.unmodifiableList((List) o$b.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = (Short) o$b.serializer;
        ArrayList arrayList = (ArrayList) o$b.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = arrayList == null ? null : Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StationaryVenueUpdateEvent{stationary_unique_id=");
        sb.append(this.serializer);
        sb.append(", venue_significance=");
        sb.append(this.read);
        sb.append(", venues=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", chosen_venue_type=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", venue_type_probablities=");
        return MediaSessionCompatQueueItem.read(sb, this.MediaSessionCompatQueueItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r5 = r5.MediaSessionCompatQueueItem;
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
            boolean r2 = r5 instanceof o.r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc r5 = (o.r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc) r5
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L1b:
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L27:
            java.util.List r2 = r5.IconCompatParcelizer
            java.util.List r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L33:
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L41
            if (r3 == 0) goto L50
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L50
        L41:
            java.util.List r5 = r5.MediaSessionCompatQueueItem
            java.util.List r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L51
            if (r2 == 0) goto L50
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L50
            goto L51
        L50:
            return r1
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc.equals(java.lang.Object):boolean");
    }
}

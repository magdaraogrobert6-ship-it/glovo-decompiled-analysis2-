package o;

import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeSeriesType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class createNotification implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final BrazeConfigBuilder write = new BrazeConfigBuilder();
    public final List IconCompatParcelizer;
    public final Map MediaSessionCompatQueueItem;
    public final List RemoteActionCompatParcelizer;
    public final TimeSeriesType read;
    public final Long serializer;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        Long l = this.serializer;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        List list = this.RemoteActionCompatParcelizer;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List list2 = this.IconCompatParcelizer;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        Map map = this.MediaSessionCompatQueueItem;
        return (((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ (map != null ? map.hashCode() : 0)) * (-2128831035);
    }

    public createNotification(O$b o$b) {
        this.read = (TimeSeriesType) o$b.RemoteActionCompatParcelizer;
        this.serializer = (Long) o$b.write;
        List list = (List) o$b.serializer;
        this.RemoteActionCompatParcelizer = list == null ? null : Collections.unmodifiableList(list);
        List list2 = (List) o$b.read;
        this.IconCompatParcelizer = list2 == null ? null : Collections.unmodifiableList(list2);
        Map map = (Map) o$b.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = map != null ? Collections.unmodifiableMap(map) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeSeries{type=");
        sb.append(this.read);
        sb.append(", base_timestamp=");
        sb.append(this.serializer);
        sb.append(", base_offsets=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", i16_measurements=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", android_sensor_timestamp_reference_points=");
        return SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(sb, this.MediaSessionCompatQueueItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
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
            boolean r2 = r5 instanceof o.createNotification
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.createNotification r5 = (o.createNotification) r5
            com.sentiance.core.model.thrift.TimeSeriesType r2 = r5.read
            com.sentiance.core.model.thrift.TimeSeriesType r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L54
        L1b:
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L29
            if (r3 == 0) goto L54
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L54
        L29:
            java.util.List r2 = r5.RemoteActionCompatParcelizer
            java.util.List r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L37
            if (r3 == 0) goto L54
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L54
        L37:
            java.util.List r2 = r5.IconCompatParcelizer
            java.util.List r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L45
            if (r3 == 0) goto L54
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L54
        L45:
            java.util.Map r5 = r5.MediaSessionCompatQueueItem
            java.util.Map r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L55
            if (r2 == 0) goto L54
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L54
            goto L55
        L54:
            return r1
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createNotification.equals(java.lang.Object):boolean");
    }
}

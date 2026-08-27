package o;

import com.sentiance.core.model.events.E$b;
import com.sentiance.core.model.events.ThriftBool;

/* JADX INFO: loaded from: classes3.dex */
public final class setConfiguredCustomEndpointandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDeviceDataProviderandroid_sdk_base_release IconCompatParcelizer = new setDeviceDataProviderandroid_sdk_base_release();
    public final Byte MediaMetadataCompat;
    public final Long MediaSessionCompatQueueItem;
    public final Byte RatingCompat;
    public final Byte RemoteActionCompatParcelizer;
    public final ThriftBool read;
    public final Double serializer;
    public final Byte write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        Byte b = this.RemoteActionCompatParcelizer;
        int iHashCode2 = b == null ? 0 : b.hashCode();
        Byte b2 = this.write;
        int iHashCode3 = b2 == null ? 0 : b2.hashCode();
        Double d = this.serializer;
        int iHashCode4 = d == null ? 0 : d.hashCode();
        Long l = this.MediaSessionCompatQueueItem;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Byte b3 = this.RatingCompat;
        int iHashCode6 = b3 == null ? 0 : b3.hashCode();
        Byte b4 = this.MediaMetadataCompat;
        return (((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ (b4 != null ? b4.hashCode() : 0)) * (-2128831035);
    }

    public setConfiguredCustomEndpointandroid_sdk_base_release(E$b e$b) {
        this.read = (ThriftBool) e$b.read;
        this.RemoteActionCompatParcelizer = (Byte) e$b.RemoteActionCompatParcelizer;
        this.write = (Byte) e$b.IconCompatParcelizer;
        this.serializer = (Double) e$b.write;
        this.MediaSessionCompatQueueItem = (Long) e$b.MediaMetadataCompat;
        this.RatingCompat = (Byte) e$b.MediaDescriptionCompat;
        this.MediaMetadataCompat = (Byte) e$b.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HarshDrivingEvaluationEvent{is_harsh_driving=");
        sb.append(this.read);
        sb.append(", type=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", confidence=");
        sb.append(this.write);
        sb.append(", magnitude=");
        sb.append(this.serializer);
        sb.append(", peak_time=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", typeMotorcycle=");
        sb.append(this.RatingCompat);
        sb.append(", confidenceMotorcycle=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.MediaMetadataCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0037, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
    
        r5 = r5.MediaMetadataCompat;
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
            boolean r2 = r5 instanceof o.setConfiguredCustomEndpointandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setConfiguredCustomEndpointandroid_sdk_base_release r5 = (o.setConfiguredCustomEndpointandroid_sdk_base_release) r5
            com.sentiance.core.model.events.ThriftBool r2 = r5.read
            com.sentiance.core.model.events.ThriftBool r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L70
        L1b:
            java.lang.Byte r2 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L29
            if (r3 == 0) goto L70
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L70
        L29:
            java.lang.Byte r2 = r5.write
            java.lang.Byte r3 = r4.write
            if (r3 == r2) goto L37
            if (r3 == 0) goto L70
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L70
        L37:
            java.lang.Double r2 = r5.serializer
            java.lang.Double r3 = r4.serializer
            if (r3 == r2) goto L45
            if (r3 == 0) goto L70
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L70
        L45:
            java.lang.Long r2 = r5.MediaSessionCompatQueueItem
            java.lang.Long r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L53
            if (r3 == 0) goto L70
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L70
        L53:
            java.lang.Byte r2 = r5.RatingCompat
            java.lang.Byte r3 = r4.RatingCompat
            if (r3 == r2) goto L61
            if (r3 == 0) goto L70
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L70
        L61:
            java.lang.Byte r5 = r5.MediaMetadataCompat
            java.lang.Byte r2 = r4.MediaMetadataCompat
            if (r2 == r5) goto L71
            if (r2 == 0) goto L70
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L70
            goto L71
        L70:
            return r1
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setConfiguredCustomEndpointandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}

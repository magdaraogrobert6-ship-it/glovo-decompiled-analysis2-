package o;

import com.sentiance.core.model.thrift.DetectionTrigger;

/* JADX INFO: loaded from: classes3.dex */
public final class setApiKeyandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setAutomaticGeofenceRequestsEnabledandroid_sdk_base_release write = new setAutomaticGeofenceRequestsEnabledandroid_sdk_base_release();
    public final Byte IconCompatParcelizer;
    public final DetectionTrigger RemoteActionCompatParcelizer;
    public final Byte read;
    public final Long serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        Byte b = this.IconCompatParcelizer;
        int iHashCode3 = b == null ? 0 : b.hashCode();
        Byte b2 = this.read;
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ (b2 != null ? b2.hashCode() : 0)) * (-2128831035);
    }

    public setApiKeyandroid_sdk_base_release(isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled) {
        this.serializer = (Long) iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (DetectionTrigger) iscontentcardsunreadvisualindicatorenabled.write;
        this.IconCompatParcelizer = (Byte) iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
        this.read = (Byte) iscontentcardsunreadvisualindicatorenabled.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TripEnd{stop=");
        sb.append(this.serializer);
        sb.append(", trip_close_trigger=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", close_reason=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", trip_stop_cause=");
        return MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.read, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
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
            boolean r2 = r5 instanceof o.setApiKeyandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setApiKeyandroid_sdk_base_release r5 = (o.setApiKeyandroid_sdk_base_release) r5
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L1b:
            com.sentiance.core.model.thrift.DetectionTrigger r2 = r5.RemoteActionCompatParcelizer
            com.sentiance.core.model.thrift.DetectionTrigger r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L27:
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L44
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L44
        L35:
            java.lang.Byte r5 = r5.read
            java.lang.Byte r2 = r4.read
            if (r2 == r5) goto L45
            if (r2 == 0) goto L44
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L44
            goto L45
        L44:
            return r1
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setApiKeyandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}

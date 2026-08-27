package o;

import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE read = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(2);
    public final publishBrazePushAction IconCompatParcelizer;
    public final Byte RemoteActionCompatParcelizer;
    public final r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I serializer;
    public final logPushCampaign write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        return (((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ this.write.hashCode()) * (-2128831035)) ^ this.serializer.hashCode()) * (-2128831035);
    }

    public r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q(N$b n$b) {
        this.RemoteActionCompatParcelizer = (Byte) n$b.IconCompatParcelizer;
        this.IconCompatParcelizer = (publishBrazePushAction) n$b.read;
        this.write = (logPushCampaign) n$b.write;
        this.serializer = (r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I) n$b.serializer;
    }

    public final String toString() {
        return "StatusUpdateEvent{trigger=" + this.RemoteActionCompatParcelizer + ", sdk_status=" + this.IconCompatParcelizer + ", app_status=" + this.write + ", device_status=" + this.serializer + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r5 = r5.serializer;
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
            boolean r2 = r5 instanceof o.r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r5 = (o.r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q) r5
            java.lang.Byte r2 = r5.RemoteActionCompatParcelizer
            java.lang.Byte r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L1b:
            o.publishBrazePushAction r2 = r5.IconCompatParcelizer
            o.publishBrazePushAction r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L27:
            o.logPushCampaign r2 = r5.write
            o.logPushCampaign r3 = r4.write
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L40
        L33:
            o.r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I r5 = r5.serializer
            o.r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I r2 = r4.serializer
            if (r2 == r5) goto L41
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L40
            goto L41
        L40:
            return r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q.equals(java.lang.Object):boolean");
    }
}

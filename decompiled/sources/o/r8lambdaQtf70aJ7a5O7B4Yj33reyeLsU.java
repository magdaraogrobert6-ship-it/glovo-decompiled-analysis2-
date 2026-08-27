package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE read = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(0);
    public final Integer IconCompatParcelizer;
    public final Long MediaDescriptionCompat;
    public final Long MediaSessionCompatQueueItem;
    public final Long RemoteActionCompatParcelizer;
    public final r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA serializer;
    public final Long write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.serializer.hashCode();
        Integer num = this.IconCompatParcelizer;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Long l = this.MediaSessionCompatQueueItem;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        Long l2 = this.MediaDescriptionCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (l2 != null ? l2.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU(r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm) {
        this.write = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.serializer;
        this.RemoteActionCompatParcelizer = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.read;
        this.serializer = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write;
        this.IconCompatParcelizer = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        return "Event{ingestion_time=" + this.write + ", event_time=" + this.RemoteActionCompatParcelizer + ", event_property=" + this.serializer + ", correlation_id=" + this.IconCompatParcelizer + ", event_id=" + this.MediaSessionCompatQueueItem + ", triggering_event_id=" + this.MediaDescriptionCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        r5 = r5.MediaDescriptionCompat;
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
            boolean r2 = r5 instanceof o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r5 = (o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU) r5
            java.lang.Long r2 = r5.write
            java.lang.Long r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L1b:
            java.lang.Long r2 = r5.RemoteActionCompatParcelizer
            java.lang.Long r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L27:
            o.r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r2 = r5.serializer
            o.r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r3 = r4.serializer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L33:
            java.lang.Integer r2 = r5.IconCompatParcelizer
            java.lang.Integer r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L41
            if (r3 == 0) goto L5e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L41:
            java.lang.Long r2 = r5.MediaSessionCompatQueueItem
            java.lang.Long r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L4f
            if (r3 == 0) goto L5e
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5e
        L4f:
            java.lang.Long r5 = r5.MediaDescriptionCompat
            java.lang.Long r2 = r4.MediaDescriptionCompat
            if (r2 == r5) goto L5f
            if (r2 == 0) goto L5e
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            return r1
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU.equals(java.lang.Object):boolean");
    }
}

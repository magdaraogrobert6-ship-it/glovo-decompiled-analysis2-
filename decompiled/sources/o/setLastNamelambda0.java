package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastNamelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE IconCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(15);
    public final Integer MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final Long PlaybackStateCompat;
    public final Long PlaybackStateCompatCustomAction;
    public final setLanguagelambda1 RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.read.hashCode();
        String str = this.serializer;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaSessionCompatQueueItem;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        int iHashCode6 = this.MediaDescriptionCompat.hashCode();
        int iHashCode7 = this.MediaMetadataCompat.hashCode();
        int iHashCode8 = this.MediaBrowserCompatMediaItem.hashCode();
        return (((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ this.RatingCompat.hashCode()) * (-2128831035)) ^ this.PlaybackStateCompat.hashCode()) * (-2128831035)) ^ this.PlaybackStateCompatCustomAction.hashCode()) * (-2128831035);
    }

    public setLastNamelambda0(setCountrylambda1 setcountrylambda1) {
        this.RemoteActionCompatParcelizer = (String) setcountrylambda1.RemoteActionCompatParcelizer;
        this.write = (String) setcountrylambda1.read;
        this.read = (String) setcountrylambda1.write;
        this.serializer = (String) setcountrylambda1.MediaSessionCompatQueueItem;
        this.MediaSessionCompatQueueItem = (String) setcountrylambda1.MediaMetadataCompat;
        this.MediaDescriptionCompat = (String) setcountrylambda1.RatingCompat;
        this.MediaMetadataCompat = (String) setcountrylambda1.PlaybackStateCompatCustomAction;
        this.MediaBrowserCompatMediaItem = (Integer) setcountrylambda1.IconCompatParcelizer;
        this.RatingCompat = (setLanguagelambda1) setcountrylambda1.serializer;
        this.PlaybackStateCompat = (Long) setcountrylambda1.MediaBrowserCompatMediaItem;
        this.PlaybackStateCompatCustomAction = (Long) setcountrylambda1.MediaDescriptionCompat;
    }

    public final String toString() {
        return "SensorMessage{type=" + this.RemoteActionCompatParcelizer + ", mid=" + this.write + ", uid=" + this.read + ", cid=" + this.serializer + ", ddid=" + this.MediaSessionCompatQueueItem + ", sdid=" + this.MediaDescriptionCompat + ", sdtid=" + this.MediaMetadataCompat + ", mv=" + this.MediaBrowserCompatMediaItem + ", data=" + this.RatingCompat + ", ts=" + this.PlaybackStateCompat + ", cts=" + this.PlaybackStateCompatCustomAction + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007f, code lost:
    
        r2 = r5.PlaybackStateCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008b, code lost:
    
        r5 = r5.PlaybackStateCompatCustomAction;
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
            boolean r2 = r5 instanceof o.setLastNamelambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLastNamelambda0 r5 = (o.setLastNamelambda0) r5
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L1b:
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L27:
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L33:
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L41
            if (r3 == 0) goto L98
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L41:
            java.lang.String r2 = r5.MediaSessionCompatQueueItem
            java.lang.String r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L4f
            if (r3 == 0) goto L98
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L4f:
            java.lang.String r2 = r5.MediaDescriptionCompat
            java.lang.String r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L5b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L5b:
            java.lang.String r2 = r5.MediaMetadataCompat
            java.lang.String r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L67
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L67:
            java.lang.Integer r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Integer r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L73
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L73:
            o.setLanguagelambda1 r2 = r5.RatingCompat
            o.setLanguagelambda1 r3 = r4.RatingCompat
            if (r3 == r2) goto L7f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L7f:
            java.lang.Long r2 = r5.PlaybackStateCompat
            java.lang.Long r3 = r4.PlaybackStateCompat
            if (r3 == r2) goto L8b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L98
        L8b:
            java.lang.Long r5 = r5.PlaybackStateCompatCustomAction
            java.lang.Long r2 = r4.PlaybackStateCompatCustomAction
            if (r2 == r5) goto L99
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L98
            goto L99
        L98:
            return r1
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setLastNamelambda0.equals(java.lang.Object):boolean");
    }
}

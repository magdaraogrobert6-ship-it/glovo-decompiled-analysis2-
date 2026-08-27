package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomAttributelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE read = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(11);
    public final Byte IconCompatParcelizer;
    public final Boolean MediaBrowserCompatMediaItem;
    public final Boolean MediaDescriptionCompat;
    public final Boolean MediaMetadataCompat;
    public final Byte MediaSessionCompatQueueItem;
    public final Boolean MediaSessionCompatToken;
    public final Byte PlaybackStateCompatCustomAction;
    public final Byte RatingCompat;
    public final Boolean RemoteActionCompatParcelizer;
    public final Boolean serializer;
    public final Boolean write;

    public final int hashCode() {
        Boolean bool = this.serializer;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.write;
        int iHashCode3 = bool3 == null ? 0 : bool3.hashCode();
        Byte b = this.IconCompatParcelizer;
        int iHashCode4 = b == null ? 0 : b.hashCode();
        Byte b2 = this.MediaSessionCompatQueueItem;
        int iHashCode5 = b2 == null ? 0 : b2.hashCode();
        Boolean bool4 = this.MediaMetadataCompat;
        int iHashCode6 = bool4 == null ? 0 : bool4.hashCode();
        Boolean bool5 = this.MediaDescriptionCompat;
        int iHashCode7 = bool5 == null ? 0 : bool5.hashCode();
        Byte b3 = this.RatingCompat;
        int iHashCode8 = b3 == null ? 0 : b3.hashCode();
        Boolean bool6 = this.MediaBrowserCompatMediaItem;
        int iHashCode9 = bool6 == null ? 0 : bool6.hashCode();
        Byte b4 = this.PlaybackStateCompatCustomAction;
        int iHashCode10 = b4 == null ? 0 : b4.hashCode();
        Boolean bool7 = this.MediaSessionCompatToken;
        return (((((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ iHashCode10) * (-2128831035)) ^ (bool7 != null ? bool7.hashCode() : 0)) * (-2128831035);
    }

    public setCustomAttributelambda0(setCountrylambda1 setcountrylambda1) {
        this.serializer = (Boolean) setcountrylambda1.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (Boolean) setcountrylambda1.read;
        this.write = (Boolean) setcountrylambda1.write;
        this.IconCompatParcelizer = (Byte) setcountrylambda1.IconCompatParcelizer;
        this.MediaSessionCompatQueueItem = (Byte) setcountrylambda1.serializer;
        this.MediaMetadataCompat = (Boolean) setcountrylambda1.MediaSessionCompatQueueItem;
        this.MediaDescriptionCompat = (Boolean) setcountrylambda1.MediaMetadataCompat;
        this.RatingCompat = (Byte) setcountrylambda1.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = (Boolean) setcountrylambda1.RatingCompat;
        this.PlaybackStateCompatCustomAction = (Byte) setcountrylambda1.MediaDescriptionCompat;
        this.MediaSessionCompatToken = (Boolean) setcountrylambda1.PlaybackStateCompatCustomAction;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceConfig{battery_optimization_enabled=");
        sb.append(this.serializer);
        sb.append(", power_saving_enabled=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", is_background_restricted=");
        sb.append(this.write);
        sb.append(", standby_bucket=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", location_mode=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", activity_recognition_perm_granted=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", notifications_allowed=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", location_authorization_status=");
        sb.append(this.RatingCompat);
        sb.append(", scheduling_exact_alarms_allowed=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", location_accuracy_authorization=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", auto_reset_permissions_enabled=");
        return c8$$ExternalSyntheticOutline0.m(sb, "}", this.MediaSessionCompatToken);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        r2 = r5.PlaybackStateCompatCustomAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009b, code lost:
    
        r5 = r5.MediaSessionCompatToken;
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
            boolean r2 = r5 instanceof o.setCustomAttributelambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomAttributelambda0 r5 = (o.setCustomAttributelambda0) r5
            java.lang.Boolean r2 = r5.serializer
            java.lang.Boolean r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L1d:
            java.lang.Boolean r2 = r5.RemoteActionCompatParcelizer
            java.lang.Boolean r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L2b:
            java.lang.Boolean r2 = r5.write
            java.lang.Boolean r3 = r4.write
            if (r3 == r2) goto L39
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L39:
            java.lang.Byte r2 = r5.IconCompatParcelizer
            java.lang.Byte r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L47:
            java.lang.Byte r2 = r5.MediaSessionCompatQueueItem
            java.lang.Byte r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L55
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L55:
            java.lang.Boolean r2 = r5.MediaMetadataCompat
            java.lang.Boolean r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L63
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L63:
            java.lang.Boolean r2 = r5.MediaDescriptionCompat
            java.lang.Boolean r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L71
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L71:
            java.lang.Byte r2 = r5.RatingCompat
            java.lang.Byte r3 = r4.RatingCompat
            if (r3 == r2) goto L7f
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L7f:
            java.lang.Boolean r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Boolean r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L8d
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L8d:
            java.lang.Byte r2 = r5.PlaybackStateCompatCustomAction
            java.lang.Byte r3 = r4.PlaybackStateCompatCustomAction
            if (r3 == r2) goto L9b
            if (r3 == 0) goto Laa
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Laa
        L9b:
            java.lang.Boolean r5 = r5.MediaSessionCompatToken
            java.lang.Boolean r2 = r4.MediaSessionCompatToken
            if (r2 == r5) goto Lab
            if (r2 == 0) goto Laa
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto Laa
            goto Lab
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomAttributelambda0.equals(java.lang.Object):boolean");
    }
}

package o;

import com.sentiance.core.model.events.i$c;
import com.sentiance.core.model.thrift.ThriftBool;

/* JADX INFO: loaded from: classes3.dex */
public final class setPhoneNumber implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setLastName IconCompatParcelizer = new setLastName();
    public final Byte MediaBrowserCompatMediaItem;
    public final ThriftBool MediaDescriptionCompat;
    public final ThriftBool MediaMetadataCompat;
    public final ThriftBool MediaSessionCompatQueueItem;
    public final ThriftBool RatingCompat;
    public final ThriftBool RemoteActionCompatParcelizer;
    public final Byte read;
    public final ThriftBool serializer;
    public final ThriftBool write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.write.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        ThriftBool thriftBool = this.serializer;
        int iHashCode4 = thriftBool == null ? 0 : thriftBool.hashCode();
        ThriftBool thriftBool2 = this.MediaDescriptionCompat;
        int iHashCode5 = thriftBool2 == null ? 0 : thriftBool2.hashCode();
        ThriftBool thriftBool3 = this.MediaMetadataCompat;
        int iHashCode6 = thriftBool3 == null ? 0 : thriftBool3.hashCode();
        Byte b = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = b == null ? 0 : b.hashCode();
        ThriftBool thriftBool4 = this.RatingCompat;
        int iHashCode8 = thriftBool4 == null ? 0 : thriftBool4.hashCode();
        ThriftBool thriftBool5 = this.MediaSessionCompatQueueItem;
        return (((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ (thriftBool5 != null ? thriftBool5.hashCode() : 0)) * (-2128831035);
    }

    public setPhoneNumber(i$c i_c) {
        this.read = (Byte) i_c.write;
        this.write = (ThriftBool) i_c.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = (ThriftBool) i_c.serializer;
        this.serializer = (ThriftBool) i_c.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = (ThriftBool) i_c.read;
        this.MediaMetadataCompat = (ThriftBool) i_c.RatingCompat;
        this.MediaBrowserCompatMediaItem = (Byte) i_c.MediaMetadataCompat;
        this.RatingCompat = (ThriftBool) i_c.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem = (ThriftBool) i_c.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        return "AppStatus{location_authorization_status=" + this.read + ", is_precise_location_permission_granted=" + this.write + ", is_activity_recognition_permission_granted=" + this.RemoteActionCompatParcelizer + ", is_android_battery_optimization_enabled=" + this.serializer + ", is_android_background_app_processing_restricted=" + this.MediaDescriptionCompat + ", is_android_alarm_scheduling_enabled=" + this.MediaMetadataCompat + ", android_app_standby_bucket=" + this.MediaBrowserCompatMediaItem + ", is_disk_quota_low=" + this.RatingCompat + ", is_background_refresh_enabled=" + this.MediaSessionCompatQueueItem + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0079, code lost:
    
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
            boolean r2 = r5 instanceof o.setPhoneNumber
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setPhoneNumber r5 = (o.setPhoneNumber) r5
            java.lang.Byte r2 = r5.read
            java.lang.Byte r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L1b:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.write
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L27:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.RemoteActionCompatParcelizer
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L33:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.serializer
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.serializer
            if (r3 == r2) goto L41
            if (r3 == 0) goto L88
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L41:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.MediaDescriptionCompat
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L4f
            if (r3 == 0) goto L88
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L4f:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.MediaMetadataCompat
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L5d
            if (r3 == 0) goto L88
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L5d:
            java.lang.Byte r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Byte r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L6b
            if (r3 == 0) goto L88
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L6b:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.RatingCompat
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.RatingCompat
            if (r3 == r2) goto L79
            if (r3 == 0) goto L88
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L88
        L79:
            com.sentiance.core.model.thrift.ThriftBool r5 = r5.MediaSessionCompatQueueItem
            com.sentiance.core.model.thrift.ThriftBool r2 = r4.MediaSessionCompatQueueItem
            if (r2 == r5) goto L89
            if (r2 == 0) goto L88
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L88
            goto L89
        L88:
            return r1
        L89:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPhoneNumber.equals(java.lang.Object):boolean");
    }
}

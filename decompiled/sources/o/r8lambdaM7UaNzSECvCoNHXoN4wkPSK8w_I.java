package o;

import com.sentiance.core.model.events.ThriftBool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaJjL4oPUfHNgx_ma2tJ0ZBEvFgLA write = new r8lambdaJjL4oPUfHNgx_ma2tJ0ZBEvFgLA();
    public final onActivityPausedlambda0 IconCompatParcelizer;
    public final ThriftBool MediaBrowserCompatMediaItem;
    public final registerOnApplicationlambda0 MediaDescriptionCompat;
    public final ThriftBool MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final ThriftBool MediaSessionCompatToken;
    public final ThriftBool RatingCompat;
    public final ThriftBool RemoteActionCompatParcelizer;
    public final ThriftBool read;
    public final ThriftBool serializer;

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.read.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int iHashCode5 = this.MediaDescriptionCompat.hashCode();
        ThriftBool thriftBool = this.RatingCompat;
        int iHashCode6 = thriftBool == null ? 0 : thriftBool.hashCode();
        List list = this.MediaSessionCompatQueueItem;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        ThriftBool thriftBool2 = this.MediaBrowserCompatMediaItem;
        int iHashCode8 = thriftBool2 == null ? 0 : thriftBool2.hashCode();
        ThriftBool thriftBool3 = this.MediaMetadataCompat;
        int iHashCode9 = thriftBool3 == null ? 0 : thriftBool3.hashCode();
        ThriftBool thriftBool4 = this.MediaSessionCompatToken;
        return (((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ (thriftBool4 != null ? thriftBool4.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I(r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q) {
        this.serializer = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.serializer;
        this.RemoteActionCompatParcelizer = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer;
        this.read = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.write;
        this.IconCompatParcelizer = (onActivityPausedlambda0) r8lambdabirsljoagmyxhikohl5z5hht12q.read;
        this.MediaDescriptionCompat = (registerOnApplicationlambda0) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat;
        this.RatingCompat = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat;
        ArrayList arrayList = (ArrayList) r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.MediaBrowserCompatMediaItem = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem;
        this.MediaMetadataCompat = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem;
        this.MediaSessionCompatToken = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat;
    }

    public final String toString() {
        return "DeviceStatus{is_accelerometer_available=" + this.serializer + ", is_gyroscope_available=" + this.RemoteActionCompatParcelizer + ", is_device_power_saving_mode_enabled=" + this.read + ", low_battery_level_state=" + this.IconCompatParcelizer + ", low_disk_space_state=" + this.MediaDescriptionCompat + ", is_device_overheated=" + this.RatingCompat + ", enabled_android_location_providers=" + this.MediaSessionCompatQueueItem + ", is_airplane_mode_enabled=" + this.MediaBrowserCompatMediaItem + ", is_google_play_services_available=" + this.MediaMetadataCompat + ", is_cellular_service_available=" + this.MediaSessionCompatToken + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0075, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I r5 = (o.r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I) r5
            com.sentiance.core.model.events.ThriftBool r2 = r5.serializer
            com.sentiance.core.model.events.ThriftBool r3 = r4.serializer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L1b:
            com.sentiance.core.model.events.ThriftBool r2 = r5.RemoteActionCompatParcelizer
            com.sentiance.core.model.events.ThriftBool r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L27:
            com.sentiance.core.model.events.ThriftBool r2 = r5.read
            com.sentiance.core.model.events.ThriftBool r3 = r4.read
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L33:
            o.onActivityPausedlambda0 r2 = r5.IconCompatParcelizer
            o.onActivityPausedlambda0 r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L3f:
            o.registerOnApplicationlambda0 r2 = r5.MediaDescriptionCompat
            o.registerOnApplicationlambda0 r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L4b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L4b:
            com.sentiance.core.model.events.ThriftBool r2 = r5.RatingCompat
            com.sentiance.core.model.events.ThriftBool r3 = r4.RatingCompat
            if (r3 == r2) goto L59
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L59:
            java.util.List r2 = r5.MediaSessionCompatQueueItem
            java.util.List r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L67
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L67:
            com.sentiance.core.model.events.ThriftBool r2 = r5.MediaBrowserCompatMediaItem
            com.sentiance.core.model.events.ThriftBool r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L75
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L75:
            com.sentiance.core.model.events.ThriftBool r2 = r5.MediaMetadataCompat
            com.sentiance.core.model.events.ThriftBool r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L83
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L83:
            com.sentiance.core.model.events.ThriftBool r5 = r5.MediaSessionCompatToken
            com.sentiance.core.model.events.ThriftBool r2 = r4.MediaSessionCompatToken
            if (r2 == r5) goto L93
            if (r2 == 0) goto L92
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L92
            goto L93
        L92:
            return r1
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I.equals(java.lang.Object):boolean");
    }
}

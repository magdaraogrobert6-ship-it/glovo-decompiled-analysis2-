package o;

import com.sentiance.core.model.thrift.ThriftBool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setCustomUserAttributelambda2 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomUserAttributelambda6 serializer = new setCustomUserAttributelambda6();
    public final ThriftBool IconCompatParcelizer;
    public final List MediaBrowserCompatMediaItem;
    public final ThriftBool MediaDescriptionCompat;
    public final ThriftBool MediaMetadataCompat;
    public final setEmailNotificationSubscriptionType MediaSessionCompatQueueItem;
    public final ThriftBool PlaybackStateCompat;
    public final Byte RatingCompat;
    public final setCustomAttributeToSecondsFromEpoch RemoteActionCompatParcelizer;
    public final ThriftBool read;
    public final ThriftBool write;

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode5 = this.MediaSessionCompatQueueItem.hashCode();
        Byte b = this.RatingCompat;
        int iHashCode6 = b == null ? 0 : b.hashCode();
        List list = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        ThriftBool thriftBool = this.MediaDescriptionCompat;
        int iHashCode8 = thriftBool == null ? 0 : thriftBool.hashCode();
        ThriftBool thriftBool2 = this.MediaMetadataCompat;
        int iHashCode9 = thriftBool2 == null ? 0 : thriftBool2.hashCode();
        ThriftBool thriftBool3 = this.PlaybackStateCompat;
        return (((((((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ iHashCode8) * (-2128831035)) ^ iHashCode9) * (-2128831035)) ^ (thriftBool3 != null ? thriftBool3.hashCode() : 0)) * (-2128831035);
    }

    public setCustomUserAttributelambda2(r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q) {
        this.IconCompatParcelizer = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.serializer;
        this.read = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer;
        this.write = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.write;
        this.RemoteActionCompatParcelizer = (setCustomAttributeToSecondsFromEpoch) r8lambdabirsljoagmyxhikohl5z5hht12q.read;
        this.MediaSessionCompatQueueItem = (setEmailNotificationSubscriptionType) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat;
        this.RatingCompat = (Byte) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat;
        ArrayList arrayList = (ArrayList) r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.MediaDescriptionCompat = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat;
        this.MediaMetadataCompat = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem;
        this.PlaybackStateCompat = (ThriftBool) r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        return "DeviceStatus{is_accelerometer_available=" + this.IconCompatParcelizer + ", is_gyroscope_available=" + this.read + ", is_device_power_saving_mode_enabled=" + this.write + ", low_battery_level_state=" + this.RemoteActionCompatParcelizer + ", low_disk_space_state=" + this.MediaSessionCompatQueueItem + ", device_thermal_state=" + this.RatingCompat + ", enabled_android_location_providers=" + this.MediaBrowserCompatMediaItem + ", is_airplane_mode_enabled=" + this.MediaDescriptionCompat + ", is_google_play_services_available=" + this.MediaMetadataCompat + ", is_cellular_service_available=" + this.PlaybackStateCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0075, code lost:
    
        r2 = r5.MediaMetadataCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        r5 = r5.PlaybackStateCompat;
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
            boolean r2 = r5 instanceof o.setCustomUserAttributelambda2
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setCustomUserAttributelambda2 r5 = (o.setCustomUserAttributelambda2) r5
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.IconCompatParcelizer
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L1b:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.read
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L27:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.write
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.write
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L33:
            o.setCustomAttributeToSecondsFromEpoch r2 = r5.RemoteActionCompatParcelizer
            o.setCustomAttributeToSecondsFromEpoch r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L3f:
            o.setEmailNotificationSubscriptionType r2 = r5.MediaSessionCompatQueueItem
            o.setEmailNotificationSubscriptionType r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L4b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L4b:
            java.lang.Byte r2 = r5.RatingCompat
            java.lang.Byte r3 = r4.RatingCompat
            if (r3 == r2) goto L59
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L59:
            java.util.List r2 = r5.MediaBrowserCompatMediaItem
            java.util.List r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L67
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L67:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.MediaDescriptionCompat
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L75
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L75:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.MediaMetadataCompat
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.MediaMetadataCompat
            if (r3 == r2) goto L83
            if (r3 == 0) goto L92
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L92
        L83:
            com.sentiance.core.model.thrift.ThriftBool r5 = r5.PlaybackStateCompat
            com.sentiance.core.model.thrift.ThriftBool r2 = r4.PlaybackStateCompat
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
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomUserAttributelambda2.equals(java.lang.Object):boolean");
    }
}

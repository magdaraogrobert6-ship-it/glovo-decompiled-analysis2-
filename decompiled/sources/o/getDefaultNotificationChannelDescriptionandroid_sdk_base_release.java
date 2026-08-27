package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultNotificationChannelDescriptionandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8 read = new r8lambdaltuDxAr7dAFDPcRiZGPl8tHLtE8(1);
    public final Map IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final Boolean RatingCompat;
    public final setAutomaticGeofenceRequestsEnabled RemoteActionCompatParcelizer;
    public final Short serializer;
    public final Short write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.serializer.hashCode();
        Map map = this.IconCompatParcelizer;
        int iHashCode3 = map == null ? 0 : map.hashCode();
        setAutomaticGeofenceRequestsEnabled setautomaticgeofencerequestsenabled = this.RemoteActionCompatParcelizer;
        int iHashCode4 = setautomaticgeofencerequestsenabled == null ? 0 : setautomaticgeofencerequestsenabled.hashCode();
        Boolean bool = this.RatingCompat;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str = this.MediaDescriptionCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (str != null ? str.hashCode() : 0)) * (-2128831035);
    }

    public getDefaultNotificationChannelDescriptionandroid_sdk_base_release(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.write = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.serializer = (Short) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        HashMap map = (HashMap) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.IconCompatParcelizer = map == null ? null : Collections.unmodifiableMap(map);
        this.RemoteActionCompatParcelizer = (setAutomaticGeofenceRequestsEnabled) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
        this.RatingCompat = (Boolean) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashDetectionConfiguration{max_speed_after_crash=");
        sb.append(this.write);
        sb.append(", min_speed_before_crash=");
        sb.append(this.serializer);
        sb.append(", peak_check_config=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", peak_triggered_location_request=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", use_two_wheeler_crash_detector_instead_of_car=");
        sb.append(this.RatingCompat);
        sb.append(", min_severity_for_valid_crash=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaDescriptionCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
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
            boolean r2 = r5 instanceof o.getDefaultNotificationChannelDescriptionandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getDefaultNotificationChannelDescriptionandroid_sdk_base_release r5 = (o.getDefaultNotificationChannelDescriptionandroid_sdk_base_release) r5
            java.lang.Short r2 = r5.write
            java.lang.Short r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L1b:
            java.lang.Short r2 = r5.serializer
            java.lang.Short r3 = r4.serializer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L27:
            java.util.Map r2 = r5.IconCompatParcelizer
            java.util.Map r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L35:
            o.setAutomaticGeofenceRequestsEnabled r2 = r5.RemoteActionCompatParcelizer
            o.setAutomaticGeofenceRequestsEnabled r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L43
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L43:
            java.lang.Boolean r2 = r5.RatingCompat
            java.lang.Boolean r3 = r4.RatingCompat
            if (r3 == r2) goto L51
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L51:
            java.lang.String r5 = r5.MediaDescriptionCompat
            java.lang.String r2 = r4.MediaDescriptionCompat
            if (r2 == r5) goto L61
            if (r2 == 0) goto L60
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L60
            goto L61
        L60:
            return r1
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDefaultNotificationChannelDescriptionandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}

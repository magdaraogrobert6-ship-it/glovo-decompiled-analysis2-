package o;

import com.sentiance.core.model.events.E$b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setDefaultNotificationChannelNameandroid_sdk_base_release write = new setDefaultNotificationChannelNameandroid_sdk_base_release(3);
    public final getGoodNetworkIntervalandroid_sdk_base_release IconCompatParcelizer;
    public final Short MediaBrowserCompatMediaItem;
    public final Short MediaSessionCompatQueueItem;
    public final Short RatingCompat;
    public final Short RemoteActionCompatParcelizer;
    public final List read;
    public final Byte serializer;

    public final int hashCode() {
        getGoodNetworkIntervalandroid_sdk_base_release getgoodnetworkintervalandroid_sdk_base_release = this.IconCompatParcelizer;
        int iHashCode = getgoodnetworkintervalandroid_sdk_base_release == null ? 0 : getgoodnetworkintervalandroid_sdk_base_release.hashCode();
        List list = this.read;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Short sh = this.RemoteActionCompatParcelizer;
        int iHashCode3 = sh == null ? 0 : sh.hashCode();
        Byte b = this.serializer;
        int iHashCode4 = b == null ? 0 : b.hashCode();
        Short sh2 = this.MediaSessionCompatQueueItem;
        int iHashCode5 = sh2 == null ? 0 : sh2.hashCode();
        Short sh3 = this.MediaBrowserCompatMediaItem;
        int iHashCode6 = sh3 == null ? 0 : sh3.hashCode();
        Short sh4 = this.RatingCompat;
        return (((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ (sh4 != null ? sh4.hashCode() : 0)) * (-2128831035);
    }

    public getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release(E$b e$b) {
        this.IconCompatParcelizer = (getGoodNetworkIntervalandroid_sdk_base_release) e$b.read;
        ArrayList arrayList = (ArrayList) e$b.IconCompatParcelizer;
        this.read = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.RemoteActionCompatParcelizer = (Short) e$b.MediaDescriptionCompat;
        this.serializer = (Byte) e$b.RemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = (Short) e$b.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = (Short) e$b.write;
        this.RatingCompat = (Short) e$b.MediaMetadataCompat;
    }

    public final String toString() {
        return "CrashEvent{location=" + this.IconCompatParcelizer + ", models=" + this.read + ", max_magnitude=" + this.RemoteActionCompatParcelizer + ", confidence=" + this.serializer + ", speed_at_impact=" + this.MediaSessionCompatQueueItem + ", delta_v=" + this.MediaBrowserCompatMediaItem + ", max_magnitude_g=" + this.RatingCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r5 = r5.RatingCompat;
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
            boolean r2 = r5 instanceof o.getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release r5 = (o.getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release) r5
            o.getGoodNetworkIntervalandroid_sdk_base_release r2 = r5.IconCompatParcelizer
            o.getGoodNetworkIntervalandroid_sdk_base_release r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L1d:
            java.util.List r2 = r5.read
            java.util.List r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L2b:
            java.lang.Short r2 = r5.RemoteActionCompatParcelizer
            java.lang.Short r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L39:
            java.lang.Byte r2 = r5.serializer
            java.lang.Byte r3 = r4.serializer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L47:
            java.lang.Short r2 = r5.MediaSessionCompatQueueItem
            java.lang.Short r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L55
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L55:
            java.lang.Short r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Short r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L63
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L63:
            java.lang.Short r5 = r5.RatingCompat
            java.lang.Short r2 = r4.RatingCompat
            if (r2 == r5) goto L73
            if (r2 == 0) goto L72
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L72
            goto L73
        L72:
            return r1
        L73:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}

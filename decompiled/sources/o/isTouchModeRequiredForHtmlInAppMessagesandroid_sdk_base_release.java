package o;

import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes3.dex */
public final class isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final setCustomLocationProviderNamesandroid_sdk_base_release write = new setCustomLocationProviderNamesandroid_sdk_base_release(11);
    public final Boolean IconCompatParcelizer;
    public final Double MediaBrowserCompatMediaItem;
    public final Double MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final Double read;
    public final Double serializer;

    public final int hashCode() {
        Double d = this.read;
        int iHashCode = d == null ? 0 : d.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Double d2 = this.serializer;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        Boolean bool = this.IconCompatParcelizer;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Double d3 = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = d3 == null ? 0 : d3.hashCode();
        String str2 = this.MediaSessionCompatQueueItem;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Double d4 = this.MediaMetadataCompat;
        return (((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ (d4 != null ? d4.hashCode() : 0)) * (-2128831035);
    }

    public isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release(E$b e$b) {
        this.read = (Double) e$b.write;
        this.RemoteActionCompatParcelizer = (String) e$b.read;
        this.serializer = (Double) e$b.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = (Boolean) e$b.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = (Double) e$b.MediaDescriptionCompat;
        this.MediaSessionCompatQueueItem = (String) e$b.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = (Double) e$b.MediaMetadataCompat;
    }

    public final String toString() {
        return "PeakElement{duration=" + this.read + ", ended=" + this.RemoteActionCompatParcelizer + ", integral=" + this.serializer + ", is_positive=" + this.IconCompatParcelizer + ", max=" + this.MediaBrowserCompatMediaItem + ", start=" + this.MediaSessionCompatQueueItem + ", angle=" + this.MediaMetadataCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
        r5 = r5.MediaMetadataCompat;
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
            boolean r2 = r5 instanceof o.isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release r5 = (o.isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release) r5
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L1d:
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L2b:
            java.lang.Double r2 = r5.serializer
            java.lang.Double r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L39:
            java.lang.Boolean r2 = r5.IconCompatParcelizer
            java.lang.Boolean r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L47:
            java.lang.Double r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Double r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L55
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L55:
            java.lang.String r2 = r5.MediaSessionCompatQueueItem
            java.lang.String r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L63
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L63:
            java.lang.Double r5 = r5.MediaMetadataCompat
            java.lang.Double r2 = r4.MediaMetadataCompat
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
        throw new UnsupportedOperationException("Method not decompiled: o.isTouchModeRequiredForHtmlInAppMessagesandroid_sdk_base_release.equals(java.lang.Object):boolean");
    }
}

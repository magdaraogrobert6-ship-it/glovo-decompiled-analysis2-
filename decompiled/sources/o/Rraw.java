package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes3.dex */
public final class Rraw implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE RemoteActionCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(27);
    public final String IconCompatParcelizer;
    public final Double MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final Double MediaSessionCompatQueueItem;
    public final String read;
    public final String serializer;
    public final Double write;

    public final int hashCode() {
        String str = this.serializer;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.IconCompatParcelizer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.read;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Double d = this.write;
        int iHashCode4 = d == null ? 0 : d.hashCode();
        Double d2 = this.MediaSessionCompatQueueItem;
        int iHashCode5 = d2 == null ? 0 : d2.hashCode();
        Double d3 = this.MediaBrowserCompatMediaItem;
        int iHashCode6 = d3 == null ? 0 : d3.hashCode();
        String str4 = this.MediaDescriptionCompat;
        return (((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ (str4 != null ? str4.hashCode() : 0)) * (-2128831035);
    }

    public Rraw(E$b e$b) {
        this.serializer = (String) e$b.read;
        this.IconCompatParcelizer = (String) e$b.RemoteActionCompatParcelizer;
        this.read = (String) e$b.IconCompatParcelizer;
        this.write = (Double) e$b.write;
        this.MediaSessionCompatQueueItem = (Double) e$b.MediaDescriptionCompat;
        this.MediaBrowserCompatMediaItem = (Double) e$b.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = (String) e$b.MediaMetadataCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrafficElement{category=");
        sb.append(this.serializer);
        sb.append(", ended=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", start=");
        sb.append(this.read);
        sb.append(", duration_in_min=");
        sb.append(this.write);
        sb.append(", probs=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", intensity=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", type=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaDescriptionCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
    
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
            boolean r2 = r5 instanceof o.Rraw
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.Rraw r5 = (o.Rraw) r5
            java.lang.String r2 = r5.serializer
            java.lang.String r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L1d:
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L2b:
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L39
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L39:
            java.lang.Double r2 = r5.write
            java.lang.Double r3 = r4.write
            if (r3 == r2) goto L47
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L47:
            java.lang.Double r2 = r5.MediaSessionCompatQueueItem
            java.lang.Double r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L55
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L55:
            java.lang.Double r2 = r5.MediaBrowserCompatMediaItem
            java.lang.Double r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L63
            if (r3 == 0) goto L72
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L72
        L63:
            java.lang.String r5 = r5.MediaDescriptionCompat
            java.lang.String r2 = r4.MediaDescriptionCompat
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
        throw new UnsupportedOperationException("Method not decompiled: o.Rraw.equals(java.lang.Object):boolean");
    }
}

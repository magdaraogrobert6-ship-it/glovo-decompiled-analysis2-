package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o serializer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(1);
    public final Integer IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final Double RemoteActionCompatParcelizer;
    public final Double read;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int iHashCode5 = this.MediaDescriptionCompat.hashCode();
        String str = this.MediaBrowserCompatMediaItem;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (str == null ? 0 : str.hashCode())) * (-2128831035);
    }

    public r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E(androidx.lifecycle.BlockRunner blockRunner) {
        this.write = (String) blockRunner.read;
        this.read = (Double) blockRunner.serializer;
        this.RemoteActionCompatParcelizer = (Double) blockRunner.RatingCompat;
        this.IconCompatParcelizer = (Integer) blockRunner.write;
        this.MediaDescriptionCompat = (String) blockRunner.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = (String) blockRunner.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SmartGeofence{sentiance_id=");
        sb.append(this.write);
        sb.append(", latitude=");
        sb.append(this.read);
        sb.append(", longitude=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", radius=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", geofence_list_id=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", external_id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaBrowserCompatMediaItem, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        r5 = r5.MediaBrowserCompatMediaItem;
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
            boolean r2 = r5 instanceof o.r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E r5 = (o.r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E) r5
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5a
        L1b:
            java.lang.Double r2 = r5.read
            java.lang.Double r3 = r4.read
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5a
        L27:
            java.lang.Double r2 = r5.RemoteActionCompatParcelizer
            java.lang.Double r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5a
        L33:
            java.lang.Integer r2 = r5.IconCompatParcelizer
            java.lang.Integer r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5a
        L3f:
            java.lang.String r2 = r5.MediaDescriptionCompat
            java.lang.String r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L4b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L5a
        L4b:
            java.lang.String r5 = r5.MediaBrowserCompatMediaItem
            java.lang.String r2 = r4.MediaBrowserCompatMediaItem
            if (r2 == r5) goto L5b
            if (r2 == 0) goto L5a
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            return r1
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambda6bGutJ7rIyvBAu8XSUqBiLxTz6E.equals(java.lang.Object):boolean");
    }
}

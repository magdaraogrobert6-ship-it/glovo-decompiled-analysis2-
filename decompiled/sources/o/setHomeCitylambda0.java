package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.core.model.thrift.k$c;

/* JADX INFO: loaded from: classes3.dex */
public final class setHomeCitylambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY RemoteActionCompatParcelizer = new r8lambdaCCAQpc6lMMBJOz_wNA96TGZjJJY(14);
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final Long MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String read;
    public final Long serializer;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        int iHashCode3 = this.write.hashCode();
        int iHashCode4 = this.serializer.hashCode();
        Long l = this.MediaSessionCompatQueueItem;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str = this.RatingCompat;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaBrowserCompatMediaItem;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaDescriptionCompat;
        return (((((((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ iHashCode6) * (-2128831035)) ^ iHashCode7) * (-2128831035)) ^ (str3 != null ? str3.hashCode() : 0)) * (-2128831035);
    }

    public setHomeCitylambda0(k$c k_c) {
        this.read = (String) k_c.MediaSessionCompatQueueItem;
        this.IconCompatParcelizer = (String) k_c.MediaDescriptionCompat;
        this.write = (String) k_c.RemoteActionCompatParcelizer;
        this.serializer = (Long) k_c.write;
        this.MediaSessionCompatQueueItem = (Long) k_c.IconCompatParcelizer;
        this.RatingCompat = (String) k_c.read;
        this.MediaBrowserCompatMediaItem = (String) k_c.serializer;
        this.MediaDescriptionCompat = (String) k_c.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkToken{user_id=");
        sb.append(this.read);
        sb.append(", token=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", refresh_token=");
        sb.append(this.write);
        sb.append(", expires_at=");
        sb.append(this.serializer);
        sb.append(", refresh_expires_at=");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(", install_id=");
        sb.append(this.RatingCompat);
        sb.append(", person_id=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", app_id=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaDescriptionCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        r2 = r5.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
    
        r2 = r5.RatingCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:
    
        r2 = r5.MediaBrowserCompatMediaItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
    
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
            boolean r2 = r5 instanceof o.setHomeCitylambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setHomeCitylambda0 r5 = (o.setHomeCitylambda0) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L78
        L1b:
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L78
        L27:
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L33
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L78
        L33:
            java.lang.Long r2 = r5.serializer
            java.lang.Long r3 = r4.serializer
            if (r3 == r2) goto L3f
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L78
        L3f:
            java.lang.Long r2 = r5.MediaSessionCompatQueueItem
            java.lang.Long r3 = r4.MediaSessionCompatQueueItem
            if (r3 == r2) goto L4d
            if (r3 == 0) goto L78
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L78
        L4d:
            java.lang.String r2 = r5.RatingCompat
            java.lang.String r3 = r4.RatingCompat
            if (r3 == r2) goto L5b
            if (r3 == 0) goto L78
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L78
        L5b:
            java.lang.String r2 = r5.MediaBrowserCompatMediaItem
            java.lang.String r3 = r4.MediaBrowserCompatMediaItem
            if (r3 == r2) goto L69
            if (r3 == 0) goto L78
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L78
        L69:
            java.lang.String r5 = r5.MediaDescriptionCompat
            java.lang.String r2 = r4.MediaDescriptionCompat
            if (r2 == r5) goto L79
            if (r2 == 0) goto L78
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L78
            goto L79
        L78:
            return r1
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHomeCitylambda0.equals(java.lang.Object):boolean");
    }
}

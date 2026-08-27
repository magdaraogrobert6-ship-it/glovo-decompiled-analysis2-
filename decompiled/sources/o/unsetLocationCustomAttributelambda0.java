package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class unsetLocationCustomAttributelambda0 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o serializer = new r8lambdaHQQ_DjpXIvR74iBN8j78dhHR9o(19);
    public final String IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.write.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.IconCompatParcelizer;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaDescriptionCompat;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.MediaMetadataCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (str4 != null ? str4.hashCode() : 0)) * (-2128831035);
    }

    public unsetLocationCustomAttributelambda0(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.read = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.write = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.IconCompatParcelizer = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.MediaDescriptionCompat = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.MediaMetadataCompat = (String) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AWSCredentials{access_key=");
        sb.append(this.read);
        sb.append(", secret_key=");
        sb.append(this.write);
        sb.append(", shard_key=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", endpoint=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", region=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", bucket_name=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.MediaMetadataCompat, "}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        r2 = r5.RemoteActionCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
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
            boolean r2 = r5 instanceof o.unsetLocationCustomAttributelambda0
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.unsetLocationCustomAttributelambda0 r5 = (o.unsetLocationCustomAttributelambda0) r5
            java.lang.String r2 = r5.read
            java.lang.String r3 = r4.read
            if (r3 == r2) goto L1b
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L1b:
            java.lang.String r2 = r5.write
            java.lang.String r3 = r4.write
            if (r3 == r2) goto L27
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L27:
            java.lang.String r2 = r5.RemoteActionCompatParcelizer
            java.lang.String r3 = r4.RemoteActionCompatParcelizer
            if (r3 == r2) goto L35
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L35:
            java.lang.String r2 = r5.IconCompatParcelizer
            java.lang.String r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L43
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L43:
            java.lang.String r2 = r5.MediaDescriptionCompat
            java.lang.String r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L51
            if (r3 == 0) goto L60
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L60
        L51:
            java.lang.String r5 = r5.MediaMetadataCompat
            java.lang.String r2 = r4.MediaMetadataCompat
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
        throw new UnsupportedOperationException("Method not decompiled: o.unsetLocationCustomAttributelambda0.equals(java.lang.Object):boolean");
    }
}

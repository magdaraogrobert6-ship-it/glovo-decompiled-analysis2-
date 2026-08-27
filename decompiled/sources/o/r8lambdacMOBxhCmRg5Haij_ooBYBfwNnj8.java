package o;

import com.sentiance.core.model.thrift.ThriftBool;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambda7XT89XUBOAEWRpz84hu0xhYjxI RemoteActionCompatParcelizer = new r8lambda7XT89XUBOAEWRpz84hu0xhYjxI();
    public final ThriftBool IconCompatParcelizer;
    public final ThriftBool MediaBrowserCompatMediaItem;
    public final ThriftBool MediaDescriptionCompat;
    public final ThriftBool read;
    public final ThriftBool serializer;
    public final ThriftBool write;

    public final int hashCode() {
        ThriftBool thriftBool = this.serializer;
        int iHashCode = thriftBool == null ? 0 : thriftBool.hashCode();
        ThriftBool thriftBool2 = this.IconCompatParcelizer;
        int iHashCode2 = thriftBool2 == null ? 0 : thriftBool2.hashCode();
        ThriftBool thriftBool3 = this.write;
        int iHashCode3 = thriftBool3 == null ? 0 : thriftBool3.hashCode();
        ThriftBool thriftBool4 = this.read;
        int iHashCode4 = thriftBool4 == null ? 0 : thriftBool4.hashCode();
        ThriftBool thriftBool5 = this.MediaDescriptionCompat;
        int iHashCode5 = thriftBool5 == null ? 0 : thriftBool5.hashCode();
        ThriftBool thriftBool6 = this.MediaBrowserCompatMediaItem;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (thriftBool6 != null ? thriftBool6.hashCode() : 0)) * (-2128831035);
    }

    public r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.serializer = (ThriftBool) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.IconCompatParcelizer = (ThriftBool) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.write = (ThriftBool) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.read = (ThriftBool) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.MediaDescriptionCompat = (ThriftBool) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.MediaBrowserCompatMediaItem = (ThriftBool) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
    }

    public final String toString() {
        return "OnDeviceFunctionalityToggles{is_venue_tile_downloading_enabled=" + this.serializer + ", is_speed_tile_downloading_enabled=" + this.IconCompatParcelizer + ", is_venue_mapping_enabled=" + this.write + ", is_gis_tile_downloading_enabled=" + this.read + ", is_speeding_event_detection_enabled=" + this.MediaDescriptionCompat + ", is_wrong_way_driving_detection_enabled=" + this.MediaBrowserCompatMediaItem + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.write;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
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
            boolean r2 = r5 instanceof o.r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8 r5 = (o.r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8) r5
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.serializer
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.serializer
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L1d:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.IconCompatParcelizer
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L2b:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.write
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.write
            if (r3 == r2) goto L39
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L39:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.read
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.read
            if (r3 == r2) goto L47
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L47:
            com.sentiance.core.model.thrift.ThriftBool r2 = r5.MediaDescriptionCompat
            com.sentiance.core.model.thrift.ThriftBool r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L55:
            com.sentiance.core.model.thrift.ThriftBool r5 = r5.MediaBrowserCompatMediaItem
            com.sentiance.core.model.thrift.ThriftBool r2 = r4.MediaBrowserCompatMediaItem
            if (r2 == r5) goto L65
            if (r2 == 0) goto L64
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L64
            goto L65
        L64:
            return r1
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdacMOBxhCmRg5Haij_ooBYBfwNnj8.equals(java.lang.Object):boolean");
    }
}

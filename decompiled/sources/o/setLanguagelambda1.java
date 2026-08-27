package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setLanguagelambda1 implements r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k {
    public static final r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE RemoteActionCompatParcelizer = new r8lambdaO3_bo_8ZVdriGYCL2L6jAYoaWE(14);
    public final r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA IconCompatParcelizer;
    public final addToCustomAttributeArraylambda0 MediaDescriptionCompat;
    public final r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo MediaMetadataCompat;
    public final addToCustomAttributeArray read;
    public final r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ serializer;
    public final addAlias write;

    public final int hashCode() {
        addAlias addalias = this.write;
        int iHashCode = addalias == null ? 0 : addalias.hashCode();
        addToCustomAttributeArray addtocustomattributearray = this.read;
        int iHashCode2 = addtocustomattributearray == null ? 0 : addtocustomattributearray.hashCode();
        r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ r8lambdauawnoq1fyynohte6w4x6glr3nlq = this.serializer;
        int iHashCode3 = r8lambdauawnoq1fyynohte6w4x6glr3nlq == null ? 0 : r8lambdauawnoq1fyynohte6w4x6glr3nlq.hashCode();
        r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA r8lambdazl5yedl8bijumjidupewp0azma = this.IconCompatParcelizer;
        int iHashCode4 = r8lambdazl5yedl8bijumjidupewp0azma == null ? 0 : r8lambdazl5yedl8bijumjidupewp0azma.hashCode();
        addToCustomAttributeArraylambda0 addtocustomattributearraylambda0 = this.MediaDescriptionCompat;
        int iHashCode5 = addtocustomattributearraylambda0 == null ? 0 : addtocustomattributearraylambda0.hashCode();
        r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo r8lambdajoiku_xciru_x52x3vsl0ropcoo = this.MediaMetadataCompat;
        return (((((((((((iHashCode ^ 16777619) * (-2128831035)) ^ iHashCode2) * (-2128831035)) ^ iHashCode3) * (-2128831035)) ^ iHashCode4) * (-2128831035)) ^ iHashCode5) * (-2128831035)) ^ (r8lambdajoiku_xciru_x52x3vsl0ropcoo != null ? r8lambdajoiku_xciru_x52x3vsl0ropcoo.hashCode() : 0)) * (-2128831035);
    }

    public setLanguagelambda1(r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls) {
        this.write = (addAlias) r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer;
        this.read = (addToCustomAttributeArray) r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer;
        this.serializer = (r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ) r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem;
        this.IconCompatParcelizer = (r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA) r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer;
        this.MediaDescriptionCompat = (addToCustomAttributeArraylambda0) r8lambdayc78smgbbb6fudfjq0u5z3_ls.write;
        this.MediaMetadataCompat = (r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo) r8lambdayc78smgbbb6fudfjq0u5z3_ls.read;
    }

    public final String toString() {
        return "SensorData{smartsense_motion=" + this.write + ", smartsense_multi=" + this.read + ", crow_magnet=" + this.serializer + ", crow_pir=" + this.IconCompatParcelizer + ", crow_smoke=" + this.MediaDescriptionCompat + ", crow_gbd=" + this.MediaMetadataCompat + "}";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
    
        r2 = r5.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
    
        r2 = r5.serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        r2 = r5.IconCompatParcelizer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        r2 = r5.MediaDescriptionCompat;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
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
            boolean r2 = r5 instanceof o.setLanguagelambda1
            if (r2 != 0) goto Ld
            return r1
        Ld:
            o.setLanguagelambda1 r5 = (o.setLanguagelambda1) r5
            o.addAlias r2 = r5.write
            o.addAlias r3 = r4.write
            if (r3 == r2) goto L1d
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L1d:
            o.addToCustomAttributeArray r2 = r5.read
            o.addToCustomAttributeArray r3 = r4.read
            if (r3 == r2) goto L2b
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L2b:
            o.r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ r2 = r5.serializer
            o.r8lambdauAWnoq1fYyNOHTe6W4x6GlR3NlQ r3 = r4.serializer
            if (r3 == r2) goto L39
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L39:
            o.r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA r2 = r5.IconCompatParcelizer
            o.r8lambdazL5YEDL8BIJUMJIduPEWP0aZmA r3 = r4.IconCompatParcelizer
            if (r3 == r2) goto L47
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L47:
            o.addToCustomAttributeArraylambda0 r2 = r5.MediaDescriptionCompat
            o.addToCustomAttributeArraylambda0 r3 = r4.MediaDescriptionCompat
            if (r3 == r2) goto L55
            if (r3 == 0) goto L64
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
        L55:
            o.r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo r5 = r5.MediaMetadataCompat
            o.r8lambdajoIKu_XCIrU_X52X3vSL0ROPcOo r2 = r4.MediaMetadataCompat
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
        throw new UnsupportedOperationException("Method not decompiled: o.setLanguagelambda1.equals(java.lang.Object):boolean");
    }
}

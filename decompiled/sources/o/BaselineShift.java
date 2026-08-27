package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BaselineShift extends r8lambdaKeMyxhuF3EYMhl9vgBGt4ME3jBA {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final boolean read;
    public final findMethod serializer;
    public final List write;

    public BaselineShift(String str, List list, findMethod findmethod, boolean z, List list2) {
        str.getClass();
        list2.getClass();
        this.IconCompatParcelizer = str;
        this.write = list;
        this.serializer = findmethod;
        this.read = z;
        this.RemoteActionCompatParcelizer = list2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r1 r3
  0x0038: PHI (r1v15 int) = (r1v7 int), (r1v19 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r3v3 o.findMethod) = (r3v1 o.findMethod), (r3v6 o.findMethod) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r1
  0x0036: PHI (r1v8 int) = (r1v7 int), (r1v19 int) binds: [B:8:0x0034, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iM;
        findMethod findmethod;
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 101;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            iM = c8$$ExternalSyntheticOutline0.m(this.write, this.IconCompatParcelizer.hashCode() >> 85, 77);
            findmethod = this.serializer;
            if (findmethod == null) {
                i = 0;
            } else {
                int iHashCode = findmethod.hashCode();
                int i4 = RatingCompat + 121;
                MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                i = iHashCode;
            }
        } else {
            iM = c8$$ExternalSyntheticOutline0.m(this.write, this.IconCompatParcelizer.hashCode() * 31, 31);
            findmethod = this.serializer;
            if (findmethod == null) {
                i = 0;
            } else {
                int iHashCode2 = findmethod.hashCode();
                int i6 = RatingCompat + 121;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i = iHashCode2;
            }
        }
        return this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m((iM + i) * 31, 31, this.read);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 53;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("CurrentTrip(title=", this.IconCompatParcelizer, ", tripPlannerItems=", this.write, ", paginationText=");
        sbSerializer.append(this.serializer);
        sbSerializer.append(", isListExpanded=");
        sbSerializer.append(this.read);
        sbSerializer.append(", trackingEvents=");
        String str = MediaSessionCompatQueueItem.read(sbSerializer, this.RemoteActionCompatParcelizer, ")");
        int i4 = RatingCompat + 5;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if ((r21 instanceof o.BaselineShift) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r1 = (o.BaselineShift) r21;
        r11 = new java.lang.Object[]{r20.IconCompatParcelizer, r1.IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r11, o.getCieXyz.write())).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r20.write.equals(r1.write) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r18 = new java.lang.Object[]{r20.serializer, r1.serializer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r20.read == r1.read) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r18 = new java.lang.Object[]{r20.RemoteActionCompatParcelizer, r1.RemoteActionCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r18, o.getCieXyz.write())).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r20 == r21) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r4 = r4 + 27;
        o.BaselineShift.RatingCompat = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.BaselineShift.RatingCompat
            int r3 = r3 + 99
            int r4 = r3 % 128
            o.BaselineShift.MediaDescriptionCompat = r4
            int r3 = r3 % r2
            r5 = 0
            if (r3 != 0) goto L19
            r3 = 74
            int r3 = r3 / r5
            if (r0 != r1) goto L24
            goto L1b
        L19:
            if (r0 != r1) goto L24
        L1b:
            int r4 = r4 + 27
            int r1 = r4 % 128
            o.BaselineShift.RatingCompat = r1
            int r4 = r4 % r2
            goto Lb9
        L24:
            boolean r2 = r1 instanceof o.BaselineShift
            if (r2 != 0) goto L2a
            goto Lb8
        L2a:
            o.BaselineShift r1 = (o.BaselineShift) r1
            java.lang.String r2 = r0.IconCompatParcelizer
            java.lang.String r3 = r1.IconCompatParcelizer
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r2 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r3 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r2
            r8 = r3
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L59
            goto Lb8
        L59:
            java.util.List r4 = r0.write
            java.util.List r6 = r1.write
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L64
            goto Lb8
        L64:
            o.findMethod r4 = r0.serializer
            o.findMethod r6 = r1.serializer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r6}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            r14 = r2
            r15 = r3
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L8b
            goto Lb8
        L8b:
            boolean r4 = r0.read
            boolean r6 = r1.read
            if (r4 == r6) goto L92
            goto Lb8
        L92:
            java.util.List r4 = r0.RemoteActionCompatParcelizer
            java.util.List r1 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r1}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            r14 = r2
            r15 = r3
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Lb9
        Lb8:
            return r5
        Lb9:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BaselineShift.equals(java.lang.Object):boolean");
    }
}

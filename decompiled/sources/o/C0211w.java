package o;

/* JADX INFO: renamed from: o.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0211w extends AbstractC0210v {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final boolean read;

    public C0211w(boolean z) {
        this.read = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.read);
        int i4 = RemoteActionCompatParcelizer + 15;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        String strSerializer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            strSerializer = MediaSessionCompatQueueItem.serializer("UpdateBottomSheetState(isMinimised=", ")", this.read);
            int i3 = 88 / 0;
        } else {
            strSerializer = MediaSessionCompatQueueItem.serializer("UpdateBottomSheetState(isMinimised=", ")", this.read);
        }
        int i4 = RemoteActionCompatParcelizer + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strSerializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof o.C0211w) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 33;
        o.C0211w.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r6.read == ((o.C0211w) r7).read) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r3 = r3 + 99;
        o.C0211w.RemoteActionCompatParcelizer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.C0211w.RemoteActionCompatParcelizer
            int r2 = r1 + 97
            int r3 = r2 % 128
            o.C0211w.serializer = r3
            int r2 = r2 % r0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L16
            r2 = 92
            int r2 = r2 / r5
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r4
        L19:
            boolean r2 = r7 instanceof o.C0211w
            if (r2 == r4) goto L25
            int r1 = r1 + 33
            int r7 = r1 % 128
            o.C0211w.serializer = r7
            int r1 = r1 % r0
            return r5
        L25:
            o.w r7 = (o.C0211w) r7
            boolean r1 = r6.read
            boolean r7 = r7.read
            if (r1 == r7) goto L2e
            return r5
        L2e:
            int r3 = r3 + 99
            int r7 = r3 % 128
            o.C0211w.RemoteActionCompatParcelizer = r7
            int r3 = r3 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0211w.equals(java.lang.Object):boolean");
    }
}

package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.QrPaymentTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getYD9Ej5fM extends getYD9Ej5fMannotations {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final C0195provider IconCompatParcelizer;

    static {
        QrPaymentTaskUiItem$Companion qrPaymentTaskUiItem$Companion = C0195provider.Companion;
        int i = read + 121;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public getYD9Ej5fM(C0195provider c0195provider) {
        c0195provider.getClass();
        this.IconCompatParcelizer = c0195provider;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int i4 = write + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "QrPaymentTask(qrPaymentTaskUiItem=" + this.IconCompatParcelizer + ")";
        int i2 = write + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r12 instanceof o.getYD9Ej5fM) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r9 = new java.lang.Object[]{r11.IconCompatParcelizer, ((o.getYD9Ej5fM) r12).IconCompatParcelizer};
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r9, o.getCieXyz.write())).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        r12 = o.getYD9Ej5fM.write + 95;
        o.getYD9Ej5fM.serializer = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r12 = o.getYD9Ej5fM.write + 57;
        o.getYD9Ej5fM.serializer = r12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if ((r12 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r12 = null;
        r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r11 == r12) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.getYD9Ej5fM.write
            int r1 = r1 + 51
            int r2 = r1 % 128
            o.getYD9Ej5fM.serializer = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 37
            int r1 = r1 / r3
            if (r11 != r12) goto L19
            goto L18
        L16:
            if (r11 != r12) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r12 instanceof o.getYD9Ej5fM
            if (r1 != 0) goto L1e
            return r3
        L1e:
            o.getYD9Ej5fM r12 = (o.getYD9Ej5fM) r12
            o.provider r1 = r11.IconCompatParcelizer
            o.provider r12 = r12.IconCompatParcelizer
            java.lang.Object[] r9 = new java.lang.Object[]{r1, r12}
            int r4 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            r5 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r12 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L54
            int r12 = o.getYD9Ej5fM.write
            int r12 = r12 + 95
            int r1 = r12 % 128
            o.getYD9Ej5fM.serializer = r1
            int r12 = r12 % r0
            return r3
        L54:
            int r12 = o.getYD9Ej5fM.write
            int r12 = r12 + 57
            int r1 = r12 % 128
            o.getYD9Ej5fM.serializer = r1
            int r12 = r12 % r0
            if (r12 != 0) goto L60
            return r2
        L60:
            r12 = 0
            r12.hashCode()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getYD9Ej5fM.equals(java.lang.Object):boolean");
    }
}

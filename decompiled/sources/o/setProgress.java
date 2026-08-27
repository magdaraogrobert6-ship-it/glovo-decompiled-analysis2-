package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setProgress extends setEmailNotificationSubscriptionTypelambda1 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final String read;

    public setProgress(String str) {
        super(setSelection.LOGOUT_REQUESTED, str);
        this.read = str;
    }

    @Override // o.setEmailNotificationSubscriptionTypelambda1
    public final String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 59;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        int i5 = i2 + 51;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = RemoteActionCompatParcelizer + 77;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("RequestLogout(invocationSite=", this.read, ")");
        int i4 = serializer + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r13 instanceof o.setProgress) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r10 = new java.lang.Object[]{r12.read, ((o.setProgress) r13).read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r13 = o.setProgress.RemoteActionCompatParcelizer + 41;
        o.setProgress.serializer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if ((r13 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 35;
        o.setProgress.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.setProgress.RemoteActionCompatParcelizer
            int r2 = r1 + 13
            int r3 = r2 % 128
            o.setProgress.serializer = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 78
            int r2 = r2 / r4
            if (r12 != r13) goto L20
            goto L18
        L16:
            if (r12 != r13) goto L20
        L18:
            int r1 = r1 + 35
            int r13 = r1 % 128
            o.setProgress.serializer = r13
            int r1 = r1 % r0
            return r3
        L20:
            boolean r1 = r13 instanceof o.setProgress
            if (r1 != 0) goto L25
            return r4
        L25:
            o.setProgress r13 = (o.setProgress) r13
            java.lang.String r1 = r12.read
            java.lang.String r13 = r13.read
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r13}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r13 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L5e
            int r13 = o.setProgress.RemoteActionCompatParcelizer
            int r13 = r13 + 41
            int r1 = r13 % 128
            o.setProgress.serializer = r1
            int r13 = r13 % r0
            if (r13 == 0) goto L5d
            goto L5e
        L5d:
            r3 = r4
        L5e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setProgress.equals(java.lang.Object):boolean");
    }
}

package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final List read;
    public final boolean write;

    public r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4(List list, boolean z) {
        list.getClass();
        this.read = list;
        this.write = z;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Boolean.hashCode(this.write) / (this.read.hashCode() / 95);
        }
        return Boolean.hashCode(this.write) + (this.read.hashCode() * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r13 instanceof o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 117;
        o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r13 = (o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4) r13;
        r10 = new java.lang.Object[]{r12.read, r13.read};
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r13 = o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.IconCompatParcelizer + 35;
        o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.RemoteActionCompatParcelizer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r12.write == r13.write) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        r13 = o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.IconCompatParcelizer + 123;
        o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.RemoteActionCompatParcelizer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
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
            int r1 = o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.RemoteActionCompatParcelizer
            int r1 = r1 + 99
            int r2 = r1 % 128
            o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 71
            int r1 = r1 / r4
            if (r12 != r13) goto L19
            goto L18
        L16:
            if (r12 != r13) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r13 instanceof o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4
            if (r1 != 0) goto L29
            int r2 = r2 + 117
            int r13 = r2 % 128
            o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.RemoteActionCompatParcelizer = r13
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            return r4
        L27:
            r13 = 0
            throw r13
        L29:
            o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4 r13 = (o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4) r13
            java.util.List r1 = r12.read
            java.util.List r2 = r13.read
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r2}
            int r5 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r11 = o.getCieXyz.write()
            int r8 = o.getCieXyz.write()
            r6 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r7 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L5f
            int r13 = o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.IconCompatParcelizer
            int r13 = r13 + 35
            int r1 = r13 % 128
            o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.RemoteActionCompatParcelizer = r1
            int r13 = r13 % r0
            return r4
        L5f:
            boolean r1 = r12.write
            boolean r13 = r13.write
            if (r1 == r13) goto L6f
            int r13 = o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.IconCompatParcelizer
            int r13 = r13 + 123
            int r1 = r13 % 128
            o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.RemoteActionCompatParcelizer = r1
            int r13 = r13 % r0
            return r4
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r8lambdaf8vLMalRCdAeJsAFGsSdyaUSxa4.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SideMenuUiState(components=" + this.read + ", isFallback=" + this.write + ")";
        int i2 = IconCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}

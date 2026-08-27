package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m1ExternalSyntheticLambda22 extends m1ExternalSyntheticLambda7 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final List write;

    public final List serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 101;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.write;
        int i5 = i2 + 11;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public m1ExternalSyntheticLambda22(List list) {
        list.getClass();
        this.write = list;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.write.hashCode();
        }
        this.write.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = MediaSessionCompatQueueItem.read("Success(routes=", ")", this.write);
        int i4 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r13 instanceof o.m1ExternalSyntheticLambda22) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r10 = new java.lang.Object[]{r12.write, ((o.m1ExternalSyntheticLambda22) r13).write};
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r10, o.getCieXyz.write())).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        r13 = o.m1ExternalSyntheticLambda22.IconCompatParcelizer + 107;
        o.m1ExternalSyntheticLambda22.RemoteActionCompatParcelizer = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if ((r13 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        r13 = 94 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 69;
        o.m1ExternalSyntheticLambda22.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L22;
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
            int r1 = o.m1ExternalSyntheticLambda22.IconCompatParcelizer
            int r2 = r1 + 51
            int r3 = r2 % 128
            o.m1ExternalSyntheticLambda22.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 92
            int r2 = r2 / r4
            if (r12 != r13) goto L23
            goto L18
        L16:
            if (r12 != r13) goto L23
        L18:
            int r1 = r1 + 69
            int r13 = r1 % 128
            o.m1ExternalSyntheticLambda22.RemoteActionCompatParcelizer = r13
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            r3 = r4
        L22:
            return r3
        L23:
            boolean r1 = r13 instanceof o.m1ExternalSyntheticLambda22
            if (r1 != 0) goto L28
            return r4
        L28:
            o.m1ExternalSyntheticLambda22 r13 = (o.m1ExternalSyntheticLambda22) r13
            java.util.List r1 = r12.write
            java.util.List r13 = r13.write
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
            if (r13 == 0) goto L63
            int r13 = o.m1ExternalSyntheticLambda22.IconCompatParcelizer
            int r13 = r13 + 107
            int r1 = r13 % 128
            o.m1ExternalSyntheticLambda22.RemoteActionCompatParcelizer = r1
            int r13 = r13 % r0
            if (r13 != 0) goto L62
            r13 = 94
            int r13 = r13 / r4
        L62:
            return r3
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m1ExternalSyntheticLambda22.equals(java.lang.Object):boolean");
    }
}

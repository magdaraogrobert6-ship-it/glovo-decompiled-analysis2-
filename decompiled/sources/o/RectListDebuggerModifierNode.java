package o;

/* JADX INFO: loaded from: classes3.dex */
public final class RectListDebuggerModifierNode {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final androidx.compose.ui.text.AnnotatedString RemoteActionCompatParcelizer;
    public final boolean serializer;

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode() << (Boolean.hashCode(this.serializer) % 88);
        }
        return (Boolean.hashCode(this.serializer) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RectListDebuggerModifierNode(androidx.compose.ui.text.AnnotatedString annotatedString, int i) {
        boolean z;
        int i2 = 2;
        if ((i & 1) != 0) {
            int i3 = write + 39;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = false;
        } else {
            z = true;
        }
        if ((i & 2) != 0) {
            annotatedString = new androidx.compose.ui.text.AnnotatedString("", null, i2, 0 == true ? 1 : 0);
            int i5 = IconCompatParcelizer + 27;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 4 % 4;
            } else {
                int i7 = 2 % 2;
            }
        }
        annotatedString.getClass();
        this.serializer = z;
        this.RemoteActionCompatParcelizer = annotatedString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((!(r13 instanceof o.RectListDebuggerModifierNode)) == true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r13 = (o.RectListDebuggerModifierNode) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r12.serializer == r13.serializer) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r12.RemoteActionCompatParcelizer, r13.RemoteActionCompatParcelizer}, o.getCieXyz.write())).booleanValue()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        r13 = o.RectListDebuggerModifierNode.IconCompatParcelizer + 117;
        o.RectListDebuggerModifierNode.write = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r13 = r13 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r1 = r1 + 47;
        r13 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.RectListDebuggerModifierNode.IconCompatParcelizer = r13;
        r1 = r1 % 2;
        r13 = r13 + 43;
        o.RectListDebuggerModifierNode.write = r13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if ((r13 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r12 == r13) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 35;
        o.RectListDebuggerModifierNode.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
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
            int r1 = o.RectListDebuggerModifierNode.write
            int r2 = r1 + 33
            int r3 = r2 % 128
            o.RectListDebuggerModifierNode.IconCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L16
            r2 = 45
            int r2 = r2 / r3
            if (r12 != r13) goto L20
            goto L18
        L16:
            if (r12 != r13) goto L20
        L18:
            int r1 = r1 + 35
            int r13 = r1 % 128
            o.RectListDebuggerModifierNode.IconCompatParcelizer = r13
            int r1 = r1 % r0
            return r4
        L20:
            boolean r2 = r13 instanceof o.RectListDebuggerModifierNode
            r2 = r2 ^ r4
            if (r2 == r4) goto L64
            o.RectListDebuggerModifierNode r13 = (o.RectListDebuggerModifierNode) r13
            boolean r1 = r12.serializer
            boolean r2 = r13.serializer
            if (r1 == r2) goto L2e
            return r3
        L2e:
            androidx.compose.ui.text.AnnotatedString r1 = r12.RemoteActionCompatParcelizer
            androidx.compose.ui.text.AnnotatedString r13 = r13.RemoteActionCompatParcelizer
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
            r13 = r13 ^ r4
            if (r13 == 0) goto L63
            int r13 = o.RectListDebuggerModifierNode.IconCompatParcelizer
            int r13 = r13 + 117
            int r1 = r13 % 128
            o.RectListDebuggerModifierNode.write = r1
            int r13 = r13 % r0
            return r3
        L63:
            return r4
        L64:
            int r1 = r1 + 47
            int r13 = r1 % 128
            o.RectListDebuggerModifierNode.IconCompatParcelizer = r13
            int r1 = r1 % r0
            int r13 = r13 + 43
            int r1 = r13 % 128
            o.RectListDebuggerModifierNode.write = r1
            int r13 = r13 % r0
            if (r13 != 0) goto L75
            return r3
        L75:
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RectListDebuggerModifierNode.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "CountDownState(isRequestEnabled=" + this.serializer + ", countDownText=" + ((Object) this.RemoteActionCompatParcelizer) + ")";
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return str;
    }
}

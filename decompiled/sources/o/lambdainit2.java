package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lambdainit2 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ float write;

    public /* synthetic */ lambdainit2(float f, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r2 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r7 = (androidx.compose.ui.graphics.drawscope.DrawScope) r20;
        r7.getClass();
        r8 = androidx.compose.ui.graphics.Brush.Companion;
        r2 = androidx.compose.ui.graphics.Color.Companion;
        androidx.compose.ui.graphics.drawscope.DrawScope.m1297drawRectAsUm42w$default(r7, androidx.compose.ui.graphics.Brush.Companion.m677verticalGradient8A3gB4$default(r8, androidx.sqlite.SQLite.read(androidx.compose.ui.graphics.Color.m712boximpl(r2.m757getTransparent0d7_KjU()), androidx.compose.ui.graphics.Color.m712boximpl(androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(r2.m748getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null))), java.lang.Float.intBitsToFloat((int) (r7.mo1304getSizeNHjbRc() & 4294967295L)) - r7.mo48toPx0680j_4(r6), java.lang.Float.intBitsToFloat((int) (4294967295L & r7.mo1304getSizeNHjbRc())), 0, 8, (java.lang.Object) null), 0, 0, 0.0f, null, null, 0, 126, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0093, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        r2 = (androidx.compose.ui.graphics.GraphicsLayerScope) r20;
        r2.getClass();
        r2.setScaleX(r6);
        r2.setScaleY(r6);
        r2.mo926setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.0f, 1.0f));
        r2 = o.lambdainit2.IconCompatParcelizer + 85;
        o.lambdainit2.read = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b4, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r2 != 1) goto L11;
     */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.lambdainit2.read
            int r2 = r2 + 73
            int r3 = r2 % 128
            o.lambdainit2.IconCompatParcelizer = r3
            int r2 = r2 % r1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L20
            int r2 = r0.RemoteActionCompatParcelizer
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            float r6 = r0.write
            r7 = 48
            int r7 = r7 / r3
            if (r2 == 0) goto Lb5
            if (r2 == r4) goto L94
            goto L2a
        L20:
            int r2 = r0.RemoteActionCompatParcelizer
            o.createFromParcel r5 = o.createFromParcel.INSTANCE
            float r6 = r0.write
            if (r2 == 0) goto Lb5
            if (r2 == r4) goto L94
        L2a:
            r7 = r20
            androidx.compose.ui.graphics.drawscope.DrawScope r7 = (androidx.compose.ui.graphics.drawscope.DrawScope) r7
            r7.getClass()
            androidx.compose.ui.graphics.Brush$Companion r8 = androidx.compose.ui.graphics.Brush.Companion
            androidx.compose.ui.graphics.Color$Companion r2 = androidx.compose.ui.graphics.Color.Companion
            long r9 = r2.m757getTransparent0d7_KjU()
            androidx.compose.ui.graphics.Color r9 = androidx.compose.ui.graphics.Color.m712boximpl(r9)
            long r10 = r2.m748getBlack0d7_KjU()
            r12 = 1045220557(0x3e4ccccd, float:0.2)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 14
            r17 = 0
            long r10 = androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(r10, r12, r13, r14, r15, r16, r17)
            androidx.compose.ui.graphics.Color r2 = androidx.compose.ui.graphics.Color.m712boximpl(r10)
            androidx.compose.ui.graphics.Color[] r1 = new androidx.compose.ui.graphics.Color[r1]
            r1[r3] = r9
            r1[r4] = r2
            java.util.List r9 = androidx.sqlite.SQLite.read(r1)
            long r1 = r7.mo1304getSizeNHjbRc()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r2 = r7.mo48toPx0680j_4(r6)
            long r10 = r7.mo1304getSizeNHjbRc()
            long r3 = r3 & r10
            int r3 = (int) r3
            float r11 = java.lang.Float.intBitsToFloat(r3)
            float r10 = r1 - r2
            r12 = 0
            r13 = 8
            r14 = 0
            androidx.compose.ui.graphics.Brush r8 = androidx.compose.ui.graphics.Brush.Companion.m677verticalGradient8A3gB4$default(r8, r9, r10, r11, r12, r13, r14)
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 126(0x7e, float:1.77E-43)
            r18 = 0
            androidx.compose.ui.graphics.drawscope.DrawScope.m1297drawRectAsUm42w$default(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            return r5
        L94:
            r2 = r20
            androidx.compose.ui.graphics.GraphicsLayerScope r2 = (androidx.compose.ui.graphics.GraphicsLayerScope) r2
            r2.getClass()
            r2.setScaleX(r6)
            r2.setScaleY(r6)
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            long r3 = androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(r3, r4)
            r2.mo926setTransformOrigin__ExYCQ(r3)
            int r2 = o.lambdainit2.IconCompatParcelizer
            int r2 = r2 + 85
            int r3 = r2 % 128
            o.lambdainit2.read = r3
            int r2 = r2 % r1
            return r5
        Lb5:
            r1 = r20
            androidx.compose.ui.graphics.GraphicsLayerScope r1 = (androidx.compose.ui.graphics.GraphicsLayerScope) r1
            r1.getClass()
            r1.setRotationZ(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lambdainit2.invoke(java.lang.Object):java.lang.Object");
    }
}

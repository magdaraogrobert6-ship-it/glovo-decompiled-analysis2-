package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UiMediaScopePointerPrecision implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ float write;

    public /* synthetic */ UiMediaScopePointerPrecision(long j, float f) {
        this.RemoteActionCompatParcelizer = 2;
        this.read = j;
        this.write = f;
    }

    public /* synthetic */ UiMediaScopePointerPrecision(float f, long j, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = f;
        this.read = j;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        float f = this.write;
        if (i4 == 0) {
            androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
            float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(f);
            long jM469constructorimpl = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(drawScope.mo48toPx0680j_4(f) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
            float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(f) / 2.0f;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L));
            androidx.compose.ui.graphics.drawscope.DrawScope.m1290drawLineNGM6Ib0$default(drawScope, this.read, jM469constructorimpl, androidx.compose.ui.geometry.Offset.m469constructorimpl((Float.floatToRawIntBits(fMo48toPx0680j_5) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat)))), fMo48toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
            return createfromparcel;
        }
        if (i4 != 1) {
            androidx.compose.ui.graphics.drawscope.DrawScope drawScope2 = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
            drawScope2.getClass();
            androidx.compose.ui.graphics.drawscope.DrawScope.m1290drawLineNGM6Ib0$default(drawScope2, this.read, androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.mo1304getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)), drawScope2.mo48toPx0680j_4(f), androidx.compose.ui.graphics.StrokeCap.Companion.m1100getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            return createfromparcel;
        }
        androidx.compose.ui.graphics.drawscope.DrawScope drawScope3 = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
        float fMo48toPx0680j_6 = drawScope3.mo48toPx0680j_4(f);
        long jM469constructorimpl2 = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(drawScope3.mo48toPx0680j_4(f) / 2.0f)) & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope3.mo1304getSizeNHjbRc() >> 32));
        float fMo48toPx0680j_7 = drawScope3.mo48toPx0680j_4(f) / 2.0f;
        androidx.compose.ui.graphics.drawscope.DrawScope.m1290drawLineNGM6Ib0$default(drawScope3, this.read, jM469constructorimpl2, androidx.compose.ui.geometry.Offset.m469constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMo48toPx0680j_7)))), fMo48toPx0680j_6, 0, null, 0.0f, null, 0, 496, null);
        int i5 = serializer + 49;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}

package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getMBufferui_text implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final getMBufferui_text write = new getMBufferui_text();

    static {
        int i = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 23 / 0;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return RangesKt.write(toTextFieldValue.write);
        }
        RangesKt.write(toTextFieldValue.write);
        throw null;
    }
}

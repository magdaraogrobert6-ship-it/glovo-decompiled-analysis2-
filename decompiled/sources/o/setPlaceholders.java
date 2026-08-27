package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class setPlaceholders implements getColorIntegerOrNulllambda0 {
    public static final setPlaceholders IconCompatParcelizer = new setPlaceholders();
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = read + 17;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return RangesKt.write(flattenFontStylesAndApply.write);
        }
        RangesKt.write(flattenFontStylesAndApply.write);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

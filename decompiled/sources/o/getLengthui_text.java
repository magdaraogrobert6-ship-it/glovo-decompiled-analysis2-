package o;

import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getLengthui_text implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    public static final getLengthui_text RemoteActionCompatParcelizer = new getLengthui_text();
    private static int read = 1;
    private static int serializer = 1;
    private static int write;

    static {
        int i = serializer + 11;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Set setWrite = RangesKt.write(setRectOutlinetz77jQw.write);
        int i4 = read + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setWrite;
    }
}

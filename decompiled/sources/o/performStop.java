package o;

import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class performStop implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final performStop read = new performStop();
    private static int serializer;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 67;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = write + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Set setWrite = RangesKt.write(postponeEnterTransition.write);
        int i4 = write + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return setWrite;
        }
        throw null;
    }
}

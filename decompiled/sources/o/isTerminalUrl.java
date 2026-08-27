package o;

import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class isTerminalUrl implements getColorIntegerOrNulllambda0 {
    public static final isTerminalUrl IconCompatParcelizer = new isTerminalUrl();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;

    static {
        int i = RemoteActionCompatParcelizer + 77;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            RangesKt.write(isAllowUrlStrategyFallback.write);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Set setWrite = RangesKt.write(isAllowUrlStrategyFallback.write);
        int i3 = read + 55;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return setWrite;
    }
}

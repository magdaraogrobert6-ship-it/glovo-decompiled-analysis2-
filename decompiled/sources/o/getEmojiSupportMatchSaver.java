package o;

import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getEmojiSupportMatchSaver implements getColorIntegerOrNulllambda0 {
    public static final getEmojiSupportMatchSaver IconCompatParcelizer = new getEmojiSupportMatchSaver();
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        int i = write + 79;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Set setWrite = RangesKt.write(invokeijrfgN4.write);
        int i4 = RemoteActionCompatParcelizer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setWrite;
    }
}

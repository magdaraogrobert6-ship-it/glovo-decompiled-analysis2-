package o;

import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class sendNextPurchaseVerificationPackageI implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    public static final sendNextPurchaseVerificationPackageI read = new sendNextPurchaseVerificationPackageI();
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 123;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 19 / 0;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = write + 13;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Set setWrite = RangesKt.write(readSystemPropertyReflection.IconCompatParcelizer);
        int i4 = IconCompatParcelizer + 73;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return setWrite;
    }
}

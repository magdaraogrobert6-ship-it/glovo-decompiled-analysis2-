package o;

import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getPurchaseVerificationHandler implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    public static final getPurchaseVerificationHandler write = new getPurchaseVerificationHandler();

    static {
        int i = read + 97;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return RangesKt.write(getHttpsURLConnectionProvider.write);
        }
        RangesKt.write(getHttpsURLConnectionProvider.write);
        throw null;
    }
}

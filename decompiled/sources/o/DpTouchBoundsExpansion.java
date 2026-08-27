package o;

import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DpTouchBoundsExpansion {
    static {
        Math.log(2.0d);
    }

    public static boolean RemoteActionCompatParcelizer(double d) {
        if (Math.getExponent(d) <= 1023) {
            if (d != 0.0d) {
                TextStreamsKt.read("not a normal value", Math.getExponent(d) <= 1023);
                int exponent = Math.getExponent(d);
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
                if (52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d)) {
                }
            }
            return true;
        }
        return false;
    }
}

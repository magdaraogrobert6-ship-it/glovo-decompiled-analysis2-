package o;

import android.util.Rational;

/* JADX INFO: loaded from: classes.dex */
public abstract class AudioTimestampFramePositionIncorrectQuirk {
    public static final Rational IconCompatParcelizer = new Rational(4, 3);
    public static final Rational RemoteActionCompatParcelizer = new Rational(3, 4);
    public static final Rational write = new Rational(16, 9);
    public static final Rational serializer = new Rational(9, 16);

    public static boolean read(int i, int i2, Rational rational) {
        coil3.util.UtilsKt.serializer(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }

    public static boolean serializer(android.util.Size size, Rational rational, android.util.Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        android.util.Size size3 = setController.MediaDescriptionCompat;
        if (size.getHeight() * size.getWidth() >= setController.write(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int i = width % 16;
            if (i == 0 && height % 16 == 0) {
                if (read(Math.max(0, height - 16), width, rational) || read(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else {
                if (i == 0) {
                    return read(height, width, rational);
                }
                if (height % 16 == 0) {
                    return read(width, height, rational2);
                }
            }
        }
        return false;
    }
}

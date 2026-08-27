package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPrevious {
    public static final ThreadLocal RemoteActionCompatParcelizer = new ThreadLocal();

    public static int IconCompatParcelizer(float f, int i, int i2) {
        float f2 = 1.0f - f;
        float fAlpha = android.graphics.Color.alpha(i);
        float fAlpha2 = android.graphics.Color.alpha(i2);
        float fRed = android.graphics.Color.red(i);
        return android.graphics.Color.argb((int) ((fAlpha2 * f) + (fAlpha * f2)), (int) ((android.graphics.Color.red(i2) * f) + (fRed * f2)), (int) ((android.graphics.Color.green(i2) * f) + (android.graphics.Color.green(i) * f2)), (int) ((android.graphics.Color.blue(i2) * f) + (android.graphics.Color.blue(i) * f2)));
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        int iAlpha = android.graphics.Color.alpha(i2);
        int iAlpha2 = android.graphics.Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return android.graphics.Color.argb(i3, RemoteActionCompatParcelizer(android.graphics.Color.red(i), iAlpha2, android.graphics.Color.red(i2), iAlpha, i3), RemoteActionCompatParcelizer(android.graphics.Color.green(i), iAlpha2, android.graphics.Color.green(i2), iAlpha, i3), RemoteActionCompatParcelizer(android.graphics.Color.blue(i), iAlpha2, android.graphics.Color.blue(i2), iAlpha, i3));
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int write(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("alpha must be between 0 and 255.");
        return 0;
    }

    public static int serializer(double d, double d2, double d3) {
        double d4 = (((-0.4986d) * d3) + (((-1.5372d) * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + ((-0.9689d) * d))) / 100.0d;
        double d6 = ((1.057d * d3) + (((-0.204d) * d2) + (0.0557d * d))) / 100.0d;
        double dPow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double dPow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double dPow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int iRound = (int) Math.round(dPow * 255.0d);
        int iMin = iRound < 0 ? 0 : Math.min(iRound, 255);
        int iRound2 = (int) Math.round(dPow2 * 255.0d);
        int iMin2 = iRound2 < 0 ? 0 : Math.min(iRound2, 255);
        int iRound3 = (int) Math.round(dPow3 * 255.0d);
        return android.graphics.Color.rgb(iMin, iMin2, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }
}

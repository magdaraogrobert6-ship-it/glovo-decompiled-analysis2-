package o;

import android.graphics.RectF;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaStoreVideoCannotWrite {
    public static final RectF RemoteActionCompatParcelizer = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static boolean read(android.graphics.Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        double dSqrt = Math.sqrt((f2 * f2) + (f * f)) * Math.sqrt((f4 * f4) + (f3 * f3));
        return ((float) Math.toDegrees(Math.atan2(((double) ((f * f4) - (f2 * f3))) / dSqrt, ((double) ((f2 * f4) + (f * f3))) / dSqrt))) > 0.0f;
    }

    public static android.graphics.Matrix IconCompatParcelizer(RectF rectF, RectF rectF2, int i, boolean z) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.Matrix.ScaleToFit scaleToFit = android.graphics.Matrix.ScaleToFit.FILL;
        RectF rectF3 = RemoteActionCompatParcelizer;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static RectF read(android.util.Size size) {
        return new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
    }

    public static android.util.Size read(android.util.Size size, int i) {
        coil3.util.UtilsKt.IconCompatParcelizer("Invalid rotation degrees: " + i, i % 90 == 0);
        return serializer(RemoteActionCompatParcelizer(i)) ? new android.util.Size(size.getHeight(), size.getWidth()) : size;
    }

    public static String read(android.graphics.Rect rect) {
        java.util.Locale locale = java.util.Locale.US;
        return rect + "(" + rect.width() + "x" + rect.height() + ")";
    }

    public static int write(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return RemoteActionCompatParcelizer((int) Math.round(Math.atan2(fArr[3], fArr[0]) * 57.29577951308232d));
    }

    public static android.util.Size write(android.graphics.Rect rect) {
        return new android.util.Size(rect.width(), rect.height());
    }

    public static boolean IconCompatParcelizer(android.util.Size size, boolean z, android.util.Size size2) {
        float width;
        float width2;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        return width >= (((float) size2.getWidth()) - 1.0f) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) - 1.0f) >= width2;
    }

    public static boolean write(android.graphics.Rect rect, android.util.Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return ((i % 360) + 360) % 360;
    }

    public static boolean serializer(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i != 0 && i != 180) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Invalid rotation degrees: "));
        }
        return false;
    }
}

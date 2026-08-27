package o;

import android.graphics.RectF;
import android.util.Rational;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class getOutputTransform {
    public static HashMap RemoteActionCompatParcelizer(android.graphics.Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map map) {
        coil3.util.UtilsKt.IconCompatParcelizer("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        HashMap map2 = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry entry : map.entrySet()) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, ((SmallDisplaySizeQuirk) entry.getValue()).MediaMetadataCompat.getWidth(), ((SmallDisplaySizeQuirk) entry.getValue()).MediaMetadataCompat.getHeight());
            matrix.setRectToRect(rectF3, rectF, android.graphics.Matrix.ScaleToFit.CENTER);
            map2.put((androidx.camera.core.UseCase) entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        Rational rationalSerializer = androidx.camera.core.internal.utils.ImageUtil.serializer(i, rational);
        if (i2 != 3) {
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            RectF rectF5 = new RectF(0.0f, 0.0f, rationalSerializer.getNumerator(), rationalSerializer.getDenominator());
            if (i2 == 0) {
                matrix2.setRectToRect(rectF5, rectF2, android.graphics.Matrix.ScaleToFit.START);
            } else if (i2 == 1) {
                matrix2.setRectToRect(rectF5, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
            } else if (i2 == 2) {
                matrix2.setRectToRect(rectF5, rectF2, android.graphics.Matrix.ScaleToFit.END);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(i2, "Unexpected scale type: "));
                return null;
            }
            RectF rectF6 = new RectF();
            matrix2.mapRect(rectF6, rectF5);
            boolean z2 = (i3 == 1) ^ z;
            boolean z3 = i == 0 && !z2;
            boolean z4 = i == 90 && z2;
            if (z3 || z4) {
                rectF2 = rectF6;
            } else {
                boolean z5 = i == 0 && z2;
                boolean z6 = i == 270 && !z2;
                if (z5 || z6) {
                    float fCenterX = rectF2.centerX();
                    float f = fCenterX + fCenterX;
                    rectF2 = new RectF(f - rectF6.right, rectF6.top, f - rectF6.left, rectF6.bottom);
                } else {
                    boolean z7 = i == 90 && !z2;
                    boolean z8 = i == 180 && z2;
                    if (!z7 && !z8) {
                        boolean z9 = i == 180 && !z2;
                        boolean z10 = i == 270 && z2;
                        if (!z9 && !z10) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z2 + " rotation " + i);
                        }
                        float fCenterY = rectF2.centerY();
                        float f2 = fCenterY + fCenterY;
                        RectF rectF7 = new RectF(rectF6.left, f2 - rectF6.bottom, rectF6.right, f2 - rectF6.top);
                        float fCenterX2 = rectF2.centerX();
                        float f3 = fCenterX2 + fCenterX2;
                        rectF2 = new RectF(f3 - rectF7.right, rectF7.top, f3 - rectF7.left, rectF7.bottom);
                    } else {
                        float fCenterY2 = rectF2.centerY();
                        float f4 = fCenterY2 + fCenterY2;
                        rectF2 = new RectF(rectF6.left, f4 - rectF6.bottom, rectF6.right, f4 - rectF6.top);
                    }
                }
            }
        }
        HashMap map3 = new HashMap();
        RectF rectF8 = new RectF();
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        for (Map.Entry entry2 : map2.entrySet()) {
            ((android.graphics.Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF8, rectF2);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            rectF8.round(rect2);
            map3.put((androidx.camera.core.UseCase) entry2.getKey(), rect2);
        }
        return map3;
    }
}

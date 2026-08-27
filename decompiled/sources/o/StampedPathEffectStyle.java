package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class StampedPathEffectStyle {
    public static final android.graphics.Paint write(Bitmap bitmap, int i, int i2) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float fWrite = (float) RangesKt.write(bitmap.getWidth(), bitmap.getHeight(), i, i2, getBlurRadius.FILL, accessgetLayerBlockp.serializer);
        matrix.setTranslate((i - (bitmap.getWidth() * fWrite)) / 2.0f, (i2 - (bitmap.getHeight() * fWrite)) / 2.0f);
        matrix.preScale(fWrite, fWrite);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        return paint;
    }
}

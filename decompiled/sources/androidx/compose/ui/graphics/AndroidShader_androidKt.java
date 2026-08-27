package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.List;
import o.FocusOwner;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidShader_androidKt {
    public static final int countTransparentColors(List<Color> list) {
        return 0;
    }

    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m620ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i, int i2) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m625toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m625toAndroidTileMode0vamqd0(i2));
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("colors and colorStops arguments must have equal length.");
        }
    }

    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m621ActualLinearGradientShaderVjE6UOU(long j, long j2, List<Color> list, List<Float> list2, int i) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m625toAndroidTileMode0vamqd0(i));
    }

    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m622ActualRadialGradientShader8uybcMk(long j, float f, List<Color> list, List<Float> list2, int i) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m625toAndroidTileMode0vamqd0(i));
    }

    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m623ActualSweepGradientShader9KIMszo(long j, List<Color> list, List<Float> list2) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors));
    }

    public static final int[] makeTransparentColors(List<Color> list, int i) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.m776toArgb8_81llA(list.get(i2).m732unboximpl());
        }
        return iArr;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i) {
        float size;
        if (i == 0) {
            if (list != null) {
                return onContentCardDismissed.serializer((Collection) list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int size2 = list2.size();
        int i2 = 1;
        for (int i3 = 1; i3 < size2 - 1; i3++) {
            long jM732unboximpl = list2.get(i3).m732unboximpl();
            if (list != null) {
                size = list.get(i3).floatValue();
            } else {
                size = i3 / (list2.size() - 1);
            }
            int i4 = i2 + 1;
            fArr[i2] = size;
            if (Color.m724getAlphaimpl(jM732unboximpl) == 0.0f) {
                i2 += 2;
                fArr[i4] = size;
            } else {
                i2 = i4;
            }
        }
        fArr[i2] = list != null ? list.get(list2.size() - 1).floatValue() : 1.0f;
        return fArr;
    }

    /* JADX INFO: renamed from: ActualCompositeShader-7EN7VTw, reason: not valid java name */
    public static final Shader m619ActualCompositeShader7EN7VTw(Shader shader, Shader shader2, int i) {
        return Build.VERSION.SDK_INT >= 29 ? FocusOwner.bz_(shader, shader2, AndroidBlendMode_androidKt.m569toAndroidBlendModes9anfk8(i)) : new ComposeShader(shader, shader2, AndroidBlendMode_androidKt.m570toPorterDuffModes9anfk8(i));
    }
}

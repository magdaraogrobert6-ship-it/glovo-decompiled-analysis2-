package androidx.compose.ui.graphics;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.seekAnimationsanimation_core;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidColorFilter_androidKt {
    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter$ui_graphics();
    }

    public static final boolean supportsColorMatrixQuery() {
        return true;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return true;
    }

    /* JADX INFO: renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final android.graphics.ColorFilter m582actualColorMatrixColorFilterjHGOpc(float[] fArr) {
        return new android.graphics.ColorMatrixColorFilter(fArr);
    }

    /* JADX INFO: renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final android.graphics.ColorFilter m583actualLightingColorFilterOWjLjI(long j, long j2) {
        return new android.graphics.LightingColorFilter(ColorKt.m776toArgb8_81llA(j), ColorKt.m776toArgb8_81llA(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter) {
        if (29 <= Build.VERSION.SDK_INT && seekAnimationsanimation_core.MediaMetadataCompat(colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(seekAnimationsanimation_core.as_(colorFilter));
        }
        if (!(colorFilter instanceof android.graphics.LightingColorFilter) || !supportsLightingColorFilterQuery()) {
            return ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) ? new ColorMatrixColorFilter(null, colorFilter, 0 == true ? 1 : 0) : new ColorFilter(colorFilter);
        }
        android.graphics.LightingColorFilter lightingColorFilter = (android.graphics.LightingColorFilter) colorFilter;
        return new LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
    }

    public static final float[] actualColorMatrixFromFilter(android.graphics.ColorFilter colorFilter) {
        if ((colorFilter instanceof android.graphics.ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m801getColorMatrix8unuwjk((android.graphics.ColorMatrixColorFilter) colorFilter);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        return null;
    }

    /* JADX INFO: renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final android.graphics.ColorFilter m584actualTintColorFilterxETnrds(long j, int i) {
        return Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m666BlendModeColorFilterxETnrds(j, i) : new PorterDuffColorFilter(ColorKt.m776toArgb8_81llA(j), AndroidBlendMode_androidKt.m570toPorterDuffModes9anfk8(i));
    }
}

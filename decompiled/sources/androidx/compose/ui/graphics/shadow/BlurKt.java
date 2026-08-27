package androidx.compose.ui.graphics.shadow;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;

/* JADX INFO: loaded from: classes4.dex */
public final class BlurKt {
    /* JADX INFO: renamed from: configureShadow-FoewPVk, reason: not valid java name */
    public static final Paint m1438configureShadowFoewPVk(Paint paint, long j, int i, BlurMaskFilter blurMaskFilter, int i2) {
        paint.mo598setColor8_81llA(j);
        paint.mo597setBlendModes9anfk8(i);
        paint.mo602setStylek9PVt8s(i2);
        Blur_androidKt.setBlurFilter(paint, blurMaskFilter);
        return paint;
    }

    /* JADX INFO: renamed from: configureShadow-FoewPVk$default, reason: not valid java name */
    public static /* synthetic */ Paint m1439configureShadowFoewPVk$default(Paint paint, long j, int i, BlurMaskFilter blurMaskFilter, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = Color.Companion.m748getBlack0d7_KjU();
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = BlendMode.Companion.m662getSrcOver0nO6VwU();
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            blurMaskFilter = null;
        }
        BlurMaskFilter blurMaskFilter2 = blurMaskFilter;
        if ((i3 & 8) != 0) {
            i2 = PaintingStyle.Companion.m1006getFillTiuSbCo();
        }
        return m1438configureShadowFoewPVk(paint, j2, i4, blurMaskFilter2, i2);
    }
}

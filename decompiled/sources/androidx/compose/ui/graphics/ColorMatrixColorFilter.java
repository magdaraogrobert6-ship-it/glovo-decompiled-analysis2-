package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorMatrixColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private float[] colorMatrix;

    /* JADX INFO: renamed from: obtainColorMatrix-p10-uLo, reason: not valid java name */
    private final float[] m799obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrActualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics());
        this.colorMatrix = fArrActualColorMatrixFromFilter;
        return fArrActualColorMatrixFromFilter;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(m799obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m799obtainColorMatrixp10uLo());
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m785hashCodeimpl(fArr);
        }
        return 0;
    }

    public String toString() {
        String strM796toStringimpl;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        if (fArr == null) {
            strM796toStringimpl = "null";
        } else {
            strM796toStringimpl = ColorMatrix.m796toStringimpl(fArr);
        }
        sb.append((Object) strM796toStringimpl);
        sb.append(')');
        return sb.toString();
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m582actualColorMatrixColorFilterjHGOpc(fArr), null);
    }

    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI$default, reason: not valid java name */
    public static /* synthetic */ float[] m798copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = ColorMatrix.m779constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m800copyColorMatrixgBh15pI(fArr);
    }

    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI, reason: not valid java name */
    public final float[] m800copyColorMatrixgBh15pI(float[] fArr) {
        float[] fArrM799obtainColorMatrixp10uLo = m799obtainColorMatrixp10uLo();
        onContentCardClicked.write(fArrM799obtainColorMatrixp10uLo, fArr, 0, 0, (6 & 8) != 0 ? fArrM799obtainColorMatrixp10uLo.length : 6);
        return fArr;
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr, colorFilter);
    }
}

package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes4.dex */
final class ColorMatrixFilterHelper {
    public static final ColorMatrixFilterHelper INSTANCE = new ColorMatrixFilterHelper();

    private ColorMatrixFilterHelper() {
    }

    /* JADX INFO: renamed from: getColorMatrix-8unuwjk, reason: not valid java name */
    public final float[] m801getColorMatrix8unuwjk(android.graphics.ColorMatrixColorFilter colorMatrixColorFilter) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return ColorMatrix.m778constructorimpl(colorMatrix.getArray());
    }
}

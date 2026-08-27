package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class onReset {
    public static final boolean IconCompatParcelizer(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates;
        androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (legacyTextFieldState != null && (layoutCoordinates = legacyTextFieldState.read()) != null) {
            int i = getShouldAutoInvalidateannotations.IconCompatParcelizer;
            androidx.compose.ui.geometry.Rect rectBoundsInWindow$default = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow$default(layoutCoordinates, false, 1, null);
            androidx.compose.ui.geometry.Rect rectM515Rect0a9Yr6o = androidx.compose.ui.geometry.RectKt.m515Rect0a9Yr6o(layoutCoordinates.mo2226windowToLocalMKHz9U(rectBoundsInWindow$default.m512getTopLeftF1C5BW0()), layoutCoordinates.mo2226windowToLocalMKHz9U(rectBoundsInWindow$default.m506getBottomRightF1C5BW0()));
            if (rectM515Rect0a9Yr6o != null) {
                long j = textFieldSelectionManager.read(z);
                float left = rectM515Rect0a9Yr6o.getLeft();
                float right = rectM515Rect0a9Yr6o.getRight();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (left <= fIntBitsToFloat && fIntBitsToFloat <= right) {
                    float top = rectM515Rect0a9Yr6o.getTop();
                    float bottom = rectM515Rect0a9Yr6o.getBottom();
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    if (top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    /* JADX INFO: renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m2706preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m590setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m2691preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m2707preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        AndroidComposeView_androidKt.m2692preTranslatecG2Xzmc(fArr, f, f2, this.tmpMatrix);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo2705calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m978resetimpl(fArr);
        m2708transformMatrixToWindowEL8BTi8(view, fArr);
    }

    /* JADX INFO: renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m2708transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m2708transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m2707preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m2707preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            view.getLocationInWindow(iArr);
            m2707preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m2707preTranslate3XD1CNM(fArr, iArr[0], iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m2706preConcattUYjHk(fArr, matrix);
    }

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }
}

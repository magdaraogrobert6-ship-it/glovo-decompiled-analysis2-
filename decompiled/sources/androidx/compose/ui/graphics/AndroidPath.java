package androidx.compose.ui.graphics;

import android.graphics.RectF;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPath implements Path {
    public static final int $stable = 8;
    private final android.graphics.Path internalPath;
    private android.graphics.Matrix mMatrix;
    private float[] radii;
    private RectF rectF;

    public static /* synthetic */ void isConvex$annotations() {
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: addPath-Uv8p0NA, reason: not valid java name */
    public void mo609addPathUv8p0NA(Path path, long j) {
        android.graphics.Path path2 = this.internalPath;
        if (path instanceof AndroidPath) {
            path2.addPath(((AndroidPath) path).getInternalPath(), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void cubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: getFillType-Rg-k1Os, reason: not valid java name */
    public int mo610getFillTypeRgk1Os() {
        return this.internalPath.getFillType() == android.graphics.Path.FillType.EVEN_ODD ? PathFillType.Companion.m1021getEvenOddRgk1Os() : PathFillType.Companion.m1022getNonZeroRgk1Os();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    @Override // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void lineTo(float f, float f2) {
        this.internalPath.lineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void moveTo(float f, float f2) {
        this.internalPath.moveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: op-N5in7k0, reason: not valid java name */
    public boolean mo611opN5in7k0(Path path, Path path2, int i) {
        android.graphics.Path.Op op;
        PathOperation.Companion companion = PathOperation.Companion;
        if (PathOperation.m1027equalsimpl0(i, companion.m1031getDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.DIFFERENCE;
        } else if (PathOperation.m1027equalsimpl0(i, companion.m1032getIntersectb3I0S0c())) {
            op = android.graphics.Path.Op.INTERSECT;
        } else if (PathOperation.m1027equalsimpl0(i, companion.m1033getReverseDifferenceb3I0S0c())) {
            op = android.graphics.Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = PathOperation.m1027equalsimpl0(i, companion.m1034getUnionb3I0S0c()) ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
        }
        android.graphics.Path path3 = this.internalPath;
        if (!(path instanceof AndroidPath)) {
            IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
            return false;
        }
        android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
        if (path2 instanceof AndroidPath) {
            return path3.op(internalPath, ((AndroidPath) path2).getInternalPath(), op);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void quadraticTo(float f, float f2, float f3, float f4) {
        this.internalPath.quadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.internalPath.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f, float f2) {
        this.internalPath.rLineTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f, float f2) {
        this.internalPath.rMoveTo(f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f, float f2, float f3, float f4) {
        this.internalPath.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void relativeQuadraticTo(float f, float f2, float f3, float f4) {
        this.internalPath.rQuadTo(f, f2, f3, f4);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    @Override // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.internalPath.rewind();
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: setFillType-oQ8Xj4U, reason: not valid java name */
    public void mo612setFillTypeoQ8Xj4U(int i) {
        this.internalPath.setFillType(PathFillType.m1017equalsimpl0(i, PathFillType.Companion.m1021getEvenOddRgk1Os()) ? android.graphics.Path.FillType.EVEN_ODD : android.graphics.Path.FillType.WINDING);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArc(Rect rect, float f, float f2) {
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        rectF2.getClass();
        path.addArc(rectF2, f, f2);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect, Path.Direction direction) {
        validateRectangle(rect);
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        rectF2.getClass();
        path.addRect(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    private final void validateRectangle(Rect rect) {
        if (Float.isNaN(rect.getLeft()) || Float.isNaN(rect.getTop()) || Float.isNaN(rect.getRight()) || Float.isNaN(rect.getBottom())) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addArcRad(Rect rect, float f, float f2) {
        addArc(rect, DegreesKt.degrees(f), DegreesKt.degrees(f2));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void arcTo(Rect rect, float f, float f2, boolean z) {
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        rectF.set(left, top, right, bottom);
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        rectF2.getClass();
        path.arcTo(rectF2, f, f2, z);
    }

    public /* synthetic */ AndroidPath(android.graphics.Path path, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new android.graphics.Path() : path);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        rectF.set(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        rectF2.getClass();
        path.addOval(rectF2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect, Path.Direction direction) {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        rectF.set(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
        if (this.radii == null) {
            this.radii = new float[8];
        }
        float[] fArr = this.radii;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (roundRect.m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (roundRect.m528getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (roundRect.m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (roundRect.m525getBottomLeftCornerRadiuskKHJgLs() & 4294967295L));
        android.graphics.Path path = this.internalPath;
        RectF rectF2 = this.rectF;
        rectF2.getClass();
        float[] fArr2 = this.radii;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, AndroidPath_androidKt.toPlatformPathDirection(direction));
    }

    @Override // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        if (this.rectF == null) {
            this.rectF = new RectF();
        }
        RectF rectF = this.rectF;
        rectF.getClass();
        this.internalPath.computeBounds(rectF, true);
        return new Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo613transform58bKbWc(float[] fArr) {
        if (this.mMatrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        }
        android.graphics.Matrix matrix = this.mMatrix;
        matrix.getClass();
        AndroidMatrixConversions_androidKt.m589setFromEL8BTi8(matrix, fArr);
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix2 = this.mMatrix;
        matrix2.getClass();
        path.transform(matrix2);
    }

    @Override // androidx.compose.ui.graphics.Path
    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public void mo614translatek4lQ0M(long j) {
        android.graphics.Matrix matrix = this.mMatrix;
        if (matrix == null) {
            this.mMatrix = new android.graphics.Matrix();
        } else {
            matrix.getClass();
            matrix.reset();
        }
        android.graphics.Matrix matrix2 = this.mMatrix;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        android.graphics.Path path = this.internalPath;
        android.graphics.Matrix matrix3 = this.mMatrix;
        matrix3.getClass();
        path.transform(matrix3);
    }

    public AndroidPath(android.graphics.Path path) {
        this.internalPath = path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidPath() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect) {
        addOval(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect) {
        addRect(rect, Path.Direction.CounterClockwise);
    }

    @Override // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect) {
        addRoundRect(roundRect, Path.Direction.CounterClockwise);
    }
}

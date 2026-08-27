package androidx.compose.ui.geometry;

/* JADX INFO: loaded from: classes.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public final void deflate(float f) {
        inflate(-f);
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m452getBottomCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.bottom;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(right + f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m453getBottomLeftF1C5BW0() {
        float f = this.left;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m454getBottomRightF1C5BW0() {
        float f = this.right;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m455getCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        float bottom = (getBottom() - getTop()) / 2.0f;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(right + f)) << 32) | (((long) Float.floatToRawIntBits(bottom + f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m456getCenterLeftF1C5BW0() {
        float f = this.left;
        float f2 = this.top;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((getBottom() - getTop()) / 2.0f) + f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m457getCenterRightF1C5BW0() {
        float f = this.right;
        float f2 = this.top;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((getBottom() - getTop()) / 2.0f) + f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m459getTopCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(right + f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m460getTopLeftF1C5BW0() {
        float f = this.left;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m461getTopRightF1C5BW0() {
        float f = this.right;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public final void intersect(float f, float f2, float f3, float f4) {
        this.left = Math.max(f, this.left);
        this.top = Math.max(f2, this.top);
        this.right = Math.min(f3, this.right);
        this.bottom = Math.min(f4, this.bottom);
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.top >= this.bottom);
    }

    public final boolean isFinite() {
        boolean z = (Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040;
        boolean z2 = (Float.floatToRawIntBits(this.top) & Integer.MAX_VALUE) < 2139095040;
        return z & z2 & ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Integer.MAX_VALUE & Float.floatToRawIntBits(this.bottom)) < 2139095040);
    }

    public final boolean overlaps(Rect rect) {
        boolean z = this.left < rect.getRight();
        boolean z2 = rect.getLeft() < this.right;
        return z & z2 & (this.top < rect.getBottom()) & (rect.getTop() < this.bottom);
    }

    public final void set(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public MutableRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public final void inflate(float f) {
        this.left -= f;
        this.top -= f;
        this.right += f;
        this.bottom += f;
    }

    public final void translate(float f, float f2) {
        this.left += f;
        this.top += f2;
        this.right += f;
        this.bottom += f2;
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m458getSizeNHjbRc() {
        float right = getRight();
        float left = getLeft();
        float bottom = getBottom();
        float top = getTop();
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(right - left)) << 32) | (((long) Float.floatToRawIntBits(bottom - top)) & 4294967295L));
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m451containsk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z = fIntBitsToFloat >= this.left;
        boolean z2 = fIntBitsToFloat < this.right;
        return z & z2 & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m462translatek4lQ0M(long j) {
        translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final boolean isInfinite() {
        boolean z = this.left == Float.POSITIVE_INFINITY;
        boolean z2 = this.top == Float.POSITIVE_INFINITY;
        return z | z2 | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean overlaps(MutableRect mutableRect) {
        return this.right > mutableRect.left && mutableRect.right > this.left && this.bottom > mutableRect.top && mutableRect.bottom > this.top;
    }
}

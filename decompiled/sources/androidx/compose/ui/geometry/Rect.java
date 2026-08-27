package androidx.compose.ui.geometry;

import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class Rect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Rect Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc$annotations, reason: not valid java name */
    public static /* synthetic */ void m502getSizeNHjbRc$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public static /* synthetic */ void isFinite$annotations() {
    }

    public static /* synthetic */ void isInfinite$annotations() {
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    public final Rect deflate(float f) {
        return inflate(-f);
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

    public final Rect copy(float f, float f2, float f3, float f4) {
        return new Rect(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m504getBottomCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.bottom;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(right + f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m505getBottomLeftF1C5BW0() {
        float f = this.left;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m506getBottomRightF1C5BW0() {
        float f = this.right;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.bottom)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m507getCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        float bottom = (getBottom() - getTop()) / 2.0f;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(right + f)) << 32) | (((long) Float.floatToRawIntBits(bottom + f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m508getCenterLeftF1C5BW0() {
        float f = this.left;
        float f2 = this.top;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((getBottom() - getTop()) / 2.0f) + f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m509getCenterRightF1C5BW0() {
        float f = this.right;
        float f2 = this.top;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(((getBottom() - getTop()) / 2.0f) + f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m511getTopCenterF1C5BW0() {
        float f = this.left;
        float right = (getRight() - getLeft()) / 2.0f;
        float f2 = this.top;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(right + f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m512getTopLeftF1C5BW0() {
        float f = this.left;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    /* JADX INFO: renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m513getTopRightF1C5BW0() {
        float f = this.right;
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(this.top)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    public int hashCode() {
        return Float.hashCode(this.bottom) + af$$ExternalSyntheticOutline1.m(this.right, af$$ExternalSyntheticOutline1.m(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    public final Rect inflate(float f) {
        return new Rect(this.left - f, this.top - f, this.right + f, this.bottom + f);
    }

    public final Rect intersect(Rect rect) {
        return new Rect(Math.max(this.left, rect.left), Math.max(this.top, rect.top), Math.min(this.right, rect.right), Math.min(this.bottom, rect.bottom));
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
        boolean z = this.left < rect.right;
        boolean z2 = rect.left < this.right;
        return z & z2 & (this.top < rect.bottom) & (rect.top < this.bottom);
    }

    public final Rect translate(float f, float f2) {
        return new Rect(this.left + f, this.top + f2, this.right + f, this.bottom + f2);
    }

    /* JADX INFO: renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final Rect m514translatek4lQ0M(long j) {
        float f = this.left;
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float f2 = this.top;
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float f3 = this.right;
        return new Rect(fIntBitsToFloat + f, fIntBitsToFloat2 + f2, Float.intBitsToFloat(i) + f3, Float.intBitsToFloat(i2) + this.bottom);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }

        private Companion() {
        }
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.left;
        }
        if ((i & 2) != 0) {
            f2 = rect.top;
        }
        if ((i & 4) != 0) {
            f3 = rect.right;
        }
        if ((i & 8) != 0) {
            f4 = rect.bottom;
        }
        return rect.copy(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        return Float.compare(this.left, rect.left) == 0 && Float.compare(this.top, rect.top) == 0 && Float.compare(this.right, rect.right) == 0 && Float.compare(this.bottom, rect.bottom) == 0;
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
    public final long m510getSizeNHjbRc() {
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
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m503containsk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        boolean z = fIntBitsToFloat >= this.left;
        boolean z2 = fIntBitsToFloat < this.right;
        return z & z2 & (fIntBitsToFloat2 >= this.top) & (fIntBitsToFloat2 < this.bottom);
    }

    public final boolean isInfinite() {
        boolean z = this.left == Float.POSITIVE_INFINITY;
        boolean z2 = this.top == Float.POSITIVE_INFINITY;
        return z | z2 | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final Rect intersect(float f, float f2, float f3, float f4) {
        return new Rect(Math.max(this.left, f), Math.max(this.top, f2), Math.min(this.right, f3), Math.min(this.bottom, f4));
    }
}

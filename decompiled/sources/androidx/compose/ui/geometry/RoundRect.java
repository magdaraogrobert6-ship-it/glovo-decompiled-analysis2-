package androidx.compose.ui.geometry;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.c8$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m531RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m449getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

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

    /* JADX INFO: renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m519component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m520component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* JADX INFO: renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m521component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* JADX INFO: renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m522component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m525getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m526getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
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

    /* JADX INFO: renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m527getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* JADX INFO: renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m528getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f = this.left;
        float f2 = this.top;
        float f3 = this.right;
        float f4 = this.bottom;
        long jM431constructorimpl = CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * fMinRadius)) << 32));
        long jM431constructorimpl2 = CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * fMinRadius)) << 32));
        long jM431constructorimpl3 = CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * fMinRadius)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32));
        float f5 = f * fMinRadius;
        float f6 = f2 * fMinRadius;
        float f7 = f3 * fMinRadius;
        float f8 = f4 * fMinRadius;
        RoundRect roundRect2 = new RoundRect(f5, f6, f7, f8, jM431constructorimpl, jM431constructorimpl2, jM431constructorimpl3, CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)) * fMinRadius)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat * fMinRadius) << 32)), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline1.m(this.bottom, af$$ExternalSyntheticOutline1.m(this.right, af$$ExternalSyntheticOutline1.m(this.top, Float.hashCode(this.left) * 31, 31), 31), 31);
        int iM439hashCodeimpl = CornerRadius.m439hashCodeimpl(this.topLeftCornerRadius);
        int iM439hashCodeimpl2 = CornerRadius.m439hashCodeimpl(this.topRightCornerRadius);
        return CornerRadius.m439hashCodeimpl(this.bottomLeftCornerRadius) + ((CornerRadius.m439hashCodeimpl(this.bottomRightCornerRadius) + ((iM439hashCodeimpl2 + ((iM439hashCodeimpl + iM) * 31)) * 31)) * 31);
    }

    public String toString() {
        long j = this.topLeftCornerRadius;
        long j2 = this.topRightCornerRadius;
        long j3 = this.bottomRightCornerRadius;
        long j4 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m436equalsimpl0(j, j2) || !CornerRadius.m436equalsimpl0(j2, j3) || !CornerRadius.m436equalsimpl0(j3, j4)) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("RoundRect(rect=", str, ", topLeft=");
            sbM.append((Object) CornerRadius.m445toStringimpl(j));
            sbM.append(", topRight=");
            sbM.append((Object) CornerRadius.m445toStringimpl(j2));
            sbM.append(", bottomRight=");
            sbM.append((Object) CornerRadius.m445toStringimpl(j3));
            sbM.append(", bottomLeft=");
            sbM.append((Object) CornerRadius.m445toStringimpl(j4));
            sbM.append(')');
            return sbM.toString();
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m("RoundRect(rect=", str, ", radius=");
            sbM2.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1));
            sbM2.append(')');
            return sbM2.toString();
        }
        StringBuilder sbM3 = c8$$ExternalSyntheticOutline0.m("RoundRect(rect=", str, ", x=");
        sbM3.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i), 1));
        sbM3.append(", y=");
        sbM3.append(GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2), 1));
        sbM3.append(')');
        return sbM3.toString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.top, roundRect.top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m436equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m436equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m436equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m436equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0094  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:26:0x0143  */
    /* JADX WARN: Code duplicated, block: B:28:0x0156  */
    /* JADX INFO: renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m523containsk4lQ0M(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float fIntBitsToFloat4;
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) >= this.left && Float.intBitsToFloat(i) < this.right) {
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i2) >= this.top && Float.intBitsToFloat(i2) < this.bottom) {
                RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
                if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32)) + this.left) {
                    if (Float.intBitsToFloat(i2) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L)) + this.top) {
                        fIntBitsToFloat = (Float.intBitsToFloat(i) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                        fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L));
                        fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                        fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topLeftCornerRadius));
                    } else {
                        if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32))) {
                            if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32))) {
                                if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left) {
                                }
                                return true;
                            }
                            if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left) {
                            }
                            return true;
                        }
                        if (Float.intBitsToFloat(i2) >= Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L)) + this.top) {
                            fIntBitsToFloat = (Float.intBitsToFloat(i) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                            fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L));
                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topRightCornerRadius));
                        } else if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32)) || Float.intBitsToFloat(i2) <= this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L))) {
                            if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left || Float.intBitsToFloat(i2) <= this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L))) {
                                return true;
                            }
                            fIntBitsToFloat = (Float.intBitsToFloat(i) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                            fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L));
                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomLeftCornerRadius));
                        } else {
                            fIntBitsToFloat = (Float.intBitsToFloat(i) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                            fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L));
                            fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                            fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomRightCornerRadius));
                        }
                    }
                } else {
                    if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32))) {
                        if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32))) {
                            if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left) {
                            }
                            return true;
                        }
                        if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left) {
                        }
                        return true;
                    }
                    if (Float.intBitsToFloat(i2) >= Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L)) + this.top) {
                        if (Float.intBitsToFloat(i) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32))) {
                            if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left) {
                            }
                            return true;
                        }
                        if (Float.intBitsToFloat(i) < Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) + this.left) {
                        }
                        return true;
                    }
                    fIntBitsToFloat = (Float.intBitsToFloat(i) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i2) - this.top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topRightCornerRadius));
                }
                float f = fIntBitsToFloat / fIntBitsToFloat3;
                float f2 = fIntBitsToFloat2 / fIntBitsToFloat4;
                return (f2 * f2) + (f * f) <= 1.0f;
            }
        }
        return false;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, (i & 16) != 0 ? CornerRadius.Companion.m449getZerokKHJgLs() : j, (i & 32) != 0 ? CornerRadius.Companion.m449getZerokKHJgLs() : j2, (i & 64) != 0 ? CornerRadius.Companion.m449getZerokKHJgLs() : j3, (i & Fields.SpotShadowColor) != 0 ? CornerRadius.Companion.m449getZerokKHJgLs() : j4, null);
    }

    private final float minRadius(float f, float f2, float f3, float f4) {
        float f5 = f2 + f3;
        return (f5 <= f4 || f5 == 0.0f) ? f : Math.min(f, f4 / f5);
    }

    /* JADX INFO: renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m524copyMDFrsts(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        return new RoundRect(f, f2, f3, f4, j, j2, j3, j4, null);
    }

    private RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
        this.topLeftCornerRadius = j;
        this.topRightCornerRadius = j2;
        this.bottomRightCornerRadius = j3;
        this.bottomLeftCornerRadius = j4;
    }

    public /* synthetic */ RoundRect(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, j, j2, j3, j4);
    }
}

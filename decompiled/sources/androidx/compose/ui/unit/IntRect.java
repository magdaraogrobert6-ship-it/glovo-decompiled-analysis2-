package androidx.compose.ui.unit;

import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class IntRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m3820getSizeYbymL2g$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    public final IntRect deflate(int i) {
        return inflate(-i);
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public final IntRect copy(int i, int i2, int i3, int i4) {
        return new IntRect(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m3822getBottomCenternOccac() {
        int i = this.left;
        return IntOffset.m3795constructorimpl((((long) ((getWidth() / 2) + i)) << 32) | (((long) this.bottom) & 4294967295L));
    }

    /* JADX INFO: renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m3823getBottomLeftnOccac() {
        return IntOffset.m3795constructorimpl((((long) this.bottom) & 4294967295L) | (this.left << 32));
    }

    /* JADX INFO: renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m3824getBottomRightnOccac() {
        return IntOffset.m3795constructorimpl((((long) this.bottom) & 4294967295L) | (this.right << 32));
    }

    /* JADX INFO: renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m3825getCenternOccac() {
        int i = this.left;
        return IntOffset.m3795constructorimpl((((long) ((getWidth() / 2) + i)) << 32) | (((long) ((getHeight() / 2) + this.top)) & 4294967295L));
    }

    /* JADX INFO: renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m3826getCenterLeftnOccac() {
        return IntOffset.m3795constructorimpl((((long) ((getHeight() / 2) + this.top)) & 4294967295L) | (this.left << 32));
    }

    /* JADX INFO: renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m3827getCenterRightnOccac() {
        return IntOffset.m3795constructorimpl((((long) ((getHeight() / 2) + this.top)) & 4294967295L) | (this.right << 32));
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m3829getTopCenternOccac() {
        int i = this.left;
        return IntOffset.m3795constructorimpl((((long) ((getWidth() / 2) + i)) << 32) | (((long) this.top) & 4294967295L));
    }

    /* JADX INFO: renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m3830getTopLeftnOccac() {
        return IntOffset.m3795constructorimpl((((long) this.top) & 4294967295L) | (this.left << 32));
    }

    /* JADX INFO: renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m3831getTopRightnOccac() {
        return IntOffset.m3795constructorimpl((((long) this.top) & 4294967295L) | (this.right << 32));
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return Integer.hashCode(this.bottom) + af$$ExternalSyntheticOutline0.m(this.right, af$$ExternalSyntheticOutline0.m(this.top, Integer.hashCode(this.left) * 31, 31), 31);
    }

    public final IntRect inflate(int i) {
        return new IntRect(this.left - i, this.top - i, this.right + i, this.bottom + i);
    }

    public final IntRect intersect(IntRect intRect) {
        return new IntRect(Math.max(this.left, intRect.left), Math.max(this.top, intRect.top), Math.min(this.right, intRect.right), Math.min(this.bottom, intRect.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean overlaps(IntRect intRect) {
        return this.right > intRect.left && intRect.right > this.left && this.bottom > intRect.top && intRect.bottom > this.top;
    }

    public final IntRect translate(int i, int i2) {
        return new IntRect(this.left + i, this.top + i2, this.right + i, this.bottom + i2);
    }

    /* JADX INFO: renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m3832translategyyYBs(long j) {
        int i = this.left;
        int iM3801getXimpl = IntOffset.m3801getXimpl(j);
        int i2 = this.top;
        int iM3802getYimpl = IntOffset.m3802getYimpl(j);
        int i3 = this.right;
        return new IntRect(iM3801getXimpl + i, iM3802getYimpl + i2, IntOffset.m3801getXimpl(j) + i3, IntOffset.m3802getYimpl(j) + this.bottom);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }

        private Companion() {
        }
    }

    public IntRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = intRect.left;
        }
        if ((i5 & 2) != 0) {
            i2 = intRect.top;
        }
        if ((i5 & 4) != 0) {
            i3 = intRect.right;
        }
        if ((i5 & 8) != 0) {
            i4 = intRect.bottom;
        }
        return intRect.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m3821containsgyyYBs(long j) {
        return IntOffset.m3801getXimpl(j) >= this.left && IntOffset.m3801getXimpl(j) < this.right && IntOffset.m3802getYimpl(j) >= this.top && IntOffset.m3802getYimpl(j) < this.bottom;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m3828getSizeYbymL2g() {
        return IntSize.m3839constructorimpl((((long) getHeight()) & 4294967295L) | (getWidth() << 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.left);
        sb.append(", ");
        sb.append(this.top);
        sb.append(", ");
        sb.append(this.right);
        sb.append(", ");
        return af$$ExternalSyntheticOutline0.m(sb, this.bottom, ')');
    }
}

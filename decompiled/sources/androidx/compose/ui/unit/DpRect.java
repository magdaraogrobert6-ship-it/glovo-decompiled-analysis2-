package androidx.compose.ui.unit;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public final class DpRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3746getBottomD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3747getLeftD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3748getRightD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m3749getTopD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m3750component1D9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m3751component2D9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m3752component3D9Ej5fM() {
        return this.right;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m3753component4D9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m3755getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name */
    public final float m3756getLeftD9Ej5fM() {
        return this.left;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name */
    public final float m3757getRightD9Ej5fM() {
        return this.right;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m3758getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m3679hashCodeimpl(this.bottom) + getBitmapFromCache.serializer(this.right, getBitmapFromCache.serializer(this.top, Dp.m3679hashCodeimpl(this.left) * 31, 31), 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private DpRect(long j, long j2) {
        this(DpOffset.m3734getXD9Ej5fM(j), DpOffset.m3736getYD9Ej5fM(j), Dp.m3673constructorimpl(DpSize.m3771getWidthD9Ej5fM(j2) + DpOffset.m3734getXD9Ej5fM(j)), Dp.m3673constructorimpl(DpSize.m3769getHeightD9Ej5fM(j2) + DpOffset.m3736getYD9Ej5fM(j)), null);
    }

    /* JADX INFO: renamed from: copy-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpRect m3745copya9UjIt4$default(DpRect dpRect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpRect.left;
        }
        if ((i & 2) != 0) {
            f2 = dpRect.top;
        }
        if ((i & 4) != 0) {
            f3 = dpRect.right;
        }
        if ((i & 8) != 0) {
            f4 = dpRect.bottom;
        }
        return dpRect.m3754copya9UjIt4(f, f2, f3, f4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpRect)) {
            return false;
        }
        DpRect dpRect = (DpRect) obj;
        return Dp.m3678equalsimpl0(this.left, dpRect.left) && Dp.m3678equalsimpl0(this.top, dpRect.top) && Dp.m3678equalsimpl0(this.right, dpRect.right) && Dp.m3678equalsimpl0(this.bottom, dpRect.bottom);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DpRect(left=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.left, ", top=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.top, ", right=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.right, ", bottom=", sb);
        sb.append((Object) Dp.m3684toStringimpl(this.bottom));
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: copy-a9UjIt4, reason: not valid java name */
    public final DpRect m3754copya9UjIt4(float f, float f2, float f3, float f4) {
        return new DpRect(f, f2, f3, f4, null);
    }

    public /* synthetic */ DpRect(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private DpRect(float f, float f2, float f3, float f4) {
        this.left = f;
        this.top = f2;
        this.right = f3;
        this.bottom = f4;
    }

    public /* synthetic */ DpRect(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }
}

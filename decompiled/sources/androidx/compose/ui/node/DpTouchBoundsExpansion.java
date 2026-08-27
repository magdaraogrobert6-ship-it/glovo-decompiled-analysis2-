package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes.dex */
public final class DpTouchBoundsExpansion {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;
    private final float top;

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m2420component1D9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m2421component2D9Ej5fM() {
        return this.top;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name */
    public final float m2422component3D9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name */
    public final float m2423component4D9Ej5fM() {
        return this.bottom;
    }

    public final boolean component5() {
        return this.isLayoutDirectionAware;
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m2425getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m2426getEndD9Ej5fM() {
        return this.end;
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m2427getStartD9Ej5fM() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m2428getTopD9Ej5fM() {
        return this.top;
    }

    public final boolean isLayoutDirectionAware() {
        return this.isLayoutDirectionAware;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLayoutDirectionAware) + getBitmapFromCache.serializer(this.bottom, getBitmapFromCache.serializer(this.end, getBitmapFromCache.serializer(this.top, Dp.m3679hashCodeimpl(this.start) * 31, 31), 31), 31);
    }

    /* JADX INFO: renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m2429roundToTouchBoundsExpansionTW6G1oQ(Density density) {
        return TouchBoundsExpansion.m2639constructorimpl(TouchBoundsExpansion.Companion.pack$ui(density.mo42roundToPx0680j_4(this.start), density.mo42roundToPx0680j_4(this.top), density.mo42roundToPx0680j_4(this.end), density.mo42roundToPx0680j_4(this.bottom), this.isLayoutDirectionAware));
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: Absolute-a9UjIt4$default, reason: not valid java name */
        public static /* synthetic */ DpTouchBoundsExpansion m2430Absolutea9UjIt4$default(Companion companion, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = Dp.m3673constructorimpl(0.0f);
            }
            if ((i & 2) != 0) {
                f2 = Dp.m3673constructorimpl(0.0f);
            }
            if ((i & 4) != 0) {
                f3 = Dp.m3673constructorimpl(0.0f);
            }
            if ((i & 8) != 0) {
                f4 = Dp.m3673constructorimpl(0.0f);
            }
            return companion.m2431Absolutea9UjIt4(f, f2, f3, f4);
        }

        /* JADX INFO: renamed from: Absolute-a9UjIt4, reason: not valid java name */
        public final DpTouchBoundsExpansion m2431Absolutea9UjIt4(float f, float f2, float f3, float f4) {
            return new DpTouchBoundsExpansion(f, f2, f3, f4, false, null);
        }
    }

    private DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.isLayoutDirectionAware = z;
        if (f < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
        }
        if (f2 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
        }
        if (f3 < 0.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
        }
        if (f4 >= 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
    }

    /* JADX INFO: renamed from: copy-lDy3nrA$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m2419copylDy3nrA$default(DpTouchBoundsExpansion dpTouchBoundsExpansion, float f, float f2, float f3, float f4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dpTouchBoundsExpansion.start;
        }
        if ((i & 2) != 0) {
            f2 = dpTouchBoundsExpansion.top;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = dpTouchBoundsExpansion.end;
        }
        float f6 = f3;
        if ((i & 8) != 0) {
            f4 = dpTouchBoundsExpansion.bottom;
        }
        float f7 = f4;
        if ((i & 16) != 0) {
            z = dpTouchBoundsExpansion.isLayoutDirectionAware;
        }
        return dpTouchBoundsExpansion.m2424copylDy3nrA(f, f5, f6, f7, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) obj;
        return Dp.m3678equalsimpl0(this.start, dpTouchBoundsExpansion.start) && Dp.m3678equalsimpl0(this.top, dpTouchBoundsExpansion.top) && Dp.m3678equalsimpl0(this.end, dpTouchBoundsExpansion.end) && Dp.m3678equalsimpl0(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DpTouchBoundsExpansion(start=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.start, ", top=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.top, ", end=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.end, ", bottom=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.bottom, ", isLayoutDirectionAware=", sb);
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isLayoutDirectionAware, ')');
    }

    /* JADX INFO: renamed from: copy-lDy3nrA, reason: not valid java name */
    public final DpTouchBoundsExpansion m2424copylDy3nrA(float f, float f2, float f3, float f4, boolean z) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, z, null);
    }

    public /* synthetic */ DpTouchBoundsExpansion(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }
}

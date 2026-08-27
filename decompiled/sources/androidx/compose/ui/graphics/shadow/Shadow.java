package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import bo.app.af$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class Shadow {
    public static final int $stable = 0;
    private final float alpha;
    private final int blendMode;
    private final Brush brush;
    private final long color;
    private final long offset;
    private final float radius;
    private final float spread;

    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m1447getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m1448getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: getOffset-RKDOV3M, reason: not valid java name */
    public final long m1449getOffsetRKDOV3M() {
        return this.offset;
    }

    /* JADX INFO: renamed from: getRadius-D9Ej5fM, reason: not valid java name */
    public final float m1450getRadiusD9Ej5fM() {
        return this.radius;
    }

    /* JADX INFO: renamed from: getSpread-D9Ej5fM, reason: not valid java name */
    public final float m1451getSpreadD9Ej5fM() {
        return this.spread;
    }

    public final Shadow copyWithoutOffset$ui_graphics() {
        return new Shadow(this.radius, this.spread, DpOffset.Companion.m3744getZeroRKDOV3M(), this.color, this.brush, this.alpha, this.blendMode, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iIconCompatParcelizer = MediaSessionCompatQueueItem.IconCompatParcelizer((BlendMode.m632hashCodeimpl(this.blendMode) + af$$ExternalSyntheticOutline1.m(this.alpha, (DpOffset.m3738hashCodeimpl(this.offset) + getBitmapFromCache.serializer(this.spread, Dp.m3679hashCodeimpl(this.radius) * 31, 31)) * 31, 31)) * 31, 31, this.color);
        Brush brush = this.brush;
        return iIconCompatParcelizer + (brush != null ? brush.hashCode() : 0);
    }

    public final Shadow transparentCopy$ui_graphics() {
        return new Shadow(this.radius, Color.Companion.m757getTransparent0d7_KjU(), this.spread, this.offset, this.alpha, this.blendMode, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Shadow(float f, long j, float f2, long j2, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i2 & 2) != 0 ? Color.Companion.m748getBlack0d7_KjU() : j, (i2 & 4) != 0 ? Dp.m3673constructorimpl(0.0f) : f2, (i2 & 8) != 0 ? DpOffset.Companion.m3744getZeroRKDOV3M() : j2, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : i, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        if (!Dp.m3678equalsimpl0(this.radius, shadow.radius) || !Dp.m3678equalsimpl0(this.spread, shadow.spread) || !DpOffset.m3733equalsimpl0(this.offset, shadow.offset) || this.alpha != shadow.alpha || !BlendMode.m631equalsimpl0(this.blendMode, shadow.blendMode) || !Color.m723equalsimpl0(this.color, shadow.color)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brush, shadow.brush}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Shadow(radius=");
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.radius, ", spread=", sb);
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(this.spread, ", offset=", sb);
        sb.append((Object) DpOffset.m3741toStringimpl(this.offset));
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m633toStringimpl(this.blendMode));
        sb.append(", color=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(this.color, ", brush=", sb);
        sb.append(this.brush);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ Shadow(float f, long j, float f2, long j2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, j, f2, j2, f3, i);
    }

    public /* synthetic */ Shadow(float f, Brush brush, float f2, long j, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, f2, j, f3, i);
    }

    private Shadow(float f, float f2, long j, long j2, Brush brush, float f3, int i) {
        this.radius = f;
        this.spread = f2;
        this.offset = j;
        this.blendMode = i;
        if (brush instanceof SolidColor) {
            this.color = ((SolidColor) brush).m1081getValue0d7_KjU();
            this.brush = null;
        } else {
            this.color = j2;
            this.brush = brush;
        }
        this.alpha = RangesKt.write(f3, 0.0f, 1.0f);
    }

    private Shadow(float f, Brush brush, float f2, long j, float f3, int i) {
        this(f, f2, j, Color.Companion.m748getBlack0d7_KjU(), brush, f3, i, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Shadow(float f, float f2, long j, long j2, Brush brush, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, j, j2, brush, f3, i);
    }

    private Shadow(float f, long j, float f2, long j2, float f3, int i) {
        this(f, f2, j2, j != 16 ? j : Color.Companion.m748getBlack0d7_KjU(), (Brush) null, f3, i, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Shadow(float f, Brush brush, float f2, long j, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, (i2 & 4) != 0 ? Dp.m3673constructorimpl(0.0f) : f2, (i2 & 8) != 0 ? DpOffset.Companion.m3744getZeroRKDOV3M() : j, (i2 & 16) != 0 ? 1.0f : f3, (i2 & 32) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : i, (DefaultConstructorMarker) null);
    }
}

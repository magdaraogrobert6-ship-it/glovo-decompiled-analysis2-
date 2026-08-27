package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class InnerShadowPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private LayoutDirection layoutDirection;
    private final InnerShadowRendererProvider renderCreator;
    private final Shadow shadow;
    private final Shape shape;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1424getIntrinsicSizeNHjbRc() {
        return Size.Companion.m554getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        this.renderCreator.mo1432obtainInnerShadowRenderereZhPAX0(this.shape, drawScope.mo1304getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope, this.shadow).m1453drawShadowerFMhIw(drawScope, this.colorFilter, drawScope.mo1304getSizeNHjbRc(), this.shadow.m1448getColor0d7_KjU(), this.shadow.getBrush(), RangesKt.write(this.shadow.getAlpha() * this.alpha, 0.0f, 1.0f), this.shadow.m1447getBlendMode0nO6VwU());
    }

    public InnerShadowPainter(Shape shape, Shadow shadow, InnerShadowRendererProvider innerShadowRendererProvider) {
        this.shape = shape;
        this.shadow = shadow;
        this.renderCreator = innerShadowRendererProvider;
        this.alpha = 1.0f;
        this.layoutDirection = LayoutDirection.Ltr;
    }

    public /* synthetic */ InnerShadowPainter(Shape shape, Shadow shadow, InnerShadowRendererProvider innerShadowRendererProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, shadow, (i & 4) != 0 ? InnerShadowRendererProvider.Companion.getDefault() : innerShadowRendererProvider);
    }

    public InnerShadowPainter(Shape shape, Shadow shadow) {
        this(shape, shadow, InnerShadowRendererProvider.Companion.getDefault());
    }
}

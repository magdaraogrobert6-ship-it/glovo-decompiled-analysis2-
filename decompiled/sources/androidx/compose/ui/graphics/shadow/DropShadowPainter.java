package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class DropShadowPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private LayoutDirection layoutDirection;
    private final DropShadowRendererProvider renderCreator;
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
        DropShadowRenderer dropShadowRendererMo1431obtainDropShadowRenderereZhPAX0 = this.renderCreator.mo1431obtainDropShadowRenderereZhPAX0(this.shape, drawScope.mo1304getSizeNHjbRc(), drawScope.getLayoutDirection(), drawScope, this.shadow);
        float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(DpOffset.m3734getXD9Ej5fM(this.shadow.m1449getOffsetRKDOV3M()));
        float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(DpOffset.m3736getYD9Ej5fM(this.shadow.m1449getOffsetRKDOV3M()));
        drawScope.getDrawContext().getTransform().translate(fMo48toPx0680j_4, fMo48toPx0680j_5);
        try {
            dropShadowRendererMo1431obtainDropShadowRenderereZhPAX0.m1453drawShadowerFMhIw(drawScope, this.colorFilter, drawScope.mo1304getSizeNHjbRc(), dropShadowRendererMo1431obtainDropShadowRenderereZhPAX0.getShadow().m1448getColor0d7_KjU(), dropShadowRendererMo1431obtainDropShadowRenderereZhPAX0.getShadow().getBrush(), RangesKt.write(this.alpha * dropShadowRendererMo1431obtainDropShadowRenderereZhPAX0.getShadow().getAlpha(), 0.0f, 1.0f), dropShadowRendererMo1431obtainDropShadowRenderereZhPAX0.getShadow().m1447getBlendMode0nO6VwU());
        } finally {
            drawScope.getDrawContext().getTransform().translate(-fMo48toPx0680j_4, -fMo48toPx0680j_5);
        }
    }

    public DropShadowPainter(Shape shape, Shadow shadow, DropShadowRendererProvider dropShadowRendererProvider) {
        this.shape = shape;
        this.shadow = shadow;
        this.renderCreator = dropShadowRendererProvider;
        this.alpha = 1.0f;
        this.layoutDirection = LayoutDirection.Ltr;
    }

    public DropShadowPainter(Shape shape, Shadow shadow) {
        this(shape, shadow, DropShadowRendererProvider.Companion.getDefault());
    }
}

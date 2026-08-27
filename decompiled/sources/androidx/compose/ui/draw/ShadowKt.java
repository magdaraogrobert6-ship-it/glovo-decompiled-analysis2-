package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.unit.Dp;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetShadow(ShadowScope shadowScope) {
        shadowScope.setRadius(0.0f);
        shadowScope.setSpread(0.0f);
        shadowScope.mo235setOffsetk4lQ0M(Offset.Companion.m493getZeroF1C5BW0());
        shadowScope.mo234setColor8_81llA(Color.Companion.m748getBlack0d7_KjU());
        shadowScope.setBrush(null);
        shadowScope.setAlpha(1.0f);
        shadowScope.mo233setBlendModes9anfk8(BlendMode.Companion.m662getSrcOver0nO6VwU());
    }

    /* JADX INFO: renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m316shadows4CzXII(Modifier modifier, float f, Shape shape, boolean z, long j, long j2) {
        return (Dp.m3672compareTo0680j_4(f, Dp.m3673constructorimpl(0.0f)) > 0 || z) ? modifier.then(new ShadowGraphicsLayerElement(f, shape, z, j, j2, null)) : modifier;
    }

    public static final Modifier dropShadow(Modifier modifier, Shape shape, Shadow shadow) {
        return modifier.then(new SimpleDropShadowElement(shape, shadow));
    }

    public static final Modifier innerShadow(Modifier modifier, Shape shape, Shadow shadow) {
        return modifier.then(new SimpleInnerShadowElement(shape, shadow));
    }

    /* JADX INFO: renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m317shadows4CzXII$default(Modifier modifier, float f, Shape shape, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        Shape rectangleShape = (i & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i & 4) != 0) {
            z2 = Dp.m3672compareTo0680j_4(f, Dp.m3673constructorimpl(0.0f)) > 0;
        } else {
            z2 = z;
        }
        return m316shadows4CzXII(modifier, f, rectangleShape, z2, (i & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j, (i & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2);
    }

    @onItemDismisslambda0
    /* JADX INFO: renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m318shadowziNgDLE(Modifier modifier, float f, Shape shape, boolean z) {
        return m316shadows4CzXII(modifier, f, shape, z, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* JADX INFO: renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m319shadowziNgDLE$default(Modifier modifier, float f, Shape shape, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            z = Dp.m3672compareTo0680j_4(f, Dp.m3673constructorimpl(0.0f)) > 0;
        }
        return m318shadowziNgDLE(modifier, f, shape, z);
    }

    public static final Modifier dropShadow(Modifier modifier, Shape shape, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new BlockDropShadowElement(shape, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final Modifier innerShadow(Modifier modifier, Shape shape, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new BlockInnerShadowElement(shape, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}

package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class BlurKt {
    /* JADX INFO: renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m240blurF8QBwvs(Modifier modifier, float f, Shape shape) {
        return m238blur1fqSgw(modifier, f, f, shape);
    }

    /* JADX INFO: renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m238blur1fqSgw(Modifier modifier, final float f, final float f2, final Shape shape) {
        int iM1121getDecal3opZhB0;
        boolean z;
        if (shape != null) {
            iM1121getDecal3opZhB0 = TileMode.Companion.m1120getClamp3opZhB0();
            z = true;
        } else {
            iM1121getDecal3opZhB0 = TileMode.Companion.m1121getDecal3opZhB0();
            z = false;
        }
        final int i = iM1121getDecal3opZhB0;
        final boolean z2 = z;
        return ((Dp.m3672compareTo0680j_4(f, Dp.m3673constructorimpl(0.0f)) <= 0 || Dp.m3672compareTo0680j_4(f2, Dp.m3673constructorimpl(0.0f)) <= 0) && !z2) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope) {
                float fMo48toPx0680j_4 = graphicsLayerScope.mo48toPx0680j_4(f);
                float fMo48toPx0680j_5 = graphicsLayerScope.mo48toPx0680j_4(f2);
                graphicsLayerScope.setRenderEffect((fMo48toPx0680j_4 <= 0.0f || fMo48toPx0680j_5 <= 0.0f) ? null : RenderEffectKt.m1049BlurEffect3YTHUZs(fMo48toPx0680j_4, fMo48toPx0680j_5, i));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z2);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m239blur1fqSgw$default(Modifier modifier, float f, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m242boximpl(BlurredEdgeTreatment.Companion.m249getRectangleGoahg());
        }
        return m238blur1fqSgw(modifier, f, f2, blurredEdgeTreatment.m248unboximpl());
    }

    /* JADX INFO: renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m241blurF8QBwvs$default(Modifier modifier, float f, BlurredEdgeTreatment blurredEdgeTreatment, int i, Object obj) {
        if ((i & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m242boximpl(BlurredEdgeTreatment.Companion.m249getRectangleGoahg());
        }
        return m240blurF8QBwvs(modifier, f, blurredEdgeTreatment.m248unboximpl());
    }
}

package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public interface GraphicsLayerImpl {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM DefaultDrawBlock = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayerImpl$Companion$DefaultDrawBlock$1
            public final void invoke(DrawScope drawScope) {
                DrawScope.m1298drawRectnJ9OG0$default(drawScope, Color.Companion.m757getTransparent0d7_KjU(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return createFromParcel.INSTANCE;
            }
        };

        private Companion() {
        }

        public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getDefaultDrawBlock() {
            return DefaultDrawBlock;
        }
    }

    Matrix calculateMatrix();

    void discardDisplayList();

    void draw(Canvas canvas);

    float getAlpha();

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    long mo1407getAmbientShadowColor0d7_KjU();

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    int mo1408getBlendMode0nO6VwU();

    float getCameraDistance();

    boolean getClip();

    ColorFilter getColorFilter();

    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    int mo1409getCompositingStrategyke2Ky5w();

    default boolean getHasDisplayList() {
        return true;
    }

    long getLayerId();

    long getOwnerId();

    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0, reason: not valid java name */
    long mo1410getPivotOffsetF1C5BW0();

    RenderEffect getRenderEffect();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    long mo1411getSpotShadowColor0d7_KjU();

    default boolean getSupportsSoftwareRendering() {
        return false;
    }

    float getTranslationX();

    float getTranslationY();

    boolean isInvalidated();

    void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    void setAlpha(float f);

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    void mo1412setAmbientShadowColor8_81llA(long j);

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    void mo1413setBlendModes9anfk8(int i);

    void setCameraDistance(float f);

    void setClip(boolean z);

    void setColorFilter(ColorFilter colorFilter);

    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    void mo1414setCompositingStrategyWpw9cng(int i);

    void setInvalidated(boolean z);

    /* JADX INFO: renamed from: setOutline-O0kMr_c, reason: not valid java name */
    void mo1415setOutlineO0kMr_c(Outline outline, long j);

    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    void mo1416setPivotOffsetk4lQ0M(long j);

    /* JADX INFO: renamed from: setPosition-H0pRuoY, reason: not valid java name */
    void mo1417setPositionH0pRuoY(int i, int i2, long j);

    void setRenderEffect(RenderEffect renderEffect);

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    void mo1418setSpotShadowColor8_81llA(long j);

    void setTranslationX(float f);

    void setTranslationY(float f);
}

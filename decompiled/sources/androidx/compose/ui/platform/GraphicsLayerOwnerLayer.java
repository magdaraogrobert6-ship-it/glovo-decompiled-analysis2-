package androidx.compose.ui.platform;

import android.os.Build;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer, GraphicLayerInfo {
    public static final int $stable = 8;
    private final GraphicsContext context;
    private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 drawBlock;
    private boolean drawnWithEnabledZ;
    private float frameRate;
    private GraphicsLayer graphicsLayer;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 invalidateParentLayer;
    private float[] inverseMatrixCache;
    private boolean isDestroyed;
    private boolean isDirty;
    private boolean isFrameRateFromParent;
    private boolean isInverseMatrixDirty;
    private boolean isMatrixDirty;
    private int mutatedFields;
    private Outline outline;
    private final AndroidComposeView ownerView;
    private long size = IntSize.m3839constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
    private final float[] matrixCache = Matrix.m969constructorimpl$default(null, 1, null);
    private Density density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private final CanvasDrawScope scope = new CanvasDrawScope();
    private long transformOrigin = TransformOrigin.Companion.m1138getCenterSzJe1aQ();
    private boolean isIdentity = true;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM recordLambda = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        public final void invoke(DrawScope drawScope) {
            GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
            Canvas canvas = drawScope.getDrawContext().getCanvas();
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = graphicsLayerOwnerLayer.drawBlock;
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null) {
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(canvas, drawScope.getDrawContext().getGraphicsLayer());
            }
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((DrawScope) obj);
            return createFromParcel.INSTANCE;
        }
    };

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setFrameRate(0.0f);
        setFrameRateFromParent(false);
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(this.graphicsLayer);
            this.ownerView.recycle$ui(this);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public float getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo2608getUnderlyingMatrixsQKQjiQ() {
        return m2743getMatrixsQKQjiQ();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean isFrameRateFromParent() {
        return this.isFrameRateFromParent;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void setFrameRate(float f) {
        this.frameRate = f;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void setFrameRateFromParent(boolean z) {
        this.isFrameRateFromParent = z;
    }

    private final void triggerRepaint() {
        WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
    }

    private final void updateMatrix() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long jM556getCenteruvyYCjk = (graphicsLayer.m1394getPivotOffsetF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) == InlineClassHelperKt.UnspecifiedPackedFloats ? SizeKt.m556getCenteruvyYCjk(IntSizeKt.m3856toSizeozmzZPI(this.size)) : graphicsLayer.m1394getPivotOffsetF1C5BW0();
            Matrix.m980resetToPivotedTransformimpl$default(this.matrixCache, Float.intBitsToFloat((int) (jM556getCenteruvyYCjk >> 32)), Float.intBitsToFloat((int) (jM556getCenteruvyYCjk & 4294967295L)), graphicsLayer.getTranslationX(), graphicsLayer.getTranslationY(), 0.0f, graphicsLayer.getRotationX(), graphicsLayer.getRotationY(), graphicsLayer.getRotationZ(), graphicsLayer.getScaleX(), graphicsLayer.getScaleY(), 0.0f, 1040, null);
            this.isMatrixDirty = false;
            this.isIdentity = MatrixKt.m994isIdentity58bKbWc(this.matrixCache);
        }
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.graphicsLayer.getLayerId();
    }

    @Override // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return this.graphicsLayer.getOwnerViewId();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect, boolean z) {
        float[] fArrM2742getInverseMatrix3i98HWw = z ? m2742getInverseMatrix3i98HWw() : m2743getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return;
        }
        if (fArrM2742getInverseMatrix3i98HWw == null) {
            mutableRect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            Matrix.m977mapimpl(fArrM2742getInverseMatrix3i98HWw, mutableRect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: mapOffset-8S9VItk */
    public long mo2611mapOffset8S9VItk(long j, boolean z) {
        float[] fArrM2743getMatrixsQKQjiQ;
        if (z) {
            fArrM2743getMatrixsQKQjiQ = m2742getInverseMatrix3i98HWw();
            if (fArrM2743getMatrixsQKQjiQ == null) {
                return Offset.Companion.m491getInfiniteF1C5BW0();
            }
        } else {
            fArrM2743getMatrixsQKQjiQ = m2743getMatrixsQKQjiQ();
        }
        return this.isIdentity ? j : Matrix.m975mapMKHz9U(fArrM2743getMatrixsQKQjiQ, j);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: move--gyyYBs */
    public void mo2612movegyyYBs(long j) {
        if (this.ownerView.isArrEnabled$ui()) {
            this.ownerView.voteFrameRate(FrameRateCategory.Companion.m148getHighNSsRyOo());
        }
        this.graphicsLayer.m1406setTopLeftgyyYBs(j);
        triggerRepaint();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: resize-ozmzZPI */
    public void mo2613resizeozmzZPI(long j) {
        if (IntSize.m3842equalsimpl0(j, this.size)) {
            return;
        }
        if (this.ownerView.isArrEnabled$ui()) {
            this.ownerView.voteFrameRate(FrameRateCategory.Companion.m148getHighNSsRyOo());
        }
        this.size = j;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if (this.ownerView.isArrEnabled$ui() && getFrameRate() != 0.0f) {
            this.ownerView.voteFrameRate(getFrameRate());
        }
        if (this.isDirty) {
            if (!TransformOrigin.m1132equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m1138getCenterSzJe1aQ()) && !IntSize.m3842equalsimpl0(this.graphicsLayer.m1395getSizeYbymL2g(), this.size)) {
                this.graphicsLayer.m1402setPivotOffsetk4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(TransformOrigin.m1133getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32)))) << 32) | (((long) Float.floatToRawIntBits(TransformOrigin.m1134getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L)));
            }
            this.graphicsLayer.m1398recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, GraphicsContext graphicsContext, AndroidComposeView androidComposeView, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.graphicsLayer = graphicsLayer;
        this.context = graphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.invalidateParentLayer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    /* JADX INFO: renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    private final float[] m2743getMatrixsQKQjiQ() {
        updateMatrix();
        return this.matrixCache;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        updateDisplayList();
        this.drawnWithEnabledZ = this.graphicsLayer.getShadowElevation() > 0.0f;
        DrawContext drawContext = this.scope.getDrawContext();
        drawContext.setCanvas(canvas);
        drawContext.setGraphicsLayer(graphicsLayer);
        GraphicsLayerKt.drawLayer(this.scope, this.graphicsLayer);
    }

    private final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui(this, z);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void reuseLayer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        GraphicsContext graphicsContext = this.context;
        if (graphicsContext == null) {
            throw c8$$ExternalSyntheticOutline0.m("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.graphicsLayer.isReleased()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("layer should have been released before reuse");
        }
        this.graphicsLayer = graphicsContext.createGraphicsLayer();
        this.isDestroyed = false;
        this.drawBlock = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.invalidateParentLayer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        Matrix.m978resetimpl(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            Matrix.m978resetimpl(fArr);
        }
        this.transformOrigin = TransformOrigin.Companion.m1138getCenterSzJe1aQ();
        this.drawnWithEnabledZ = false;
        this.size = IntSize.m3839constructorimpl(InlineClassHelperKt.DualUnsignedFloatMask);
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: transform-58bKbWc */
    public void mo2614transform58bKbWc(float[] fArr) {
        Matrix.m988timesAssign58bKbWc(fArr, m2743getMatrixsQKQjiQ());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties(ReusableGraphicsLayerScope reusableGraphicsLayerScope) {
        int iM1385getModulateAlphake2Ky5w;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        int mutatedFields$ui = reusableGraphicsLayerScope.getMutatedFields$ui() | this.mutatedFields;
        this.layoutDirection = reusableGraphicsLayerScope.getLayoutDirection$ui();
        this.density = reusableGraphicsLayerScope.getGraphicsDensity$ui();
        int i = mutatedFields$ui & Fields.TransformOrigin;
        if (i != 0) {
            this.transformOrigin = reusableGraphicsLayerScope.mo921getTransformOriginSzJe1aQ();
        }
        if ((mutatedFields$ui & 1) != 0) {
            this.graphicsLayer.setScaleX(reusableGraphicsLayerScope.getScaleX());
        }
        if ((mutatedFields$ui & 2) != 0) {
            this.graphicsLayer.setScaleY(reusableGraphicsLayerScope.getScaleY());
        }
        if ((mutatedFields$ui & 4) != 0) {
            this.graphicsLayer.setAlpha(reusableGraphicsLayerScope.getAlpha());
        }
        if ((mutatedFields$ui & 8) != 0) {
            this.graphicsLayer.setTranslationX(reusableGraphicsLayerScope.getTranslationX());
        }
        if ((mutatedFields$ui & 16) != 0) {
            this.graphicsLayer.setTranslationY(reusableGraphicsLayerScope.getTranslationY());
        }
        if ((mutatedFields$ui & 32) != 0) {
            this.graphicsLayer.setShadowElevation(reusableGraphicsLayerScope.getShadowElevation());
            if (reusableGraphicsLayerScope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.invalidateParentLayer) != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        }
        if ((mutatedFields$ui & 64) != 0) {
            this.graphicsLayer.m1399setAmbientShadowColor8_81llA(reusableGraphicsLayerScope.mo916getAmbientShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui & Fields.SpotShadowColor) != 0) {
            this.graphicsLayer.m1405setSpotShadowColor8_81llA(reusableGraphicsLayerScope.mo920getSpotShadowColor0d7_KjU());
        }
        if ((mutatedFields$ui & Fields.RotationZ) != 0) {
            this.graphicsLayer.setRotationZ(reusableGraphicsLayerScope.getRotationZ());
        }
        if ((mutatedFields$ui & Fields.RotationX) != 0) {
            this.graphicsLayer.setRotationX(reusableGraphicsLayerScope.getRotationX());
        }
        if ((mutatedFields$ui & Fields.RotationY) != 0) {
            this.graphicsLayer.setRotationY(reusableGraphicsLayerScope.getRotationY());
        }
        if ((mutatedFields$ui & Fields.CameraDistance) != 0) {
            this.graphicsLayer.setCameraDistance(reusableGraphicsLayerScope.getCameraDistance());
        }
        if (i != 0) {
            boolean zM1132equalsimpl0 = TransformOrigin.m1132equalsimpl0(this.transformOrigin, TransformOrigin.Companion.m1138getCenterSzJe1aQ());
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            if (zM1132equalsimpl0) {
                graphicsLayer.m1402setPivotOffsetk4lQ0M(Offset.Companion.m492getUnspecifiedF1C5BW0());
            } else {
                graphicsLayer.m1402setPivotOffsetk4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(TransformOrigin.m1134getPivotFractionYimpl(this.transformOrigin) * ((int) (this.size & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(TransformOrigin.m1133getPivotFractionXimpl(this.transformOrigin) * ((int) (this.size >> 32)))) << 32)));
            }
        }
        if ((mutatedFields$ui & Fields.Clip) != 0) {
            this.graphicsLayer.setClip(reusableGraphicsLayerScope.getClip());
        }
        if ((131072 & mutatedFields$ui) != 0) {
            this.graphicsLayer.setRenderEffect(reusableGraphicsLayerScope.getRenderEffect());
        }
        if ((262144 & mutatedFields$ui) != 0) {
            this.graphicsLayer.setColorFilter(reusableGraphicsLayerScope.getColorFilter());
        }
        if ((524288 & mutatedFields$ui) != 0) {
            this.graphicsLayer.m1400setBlendModes9anfk8(reusableGraphicsLayerScope.mo917getBlendMode0nO6VwU());
        }
        if ((32768 & mutatedFields$ui) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            int iMo918getCompositingStrategyNrFUSI = reusableGraphicsLayerScope.mo918getCompositingStrategyNrFUSI();
            CompositingStrategy.Companion companion = CompositingStrategy.Companion;
            if (CompositingStrategy.m810equalsimpl0(iMo918getCompositingStrategyNrFUSI, companion.m814getAutoNrFUSI())) {
                iM1385getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m1384getAutoke2Ky5w();
            } else if (CompositingStrategy.m810equalsimpl0(iMo918getCompositingStrategyNrFUSI, companion.m816getOffscreenNrFUSI())) {
                iM1385getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m1386getOffscreenke2Ky5w();
            } else {
                if (!CompositingStrategy.m810equalsimpl0(iMo918getCompositingStrategyNrFUSI, companion.m815getModulateAlphaNrFUSI())) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Not supported composition strategy");
                    return;
                }
                iM1385getModulateAlphake2Ky5w = androidx.compose.ui.graphics.layer.CompositingStrategy.Companion.m1385getModulateAlphake2Ky5w();
            }
            graphicsLayer2.m1401setCompositingStrategyWpw9cng(iM1385getModulateAlphake2Ky5w);
        }
        boolean z = true;
        if ((mutatedFields$ui & Fields.MatrixAffectingFields) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.outline, reusableGraphicsLayerScope.getOutline$ui()}, getCieXyz.write())).booleanValue()) {
            z = false;
        } else {
            this.outline = reusableGraphicsLayerScope.getOutline$ui();
            updateOutline();
        }
        this.mutatedFields = reusableGraphicsLayerScope.getMutatedFields$ui();
        if (mutatedFields$ui != 0 || z) {
            triggerRepaint();
            if (this.ownerView.isArrEnabled$ui()) {
                this.ownerView.voteFrameRate(getFrameRate());
            }
        }
    }

    private final void updateOutline() {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        Outline outline = this.outline;
        if (outline == null) {
            return;
        }
        GraphicsLayerKt.setOutline(this.graphicsLayer, outline);
        if (Build.VERSION.SDK_INT < 33) {
            if (((outline instanceof Outline.Generic) || ((outline instanceof Outline.Rounded) && !RoundRectKt.isSimple(((Outline.Rounded) outline).getRoundRect()))) && (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.invalidateParentLayer) != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: isInLayer-k-4lQ0M */
    public boolean mo2610isInLayerk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return ShapeContainingUtilKt.isInOutline$default(this.graphicsLayer.getOutline(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    /* JADX INFO: renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    private final float[] m2742getInverseMatrix3i98HWw() {
        float[] fArrM969constructorimpl$default = this.inverseMatrixCache;
        if (fArrM969constructorimpl$default == null) {
            fArrM969constructorimpl$default = Matrix.m969constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM969constructorimpl$default;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrM969constructorimpl$default[0])) {
                return null;
            }
            return fArrM969constructorimpl$default;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrM2743getMatrixsQKQjiQ = m2743getMatrixsQKQjiQ();
        if (this.isIdentity) {
            return fArrM2743getMatrixsQKQjiQ;
        }
        if (InvertMatrixKt.m2746invertToJiSxe2E(fArrM2743getMatrixsQKQjiQ, fArrM969constructorimpl$default)) {
            return fArrM969constructorimpl$default;
        }
        fArrM969constructorimpl$default[0] = Float.NaN;
        return null;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* JADX INFO: renamed from: inverseTransform-58bKbWc */
    public void mo2609inverseTransform58bKbWc(float[] fArr) {
        float[] fArrM2742getInverseMatrix3i98HWw = m2742getInverseMatrix3i98HWw();
        if (fArrM2742getInverseMatrix3i98HWw != null) {
            Matrix.m988timesAssign58bKbWc(fArr, fArrM2742getInverseMatrix3i98HWw);
        }
    }
}

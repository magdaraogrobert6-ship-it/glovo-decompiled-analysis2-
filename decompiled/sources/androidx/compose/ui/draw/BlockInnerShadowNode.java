package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class BlockInnerShadowNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode, InnerShadowScope {
    public static final int $stable = 0;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM block;
    private boolean blockRead;
    private Brush brush;
    private Density densityObject;
    private float radius;
    private InnerShadowPainter shadowPainter;
    private Shape shape;
    private float spread;
    private Shadow targetShadow;
    private long offset = Offset.Companion.m493getZeroF1C5BW0();
    private long color = Color.Companion.m748getBlack0d7_KjU();
    private float alpha = 1.0f;
    private int blendMode = BlendMode.Companion.m662getSrcOver0nO6VwU();

    private final void invalidateShadow() {
        this.targetShadow = null;
        this.shadowPainter = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo230getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public Brush getBrush() {
        return this.brush;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public long mo231getColor0d7_KjU() {
        return this.color;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: getOffset-F1C5BW0 */
    public long mo232getOffsetF1C5BW0() {
        return this.offset;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getRadius() {
        return this.radius;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public float getSpread() {
        return this.spread;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.blockRead = false;
        invalidateShadow();
    }

    private final void setShape(Shape shape) {
        Object[] objArr = {this.shape, shape};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.shape = shape;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo233setBlendModes9anfk8(int i) {
        if (BlendMode.m631equalsimpl0(this.blendMode, i)) {
            return;
        }
        this.blendMode = i;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setBrush(Brush brush) {
        Object[] objArr = {this.brush, brush};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.brush = brush;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: setOffset-k-4lQ0M */
    public void mo235setOffsetk4lQ0M(long j) {
        if (Offset.m474equalsimpl0(this.offset, j)) {
            return;
        }
        this.offset = j;
        invalidateShadow();
    }

    public BlockInnerShadowNode(Shape shape, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.shape = shape;
        this.block = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        updateDensity();
    }

    public final void update(Shape shape, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        setShape(shape);
        setBlock(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    private final void setBlock(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.block != r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            this.block = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            this.blockRead = false;
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    private final void updateDensity() {
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        Object[] objArr = {this.densityObject, densityRequireDensity};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.densityObject = densityRequireDensity;
        this.blockRead = false;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        Painter.m1429drawx_KDEd0$default(obtainPainter(), contentDrawScope, contentDrawScope.mo1304getSizeNHjbRc(), 0.0f, null, 6, null);
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getDensity();
        }
        return 1.0f;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        Density density = this.densityObject;
        if (density != null) {
            return density.getFontScale();
        }
        return 1.0f;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(getAlpha());
        int iHashCode2 = this.shape.hashCode();
        int iHashCode3 = this.block.hashCode();
        int iHashCode4 = Float.hashCode(getRadius());
        int iHashCode5 = Float.hashCode(getSpread());
        int iM479hashCodeimpl = Offset.m479hashCodeimpl(mo232getOffsetF1C5BW0());
        int iM729hashCodeimpl = Color.m729hashCodeimpl(mo231getColor0d7_KjU());
        Brush brush = getBrush();
        return BlendMode.m632hashCodeimpl(mo230getBlendMode0nO6VwU()) + ((((iM729hashCodeimpl + ((iM479hashCodeimpl + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (brush != null ? brush.hashCode() : 0)) * 31);
    }

    private final InnerShadowPainter obtainPainter() {
        if (!this.blockRead) {
            this.blockRead = true;
            ShadowKt.resetShadow(this);
            ObserverModifierNodeKt.observeReads(this, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.draw.BlockInnerShadowNode.obtainPainter.1
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m237invoke() {
                    BlockInnerShadowNode.this.block.invoke(BlockInnerShadowNode.this);
                }

                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m237invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        }
        Shadow shadow = this.targetShadow;
        InnerShadowPainter innerShadowPainter = this.shadowPainter;
        Brush brush = getBrush();
        float fMo44toDpu2uoSUM = mo44toDpu2uoSUM(getRadius());
        float fMo44toDpu2uoSUM2 = mo44toDpu2uoSUM(getSpread());
        long jM3729constructorimpl = DpOffset.m3729constructorimpl((((long) Float.floatToRawIntBits(mo44toDpu2uoSUM(Float.intBitsToFloat((int) (mo232getOffsetF1C5BW0() & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(mo44toDpu2uoSUM(Float.intBitsToFloat((int) (mo232getOffsetF1C5BW0() >> 32))))) << 32));
        if (innerShadowPainter != null && shadow != null && Dp.m3678equalsimpl0(shadow.m1450getRadiusD9Ej5fM(), fMo44toDpu2uoSUM) && Dp.m3678equalsimpl0(shadow.m1451getSpreadD9Ej5fM(), fMo44toDpu2uoSUM2) && Color.m723equalsimpl0(shadow.m1448getColor0d7_KjU(), mo231getColor0d7_KjU())) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{shadow.getBrush(), brush}, getCieXyz.write())).booleanValue() && shadow.getAlpha() == getAlpha() && BlendMode.m631equalsimpl0(shadow.m1447getBlendMode0nO6VwU(), mo230getBlendMode0nO6VwU()) && DpOffset.m3733equalsimpl0(shadow.m1449getOffsetRKDOV3M(), jM3729constructorimpl)) {
                return innerShadowPainter;
            }
        }
        Shadow shadow2 = brush != null ? new Shadow(fMo44toDpu2uoSUM, brush, fMo44toDpu2uoSUM2, jM3729constructorimpl, getAlpha(), mo230getBlendMode0nO6VwU(), (DefaultConstructorMarker) null) : new Shadow(fMo44toDpu2uoSUM, mo231getColor0d7_KjU(), fMo44toDpu2uoSUM2, jM3729constructorimpl, getAlpha(), mo230getBlendMode0nO6VwU(), (DefaultConstructorMarker) null);
        this.targetShadow = shadow2;
        InnerShadowPainter innerShadowPainterCreateInnerShadowPainter = DelegatableNodeKt.requireGraphicsContext(this).getShadowContext().createInnerShadowPainter(this.shape, shadow2);
        this.shadowPainter = innerShadowPainterCreateInnerShadowPainter;
        return innerShadowPainterCreateInnerShadowPainter;
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        if (isAttached()) {
            updateDensity();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof BlockInnerShadowNode)) {
            BlockInnerShadowNode blockInnerShadowNode = (BlockInnerShadowNode) obj;
            if (getAlpha() == blockInnerShadowNode.getAlpha()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shape, blockInnerShadowNode.shape}, getCieXyz.write())).booleanValue() || this.block != blockInnerShadowNode.block || getRadius() != blockInnerShadowNode.getRadius() || getSpread() != blockInnerShadowNode.getSpread() || !Offset.m474equalsimpl0(mo232getOffsetF1C5BW0(), blockInnerShadowNode.mo232getOffsetF1C5BW0()) || !Color.m723equalsimpl0(mo231getColor0d7_KjU(), blockInnerShadowNode.mo231getColor0d7_KjU())) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getBrush(), blockInnerShadowNode.getBrush()}, getCieXyz.write())).booleanValue() && BlendMode.m631equalsimpl0(mo230getBlendMode0nO6VwU(), blockInnerShadowNode.mo230getBlendMode0nO6VwU());
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setAlpha(float f) {
        if (this.alpha == f) {
            return;
        }
        this.alpha = f;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    /* JADX INFO: renamed from: setColor-8_81llA */
    public void mo234setColor8_81llA(long j) {
        if (j == 16) {
            j = Color.Companion.m748getBlack0d7_KjU();
        }
        if (Color.m723equalsimpl0(this.color, j)) {
            return;
        }
        this.color = j;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setRadius(float f) {
        if (this.radius == f) {
            return;
        }
        this.radius = f;
        invalidateShadow();
    }

    @Override // androidx.compose.ui.draw.ShadowScope
    public void setSpread(float f) {
        if (this.spread == f) {
            return;
        }
        this.spread = f;
        invalidateShadow();
    }
}

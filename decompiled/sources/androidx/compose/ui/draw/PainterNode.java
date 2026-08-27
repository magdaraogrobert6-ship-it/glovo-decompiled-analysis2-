package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m305hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        return !Size.m542equalsimpl0(j, Size.Companion.m554getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m306hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        return !Size.m542equalsimpl0(j, Size.Companion.m554getUnspecifiedNHjbRc()) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long jMo1424getIntrinsicSizeNHjbRc = this.painter.mo1424getIntrinsicSizeNHjbRc();
        float fIntBitsToFloat = m306hasSpecifiedAndFiniteWidthuvyYCjk(jMo1424getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32)) : Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32));
        long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(m305hasSpecifiedAndFiniteHeightuvyYCjk(jMo1424getIntrinsicSizeNHjbRc) ? Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc & 4294967295L)) : Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jM555getZeroNHjbRc = (Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32)) == 0.0f || Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() & 4294967295L)) == 0.0f) ? Size.Companion.m555getZeroNHjbRc() : ScaleFactorKt.m2345timesUQTWf7w(jM537constructorimpl, this.contentScale.mo2202computeScaleFactorH7hwNQA(jM537constructorimpl, contentDrawScope.mo1304getSizeNHjbRc()));
        long jMo139alignKFBX0sM = this.alignment.mo139alignKFBX0sM(IntSize.m3839constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (jM555getZeroNHjbRc & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (jM555getZeroNHjbRc >> 32)))) << 32)), IntSize.m3839constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (contentDrawScope.mo1304getSizeNHjbRc() >> 32)))) << 32)), contentDrawScope.getLayoutDirection());
        float fM3801getXimpl = IntOffset.m3801getXimpl(jMo139alignKFBX0sM);
        float fM3802getYimpl = IntOffset.m3802getYimpl(jMo139alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM3801getXimpl, fM3802getYimpl);
        try {
            this.painter.m1430drawx_KDEd0(contentDrawScope, jM555getZeroNHjbRc, this.alpha, this.colorFilter);
            contentDrawScope.getDrawContext().getTransform().translate(-fM3801getXimpl, -fM3802getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope.getDrawContext().getTransform().translate(-fM3801getXimpl, -fM3802getYimpl);
            throw th;
        }
    }

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo1424getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        final Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(m307modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo2209measureBRTryo0, 0, 0, 0.0f, 4, null);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m304calculateScaledSizeE7KxVPU(long j) {
        if (!getUseIntrinsicSize()) {
            return j;
        }
        long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(!m306hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo1424getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (this.painter.mo1424getIntrinsicSizeNHjbRc() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!m305hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo1424getIntrinsicSizeNHjbRc()) ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (this.painter.mo1424getIntrinsicSizeNHjbRc() & 4294967295L)))) & 4294967295L));
        return (Float.intBitsToFloat((int) (j >> 32)) == 0.0f || Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) ? Size.Companion.m555getZeroNHjbRc() : ScaleFactorKt.m2345timesUQTWf7w(jM537constructorimpl, this.contentScale.mo2202computeScaleFactorH7hwNQA(jM537constructorimpl, j));
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m307modifyConstraintsZezNO4M(long j) {
        boolean z = Constraints.m3622getHasBoundedWidthimpl(j) && Constraints.m3621getHasBoundedHeightimpl(j);
        boolean z2 = Constraints.m3624getHasFixedWidthimpl(j) && Constraints.m3623getHasFixedHeightimpl(j);
        if ((!getUseIntrinsicSize() && z) || z2) {
            return Constraints.m3616copyZbe2FdA$default(j, Constraints.m3626getMaxWidthimpl(j), 0, Constraints.m3625getMaxHeightimpl(j), 0, 10, null);
        }
        long jMo1424getIntrinsicSizeNHjbRc = this.painter.mo1424getIntrinsicSizeNHjbRc();
        long jM304calculateScaledSizeE7KxVPU = m304calculateScaledSizeE7KxVPU(Size.m537constructorimpl((((long) Float.floatToRawIntBits(ConstraintsKt.m3643constrainWidthK40F9xA(j, m306hasSpecifiedAndFiniteWidthuvyYCjk(jMo1424getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32))) : Constraints.m3628getMinWidthimpl(j)))) << 32) | (((long) Float.floatToRawIntBits(ConstraintsKt.m3642constrainHeightK40F9xA(j, m305hasSpecifiedAndFiniteHeightuvyYCjk(jMo1424getIntrinsicSizeNHjbRc) ? Math.round(Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc & 4294967295L))) : Constraints.m3627getMinHeightimpl(j)))) & 4294967295L)));
        return Constraints.m3616copyZbe2FdA$default(j, ConstraintsKt.m3643constrainWidthK40F9xA(j, Math.round(Float.intBitsToFloat((int) (jM304calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m3642constrainHeightK40F9xA(j, Math.round(Float.intBitsToFloat((int) (jM304calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i);
        }
        long jM307modifyConstraintsZezNO4M = m307modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m3628getMinWidthimpl(jM307modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        long jM307modifyConstraintsZezNO4M = m307modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(Constraints.m3628getMinWidthimpl(jM307modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i);
        }
        long jM307modifyConstraintsZezNO4M = m307modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m3627getMinHeightimpl(jM307modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        long jM307modifyConstraintsZezNO4M = m307modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(Constraints.m3627getMinHeightimpl(jM307modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }
}

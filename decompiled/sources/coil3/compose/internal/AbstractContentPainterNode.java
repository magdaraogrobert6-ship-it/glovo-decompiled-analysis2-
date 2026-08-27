package coil3.compose.internal;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
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
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.OutlinedTextFieldDefaults;
import o.dashPathEffectdefault;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractContentPainterNode extends Modifier.Node implements DrawModifierNode, LayoutModifierNode, SemanticsModifierNode {
    public boolean IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public ContentScale MediaMetadataCompat;
    public Alignment RemoteActionCompatParcelizer;
    public float read;
    public ColorFilter serializer;
    public ConstraintsSizeResolver write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public abstract Painter write();

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(ContentDrawScope contentDrawScope) {
        long jM3983calculateScaledSizeE7KxVPU = m3983calculateScaledSizeE7KxVPU(contentDrawScope.mo1304getSizeNHjbRc());
        long jMo139alignKFBX0sM = this.RemoteActionCompatParcelizer.mo139alignKFBX0sM(UtilsKt.m3985toIntSizeuvyYCjk(jM3983calculateScaledSizeE7KxVPU), UtilsKt.m3985toIntSizeuvyYCjk(contentDrawScope.mo1304getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        int iM3801getXimpl = IntOffset.m3801getXimpl(jMo139alignKFBX0sM);
        int iM3802getYimpl = IntOffset.m3802getYimpl(jMo139alignKFBX0sM);
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            if (this.IconCompatParcelizer) {
                DrawTransform.m1361clipRectN_I0leg$default(transform, 0.0f, 0.0f, 0.0f, 0.0f, 0, 31, null);
            }
            transform.translate(iM3801getXimpl, iM3802getYimpl);
            write().m1430drawx_KDEd0(contentDrawScope, jM3983calculateScaledSizeE7KxVPU, this.read, this.serializer);
            drawContext.getCanvas().restore();
            drawContext.mo1226setSizeuvyYCjk(jMo1225getSizeNHjbRc);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
            throw th;
        }
    }

    public AbstractContentPainterNode(Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, boolean z, String str, ConstraintsSizeResolver constraintsSizeResolver) {
        this.RemoteActionCompatParcelizer = alignment;
        this.MediaMetadataCompat = contentScale;
        this.read = f;
        this.serializer = colorFilter;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatMediaItem = str;
        this.write = constraintsSizeResolver;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        String str = this.MediaBrowserCompatMediaItem;
        if (str != null) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
            SemanticsPropertiesKt.m2833setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m2818getImageo7Vup1c());
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        ConstraintsSizeResolver constraintsSizeResolver = this.write;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.read(j);
        }
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(m3984modifyConstraintsZezNO4M(j));
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new OutlinedTextFieldDefaults(placeableMo2209measureBRTryo0, 5), 4, null);
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    public final long m3984modifyConstraintsZezNO4M(long j) {
        float fM3628getMinWidthimpl;
        int iM3627getMinHeightimpl;
        float fWrite;
        boolean zM3624getHasFixedWidthimpl = Constraints.m3624getHasFixedWidthimpl(j);
        boolean zM3623getHasFixedHeightimpl = Constraints.m3623getHasFixedHeightimpl(j);
        if (zM3624getHasFixedWidthimpl && zM3623getHasFixedHeightimpl) {
            return j;
        }
        Painter painterWrite = write();
        boolean z = Constraints.m3622getHasBoundedWidthimpl(j) && Constraints.m3621getHasBoundedHeightimpl(j);
        long jMo1424getIntrinsicSizeNHjbRc = painterWrite.mo1424getIntrinsicSizeNHjbRc();
        if (jMo1424getIntrinsicSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats) {
            if (z) {
                return ((painterWrite instanceof AsyncImagePainter) && ((dashPathEffectdefault) ((AsyncImagePainter) painterWrite).ResultReceiver.read()).serializer() == null) ? j : Constraints.m3616copyZbe2FdA$default(j, Constraints.m3626getMaxWidthimpl(j), 0, Constraints.m3625getMaxHeightimpl(j), 0, 10, null);
            }
            return j;
        }
        if (!z || (!zM3624getHasFixedWidthimpl && !zM3623getHasFixedHeightimpl)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc & 4294967295L));
            if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                int i = UtilsKt.write;
                fM3628getMinWidthimpl = RangesKt.write(fIntBitsToFloat, Constraints.m3628getMinWidthimpl(j), Constraints.m3626getMaxWidthimpl(j));
            } else {
                fM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
            }
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                int i2 = UtilsKt.write;
                fWrite = RangesKt.write(fIntBitsToFloat2, Constraints.m3627getMinHeightimpl(j), Constraints.m3625getMaxHeightimpl(j));
            } else {
                iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
            }
            long jM3983calculateScaledSizeE7KxVPU = m3983calculateScaledSizeE7KxVPU(Size.m537constructorimpl((((long) Float.floatToRawIntBits(fWrite)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM3628getMinWidthimpl)) << 32)));
            return Constraints.m3616copyZbe2FdA$default(j, ConstraintsKt.m3643constrainWidthK40F9xA(j, MathKt.write(Float.intBitsToFloat((int) (jM3983calculateScaledSizeE7KxVPU >> 32)))), 0, ConstraintsKt.m3642constrainHeightK40F9xA(j, MathKt.write(Float.intBitsToFloat((int) (jM3983calculateScaledSizeE7KxVPU & 4294967295L)))), 0, 10, null);
        }
        fM3628getMinWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        iM3627getMinHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        fWrite = iM3627getMinHeightimpl;
        long jM3983calculateScaledSizeE7KxVPU2 = m3983calculateScaledSizeE7KxVPU(Size.m537constructorimpl((((long) Float.floatToRawIntBits(fWrite)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM3628getMinWidthimpl)) << 32)));
        return Constraints.m3616copyZbe2FdA$default(j, ConstraintsKt.m3643constrainWidthK40F9xA(j, MathKt.write(Float.intBitsToFloat((int) (jM3983calculateScaledSizeE7KxVPU2 >> 32)))), 0, ConstraintsKt.m3642constrainHeightK40F9xA(j, MathKt.write(Float.intBitsToFloat((int) (jM3983calculateScaledSizeE7KxVPU2 & 4294967295L)))), 0, 10, null);
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    public final long m3983calculateScaledSizeE7KxVPU(long j) {
        if (Size.m548isEmptyimpl(j)) {
            return Size.Companion.m555getZeroNHjbRc();
        }
        long jMo1424getIntrinsicSizeNHjbRc = write().mo1424getIntrinsicSizeNHjbRc();
        if (jMo1424getIntrinsicSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo1424getIntrinsicSizeNHjbRc & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        long jM537constructorimpl = Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        long jMo2202computeScaleFactorH7hwNQA = this.MediaMetadataCompat.mo2202computeScaleFactorH7hwNQA(jM537constructorimpl, j);
        return (Math.abs(Float.intBitsToFloat((int) (jMo2202computeScaleFactorH7hwNQA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jMo2202computeScaleFactorH7hwNQA))) > Float.MAX_VALUE) ? j : ScaleFactorKt.m2346timesmw2e94(jMo2202computeScaleFactorH7hwNQA, jM537constructorimpl);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.write;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.read(jConstraints$default);
        }
        if (write().mo1424getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM3984modifyConstraintsZezNO4M = m3984modifyConstraintsZezNO4M(jConstraints$default);
            return Math.max(Constraints.m3628getMinWidthimpl(jM3984modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i));
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.write;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.read(jConstraints$default);
        }
        if (write().mo1424getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM3984modifyConstraintsZezNO4M = m3984modifyConstraintsZezNO4M(jConstraints$default);
            return Math.max(Constraints.m3628getMinWidthimpl(jM3984modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i));
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.write;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.read(jConstraints$default);
        }
        if (write().mo1424getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM3984modifyConstraintsZezNO4M = m3984modifyConstraintsZezNO4M(jConstraints$default);
            return Math.max(Constraints.m3627getMinHeightimpl(jM3984modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i));
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null);
        ConstraintsSizeResolver constraintsSizeResolver = this.write;
        if (constraintsSizeResolver != null) {
            constraintsSizeResolver.read(jConstraints$default);
        }
        if (write().mo1424getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats) {
            long jM3984modifyConstraintsZezNO4M = m3984modifyConstraintsZezNO4M(jConstraints$default);
            return Math.max(Constraints.m3627getMinHeightimpl(jM3984modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i));
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }
}

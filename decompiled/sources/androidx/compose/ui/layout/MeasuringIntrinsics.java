package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
final class MeasuringIntrinsics {
    public static final MeasuringIntrinsics INSTANCE = new MeasuringIntrinsics();

    public static final class DefaultIntrinsicMeasurable implements Measurable {
        private final IntrinsicMeasurable measurable;
        private final IntrinsicMinMax minMax;
        private final IntrinsicWidthHeight widthHeight;

        public final IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.measurable.getParentData();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return this.measurable.maxIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return this.measurable.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public Placeable mo2209measureBRTryo0(long j) {
            IntrinsicWidthHeight intrinsicWidthHeight = this.widthHeight;
            IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
            IntrinsicMinMax intrinsicMinMax = this.minMax;
            if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                IntrinsicMinMax intrinsicMinMax2 = IntrinsicMinMax.Max;
                IntrinsicMeasurable intrinsicMeasurable = this.measurable;
                return new EmptyPlaceable(intrinsicMinMax == intrinsicMinMax2 ? intrinsicMeasurable.maxIntrinsicWidth(Constraints.m3625getMaxHeightimpl(j)) : intrinsicMeasurable.minIntrinsicWidth(Constraints.m3625getMaxHeightimpl(j)), Constraints.m3621getHasBoundedHeightimpl(j) ? Constraints.m3625getMaxHeightimpl(j) : 32767);
            }
            IntrinsicMinMax intrinsicMinMax3 = IntrinsicMinMax.Max;
            IntrinsicMeasurable intrinsicMeasurable2 = this.measurable;
            return new EmptyPlaceable(Constraints.m3622getHasBoundedWidthimpl(j) ? Constraints.m3626getMaxWidthimpl(j) : 32767, intrinsicMinMax == intrinsicMinMax3 ? intrinsicMeasurable2.maxIntrinsicHeight(Constraints.m3626getMaxWidthimpl(j)) : intrinsicMeasurable2.minIntrinsicHeight(Constraints.m3626getMaxWidthimpl(j)));
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return this.measurable.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return this.measurable.minIntrinsicWidth(i);
        }

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }
    }

    public enum IntrinsicMinMax {
        Min,
        Max;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    public enum IntrinsicWidthHeight {
        Width,
        Height;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    private MeasuringIntrinsics() {
    }

    public final int maxHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo2235measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo2235measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int minHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo2235measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo2235measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public static final class EmptyPlaceable extends Placeable {
        @Override // androidx.compose.ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.ui.layout.Placeable
        /* JADX INFO: renamed from: placeAt-f8xVGno */
        public void mo2210placeAtf8xVGno(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        }

        public EmptyPlaceable(int i, int i2) {
            m2278setMeasuredSizeozmzZPI(IntSize.m3839constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32)));
        }
    }
}

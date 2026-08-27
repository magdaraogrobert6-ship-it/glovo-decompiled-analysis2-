package androidx.compose.ui.node;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;
    private final DepthSortedSet approachSet;
    private final DepthSortedSet lookaheadAndAncestorMeasureSet;
    private final DepthSortedSet lookaheadAndAncestorPlaceSet;

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final void add(LayoutNode layoutNode, Invalidation invalidation) {
        int i = WhenMappings.$EnumSwitchMapping$0[invalidation.ordinal()];
        if (i == 1) {
            this.lookaheadAndAncestorMeasureSet.add(layoutNode);
            this.approachSet.add(layoutNode);
            return;
        }
        if (i == 2) {
            this.lookaheadAndAncestorPlaceSet.add(layoutNode);
            this.approachSet.add(layoutNode);
            return;
        }
        if (i == 3) {
            if (layoutNode.getLookaheadRoot$ui() != null) {
                this.approachSet.add(layoutNode);
                return;
            } else {
                this.lookaheadAndAncestorMeasureSet.add(layoutNode);
                return;
            }
        }
        if (i != 4) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        } else if (layoutNode.getLookaheadRoot$ui() != null) {
            this.approachSet.add(layoutNode);
        } else {
            this.lookaheadAndAncestorPlaceSet.add(layoutNode);
        }
    }

    public final boolean getAffectsLookaheadMeasure() {
        return (this.approachSet.isEmpty() || this.lookaheadAndAncestorMeasureSet.isEmpty()) ? false : true;
    }

    public final boolean isEmpty() {
        return this.lookaheadAndAncestorMeasureSet.isEmpty() && this.approachSet.isEmpty() && this.lookaheadAndAncestorPlaceSet.isEmpty();
    }

    public final boolean remove(LayoutNode layoutNode) {
        return this.approachSet.remove(layoutNode) || this.lookaheadAndAncestorMeasureSet.remove(layoutNode) || this.lookaheadAndAncestorPlaceSet.remove(layoutNode);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Invalidation.values().length];
            try {
                iArr[Invalidation.LookaheadMeasurement.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Invalidation.LookaheadPlacement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Invalidation.Measurement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Invalidation.Placement.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final void popEach(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        LayoutNode layoutNodePop;
        while (true) {
            boolean z = false;
            boolean z2 = true;
            if (!this.lookaheadAndAncestorMeasureSet.isEmpty()) {
                layoutNodePop = this.lookaheadAndAncestorMeasureSet.pop();
                z2 = false;
                z = layoutNodePop.getLookaheadRoot$ui() != null;
            } else if (!this.lookaheadAndAncestorPlaceSet.isEmpty()) {
                layoutNodePop = this.lookaheadAndAncestorPlaceSet.pop();
                if (layoutNodePop.getLookaheadRoot$ui() != null) {
                    z = true;
                }
            } else if (this.approachSet.isEmpty()) {
                return;
            } else {
                layoutNodePop = this.approachSet.pop();
            }
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(layoutNodePop, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    public DepthSortedSetsForDifferentPasses(boolean z) {
        this.lookaheadAndAncestorMeasureSet = new DepthSortedSet(z);
        this.lookaheadAndAncestorPlaceSet = new DepthSortedSet(z);
        this.approachSet = new DepthSortedSet(z);
    }

    public final boolean contains(LayoutNode layoutNode, boolean z) {
        boolean z2 = layoutNode.getLookaheadRoot$ui() == null;
        boolean z3 = this.lookaheadAndAncestorMeasureSet.contains(layoutNode) || this.lookaheadAndAncestorPlaceSet.contains(layoutNode);
        if (z) {
            return !z2 && z3;
        }
        return (z2 && z3) || this.approachSet.contains(layoutNode);
    }

    public final boolean contains(LayoutNode layoutNode) {
        return this.lookaheadAndAncestorMeasureSet.contains(layoutNode) || this.lookaheadAndAncestorPlaceSet.contains(layoutNode) || this.approachSet.contains(layoutNode);
    }
}

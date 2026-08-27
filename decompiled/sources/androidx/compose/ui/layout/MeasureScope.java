package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.DpRect;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
@MeasureScopeMarker
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean isLookingAhead(MeasureScope measureScope) {
            return MeasureScope.super.isLookingAhead();
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, Map<AlignmentLine, Integer> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return MeasureScope.super.layout(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2256roundToPxR2X_6o(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo41roundToPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2257roundToPx0680j_4(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo42roundToPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2258toDpGaN1DYA(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo43toDpGaN1DYA(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2259toDpu2uoSUM(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo44toDpu2uoSUM(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2261toDpSizekrfVVM(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo46toDpSizekrfVVM(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2262toPxR2X_6o(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo47toPxR2X_6o(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2263toPx0680j_4(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo48toPx0680j_4(f);
        }

        @Deprecated
        public static Rect toRect(MeasureScope measureScope, DpRect dpRect) {
            return MeasureScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2264toSizeXkaWNTQ(MeasureScope measureScope, long j) {
            return MeasureScope.super.mo49toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2265toSp0xMU5do(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo50toSp0xMU5do(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2266toSpkPz2Gy4(MeasureScope measureScope, float f) {
            return MeasureScope.super.mo51toSpkPz2Gy4(f);
        }

        @Deprecated
        public static MeasureResult layout(MeasureScope measureScope, int i, int i2, Map<AlignmentLine, Integer> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            return MeasureScope.super.layout(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2260toDpu2uoSUM(MeasureScope measureScope, int i) {
            return MeasureScope.super.mo45toDpu2uoSUM(i);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2267toSpkPz2Gy4(MeasureScope measureScope, int i) {
            return MeasureScope.super.mo52toSpkPz2Gy4(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                map = SimpleItemTouchHelperCallback.serializer;
            }
            return measureScope.layout(i, i2, map, (i3 & 8) != 0 ? null : r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: layout");
        return null;
    }

    default MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm, this, r8lambdaunavo3sxub_pc9xroryotnrlvsm2) { // from class: androidx.compose.ui.layout.MeasureScope.layout.1
            final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM $placementBlock;
            final /* synthetic */ int $width;
            private final Map<AlignmentLine, Integer> alignmentLines;
            private final int height;
            private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rulers;
            final /* synthetic */ MeasureScope this$0;
            private final int width;

            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            {
                this.$width = i;
                this.this$0 = this;
                this.$placementBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                this.width = i;
                this.height = i2;
                this.alignmentLines = map;
                this.rulers = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                MeasureScope measureScope = this.this$0;
                boolean z = measureScope instanceof LookaheadCapablePlaceable;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = this.$placementBlock;
                if (z) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(((LookaheadCapablePlaceable) measureScope).getPlacementScope());
                } else {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(new SimplePlacementScope(this.$width, measureScope.getLayoutDirection(), this.this$0.getDensity(), this.this$0.getFontScale()));
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ MeasureResult layout$default(MeasureScope measureScope, int i, int i2, Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i3, Object obj) {
        if (obj != null) {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: layout");
            return null;
        }
        if ((i3 & 4) != 0) {
            map = SimpleItemTouchHelperCallback.serializer;
        }
        return measureScope.layout(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    default MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return layout(i, i2, map, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}

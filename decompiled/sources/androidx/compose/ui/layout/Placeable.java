package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import kotlin.ranges.RangesKt;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSize.m3839constructorimpl(0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.Companion.m3812getZeronOccac();

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name */
    public final long m2274getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name */
    public final long m2275getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name */
    public final long m2276getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo2277placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        mo2210placeAtf8xVGno(j, f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo2210placeAtf8xVGno(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m2278setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m3842equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m2279setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m3619equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }

    @PlacementScopeMarker
    public static abstract class PlacementScope implements Density {
        public static final int $stable = 0;
        private boolean motionFrameOfReferencePlacement;

        public float current(Ruler ruler, float f) {
            return f;
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m2286place70tqf50(Placeable placeable, long j, float f) {
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
        }

        public final void withMotionFrameOfReferencePlacement(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            this.motionFrameOfReferencePlacement = true;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m2287placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m2290placeAutoMirroredaW9wM$ui(Placeable placeable, long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(j))) << 32))), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m2291placeRelative70tqf50(Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(j))) << 32))), f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2292placeRelativeWithLayeraW9wM(Placeable placeable, long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(j))) << 32))), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2294placeWithLayeraW9wM(Placeable placeable, long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.place(placeable, i, i2, f);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: place");
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m2280place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m2286place70tqf50(placeable, j, f);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.placeRelative(placeable, i, i2, f);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m2281placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m2291placeRelative70tqf50(placeable, j, f);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m2288placeApparentToRealOffsetaW9wM$ui(Placeable placeable, long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2295placeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i3 & 8) != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.placeRelativeWithLayer(placeable, i, i2, f2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2282placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i & 4) != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.m2292placeRelativeWithLayeraW9wM(placeable, j, f2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i3 & 8) != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.placeWithLayer(placeable, i, i2, f2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2284placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i & 4) != 0) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.m2294placeWithLayeraW9wM(placeable, j, f2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        public final void place(Placeable placeable, int i, int i2, float f) {
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32))), f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            long jM3795constructorimpl = IntOffset.m3795constructorimpl((((long) i2) & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, jM3795constructorimpl), f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(jM3795constructorimpl)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(jM3795constructorimpl))) << 32))), f, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            long jM3795constructorimpl = IntOffset.m3795constructorimpl((((long) i2) & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, jM3795constructorimpl), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(jM3795constructorimpl)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(jM3795constructorimpl))) << 32))), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            placeable.mo2210placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32))), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32))), f, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2283placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m2293placeRelativeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m2285placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer, float f, int i, Object obj) {
            if (obj != null) {
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
                return;
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m2295placeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f, int i3, Object obj) {
            if (obj != null) {
                IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: placeWithLayer");
                return;
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m2289placeAutoMirroredaW9wM$ui(Placeable placeable, long j, float f, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                int parentWidth = getParentWidth();
                int width = placeable.getWidth();
                placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(j))) << 32))), f, graphicsLayer);
                return;
            }
            placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m2293placeRelativeWithLayeraW9wM(Placeable placeable, long j, GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                int parentWidth = getParentWidth();
                int width = placeable.getWidth();
                placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(j)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(j))) << 32))), f, graphicsLayer);
                return;
            }
            placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, j), f, graphicsLayer);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, GraphicsLayer graphicsLayer, float f) {
            long jM3795constructorimpl = IntOffset.m3795constructorimpl((((long) i2) & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() != LayoutDirection.Ltr && getParentWidth() != 0) {
                int parentWidth = getParentWidth();
                int width = placeable.getWidth();
                placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(jM3795constructorimpl)) & 4294967295L) | (((long) ((parentWidth - width) - IntOffset.m3801getXimpl(jM3795constructorimpl))) << 32))), f, graphicsLayer);
                return;
            }
            placeable.mo2277placeAtf8xVGno(d$$ExternalSyntheticOutline0.m(this, placeable, placeable, jM3795constructorimpl), f, graphicsLayer);
        }
    }

    private final void onMeasuredSizeChanged() {
        this.width = RangesKt.RemoteActionCompatParcelizer((int) (this.measuredSize >> 32), Constraints.m3628getMinWidthimpl(this.measurementConstraints), Constraints.m3626getMaxWidthimpl(this.measurementConstraints));
        int iRemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer((int) (this.measuredSize & 4294967295L), Constraints.m3627getMinHeightimpl(this.measurementConstraints), Constraints.m3625getMaxHeightimpl(this.measurementConstraints));
        this.height = iRemoteActionCompatParcelizer;
        int i = this.width;
        long j = this.measuredSize;
        long j2 = ((long) ((iRemoteActionCompatParcelizer - ((int) (j & 4294967295L))) / 2)) & 4294967295L;
        this.apparentToRealOffset = IntOffset.m3795constructorimpl(j2 | (((long) ((i - ((int) (j >> 32))) / 2)) << 32));
    }
}

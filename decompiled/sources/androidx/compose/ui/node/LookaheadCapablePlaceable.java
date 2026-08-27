package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.layout.VerticalRuler;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.getCieXyz;
import o.onRemeasuredozmzZPI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingRuler = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        public final void invoke(PlaceableResult placeableResult) {
            if (placeableResult.isValidOwnerScope()) {
                placeableResult.getPlaceable().captureRulersIfNeeded(placeableResult);
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PlaceableResult) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private ResettableRulerScope _rulerScope;
    private PlaceableResult cachedRulerPlaceableResult;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean isPlacingForAlignment;
    private boolean isShallowPlacing;
    private final Placeable.PlacementScope placementScope = PlaceableKt.PlacementScope(this);
    private onRemeasuredozmzZPI rulerReaders;
    private RulerTrackingMap rulerValues;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rulersLambda;

    public final class ResettableRulerScope implements RulerScope {
        private boolean coordinatesAccessed;
        private long positionOnScreen = IntOffset.Companion.m3811getMaxnOccac();
        private long size = IntSize.Companion.m3849getZeroYbymL2g();

        @Override // androidx.compose.ui.layout.RulerScope
        public LayoutCoordinates getCoordinates() {
            this.coordinatesAccessed = true;
            LayoutCoordinates coordinates = LookaheadCapablePlaceable.this.getCoordinates();
            if (IntOffset.m3800equalsimpl0(this.positionOnScreen, IntOffset.Companion.m3811getMaxnOccac())) {
                this.positionOnScreen = IntOffsetKt.m3818roundk4lQ0M(LayoutCoordinatesKt.positionOnScreen(coordinates));
                this.size = coordinates.mo2217getSizeYbymL2g();
            }
            LookaheadCapablePlaceable.this.getLayoutNode().getLayoutDelegate$ui().onCoordinatesUsed();
            return coordinates;
        }

        public final boolean getCoordinatesAccessed() {
            return this.coordinatesAccessed;
        }

        /* JADX INFO: renamed from: getPositionOnScreen-nOcc-ac, reason: not valid java name */
        public final long m2468getPositionOnScreennOccac() {
            return this.positionOnScreen;
        }

        /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
        public final long m2469getSizeYbymL2g() {
            return this.size;
        }

        public final void setCoordinatesAccessed(boolean z) {
            this.coordinatesAccessed = z;
        }

        /* JADX INFO: renamed from: setPositionOnScreen--gyyYBs, reason: not valid java name */
        public final void m2470setPositionOnScreengyyYBs(long j) {
            this.positionOnScreen = j;
        }

        /* JADX INFO: renamed from: setSize-ozmzZPI, reason: not valid java name */
        public final void m2471setSizeozmzZPI(long j) {
            this.size = j;
        }

        public ResettableRulerScope() {
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return LookaheadCapablePlaceable.this.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return LookaheadCapablePlaceable.this.getFontScale();
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public void provides(Ruler ruler, float f) {
            LookaheadCapablePlaceable.this.provideRulerValue(ruler, f);
        }

        @Override // androidx.compose.ui.layout.RulerScope
        public void providesRelative(VerticalRuler verticalRuler, float f) {
            LookaheadCapablePlaceable.this.provideRelativeRulerValue(verticalRuler, f);
        }
    }

    public abstract int calculateAlignmentLine(AlignmentLine alignmentLine);

    public abstract AlignmentLinesOwner getAlignmentLinesOwner();

    public abstract LookaheadCapablePlaceable getChild();

    public abstract LayoutCoordinates getCoordinates();

    public abstract boolean getHasMeasureResult();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode getLayoutNode();

    public abstract MeasureResult getMeasureResult$ui();

    public abstract LookaheadCapablePlaceable getParent();

    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public abstract long mo2467getPositionnOccac();

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return false;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public boolean isPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final boolean isPlacingForAlignment$ui() {
        return this.isPlacingForAlignment;
    }

    public final boolean isShallowPlacing$ui() {
        return this.isShallowPlacing;
    }

    public abstract void replace$ui();

    public void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    public final void setPlacingForAlignment$ui(boolean z) {
        this.isPlacingForAlignment = z;
    }

    public final void setShallowPlacing$ui(boolean z) {
        this.isShallowPlacing = z;
    }

    /* JADX INFO: renamed from: captureRulers-OSxE8f4, reason: not valid java name */
    private final void m2465captureRulersOSxE8f4(final PlaceableResult placeableResult, final long j, final long j2) {
        OwnerSnapshotObserver snapshotObserver;
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.rulerReaders;
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        RulerTrackingMap rulerTrackingMap2 = rulerTrackingMap;
        Owner owner$ui = getLayoutNode().getOwner$ui();
        if (owner$ui != null && (snapshotObserver = owner$ui.getSnapshotObserver()) != null) {
            snapshotObserver.observer.serializer(placeableResult, onCommitAffectingRuler, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2472invoke() {
                    this.this$0.getRulerScope().setCoordinatesAccessed(false);
                    this.this$0.getRulerScope().m2470setPositionOnScreengyyYBs(j);
                    this.this$0.getRulerScope().m2471setSizeozmzZPI(j2);
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rulers = placeableResult.getResult().getRulers();
                    if (rulers != null) {
                        rulers.invoke(this.this$0.getRulerScope());
                    }
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2472invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        }
        rulerTrackingMap2.notifyChanged(isLookingAhead(), this, onremeasuredozmzzpi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void notifyRulerValueChange(relocationOffsetfbGrOKE relocationoffsetfbgroke) {
        LayoutNode layoutNode;
        Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
        long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i << 3) + i3]).get()) != null) {
                        if (isLookingAhead()) {
                            layoutNode.requestLookaheadRelayout$ui(false);
                        } else {
                            layoutNode.requestRelayout$ui(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addRulerReader(LayoutNode layoutNode, Ruler ruler) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        int i;
        int i2;
        long[] jArr3;
        Object[] objArr3;
        long[] jArr4;
        Object[] objArr4;
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.rulerReaders;
        int i3 = 8;
        char c = 7;
        long j = -9187201950435737472L;
        if (onremeasuredozmzzpi != null) {
            Object[] objArr5 = onremeasuredozmzzpi.MediaMetadataCompat;
            long[] jArr5 = onremeasuredozmzzpi.write;
            int length = jArr5.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr5[i4];
                    if ((((~j2) << c) & j2 & j) != j) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                relocationOffsetfbGrOKE relocationoffsetfbgroke = (relocationOffsetfbGrOKE) objArr5[(i4 << 3) + i6];
                                Object[] objArr6 = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
                                long[] jArr6 = relocationoffsetfbgroke.IconCompatParcelizer;
                                int length2 = jArr6.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr5;
                                    int i7 = 0;
                                    while (true) {
                                        long j3 = jArr6[i7];
                                        objArr2 = objArr5;
                                        i = length;
                                        if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j3 & 255) < 128) {
                                                    int i10 = (i7 << 3) + i9;
                                                    LayoutNode layoutNode2 = (LayoutNode) ((WeakReference) objArr6[i10]).get();
                                                    jArr4 = jArr6;
                                                    if (layoutNode2 != null) {
                                                        boolean zIsAttached = layoutNode2.isAttached();
                                                        objArr4 = objArr6;
                                                        if (zIsAttached) {
                                                        }
                                                    } else {
                                                        objArr4 = objArr6;
                                                    }
                                                    relocationoffsetfbgroke.RemoteActionCompatParcelizer(i10);
                                                } else {
                                                    jArr4 = jArr6;
                                                    objArr4 = objArr6;
                                                }
                                                j3 >>= 8;
                                                i9++;
                                                objArr6 = objArr4;
                                                jArr6 = jArr4;
                                            }
                                            jArr3 = jArr6;
                                            objArr3 = objArr6;
                                            if (i8 != 8) {
                                                break;
                                            }
                                        } else {
                                            jArr3 = jArr6;
                                            objArr3 = objArr6;
                                        }
                                        if (i7 == length2) {
                                            break;
                                        }
                                        i7++;
                                        objArr5 = objArr2;
                                        length = i;
                                        objArr6 = objArr3;
                                        jArr6 = jArr3;
                                        c = 7;
                                    }
                                } else {
                                    jArr2 = jArr5;
                                    objArr2 = objArr5;
                                    i = length;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr5;
                                objArr2 = objArr5;
                                i = length;
                                i2 = i3;
                            }
                            j2 >>= i2;
                            i6++;
                            i3 = i2;
                            jArr5 = jArr2;
                            objArr5 = objArr2;
                            length = i;
                            c = 7;
                        }
                        jArr = jArr5;
                        objArr = objArr5;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr = jArr5;
                        objArr = objArr5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr5 = jArr;
                    objArr5 = objArr;
                    i3 = 8;
                    c = 7;
                    j = -9187201950435737472L;
                }
            }
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi2 = this.rulerReaders;
        if (onremeasuredozmzzpi2 != null) {
            long[] jArr7 = onremeasuredozmzzpi2.write;
            int length3 = jArr7.length - 2;
            if (length3 >= 0) {
                int i12 = 0;
                while (true) {
                    long j4 = jArr7[i12];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j4 & 255) < 128) {
                                int i15 = (i12 << 3) + i14;
                                if (((relocationOffsetfbGrOKE) onremeasuredozmzzpi2.MediaMetadataCompat[i15]).write()) {
                                    onremeasuredozmzzpi2.write(i15);
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                    }
                    if (i12 == length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi3 = this.rulerReaders;
        if (onremeasuredozmzzpi3 == null) {
            onremeasuredozmzzpi3 = new onRemeasuredozmzZPI();
            this.rulerReaders = onremeasuredozmzzpi3;
        }
        Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi3.MediaBrowserCompatMediaItem(ruler);
        if (objMediaBrowserCompatMediaItem == null) {
            objMediaBrowserCompatMediaItem = new relocationOffsetfbGrOKE();
            onremeasuredozmzzpi3.write(ruler, objMediaBrowserCompatMediaItem);
        }
        ((relocationOffsetfbGrOKE) objMediaBrowserCompatMediaItem).RemoteActionCompatParcelizer(new WeakReference(layoutNode));
    }

    private final LookaheadCapablePlaceable findAncestorRulerDefiner(Ruler ruler) {
        LookaheadCapablePlaceable parent;
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable.rulerValues;
            if ((rulerTrackingMap != null && rulerTrackingMap.contains(ruler)) || (parent = lookaheadCapablePlaceable.getParent()) == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    private final boolean isLayoutNodeAncestor(LayoutNode layoutNode, LayoutNode layoutNode2) {
        if (layoutNode == layoutNode2) {
            return true;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        if (parent$ui != null) {
            return isLayoutNodeAncestor(parent$ui, layoutNode2);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[LOOP:0: B:13:0x002a->B:23:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0062 A[EDGE_INSN: B:74:0x0062->B:24:0x0062 BREAK  A[LOOP:0: B:13:0x002a->B:23:0x005d], SYNTHETIC] */
    public final void captureRulersIfNeeded$ui(MeasureResult measureResult) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.rulerReaders;
        long j = 255;
        if (measureResult != null) {
            if (this.isPlacingForAlignment) {
                return;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rulers = measureResult.getRulers();
            if (rulers != null) {
                boolean z = this.rulersLambda != rulers;
                long jM3811getMaxnOccac = IntOffset.Companion.m3811getMaxnOccac();
                long jM3849getZeroYbymL2g = IntSize.Companion.m3849getZeroYbymL2g();
                if (!z && getRulerScope().getCoordinatesAccessed()) {
                    LayoutCoordinates coordinates = getCoordinates();
                    jM3811getMaxnOccac = IntOffsetKt.m3818roundk4lQ0M(LayoutCoordinatesKt.positionOnScreen(coordinates));
                    jM3849getZeroYbymL2g = coordinates.mo2217getSizeYbymL2g();
                    z = (IntOffset.m3800equalsimpl0(jM3811getMaxnOccac, getRulerScope().m2468getPositionOnScreennOccac()) && IntSize.m3842equalsimpl0(jM3849getZeroYbymL2g, getRulerScope().m2469getSizeYbymL2g())) ? false : true;
                }
                if (z) {
                    PlaceableResult placeableResult = this.cachedRulerPlaceableResult;
                    if (placeableResult != null) {
                        placeableResult.setResult(measureResult);
                    } else {
                        placeableResult = new PlaceableResult(measureResult, this);
                        this.cachedRulerPlaceableResult = placeableResult;
                    }
                    m2465captureRulersOSxE8f4(placeableResult, jM3811getMaxnOccac, jM3849getZeroYbymL2g);
                    this.rulersLambda = measureResult.getRulers();
                    return;
                }
                return;
            }
            if (onremeasuredozmzzpi != null) {
                Object[] objArr = onremeasuredozmzzpi.MediaMetadataCompat;
                long[] jArr = onremeasuredozmzzpi.write;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j2 = jArr[i];
                        long[] jArr2 = jArr;
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((j2 & 255) < 128) {
                                    notifyRulerValueChange((relocationOffsetfbGrOKE) objArr[(i << 3) + i3]);
                                }
                                j2 >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                            jArr = jArr2;
                        } else if (i != length) {
                            break;
                            break;
                        } else {
                            i++;
                            jArr = jArr2;
                        }
                    }
                }
                onremeasuredozmzzpi.IconCompatParcelizer();
                return;
            }
            return;
        }
        if (onremeasuredozmzzpi != null) {
            Object[] objArr2 = onremeasuredozmzzpi.MediaMetadataCompat;
            long[] jArr3 = onremeasuredozmzzpi.write;
            int length2 = jArr3.length - 2;
            if (length2 >= 0) {
                int i4 = 0;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length2)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j3 & j) < 128) {
                                notifyRulerValueChange((relocationOffsetfbGrOKE) objArr2[(i4 << 3) + i6]);
                            }
                            j3 >>= 8;
                            i6++;
                            j = 255;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i4 == length2) {
                        break;
                    }
                    i4++;
                    j = 255;
                }
            }
        }
        if (onremeasuredozmzzpi != null) {
            onremeasuredozmzzpi.IconCompatParcelizer();
        }
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap != null) {
            rulerTrackingMap.clear();
        }
    }

    public final void invalidateChildrenOfDefiningRuler$ui(Ruler ruler) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = findAncestorRulerDefiner(ruler).rulerReaders;
        relocationOffsetfbGrOKE relocationoffsetfbgroke = onremeasuredozmzzpi != null ? (relocationOffsetfbGrOKE) onremeasuredozmzzpi.IconCompatParcelizer(ruler) : null;
        if (relocationoffsetfbgroke != null) {
            notifyRulerValueChange(relocationoffsetfbgroke);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[LOOP:0: B:11:0x001e->B:21:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058 A[EDGE_INSN: B:27:0x0058->B:22:0x0058 BREAK  A[LOOP:0: B:11:0x001e->B:21:0x0055], SYNTHETIC] */
    public final void captureRulersIfNeeded(PlaceableResult placeableResult) {
        if (this.isPlacingForAlignment) {
            return;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rulers = placeableResult.getResult().getRulers();
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.rulerReaders;
        if (rulers != null) {
            m2466captureRulersOSxE8f4$default(this, placeableResult, 0L, 0L, 6, null);
            this.rulersLambda = rulers;
            return;
        }
        if (onremeasuredozmzzpi != null) {
            Object[] objArr = onremeasuredozmzzpi.MediaMetadataCompat;
            long[] jArr = onremeasuredozmzzpi.write;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                notifyRulerValueChange((relocationOffsetfbGrOKE) objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            onremeasuredozmzzpi.IconCompatParcelizer();
        }
    }

    /* JADX INFO: renamed from: captureRulers-OSxE8f4$default, reason: not valid java name */
    public static /* synthetic */ void m2466captureRulersOSxE8f4$default(LookaheadCapablePlaceable lookaheadCapablePlaceable, PlaceableResult placeableResult, long j, long j2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = IntOffset.Companion.m3811getMaxnOccac();
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = IntSize.Companion.m3849getZeroYbymL2g();
            }
            lookaheadCapablePlaceable.m2465captureRulersOSxE8f4(placeableResult, j3, j2);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: captureRulers-OSxE8f4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ResettableRulerScope getRulerScope() {
        ResettableRulerScope resettableRulerScope = this._rulerScope;
        if (resettableRulerScope != null) {
            return resettableRulerScope;
        }
        ResettableRulerScope resettableRulerScope2 = new ResettableRulerScope();
        this._rulerScope = resettableRulerScope2;
        return resettableRulerScope2;
    }

    public final float findRulerValue(Ruler ruler, float f) {
        if (this.isPlacingForAlignment) {
            return f;
        }
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            RulerTrackingMap rulerTrackingMap = lookaheadCapablePlaceable.rulerValues;
            float orDefault = rulerTrackingMap != null ? rulerTrackingMap.getOrDefault(ruler, Float.NaN) : Float.NaN;
            if (!Float.isNaN(orDefault)) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return ruler.calculateCoordinate$ui(orDefault, lookaheadCapablePlaceable.getCoordinates(), getCoordinates());
            }
            LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
            if (parent == null) {
                lookaheadCapablePlaceable.addRulerReader(getLayoutNode(), ruler);
                return f;
            }
            lookaheadCapablePlaceable = parent;
        }
    }

    public final void invalidateAlignmentLinesFromPositionChange(NodeCoordinator nodeCoordinator) {
        AlignmentLines alignmentLines;
        NodeCoordinator wrapped$ui = nodeCoordinator.getWrapped$ui();
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{wrapped$ui != null ? wrapped$ui.getLayoutNode() : null, nodeCoordinator.getLayoutNode()}, getCieXyz.write())).booleanValue()) {
            nodeCoordinator.getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            return;
        }
        AlignmentLinesOwner parentAlignmentLinesOwner = nodeCoordinator.getAlignmentLinesOwner().getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null || (alignmentLines = parentAlignmentLinesOwner.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.onAlignmentsChanged();
    }

    public final void provideRelativeRulerValue(Ruler ruler, float f) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        if (getLayoutDirection() != LayoutDirection.Ltr) {
            f = getWidth() - f;
        }
        rulerTrackingMap.set(ruler, f);
    }

    public final void provideRulerValue(Ruler ruler, float f) {
        RulerTrackingMap rulerTrackingMap = this.rulerValues;
        if (rulerTrackingMap == null) {
            rulerTrackingMap = new RulerTrackingMap();
            this.rulerValues = rulerTrackingMap;
        }
        rulerTrackingMap.set(ruler, f);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void updatePlacedUnderMotionFrameOfReference(boolean z) {
        LookaheadCapablePlaceable parent = getParent();
        LayoutNode layoutNode = parent != null ? parent.getLayoutNode() : null;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutNode, getLayoutNode()}, getCieXyz.write())).booleanValue()) {
            setPlacedUnderMotionFrameOfReference(z);
            return;
        }
        if ((layoutNode != null ? layoutNode.getLayoutState$ui() : null) != LayoutNode.LayoutState.LayingOut) {
            if ((layoutNode != null ? layoutNode.getLayoutState$ui() : null) != LayoutNode.LayoutState.LookaheadLayingOut) {
                return;
            }
        }
        setPlacedUnderMotionFrameOfReference(z);
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(AlignmentLine alignmentLine) {
        int iCalculateAlignmentLine;
        if (getHasMeasureResult() && (iCalculateAlignmentLine = calculateAlignmentLine(alignmentLine)) != Integer.MIN_VALUE) {
            return iCalculateAlignmentLine + (alignmentLine instanceof VerticalAlignmentLine ? IntOffset.m3801getXimpl(m2274getApparentToRealOffsetnOccac()) : IntOffset.m3802getYimpl(m2274getApparentToRealOffsetnOccac()));
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable.layout.1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return map;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return i2;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
                return r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return i;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(this.getPlacementScope());
            }
        };
    }
}

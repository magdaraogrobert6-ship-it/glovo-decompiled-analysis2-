package androidx.compose.ui.node;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.FrameRateCategory;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.MutableRectKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AnchoredDraggableState;
import o.ContentInViewNodeKt;
import o.DrawableTransformation;
import o.ItemTouchHelperAdapter;
import o.awaitHorizontalPointerSlopOrCancellationgDDlDlE;
import o.awaitLongPressOrCancellationrnUCldI;
import o.createFromParcel;
import o.getBrush;
import o.getCieXyz;
import o.isAppSetIdReadingEnabled;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements Measurable, LayoutCoordinates, OwnerScope {
    public static final int $stable = 0;
    public static final String ExpectAttachedLayoutCoordinates = "LayoutCoordinate operations are only valid when isAttached is true";
    public static final String UnmeasuredError = "Asking for measurement result of unmeasured layout modifier";
    private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 _drawBlock;
    private MeasureResult _measureResult;
    private MutableRect _rectCache;
    private Canvas drawBlockCanvas;
    private GraphicsLayer drawBlockParentLayer;
    private GraphicsLayer explicitLayer;
    private boolean forceMeasureWithLookaheadConstraints;
    private boolean forcePlaceWithLookaheadOffset;
    private boolean isClipping;
    private boolean lastClip;
    private boolean lastLayerDrawingWasSkipped;
    private OwnedLayer layer;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM layerBlock;
    private LayerPositionalProperties layerPositionalProperties;
    private final LayoutNode layoutNode;
    private AnchoredDraggableState oldAlignmentLines;
    private boolean released;
    private boolean wasLayerBlockInvoked;
    private NodeCoordinator wrapped;
    private NodeCoordinator wrappedBy;
    private float zIndex;
    public static final Companion Companion = new Companion(null);
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingLayerParams = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        public final void invoke(NodeCoordinator nodeCoordinator) throws Throwable {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            try {
                if (nodeCoordinator.isValidOwnerScope()) {
                    NodeCoordinator.updateLayerParameters$default(nodeCoordinator, false, 1, null);
                }
            } catch (Throwable th) {
                layoutNode.rethrowWithComposeStackTrace(th);
                DrawableTransformation.read();
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
            invoke((NodeCoordinator) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onCommitAffectingLayer = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        public final void invoke(NodeCoordinator nodeCoordinator) {
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((NodeCoordinator) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private static final ReusableGraphicsLayerScope graphicsLayerScope = new ReusableGraphicsLayerScope();
    private static final LayerPositionalProperties tmpLayerPositionalProperties = new LayerPositionalProperties();
    private static final float[] tmpMatrix = Matrix.m969constructorimpl$default(null, 1, null);
    private static final HitTestSource PointerInputSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$PointerInputSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-qzLsGqo, reason: not valid java name */
        public void mo2541childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
            layoutNode.m2447hitTest6fMxITs$ui(j, hitTestResult, i, z);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo2542entityTypeOLwlOKw() {
            return NodeKind.m2551constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3, types: [o.onCreateVirtualViewTranslationRequests] */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [o.onCreateVirtualViewTranslationRequests] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$Node] */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
            ?? oncreatevirtualviewtranslationrequests = 0;
            while (true) {
                int i = 0;
                if (node == 0) {
                    return false;
                }
                if (node instanceof PointerInputModifierNode) {
                    if (((PointerInputModifierNode) node).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
                    while (delegate$ui != null) {
                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                node = node;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                node = delegate$ui;
                            } else {
                                if (oncreatevirtualviewtranslationrequests == 0) {
                                    oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                }
                                if (node != 0) {
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                    node = 0;
                                }
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                            }
                        } else {
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            node = node;
                        }
                        delegate$ui = delegate$ui.getChild$ui();
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        node = node;
                    }
                    if (i == 1) {
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        node = node;
                    } else {
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        node = node;
                    }
                }
                node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
            }
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
            if (!layoutNode.getOuterCoordinator$ui().shouldSharePointerInputWithSiblings()) {
                return false;
            }
            hitTestResult.acceptHits();
            return true;
        }
    };
    private static final HitTestSource SemanticsSource = new HitTestSource() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$SemanticsSource$1
        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: childHitTest-qzLsGqo */
        public void mo2541childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z) {
            layoutNode.m2448hitTestSemantics6fMxITs$ui(j, hitTestResult, i, z);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean interceptOutOfBoundsChildEvents(Modifier.Node node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo2542entityTypeOLwlOKw() {
            return NodeKind.m2551constructorimpl(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTest(Modifier.Node node) {
            if (ComposeUiFlags.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                return SemanticsOwnerKt.isImportantForAccessibility(SemanticsNodeKt.SemanticsNode(DelegatableNodeKt.requireLayoutNode(node), false));
            }
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.HitTestSource
        public boolean shouldHitTestChildren(LayoutNode layoutNode) {
            SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
            return !(semanticsConfiguration != null && semanticsConfiguration.isClearingSemantics());
        }
    };
    private Density layerDensity = getLayoutNode().getDensity();
    private LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();
    private float lastLayerAlpha = 0.8f;
    private long position = IntOffset.Companion.m3812getZeronOccac();
    private Shape lastShape = RectangleShapeKt.getRectangleShape();
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 invalidateParentLayer = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2544invoke() {
            NodeCoordinator wrappedBy$ui = this.this$0.getWrappedBy$ui();
            if (wrappedBy$ui != null) {
                wrappedBy$ui.invalidateLayer();
            }
        }

        {
            super(0);
        }

        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public /* bridge */ /* synthetic */ Object invoke() {
            m2544invoke();
            return createFromParcel.INSTANCE;
        }
    };

    public interface HitTestSource {
        /* JADX INFO: renamed from: childHitTest-qzLsGqo */
        void mo2541childHitTestqzLsGqo(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo2542entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(Modifier.Node node);

        boolean shareWithSiblings(HitTestResult hitTestResult, LayoutNode layoutNode);

        default boolean shouldHitTest(Modifier.Node node) {
            return true;
        }

        boolean shouldHitTestChildren(LayoutNode layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(Canvas canvas, GraphicsLayer graphicsLayer) {
        Modifier.Node nodeM2532headH91voCI = m2532headH91voCI(NodeKind.m2551constructorimpl(4));
        if (nodeM2532headH91voCI == null) {
            performDraw(canvas, graphicsLayer);
        } else {
            getLayoutNode().getMDrawScope$ui().m2460draweZhPAX0$ui(canvas, IntSizeKt.m3856toSizeozmzZPI(mo2217getSizeYbymL2g()), this, nodeM2532headH91voCI, graphicsLayer);
        }
    }

    public abstract void ensureLookaheadDelegateCreated();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getChild() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LayoutCoordinates getCoordinates() {
        return this;
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui() {
        return this.forcePlaceWithLookaheadOffset;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean getHasMeasureResult() {
        return this._measureResult != null;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    public final boolean getLastClip$ui() {
        return this.lastClip;
    }

    public final boolean getLastLayerDrawingWasSkipped$ui() {
        return this.lastLayerDrawingWasSkipped;
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui, reason: not valid java name */
    public final long m2530getLastMeasurementConstraintsmsEJaDk$ui() {
        return m2276getMeasurementConstraintsmsEJaDk();
    }

    public final Shape getLastShape$ui() {
        return this.lastShape;
    }

    public final OwnedLayer getLayer() {
        return this.layer;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getLayerBlock() {
        return this.layerBlock;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public abstract LookaheadDelegate getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable getParent() {
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public long mo2467getPositionnOccac() {
        return this.position;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public final long mo2217getSizeYbymL2g() {
        return m2275getMeasuredSizeYbymL2g();
    }

    public abstract Modifier.Node getTail();

    public final boolean getWasLayerBlockInvoked$ui() {
        return this.wasLayerBlockInvoked;
    }

    public final NodeCoordinator getWrapped$ui() {
        return this.wrapped;
    }

    public final NodeCoordinator getWrappedBy$ui() {
        return this.wrappedBy;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo2218localPositionOfR5De75A(LayoutCoordinates layoutCoordinates, long j) {
        return mo2219localPositionOfS_NoaFU(layoutCoordinates, j, true);
    }

    public final void onRelease() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        releaseLayer();
        if (IntOffset.m3800equalsimpl0(mo2467getPositionnOccac(), IntOffset.Companion.m3812getZeronOccac())) {
            return;
        }
        getLayoutNode().onCoordinatorRectChanged$ui(this);
    }

    public final void setForceMeasureWithLookaheadConstraints$ui(boolean z) {
        this.forceMeasureWithLookaheadConstraints = z;
    }

    public final void setForcePlaceWithLookaheadOffset$ui(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    public final void setLastClip$ui(boolean z) {
        this.lastClip = z;
    }

    public final void setLastShape$ui(Shape shape) {
        this.lastShape = shape;
    }

    public abstract void setLookaheadDelegate(LookaheadDelegate lookaheadDelegate);

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m2537setPositiongyyYBs(long j) {
        this.position = j;
    }

    public final void setWasLayerBlockInvoked$ui(boolean z) {
        this.wasLayerBlockInvoked = z;
    }

    public final void setWrapped$ui(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public final void setWrappedBy$ui(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    public final void setZIndex(float f) {
        this.zIndex = f;
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m2529fromParentPosition8S9VItk(long j, boolean z) {
        if (z || !isPlacedUnderMotionFrameOfReference()) {
            j = IntOffsetKt.m3814minusNvtHpc(j, mo2467getPositionnOccac());
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer != null ? ownedLayer.mo2611mapOffset8S9VItk(j, true) : j;
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m2531getMinimumTouchTargetSizeNHjbRc() {
        return this.layerDensity.mo49toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo2452getMinimumTouchTargetSizeMYxV2XQ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void onMeasured() {
        Modifier.Node parent$ui;
        if (m2515hasNodeH91voCI(NodeKind.m2551constructorimpl(Fields.SpotShadowColor))) {
            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
            try {
                int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.SpotShadowColor);
                boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(iM2551constructorimpl);
                if (!zM2560getIncludeSelfInTraversalH91voCI) {
                    parent$ui = getTail().getParent$ui();
                    if (parent$ui == null) {
                    }
                }
                parent$ui = getTail();
                for (Modifier.Node nodeHeadNode = headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                    if ((nodeHeadNode.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? oncreatevirtualviewtranslationrequests = 0;
                        ?? Pop = nodeHeadNode;
                        while (Pop != 0) {
                            if (Pop instanceof MeasuredSizeAwareModifierNode) {
                                ((MeasuredSizeAwareModifierNode) Pop).mo28onRemeasuredozmzZPI(m2275getMeasuredSizeYbymL2g());
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i = 0;
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == 0) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    if (nodeHeadNode == parent$ui) {
                        break;
                    }
                }
            } finally {
                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void onPlaced() {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(4194304);
        boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(iM2551constructorimpl);
        Modifier.Node tail = getTail();
        if (!zM2560getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & iM2551constructorimpl) != 0) {
                ?? Pop = nodeHeadNode;
                ?? oncreatevirtualviewtranslationrequests = 0;
                while (Pop != 0) {
                    if (Pop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) Pop).onPlaced(this);
                    } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                        int i = 0;
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    Pop = delegate$ui;
                                } else {
                                    if (oncreatevirtualviewtranslationrequests == 0) {
                                        oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                    }
                                    if (Pop != 0) {
                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                        Pop = 0;
                                    }
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                }
                            }
                            delegate$ui = delegate$ui.getChild$ui();
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        }
                        if (i == 1) {
                        }
                    }
                    Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                }
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void onUnplaced() {
        if (m2515hasNodeH91voCI(NodeKind.m2551constructorimpl(1048576))) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(1048576);
            boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(iM2551constructorimpl);
            Modifier.Node tail = getTail();
            if (!zM2560getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
                return;
            }
            for (Modifier.Node nodeHeadNode = headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                if ((nodeHeadNode.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    ?? Pop = nodeHeadNode;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof UnplacedAwareModifierNode) {
                            ((UnplacedAwareModifierNode) Pop).onUnplaced();
                        } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                            int i = 0;
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        Pop = delegate$ui;
                                    } else {
                                        if (oncreatevirtualviewtranslationrequests == 0) {
                                            oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                        }
                                        if (Pop != 0) {
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                            Pop = 0;
                                        }
                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                    }
                                }
                                delegate$ui = delegate$ui.getChild$ui();
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            }
                            if (i == 1) {
                            }
                        }
                        Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                    }
                }
                if (nodeHeadNode == tail) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final boolean shouldSharePointerInputWithSiblings() {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(NodeKind.m2551constructorimpl(16)));
        if (nodeHeadNode != null && nodeHeadNode.isAttached()) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
            if (!nodeHeadNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            Modifier.Node node = nodeHeadNode.getNode();
            if ((node.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        ?? Pop = node;
                        ?? oncreatevirtualviewtranslationrequests = 0;
                        while (Pop != 0) {
                            if (Pop instanceof PointerInputModifierNode) {
                                if (((PointerInputModifierNode) Pop).sharePointerInputWithSiblings()) {
                                    return true;
                                }
                            } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                int i = 0;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            Pop = Pop;
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                            Pop = delegate$ui;
                                        } else {
                                            if (oncreatevirtualviewtranslationrequests == 0) {
                                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                            }
                                            if (Pop != 0) {
                                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                                Pop = 0;
                                            }
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                        }
                                    } else {
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                }
                                if (i == 1) {
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                } else {
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                }
                            }
                            Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                        }
                    }
                    node = node.getChild$ui();
                }
            }
        }
        return false;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HitTestSource getPointerInputSource() {
            return NodeCoordinator.PointerInputSource;
        }

        public final HitTestSource getSemanticsSource() {
            return NodeCoordinator.SemanticsSource;
        }

        private Companion() {
        }
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    private final void ancestorToLocal(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z) {
        if (nodeCoordinator == this) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.ancestorToLocal(nodeCoordinator, mutableRect, z);
        }
        fromParentRect(mutableRect, z);
    }

    /* JADX INFO: renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m2513ancestorToLocalS_NoaFU(NodeCoordinator nodeCoordinator, long j, boolean z) {
        if (nodeCoordinator == this) {
            return j;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 != null) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{nodeCoordinator, nodeCoordinator2}, iWrite3)).booleanValue()) {
                return m2529fromParentPosition8S9VItk(nodeCoordinator2.m2513ancestorToLocalS_NoaFU(nodeCoordinator, j, z), z);
            }
        }
        return m2529fromParentPosition8S9VItk(j, z);
    }

    public final void onLayoutNodeDetach() {
        releaseLayer();
        if (getLayoutNode().isPlaced()) {
            onUnplaced();
        }
    }

    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final Placeable m2535performingMeasureK40F9xA(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        m2279setMeasurementConstraintsBRTryo0(j);
        return (Placeable) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    private final void fromParentRect(MutableRect mutableRect, boolean z) {
        float fM3801getXimpl = IntOffset.m3801getXimpl(mo2467getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() - fM3801getXimpl);
        mutableRect.setRight(mutableRect.getRight() - fM3801getXimpl);
        float fM3802getYimpl = IntOffset.m3802getYimpl(mo2467getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() - fM3802getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() - fM3802getYimpl);
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mapBounds(mutableRect, true);
            if (this.isClipping && z) {
                mutableRect.intersect(0.0f, 0.0f, (int) (mo2217getSizeYbymL2g() >> 32), (int) (mo2217getSizeYbymL2g() & 4294967295L));
                mutableRect.isEmpty();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        return LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m2515hasNodeH91voCI(int i) {
        Modifier.Node nodeHeadNode = headNode(NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(i));
        return nodeHeadNode != null && DelegatableNodeKt.m2389has64DMado(nodeHeadNode, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node headNode(boolean z) {
        Modifier.Node tail;
        if (getLayoutNode().getOuterCoordinator$ui() == this) {
            return getLayoutNode().getNodes$ui().getHead$ui();
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (!z) {
            if (nodeCoordinator != null) {
                return nodeCoordinator.getTail();
            }
            return null;
        }
        if (nodeCoordinator == null || (tail = nodeCoordinator.getTail()) == null) {
            return null;
        }
        return tail.getChild$ui();
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetOffset-C6jSQ5I, reason: not valid java name */
    public final long m2526calculateMinimumTouchTargetOffsetC6jSQ5I(MutableRect mutableRect, long j) {
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        if (mutableRect.getRight() < 0.0f || left > ((int) (mo2217getSizeYbymL2g() >> 32)) || mutableRect.getBottom() < 0.0f || top > ((int) (mo2217getSizeYbymL2g() & 4294967295L))) {
            return Offset.Companion.m493getZeroF1C5BW0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float right = (fIntBitsToFloat - (mutableRect.getRight() - mutableRect.getLeft())) / 2.0f;
        if (right > 0.0f) {
            left -= right;
        } else {
            float f = (-fIntBitsToFloat) / 2.0f;
            if (left < f) {
                left = f;
            }
        }
        float bottom = (fIntBitsToFloat2 - (mutableRect.getBottom() - mutableRect.getTop())) / 2.0f;
        if (bottom > 0.0f) {
            top -= bottom;
        } else {
            float f2 = (-fIntBitsToFloat2) / 2.0f;
            if (top < f2) {
                top = f2;
            }
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(left)) << 32) | (((long) Float.floatToRawIntBits(top)) & 4294967295L));
    }

    public final void draw(Canvas canvas, GraphicsLayer graphicsLayer) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.drawLayer(canvas, graphicsLayer);
            return;
        }
        float fM3801getXimpl = IntOffset.m3801getXimpl(mo2467getPositionnOccac());
        float fM3802getYimpl = IntOffset.m3802getYimpl(mo2467getPositionnOccac());
        canvas.translate(fM3801getXimpl, fM3802getYimpl);
        drawContainedDrawModifiers(canvas, graphicsLayer);
        canvas.translate(-fM3801getXimpl, -fM3802getYimpl);
    }

    public final NodeCoordinator findCommonAncestor$ui(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            Modifier.Node tail = nodeCoordinator.getTail();
            Modifier.Node tail2 = getTail();
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (Modifier.Node parent$ui = tail2.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
                if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0 && parent$ui == tail) {
                    return nodeCoordinator;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui() > layoutNode2.getDepth$ui()) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode.getClass();
        }
        while (layoutNode2.getDepth$ui() > layoutNode.getDepth$ui()) {
            layoutNode2 = layoutNode2.getParent$ui();
            layoutNode2.getClass();
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui();
            layoutNode2 = layoutNode2.getParent$ui();
            if (layoutNode == null || layoutNode2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != nodeCoordinator.getLayoutNode()) {
                return layoutNode.getInnerCoordinator$ui();
            }
            return nodeCoordinator;
        }
        return this;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public AlignmentLinesOwner getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui().getAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(64))) {
            return null;
        }
        getTail();
        Object objModifyParentData = null;
        for (Modifier.Node tail$ui = getLayoutNode().getNodes$ui().getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if ((NodeKind.m2551constructorimpl(64) & tail$ui.getKindSet$ui()) != 0) {
                int iM2551constructorimpl = NodeKind.m2551constructorimpl(64);
                ?? Pop = tail$ui;
                ?? oncreatevirtualviewtranslationrequests = 0;
                while (Pop != 0) {
                    if (Pop instanceof ParentDataModifierNode) {
                        objModifyParentData = ((ParentDataModifierNode) Pop).modifyParentData(getLayoutNode().getDensity(), objModifyParentData);
                    } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                        int i = 0;
                        Pop = Pop;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        while (delegate$ui != null) {
                            if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    Pop = delegate$ui;
                                } else {
                                    if (oncreatevirtualviewtranslationrequests == 0) {
                                        oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                    }
                                    if (Pop != 0) {
                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                        Pop = 0;
                                    }
                                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                }
                            }
                            delegate$ui = delegate$ui.getChild$ui();
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                        }
                        if (i == 1) {
                        }
                    }
                    Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                }
            }
        }
        return objModifyParentData;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Set<AlignmentLine> getProvidedAlignmentLines() {
        relocationOffsetfbGrOKE relocationoffsetfbgroke = null;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrapped) {
            MeasureResult measureResult = nodeCoordinator._measureResult;
            Map<AlignmentLine, Integer> alignmentLines = measureResult != null ? measureResult.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (relocationoffsetfbgroke == null) {
                    relocationOffsetfbGrOKE relocationoffsetfbgroke2 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                    relocationoffsetfbgroke = new relocationOffsetfbGrOKE();
                }
                Set<AlignmentLine> setKeySet = alignmentLines.keySet();
                setKeySet.getClass();
                Iterator<T> it = setKeySet.iterator();
                while (it.hasNext()) {
                    relocationoffsetfbgroke.RemoteActionCompatParcelizer(it.next());
                }
            }
        }
        if (relocationoffsetfbgroke != null) {
            return new awaitHorizontalPointerSlopOrCancellationgDDlDlE(relocationoffsetfbgroke);
        }
        return ItemTouchHelperAdapter.serializer;
    }

    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final Modifier.Node m2532headH91voCI(int i) {
        boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!zM2560getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return null;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & i) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & i) != 0) {
                return nodeHeadNode;
            }
            if (nodeHeadNode == tail) {
                return null;
            }
        }
        return null;
    }

    public void invalidateLayer() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.invalidateLayer();
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public boolean isAttached() {
        return getTail().isAttached();
    }

    public final boolean isTransparent() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.isTransparent();
        }
        return false;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return (this.layer == null || this.released || !getLayoutNode().isAttached()) ? false : true;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo2219localPositionOfS_NoaFU(LayoutCoordinates layoutCoordinates, long j, boolean z) {
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            LookaheadLayoutCoordinates lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
            lookaheadLayoutCoordinates.getCoordinator().onCoordinatesUsed$ui();
            return Offset.m469constructorimpl(lookaheadLayoutCoordinates.mo2219localPositionOfS_NoaFU(this, Offset.m469constructorimpl(j ^ (-9223372034707292160L)), z) ^ (-9223372034707292160L));
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui) {
            j = coordinator.m2538toParentPosition8S9VItk(j, z);
            coordinator = coordinator.wrappedBy;
            coordinator.getClass();
        }
        return m2513ancestorToLocalS_NoaFU(nodeCoordinatorFindCommonAncestor$ui, j, z);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo2222localToWindowMKHz9U(long j) {
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo2616calculatePositionInWindowMKHz9U(mo2220localToRootMKHz9U(j));
    }

    public final void onCoordinatesUsed$ui() {
        getLayoutNode().getLayoutDelegate$ui().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.invalidate();
        }
    }

    public void performDraw(Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.draw(canvas, graphicsLayer);
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2277placeAtf8xVGno(long j, float f, GraphicsLayer graphicsLayer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            m2521placeSelfMLgxB_4(j, f, null, graphicsLayer);
            return;
        }
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        lookaheadDelegate.getClass();
        m2521placeSelfMLgxB_4(lookaheadDelegate.mo2467getPositionnOccac(), f, null, graphicsLayer);
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m2536placeSelfApparentToRealOffsetMLgxB_4(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, GraphicsLayer graphicsLayer) {
        m2521placeSelfMLgxB_4(IntOffset.m3805plusqkQi6aY(j, m2274getApparentToRealOffsetnOccac()), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm, graphicsLayer);
    }

    public final void rectInParent$ui(MutableRect mutableRect, boolean z, boolean z2) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (this.isClipping) {
                if (z2) {
                    long jM2531getMinimumTouchTargetSizeNHjbRc = m2531getMinimumTouchTargetSizeNHjbRc();
                    long jM2526calculateMinimumTouchTargetOffsetC6jSQ5I = m2526calculateMinimumTouchTargetOffsetC6jSQ5I(mutableRect, jM2531getMinimumTouchTargetSizeNHjbRc);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2526calculateMinimumTouchTargetOffsetC6jSQ5I >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2526calculateMinimumTouchTargetOffsetC6jSQ5I & 4294967295L));
                    long jMo2217getSizeYbymL2g = mo2217getSizeYbymL2g();
                    float f = (int) (jMo2217getSizeYbymL2g >> 32);
                    int i = (int) (jM2531getMinimumTouchTargetSizeNHjbRc >> 32);
                    float fMin = Math.min(Float.intBitsToFloat(i) + f, Math.max(f, Float.intBitsToFloat(i) + fIntBitsToFloat));
                    float f2 = (int) (jMo2217getSizeYbymL2g & 4294967295L);
                    int i2 = (int) (jM2531getMinimumTouchTargetSizeNHjbRc & 4294967295L);
                    mutableRect.intersect(fIntBitsToFloat, fIntBitsToFloat2, fMin, Math.min(Float.intBitsToFloat(i2) + f2, Math.max(f2, Float.intBitsToFloat(i2) + fIntBitsToFloat2)));
                } else if (z) {
                    mutableRect.intersect(0.0f, 0.0f, (int) (mo2217getSizeYbymL2g() >> 32), (int) (4294967295L & mo2217getSizeYbymL2g()));
                }
                if (mutableRect.isEmpty()) {
                    return;
                }
            }
            ownedLayer.mapBounds(mutableRect, false);
        }
        float fM3801getXimpl = IntOffset.m3801getXimpl(mo2467getPositionnOccac());
        mutableRect.setLeft(mutableRect.getLeft() + fM3801getXimpl);
        mutableRect.setRight(mutableRect.getRight() + fM3801getXimpl);
        float fM3802getYimpl = IntOffset.m3802getYimpl(mo2467getPositionnOccac());
        mutableRect.setTop(mutableRect.getTop() + fM3802getYimpl);
        mutableRect.setBottom(mutableRect.getBottom() + fM3802getYimpl);
    }

    public final void releaseLayer() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void replace$ui() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            mo2277placeAtf8xVGno(mo2467getPositionnOccac(), this.zIndex, graphicsLayer);
        } else {
            mo2210placeAtf8xVGno(mo2467getPositionnOccac(), this.zIndex, this.layerBlock);
        }
    }

    public void setMeasureResult$ui(MeasureResult measureResult) {
        MeasureResult measureResult2 = this._measureResult;
        if (measureResult != measureResult2) {
            this._measureResult = measureResult;
            if (measureResult2 == null || measureResult.getWidth() != measureResult2.getWidth() || measureResult.getHeight() != measureResult2.getHeight()) {
                onMeasureResultChanged(measureResult.getWidth(), measureResult.getHeight());
            }
            AnchoredDraggableState anchoredDraggableState = this.oldAlignmentLines;
            if (((anchoredDraggableState == null || anchoredDraggableState.serializer == 0) && measureResult.getAlignmentLines().isEmpty()) || NodeCoordinatorKt.compareEquals(this.oldAlignmentLines, measureResult.getAlignmentLines())) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            AnchoredDraggableState anchoredDraggableState2 = this.oldAlignmentLines;
            if (anchoredDraggableState2 == null) {
                AnchoredDraggableState anchoredDraggableState3 = ContentInViewNodeKt.read;
                anchoredDraggableState2 = new AnchoredDraggableState();
                this.oldAlignmentLines = anchoredDraggableState2;
            }
            anchoredDraggableState2.RemoteActionCompatParcelizer();
            for (Map.Entry<AlignmentLine, Integer> entry : measureResult.getAlignmentLines().entrySet()) {
                anchoredDraggableState2.write(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo2224transformFromEL8BTi8(LayoutCoordinates layoutCoordinates, float[] fArr) {
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        Matrix.m978resetimpl(fArr);
        coordinator.m2525transformToAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui, fArr);
        m2524transformFromAncestorEL8BTi8(nodeCoordinatorFindCommonAncestor$ui, fArr);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo2225transformToScreen58bKbWc(float[] fArr) {
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        NodeCoordinator coordinator = toCoordinator(LayoutCoordinatesKt.findRootCoordinates(this));
        m2525transformToAncestorEL8BTi8(coordinator, fArr);
        if (ownerRequireOwner instanceof MatrixPositionCalculator) {
            ((MatrixPositionCalculator) ownerRequireOwner).mo1977localToScreen58bKbWc(fArr);
            return;
        }
        long jPositionOnScreen = LayoutCoordinatesKt.positionOnScreen(coordinator);
        if ((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & jPositionOnScreen) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            Matrix.m990translateimpl(fArr, Float.intBitsToFloat((int) (jPositionOnScreen >> 32)), Float.intBitsToFloat((int) (jPositionOnScreen & 4294967295L)), 0.0f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    public final void updateLayerBlock(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        boolean z2;
        Owner owner$ui;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null && this.explicitLayer != null) {
            InlineClassHelperKt.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        if (z || this.layerBlock != r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            z2 = true;
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.layerDensity, layoutNode.getDensity()}, getCieXyz.write())).booleanValue() && this.layerLayoutDirection == layoutNode.getLayoutDirection()) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.isAttached() && r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            this.layerBlock = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
            if (this.layer != null) {
                if (z2) {
                    updateLayerParameters$default(this, false, 1, null);
                    return;
                }
                return;
            }
            OwnedLayer ownedLayerCreateLayer$default = Owner.createLayer$default(LayoutNodeKt.requireOwner(layoutNode), getDrawBlock(), this.invalidateParentLayer, null, 4, null);
            ownedLayerCreateLayer$default.mo2613resizeozmzZPI(m2275getMeasuredSizeYbymL2g());
            ownedLayerCreateLayer$default.mo2612movegyyYBs(mo2467getPositionnOccac());
            this.layer = ownedLayerCreateLayer$default;
            updateLayerParameters$default(this, false, 1, null);
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            return;
        }
        this.layerBlock = null;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            if (!MatrixKt.m994isIdentity58bKbWc(ownedLayer.mo2608getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.onCoordinatorRectChanged$ui(this);
            }
            ownedLayer.destroy();
            this.layer = null;
            layoutNode.setInnerLayerCoordinatorIsDirty$ui(true);
            this.invalidateParentLayer.invoke();
            if (isAttached() && layoutNode.isPlaced() && (owner$ui = layoutNode.getOwner$ui()) != null) {
                owner$ui.onLayoutChange(layoutNode);
            }
        }
        this.lastLayerDrawingWasSkipped = false;
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final <T> void m2539visitNodesaLcG6gQ(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(i);
        Modifier.Node tail = getTail();
        if (!zM2560getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & i) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & i) != 0) {
                removeNodeAtDepth.IconCompatParcelizer();
                throw null;
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    public final void withPositionTranslation(Canvas canvas, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        float fM3801getXimpl = IntOffset.m3801getXimpl(mo2467getPositionnOccac());
        float fM3802getYimpl = IntOffset.m3802getYimpl(mo2467getPositionnOccac());
        canvas.translate(fM3801getXimpl, fM3802getYimpl);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(canvas);
        canvas.translate(-fM3801getXimpl, -fM3802getYimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX INFO: renamed from: isInExpandedTouchBounds-ThD-n1k, reason: not valid java name */
    private final boolean m2518isInExpandedTouchBoundsThDn1k(Modifier.Node node, long j, int i) {
        if (node != 0) {
            PointerType.Companion companion = PointerType.Companion;
            if (PointerType.m2146equalsimpl0(i, companion.m2152getStylusT8wyACA()) || PointerType.m2146equalsimpl0(i, companion.m2150getEraserT8wyACA())) {
                int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
                ?? oncreatevirtualviewtranslationrequests = 0;
                while (node != 0) {
                    if (node instanceof PointerInputModifierNode) {
                        long jMo1974getTouchBoundsExpansionRZrCHBk = ((PointerInputModifierNode) node).mo1974getTouchBoundsExpansionRZrCHBk();
                        int i2 = (int) (j >> 32);
                        if (Float.intBitsToFloat(i2) < (-TouchBoundsExpansion.m2637computeLeftimpl$ui(jMo1974getTouchBoundsExpansionRZrCHBk, getLayoutDirection()))) {
                            break;
                        }
                        if (Float.intBitsToFloat(i2) >= TouchBoundsExpansion.m2638computeRightimpl$ui(jMo1974getTouchBoundsExpansionRZrCHBk, getLayoutDirection()) + getMeasuredWidth()) {
                            break;
                        }
                        int i3 = (int) (j & 4294967295L);
                        if (Float.intBitsToFloat(i3) < (-TouchBoundsExpansion.m2645getTopimpl(jMo1974getTouchBoundsExpansionRZrCHBk))) {
                            break;
                        }
                        if (Float.intBitsToFloat(i3) < TouchBoundsExpansion.m2642getBottomimpl(jMo1974getTouchBoundsExpansionRZrCHBk) + getMeasuredHeight()) {
                            return true;
                        }
                    } else {
                        if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
                            int i4 = 0;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        node = node;
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        node = delegate$ui;
                                    } else {
                                        if (oncreatevirtualviewtranslationrequests == 0) {
                                            oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                        }
                                        if (node != 0) {
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                            node = 0;
                                        }
                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                    }
                                } else {
                                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                    node = node;
                                }
                                delegate$ui = delegate$ui.getChild$ui();
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                node = node;
                            }
                            if (i4 == 1) {
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                node = node;
                            } else {
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                node = node;
                            }
                        }
                        node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m2519offsetFromEdgeMKHz9U(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - getMeasuredWidth());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 < 0.0f ? -fIntBitsToFloat2 : fIntBitsToFloat2 - getMeasuredHeight()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32));
    }

    private final NodeCoordinator toCoordinator(LayoutCoordinates layoutCoordinates) {
        NodeCoordinator coordinator;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates != null && (coordinator = lookaheadLayoutCoordinates.getCoordinator()) != null) {
            return coordinator;
        }
        layoutCoordinates.getClass();
        return (NodeCoordinator) layoutCoordinates;
    }

    /* JADX INFO: renamed from: calculateMinimumTouchTargetPadding-E7KxVPU, reason: not valid java name */
    public final long m2527calculateMinimumTouchTargetPaddingE7KxVPU(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float measuredWidth = getMeasuredWidth();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float measuredHeight = getMeasuredHeight();
        float fMax = Math.max(0.0f, (fIntBitsToFloat - measuredWidth) / 2.0f);
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(Math.max(0.0f, (fIntBitsToFloat2 - measuredHeight) / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32));
    }

    /* JADX INFO: renamed from: hitTest-qzLsGqo, reason: not valid java name */
    public final void m2533hitTestqzLsGqo(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        Modifier.Node nodeM2532headH91voCI = m2532headH91voCI(hitTestSource.mo2542entityTypeOLwlOKw());
        if (!m2540withinLayerBoundsk4lQ0M(j)) {
            if (PointerType.m2146equalsimpl0(i, PointerType.Companion.m2153getTouchT8wyACA())) {
                float fM2528distanceInMinimumTouchTargettz77jQw = m2528distanceInMinimumTouchTargettz77jQw(j, m2531getMinimumTouchTargetSizeNHjbRc());
                if ((Float.floatToRawIntBits(fM2528distanceInMinimumTouchTargettz77jQw) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.isHitInMinimumTouchTargetBetter(fM2528distanceInMinimumTouchTargettz77jQw, false)) {
                    return;
                }
                m2517hitNearFh5PU_I(nodeM2532headH91voCI, hitTestSource, j, hitTestResult, i, false, fM2528distanceInMinimumTouchTargettz77jQw);
                return;
            }
            return;
        }
        if (nodeM2532headH91voCI == null) {
            mo2437hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
        } else if (m2534isPointerInBoundsk4lQ0M(j)) {
            m2516hit5ShdDok(nodeM2532headH91voCI, hitTestSource, j, hitTestResult, i, z);
        } else {
            float fM2528distanceInMinimumTouchTargettz77jQw2 = !PointerType.m2146equalsimpl0(i, PointerType.Companion.m2153getTouchT8wyACA()) ? Float.POSITIVE_INFINITY : m2528distanceInMinimumTouchTargettz77jQw(j, m2531getMinimumTouchTargetSizeNHjbRc());
            m2520outOfBoundsHit8NAm7pk(nodeM2532headH91voCI, hitTestSource, j, hitTestResult, i, z, fM2528distanceInMinimumTouchTargettz77jQw2, (Float.floatToRawIntBits(fM2528distanceInMinimumTouchTargettz77jQw2) & Integer.MAX_VALUE) < 2139095040 && hitTestResult.isHitInMinimumTouchTargetBetter(fM2528distanceInMinimumTouchTargettz77jQw2, z));
        }
    }

    /* JADX INFO: renamed from: isPointerInBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2534isPointerInBoundsk4lQ0M(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) getMeasuredWidth()) && fIntBitsToFloat2 < ((float) getMeasuredHeight());
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m2538toParentPosition8S9VItk(long j, boolean z) {
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            j = ownedLayer.mo2611mapOffset8S9VItk(j, false);
        }
        return (z || !isPlacedUnderMotionFrameOfReference()) ? IntOffsetKt.m3816plusNvtHpc(j, mo2467getPositionnOccac()) : j;
    }

    private final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getDrawBlock() {
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this._drawBlock;
        if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null) {
            return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$drawBlockCallToDrawModifiers$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2543invoke() {
                NodeCoordinator nodeCoordinator = this.this$0;
                Canvas canvas = nodeCoordinator.drawBlockCanvas;
                canvas.getClass();
                nodeCoordinator.drawContainedDrawModifiers(canvas, this.this$0.drawBlockParentLayer);
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2543invoke();
                return createFromParcel.INSTANCE;
            }
        };
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
                boolean zIsPlaced = this.this$0.getLayoutNode().isPlaced();
                NodeCoordinator nodeCoordinator = this.this$0;
                if (!zIsPlaced) {
                    nodeCoordinator.lastLayerDrawingWasSkipped = true;
                    return;
                }
                nodeCoordinator.drawBlockCanvas = canvas;
                this.this$0.drawBlockParentLayer = graphicsLayer;
                OwnerSnapshotObserver snapshotObserver = this.this$0.getSnapshotObserver();
                snapshotObserver.observer.serializer(this.this$0, NodeCoordinator.onCommitAffectingLayer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                this.this$0.lastLayerDrawingWasSkipped = false;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Canvas) obj, (GraphicsLayer) obj2);
                return createFromParcel.INSTANCE;
            }
        };
        this._drawBlock = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m2524transformFromAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{nodeCoordinator, this}, getCieXyz.write())).booleanValue()) {
            return;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        nodeCoordinator2.getClass();
        nodeCoordinator2.m2524transformFromAncestorEL8BTi8(nodeCoordinator, fArr);
        if (!IntOffset.m3800equalsimpl0(mo2467getPositionnOccac(), IntOffset.Companion.m3812getZeronOccac())) {
            float[] fArr2 = tmpMatrix;
            Matrix.m978resetimpl(fArr2);
            Matrix.m991translateimpl$default(fArr2, -IntOffset.m3801getXimpl(mo2467getPositionnOccac()), -IntOffset.m3802getYimpl(mo2467getPositionnOccac()), 0.0f, 4, null);
            Matrix.m988timesAssign58bKbWc(fArr, fArr2);
        }
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo2609inverseTransform58bKbWc(fArr);
        }
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m2525transformToAncestorEL8BTi8(NodeCoordinator nodeCoordinator, float[] fArr) {
        NodeCoordinator nodeCoordinator2 = this;
        while (!nodeCoordinator2.equals(nodeCoordinator)) {
            OwnedLayer ownedLayer = nodeCoordinator2.layer;
            if (ownedLayer != null) {
                ownedLayer.mo2614transform58bKbWc(fArr);
            }
            long jMo2467getPositionnOccac = nodeCoordinator2.mo2467getPositionnOccac();
            if (!IntOffset.m3800equalsimpl0(jMo2467getPositionnOccac, IntOffset.Companion.m3812getZeronOccac())) {
                float[] fArr2 = tmpMatrix;
                Matrix.m978resetimpl(fArr2);
                Matrix.m991translateimpl$default(fArr2, IntOffset.m3801getXimpl(jMo2467getPositionnOccac), IntOffset.m3802getYimpl(jMo2467getPositionnOccac), 0.0f, 4, null);
                Matrix.m988timesAssign58bKbWc(fArr, fArr2);
            }
            nodeCoordinator2 = nodeCoordinator2.wrappedBy;
            nodeCoordinator2.getClass();
        }
    }

    private final void updateLayerParameters(boolean z) {
        Owner owner$ui;
        if (this.explicitLayer != null) {
            return;
        }
        OwnedLayer ownedLayer = this.layer;
        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.layerBlock;
        if (ownedLayer == null) {
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
                return;
            }
            InlineClassHelperKt.throwIllegalStateException("null layer with a non-null layerBlock");
            return;
        }
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            throw c8$$ExternalSyntheticOutline0.m("updateLayerParameters requires a non-null layerBlock");
        }
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = graphicsLayerScope;
        reusableGraphicsLayerScope.reset();
        reusableGraphicsLayerScope.setGraphicsDensity$ui(getLayoutNode().getDensity());
        reusableGraphicsLayerScope.setLayoutDirection$ui(getLayoutNode().getLayoutDirection());
        reusableGraphicsLayerScope.m1053setSizeuvyYCjk(IntSizeKt.m3856toSizeozmzZPI(mo2217getSizeYbymL2g()));
        getSnapshotObserver().observer.serializer(this, onCommitAffectingLayerParams, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.NodeCoordinator.updateLayerParameters.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2547invoke() {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(NodeCoordinator.graphicsLayerScope);
                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.getLastShape$ui(), NodeCoordinator.graphicsLayerScope.getShape()}, getCieXyz.write())).booleanValue();
                boolean z2 = this.getLastClip$ui() != NodeCoordinator.graphicsLayerScope.getClip();
                if (!zBooleanValue || z2) {
                    this.setLastShape$ui(NodeCoordinator.graphicsLayerScope.getShape());
                    this.setLastClip$ui(NodeCoordinator.graphicsLayerScope.getClip());
                    if (this.getWasLayerBlockInvoked$ui() && (z2 || (this.getLastClip$ui() && !zBooleanValue))) {
                        this.getLayoutNode().invalidateSemantics$ui();
                    }
                }
                this.setWasLayerBlockInvoked$ui(true);
                NodeCoordinator.graphicsLayerScope.updateOutline$ui();
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2547invoke();
                return createFromParcel.INSTANCE;
            }
        });
        LayerPositionalProperties layerPositionalProperties = this.layerPositionalProperties;
        if (layerPositionalProperties == null) {
            layerPositionalProperties = new LayerPositionalProperties();
            this.layerPositionalProperties = layerPositionalProperties;
        }
        LayerPositionalProperties layerPositionalProperties2 = tmpLayerPositionalProperties;
        layerPositionalProperties2.copyFrom(layerPositionalProperties);
        layerPositionalProperties.copyFrom(reusableGraphicsLayerScope);
        ownedLayer.updateLayerProperties(reusableGraphicsLayerScope);
        boolean z2 = this.isClipping;
        this.isClipping = reusableGraphicsLayerScope.getClip();
        this.lastLayerAlpha = reusableGraphicsLayerScope.getAlpha();
        boolean zHasSameValuesAs = layerPositionalProperties2.hasSameValuesAs(layerPositionalProperties);
        if (z && ((!zHasSameValuesAs || z2 != this.isClipping) && (owner$ui = getLayoutNode().getOwner$ui()) != null)) {
            owner$ui.onLayoutChange(getLayoutNode());
        }
        if (zHasSameValuesAs) {
            return;
        }
        LayoutNode layoutNode = getLayoutNode();
        layoutNode.onCoordinatorRectChanged$ui(this);
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            LayoutNodeKt.requireOwner(layoutNode).requestOnPositionedCallback(layoutNode);
        }
    }

    public final Rect touchBoundsInRoot() {
        if (!isAttached()) {
            return Rect.Companion.getZero();
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        MutableRect rectCache = getRectCache();
        long jM2527calculateMinimumTouchTargetPaddingE7KxVPU = m2527calculateMinimumTouchTargetPaddingE7KxVPU(m2531getMinimumTouchTargetSizeNHjbRc());
        int i = (int) (jM2527calculateMinimumTouchTargetPaddingE7KxVPU >> 32);
        rectCache.setLeft(-Float.intBitsToFloat(i));
        int i2 = (int) (jM2527calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L);
        rectCache.setTop(-Float.intBitsToFloat(i2));
        rectCache.setRight(Float.intBitsToFloat(i) + getMeasuredWidth());
        rectCache.setBottom(Float.intBitsToFloat(i2) + getMeasuredHeight());
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != layoutCoordinatesFindRootCoordinates) {
            nodeCoordinator.rectInParent$ui(rectCache, false, true);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            nodeCoordinator.getClass();
        }
        return MutableRectKt.toRect(rectCache);
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m2514fromParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return nodeCoordinator.m2529fromParentPosition8S9VItk(j, z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        return 0L;
    }

    public static /* synthetic */ void rectInParent$ui$default(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z2 = false;
            }
            nodeCoordinator.rectInParent$ui(mutableRect, z, z2);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m2523toParentPosition8S9VItk$default(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return nodeCoordinator.m2538toParentPosition8S9VItk(j, z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        return 0L;
    }

    public static /* synthetic */ void updateLayerBlock$default(NodeCoordinator nodeCoordinator, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            nodeCoordinator.updateLayerBlock(r8lambdaunavo3sxub_pc9xroryotnrlvsm, z);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    public static /* synthetic */ void updateLayerParameters$default(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            nodeCoordinator.updateLayerParameters(z);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public MeasureResult getMeasureResult$ui() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(UnmeasuredError);
        return null;
    }

    public final MutableRect getRectCache() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    public final void visitNodes(int i, boolean z, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Modifier.Node tail = getTail();
        if (!z && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = headNode(z); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & i) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & i) != 0) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(nodeHeadNode);
            }
            if (nodeHeadNode == tail) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: hit-5ShdDok, reason: not valid java name */
    private final void m2516hit5ShdDok(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        if (node == null) {
            mo2437hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m2516hit5ShdDok(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.read(node);
        hitTestResult.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(-1.0f, z, false));
        m2516hit5ShdDok(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z);
        hitTestResult.hitDepth = i2;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentCoordinates() {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public Rect localBoundingBoxOf(LayoutCoordinates layoutCoordinates, boolean z) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        if (!layoutCoordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates " + layoutCoordinates + " is not attached!");
        }
        NodeCoordinator coordinator = toCoordinator(layoutCoordinates);
        coordinator.onCoordinatesUsed$ui();
        NodeCoordinator nodeCoordinatorFindCommonAncestor$ui = findCommonAncestor$ui(coordinator);
        MutableRect rectCache = getRectCache();
        rectCache.setLeft(0.0f);
        rectCache.setTop(0.0f);
        rectCache.setRight((int) (layoutCoordinates.mo2217getSizeYbymL2g() >> 32));
        rectCache.setBottom((int) (layoutCoordinates.mo2217getSizeYbymL2g() & 4294967295L));
        while (coordinator != nodeCoordinatorFindCommonAncestor$ui) {
            rectInParent$ui$default(coordinator, rectCache, z, false, 4, null);
            if (rectCache.isEmpty()) {
                return Rect.Companion.getZero();
            }
            coordinator = coordinator.wrappedBy;
            coordinator.getClass();
        }
        ancestorToLocal(nodeCoordinatorFindCommonAncestor$ui, rectCache, z);
        return MutableRectKt.toRect(rectCache);
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo2220localToRootMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        onCoordinatesUsed$ui();
        long jM2523toParentPosition8S9VItk$default = j;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                long jM2838getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNode).getRectManager().m2838getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m3800equalsimpl0(jM2838getOffsetFromRectListForBjo55l4, IntOffset.Companion.m3811getMaxnOccac())) {
                    return IntOffsetKt.m3816plusNvtHpc(jM2523toParentPosition8S9VItk$default, jM2838getOffsetFromRectListForBjo55l4);
                }
            }
            jM2523toParentPosition8S9VItk$default = m2523toParentPosition8S9VItk$default(nodeCoordinator, jM2523toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM2523toParentPosition8S9VItk$default;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo2221localToScreenMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return LayoutNodeKt.requireOwner(getLayoutNode()).mo2155localToScreenMKHz9U(mo2220localToRootMKHz9U(j));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo2223screenToLocalMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        return mo2218localPositionOfR5De75A(LayoutCoordinatesKt.findRootCoordinates(this), LayoutNodeKt.requireOwner(getLayoutNode()).mo2156screenToLocalMKHz9U(j));
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo2226windowToLocalMKHz9U(long j) {
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalStateException(ExpectAttachedLayoutCoordinates);
        }
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(this);
        return mo2218localPositionOfR5De75A(layoutCoordinatesFindRootCoordinates, Offset.m481minusMKHz9U(LayoutNodeKt.requireOwner(getLayoutNode()).mo2615calculateLocalPositionMKHz9U(j), LayoutCoordinatesKt.positionInRoot(layoutCoordinatesFindRootCoordinates)));
    }

    /* JADX INFO: renamed from: hitTestChild-qzLsGqo */
    public void mo2437hitTestChildqzLsGqo(HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.m2533hitTestqzLsGqo(hitTestSource, m2514fromParentPosition8S9VItk$default(nodeCoordinator, j, false, 2, null), hitTestResult, i, z);
        }
    }

    /* JADX INFO: renamed from: speculativeHit-Fh5PU_I, reason: not valid java name */
    private final void m2522speculativeHitFh5PU_I(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final int i, final boolean z, final float f) {
        if (node == null) {
            mo2437hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m2522speculativeHitFh5PU_I(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f);
        } else if (hitTestSource.interceptOutOfBoundsChildEvents(node)) {
            hitTestResult.speculativeHit(node, f, z, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2546invoke() {
                    this.this$0.m2520outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, false);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2546invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        } else {
            m2520outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, false);
        }
    }

    /* JADX INFO: renamed from: distanceInMinimumTouchTarget-tz77jQw, reason: not valid java name */
    public final float m2528distanceInMinimumTouchTargettz77jQw(long j, long j2) {
        if (getMeasuredWidth() >= Float.intBitsToFloat((int) (j2 >> 32)) && getMeasuredHeight() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM2527calculateMinimumTouchTargetPaddingE7KxVPU = m2527calculateMinimumTouchTargetPaddingE7KxVPU(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM2527calculateMinimumTouchTargetPaddingE7KxVPU >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM2527calculateMinimumTouchTargetPaddingE7KxVPU & 4294967295L));
        long jM2519offsetFromEdgeMKHz9U = m2519offsetFromEdgeMKHz9U(j);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jM2519offsetFromEdgeMKHz9U >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jM2519offsetFromEdgeMKHz9U & 4294967295L)) <= fIntBitsToFloat2) {
            return Offset.m476getDistanceSquaredimpl(jM2519offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // androidx.compose.ui.layout.LayoutCoordinates
    public final LayoutCoordinates getParentLayoutCoordinates() {
        if (!isAttached()) {
            StringBuilder sb = new StringBuilder(ExpectAttachedLayoutCoordinates);
            for (LayoutNode layoutNode = getLayoutNode(); layoutNode != null; layoutNode = layoutNode.getParent$ui()) {
                sb.append("\n|");
                sb.append(layoutNode);
                sb.append(" isAttached=");
                sb.append(layoutNode.isAttached());
                sb.append(" modifier=");
                sb.append(layoutNode.getModifier());
                sb.append(" tail=");
                sb.append(getTail());
            }
            InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        onCoordinatesUsed$ui();
        return getLayoutNode().getOuterCoordinator$ui().wrappedBy;
    }

    /* JADX INFO: renamed from: hitNear-Fh5PU_I, reason: not valid java name */
    private final void m2517hitNearFh5PU_I(Modifier.Node node, HitTestSource hitTestSource, long j, HitTestResult hitTestResult, int i, boolean z, float f) {
        if (node == null) {
            mo2437hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m2517hitNearFh5PU_I(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f);
            return;
        }
        int i2 = hitTestResult.hitDepth;
        hitTestResult.removeNodesInRange(hitTestResult.hitDepth + 1, hitTestResult.size());
        hitTestResult.hitDepth++;
        hitTestResult.values.read(node);
        hitTestResult.distanceFromEdgeAndFlags.RemoteActionCompatParcelizer(HitTestResultKt.DistanceAndFlags(f, z, false));
        m2520outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, true);
        hitTestResult.hitDepth = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outOfBoundsHit-8NAm7pk, reason: not valid java name */
    public final void m2520outOfBoundsHit8NAm7pk(final Modifier.Node node, final HitTestSource hitTestSource, final long j, final HitTestResult hitTestResult, final int i, final boolean z, final float f, final boolean z2) {
        if (node == null) {
            mo2437hitTestChildqzLsGqo(hitTestSource, j, hitTestResult, i, z);
            return;
        }
        if (!hitTestSource.shouldHitTest(node)) {
            m2520outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, z2);
            return;
        }
        if (m2518isInExpandedTouchBoundsThDn1k(node, j, i)) {
            hitTestResult.hitExpandedTouchBounds(node, z, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.NodeCoordinator$outOfBoundsHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2545invoke() {
                    this.this$0.m2520outOfBoundsHit8NAm7pk(NodeCoordinatorKt.m2549nextUntilhw7D004(node, hitTestSource.mo2542entityTypeOLwlOKw(), NodeKind.m2551constructorimpl(2)), hitTestSource, j, hitTestResult, i, z, f, z2);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2545invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        } else if (z2) {
            m2517hitNearFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        } else {
            m2522speculativeHitFh5PU_I(node, hitTestSource, j, hitTestResult, i, z, f);
        }
    }

    public final void drawBorder(Canvas canvas, Paint paint) {
        canvas.drawRect(0.5f, 0.5f, ((int) (m2275getMeasuredSizeYbymL2g() >> 32)) - 0.5f, ((int) (m2275getMeasuredSizeYbymL2g() & 4294967295L)) - 0.5f, paint);
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m2521placeSelfMLgxB_4(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                InlineClassHelperKt.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != graphicsLayer) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.explicitLayer = graphicsLayer;
            }
            if (this.layer == null) {
                OwnedLayer ownedLayerCreateLayer = LayoutNodeKt.requireOwner(getLayoutNode()).createLayer(getDrawBlock(), this.invalidateParentLayer, graphicsLayer);
                ownedLayerCreateLayer.mo2613resizeozmzZPI(m2275getMeasuredSizeYbymL2g());
                ownedLayerCreateLayer.mo2612movegyyYBs(j);
                this.layer = ownedLayerCreateLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, r8lambdaunavo3sxub_pc9xroryotnrlvsm, false, 2, null);
        }
        if (!IntOffset.m3800equalsimpl0(mo2467getPositionnOccac(), j)) {
            LayoutNodeKt.requireOwner(getLayoutNode()).voteFrameRate(FrameRateCategory.Companion.m148getHighNSsRyOo());
            m2537setPositiongyyYBs(j);
            OwnedLayer ownedLayer = this.layer;
            if (ownedLayer != null) {
                ownedLayer.mo2612movegyyYBs(j);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.invalidateLayer();
                }
            }
            getLayoutNode().onCoordinatorRectChanged$ui(this);
            invalidateAlignmentLinesFromPositionChange(this);
            Owner owner$ui = getLayoutNode().getOwner$ui();
            if (owner$ui != null) {
                owner$ui.onLayoutChange(getLayoutNode());
            }
        }
        this.zIndex = f;
        if (this == getLayoutNode().getOuterCoordinator$ui()) {
            LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager().recalculateRectIfDirty(getLayoutNode());
        }
        if (isPlacingForAlignment$ui()) {
            return;
        }
        captureRulersIfNeeded$ui(getMeasureResult$ui());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public void onMeasureResultChanged(int i, int i2) {
        NodeCoordinator nodeCoordinator;
        OwnedLayer ownedLayer = this.layer;
        if (ownedLayer != null) {
            ownedLayer.mo2613resizeozmzZPI(IntSize.m3839constructorimpl((((long) i) << 32) | (((long) i2) & 4294967295L)));
        } else if (getLayoutNode().isPlaced() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.invalidateLayer();
        }
        m2278setMeasuredSizeozmzZPI(IntSize.m3839constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32)));
        if (this.layerBlock != null) {
            updateLayerParameters(false);
        }
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(4);
        boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(iM2551constructorimpl);
        Modifier.Node tail = getTail();
        if (zM2560getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui()) != null) {
            for (Modifier.Node nodeHeadNode = headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
                if ((nodeHeadNode.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    ?? Pop = nodeHeadNode;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof DrawModifierNode) {
                            ((DrawModifierNode) Pop).onMeasureResultChanged();
                        } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                            Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                            int i3 = 0;
                            Pop = Pop;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            while (delegate$ui != null) {
                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                                        Pop = delegate$ui;
                                    } else {
                                        if (oncreatevirtualviewtranslationrequests == 0) {
                                            oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                        }
                                        if (Pop != 0) {
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(Pop);
                                            Pop = 0;
                                        }
                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                    }
                                }
                                delegate$ui = delegate$ui.getChild$ui();
                                Pop = Pop;
                                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            }
                            if (i3 == 1) {
                            }
                        }
                        Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                    }
                }
                if (nodeHeadNode == tail) {
                    break;
                }
            }
        }
        Owner owner$ui = getLayoutNode().getOwner$ui();
        if (owner$ui != null) {
            owner$ui.onLayoutChange(getLayoutNode());
        }
        getLayoutNode().onCoordinatorRectChanged$ui(this);
    }

    /* JADX INFO: renamed from: withinLayerBounds-k-4lQ0M, reason: not valid java name */
    public final boolean m2540withinLayerBoundsk4lQ0M(long j) {
        if ((((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) != 0) {
            return false;
        }
        OwnedLayer ownedLayer = this.layer;
        return ownedLayer == null || !this.isClipping || ownedLayer.mo2610isInLayerk4lQ0M(j);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo2210placeAtf8xVGno(long j, float f, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.forcePlaceWithLookaheadOffset) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            lookaheadDelegate.getClass();
            m2521placeSelfMLgxB_4(lookaheadDelegate.mo2467getPositionnOccac(), f, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
            return;
        }
        m2521placeSelfMLgxB_4(j, f, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null);
    }
}

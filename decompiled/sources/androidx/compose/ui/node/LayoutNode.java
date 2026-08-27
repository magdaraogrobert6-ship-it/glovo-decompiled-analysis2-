package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import bo.app.ah$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BuildDrawCacheParams;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawableTransformation;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getAddressStreet;
import o.getCieXyz;
import o.getEmailAddress;
import o.getGender;
import o.getLayoutDirection;
import o.getPersonFullName;
import o.getRectangleGoahg;
import o.getUnboundedGoahg;
import o.onCreateVirtualViewTranslationRequests;
import o.onItemDismisslambda0;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode implements getAddressStreet, Remeasurement, OwnerScope, LayoutInfo, SemanticsInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private Modifier _modifier;
    private SemanticsConfiguration _semanticsConfiguration;
    private onCreateVirtualViewTranslationRequests _unfoldedChildren;
    private final onCreateVirtualViewTranslationRequests _zSortedChildren;
    private boolean addedToRectList;
    private boolean canMultiMeasure;
    private int compositeKeyHash;
    private getEmailAddress compositionLocalMap;
    private Density density;
    private int depth;
    private int globallyPositionedObservers;
    private boolean hasPositionalLayerTransformationsInOffsetFromRoot;
    private boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isCurrentlyCalculatingSemanticsConfiguration;
    private boolean isDeactivated;
    private boolean isSemanticsInvalidated;
    private final boolean isVirtual;
    private boolean isVirtualLookaheadRoot;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LayoutNode lookaheadRoot;
    private MeasurePolicy measurePolicy;
    private boolean needsOnGloballyPositionedDispatch;
    private final NodeChain nodes;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onAttach;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onDetach;
    private long outerToInnerOffset;
    private boolean outerToInnerOffsetDirty;
    private Owner owner;
    private Modifier pendingModifier;
    private UsageByParent previousIntrinsicsUsageByParent;
    private boolean rectInParentDirty;
    private int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private boolean zSortedChildrenInvalidated;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new NoIntrinsicsMeasurePolicy() { // from class: androidx.compose.ui.node.LayoutNode$Companion$ErrorMeasurePolicy$1
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m2453measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list, long j) {
            return (MeasureResult) m2453measure3p2s80s(measureScope, (List<? extends Measurable>) list, j);
        }
    };
    private static final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 Constructor = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };
    private static final ViewConfiguration DummyViewConfiguration = new ViewConfiguration() { // from class: androidx.compose.ui.node.LayoutNode$Companion$DummyViewConfiguration$1
        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        public float getTouchSlop() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.ViewConfiguration
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo2452getMinimumTouchTargetSizeMYxV2XQ() {
            return DpSize.Companion.m3781getZeroMYxV2XQ();
        }
    };
    private static final Comparator<LayoutNode> ZComparator = new LayoutNode$$ExternalSyntheticLambda1(0);

    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        public static final int $stable = 0;
        private final String error;

        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m2454maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m2455maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m2456minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m2457minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        public NoIntrinsicsMeasurePolicy(String str) {
            this.error = str;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2454maxIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2455maxIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2456minIntrinsicHeight(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
            return ((Number) m2457minIntrinsicWidth(intrinsicMeasureScope, (List<? extends IntrinsicMeasurable>) list, i)).intValue();
        }
    }

    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;

        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }
    }

    private final SemanticsConfiguration calculateSemanticsConfiguration() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = new SemanticsConfiguration();
        OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.requireOwner(this).getSnapshotObserver();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.LayoutNode.calculateSemanticsConfiguration.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
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
            /* JADX WARN: Type inference failed for: r6v11 */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2459invoke() {
                NodeChain nodes$ui = LayoutNode.this.getNodes$ui();
                int iM2551constructorimpl = NodeKind.m2551constructorimpl(8);
                createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                if ((nodes$ui.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
                    for (Modifier.Node tail$ui = nodes$ui.getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
                        if ((tail$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? Pop = tail$ui;
                            ?? oncreatevirtualviewtranslationrequests = 0;
                            while (Pop != 0) {
                                if (Pop instanceof SemanticsModifierNode) {
                                    SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) Pop;
                                    if (semanticsModifierNode.getShouldClearDescendantSemantics()) {
                                        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
                                        createinappmessageeventsubscriber2.IconCompatParcelizer = semanticsConfiguration;
                                        semanticsConfiguration.setClearingSemantics(true);
                                    }
                                    if (semanticsModifierNode.getShouldMergeDescendantSemantics()) {
                                        ((SemanticsConfiguration) createinappmessageeventsubscriber2.IconCompatParcelizer).setMergingSemanticsOfDescendants(true);
                                    }
                                    semanticsModifierNode.applySemantics((SemanticsPropertyReceiver) createinappmessageeventsubscriber2.IconCompatParcelizer);
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
                    }
                }
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2459invoke();
                return createFromParcel.INSTANCE;
            }
        };
        snapshotObserver.observer.serializer(this, snapshotObserver.onCommitAffectingSemantics, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getCanMultiMeasure$ui$annotations() {
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    public final boolean getAddedToRectList$ui() {
        return this.addedToRectList;
    }

    public final boolean getApplyingModifierOnAttach$ui() {
        return this.pendingModifier != null;
    }

    public final boolean getCanMultiMeasure$ui() {
        return this.canMultiMeasure;
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public List<SemanticsInfo> getChildrenInfo() {
        return getChildren$ui();
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public getEmailAddress getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui() {
        return this.depth;
    }

    public final int getGloballyPositionedObservers() {
        return this.globallyPositionedObservers;
    }

    public final boolean getHasPositionalLayerTransformationsInOffsetFromRoot$ui() {
        return this.hasPositionalLayerTransformationsInOffsetFromRoot;
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui() {
        return this.innerLayerCoordinatorIsDirty;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui() {
        return this.interopViewFactoryHolder;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui() {
        return this.intrinsicsUsageByParent;
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui() {
        return this.layoutDelegate;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final LayoutNode getLookaheadRoot$ui() {
        return this.lookaheadRoot;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public Modifier getModifier() {
        return this._modifier;
    }

    public final boolean getNeedsOnGloballyPositionedDispatch$ui() {
        return this.needsOnGloballyPositionedDispatch;
    }

    public final NodeChain getNodes$ui() {
        return this.nodes;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnAttach$ui() {
        return this.onAttach;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnDetach$ui() {
        return this.onDetach;
    }

    /* JADX INFO: renamed from: getOuterToInnerOffset-nOcc-ac$ui, reason: not valid java name */
    public final long m2446getOuterToInnerOffsetnOccac$ui() {
        return this.outerToInnerOffset;
    }

    public final boolean getOuterToInnerOffsetDirty$ui() {
        return this.outerToInnerOffsetDirty;
    }

    public final Owner getOwner$ui() {
        return this.owner;
    }

    public final boolean getRectInParentDirty$ui() {
        return this.rectInParentDirty;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui() {
        return this.subcompositionsState;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo, androidx.compose.ui.node.ComposeUiNode
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final <T> T ignoreRemeasureRequests$ui(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.ignoreRemeasureRequests = true;
        T t = (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.ignoreRemeasureRequests = false;
        return t;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isAttached() {
        return this.owner != null;
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isDeactivated() {
        return this.isDeactivated;
    }

    public final boolean isSemanticsInvalidated$ui() {
        return this.isSemanticsInvalidated;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui() {
        return this.isVirtualLookaheadRoot;
    }

    public final void setAddedToRectList$ui(boolean z) {
        this.addedToRectList = z;
    }

    public final void setCanMultiMeasure$ui(boolean z) {
        this.canMultiMeasure = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositeKeyHash(int i) {
        this.compositeKeyHash = i;
    }

    public final void setDepth$ui(int i) {
        this.depth = i;
    }

    public final void setHasPositionalLayerTransformationsInOffsetFromRoot$ui(boolean z) {
        this.hasPositionalLayerTransformationsInOffsetFromRoot = z;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    public final void setInteropViewFactoryHolder$ui(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    public final void setNeedsOnGloballyPositionedDispatch$ui(boolean z) {
        this.needsOnGloballyPositionedDispatch = z;
    }

    public final void setOnAttach$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onAttach = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setOnDetach$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onDetach = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX INFO: renamed from: setOuterToInnerOffset--gyyYBs$ui, reason: not valid java name */
    public final void m2451setOuterToInnerOffsetgyyYBs$ui(long j) {
        this.outerToInnerOffset = j;
    }

    public final void setOuterToInnerOffsetDirty$ui(boolean z) {
        this.outerToInnerOffsetDirty = z;
    }

    public final void setRectInParentDirty$ui(boolean z) {
        this.rectInParentDirty = z;
    }

    public void setSemanticsId(int i) {
        this.semanticsId = i;
    }

    public final void setSemanticsInvalidated$ui(boolean z) {
        this.isSemanticsInvalidated = z;
    }

    public final void setSubcompositionsState$ui(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    public final void setVirtualLookaheadRoot$ui(boolean z) {
        this.isVirtualLookaheadRoot = z;
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.clearSubtreePlacementIntrinsicsUsage();
            }
        }
    }

    private final String debugTreeToString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i3 = oncreatevirtualviewtranslationrequests.read;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((LayoutNode) objArr[i4]).debugTreeToString(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 0, string) : string;
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui();
        }
        layoutNode._foldedParent = null;
        if (layoutNode.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers - 1);
        }
        layoutNode.getOuterCoordinator$ui().setWrappedBy$ui(null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            onCreateVirtualViewTranslationRequests vector = layoutNode._foldedChildren.getVector();
            Object[] objArr = vector.write;
            int i = vector.read;
            for (int i2 = 0; i2 < i; i2++) {
                ((LayoutNode) objArr[i2]).getOuterCoordinator$ui().setWrappedBy$ui(null);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui();
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui();
    }

    private final void setLookaheadRoot(LayoutNode layoutNode) {
        Object[] objArr = {layoutNode, this.lookaheadRoot};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNode != null) {
            layoutNodeLayoutDelegate.ensureLookaheadDelegateCreated$ui();
            NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
            for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite, new Object[]{outerCoordinator$ui, wrapped$ui}, iWrite)).booleanValue() && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
                outerCoordinator$ui.ensureLookaheadDelegateCreated();
            }
        } else {
            layoutNodeLayoutDelegate.onRemovedFromLookaheadScope();
        }
        invalidateMeasurements$ui();
    }

    public final void clearSubtreeIntrinsicsUsage$ui() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.clearSubtreeIntrinsicsUsage$ui();
            }
        }
    }

    public final boolean getAlignmentLinesRequired$ui() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui().getAlignmentLines().getRequired$ui() || !((lookaheadAlignmentLinesOwner$ui = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui()) == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui.getAlignmentLines()) == null || !alignmentLines.getRequired$ui());
    }

    public final List<LayoutNode> getFoldedChildren$ui() {
        return this._foldedChildren.getVector().read();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getHeight() {
        return this.layoutDelegate.getHeight$ui();
    }

    public final NodeCoordinator getInnerCoordinator$ui() {
        return this.nodes.getInnerCoordinator$ui();
    }

    public final boolean getLayoutPending$ui() {
        return this.layoutDelegate.getLayoutPending$ui();
    }

    public final LayoutState getLayoutState$ui() {
        return this.layoutDelegate.getLayoutState$ui();
    }

    public final boolean getLookaheadLayoutPending$ui() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui();
    }

    public final boolean getLookaheadMeasurePending$ui() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui();
    }

    public final LookaheadPassDelegate getLookaheadPassDelegate$ui() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui();
    }

    public final MeasurePassDelegate getMeasurePassDelegate$ui() {
        return this.layoutDelegate.getMeasurePassDelegate$ui();
    }

    public final boolean getMeasurePending$ui() {
        return this.layoutDelegate.getMeasurePending$ui();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final NodeCoordinator getOuterCoordinator$ui() {
        return this.nodes.getOuterCoordinator$ui();
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public int getWidth() {
        return this.layoutDelegate.getWidth$ui();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void invalidateDrawForSubtree(boolean z) {
        if (z) {
            LayoutNode parent$ui = getParent$ui();
            if (parent$ui != null) {
                parent$ui.invalidateLayer$ui();
            } else {
                Owner owner = this.owner;
                if (owner != null) {
                    owner.invalidateRootLayer();
                }
            }
        }
        NodeChain nodeChain = this.nodes;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    ?? Pop = head$ui;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m2391requireCoordinator64DMado((LayoutModifierNode) Pop, NodeKind.m2551constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
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
                if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    break;
                }
            }
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
        int i2 = oncreatevirtualviewtranslationrequests2.read;
        for (int i3 = 0; i3 < i2; i3++) {
            ((LayoutNode) objArr[i3]).invalidateDrawForSubtree(false);
        }
    }

    public final void invalidateParentData$ui() {
        this.layoutDelegate.invalidateParentData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void invalidateSubtree(boolean z) {
        if (z) {
            LayoutNode parent$ui = getParent$ui();
            if (parent$ui != null) {
                parent$ui.invalidateLayer$ui();
            } else {
                Owner owner = this.owner;
                if (owner != null) {
                    owner.invalidateRootLayer();
                }
            }
        }
        invalidateSemantics$ui();
        requestRemeasure$ui$default(this, false, false, false, 7, null);
        NodeChain nodeChain = this.nodes;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    ?? Pop = head$ui;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof LayoutModifierNode) {
                            OwnedLayer layer = DelegatableNodeKt.m2391requireCoordinator64DMado((LayoutModifierNode) Pop, NodeKind.m2551constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
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
                if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    break;
                }
            }
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
        int i2 = oncreatevirtualviewtranslationrequests2.read;
        for (int i3 = 0; i3 < i2; i3++) {
            ((LayoutNode) objArr[i3]).invalidateSubtree(false);
        }
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui, reason: not valid java name */
    public final boolean m2449lookaheadRemeasure_Sx5XlM$ui(Constraints constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        lookaheadPassDelegate$ui.getClass();
        return lookaheadPassDelegate$ui.m2484remeasureBRTryo0(constraints.m3632unboximpl());
    }

    public final void lookaheadReplace$ui() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        lookaheadPassDelegate$ui.getClass();
        lookaheadPassDelegate$ui.replace();
    }

    public final void markLayoutPending$ui() {
        this.layoutDelegate.markLayoutPending$ui();
    }

    public final void markLookaheadLayoutPending$ui() {
        this.layoutDelegate.markLookaheadLayoutPending$ui();
    }

    public final void markLookaheadMeasurePending$ui() {
        this.layoutDelegate.markLookaheadMeasurePending$ui();
    }

    public final void markMeasurePending$ui() {
        this.layoutDelegate.markMeasurePending$ui();
    }

    public final void place$ui(int i, int i2) {
        Placeable.PlacementScope placementScope;
        NodeCoordinator innerCoordinator$ui;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui == null || (innerCoordinator$ui = parent$ui.getInnerCoordinator$ui()) == null || (placementScope = innerCoordinator$ui.getPlacementScope()) == null) {
            placementScope = LayoutNodeKt.requireOwner(this).getPlacementScope();
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, getMeasurePassDelegate$ui(), i, i2, 0.0f, 4, null);
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui, reason: not valid java name */
    public final boolean m2450remeasure_Sx5XlM$ui(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui();
        }
        return getMeasurePassDelegate$ui().m2498remeasureBRTryo0(constraints.m3632unboximpl());
    }

    public final void removeAll$ui() {
        int i = this._foldedChildren.getVector().read - 1;
        while (true) {
            MutableVectorWithMutationTracking<LayoutNode> mutableVectorWithMutationTracking = this._foldedChildren;
            if (-1 >= i) {
                mutableVectorWithMutationTracking.clear();
                return;
            } else {
                onChildRemoved((LayoutNode) mutableVectorWithMutationTracking.getVector().write[i]);
                i--;
            }
        }
    }

    public final void replace$ui() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui().replace();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setCompositionLocalMap(getEmailAddress getemailaddress) {
        this.compositionLocalMap = getemailaddress;
        ProvidableCompositionLocal localDensity = CompositionLocalsKt.getLocalDensity();
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) getemailaddress;
        dragAndDropNodestartDragAndDropTransfer1.getClass();
        setDensity((Density) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, localDensity));
        setLayoutDirection((LayoutDirection) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, CompositionLocalsKt.getLocalLayoutDirection()));
        setViewConfiguration((ViewConfiguration) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, CompositionLocalsKt.getLocalViewConfiguration()));
        NodeChain nodeChain = this.nodes;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.CompositingStrategy);
        if ((nodeChain.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    ?? Pop = head$ui;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof CompositionLocalConsumerModifierNode) {
                            Modifier.Node node = ((CompositionLocalConsumerModifierNode) Pop).getNode();
                            if (node.isAttached()) {
                                NodeKindKt.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
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
                if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setDensity(Density density) {
        Object[] objArr = {this.density, density};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.density = density;
        onDensityOrLayoutDirectionChanged();
        for (Modifier.Node head$ui = this.nodes.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            head$ui.onDensityChange();
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setMeasurePolicy(MeasurePolicy measurePolicy) {
        Object[] objArr = {this.measurePolicy, measurePolicy};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.measurePolicy = measurePolicy;
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            intrinsicsPolicy.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui();
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
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setViewConfiguration(ViewConfiguration viewConfiguration) {
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.viewConfiguration, viewConfiguration}, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.viewConfiguration = viewConfiguration;
        NodeChain nodeChain = this.nodes;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(16);
        if ((nodeChain.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    ?? Pop = head$ui;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof PointerInputModifierNode) {
                            ((PointerInputModifierNode) Pop).onViewConfigurationChange();
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
                if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + getChildren$ui().size() + " measurePolicy: " + getMeasurePolicy() + " deactivated: " + isDeactivated();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui$annotations() {
        }

        public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getConstructor$ui() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui() {
            return LayoutNode.ZComparator;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this.outerToInnerOffset = IntOffset.Companion.m3811getMaxnOccac();
        this.outerToInnerOffsetDirty = true;
        this.rectInParentDirty = true;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new onCreateVirtualViewTranslationRequests(new LayoutNode[16]), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2458invoke() {
                this.this$0.getLayoutDelegate$ui().markChildrenDirty();
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2458invoke();
                return createFromParcel.INSTANCE;
            }
        });
        this._zSortedChildren = new onCreateVirtualViewTranslationRequests(new LayoutNode[16]);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.density = LayoutNodeKt.DefaultDensity;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        getEmailAddress.o_.getClass();
        this.compositionLocalMap = getGender.serializer;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = Modifier.Companion;
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui();
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.invalidateLayer$ui();
        } else {
            Owner owner = this.owner;
            if (owner != null) {
                owner.invalidateRootLayer();
            }
        }
        invalidateLayers$ui();
    }

    public final onCreateVirtualViewTranslationRequests get_children$ui() {
        updateChildrenIfDirty$ui();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this._unfoldedChildren;
        oncreatevirtualviewtranslationrequests.getClass();
        return oncreatevirtualviewtranslationrequests;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$0(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.getZIndex() == layoutNode2.getZIndex() ? removeNodeAtDepth.serializer(layoutNode.getPlaceOrder$ui(), layoutNode2.getPlaceOrder$ui()) : Float.compare(layoutNode.getZIndex(), layoutNode2.getZIndex());
    }

    private final void applyModifier(Modifier modifier) {
        boolean zM2506hasH91voCI$ui = this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(16));
        boolean zM2506hasH91voCI$ui2 = this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(Fields.RotationZ));
        this._modifier = modifier;
        this.nodes.updateFrom$ui(modifier);
        boolean zM2506hasH91voCI$ui3 = this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(16));
        boolean zM2506hasH91voCI$ui4 = this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(Fields.RotationZ));
        this.layoutDelegate.updateParentData();
        if (this.lookaheadRoot == null && this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(Fields.RotationY))) {
            setLookaheadRoot(this);
        }
        if (zM2506hasH91voCI$ui == zM2506hasH91voCI$ui3 && zM2506hasH91voCI$ui2 == zM2506hasH91voCI$ui4) {
            return;
        }
        LayoutNodeKt.requireOwner(this).getRectManager().updateFlagsFor(this, zM2506hasH91voCI$ui4, zM2506hasH91voCI$ui3);
    }

    private final String exceptionMessageForParentingOrOwnership(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(layoutNode);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(debugTreeToString$default(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode2 = layoutNode._foldedParent;
        sb.append(layoutNode2 != null ? debugTreeToString$default(layoutNode2, 0, 1, null) : null);
        return sb.toString();
    }

    private final getUnboundedGoahg getTraceContext() {
        getEmailAddress compositionLocalMap = getCompositionLocalMap();
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui = BuildDrawCacheParams.read();
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) compositionLocalMap;
        dragAndDropNodestartDragAndDropTransfer1.getClass();
        return (getUnboundedGoahg) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, setcurrentsemanticsnodesui);
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui().getZIndex$ui();
    }

    /* JADX INFO: renamed from: hitTest-6fMxITs$ui$default, reason: not valid java name */
    public static /* synthetic */ void m2442hitTest6fMxITs$ui$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = PointerType.Companion.m2154getUnknownT8wyACA();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.m2447hitTest6fMxITs$ui(j, hitTestResult, i3, z);
    }

    /* JADX INFO: renamed from: hitTestSemantics-6fMxITs$ui$default, reason: not valid java name */
    public static /* synthetic */ void m2443hitTestSemantics6fMxITs$ui$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = PointerType.Companion.m2153getTouchT8wyACA();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.m2448hitTestSemantics6fMxITs$ui(j, hitTestResult, i3, z);
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui$default, reason: not valid java name */
    public static /* synthetic */ boolean m2444lookaheadRemeasure_Sx5XlM$ui$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m2463getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m2449lookaheadRemeasure_Sx5XlM$ui(constraints);
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui$default, reason: not valid java name */
    public static /* synthetic */ boolean m2445remeasure_Sx5XlM$ui$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m2462getLastConstraintsDWUhwKw();
        }
        return layoutNode.m2450remeasure_Sx5XlM$ui(constraints);
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
    /* JADX WARN: Type inference failed for: r6v6 */
    public final void dispatchOnPositionedCallbacks$ui() {
        if (getLayoutState$ui() != LayoutState.Idle || getLayoutPending$ui() || getMeasurePending$ui() || isDeactivated() || !isPlaced()) {
            return;
        }
        NodeChain nodeChain = this.nodes;
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationX);
        if ((nodeChain.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
            for (Modifier.Node head$ui = nodeChain.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                    ?? Pop = head$ui;
                    ?? oncreatevirtualviewtranslationrequests = 0;
                    while (Pop != 0) {
                        if (Pop instanceof GlobalPositionAwareModifierNode) {
                            GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) Pop;
                            globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m2391requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m2551constructorimpl(Fields.RotationX)));
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
                if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui(Canvas canvas, GraphicsLayer graphicsLayer) throws Throwable {
        try {
            getOuterCoordinator$ui().draw(canvas, graphicsLayer);
        } catch (Throwable th) {
            rethrowWithComposeStackTrace(th);
            DrawableTransformation.read();
        }
    }

    public final void forEachChild(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[i2]);
        }
    }

    public final void forEachChildIndexed(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Integer.valueOf(i2), objArr[i2]);
        }
    }

    public final void forEachCoordinator$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui();
        NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
        while (outerCoordinator$ui != innerCoordinator$ui) {
            outerCoordinator$ui.getClass();
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui = layoutModifierNodeCoordinator.getWrapped$ui();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
        for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite, new Object[]{outerCoordinator$ui, wrapped$ui}, iWrite)).booleanValue() && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(outerCoordinator$ui);
        }
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui() {
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        lookaheadPassDelegate$ui.getClass();
        return lookaheadPassDelegate$ui.getChildDelegates$ui();
    }

    public final List<Measurable> getChildMeasurables$ui() {
        return getMeasurePassDelegate$ui().getChildDelegates$ui();
    }

    public final List<LayoutNode> getChildren$ui() {
        return get_children$ui().read();
    }

    public final boolean getHasFixedInnerContentConstraints$ui() {
        long jM2530getLastMeasurementConstraintsmsEJaDk$ui = getInnerCoordinator$ui().m2530getLastMeasurementConstraintsmsEJaDk$ui();
        return Constraints.m3624getHasFixedWidthimpl(jM2530getLastMeasurementConstraintsmsEJaDk$ui) && Constraints.m3623getHasFixedHeightimpl(jM2530getLastMeasurementConstraintsmsEJaDk$ui);
    }

    public final NodeCoordinator getInnerLayerCoordinator$ui() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
            NodeCoordinator wrappedBy$ui = getOuterCoordinator$ui().getWrappedBy$ui();
            this._innerLayerCoordinator = null;
            while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{innerCoordinator$ui, wrappedBy$ui}, getCieXyz.write())).booleanValue()) {
                if ((innerCoordinator$ui != null ? innerCoordinator$ui.getLayer() : null) != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui;
                    break;
                }
                innerCoordinator$ui = innerCoordinator$ui != null ? innerCoordinator$ui.getWrappedBy$ui() : null;
            }
            this.innerLayerCoordinatorIsDirty = false;
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw c8$$ExternalSyntheticOutline0.m("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
    }

    @Override // androidx.compose.ui.node.InteroperableComposeUiNode
    @InternalComposeUiApi
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final LayoutNodeDrawScope getMDrawScope$ui() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    public final UsageByParent getMeasuredByParent$ui() {
        return getMeasurePassDelegate$ui().getMeasuredByParent$ui();
    }

    public final LayoutNode getParent$ui() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final int getPlaceOrder$ui() {
        return getMeasurePassDelegate$ui().getPlaceOrder();
    }

    public final onCreateVirtualViewTranslationRequests getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.RemoteActionCompatParcelizer();
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this._zSortedChildren;
            oncreatevirtualviewtranslationrequests.write(oncreatevirtualviewtranslationrequests.read, get_children$ui());
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = this._zSortedChildren;
            Comparator<LayoutNode> comparator = ZComparator;
            Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
            int i = oncreatevirtualviewtranslationrequests2.read;
            comparator.getClass();
            Arrays.sort(objArr, 0, i, comparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final void invalidateLayers$ui() {
        NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui();
        NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
        while (outerCoordinator$ui != innerCoordinator$ui) {
            outerCoordinator$ui.getClass();
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui = layoutModifierNodeCoordinator.getWrapped$ui();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui() {
        if (this.isVirtual) {
            LayoutNode parent$ui = getParent$ui();
            if (parent$ui != null) {
                parent$ui.invalidateMeasurements$ui();
                return;
            }
            return;
        }
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui$default(this, false, false, false, 7, null);
        } else {
            requestRemeasure$ui$default(this, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui() {
        if (this.globallyPositionedObservers == 0 || getLayoutPending$ui() || getMeasurePending$ui() || this.needsOnGloballyPositionedDispatch) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestOnPositionedCallback(this);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui().isPlaced$ui();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui().isPlacedByParent();
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public boolean isTransparent() {
        return getOuterCoordinator$ui().isTransparent();
    }

    public final int maxIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(i);
    }

    public final int maxIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(i);
    }

    public final int minIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(i);
    }

    public final int minIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(i);
    }

    public final void onCoordinatorRectChanged$ui(NodeCoordinator nodeCoordinator) {
        Owner owner = this.owner;
        RectManager rectManager = owner != null ? owner.getRectManager() : null;
        boolean z = getLayoutState$ui() != LayoutState.Idle || getMeasurePending$ui() || getLayoutPending$ui();
        if (this.addedToRectList && rectManager != null) {
            if (nodeCoordinator == getOuterCoordinator$ui()) {
                this.rectInParentDirty = true;
                if (!z) {
                    rectManager.recalculateRectIfDirty(this);
                }
            } else {
                this.outerToInnerOffsetDirty = true;
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
                Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                int i = oncreatevirtualviewtranslationrequests.read;
                for (int i2 = 0; i2 < i; i2++) {
                    LayoutNode layoutNode = (LayoutNode) objArr[i2];
                    layoutNode.rectInParentDirty = true;
                    if (!z) {
                        rectManager.recalculateRectIfDirty(layoutNode);
                    }
                }
                rectManager.invalidateCallbacksFor(this);
            }
        }
        this.layoutDelegate.getMeasurePassDelegate$ui().requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
    }

    @Override // o.getAddressStreet
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onDeactivate();
        }
        this.isDeactivated = true;
        resetModifierState();
        if (isAttached()) {
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.onLayoutNodeDeactivated(this);
        }
    }

    @Override // o.getAddressStreet
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onRelease();
        }
        NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
        for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite, new Object[]{outerCoordinator$ui, wrapped$ui}, iWrite)).booleanValue() && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
            outerCoordinator$ui.onRelease();
        }
    }

    public final void onZSortedChildrenInvalidated$ui() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.onZSortedChildrenInvalidated$ui();
        }
    }

    public final void requestLookaheadRelayout$ui(boolean z) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.onRequestRelayout(this, true, z);
    }

    public final void requestRelayout$ui(boolean z) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestRelayout$default(owner, this, false, z, 2, null);
    }

    public final void requestRemeasure$ui(boolean z, boolean z2, boolean z3) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.onRequestMeasure$default(owner, this, false, z, z2, 2, null);
        if (z3) {
            getMeasurePassDelegate$ui().invalidateIntrinsicsParent(z);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui(LayoutNode layoutNode) {
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui().ordinal()] != 1) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(layoutNode.getLayoutState$ui(), "Unexpected state ");
            return;
        }
        if (layoutNode.getLookaheadMeasurePending$ui()) {
            requestLookaheadRemeasure$ui$default(layoutNode, true, false, false, 6, null);
            return;
        }
        if (layoutNode.getLookaheadLayoutPending$ui()) {
            layoutNode.requestLookaheadRelayout$ui(true);
        }
        if (layoutNode.getMeasurePending$ui()) {
            requestRemeasure$ui$default(layoutNode, true, false, false, 6, null);
        } else if (layoutNode.getLayoutPending$ui()) {
            layoutNode.requestRelayout$ui(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.resetSubtreeIntrinsicsUsage$ui();
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            onDensityOrLayoutDirectionChanged();
            for (Modifier.Node head$ui = this.nodes.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                head$ui.onLayoutDirectionChange();
            }
        }
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void setModifier(Modifier modifier) {
        if (this.isVirtual && getModifier() != Modifier.Companion) {
            InlineClassHelperKt.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (isDeactivated()) {
            InlineClassHelperKt.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.pendingModifier = modifier;
            return;
        }
        applyModifier(modifier);
        if (this.isSemanticsInvalidated) {
            invalidateSemantics$ui();
        }
    }

    public final void updateChildrenIfDirty$ui() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    public static /* synthetic */ void invalidateDrawForSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateDrawForSubtree(z);
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.invalidateUnfoldedVirtualChildren();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this._unfoldedChildren;
            if (oncreatevirtualviewtranslationrequests == null) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new LayoutNode[16]);
                this._unfoldedChildren = oncreatevirtualviewtranslationrequests2;
                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests2;
            }
            oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer();
            onCreateVirtualViewTranslationRequests vector = this._foldedChildren.getVector();
            Object[] objArr = vector.write;
            int i = vector.read;
            for (int i2 = 0; i2 < i; i2++) {
                LayoutNode layoutNode = (LayoutNode) objArr[i2];
                if (layoutNode.isVirtual) {
                    oncreatevirtualviewtranslationrequests.write(oncreatevirtualviewtranslationrequests.read, layoutNode.get_children$ui());
                } else {
                    oncreatevirtualviewtranslationrequests.IconCompatParcelizer(layoutNode);
                }
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui(z);
    }

    public static /* synthetic */ void requestRelayout$ui$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui(z);
    }

    @Override // androidx.compose.ui.layout.LayoutInfo
    public SemanticsInfo getParentInfo() {
        return getParent$ui();
    }

    public final void insertAt$ui(int i, LayoutNode layoutNode) {
        if (layoutNode._foldedParent != null && layoutNode.owner != null) {
            InlineClassHelperKt.throwIllegalStateException(exceptionMessageForParentingOrOwnership(layoutNode));
        }
        layoutNode._foldedParent = this;
        this._foldedChildren.add(i, layoutNode);
        onZSortedChildrenInvalidated$ui();
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount++;
        }
        invalidateUnfoldedVirtualChildren();
        Owner owner = this.owner;
        if (owner != null) {
            layoutNode.attach$ui(owner);
        }
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
        if (layoutNode.globallyPositionedObservers > 0) {
            setGloballyPositionedObservers(this.globallyPositionedObservers + 1);
        }
    }

    public final void invalidateSemantics$ui() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (this.nodes.isUpdating$ui() || getApplyingModifierOnAttach$ui()) {
            this.isSemanticsInvalidated = true;
            return;
        }
        SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
        this._semanticsConfiguration = calculateSemanticsConfiguration();
        this.isSemanticsInvalidated = false;
        Owner ownerRequireOwner = LayoutNodeKt.requireOwner(this);
        ownerRequireOwner.getSemanticsOwner().notifySemanticsChange$ui(this, semanticsConfiguration);
        ownerRequireOwner.onSemanticsChange();
    }

    public final void requestAutofill$ui() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        LayoutNodeKt.requireOwner(this).requestAutofill(this);
    }

    private final IntrinsicsPolicy getOrCreateIntrinsicsPolicy() {
        IntrinsicsPolicy intrinsicsPolicy = this.intrinsicsPolicy;
        if (intrinsicsPolicy != null) {
            return intrinsicsPolicy;
        }
        IntrinsicsPolicy intrinsicsPolicy2 = new IntrinsicsPolicy(this, getMeasurePolicy());
        this.intrinsicsPolicy = intrinsicsPolicy2;
        return intrinsicsPolicy2;
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui() {
        UsageByParent measuredByParent$ui;
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        return (lookaheadPassDelegate$ui == null || (measuredByParent$ui = lookaheadPassDelegate$ui.getMeasuredByParent$ui()) == null) ? UsageByParent.NotUsed : measuredByParent$ui;
    }

    @Override // androidx.compose.ui.semantics.SemanticsInfo
    public SemanticsConfiguration getSemanticsConfiguration() {
        if (isAttached() && !isDeactivated() && this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
            return this._semanticsConfiguration;
        }
        return null;
    }

    public final void invalidateLayer$ui() {
        NodeCoordinator innerLayerCoordinator$ui = getInnerLayerCoordinator$ui();
        if (innerLayerCoordinator$ui != null) {
            innerLayerCoordinator$ui.invalidateLayer();
            return;
        }
        LayoutNode parent$ui = getParent$ui();
        if (parent$ui != null) {
            parent$ui.invalidateLayer$ui();
            return;
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.invalidateRootLayer();
        }
    }

    public final void invalidateMeasurementForSubtree() {
        requestRemeasure$ui$default(this, false, false, false, 7, null);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).invalidateMeasurementForSubtree();
        }
    }

    public final Boolean isPlacedInLookahead() {
        LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
        if (lookaheadPassDelegate$ui != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui.isPlaced$ui());
        }
        return null;
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
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // androidx.compose.ui.node.Owner.OnLayoutCompletedListener
    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui = getInnerCoordinator$ui();
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(4194304);
        boolean zM2560getIncludeSelfInTraversalH91voCI = NodeKindKt.m2560getIncludeSelfInTraversalH91voCI(iM2551constructorimpl);
        Modifier.Node tail = innerCoordinator$ui.getTail();
        if (!zM2560getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui()) == null) {
            return;
        }
        for (Modifier.Node nodeHeadNode = innerCoordinator$ui.headNode(zM2560getIncludeSelfInTraversalH91voCI); nodeHeadNode != null && (nodeHeadNode.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0; nodeHeadNode = nodeHeadNode.getChild$ui()) {
            if ((nodeHeadNode.getKindSet$ui() & iM2551constructorimpl) != 0) {
                ?? Pop = nodeHeadNode;
                ?? oncreatevirtualviewtranslationrequests = 0;
                while (Pop != 0) {
                    if (Pop instanceof LayoutAwareModifierNode) {
                        ((LayoutAwareModifierNode) Pop).onPlaced(getInnerCoordinator$ui());
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

    public final Void rethrowWithComposeStackTrace(Throwable th) throws Throwable {
        getUnboundedGoahg traceContext = getTraceContext();
        if (traceContext == null) {
            throw th;
        }
        getLayoutDirection.read(th, new ah$$ExternalSyntheticLambda0((getRectangleGoahg) traceContext, 16, this));
        throw th;
    }

    public final void removeAt$ui(int i, int i2) {
        if (i2 < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            onChildRemoved((LayoutNode) this._foldedChildren.getVector().write[i3]);
            this._foldedChildren.removeAt(i3);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    /* JADX INFO: renamed from: hitTest-6fMxITs$ui, reason: not valid java name */
    public final void m2447hitTest6fMxITs$ui(long j, HitTestResult hitTestResult, int i, boolean z) {
        getOuterCoordinator$ui().m2533hitTestqzLsGqo(NodeCoordinator.Companion.getPointerInputSource(), NodeCoordinator.m2514fromParentPosition8S9VItk$default(getOuterCoordinator$ui(), j, false, 2, null), hitTestResult, i, z);
    }

    /* JADX INFO: renamed from: hitTestSemantics-6fMxITs$ui, reason: not valid java name */
    public final void m2448hitTestSemantics6fMxITs$ui(long j, HitTestResult hitTestResult, int i, boolean z) {
        getOuterCoordinator$ui().m2533hitTestqzLsGqo(NodeCoordinator.Companion.getSemanticsSource(), NodeCoordinator.m2514fromParentPosition8S9VItk$default(getOuterCoordinator$ui(), j, false, 2, null), hitTestResult, PointerType.Companion.m2153getTouchT8wyACA(), z);
    }

    @Override // o.getAddressStreet
    public void onReuse() {
        RectManager rectManager;
        RectManager rectManager2;
        if (!isAttached()) {
            InlineClassHelperKt.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.onReuse();
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (isDeactivated()) {
            this.isDeactivated = false;
        } else {
            resetModifierState();
        }
        int semanticsId = getSemanticsId();
        Owner owner = this.owner;
        if (owner != null && (rectManager2 = owner.getRectManager()) != null) {
            rectManager2.remove(this);
        }
        setSemanticsId(SemanticsModifierKt.generateSemanticsId());
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.onPreLayoutNodeReused(this, semanticsId);
        }
        this.nodes.markAsAttached();
        this.nodes.runAttachLifecycle();
        if (this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
            invalidateSemantics$ui();
        }
        rescheduleRemeasureOrRelayout$ui(this);
        Owner owner3 = this.owner;
        if (owner3 != null) {
            owner3.onPostLayoutNodeReused(this, semanticsId);
        }
        Owner owner4 = this.owner;
        if (owner4 == null || (rectManager = owner4.getRectManager()) == null) {
            return;
        }
        rectManager.recalculateRectIfDirty(this);
    }

    public final void setGloballyPositionedObservers(int i) {
        LayoutNode parent$ui;
        LayoutNode parent$ui2;
        int i2 = this.globallyPositionedObservers;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (parent$ui2 = getParent$ui()) != null) {
                parent$ui2.setGloballyPositionedObservers(parent$ui2.globallyPositionedObservers + 1);
            }
            if (i == 0 && this.globallyPositionedObservers > 0 && (parent$ui = getParent$ui()) != null) {
                parent$ui.setGloballyPositionedObservers(parent$ui.globallyPositionedObservers - 1);
            }
            this.globallyPositionedObservers = i;
        }
    }

    @Override // androidx.compose.ui.layout.Remeasurement
    public void forceRemeasure() {
        if (this.lookaheadRoot != null) {
            requestLookaheadRemeasure$ui$default(this, false, false, false, 5, null);
        } else {
            requestRemeasure$ui$default(this, false, false, false, 5, null);
        }
        Constraints constraintsM2462getLastConstraintsDWUhwKw = this.layoutDelegate.m2462getLastConstraintsDWUhwKw();
        Owner owner = this.owner;
        if (constraintsM2462getLastConstraintsDWUhwKw != null) {
            if (owner != null) {
                owner.mo2618measureAndLayout0kLqBqw(this, constraintsM2462getLastConstraintsDWUhwKw.m3632unboximpl());
            }
        } else if (owner != null) {
            Owner.measureAndLayout$default(owner, false, 1, null);
        }
    }

    public final void detach$ui() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui = getParent$ui();
            sb.append(parent$ui != null ? debugTreeToString$default(parent$ui, 0, 1, null) : null);
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(sb.toString());
            DrawableTransformation.read();
            return;
        }
        LayoutNode parent$ui2 = getParent$ui();
        if (parent$ui2 != null) {
            parent$ui2.invalidateLayer$ui();
            parent$ui2.invalidateMeasurements$ui();
            MeasurePassDelegate measurePassDelegate$ui = getMeasurePassDelegate$ui();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegate$ui.setMeasuredByParent$ui(usageByParent);
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui != null) {
                lookaheadPassDelegate$ui.setMeasuredByParent$ui(usageByParent);
            }
        }
        this.layoutDelegate.resetAlignmentLines();
        NodeCoordinator wrapped$ui = getInnerCoordinator$ui().getWrapped$ui();
        for (NodeCoordinator outerCoordinator$ui = getOuterCoordinator$ui(); !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{outerCoordinator$ui, wrapped$ui}, getCieXyz.write())).booleanValue() && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped$ui()) {
            outerCoordinator$ui.onLayoutNodeDetach();
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onDetach;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(owner);
        }
        this.nodes.runDetachLifecycle$ui();
        this.ignoreRemeasureRequests = true;
        onCreateVirtualViewTranslationRequests vector = this._foldedChildren.getVector();
        Object[] objArr = vector.write;
        int i = vector.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).detach$ui();
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.markAsDetached$ui();
        owner.onDetach(this);
        owner.getRectManager().remove(this);
        this.owner = null;
        setLookaheadRoot(null);
        this.depth = 0;
        getMeasurePassDelegate$ui().onNodeDetached();
        LookaheadPassDelegate lookaheadPassDelegate$ui2 = getLookaheadPassDelegate$ui();
        if (lookaheadPassDelegate$ui2 != null) {
            lookaheadPassDelegate$ui2.onNodeDetached();
        }
        if (this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().notifySemanticsChange$ui(this, semanticsConfiguration);
            owner.onSemanticsChange();
        }
    }

    public final void attach$ui(Owner owner) {
        LayoutNode layoutNode;
        if (this.owner != null) {
            InlineClassHelperKt.throwIllegalStateException("Cannot attach " + this + " as it already is attached.  Tree: " + debugTreeToString$default(this, 0, 1, null));
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 != null) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{layoutNode2.owner, owner}, getCieXyz.write())).booleanValue()) {
                StringBuilder sb = new StringBuilder("Attaching to a different owner(");
                sb.append(owner);
                sb.append(") than the parent's owner(");
                LayoutNode parent$ui = getParent$ui();
                sb.append(parent$ui != null ? parent$ui.owner : null);
                sb.append("). This tree: ");
                sb.append(debugTreeToString$default(this, 0, 1, null));
                sb.append(" Parent tree: ");
                LayoutNode layoutNode3 = this._foldedParent;
                sb.append(layoutNode3 != null ? debugTreeToString$default(layoutNode3, 0, 1, null) : null);
                InlineClassHelperKt.throwIllegalStateException(sb.toString());
            }
        }
        LayoutNode parent$ui2 = getParent$ui();
        if (parent$ui2 == null) {
            getMeasurePassDelegate$ui().setPlaced$ui(true);
            owner.getRectManager().recalculateRectIfDirty(this);
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui != null) {
                lookaheadPassDelegate$ui.onAttachedToNullParent();
            }
        }
        getOuterCoordinator$ui().setWrappedBy$ui(parent$ui2 != null ? parent$ui2.getInnerCoordinator$ui() : null);
        this.owner = owner;
        this.depth = (parent$ui2 != null ? parent$ui2.depth : -1) + 1;
        Modifier modifier = this.pendingModifier;
        if (modifier != null) {
            applyModifier(modifier);
        }
        this.pendingModifier = null;
        owner.onPreAttach(this);
        if (this.isVirtualLookaheadRoot) {
            setLookaheadRoot(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            setLookaheadRoot(layoutNode);
            if (this.lookaheadRoot == null && this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(Fields.RotationY))) {
                setLookaheadRoot(this);
            }
        }
        if (!isDeactivated()) {
            this.nodes.markAsAttached();
        }
        onCreateVirtualViewTranslationRequests vector = this._foldedChildren.getVector();
        Object[] objArr = vector.write;
        int i = vector.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((LayoutNode) objArr[i2]).attach$ui(owner);
        }
        if (!isDeactivated()) {
            this.nodes.runAttachLifecycle();
        }
        invalidateMeasurements$ui();
        if (parent$ui2 != null) {
            parent$ui2.invalidateMeasurements$ui();
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.onAttach;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(owner);
        }
        this.layoutDelegate.updateParentData();
        if (!isDeactivated() && this.nodes.m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
            invalidateSemantics$ui();
        }
        owner.onPostAttach(this);
    }

    public final void requestLookaheadRemeasure$ui(boolean z, boolean z2, boolean z3) {
        if (this.lookaheadRoot == null) {
            InlineClassHelperKt.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.onRequestMeasure(this, true, z, z2);
        if (z3) {
            LookaheadPassDelegate lookaheadPassDelegate$ui = getLookaheadPassDelegate$ui();
            lookaheadPassDelegate$ui.getClass();
            lookaheadPassDelegate$ui.invalidateIntrinsicsParent(z);
        }
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui$default(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.requestLookaheadRemeasure$ui(z, z2, z3);
    }

    public static /* synthetic */ void requestRemeasure$ui$default(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.requestRemeasure$ui(z, z2, z3);
    }

    public final void move$ui(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this._foldedChildren.add(i > i2 ? i2 + i4 : (i2 + i3) - 2, this._foldedChildren.removeAt(i > i2 ? i + i4 : i));
        }
        onZSortedChildrenInvalidated$ui();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierKt.generateSemanticsId() : i);
    }
}

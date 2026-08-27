package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.OutOfFrameExecutor;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.SubcompositionKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AnchoredDraggableKt;
import o.ContentCaptureEventType;
import o.ContentType_androidKt;
import o.Contentfoundation;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.bufferContentCaptureViewDisappeared;
import o.clearTranslatedText;
import o.component4;
import o.createFromParcel;
import o.detectDragGestures;
import o.drag;
import o.getAddressStreet;
import o.getBirthDateFull;
import o.getBirthDateYear;
import o.getBrush;
import o.getCieXyz;
import o.getCreditCardExpirationDay;
import o.getCreditCardSecurityCode;
import o.getHandlerui;
import o.getOffsetF1C5BW0;
import o.getPostalCode;
import o.instance_delegatelambda0;
import o.isAppSetIdReadingEnabled;
import o.newAutofillId;
import o.onContentCardDismissed;
import o.onCreateVirtualViewTranslationRequests;
import o.onRemeasuredozmzZPI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;
import o.seekAnimationsanimation_core;
import o.setNativeShader;
import o.updateTranslationOnAppeared;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState implements getAddressStreet {
    public static final int $stable = 8;
    private final String NoIntrinsicsMessage;
    private final ApproachMeasureScopeImpl approachMeasureScope;
    private final onRemeasuredozmzZPI approachPrecomposeSlotHandleMap;
    private getBirthDateYear compositionContext;
    private int currentApproachIndex;
    private int currentIndex;
    private final onRemeasuredozmzZPI nodeToNodeState;
    private final onRemeasuredozmzZPI precomposeMap;
    private int precomposedCount;
    private int reusableCount;
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet;
    private final LayoutNode root;
    private final Scope scope;
    private final onRemeasuredozmzZPI slotIdToNode;
    private final onCreateVirtualViewTranslationRequests slotIdsOfCompositionsNeededInApproach;
    private SubcomposeSlotReusePolicy slotReusePolicy;

    public final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {
        private final /* synthetic */ Scope $$delegate_0;

        public ApproachMeasureScopeImpl() {
            this.$$delegate_0 = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.$$delegate_0.getLayoutDirection();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return this.$$delegate_0.isLookingAhead();
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return this.$$delegate_0.layout(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public int mo41roundToPxR2X_6o(long j) {
            return this.$$delegate_0.mo41roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public int mo42roundToPx0680j_4(float f) {
            return this.$$delegate_0.mo42roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.MediaBrowserCompatMediaItem(obj);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.getFoldedChildren$ui().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.approachSubcompose(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) : layoutNode.getChildMeasurables$ui();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public float mo43toDpGaN1DYA(long j) {
            return this.$$delegate_0.mo43toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo44toDpu2uoSUM(float f) {
            return this.$$delegate_0.mo44toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public long mo46toDpSizekrfVVM(long j) {
            return this.$$delegate_0.mo46toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public float mo47toPxR2X_6o(long j) {
            return this.$$delegate_0.mo47toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public float mo48toPx0680j_4(float f) {
            return this.$$delegate_0.mo48toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public long mo49toSizeXkaWNTQ(long j) {
            return this.$$delegate_0.mo49toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public long mo50toSp0xMU5do(float f) {
            return this.$$delegate_0.mo50toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo51toSpkPz2Gy4(float f) {
            return this.$$delegate_0.mo51toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(int i, int i2, Map<AlignmentLine, Integer> map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            return this.$$delegate_0.layout(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public float mo45toDpu2uoSUM(int i) {
            return this.$$delegate_0.mo45toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public long mo52toSpkPz2Gy4(int i) {
            return this.$$delegate_0.mo52toSpkPz2Gy4(i);
        }
    }

    public static final class NodeState {
        private PopulateViewStructure_androidKtpopulate7 activeState;
        private boolean composedWithReusableContentHost;
        private updateTranslationOnAppeared composition;
        private r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 content;
        private boolean forceRecompose;
        private boolean forceReuse;
        private final AnchoredDraggableKt operations;
        private bufferContentCaptureViewDisappeared pausedComposition;
        private Object slotId;

        public final PopulateViewStructure_androidKtpopulate7 getActiveState() {
            return this.activeState;
        }

        public final boolean getComposedWithReusableContentHost() {
            return this.composedWithReusableContentHost;
        }

        public final updateTranslationOnAppeared getComposition() {
            return this.composition;
        }

        public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getContent() {
            return this.content;
        }

        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final AnchoredDraggableKt getOperations() {
            return this.operations;
        }

        public final bufferContentCaptureViewDisappeared getPausedComposition() {
            return this.pausedComposition;
        }

        public final Object getSlotId() {
            return this.slotId;
        }

        public final void setActiveState(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7) {
            this.activeState = populateViewStructure_androidKtpopulate7;
        }

        public final void setComposedWithReusableContentHost(boolean z) {
            this.composedWithReusableContentHost = z;
        }

        public final void setComposition(updateTranslationOnAppeared updatetranslationonappeared) {
            this.composition = updatetranslationonappeared;
        }

        public final void setContent(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            this.content = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }

        public final void setForceRecompose(boolean z) {
            this.forceRecompose = z;
        }

        public final void setForceReuse(boolean z) {
            this.forceReuse = z;
        }

        public final void setPausedComposition(bufferContentCaptureViewDisappeared buffercontentcaptureviewdisappeared) {
            this.pausedComposition = buffercontentcaptureviewdisappeared;
        }

        public final void setSlotId(Object obj) {
            this.slotId = obj;
        }

        public final boolean getActive() {
            return ((Boolean) this.activeState.getValue()).booleanValue();
        }

        public NodeState(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, updateTranslationOnAppeared updatetranslationonappeared) {
            this.slotId = obj;
            this.content = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            this.composition = updatetranslationonappeared;
            this.activeState = CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);
            this.operations = null;
        }

        /* JADX INFO: renamed from: record-Fsph7yY, reason: not valid java name */
        public final void m2236recordFsph7yY(int i) {
            AnchoredDraggableKt anchoredDraggableKt = this.operations;
            if (anchoredDraggableKt == null) {
                return;
            }
            anchoredDraggableKt.IconCompatParcelizer(i);
            if (anchoredDraggableKt.RemoteActionCompatParcelizer >= 50) {
                anchoredDraggableKt.RemoteActionCompatParcelizer(0, 10);
            }
        }

        public final void setActive(boolean z) {
            this.activeState.setValue(Boolean.valueOf(z));
        }

        public /* synthetic */ NodeState(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, updateTranslationOnAppeared updatetranslationonappeared, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, (i & 4) != 0 ? null : updatetranslationonappeared);
        }
    }

    public final class Scope implements SubcomposeMeasureScope {
        private float density;
        private float fontScale;
        private LayoutDirection layoutDirection = LayoutDirection.Rtl;

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.fontScale;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void setDensity(float f) {
            this.density = f;
        }

        public void setFontScale(float f) {
            this.fontScale = f;
        }

        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public Scope() {
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean isLookingAhead() {
            return LayoutNodeSubcompositionsState.this.root.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadLayingOut || LayoutNodeSubcompositionsState.this.root.getLayoutState$ui() == LayoutNode.LayoutState.LookaheadMeasuring;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List<Measurable> subcompose(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return LayoutNodeSubcompositionsState.this.subcompose(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult layout(final int i, final int i2, final Map<AlignmentLine, Integer> map, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
                InlineClassHelperKt.throwIllegalStateException("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
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
                    LookaheadDelegate lookaheadDelegate;
                    if (!this.isLookingAhead() || (lookaheadDelegate = layoutNodeSubcompositionsState.root.getInnerCoordinator$ui().getLookaheadDelegate()) == null) {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(layoutNodeSubcompositionsState.root.getInnerCoordinator$ui().getPlacementScope());
                    } else {
                        r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(lookaheadDelegate.getPlacementScope());
                    }
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyPausedPrecomposition$lambda$0$0$0() {
        return false;
    }

    private final void markActiveNodesAsReused(boolean z) {
        this.precomposedCount = 0;
        this.precomposeMap.IconCompatParcelizer();
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = foldedChildren$ui.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
            int iSerializer2 = isAppSetIdReadingEnabled.serializer();
            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
            for (int i = 0; i < size; i++) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui.get(i);
                    NodeState nodeState = (NodeState) this.nodeToNodeState.MediaBrowserCompatMediaItem(layoutNode);
                    if (nodeState != null && nodeState.getActive()) {
                        resetLayoutState(layoutNode);
                        reuseComposition(nodeState, z);
                        nodeState.setSlotId(SubcomposeLayoutKt.ReusedSlotId);
                    }
                } catch (Throwable th) {
                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    throw th;
                }
            }
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            this.slotIdToNode.IconCompatParcelizer();
        }
        makeSureStateIsConsistent();
    }

    public final void disposeOrReuseStartingFromIndex(int i) {
        boolean z = false;
        this.reusableCount = 0;
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = (foldedChildren$ui.size() - this.precomposedCount) - 1;
        if (i <= size) {
            this.reusableSlotIdsSet.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.reusableSlotIdsSet.add(getSlotIdAtIndex(foldedChildren$ui, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.slotReusePolicy.getSlotsToRetain(this.reusableSlotIdsSet);
            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -676141143);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), -1384483406);
            boolean z2 = false;
            while (size >= i) {
                try {
                    LayoutNode layoutNode = foldedChildren$ui.get(size);
                    Object objMediaBrowserCompatMediaItem = this.nodeToNodeState.MediaBrowserCompatMediaItem(layoutNode);
                    objMediaBrowserCompatMediaItem.getClass();
                    NodeState nodeState = (NodeState) objMediaBrowserCompatMediaItem;
                    Object slotId = nodeState.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState.getActive()) {
                            resetLayoutState(layoutNode);
                            reuseComposition(nodeState, false);
                            if (nodeState.getComposedWithReusableContentHost()) {
                                z2 = true;
                            }
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.IconCompatParcelizer(layoutNode);
                        updateTranslationOnAppeared composition = nodeState.getComposition();
                        if (composition != null) {
                            ((getCreditCardSecurityCode) composition).dispose();
                        }
                        this.root.removeAt$ui(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.IconCompatParcelizer(slotId);
                    size--;
                } catch (Throwable th) {
                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    throw th;
                }
            }
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            if (z2) {
                synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                    relocationOffsetfbGrOKE relocationoffsetfbgroke = getOffsetF1C5BW0.serializer.read;
                    if (relocationoffsetfbgroke != null && relocationoffsetfbgroke.read()) {
                        z = true;
                    }
                }
                if (z) {
                    getOffsetF1C5BW0.read();
                }
            }
        }
        makeSureStateIsConsistent();
    }

    public final getBirthDateYear getCompositionContext() {
        return this.compositionContext;
    }

    public final SubcomposeSlotReusePolicy getSlotReusePolicy() {
        return this.slotReusePolicy;
    }

    @Override // o.getAddressStreet
    public void onDeactivate() {
        markActiveNodesAsReused(true);
    }

    @Override // o.getAddressStreet
    public void onRelease() {
        disposeCurrentNodes();
    }

    @Override // o.getAddressStreet
    public void onReuse() {
        markActiveNodesAsReused(false);
    }

    public final void setCompositionContext(getBirthDateYear getbirthdateyear) {
        this.compositionContext = getbirthdateyear;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Measurable> approachSubcompose(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        if (this.slotIdsOfCompositionsNeededInApproach.read < this.currentApproachIndex) {
            InlineClassHelperKt.throwIllegalArgumentException("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        LayoutNode layoutNode = (LayoutNode) this.slotIdToNode.MediaBrowserCompatMediaItem(obj);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.slotIdsOfCompositionsNeededInApproach;
        int i = oncreatevirtualviewtranslationrequests.read;
        int i2 = this.currentApproachIndex;
        if (i == i2) {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(obj);
        } else {
            oncreatevirtualviewtranslationrequests.write(i2, obj);
        }
        this.currentApproachIndex++;
        boolean zSerializer = this.precomposeMap.serializer(obj);
        if (zSerializer || layoutNode != null) {
            if (!zSerializer && layoutNode != null) {
                move(this.root.getFoldedChildren$ui().indexOf(layoutNode), this.root.getFoldedChildren$ui().size(), 1);
                this.precomposedCount++;
                this.slotIdToNode.IconCompatParcelizer(obj);
                this.precomposeMap.write(obj, layoutNode);
                this.approachPrecomposeSlotHandleMap.write(obj, createPrecomposedSlotHandle(obj));
                if (this.root.isAttached()) {
                    makeSureStateIsConsistent();
                }
            }
            LayoutNode layoutNode2 = (LayoutNode) this.precomposeMap.MediaBrowserCompatMediaItem(obj);
            NodeState nodeState = layoutNode2 != null ? (NodeState) this.nodeToNodeState.MediaBrowserCompatMediaItem(layoutNode2) : null;
            if (nodeState != null && nodeState.getForceRecompose()) {
                subcompose(layoutNode2, obj, false, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            }
            if ((nodeState != null ? nodeState.getPausedComposition() : null) != null) {
                applyPausedPrecomposition(nodeState, true);
            }
        } else {
            this.approachPrecomposeSlotHandleMap.write(obj, precompose(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0));
        }
        LayoutNode layoutNode3 = (LayoutNode) this.precomposeMap.MediaBrowserCompatMediaItem(obj);
        if (layoutNode3 != null) {
            List<MeasurePassDelegate> childDelegates$ui = layoutNode3.getMeasurePassDelegate$ui().getChildDelegates$ui();
            int size = childDelegates$ui.size();
            for (int i3 = 0; i3 < size; i3++) {
                childDelegates$ui.get(i3).markDetachedFromParentLookaheadPass$ui();
            }
            if (childDelegates$ui != null) {
                return childDelegates$ui;
            }
        }
        return instance_delegatelambda0.write;
    }

    private final MeasureResult createMeasureResult(final MeasureResult measureResult, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasureResult.1
            @Override // androidx.compose.ui.layout.MeasureResult
            public Map<AlignmentLine, Integer> getAlignmentLines() {
                return measureResult.getAlignmentLines();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return measureResult.getHeight();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
                return measureResult.getRulers();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return measureResult.getWidth();
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubcomposeLayoutState.PrecomposedSlotHandle createPrecomposedSlotHandle(final Object obj) {
        return !this.root.isAttached() ? new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createPrecomposedSlotHandle.1
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
            }
        } : new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createPrecomposedSlotHandle.2
            private final drag hasPremeasured;

            public final drag getHasPremeasured() {
                return this.hasPremeasured;
            }

            {
                int[] iArr = Contentfoundation.read;
                this.hasPremeasured = new drag();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void dispose() {
                LayoutNodeSubcompositionsState.this.disposePrecomposedSlot(obj);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int getPlaceablesCount() {
                List<LayoutNode> children$ui;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.MediaBrowserCompatMediaItem(obj);
                if (layoutNode == null || (children$ui = layoutNode.getChildren$ui()) == null) {
                    return 0;
                }
                return children$ui.size();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* JADX INFO: renamed from: getSize-YEO4UFw, reason: not valid java name */
            public long mo2237getSizeYEO4UFw(int i) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.MediaBrowserCompatMediaItem(obj);
                if (layoutNode != null && layoutNode.isAttached()) {
                    int size = layoutNode.getChildren$ui().size();
                    if (i < 0 || i >= size) {
                        InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
                    }
                    if (this.hasPremeasured.read(i)) {
                        return IntSize.m3839constructorimpl((((long) layoutNode.getChildren$ui().get(i).getWidth()) << 32) | (((long) layoutNode.getChildren$ui().get(i).getHeight()) & 4294967295L));
                    }
                }
                return IntSize.Companion.m3849getZeroYbymL2g();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            /* JADX INFO: renamed from: premeasure-0kLqBqw, reason: not valid java name */
            public void mo2238premeasure0kLqBqw(int i, long j) {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.MediaBrowserCompatMediaItem(obj);
                if (layoutNode == null || !layoutNode.isAttached()) {
                    return;
                }
                int size = layoutNode.getChildren$ui().size();
                if (i < 0 || i >= size) {
                    InlineClassHelperKt.throwIndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode.isPlaced()) {
                    InlineClassHelperKt.throwIllegalArgumentException("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode2 = LayoutNodeSubcompositionsState.this.root;
                layoutNode2.ignoreRemeasureRequests = true;
                LayoutNodeKt.requireOwner(layoutNode).mo2618measureAndLayout0kLqBqw(layoutNode.getChildren$ui().get(i), j);
                layoutNode2.ignoreRemeasureRequests = false;
                this.hasPremeasured.RemoteActionCompatParcelizer(i);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void traverseDescendants(Object obj2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                NodeChain nodes$ui;
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.MediaBrowserCompatMediaItem(obj);
                Modifier.Node head$ui = (layoutNode == null || (nodes$ui = layoutNode.getNodes$ui()) == null) ? null : nodes$ui.getHead$ui();
                if (head$ui == null || !head$ui.isAttached()) {
                    return;
                }
                TraversableNodeKt.traverseDescendants(head$ui, obj2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }
        };
    }

    private final void deactivateOutOfFrame(final NodeState nodeState, OutOfFrameExecutor outOfFrameExecutor) {
        outOfFrameExecutor.schedule(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.deactivateOutOfFrame.1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2239invoke() {
                updateTranslationOnAppeared composition;
                if (nodeState.getActive() || (composition = nodeState.getComposition()) == null) {
                    return;
                }
                ((getCreditCardSecurityCode) composition).MediaMetadataCompat();
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2239invoke();
                return createFromParcel.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposeUnusedSlotsInApproach() {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.approachPrecomposeSlotHandleMap;
        long[] jArr = onremeasuredozmzzpi.write;
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
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = onremeasuredozmzzpi.IconCompatParcelizer[i4];
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) onremeasuredozmzzpi.MediaMetadataCompat[i4];
                        int i5 = this.slotIdsOfCompositionsNeededInApproach.read(obj);
                        if (i5 < 0 || i5 >= this.currentApproachIndex) {
                            if (i5 >= 0) {
                                this.slotIdsOfCompositionsNeededInApproach.write(i5, SubcomposeLayoutKt.UnspecifiedSlotId);
                            }
                            if (this.precomposeMap.serializer(obj)) {
                                precomposedSlotHandle.dispose();
                            }
                            onremeasuredozmzzpi.write(i4);
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

    private final OutOfFrameExecutor getOutOfFrameExecutor() {
        return LayoutNodeKt.requireOwner(this.root).getOutOfFrameExecutor();
    }

    private final void precompose(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, boolean z) {
        if (this.root.isAttached()) {
            makeSureStateIsConsistent();
            if (this.slotIdToNode.read(obj)) {
                return;
            }
            this.approachPrecomposeSlotHandleMap.IconCompatParcelizer(obj);
            onRemeasuredozmzZPI onremeasuredozmzzpi = this.precomposeMap;
            Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(obj);
            if (objMediaBrowserCompatMediaItem == null) {
                objMediaBrowserCompatMediaItem = takeNodeFromReusables(obj);
                LayoutNode layoutNode = this.root;
                if (objMediaBrowserCompatMediaItem != null) {
                    move(layoutNode.getFoldedChildren$ui().indexOf(objMediaBrowserCompatMediaItem), this.root.getFoldedChildren$ui().size(), 1);
                    this.precomposedCount++;
                } else {
                    objMediaBrowserCompatMediaItem = createNodeAt(layoutNode.getFoldedChildren$ui().size());
                    this.precomposedCount++;
                }
                onremeasuredozmzzpi.write(obj, objMediaBrowserCompatMediaItem);
            }
            subcompose((LayoutNode) objMediaBrowserCompatMediaItem, obj, z, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }
    }

    private final void reuseComposition(NodeState nodeState, boolean z) {
        updateTranslationOnAppeared composition;
        if (z || !nodeState.getComposedWithReusableContentHost()) {
            nodeState.setActiveState(CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE));
        } else {
            nodeState.setActive(false);
        }
        if (nodeState.getPausedComposition() != null) {
            cancelPausedPrecomposition(nodeState);
            return;
        }
        if (z) {
            updateTranslationOnAppeared composition2 = nodeState.getComposition();
            if (composition2 != null) {
                ((getCreditCardSecurityCode) composition2).MediaMetadataCompat();
                return;
            }
            return;
        }
        OutOfFrameExecutor outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            deactivateOutOfFrame(nodeState, outOfFrameExecutor);
        } else {
            if (nodeState.getComposedWithReusableContentHost() || (composition = nodeState.getComposition()) == null) {
                return;
            }
            ((getCreditCardSecurityCode) composition).MediaMetadataCompat();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:7:0x001b->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[EDGE_INSN: B:28:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:7:0x001b->B:17:0x0053], SYNTHETIC] */
    public final void forceRecomposeChildren() {
        if (this.reusableCount != this.root.getFoldedChildren$ui().size()) {
            onRemeasuredozmzZPI onremeasuredozmzzpi = this.nodeToNodeState;
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
                                ((NodeState) objArr[(i << 3) + i3]).setForceRecompose(true);
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
            LayoutNode lookaheadRoot$ui = this.root.getLookaheadRoot$ui();
            LayoutNode layoutNode = this.root;
            if (lookaheadRoot$ui != null) {
                if (layoutNode.getLookaheadMeasurePending$ui()) {
                    return;
                }
                LayoutNode.requestLookaheadRemeasure$ui$default(this.root, false, false, false, 7, null);
            } else {
                if (layoutNode.getMeasurePending$ui()) {
                    return;
                }
                LayoutNode.requestRemeasure$ui$default(this.root, false, false, false, 7, null);
            }
        }
    }

    public final void makeSureStateIsConsistent() {
        int size = this.root.getFoldedChildren$ui().size();
        if (this.nodeToNodeState.serializer != size) {
            InlineClassHelperKt.throwIllegalArgumentException("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.serializer + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.reusableCount) - this.precomposedCount < 0) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(size, "Incorrect state. Total children ", ". Reusable children ");
            sbM.append(this.reusableCount);
            sbM.append(". Precomposed children ");
            sbM.append(this.precomposedCount);
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
        if (this.precomposeMap.serializer == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.serializer);
    }

    public final SubcomposeLayoutState.PausedPrecomposition precomposePaused(final Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        if (!this.root.isAttached()) {
            return new PausedPrecompositionImpl() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precomposePaused.1
                private final boolean isComplete = true;

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public void cancel() {
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public boolean isComplete() {
                    return this.isComplete;
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public boolean resume(getHandlerui gethandlerui) {
                    return true;
                }

                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
                public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
                    return LayoutNodeSubcompositionsState.this.createPrecomposedSlotHandle(obj);
                }
            };
        }
        precompose(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, true);
        return new PausedPrecompositionImpl() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.precomposePaused.2
            private final NodeState getNodeState() {
                LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.precomposeMap.MediaBrowserCompatMediaItem(obj);
                if (layoutNode != null) {
                    return (NodeState) LayoutNodeSubcompositionsState.this.nodeToNodeState.MediaBrowserCompatMediaItem(layoutNode);
                }
                return null;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public SubcomposeLayoutState.PrecomposedSlotHandle apply() {
                NodeState nodeState = getNodeState();
                if (nodeState != null) {
                    LayoutNodeSubcompositionsState.this.applyPausedPrecomposition(nodeState, false);
                }
                return LayoutNodeSubcompositionsState.this.createPrecomposedSlotHandle(obj);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public void cancel() {
                NodeState nodeState = getNodeState();
                if ((nodeState != null ? nodeState.getPausedComposition() : null) != null) {
                    LayoutNodeSubcompositionsState.this.disposePrecomposedSlot(obj);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public boolean isComplete() {
                bufferContentCaptureViewDisappeared pausedComposition;
                NodeState nodeState = getNodeState();
                if (nodeState == null || (pausedComposition = nodeState.getPausedComposition()) == null) {
                    return true;
                }
                return ((PausedCompositionImpl) pausedComposition).MediaBrowserCompatMediaItem();
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PausedPrecomposition
            public boolean resume(getHandlerui gethandlerui) {
                NodeState nodeState = getNodeState();
                bufferContentCaptureViewDisappeared pausedComposition = nodeState != null ? nodeState.getPausedComposition() : null;
                if (pausedComposition == null) {
                    return true;
                }
                PausedCompositionImpl pausedCompositionImpl = (PausedCompositionImpl) pausedComposition;
                if (pausedCompositionImpl.MediaBrowserCompatMediaItem()) {
                    return true;
                }
                Object obj2 = obj;
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
                try {
                    boolean zWrite = pausedCompositionImpl.write(gethandlerui);
                    setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                    return zWrite;
                } catch (Throwable th) {
                    try {
                        if (nodeState.getOperations() != null) {
                            throw new SubcomposeLayoutPausableCompositionException(nodeState.getOperations(), obj2, th);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                        throw th2;
                    }
                }
            }
        };
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        long[] jArr = detectDragGestures.write;
        this.nodeToNodeState = new onRemeasuredozmzZPI();
        this.slotIdToNode = new onRemeasuredozmzZPI();
        this.scope = new Scope();
        this.approachMeasureScope = new ApproachMeasureScopeImpl();
        this.precomposeMap = new onRemeasuredozmzZPI();
        this.reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);
        this.approachPrecomposeSlotHandleMap = new onRemeasuredozmzZPI();
        this.slotIdsOfCompositionsNeededInApproach = new onCreateVirtualViewTranslationRequests(new Object[16]);
        this.NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[LOOP:0: B:5:0x0013->B:17:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[EDGE_INSN: B:21:0x0055->B:18:0x0055 BREAK  A[LOOP:0: B:5:0x0013->B:17:0x0052], SYNTHETIC] */
    private final void disposeCurrentNodes() {
        updateTranslationOnAppeared composition;
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.nodeToNodeState;
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
                        if ((255 & j) < 128 && (composition = ((NodeState) objArr[(i << 3) + i3]).getComposition()) != null) {
                            ((getCreditCardSecurityCode) composition).dispose();
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
        this.root.removeAll$ui();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.IconCompatParcelizer();
        this.slotIdToNode.IconCompatParcelizer();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.IconCompatParcelizer();
        makeSureStateIsConsistent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disposePrecomposedSlot(Object obj) {
        makeSureStateIsConsistent();
        LayoutNode layoutNode = (LayoutNode) this.precomposeMap.IconCompatParcelizer(obj);
        if (layoutNode != null) {
            if (this.precomposedCount <= 0) {
                InlineClassHelperKt.throwIllegalStateException("No pre-composed items to dispose");
            }
            int iIndexOf = this.root.getFoldedChildren$ui().indexOf(layoutNode);
            if (iIndexOf < this.root.getFoldedChildren$ui().size() - this.precomposedCount) {
                InlineClassHelperKt.throwIllegalStateException("Item is not in pre-composed item range");
            }
            this.reusableCount++;
            this.precomposedCount--;
            NodeState nodeState = (NodeState) this.nodeToNodeState.MediaBrowserCompatMediaItem(layoutNode);
            if (nodeState != null) {
                cancelPausedPrecomposition(nodeState);
            }
            int size = (this.root.getFoldedChildren$ui().size() - this.precomposedCount) - this.reusableCount;
            move(iIndexOf, size, 1);
            disposeOrReuseStartingFromIndex(size);
        }
        if (this.slotIdsOfCompositionsNeededInApproach.write(obj)) {
            LayoutNode.requestRemeasure$ui$default(this.root, true, false, false, 6, null);
        }
    }

    private final <T> T ignoreRemeasureRequests(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        T t = (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        layoutNode.ignoreRemeasureRequests = false;
        return t;
    }

    private final void move(int i, int i2, int i3) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.move$ui(i, i2, i3);
        layoutNode.ignoreRemeasureRequests = false;
    }

    private final Object getSlotIdAtIndex(List<LayoutNode> list, int i) {
        Object objMediaBrowserCompatMediaItem = this.nodeToNodeState.MediaBrowserCompatMediaItem(list.get(i));
        objMediaBrowserCompatMediaItem.getClass();
        return ((NodeState) objMediaBrowserCompatMediaItem).getSlotId();
    }

    private final void resetLayoutState(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.NotUsed;
        measurePassDelegate$ui.setMeasuredByParent$ui(usageByParent);
        LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLookaheadPassDelegate$ui();
        if (lookaheadPassDelegate$ui != null) {
            lookaheadPassDelegate$ui.setMeasuredByParent$ui(usageByParent);
        }
    }

    public final MeasurePolicy createMeasurePolicy(final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return new LayoutNode.NoIntrinsicsMeasurePolicy(this.NoIntrinsicsMessage) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState.createMeasurePolicy.1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                LayoutNodeSubcompositionsState.this.scope.setLayoutDirection(measureScope.getLayoutDirection());
                LayoutNodeSubcompositionsState.this.scope.setDensity(measureScope.getDensity());
                LayoutNodeSubcompositionsState.this.scope.setFontScale(measureScope.getFontScale());
                if (measureScope.isLookingAhead() || LayoutNodeSubcompositionsState.this.root.getLookaheadRoot$ui() == null) {
                    LayoutNodeSubcompositionsState.this.currentIndex = 0;
                    final MeasureResult measureResult = (MeasureResult) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(LayoutNodeSubcompositionsState.this.scope, Constraints.m3613boximpl(j));
                    final int i = LayoutNodeSubcompositionsState.this.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        public Map<AlignmentLine, Integer> getAlignmentLines() {
                            return measureResult.getAlignmentLines();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getHeight() {
                            return measureResult.getHeight();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
                            return measureResult.getRulers();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public int getWidth() {
                            return measureResult.getWidth();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void placeChildren() {
                            layoutNodeSubcompositionsState.currentIndex = i;
                            measureResult.placeChildren();
                            if (layoutNodeSubcompositionsState.root.getLookaheadRoot$ui() == null) {
                                LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                                layoutNodeSubcompositionsState2.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState2.currentIndex);
                            }
                        }
                    };
                }
                LayoutNodeSubcompositionsState.this.currentApproachIndex = 0;
                final MeasureResult measureResult2 = (MeasureResult) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(LayoutNodeSubcompositionsState.this.approachMeasureScope, Constraints.m3613boximpl(j));
                final int i2 = LayoutNodeSubcompositionsState.this.currentApproachIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = LayoutNodeSubcompositionsState.this;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    public Map<AlignmentLine, Integer> getAlignmentLines() {
                        return measureResult2.getAlignmentLines();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getHeight() {
                        return measureResult2.getHeight();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRulers() {
                        return measureResult2.getRulers();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public int getWidth() {
                        return measureResult2.getWidth();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void placeChildren() {
                        layoutNodeSubcompositionsState2.currentApproachIndex = i2;
                        measureResult2.placeChildren();
                        layoutNodeSubcompositionsState2.disposeUnusedSlotsInApproach();
                        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState3 = layoutNodeSubcompositionsState2;
                        layoutNodeSubcompositionsState3.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState3.currentIndex);
                    }
                };
            }
        };
    }

    public final void setSlotReusePolicy(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            markActiveNodesAsReused(false);
            LayoutNode.requestRemeasure$ui$default(this.root, false, false, false, 7, null);
        }
    }

    public static /* synthetic */ void move$default(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        layoutNodeSubcompositionsState.move(i, i2, i3);
    }

    private final LayoutNode takeNodeFromReusables(Object obj) {
        int i;
        if (this.reusableCount == 0) {
            return null;
        }
        List<LayoutNode> foldedChildren$ui = this.root.getFoldedChildren$ui();
        int size = foldedChildren$ui.size() - this.precomposedCount;
        int i2 = size - this.reusableCount;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getSlotIdAtIndex(foldedChildren$ui, i4), obj}, getCieXyz.write())).booleanValue()) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (true) {
                if (i3 < i2) {
                    i4 = i3;
                    break;
                }
                Object objMediaBrowserCompatMediaItem = this.nodeToNodeState.MediaBrowserCompatMediaItem(foldedChildren$ui.get(i3));
                objMediaBrowserCompatMediaItem.getClass();
                NodeState nodeState = (NodeState) objMediaBrowserCompatMediaItem;
                if (nodeState.getSlotId() == SubcomposeLayoutKt.ReusedSlotId || this.slotReusePolicy.areCompatible(obj, nodeState.getSlotId())) {
                    nodeState.setSlotId(obj);
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            move(i4, i2, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = foldedChildren$ui.get(i2);
        Object objMediaBrowserCompatMediaItem2 = this.nodeToNodeState.MediaBrowserCompatMediaItem(layoutNode);
        objMediaBrowserCompatMediaItem2.getClass();
        NodeState nodeState2 = (NodeState) objMediaBrowserCompatMediaItem2;
        nodeState2.setActiveState(CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE));
        nodeState2.setForceReuse(true);
        nodeState2.setForceRecompose(true);
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPausedPrecomposition(NodeState nodeState, boolean z) {
        bufferContentCaptureViewDisappeared pausedComposition = nodeState.getPausedComposition();
        if (pausedComposition != null) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
            int iSerializer2 = isAppSetIdReadingEnabled.serializer();
            getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
            try {
                LayoutNode layoutNode = this.root;
                layoutNode.ignoreRemeasureRequests = true;
                if (z) {
                    while (true) {
                        try {
                            PausedCompositionImpl pausedCompositionImpl = (PausedCompositionImpl) pausedComposition;
                            if (pausedCompositionImpl.MediaBrowserCompatMediaItem()) {
                                break;
                            } else {
                                pausedCompositionImpl.write(new seekAnimationsanimation_core(14));
                            }
                        } catch (Throwable th) {
                            AnchoredDraggableKt operations = nodeState.getOperations();
                            if (operations == null) {
                                throw th;
                            }
                            throw new SubcomposeLayoutPausableCompositionException(operations, nodeState.getSlotId(), th);
                        }
                    }
                }
                ((PausedCompositionImpl) pausedComposition).read();
                nodeState.setPausedComposition(null);
                layoutNode.ignoreRemeasureRequests = false;
                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            } catch (Throwable th2) {
                setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                throw th2;
            }
        }
    }

    private final void cancelPausedPrecomposition(NodeState nodeState) {
        bufferContentCaptureViewDisappeared pausedComposition = nodeState.getPausedComposition();
        if (pausedComposition != null) {
            ((PausedCompositionImpl) pausedComposition).serializer();
            nodeState.setPausedComposition(null);
            updateTranslationOnAppeared composition = nodeState.getComposition();
            if (composition != null) {
                ((getCreditCardSecurityCode) composition).dispose();
            }
            nodeState.setComposition(null);
        }
    }

    private final LayoutNode createNodeAt(int i) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.insertAt$ui(i, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    private final void subcompose(LayoutNode layoutNode, final NodeState nodeState, boolean z) {
        if (nodeState.getPausedComposition() != null) {
            InlineClassHelperKt.throwIllegalArgumentException("new subcompose call while paused composition is still active");
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
        try {
            LayoutNode layoutNode2 = this.root;
            layoutNode2.ignoreRemeasureRequests = true;
            updateTranslationOnAppeared composition = nodeState.getComposition();
            getBirthDateYear getbirthdateyear = this.compositionContext;
            if (getbirthdateyear == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("parent composition reference not set");
                throw new KotlinNothingValueException();
            }
            if (composition == null || ((getCreditCardSecurityCode) composition).isDisposed()) {
                composition = z ? SubcompositionKt.createPausableSubcomposition(layoutNode, getbirthdateyear) : SubcompositionKt.createSubcomposition(layoutNode, getbirthdateyear);
            }
            nodeState.setComposition(composition);
            final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 content = nodeState.getContent();
            if (getOutOfFrameExecutor() != null) {
                nodeState.setComposedWithReusableContentHost(false);
            } else {
                nodeState.setComposedWithReusableContentHost(true);
                content = new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$4$1$composable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull, int i) {
                        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                        if (getpostalcode.write(i & 1, (i & 3) != 2)) {
                            boolean active = nodeState.getActive();
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = content;
                            getpostalcode.RemoteActionCompatParcelizer(Boolean.valueOf(active));
                            boolean zWrite = getpostalcode.write(active);
                            if (active) {
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, 0);
                            } else {
                                if (getpostalcode.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != 0) {
                                    getCreditCardExpirationDay.read("No nodes can be emitted before calling deactivateToEndGroup");
                                }
                                if (!getpostalcode.ComponentActivity) {
                                    if (!zWrite) {
                                        getpostalcode.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                                    } else {
                                        component4 component4Var = getpostalcode.createFullyDrawnExecutor;
                                        int i2 = component4Var.RemoteActionCompatParcelizer;
                                        int i3 = component4Var.serializer;
                                        ContentCaptureEventType contentCaptureEventType = getpostalcode.serializer;
                                        contentCaptureEventType.getClass();
                                        contentCaptureEventType.IconCompatParcelizer(false);
                                        contentCaptureEventType.RemoteActionCompatParcelizer.read.write(newAutofillId.write);
                                        ContentType_androidKt.read(getpostalcode.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, i2, i3);
                                        getpostalcode.createFullyDrawnExecutor.MediaMetadataCompat();
                                    }
                                }
                            }
                            if (getpostalcode.addObserverForBackInvokerlambda0 && getpostalcode.createFullyDrawnExecutor.PlaybackStateCompat == getpostalcode.getOnBackPressedInput) {
                                getpostalcode.getOnBackPressedInput = -1;
                                getpostalcode.addObserverForBackInvokerlambda0 = false;
                            }
                            getpostalcode.IconCompatParcelizer(false);
                            return;
                        }
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }
                }, true, 1524156494);
            }
            if (z) {
                composition.getClass();
                if (nodeState.getForceReuse()) {
                    getCreditCardSecurityCode getcreditcardsecuritycode = (getCreditCardSecurityCode) ((clearTranslatedText) composition);
                    getcreditcardsecuritycode.MediaBrowserCompatMediaItem();
                    getcreditcardsecuritycode.MediaSessionCompatResultReceiverWrapper();
                    nodeState.setPausedComposition(getcreditcardsecuritycode.write(true, content));
                } else {
                    getCreditCardSecurityCode getcreditcardsecuritycode2 = (getCreditCardSecurityCode) ((clearTranslatedText) composition);
                    nodeState.setPausedComposition(getcreditcardsecuritycode2.write(getcreditcardsecuritycode2.MediaBrowserCompatMediaItem(), content));
                }
            } else if (nodeState.getForceReuse()) {
                getCreditCardSecurityCode getcreditcardsecuritycode3 = (getCreditCardSecurityCode) composition;
                getcreditcardsecuritycode3.MediaBrowserCompatMediaItem();
                getcreditcardsecuritycode3.MediaSessionCompatResultReceiverWrapper();
                getPostalCode getpostalcode = getcreditcardsecuritycode3.read;
                getpostalcode.getOnBackPressedInput = 0;
                getpostalcode.addObserverForBackInvokerlambda0 = true;
                getcreditcardsecuritycode3.ComponentActivity.read(getcreditcardsecuritycode3, content);
                getpostalcode.MediaMetadataCompat();
            } else {
                ((getCreditCardSecurityCode) composition).setContent(content);
            }
            nodeState.setForceReuse(false);
            layoutNode2.ignoreRemeasureRequests = false;
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
        } catch (Throwable th) {
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
            throw th;
        }
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle precompose(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        precompose(obj, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, false);
        return createPrecomposedSlotHandle(obj);
    }

    private final void subcompose(LayoutNode layoutNode, Object obj, boolean z, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.nodeToNodeState;
        Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(layoutNode);
        if (objMediaBrowserCompatMediaItem == null) {
            objMediaBrowserCompatMediaItem = new NodeState(obj, ComposableSingletons$SubcomposeLayoutKt.INSTANCE.getLambda$641200809$ui(), null, 4, null);
            onremeasuredozmzzpi.write(layoutNode, objMediaBrowserCompatMediaItem);
        }
        NodeState nodeState = (NodeState) objMediaBrowserCompatMediaItem;
        boolean z2 = nodeState.getContent() != r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        if (nodeState.getPausedComposition() != null) {
            if (z2) {
                cancelPausedPrecomposition(nodeState);
            } else if (z) {
                return;
            } else {
                applyPausedPrecomposition(nodeState, true);
            }
        }
        updateTranslationOnAppeared composition = nodeState.getComposition();
        boolean hasInvalidations = composition != null ? ((getCreditCardSecurityCode) composition).getHasInvalidations() : true;
        if (z2 || hasInvalidations || nodeState.getForceRecompose()) {
            nodeState.setContent(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            subcompose(layoutNode, nodeState, z);
            nodeState.setForceRecompose(false);
        }
    }

    public final List<Measurable> subcompose(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        makeSureStateIsConsistent();
        LayoutNode.LayoutState layoutState$ui = this.root.getLayoutState$ui();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.Measuring;
        if (layoutState$ui != layoutState && layoutState$ui != LayoutNode.LayoutState.LayingOut && layoutState$ui != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui != LayoutNode.LayoutState.LookaheadLayingOut) {
            InlineClassHelperKt.throwIllegalStateException("subcompose can only be used inside the measure or layout blocks");
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.slotIdToNode;
        Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(obj);
        if (objMediaBrowserCompatMediaItem == null) {
            objMediaBrowserCompatMediaItem = (LayoutNode) this.precomposeMap.IconCompatParcelizer(obj);
            if (objMediaBrowserCompatMediaItem != null) {
                if (this.precomposedCount <= 0) {
                    InlineClassHelperKt.throwIllegalStateException("Check failed.");
                }
                this.precomposedCount--;
            } else {
                objMediaBrowserCompatMediaItem = takeNodeFromReusables(obj);
                if (objMediaBrowserCompatMediaItem == null) {
                    objMediaBrowserCompatMediaItem = createNodeAt(this.currentIndex);
                }
            }
            onremeasuredozmzzpi.write(obj, objMediaBrowserCompatMediaItem);
        }
        LayoutNode layoutNode = (LayoutNode) objMediaBrowserCompatMediaItem;
        if (onContentCardDismissed.read(this.currentIndex, this.root.getFoldedChildren$ui()) != layoutNode) {
            int iIndexOf = this.root.getFoldedChildren$ui().indexOf(layoutNode);
            if (iIndexOf < this.currentIndex) {
                InlineClassHelperKt.throwIllegalArgumentException("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i = this.currentIndex;
            if (i != iIndexOf) {
                move$default(this, iIndexOf, i, 0, 4, null);
            }
        }
        this.currentIndex++;
        subcompose(layoutNode, obj, false, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        if (layoutState$ui != layoutState && layoutState$ui != LayoutNode.LayoutState.LayingOut) {
            return layoutNode.getChildLookaheadMeasurables$ui();
        }
        return layoutNode.getChildMeasurables$ui();
    }
}

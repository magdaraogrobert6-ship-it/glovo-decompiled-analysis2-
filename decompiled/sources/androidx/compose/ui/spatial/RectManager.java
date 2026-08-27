package androidx.compose.ui.spatial;

import android.os.Trace;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ContentInViewNode;
import o.StretchOverscrollNode;
import o.VerticalScrollableClipShape;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class RectManager {
    public static final int $stable = 8;
    private final MutableRect cachedRect;
    private final ContentInViewNode callbacks;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 dispatchLambda;
    private Object dispatchToken;
    private final ExecuteDelayed executeDelayed;
    private boolean isDirty;
    private boolean isFragmented;
    private boolean isScreenOrWindowDirty;
    private final StretchOverscrollNode layoutNodes;
    private final RectList rects;
    private long scheduledDispatchDeadline;
    private final ThrottledCallbacks throttledCallbacks;

    public static /* synthetic */ void getThrottledCallbacks$ui$annotations() {
    }

    public final RectList getRects() {
        return this.rects;
    }

    public final ThrottledCallbacks getThrottledCallbacks$ui() {
        return this.throttledCallbacks;
    }

    public final void invalidate() {
        this.isDirty = true;
    }

    public final void unregisterOnChangedCallback(Object obj) {
        if ((pauseWebviewIfNecessarylambda10.write(0, obj) ? (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj : null) == null) {
            return;
        }
        this.callbacks.write(obj);
    }

    private final void boundingRectInRoot(NodeCoordinator nodeCoordinator, MutableRect mutableRect) {
        while (nodeCoordinator != null) {
            LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.getOuterCoordinator$ui() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                long jM2838getOffsetFromRectListForBjo55l4 = m2838getOffsetFromRectListForBjo55l4(layoutNode);
                if (!IntOffset.m3800equalsimpl0(jM2838getOffsetFromRectListForBjo55l4, IntOffset.Companion.m3811getMaxnOccac())) {
                    mutableRect.m462translatek4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(jM2838getOffsetFromRectListForBjo55l4))) & 4294967295L) | (((long) Float.floatToRawIntBits(IntOffset.m3801getXimpl(jM2838getOffsetFromRectListForBjo55l4))) << 32)));
                    return;
                }
            }
            OwnedLayer layer = nodeCoordinator.getLayer();
            if (layer != null) {
                float[] fArrMo2608getUnderlyingMatrixsQKQjiQ = layer.mo2608getUnderlyingMatrixsQKQjiQ();
                if (!MatrixKt.m994isIdentity58bKbWc(fArrMo2608getUnderlyingMatrixsQKQjiQ)) {
                    Matrix.m977mapimpl(fArrMo2608getUnderlyingMatrixsQKQjiQ, mutableRect);
                }
            }
            long jMo2467getPositionnOccac = nodeCoordinator.mo2467getPositionnOccac();
            mutableRect.m462translatek4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m3802getYimpl(jMo2467getPositionnOccac))) & 4294967295L) | (((long) Float.floatToRawIntBits(IntOffset.m3801getXimpl(jMo2467getPositionnOccac))) << 32)));
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui();
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01d4  */
    public final FocusTargetModifierNode findFocusableNodeFromRect$ui(int i, int i2, int i3, int i4, int i5) {
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        long j;
        Modifier.Node nodePop;
        boolean z;
        LayoutNode layoutNode3;
        long j2;
        long j3;
        SemanticsInfo semanticsInfoRequireSemanticsInfo;
        LayoutNode layoutNode4 = (LayoutNode) this.layoutNodes.serializer(i5);
        if (layoutNode4 == null) {
            return null;
        }
        FocusTargetNode activeFocusTargetNode = LayoutNodeKt.requireOwner(layoutNode4).getFocusOwner().getActiveFocusTargetNode();
        int semanticsId = (activeFocusTargetNode == null || (semanticsInfoRequireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(activeFocusTargetNode)) == null) ? -1 : semanticsInfoRequireSemanticsInfo.getSemanticsId();
        RectList rectList = this.rects;
        long j4 = i;
        long j5 = i2;
        long j6 = i3;
        long j7 = i4;
        long[] jArr = rectList.items;
        int i6 = rectList.itemsSize;
        int i7 = 0;
        int depth$ui = Integer.MAX_VALUE;
        FocusTargetNode focusTargetNode = null;
        while (i7 < jArr.length - 2 && i7 < i6) {
            int i8 = i6;
            long j8 = jArr[i7 + 2];
            LayoutNode layoutNode5 = layoutNode4;
            boolean z2 = true;
            if ((((int) (j8 >> 61)) & 1) != 0) {
                if (((((((j7 & 4294967295L) | (j6 << 32)) - jArr[i7]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i7 + 1] - ((j5 & 4294967295L) | (j4 << 32))) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    int i9 = ((int) j8) & 33554431;
                    LayoutNode layoutNode6 = (LayoutNode) this.layoutNodes.serializer(i9);
                    if (layoutNode6 != null) {
                        if (semanticsId == i9 && semanticsId != -1) {
                            return null;
                        }
                        if (layoutNode6.getDepth$ui() < depth$ui) {
                            LayoutNode layoutNode7 = layoutNode5;
                            if (isDescendantOf$ui(layoutNode6, layoutNode7)) {
                                NodeChain nodes$ui = layoutNode6.getNodes$ui();
                                int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
                                if ((nodes$ui.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
                                    Modifier.Node head$ui = nodes$ui.getHead$ui();
                                    while (true) {
                                        if (head$ui != null) {
                                            if ((head$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                                                nodePop = head$ui;
                                                while (true) {
                                                    layoutNode = layoutNode7;
                                                    if (nodePop == null) {
                                                        layoutNode2 = layoutNode6;
                                                        j = j6;
                                                        z = true;
                                                    } else if (nodePop instanceof FocusTargetNode) {
                                                        layoutNode2 = layoutNode6;
                                                        j = j6;
                                                    } else {
                                                        if ((nodePop.getKindSet$ui() & iM2551constructorimpl) == 0 || !(nodePop instanceof DelegatingNode)) {
                                                            layoutNode3 = layoutNode6;
                                                            j2 = j6;
                                                        } else {
                                                            Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui();
                                                            layoutNode3 = layoutNode6;
                                                            int i10 = 0;
                                                            while (delegate$ui != null) {
                                                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                                    i10++;
                                                                    j3 = j6;
                                                                    if (i10 == 1) {
                                                                        nodePop = delegate$ui;
                                                                    } else {
                                                                        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests == null ? new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]) : oncreatevirtualviewtranslationrequests;
                                                                        if (nodePop != null) {
                                                                            oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                                            nodePop = null;
                                                                        }
                                                                        oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                                                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests2;
                                                                    }
                                                                } else {
                                                                    j3 = j6;
                                                                }
                                                                delegate$ui = delegate$ui.getChild$ui();
                                                                j6 = j3;
                                                            }
                                                            j2 = j6;
                                                            if (i10 == 1) {
                                                            }
                                                            layoutNode7 = layoutNode;
                                                            layoutNode6 = layoutNode3;
                                                            j6 = j2;
                                                        }
                                                        nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                                                        layoutNode7 = layoutNode;
                                                        layoutNode6 = layoutNode3;
                                                        j6 = j2;
                                                    }
                                                }
                                            } else {
                                                layoutNode = layoutNode7;
                                                layoutNode2 = layoutNode6;
                                                j = j6;
                                                z = z2;
                                            }
                                            if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                                                head$ui = head$ui.getChild$ui();
                                                z2 = z;
                                                layoutNode7 = layoutNode;
                                                layoutNode6 = layoutNode2;
                                                j6 = j;
                                            } else {
                                                nodePop = null;
                                            }
                                        } else {
                                            layoutNode = layoutNode7;
                                            layoutNode2 = layoutNode6;
                                            j = j6;
                                            nodePop = null;
                                        }
                                    }
                                } else {
                                    layoutNode = layoutNode7;
                                    layoutNode2 = layoutNode6;
                                    j = j6;
                                    nodePop = null;
                                }
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) nodePop;
                                i8 = i8;
                                layoutNode5 = layoutNode;
                                if (focusTargetNode2 != null) {
                                    LayoutNode layoutNode8 = layoutNode2;
                                    j6 = j;
                                    j5 = j5;
                                    if (intersects$ui(focusTargetNode2, i, i2, i3, i4)) {
                                        depth$ui = layoutNode8.getDepth$ui();
                                        focusTargetNode = focusTargetNode2;
                                    }
                                } else {
                                    j6 = j;
                                    j5 = j5;
                                }
                            } else {
                                j6 = j6;
                                j5 = j5;
                                i8 = i8;
                                layoutNode5 = layoutNode7;
                            }
                        }
                    }
                }
            }
            i7 += 3;
            layoutNode4 = layoutNode5;
            i6 = i8;
            j6 = j6;
            j5 = j5;
        }
        return focusTargetNode;
    }

    /* JADX INFO: renamed from: getOffsetFromRectListFor-Bjo55l4, reason: not valid java name */
    public final long m2838getOffsetFromRectListForBjo55l4(LayoutNode layoutNode) {
        long topLeft = this.rects.getTopLeft(layoutNode.getSemanticsId());
        if (topLeft == Long.MAX_VALUE) {
            return IntOffset.Companion.m3811getMaxnOccac();
        }
        return IntOffset.m3795constructorimpl((((long) ((int) (topLeft >> 32))) << 32) | (((long) ((int) topLeft)) & 4294967295L));
    }

    public final boolean intersects$ui(DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        NodeCoordinator nodeCoordinatorM2391requireCoordinator64DMado = DelegatableNodeKt.m2391requireCoordinator64DMado(delegatableNode, NodeKind.m2551constructorimpl(Fields.RotationZ));
        LayoutNode layoutNode = nodeCoordinatorM2391requireCoordinator64DMado.getLayoutNode();
        if (nodeCoordinatorM2391requireCoordinator64DMado.equals(layoutNode.getOuterCoordinator$ui())) {
            return true;
        }
        long jMo2220localToRootMKHz9U = layoutNode.getOuterCoordinator$ui().mo2220localToRootMKHz9U(LayoutCoordinates.m2216localPositionOfS_NoaFU$default(layoutNode.getOuterCoordinator$ui(), nodeCoordinatorM2391requireCoordinator64DMado, 0L, false, 6, null));
        long jMo2217getSizeYbymL2g = nodeCoordinatorM2391requireCoordinator64DMado.mo2217getSizeYbymL2g();
        int iRound = Math.round(Float.intBitsToFloat((int) (jMo2220localToRootMKHz9U >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jMo2220localToRootMKHz9U & 4294967295L)));
        return i < ((int) (jMo2217getSizeYbymL2g >> 32)) + iRound && i3 > iRound && i2 < ((int) (jMo2217getSizeYbymL2g & 4294967295L)) + iRound2 && i4 > iRound2;
    }

    public final boolean isTargetDrawnFirst$ui(int i, int i2) {
        LayoutNode parent$ui;
        LayoutNode parent$ui2;
        LayoutNode parent$ui3 = (LayoutNode) this.layoutNodes.serializer(i);
        if (parent$ui3 != null && (parent$ui = (LayoutNode) this.layoutNodes.serializer(i2)) != null && parent$ui3.getDepth$ui() != 0 && parent$ui.getDepth$ui() != 0) {
            while (parent$ui3.getDepth$ui() > parent$ui.getDepth$ui()) {
                parent$ui3 = parent$ui3.getParent$ui();
                if (parent$ui3 == null) {
                    return false;
                }
            }
            if (parent$ui3 == parent$ui) {
                return false;
            }
            while (parent$ui.getDepth$ui() > parent$ui3.getDepth$ui()) {
                parent$ui = parent$ui.getParent$ui();
                if (parent$ui == null) {
                    return false;
                }
            }
            if (parent$ui3 == parent$ui) {
                return false;
            }
            LayoutNode layoutNode = parent$ui;
            LayoutNode layoutNode2 = layoutNode;
            LayoutNode layoutNode3 = parent$ui3;
            while (parent$ui3 != layoutNode) {
                LayoutNode parent$ui4 = parent$ui3.getParent$ui();
                if (parent$ui4 == null || (parent$ui2 = layoutNode.getParent$ui()) == null) {
                    return false;
                }
                layoutNode3 = parent$ui3;
                parent$ui3 = parent$ui4;
                layoutNode2 = layoutNode;
                layoutNode = parent$ui2;
            }
            if (layoutNode3.getMeasurePassDelegate$ui().getZIndex$ui() == layoutNode2.getMeasurePassDelegate$ui().getZIndex$ui()) {
                return layoutNode3.getPlaceOrder$ui() < layoutNode2.getPlaceOrder$ui();
            }
            if (layoutNode3.getMeasurePassDelegate$ui().getZIndex$ui() < layoutNode2.getMeasurePassDelegate$ui().getZIndex$ui()) {
                return true;
            }
        }
        return false;
    }

    public final Object registerOnChangedCallback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.callbacks.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        return r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final DelegatableNode.RegistrationHandle registerOnGlobalLayoutCallback(int i, long j, long j2, DelegatableNode delegatableNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return this.throttledCallbacks.registerOnGlobalChange(i, j, j2, delegatableNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public final void resetOffsets() {
        ThrottledCallbacks throttledCallbacks = this.throttledCallbacks;
        IntOffset.Companion companion = IntOffset.Companion;
        this.isScreenOrWindowDirty = throttledCallbacks.m2857updateOffsetsLDcG7Xg(companion.m3812getZeronOccac(), companion.m3812getZeronOccac(), null, 0, 0);
    }

    public final void scheduleDebounceCallback(boolean z) {
        boolean z2 = (z && this.dispatchToken == null) ? false : true;
        long minDebounceDeadline = this.throttledCallbacks.getMinDebounceDeadline();
        if (minDebounceDeadline >= 0 || !z2) {
            if (this.scheduledDispatchDeadline == minDebounceDeadline && z2) {
                return;
            }
            Object obj = this.dispatchToken;
            if (obj != null) {
                this.executeDelayed.removeDelayedExecution(obj);
            }
            long jCurrentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
            long jMax = Math.max(minDebounceDeadline, 16 + jCurrentTimeMillis);
            this.scheduledDispatchDeadline = jMax;
            this.dispatchToken = this.executeDelayed.executeDelayed(jMax - jCurrentTimeMillis, this.dispatchLambda);
        }
    }

    public final void unsetHasCallbacksFor(LayoutNode layoutNode) {
        this.rects.updateHasCallbacks(layoutNode.getSemanticsId(), false);
    }

    public RectManager(StretchOverscrollNode stretchOverscrollNode, ExecuteDelayed executeDelayed) {
        this.layoutNodes = stretchOverscrollNode;
        this.executeDelayed = executeDelayed;
        this.rects = new RectList();
        this.throttledCallbacks = new ThrottledCallbacks();
        this.callbacks = new ContentInViewNode();
        this.scheduledDispatchDeadline = -1L;
        this.dispatchLambda = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2840invoke() {
                this.this$0.dispatchToken = null;
                RectManager rectManager = this.this$0;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                } finally {
                    Trace.endSection();
                }
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2840invoke();
                return createFromParcel.INSTANCE;
            }
        };
        this.cachedRect = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    private final void insertOrUpdateTransformedNodeSubhierarchy(LayoutNode layoutNode) {
        insertOrUpdateTransformedNode(layoutNode);
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = layoutNode.get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (layoutNode2.isPlaced()) {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode2);
            }
        }
    }

    public final void dispatchCallbacks() {
        removeScheduledCallback();
        long jCurrentTimeMillis = Actual_jvmAndAndroidKt.currentTimeMillis();
        boolean z = this.isDirty;
        boolean z2 = z || this.isScreenOrWindowDirty;
        if (z) {
            this.isDirty = false;
            ContentInViewNode contentInViewNode = this.callbacks;
            Object[] objArr = contentInViewNode.read;
            int i = contentInViewNode.IconCompatParcelizer;
            for (int i2 = 0; i2 < i; i2++) {
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objArr[i2]).invoke();
            }
            RectList rectList = this.rects;
            long[] jArr = rectList.items;
            int i3 = rectList.itemsSize;
            for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
                long j = jArr[i4 + 2];
                if ((((int) (j >> 60)) & 1) != 0) {
                    this.throttledCallbacks.fireOnUpdatedRect(33554431 & ((int) j), jArr[i4], jArr[i4 + 1], jCurrentTimeMillis);
                }
            }
            this.rects.clearUpdated();
        }
        if (this.isScreenOrWindowDirty) {
            this.isScreenOrWindowDirty = false;
            this.throttledCallbacks.fireOnRectChangedEntries(jCurrentTimeMillis);
        }
        if (z2) {
            this.throttledCallbacks.fireGlobalChangeEntries(jCurrentTimeMillis);
        }
        if (this.isFragmented) {
            this.isFragmented = false;
            this.rects.defragment();
        }
        this.throttledCallbacks.triggerDebounced(jCurrentTimeMillis);
        if (this.throttledCallbacks.getMinDebounceDeadline() > 0) {
            scheduleDebounceCallback(true);
        }
    }

    /* JADX INFO: renamed from: outerToInnerOffset-Bjo55l4, reason: not valid java name */
    private final long m2837outerToInnerOffsetBjo55l4(LayoutNode layoutNode) {
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        long jM3812getZeronOccac = IntOffset.Companion.m3812getZeronOccac();
        for (NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui(); innerCoordinator$ui != null && innerCoordinator$ui != outerCoordinator$ui; innerCoordinator$ui = innerCoordinator$ui.getWrappedBy$ui()) {
            if (hasPositionalLayerTransformations(innerCoordinator$ui)) {
                return IntOffset.Companion.m3811getMaxnOccac();
            }
            jM3812getZeronOccac = IntOffset.m3805plusqkQi6aY(jM3812getZeronOccac, innerCoordinator$ui.mo2467getPositionnOccac());
        }
        return jM3812getZeronOccac;
    }

    public final boolean isDescendantOf$ui(LayoutNode layoutNode, LayoutNode layoutNode2) {
        int depth$ui = layoutNode.getDepth$ui() - layoutNode2.getDepth$ui();
        if (depth$ui <= 0) {
            return false;
        }
        for (int i = 0; i < depth$ui; i++) {
            layoutNode = layoutNode.getParent$ui();
            if (layoutNode == null) {
                return false;
            }
        }
        return layoutNode == layoutNode2;
    }

    public final void recalculateRectIfDirty(LayoutNode layoutNode) {
        long jM3811getMaxnOccac;
        if (layoutNode.isPlaced() && layoutNode.getRectInParentDirty$ui()) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if (parent$ui != null && !parent$ui.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                if (parent$ui.getOuterToInnerOffsetDirty$ui()) {
                    parent$ui.setOuterToInnerOffsetDirty$ui(false);
                    parent$ui.m2451setOuterToInnerOffsetgyyYBs$ui(m2837outerToInnerOffsetBjo55l4(parent$ui));
                }
                jM3811getMaxnOccac = parent$ui.m2446getOuterToInnerOffsetnOccac$ui();
            } else if (parent$ui == null) {
                jM3811getMaxnOccac = IntOffset.Companion.m3812getZeronOccac();
            } else {
                jM3811getMaxnOccac = IntOffset.Companion.m3811getMaxnOccac();
            }
            NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
            if (RectManagerKt.m2844isSetgyyYBs(jM3811getMaxnOccac) && !hasPositionalLayerTransformations(outerCoordinator$ui)) {
                if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui()) {
                    long jM3805plusqkQi6aY = IntOffset.m3805plusqkQi6aY(jM3811getMaxnOccac, outerCoordinator$ui.mo2467getPositionnOccac());
                    MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
                    int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
                    int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
                    int semanticsId = layoutNode.getSemanticsId();
                    if (layoutNode.getAddedToRectList$ui()) {
                        RectList rectList = this.rects;
                        if (parent$ui != null) {
                            rectList.moveBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m3801getXimpl(jM3805plusqkQi6aY), IntOffset.m3802getYimpl(jM3805plusqkQi6aY), measuredWidth, measuredHeight);
                        } else {
                            rectList.move(semanticsId, IntOffset.m3801getXimpl(jM3805plusqkQi6aY), IntOffset.m3802getYimpl(jM3805plusqkQi6aY), IntOffset.m3801getXimpl(jM3805plusqkQi6aY) + measuredWidth, IntOffset.m3802getYimpl(jM3805plusqkQi6aY) + measuredHeight);
                        }
                    } else {
                        layoutNode.setAddedToRectList$ui(true);
                        boolean zM2506hasH91voCI$ui = layoutNode.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(Fields.RotationZ));
                        boolean zM2506hasH91voCI$ui2 = layoutNode.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(16));
                        boolean zRemoteActionCompatParcelizer = this.throttledCallbacks.getRectChangedMap().RemoteActionCompatParcelizer(semanticsId);
                        RectList rectList2 = this.rects;
                        if (parent$ui != null) {
                            rectList2.insertBasedOnParentOffset(semanticsId, parent$ui.getSemanticsId(), IntOffset.m3801getXimpl(jM3805plusqkQi6aY), IntOffset.m3802getYimpl(jM3805plusqkQi6aY), measuredWidth, measuredHeight, zM2506hasH91voCI$ui, zM2506hasH91voCI$ui2, zRemoteActionCompatParcelizer);
                        } else {
                            rectList2.insert(semanticsId, IntOffset.m3801getXimpl(jM3805plusqkQi6aY), IntOffset.m3802getYimpl(jM3805plusqkQi6aY), IntOffset.m3801getXimpl(jM3805plusqkQi6aY) + measuredWidth, IntOffset.m3802getYimpl(jM3805plusqkQi6aY) + measuredHeight, (Fields.RotationY & 32) != 0 ? -1 : 0, (Fields.RotationY & 64) != 0 ? false : zM2506hasH91voCI$ui, (Fields.RotationY & Fields.SpotShadowColor) != 0 ? false : zM2506hasH91voCI$ui2, (Fields.RotationY & Fields.RotationX) != 0 ? false : zRemoteActionCompatParcelizer, (Fields.RotationY & Fields.RotationY) != 0 ? -1 : 0);
                        }
                    }
                } else {
                    insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
                    resetHasPositionalLayerTransformationsForSubtreeIfNeeded(layoutNode);
                }
            } else {
                insertOrUpdateTransformedNodeSubhierarchy(layoutNode);
            }
            layoutNode.setRectInParentDirty$ui(false);
            invalidate();
            scheduleDebounceCallback(true);
        }
    }

    public final void removeScheduledCallback() {
        Object obj = this.dispatchToken;
        if (obj != null) {
            this.executeDelayed.removeDelayedExecution(obj);
            this.dispatchToken = null;
        }
    }

    /* JADX INFO: renamed from: updateOffsets-gTq6Wqs, reason: not valid java name */
    public final void m2839updateOffsetsgTq6Wqs(long j, long j2, float[] fArr, int i, int i2) {
        this.isScreenOrWindowDirty = this.throttledCallbacks.m2857updateOffsetsLDcG7Xg(j, j2, (RectManagerKt.m2843analyzeComponents58bKbWc(fArr) & 2) == 0 ? fArr : null, i, i2) || this.isScreenOrWindowDirty;
    }

    private final void insertOrUpdateTransformedNode(LayoutNode layoutNode) {
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(true);
        NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        MeasurePassDelegate measurePassDelegate$ui = layoutNode.getMeasurePassDelegate$ui();
        int measuredWidth = measurePassDelegate$ui.getMeasuredWidth();
        int measuredHeight = measurePassDelegate$ui.getMeasuredHeight();
        MutableRect mutableRect = this.cachedRect;
        mutableRect.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        boundingRectInRoot(outerCoordinator$ui, mutableRect);
        int left = (int) mutableRect.getLeft();
        int top = (int) mutableRect.getTop();
        int right = (int) mutableRect.getRight();
        int bottom = (int) mutableRect.getBottom();
        int semanticsId = layoutNode.getSemanticsId();
        boolean addedToRectList$ui = layoutNode.getAddedToRectList$ui();
        layoutNode.setAddedToRectList$ui(true);
        if (!addedToRectList$ui || !this.rects.update(semanticsId, left, top, right, bottom)) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            this.rects.insert(semanticsId, left, top, right, bottom, (Fields.RotationY & 32) != 0 ? -1 : parent$ui != null ? parent$ui.getSemanticsId() : -1, (Fields.RotationY & 64) != 0 ? false : layoutNode.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(Fields.RotationZ)), (Fields.RotationY & Fields.SpotShadowColor) != 0 ? false : layoutNode.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(16)), (Fields.RotationY & Fields.RotationX) != 0 ? false : this.throttledCallbacks.getRectChangedMap().RemoteActionCompatParcelizer(semanticsId), (Fields.RotationY & Fields.RotationY) != 0 ? -1 : 0);
        }
        layoutNode.setRectInParentDirty$ui(false);
        invalidate();
    }

    private final void resetHasPositionalLayerTransformationsForSubtreeIfNeeded(LayoutNode layoutNode) {
        if (!layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot$ui() || hasPositionalLayerTransformations(layoutNode.getOuterCoordinator$ui())) {
            return;
        }
        layoutNode.setHasPositionalLayerTransformationsInOffsetFromRoot$ui(false);
        if (layoutNode.getOuterToInnerOffsetDirty$ui()) {
            layoutNode.m2451setOuterToInnerOffsetgyyYBs$ui(m2837outerToInnerOffsetBjo55l4(layoutNode));
            layoutNode.setOuterToInnerOffsetDirty$ui(false);
        }
        if (IntOffset.m3800equalsimpl0(layoutNode.m2446getOuterToInnerOffsetnOccac$ui(), IntOffset.Companion.m3811getMaxnOccac())) {
            return;
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = layoutNode.get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            resetHasPositionalLayerTransformationsForSubtreeIfNeeded((LayoutNode) objArr[i2]);
        }
    }

    public final void remove(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList$ui()) {
            this.rects.remove(layoutNode.getSemanticsId());
            layoutNode.setAddedToRectList$ui(false);
            layoutNode.setRectInParentDirty$ui(true);
            invalidate();
            this.isFragmented = true;
        }
    }

    public final void updateFlagsFor(LayoutNode layoutNode, boolean z, boolean z2) {
        if (layoutNode.isAttached()) {
            this.rects.updateFlagsFor(layoutNode.getSemanticsId(), z, z2);
        }
    }

    private final boolean hasPositionalLayerTransformations(NodeCoordinator nodeCoordinator) {
        OwnedLayer layer = nodeCoordinator.getLayer();
        return (layer == null || MatrixKt.m994isIdentity58bKbWc(layer.mo2608getUnderlyingMatrixsQKQjiQ())) ? false : true;
    }

    public final void invalidateCallbacksFor(LayoutNode layoutNode) {
        if (layoutNode.getAddedToRectList$ui()) {
            this.isDirty = true;
            this.rects.markUpdated(layoutNode.getSemanticsId());
        }
        scheduleDebounceCallback(true);
    }

    public final DelegatableNode.RegistrationHandle registerOnRectChangedCallback(int i, long j, long j2, DelegatableNode delegatableNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        DelegatableNode.RegistrationHandle registrationHandleRegisterOnRectChanged = this.throttledCallbacks.registerOnRectChanged(i, j, j2, delegatableNode, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        if (DelegatableNodeKt.requireLayoutNode(delegatableNode.getNode()).getAddedToRectList$ui()) {
            this.rects.updateHasCallbacks(i, true);
        }
        invalidate();
        scheduleDebounceCallback(true);
        return registrationHandleRegisterOnRectChanged;
    }

    public RectManager() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RectManager(StretchOverscrollNode stretchOverscrollNode, ExecuteDelayed executeDelayed, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            stretchOverscrollNode = VerticalScrollableClipShape.IconCompatParcelizer;
            stretchOverscrollNode.getClass();
        }
        this(stretchOverscrollNode, (i & 2) != 0 ? ExecuteDelayUsingPostAndRemove.INSTANCE : executeDelayed);
    }
}

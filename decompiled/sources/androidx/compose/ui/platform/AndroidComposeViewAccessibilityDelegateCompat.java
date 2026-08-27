package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AnchoredDraggableKt;
import o.AnchoredDraggableState;
import o.ContentInViewNodeKt;
import o.Contentfoundation;
import o.ContextMenuScope;
import o.DragGestureNodestartListeningForEvents1;
import o.DrawableTransformation;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNode;
import o.ForEachGestureKt;
import o.IInAppMessageViewWrapper;
import o.IntervalTree;
import o.ScrollNode;
import o.ScrollingLayoutElement;
import o.StretchOverscrollNode;
import o.VerticalScrollableClipShape;
import o.accessanimateTo;
import o.accessprocessDragStart;
import o.accessregisterComponentCallback;
import o.animateToWithDecay;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.createButtonClickListenerslambda0100;
import o.createFromParcel;
import o.createnHHXs2Y;
import o.drag;
import o.getCieXyz;
import o.getFocusRect;
import o.invalidateFocusui;
import o.isInterested;
import o.logUnregisterActivitylambda1;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setVerticalGravity;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements View.OnAttachStateChangeListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int $stable;
    private static final ScrollingLayoutElement AccessibilityActionsResourceIds;
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final int CONTENT_CHANGE_TYPE_CHECKED = 8192;
    public static final String ClassName = "android.view.View";
    public static final Companion Companion;
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    private static int IconCompatParcelizer = 1;
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private static int read;
    private static byte write;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private List<? extends AccessibilityServiceInfo> _enabledServices;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private accessprocessDragStart actionIdToLabel;
    private final logUnregisterActivitylambda1 boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private StretchOverscrollNode currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private FocusRestorerKtsaveFocusedChild11 currentlyAccessibilityFocusedANI;
    private FocusRestorerKtsaveFocusedChild11 currentlyFocusedANI;
    private final accessanimateTo drawingOrder;
    private int focusedVirtualViewId;
    private accessanimateTo idToAfterMap;
    private accessanimateTo idToBeforeMap;
    private accessprocessDragStart labelToActionId;
    private final Handler legacyMainHandler;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private drag paneDisplayed;
    private final animateToWithDecay pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final animateToWithDecay pendingVerticalScrollEvents;
    private animateToWithDecay previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private Boolean requestFromAccessibilityToolForTesting;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final createnHHXs2Y subtreeChangedLayoutNodes;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onSendAccessibilityEvent = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
        }

        {
            super(1);
        }
    };

    public final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int i, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i, focusRestorerKtsaveFocusedChild11, str, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public FocusRestorerKtsaveFocusedChild11 createAccessibilityNodeInfo(int i) {
            FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11CreateNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(i);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (i == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = focusRestorerKtsaveFocusedChild11CreateNodeInfo;
                }
                if (i == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = focusRestorerKtsaveFocusedChild11CreateNodeInfo;
                }
            }
            return focusRestorerKtsaveFocusedChild11CreateNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i, int i2, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i, i2, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public FocusRestorerKtsaveFocusedChild11 findFocus(int i) {
            if (i == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (i == 2) {
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unknown focus type: "));
            return null;
        }
    }

    private static /* synthetic */ void getHandler$annotations() {
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui$annotations() {
    }

    private final boolean isAccessibilityFocused(int i) {
        return this.accessibilityFocusedVirtualViewId == i;
    }

    private final void resetEnabledAccessibilityServiceList() {
        this._enabledServices = null;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final String getExtraDataTestTraversalAfterVal$ui() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui() {
        return this.hoveredVirtualViewId;
    }

    public final accessanimateTo getIdToAfterMap$ui() {
        return this.idToAfterMap;
    }

    public final accessanimateTo getIdToBeforeMap$ui() {
        return this.idToBeforeMap;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnSendAccessibilityEvent$ui() {
        return this.onSendAccessibilityEvent;
    }

    public final Boolean getRequestFromAccessibilityToolForTesting$ui() {
        return this.requestFromAccessibilityToolForTesting;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    public final void onLayoutChange$ui(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler = getHandler();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler.post(this.semanticsChangeChecker);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    public final void setHoveredVirtualViewId$ui(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final void setIdToAfterMap$ui(accessanimateTo accessanimateto) {
        this.idToAfterMap = accessanimateto;
    }

    public final void setIdToBeforeMap$ui(accessanimateTo accessanimateto) {
        this.idToBeforeMap = accessanimateto;
    }

    public final void setOnSendAccessibilityEvent$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onSendAccessibilityEvent = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui(Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }
    }

    /* JADX INFO: renamed from: adjustForReversedScrollingAndRtl-RE3cj74, reason: not valid java name */
    private final long m2682adjustForReversedScrollingAndRtlRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        if (Offset.m474equalsimpl0(j, Offset.Companion.m493getZeroF1C5BW0())) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        SemanticsConfiguration unmergedConfig$ui = semanticsNode2.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getHorizontalScrollAxisRange());
        if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode)) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig$ui(), semanticsProperties.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
            fIntBitsToFloat2 = -fIntBitsToFloat2;
        }
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FocusRestorerKtsaveFocusedChild11 createNodeInfo(int i) {
        if (((accessregisterComponentCallback) this.view.getComposeViewContext().getLifecycleOwner$ui().getLifecycle()).RatingCompat == toColorLong8_81llA.DESTROYED) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().serializer(i);
        if (semanticsNodeWithAdjustedBounds == null) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
        if (zBooleanValue && !isRequestFromAccessibilityTool()) {
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11 = new FocusRestorerKtsaveFocusedChild11(accessibilityNodeInfoObtain);
        if (Build.VERSION.SDK_INT >= 34) {
            IntervalTree.write(accessibilityNodeInfoObtain, zBooleanValue);
        } else {
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(64, zBooleanValue);
        }
        if (i == -1) {
            Object parentForAccessibility = this.view.getParentForAccessibility();
            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer = -1;
            accessibilityNodeInfoObtain.setParent(view);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer numValueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (numValueOf == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + i + " has null parent");
                DrawableTransformation.read();
                return null;
            }
            int iIntValue = numValueOf.intValue();
            int i2 = iIntValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? iIntValue : -1;
            AndroidComposeView androidComposeView = this.view;
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer = i2;
            accessibilityNodeInfoObtain.setParent(androidComposeView, i2);
        }
        AndroidComposeView androidComposeView2 = this.view;
        focusRestorerKtsaveFocusedChild11.IconCompatParcelizer = i;
        accessibilityNodeInfoObtain.setSource(androidComposeView2, i);
        accessibilityNodeInfoObtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i, focusRestorerKtsaveFocusedChild11, semanticsNode);
        return focusRestorerKtsaveFocusedChild11;
    }

    /* JADX INFO: renamed from: createOutline-12SF9DM, reason: not valid java name */
    private final Outline m2684createOutline12SF9DM(Shape shape, long j, LayoutDirection layoutDirection) {
        return shape.mo24createOutlinePq9zytI(j, layoutDirection, this.view.getDensity());
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, 8192);
        if (num != null) {
            accessibilityEventCreateEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventCreateEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventCreateEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventCreateEvent.getText().add(charSequence);
        }
        return accessibilityEventCreateEvent;
    }

    private final FocusRestorerKtsaveFocusedChild11 emptyNodeInfoOrNull() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return new FocusRestorerKtsaveFocusedChild11(AccessibilityNodeInfo.obtain());
    }

    private final Rect getBoundsInScreen(FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        Rect rect = new Rect();
        focusRestorerKtsaveFocusedChild11.write.getBoundsInScreen(rect);
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b A[LOOP:0: B:5:0x0021->B:37:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0090 A[EDGE_INSN: B:50:0x0090->B:38:0x0090 BREAK  A[LOOP:0: B:5:0x0021->B:37:0x008b], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1, androidx.compose.ui.semantics.SemanticsPropertyReceiver] */
    private final androidx.compose.ui.geometry.Rect getShapeBounds(SemanticsNode semanticsNode, Rect rect, final Shape shape) {
        Modifier.Node node;
        ?? r0 = new SemanticsPropertyReceiver() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1
            private boolean hasMatchedShape;

            public final boolean getHasMatchedShape() {
                return this.hasMatchedShape;
            }

            public final void setHasMatchedShape(boolean z) {
                this.hasMatchedShape = z;
            }

            @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
            public <T> void set(SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
                if (t == shape) {
                    this.hasMatchedShape = true;
                }
            }
        };
        LayoutNode layoutNode$ui = semanticsNode.getLayoutNode$ui();
        NodeChain nodes$ui = layoutNode$ui.getNodes$ui();
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(8);
        Object obj = null;
        if ((nodes$ui.getAggregateChildKindSet() & iM2551constructorimpl) != 0) {
            loop0: for (Modifier.Node head$ui = nodes$ui.getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & iM2551constructorimpl) == 0) {
                    if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                        break;
                        break;
                    }
                } else {
                    Modifier.Node nodePop = head$ui;
                    onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                    while (nodePop != null) {
                        if (nodePop instanceof SemanticsModifierNode) {
                            ((SemanticsModifierNode) nodePop).applySemantics(r0);
                            if (r0.getHasMatchedShape()) {
                                obj = nodePop;
                                break loop0;
                            }
                        } else if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        nodePop = delegate$ui;
                                    } else {
                                        if (oncreatevirtualviewtranslationrequests == null) {
                                            oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                        }
                                        if (nodePop != null) {
                                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(nodePop);
                                            nodePop = null;
                                        }
                                        oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
                    }
                    if ((head$ui.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                        break;
                    }
                }
            }
        }
        SemanticsModifierNode semanticsModifierNode = (SemanticsModifierNode) obj;
        if (semanticsModifierNode == null || (node = semanticsModifierNode.getNode()) == null || !node.isAttached()) {
            return LayoutCoordinatesKt.boundsInWindow(layoutNode$ui.getOuterCoordinator$ui(), false);
        }
        LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(semanticsModifierNode);
        androidx.compose.ui.geometry.Rect rectLocalBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinatesRequireLayoutCoordinates).localBoundingBoxOf(layoutCoordinatesRequireLayoutCoordinates, false);
        return toBoundsRelativeToNodeBounds(toBoundsInScreen(rectLocalBoundingBoxOf.getLeft(), rectLocalBoundingBoxOf.getTop(), rectLocalBoundingBoxOf.getRight(), rectLocalBoundingBoxOf.getBottom()), rect);
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isRequestFromAccessibilityTool() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        Object[] objArr = {bool, Boolean.TRUE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        Object[] objArr2 = {bool, Boolean.FALSE};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (Build.VERSION.SDK_INT >= 34) {
            return invalidateFocusui.serializer(accessibilityManager);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.b_(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i) {
        if (i == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a A[LOOP:1: B:15:0x005a->B:28:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[EDGE_INSN: B:44:0x009d->B:29:0x009d BREAK  A[LOOP:1: B:15:0x005a->B:28:0x009a], SYNTHETIC] */
    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        int[] iArr = Contentfoundation.read;
        drag dragVar = new drag();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
            if (getCurrentSemanticsNodes().RemoteActionCompatParcelizer(semanticsNode2.getId())) {
                if (!semanticsNodeCopy.getChildren().read(semanticsNode2.getId())) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui());
                    return;
                }
                dragVar.RemoteActionCompatParcelizer(semanticsNode2.getId());
            }
        }
        drag children = semanticsNodeCopy.getChildren();
        int[] iArr2 = children.RemoteActionCompatParcelizer;
        long[] jArr = children.serializer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && !dragVar.read(iArr2[(i2 << 3) + i4])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        List<SemanticsNode> replacedChildren$ui2 = semanticsNode.getReplacedChildren$ui();
        int size2 = replacedChildren$ui2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui2.get(i5);
            SemanticsNodeCopy semanticsNodeCopy2 = (SemanticsNodeCopy) this.previousSemanticsNodes.serializer(semanticsNode3.getId());
            if (semanticsNodeCopy2 != null && getCurrentSemanticsNodes().RemoteActionCompatParcelizer(semanticsNode3.getId())) {
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final Rect toAndroidRect(androidx.compose.ui.geometry.Rect rect, float f, float f2) {
        return new Rect((int) (rect.getLeft() + f), (int) (rect.getTop() + f2), (int) (rect.getRight() + f), (int) (rect.getBottom() + f2));
    }

    private final Rect toBoundsInScreen(float f, float f2, float f3, float f4) {
        long jMo2155localToScreenMKHz9U = this.view.mo2155localToScreenMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32)));
        long jMo2155localToScreenMKHz9U2 = this.view.mo2155localToScreenMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32)));
        int i = (int) (jMo2155localToScreenMKHz9U >> 32);
        int i2 = (int) (jMo2155localToScreenMKHz9U2 >> 32);
        int i3 = (int) (jMo2155localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (jMo2155localToScreenMKHz9U2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    private final androidx.compose.ui.geometry.Rect toBoundsRelativeToNodeBounds(Rect rect, Rect rect2) {
        float f = rect.left - rect2.left;
        float f2 = rect.top - rect2.top;
        return new androidx.compose.ui.geometry.Rect(f, f2, rect.width() + f, rect.height() + f2);
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), ParcelSafeTextLength);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            resetEnabledAccessibilityServiceList();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final void addPageActions(FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, SemanticsNode semanticsNode) {
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getRole());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                int iM2815getCarouselo7Vup1c = Role.Companion.m2815getCarouselo7Vup1c();
                if (role != null && Role.m2810equalsimpl0(role.m2813unboximpl(), iM2815getCarouselo7Vup1c)) {
                    return;
                }
                SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
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

    static {
        IconCompatParcelizer();
        Companion = new Companion(null);
        $stable = 8;
        int[] iArr = {androidx.compose.ui.R.id.accessibility_custom_action_0, androidx.compose.ui.R.id.accessibility_custom_action_1, androidx.compose.ui.R.id.accessibility_custom_action_2, androidx.compose.ui.R.id.accessibility_custom_action_3, androidx.compose.ui.R.id.accessibility_custom_action_4, androidx.compose.ui.R.id.accessibility_custom_action_5, androidx.compose.ui.R.id.accessibility_custom_action_6, androidx.compose.ui.R.id.accessibility_custom_action_7, androidx.compose.ui.R.id.accessibility_custom_action_8, androidx.compose.ui.R.id.accessibility_custom_action_9, androidx.compose.ui.R.id.accessibility_custom_action_10, androidx.compose.ui.R.id.accessibility_custom_action_11, androidx.compose.ui.R.id.accessibility_custom_action_12, androidx.compose.ui.R.id.accessibility_custom_action_13, androidx.compose.ui.R.id.accessibility_custom_action_14, androidx.compose.ui.R.id.accessibility_custom_action_15, androidx.compose.ui.R.id.accessibility_custom_action_16, androidx.compose.ui.R.id.accessibility_custom_action_17, androidx.compose.ui.R.id.accessibility_custom_action_18, androidx.compose.ui.R.id.accessibility_custom_action_19, androidx.compose.ui.R.id.accessibility_custom_action_20, androidx.compose.ui.R.id.accessibility_custom_action_21, androidx.compose.ui.R.id.accessibility_custom_action_22, androidx.compose.ui.R.id.accessibility_custom_action_23, androidx.compose.ui.R.id.accessibility_custom_action_24, androidx.compose.ui.R.id.accessibility_custom_action_25, androidx.compose.ui.R.id.accessibility_custom_action_26, androidx.compose.ui.R.id.accessibility_custom_action_27, androidx.compose.ui.R.id.accessibility_custom_action_28, androidx.compose.ui.R.id.accessibility_custom_action_29, androidx.compose.ui.R.id.accessibility_custom_action_30, androidx.compose.ui.R.id.accessibility_custom_action_31};
        AnchoredDraggableKt anchoredDraggableKt = ContextMenuScope.write;
        AnchoredDraggableKt anchoredDraggableKt2 = new AnchoredDraggableKt(32);
        int i = anchoredDraggableKt2.RemoteActionCompatParcelizer;
        if (i >= 0) {
            int i2 = i + 32;
            anchoredDraggableKt2.write(i2);
            int[] iArr2 = anchoredDraggableKt2.read;
            int i3 = anchoredDraggableKt2.RemoteActionCompatParcelizer;
            if (i != i3) {
                onContentCardClicked.IconCompatParcelizer(iArr2, i2, iArr2, i, i3);
            }
            onContentCardClicked.read(iArr, i, iArr2, 0, 12);
            anchoredDraggableKt2.RemoteActionCompatParcelizer += 32;
            AccessibilityActionsResourceIds = anchoredDraggableKt2;
            return;
        }
        ForEachGestureKt.serializer("");
        throw null;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.legacyMainHandler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new animateToWithDecay();
        this.pendingVerticalScrollEvents = new animateToWithDecay();
        this.actionIdToLabel = new accessprocessDragStart(0);
        this.labelToActionId = new accessprocessDragStart(0);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new createnHHXs2Y(0);
        this.boundsUpdateChannel = SQLite.IconCompatParcelizer(1, 6, (IInAppMessageViewWrapper) null);
        this.currentSemanticsNodesInvalidated = true;
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        animatetowithdecay.getClass();
        this.currentSemanticsNodes = animatetowithdecay;
        this.paneDisplayed = new drag();
        this.idToBeforeMap = new accessanimateTo();
        this.idToAfterMap = new accessanimateTo();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new animateToWithDecay();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), animatetowithdecay);
        int i = ScrollNode.read;
        this.drawingOrder = new accessanimateTo();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new AbstractComposeView$$ExternalSyntheticLambda0(1, this);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ScrollObservationScope) obj);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }

            public final void invoke(ScrollObservationScope scrollObservationScope) {
                this.this$0.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void setAccessibilityForceEnabledForTesting$ui(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        IntRect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        return toBoundsInScreen(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m3071getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties.getTextSelectionRange())).m3080unboximpl());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui.contains(semanticsProperties.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m3076getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties.getTextSelectionRange())).m3080unboximpl());
    }

    private final List<AccessibilityServiceInfo> getEnabledServices() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    private final Handler getHandler() {
        return AndroidComposeUiFlags.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString annotatedString;
        if (semanticsNode == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) onContentCardDismissed.MediaMetadataCompat(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i) {
        String iterableTextForAccessibility;
        TextLayoutResult textLayoutResult;
        if (semanticsNode == null || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (i == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
            return companion;
        }
        if (i != 2) {
            if (i != 4) {
                if (i == 8) {
                    AccessibilityIterators.ParagraphTextSegmentIterator companion2 = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
                    companion2.initialize(iterableTextForAccessibility);
                    return companion2;
                }
                if (i != 16) {
                    return null;
                }
            }
            if (!semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui())) == null) {
                return null;
            }
            if (i == 4) {
                AccessibilityIterators.LineTextSegmentIterator companion3 = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                companion3.initialize(iterableTextForAccessibility, textLayoutResult);
                return companion3;
            }
            AccessibilityIterators.PageTextSegmentIterator companion4 = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
            companion4.initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
            return companion4;
        }
        AccessibilityIterators.WordTextSegmentIterator companion5 = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
        companion5.initialize(iterableTextForAccessibility);
        return companion5;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig$ui.contains(semanticsProperties.getContentDescription()) && semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getEditableText());
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    private static final float legacyScrollOntoScreen$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.getValue().invoke()).floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return ((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.getValue().invoke()).floatValue() >= ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() || scrollAxisRange.getReverseScrolling()) {
            return ((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    /* JADX INFO: renamed from: scrollDxDyForNodeVisible-RE3cj74, reason: not valid java name */
    private final long m2685scrollDxDyForNodeVisibleRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        androidx.compose.ui.geometry.Rect rectBoundsInParent = LayoutCoordinatesKt.boundsInParent(semanticsNode2.getLayoutInfo().getCoordinates());
        LayoutCoordinates parentLayoutCoordinates = semanticsNode2.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
        androidx.compose.ui.geometry.Rect rectM514translatek4lQ0M = rectBoundsInParent.m514translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.Companion.m493getZeroF1C5BW0());
        androidx.compose.ui.geometry.Rect rectM517Recttz77jQw = RectKt.m517Recttz77jQw(Offset.m482plusMKHz9U(semanticsNode.m2824getPositionInRootF1C5BW0(), j), IntSizeKt.m3856toSizeozmzZPI(semanticsNode.m2827getSizeYbymL2g()));
        return Offset.m469constructorimpl((((long) Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(rectM517Recttz77jQw.getLeft() - rectM514translatek4lQ0M.getLeft(), rectM517Recttz77jQw.getRight() - rectM514translatek4lQ0M.getRight()))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(rectM517Recttz77jQw.getTop() - rectM514translatek4lQ0M.getTop(), rectM517Recttz77jQw.getBottom() - rectM514translatek4lQ0M.getBottom())))));
    }

    private static final float scrollDxDyForNodeVisible_RE3cj74$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    private final boolean sendEventForVirtualView(int i, int i2, Integer num, List<String> list) {
        if (i == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, i2);
        if (num != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventCreateEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(accessibilityEventCreateEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), Fields.RenderEffect);
                accessibilityEventCreateEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i, int i2, boolean z) {
        String iterableTextForAccessibility;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsActions.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui().get(semanticsActions.getSetSelection())).getAction();
            if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry != null) {
                return ((Boolean) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
            return false;
        }
        if ((i == i2 && i2 == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) == null) {
            return false;
        }
        if (i < 0 || i != i2 || i2 > iterableTextForAccessibility.length()) {
            i = -1;
        }
        this.accessibilityCursorPosition = i;
        boolean z2 = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getError())) {
            focusRestorerKtsaveFocusedChild11.write.setContentInvalid(true);
            focusRestorerKtsaveFocusedChild11.write.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getError()));
        }
    }

    private final void setInvisibleIfEmptyBounds(FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, SemanticsNode semanticsNode) {
        if (semanticsNode.getTouchBoundsInRoot().isEmpty()) {
            focusRestorerKtsaveFocusedChild11.write.setVisibleToUser(false);
        }
    }

    private final RectF toScreenCoords(SemanticsNode semanticsNode, androidx.compose.ui.geometry.Rect rect) {
        if (semanticsNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect rectM514translatek4lQ0M = rect.m514translatek4lQ0M(semanticsNode.m2824getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect rectIntersect = rectM514translatek4lQ0M.overlaps(boundsInRoot) ? rectM514translatek4lQ0M.intersect(boundsInRoot) : null;
        if (rectIntersect == null) {
            return null;
        }
        long jMo2155localToScreenMKHz9U = this.view.mo2155localToScreenMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(rectIntersect.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(rectIntersect.getLeft())) << 32)));
        long jMo2155localToScreenMKHz9U2 = this.view.mo2155localToScreenMKHz9U(Offset.m469constructorimpl((((long) Float.floatToRawIntBits(rectIntersect.getRight())) << 32) | (((long) Float.floatToRawIntBits(rectIntersect.getBottom())) & 4294967295L)));
        int i = (int) (jMo2155localToScreenMKHz9U >> 32);
        int i2 = (int) (jMo2155localToScreenMKHz9U2 >> 32);
        int i3 = (int) (jMo2155localToScreenMKHz9U & 4294967295L);
        int i4 = (int) (jMo2155localToScreenMKHz9U2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i, boolean z, boolean z2) {
        int accessibilitySelectionStart;
        int i2;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        boolean z3 = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(semanticsNode, i);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
            }
            int[] iArrFollowing = z ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (iArrFollowing == null) {
                return false;
            }
            int i3 = iArrFollowing[0];
            z3 = true;
            int i4 = iArrFollowing[1];
            if (z2 && isAccessibilitySelectionExtendable(semanticsNode)) {
                accessibilitySelectionStart = getAccessibilitySelectionStart(semanticsNode);
                if (accessibilitySelectionStart == -1) {
                    accessibilitySelectionStart = z ? i3 : i4;
                }
                i2 = z ? i4 : i3;
            } else {
                accessibilitySelectionStart = z ? i4 : i3;
                i2 = accessibilitySelectionStart;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, z ? Fields.RotationX : Fields.RotationY, i, i3, i4, SystemClock.uptimeMillis());
            setAccessibilitySelection(semanticsNode, accessibilitySelectionStart, i2, true);
        }
        return z3;
    }

    private final <T extends CharSequence> T trimToSize(T t, int i) {
        if (i > 0) {
            if (t == null || t.length() == 0 || t.length() <= i) {
                return t;
            }
            int i2 = i - 1;
            if (Character.isHighSurrogate(t.charAt(i2)) && Character.isLowSurrogate(t.charAt(i))) {
                i = i2;
            }
            T t2 = (T) t.subSequence(0, i);
            t2.getClass();
            return t2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("size should be greater than 0");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x009b A[LOOP:0: B:5:0x001b->B:27:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x00a4 A[EDGE_INSN: B:86:0x00a4->B:28:0x00a4 BREAK  A[LOOP:0: B:5:0x001b->B:27:0x009b], SYNTHETIC] */
    private final void updateSemanticsNodesCopyAndPanes() {
        long[] jArr;
        long[] jArr2;
        int i;
        int iNumberOfTrailingZeros;
        SemanticsConfiguration unmergedConfig;
        drag dragVar = new drag();
        drag dragVar2 = this.paneDisplayed;
        int[] iArr = dragVar2.RemoteActionCompatParcelizer;
        long[] jArr3 = dragVar2.serializer;
        int length = jArr3.length - 2;
        int i2 = 8;
        char c = 7;
        long j = -9187201950435737472L;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((((~j2) << 7) & j2 & j) != j) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j2 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().serializer(i6);
                            String str = null;
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode == null || !semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                dragVar.RemoteActionCompatParcelizer(i6);
                                SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.serializer(i6);
                                if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                                    str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
                                }
                                sendPaneChangeEvents(i6, 32, str);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                    j = -9187201950435737472L;
                } else if (i3 != length) {
                    break;
                    break;
                } else {
                    i3++;
                    j = -9187201950435737472L;
                }
            }
        }
        drag dragVar3 = this.paneDisplayed;
        dragVar3.getClass();
        int[] iArr2 = dragVar.RemoteActionCompatParcelizer;
        long[] jArr4 = dragVar.serializer;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j3 = jArr4[i7];
                if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j3 & 255) < 128) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = dragVar3.IconCompatParcelizer;
                            int i13 = (i11 >>> 7) & i12;
                            int i14 = 0;
                            while (true) {
                                long[] jArr5 = dragVar3.serializer;
                                int i15 = i13 >> 3;
                                int i16 = (i13 & 7) << 3;
                                jArr2 = jArr4;
                                long j4 = (jArr5[i15] >>> i16) | (((-i16) >> 63) & (jArr5[i15 + 1] << (64 - i16)));
                                long j5 = (((long) (i11 & 127)) * 72340172838076673L) ^ j4;
                                for (long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                                    iNumberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j6) >> 3)) & i12;
                                    if (dragVar3.RemoteActionCompatParcelizer[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                }
                                if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                } else {
                                    i14 += 8;
                                    i13 = (i13 + i14) & i12;
                                    jArr4 = jArr2;
                                }
                            }
                            int i17 = iNumberOfTrailingZeros;
                            if (i17 >= 0) {
                                dragVar3.MediaDescriptionCompat(i17);
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr4;
                            i = i2;
                        }
                        j3 >>= i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
                c = 7;
            }
        }
        this.previousSemanticsNodes.RemoteActionCompatParcelizer();
        StretchOverscrollNode currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.serializer;
        Object[] objArr = currentSemanticsNodes.IconCompatParcelizer;
        long[] jArr6 = currentSemanticsNodes.RemoteActionCompatParcelizer;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i18 = 0;
            while (true) {
                long j7 = jArr6[i18];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length3)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j7 & 255) < 128) {
                            int i21 = (i18 << 3) + i20;
                            int i22 = iArr3[i21];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i21];
                            SemanticsConfiguration unmergedConfig$ui = semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig$ui();
                            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                            if (unmergedConfig$ui.contains(semanticsProperties.getPaneTitle()) && this.paneDisplayed.RemoteActionCompatParcelizer(i22)) {
                                sendPaneChangeEvents(i22, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig$ui().get(semanticsProperties.getPaneTitle()));
                            }
                            this.previousSemanticsNodes.IconCompatParcelizer(i22, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j7 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                }
                if (i18 == length3) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX INFO: renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m2686canScroll0AR0LA0$ui(boolean z, int i, long j) {
        Object[] objArr = {Looper.getMainLooper().getThread(), Thread.currentThread()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return m2683canScrollmoWRBKg(getCurrentSemanticsNodes(), z, i, j);
        }
        return false;
    }

    public final boolean isEnabled$ui() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !getEnabledServices().isEmpty();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler = getHandler();
        handler.getClass();
        handler.removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final void addSetProgressAction(FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    private final AccessibilityEvent createEvent(int i, int i2) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, i);
        if (isEnabled$ui() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().serializer(i)) != null) {
            SemanticsConfiguration unmergedConfig$ui = semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            accessibilityEventObtain.setPassword(unmergedConfig$ui.contains(semanticsProperties.getPassword()));
            createButtonClickListenerslambda0100.IconCompatParcelizer(accessibilityEventObtain, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui(), semanticsProperties.getIsSensitiveData()), Boolean.TRUE}, getCieXyz.write())).booleanValue());
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StretchOverscrollNode getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Boolean invoke(SemanticsNode semanticsNode) {
                    return Boolean.valueOf(SemanticsNode_androidKt.isAccessibilityIgnoredLink(semanticsNode));
                }
            });
            if (isEnabled$ui()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        if (f >= 0.0f || ((Number) scrollAxisRange.getValue().invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue();
        }
        return true;
    }

    private final void updateHoveredVirtualView(int i) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.hoveredVirtualViewId = i;
        sendEventForVirtualView$default(this, i, Fields.SpotShadowColor, null, null, 12, null);
        sendEventForVirtualView$default(this, i2, Fields.RotationX, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:13:0x002e, B:22:0x0054, B:26:0x0064, B:28:0x006c, B:30:0x0075, B:32:0x007c, B:33:0x008d, B:36:0x009a, B:37:0x00a1, B:18:0x0042, B:21:0x0049), top: B:45:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:13:0x002e, B:22:0x0054, B:26:0x0064, B:28:0x006c, B:30:0x0075, B:32:0x007c, B:33:0x008d, B:36:0x009a, B:37:0x00a1, B:18:0x0042, B:21:0x0049), top: B:45:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[Catch: all -> 0x00c7, LOOP:0: B:31:0x007a->B:32:0x007c, LOOP_END, TryCatch #0 {all -> 0x00c7, blocks: (B:13:0x002e, B:22:0x0054, B:26:0x0064, B:28:0x006c, B:30:0x0075, B:32:0x007c, B:33:0x008d, B:36:0x009a, B:37:0x00a1, B:18:0x0042, B:21:0x0049), top: B:45:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bc, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6, r0) == r1) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bc -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui(o.ShortNewsContentCardView<? super o.createFromParcel> r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui(o.ShortNewsContentCardView):java.lang.Object");
    }

    public final int hitTestSemanticsAt$ui(float f, float f2) {
        int iSemanticsNodeIdToAccessibilityVirtualNodeId;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m2443hitTestSemantics6fMxITs$ui$default(this.view.getRoot(), Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32)), hitTestResult, 0, false, 12, null);
        int size = hitTestResult.size() - 1;
        while (true) {
            iSemanticsNodeIdToAccessibilityVirtualNodeId = Integer.MIN_VALUE;
            if (-1 >= size) {
                break;
            }
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(size));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (layoutNodeRequireLayoutNode.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
                iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode.getSemanticsId());
                SemanticsNode SemanticsNode = SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false);
                if (SemanticsOwnerKt.isImportantForAccessibility(SemanticsNode) && !SemanticsNode_androidKt.isAccessibilityIgnoredLink(SemanticsNode)) {
                    break;
                }
            }
            size--;
        }
        return iSemanticsNodeIdToAccessibilityVirtualNodeId;
    }

    private final void sendPaneChangeEvents(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventCreateEvent.getText().add(str);
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    private final void setText(SemanticsNode semanticsNode, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        AnnotatedString infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(semanticsNode);
        focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(infoText != null ? toSpannableString(infoText) : null);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0019 -> B:8:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x001a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @o.onItemDismisslambda0
    private final boolean legacyScrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode r10) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.legacyScrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            OwnerSnapshotObserver snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.observer.serializer(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2687invoke() {
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode$ui;
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.getValue().invoke()).floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.getValue().invoke()).floatValue() - oldYValue.floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.getSemanticsNodeId());
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().serializer(this.accessibilityFocusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11 = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                                if (focusRestorerKtsaveFocusedChild11 != null) {
                                    focusRestorerKtsaveFocusedChild11.write.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                                }
                            } catch (IllegalStateException unused) {
                            }
                        }
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().serializer(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds2 != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            try {
                                FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild12 = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                                if (focusRestorerKtsaveFocusedChild12 != null) {
                                    focusRestorerKtsaveFocusedChild12.write.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds2));
                                }
                            } catch (IllegalStateException unused2) {
                            }
                        }
                        this.getView().invalidate();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().serializer(iSemanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode$ui = semanticsNode.getLayoutNode$ui()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                            if (horizontalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents.IconCompatParcelizer(iSemanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents.IconCompatParcelizer(iSemanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.setOldXValue((Float) horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.setOldYValue((Float) verticalScrollAxisRange.getValue().invoke());
                    }
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2687invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0019 -> B:8:0x001a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x001a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private final boolean scrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, drag dragVar) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode layoutNodeFindClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes$ui().m2506hasH91voCI$ui(NodeKind.m2551constructorimpl(8)));
                    }
                });
            }
            if (layoutNode == null || (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) == null) {
                return;
            }
            if (!semanticsConfiguration.isMergingSemanticsOfDescendants() && (layoutNodeFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents.1
                /* JADX WARN: Code duplicated, block: B:7:0x000e  */
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final Boolean invoke(LayoutNode layoutNode2) {
                    boolean z;
                    SemanticsConfiguration semanticsConfiguration2 = layoutNode2.getSemanticsConfiguration();
                    if (semanticsConfiguration2 != null) {
                        z = semanticsConfiguration2.isMergingSemanticsOfDescendants();
                    }
                    return Boolean.valueOf(z);
                }
            })) != null) {
                layoutNode = layoutNodeFindClosestParentNode;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (dragVar.RemoteActionCompatParcelizer(semanticsId)) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), Fields.CameraDistance, 1, null, 8, null);
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.pendingHorizontalScrollEvents.serializer(semanticsId);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.pendingVerticalScrollEvents.serializer(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsId, Fields.TransformOrigin);
            if (scrollAxisRange != null) {
                accessibilityEventCreateEvent.setScrollX((int) ((Number) scrollAxisRange.getValue().invoke()).floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue());
            }
            if (scrollAxisRange2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) ((Number) scrollAxisRange2.getValue().invoke()).floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) ((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue());
            }
            sendEvent(accessibilityEventCreateEvent);
        }
    }

    private final Region toRegion(Outline outline, float f, float f2) {
        if (!(outline instanceof Outline.Generic)) {
            return null;
        }
        Outline.Generic generic = (Outline.Generic) outline;
        Region region = new Region(toAndroidRect$default(this, generic.getBounds().translate(f, f2), 0.0f, 0.0f, 3, null));
        Region region2 = new Region();
        Path path = generic.getPath();
        if (!(path instanceof AndroidPath)) {
            IBraze$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
            return null;
        }
        android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
        internalPath.offset(f, f2);
        region2.setPath(internalPath, region);
        return region2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX INFO: renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m2683canScrollmoWRBKg(StretchOverscrollNode stretchOverscrollNode, boolean z, int i, long j) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        if (Offset.m474equalsimpl0(j, Offset.Companion.m492getUnspecifiedF1C5BW0()) || (((androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask & j) + androidx.compose.ui.geometry.InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else if (!z) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        Object[] objArr = stretchOverscrollNode.IconCompatParcelizer;
        long[] jArr = stretchOverscrollNode.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((j2 & 255) < 128) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4];
                        if (IntRectKt.toRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m503containsk4lQ0M(j) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui(), horizontalScrollAxisRange)) != null) {
                            int i5 = scrollAxisRange.getReverseScrolling() ? -i : i;
                            if (!(i == 0 && scrollAxisRange.getReverseScrolling()) && i5 >= 0) {
                                if (((Number) scrollAxisRange.getValue().invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue()) {
                                    z2 = true;
                                }
                            } else if (((Number) scrollAxisRange.getValue().invoke()).floatValue() > 0.0f) {
                                z2 = true;
                            }
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return z2;
                }
            }
            if (i2 == length) {
                return z2;
            }
            i2++;
        }
    }

    private final boolean clearAccessibilityFocus(int i) {
        if (!isAccessibilityFocused(i)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        return true;
    }

    private final boolean requestAccessibilityFocus(int i) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i)) {
            return false;
        }
        int i2 = this.accessibilityFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = i;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i, Fields.CompositingStrategy, null, null, 12, null);
        return true;
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final float[] toCornerArray(Outline outline) {
        if (!(outline instanceof Outline.Rounded)) {
            return null;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        return new float[]{Float.intBitsToFloat((int) (rounded.getRoundRect().m527getTopLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m527getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m528getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m528getTopRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m526getBottomRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m526getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (rounded.getRoundRect().m525getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (4294967295L & rounded.getRoundRect().m525getBottomLeftCornerRadiuskKHJgLs()))};
    }

    public final boolean dispatchHoverEvent$ui(MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui = hitTestSemanticsAt$ui(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui);
            if (iHitTestSemanticsAt$ui == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    public final boolean performActionHelper(int i, int i2, Bundle bundle) {
        SemanticsNode semanticsNode;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        float f;
        float steps;
        float fIntBitsToFloat;
        AccessibilityAction accessibilityAction;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        float fIntBitsToFloat2;
        AccessibilityAction accessibilityAction2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k10;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        AccessibilityAction accessibilityAction3;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k11;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k12;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k13;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k14;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k15;
        CharSequence charSequence;
        List list;
        Float fValueOf = Float.valueOf(0.0f);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().serializer(i);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui, semanticsProperties.getIsSensitiveData());
        Boolean bool = Boolean.TRUE;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{orNull, bool}, getCieXyz.write())).booleanValue() && !isRequestFromAccessibilityTool()) {
            return false;
        }
        if (i2 == 64) {
            return requestAccessibilityFocus(i);
        }
        if (i2 == 128) {
            return clearAccessibilityFocus(i);
        }
        if (i2 == 256 || i2 == 512) {
            if (bundle == null) {
                return false;
            }
            return traverseAtGranularity(semanticsNode, bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), i2 == 256, bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
        }
        if (i2 == 16384) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction4 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction4.getAction()) == null) {
                return false;
            }
            return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke()).booleanValue();
        }
        if (i2 != 131072) {
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                return false;
            }
            if (i2 == 1) {
                if (this.view.isInTouchMode()) {
                    this.view.requestFocusFromTouch();
                }
                AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getRequestFocus());
                if (accessibilityAction5 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction5.getAction()) == null) {
                    return false;
                }
                return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()).booleanValue();
            }
            int i3 = 2;
            if (i2 == 2) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getFocused()), bool}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                this.view.getFocusOwner().mo366clearFocusI7lrPNg(false, true, true, FocusDirection.Companion.m355getExitdhqQ8s());
                return true;
            }
            Boolean bool2 = 0;
            bool2 = 0;
            switch (i2) {
                case 16:
                    AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnClick());
                    if (accessibilityAction6 != null && (r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction6.getAction()) != null) {
                        bool2 = (Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k4.invoke();
                    }
                    sendEventForVirtualView$default(this, i, 1, null, null, 12, null);
                    if (bool2 != 0) {
                        return bool2.booleanValue();
                    }
                    return false;
                case 32:
                    AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnLongClick());
                    if (accessibilityAction7 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction7.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k5.invoke()).booleanValue();
                case Fields.TransformOrigin /* 4096 */:
                case 8192:
                    break;
                case Fields.CompositingStrategy /* 32768 */:
                    AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPasteText());
                    if (accessibilityAction8 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction8.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k6.invoke()).booleanValue();
                case 65536:
                    AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCutText());
                    if (accessibilityAction9 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction9.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k7.invoke()).booleanValue();
                case Fields.ColorFilter /* 262144 */:
                    AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getExpand());
                    if (accessibilityAction10 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction10.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k8.invoke()).booleanValue();
                case Fields.BlendMode /* 524288 */:
                    AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCollapse());
                    if (accessibilityAction11 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k9 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction11.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k9.invoke()).booleanValue();
                case 1048576:
                    AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getDismiss());
                    if (accessibilityAction12 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k10 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction12.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k10.invoke()).booleanValue();
                case 2097152:
                    String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                    AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetText());
                    if (accessibilityAction13 == null || (r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction13.getAction()) == null) {
                        return false;
                    }
                    if (string == null) {
                        string = "";
                    }
                    return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new AnnotatedString(string, bool2, i3, bool2))).booleanValue();
                case R.id.accessibilityActionShowOnScreen:
                    if (AndroidComposeUiFlags.isAccessibilityShowOnScreenNestedScrollingEnabled) {
                        return scrollOntoScreen(semanticsNode);
                    }
                    return legacyScrollOntoScreen(semanticsNode);
                case R.id.accessibilityActionSetProgress:
                    if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress())) == null || (r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction3.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                case R.id.accessibilityActionImeEnter:
                    AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnImeAction());
                    if (accessibilityAction14 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k11 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction14.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k11.invoke()).booleanValue();
                default:
                    switch (i2) {
                        case R.id.accessibilityActionScrollUp:
                        case R.id.accessibilityActionScrollLeft:
                        case R.id.accessibilityActionScrollDown:
                        case R.id.accessibilityActionScrollRight:
                            break;
                        default:
                            switch (i2) {
                                case R.id.accessibilityActionPageUp:
                                    AccessibilityAction accessibilityAction15 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageUp());
                                    if (accessibilityAction15 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k12 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction15.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k12.invoke()).booleanValue();
                                case R.id.accessibilityActionPageDown:
                                    AccessibilityAction accessibilityAction16 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageDown());
                                    if (accessibilityAction16 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k13 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction16.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k13.invoke()).booleanValue();
                                case R.id.accessibilityActionPageLeft:
                                    AccessibilityAction accessibilityAction17 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageLeft());
                                    if (accessibilityAction17 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k14 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction17.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k14.invoke()).booleanValue();
                                case R.id.accessibilityActionPageRight:
                                    AccessibilityAction accessibilityAction18 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageRight());
                                    if (accessibilityAction18 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k15 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction18.getAction()) == null) {
                                        return false;
                                    }
                                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k15.invoke()).booleanValue();
                                default:
                                    accessprocessDragStart accessprocessdragstart = this.actionIdToLabel;
                                    accessprocessdragstart.getClass();
                                    accessprocessDragStart accessprocessdragstart2 = (accessprocessDragStart) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i);
                                    if (accessprocessdragstart2 == null || (charSequence = (CharSequence) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart2, i2)) == null || (list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCustomActions())) == null) {
                                        return false;
                                    }
                                    int size = list.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i4);
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{customAccessibilityAction.getLabel(), charSequence}, getCieXyz.write())).booleanValue()) {
                                            return ((Boolean) customAccessibilityAction.getAction().invoke()).booleanValue();
                                        }
                                    }
                                    return false;
                            }
                    }
                    break;
            }
            boolean z = i2 == 4096;
            boolean z2 = i2 == 8192;
            boolean z3 = i2 == 16908345;
            boolean z4 = i2 == 16908347;
            boolean z5 = i2 == 16908344;
            boolean z6 = i2 == 16908346;
            boolean z7 = z3 || z4 || z || z2;
            boolean z8 = z5 || z6 || z || z2;
            if (z || z2) {
                ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getProgressBarRangeInfo());
                AccessibilityAction accessibilityAction19 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress());
                if (progressBarRangeInfo != null && accessibilityAction19 != null) {
                    float fFloatValue = ((Number) progressBarRangeInfo.getRange().IconCompatParcelizer()).floatValue();
                    float fFloatValue2 = ((Number) progressBarRangeInfo.getRange().RemoteActionCompatParcelizer()).floatValue();
                    if (fFloatValue < fFloatValue2) {
                        fFloatValue = fFloatValue2;
                    }
                    float fFloatValue3 = ((Number) progressBarRangeInfo.getRange().RemoteActionCompatParcelizer()).floatValue();
                    float fFloatValue4 = ((Number) progressBarRangeInfo.getRange().IconCompatParcelizer()).floatValue();
                    if (fFloatValue3 > fFloatValue4) {
                        fFloatValue3 = fFloatValue4;
                    }
                    if (progressBarRangeInfo.getSteps() > 0) {
                        f = fFloatValue - fFloatValue3;
                        steps = progressBarRangeInfo.getSteps() + 1;
                    } else {
                        f = fFloatValue - fFloatValue3;
                        steps = 20.0f;
                    }
                    float f2 = f / steps;
                    if (z2) {
                        f2 = -f2;
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) accessibilityAction19.getAction();
                    if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 != null) {
                        return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm3.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f2))).booleanValue();
                    }
                    return false;
                }
            }
            long jM510getSizeNHjbRc = LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m510getSizeNHjbRc();
            Float scrollViewportLength = SemanticsUtils_androidKt.getScrollViewportLength(semanticsNode.getUnmergedConfig$ui());
            SemanticsConfiguration unmergedConfig$ui2 = semanticsNode.getUnmergedConfig$ui();
            SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
            AccessibilityAction accessibilityAction20 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui2, semanticsActions.getScrollBy());
            if (accessibilityAction20 == null) {
                return false;
            }
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getHorizontalScrollAxisRange());
            if (scrollAxisRange != null && z7) {
                if (scrollViewportLength != null) {
                    fIntBitsToFloat2 = scrollViewportLength.floatValue();
                } else {
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM510getSizeNHjbRc >> 32));
                }
                if (z3 || z2) {
                    fIntBitsToFloat2 = -fIntBitsToFloat2;
                }
                if (scrollAxisRange.getReverseScrolling()) {
                    fIntBitsToFloat2 = -fIntBitsToFloat2;
                }
                if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode) && (z3 || z4)) {
                    fIntBitsToFloat2 = -fIntBitsToFloat2;
                }
                if (performActionHelper$canScroll(scrollAxisRange, fIntBitsToFloat2)) {
                    if (!semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageLeft()) && !semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageRight())) {
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) accessibilityAction20.getAction();
                        if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 != null) {
                            return ((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(Float.valueOf(fIntBitsToFloat2), fValueOf)).booleanValue();
                        }
                        return false;
                    }
                    if (fIntBitsToFloat2 > 0.0f) {
                        accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageRight());
                    } else {
                        accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageLeft());
                    }
                    if (accessibilityAction2 == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction2.getAction()) == null) {
                        return false;
                    }
                    return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k3.invoke()).booleanValue();
                }
            }
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getVerticalScrollAxisRange());
            if (scrollAxisRange2 == null || !z8) {
                return false;
            }
            if (scrollViewportLength != null) {
                fIntBitsToFloat = scrollViewportLength.floatValue();
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM510getSizeNHjbRc));
            }
            if (z5 || z2) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (scrollAxisRange2.getReverseScrolling()) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (!performActionHelper$canScroll(scrollAxisRange2, fIntBitsToFloat)) {
                return false;
            }
            if (!semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageUp()) && !semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getPageDown())) {
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) accessibilityAction20.getAction();
                if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 != null) {
                    return ((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.invoke(fValueOf, Float.valueOf(fIntBitsToFloat))).booleanValue();
                }
                return false;
            }
            if (fIntBitsToFloat > 0.0f) {
                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageDown());
            } else {
                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPageUp());
            }
            if (accessibilityAction == null || (r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) accessibilityAction.getAction()) == null) {
                return false;
            }
            return ((Boolean) r8lambdardpfsr94j4iebcwx_kpqzpm8k2.invoke()).booleanValue();
        }
        boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
        if (accessibilitySelection) {
            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
        }
        return accessibilitySelection;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x07e2 A[PHI: r2
  0x07e2: PHI (r2v24 boolean) = (r2v23 boolean), (r2v23 boolean), (r2v27 boolean) binds: [B:172:0x07cc, B:174:0x07dc, B:169:0x07c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:178:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:195:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:32:0x011f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:36:0x0154  */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final void sendSemanticsPropertyChangeEvents(o.StretchOverscrollNode r59) {
        /*
            Method dump skipped, instruction units count: 2367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(o.StretchOverscrollNode):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        int i2;
        float[] cornerArray;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().serializer(i);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, this.ExtraDataTestTraversalBeforeVal}, getCieXyz.write())).booleanValue()) {
            int iSerializer = this.idToBeforeMap.serializer(i);
            if (iSerializer != -1) {
                focusRestorerKtsaveFocusedChild11.write.getExtras().putInt(str, iSerializer);
                return;
            }
            return;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, this.ExtraDataTestTraversalAfterVal}, getCieXyz.write())).booleanValue()) {
            int iSerializer2 = this.idToAfterMap.serializer(i);
            if (iSerializer2 != -1) {
                focusRestorerKtsaveFocusedChild11.write.getExtras().putInt(str, iSerializer2);
                return;
            }
            return;
        }
        int i3 = 0;
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"}, getCieXyz.write())).booleanValue()) {
                int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                int i5 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                if (i5 > 0 && i4 >= 0) {
                    if (i4 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui());
                        if (textLayoutResult == null) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < i5; i6++) {
                            int i7 = i4 + i6;
                            if (i7 >= textLayoutResult.getLayoutInput().getText().length()) {
                                arrayList.add(null);
                            } else {
                                arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i7)));
                            }
                        }
                        focusRestorerKtsaveFocusedChild11.write.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                        return;
                    }
                }
                SentryLogcatAdapter.serializer(LogTag, "Invalid arguments for accessibility character locations");
                return;
            }
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getTestTag()) && bundle != null) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ExtraDataTestTagKey}, getCieXyz.write())).booleanValue()) {
                String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getTestTag());
                if (str2 != null) {
                    focusRestorerKtsaveFocusedChild11.write.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ExtraDataIdKey}, getCieXyz.write())).booleanValue()) {
            focusRestorerKtsaveFocusedChild11.write.getExtras().putInt(str, semanticsNode.getId());
            return;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ExtraDataShapeTypeKey}, getCieXyz.write())).booleanValue()) {
            Shape shape = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape != null) {
                androidx.compose.ui.geometry.Rect shapeBounds = getShapeBounds(semanticsNode, getBoundsInScreen(focusRestorerKtsaveFocusedChild11), shape);
                Outline outlineM2684createOutline12SF9DM = m2684createOutline12SF9DM(shape, shapeBounds.m510getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection());
                if (outlineM2684createOutline12SF9DM instanceof Outline.Rectangle) {
                    focusRestorerKtsaveFocusedChild11.write.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    focusRestorerKtsaveFocusedChild11.write.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(outlineM2684createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    return;
                }
                if (outlineM2684createOutline12SF9DM instanceof Outline.Rounded) {
                    AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
                    accessibilityNodeInfo.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    accessibilityNodeInfo.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(outlineM2684createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    accessibilityNodeInfo.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, toCornerArray(outlineM2684createOutline12SF9DM));
                    return;
                }
                if (outlineM2684createOutline12SF9DM instanceof Outline.Generic) {
                    focusRestorerKtsaveFocusedChild11.write.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                    focusRestorerKtsaveFocusedChild11.write.getExtras().putParcelable(ExtraDataShapeRegionKey, toRegion(outlineM2684createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
            }
            return;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ExtraDataShapeRectKey}, getCieXyz.write())).booleanValue()) {
            Shape shape2 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape2 != null) {
                androidx.compose.ui.geometry.Rect shapeBounds2 = getShapeBounds(semanticsNode, getBoundsInScreen(focusRestorerKtsaveFocusedChild11), shape2);
                Rect androidRect = toAndroidRect(m2684createOutline12SF9DM(shape2, shapeBounds2.m510getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds2.getLeft(), shapeBounds2.getTop());
                if (androidRect != null) {
                    focusRestorerKtsaveFocusedChild11.write.getExtras().putParcelable(ExtraDataShapeRectKey, androidRect);
                    return;
                }
                return;
            }
            return;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ExtraDataShapeRectCornersKey}, getCieXyz.write())).booleanValue()) {
            Shape shape3 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape3 == null || (cornerArray = toCornerArray(m2684createOutline12SF9DM(shape3, getShapeBounds(semanticsNode, getBoundsInScreen(focusRestorerKtsaveFocusedChild11), shape3).m510getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()))) == null) {
                return;
            }
            focusRestorerKtsaveFocusedChild11.write.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, cornerArray);
            return;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, ExtraDataShapeRegionKey}, getCieXyz.write())).booleanValue()) {
            Shape shape4 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getShape());
            if (shape4 != null) {
                androidx.compose.ui.geometry.Rect shapeBounds3 = getShapeBounds(semanticsNode, getBoundsInScreen(focusRestorerKtsaveFocusedChild11), shape4);
                Region region = toRegion(m2684createOutline12SF9DM(shape4, shapeBounds3.m510getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds3.getLeft(), shapeBounds3.getTop());
                if (region != null) {
                    focusRestorerKtsaveFocusedChild11.write.getExtras().putParcelable(ExtraDataShapeRegionKey, region);
                    return;
                }
                return;
            }
            return;
        }
        awaitTouchSlopOrCancellationjO51t88 accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig$ui().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui == null) {
            return;
        }
        Object[] objArr = accessibilityExtraKeys$ui.RemoteActionCompatParcelizer;
        long[] jArr = accessibilityExtraKeys$ui.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j = jArr[i8];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = i3;
                while (i11 < i10) {
                    if ((255 & j) < 128) {
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i8 << 3) + i11];
                        String accessibilityExtraKey$ui = semanticsPropertyKey.getAccessibilityExtraKey$ui();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{accessibilityExtraKey$ui, str}, getCieXyz.write())).booleanValue()) {
                            Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsPropertyKey);
                            if (orNull instanceof Serializable) {
                                focusRestorerKtsaveFocusedChild11.write.getExtras().putSerializable(accessibilityExtraKey$ui, (Serializable) orNull);
                            } else if (orNull instanceof Parcelable) {
                                focusRestorerKtsaveFocusedChild11.write.getExtras().putParcelable(accessibilityExtraKey$ui, (Parcelable) orNull);
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("Accessibility extra values must be either Serializable or Parcelable.");
                                return;
                            }
                        }
                        i2 = 8;
                    } else {
                        i2 = i9;
                    }
                    j >>= i2;
                    i11++;
                    i9 = i2;
                }
                if (i10 != i9) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            }
            i8++;
            i3 = 0;
        }
    }

    private final boolean registerScrollingId(int i, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(list, i);
        if (scrollObservationScopeFindById != null) {
            z = false;
        } else {
            scrollObservationScopeFindById = new ScrollObservationScope(i, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    public static /* synthetic */ Rect toAndroidRect$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, androidx.compose.ui.geometry.Rect rect, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.toAndroidRect(rect, f, f2);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ write);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    private final Rect toAndroidRect(Outline outline, float f, float f2) {
        if ((outline instanceof Outline.Rectangle) || (outline instanceof Outline.Rounded)) {
            return toAndroidRect(outline.getBounds(), f, f2);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x04df  */
    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:253:0x071e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0720 A[LOOP:2: B:242:0x06da->B:254:0x0720, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:255:0x0726  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:402:0x0728 A[EDGE_INSN: B:402:0x0728->B:256:0x0728 BREAK  A[LOOP:2: B:242:0x06da->B:254:0x0720], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0131  */
    private final void populateAccessibilityNodeInfoProperties(int i, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11, SemanticsNode semanticsNode) {
        String str;
        boolean z;
        Resources resources;
        View viewSemanticsIdToView;
        String accessibilityExtraKey$ui;
        boolean z2;
        SemanticsNode parent;
        boolean zBooleanValue;
        SemanticsNode semanticsNode2;
        SemanticsConfiguration config;
        Role.Companion companion;
        String strM2783toLegacyClassNameV4PA4sw;
        String string;
        String string2;
        int i2;
        int i3 = 2 % 2;
        Resources resources2 = this.view.getContext().getResources();
        focusRestorerKtsaveFocusedChild11.read(ClassName);
        AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui.contains(semanticsProperties.getEditableText())) {
            focusRestorerKtsaveFocusedChild11.read(TextFieldClassName);
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getText())) {
            focusRestorerKtsaveFocusedChild11.read(TextClassName);
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties.getRole());
        Object obj = null;
        if (role != null) {
            role.m2813unboximpl();
            if (semanticsNode.isFake$ui()) {
                companion = Role.Companion;
                if (Role.m2810equalsimpl0(role.m2813unboximpl(), companion.m2821getTabo7Vup1c())) {
                    string2 = resources2.getString(androidx.compose.ui.R.string.tab);
                    if (string2.startsWith("%('")) {
                        i2 = read + 37;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            Object[] objArr = new Object[1];
                            a(string2.substring(3), objArr);
                            ((String) objArr[0]).intern();
                            throw null;
                        }
                        Object[] objArr2 = new Object[1];
                        a(string2.substring(3), objArr2);
                        string2 = ((String) objArr2[0]).intern();
                    }
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string2);
                } else if (Role.m2810equalsimpl0(role.m2813unboximpl(), companion.m2820getSwitcho7Vup1c())) {
                    string = resources2.getString(androidx.compose.ui.R.string.switch_role);
                    if (string.startsWith("%('")) {
                        Object[] objArr3 = new Object[1];
                        a(string.substring(3), objArr3);
                        string = ((String) objArr3[0]).intern();
                    }
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string);
                } else {
                    strM2783toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m2783toLegacyClassNameV4PA4sw(role.m2813unboximpl());
                    if (Role.m2810equalsimpl0(role.m2813unboximpl(), companion.m2818getImageo7Vup1c())) {
                        focusRestorerKtsaveFocusedChild11.read(strM2783toLegacyClassNameV4PA4sw);
                    } else {
                        focusRestorerKtsaveFocusedChild11.read(strM2783toLegacyClassNameV4PA4sw);
                    }
                }
            } else {
                int i4 = read + 89;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    semanticsNode.getReplacedChildren$ui().isEmpty();
                    obj.hashCode();
                    throw null;
                }
                if (semanticsNode.getReplacedChildren$ui().isEmpty()) {
                    companion = Role.Companion;
                    if (Role.m2810equalsimpl0(role.m2813unboximpl(), companion.m2821getTabo7Vup1c())) {
                        string2 = resources2.getString(androidx.compose.ui.R.string.tab);
                        if (string2.startsWith("%('")) {
                            i2 = read + 37;
                            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                Object[] objArr4 = new Object[1];
                                a(string2.substring(3), objArr4);
                                ((String) objArr4[0]).intern();
                                throw null;
                            }
                            Object[] objArr5 = new Object[1];
                            a(string2.substring(3), objArr5);
                            string2 = ((String) objArr5[0]).intern();
                        }
                        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string2);
                    } else if (Role.m2810equalsimpl0(role.m2813unboximpl(), companion.m2820getSwitcho7Vup1c())) {
                        string = resources2.getString(androidx.compose.ui.R.string.switch_role);
                        if (string.startsWith("%('")) {
                            Object[] objArr6 = new Object[1];
                            a(string.substring(3), objArr6);
                            string = ((String) objArr6[0]).intern();
                        }
                        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string);
                    } else {
                        strM2783toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m2783toLegacyClassNameV4PA4sw(role.m2813unboximpl());
                        if (Role.m2810equalsimpl0(role.m2813unboximpl(), companion.m2818getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui() || semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants()) {
                            focusRestorerKtsaveFocusedChild11.read(strM2783toLegacyClassNameV4PA4sw);
                        }
                    }
                }
            }
        }
        accessibilityNodeInfo.setPackageName(this.view.getContext().getPackageName());
        accessibilityNodeInfo.setImportantForAccessibility(SemanticsOwnerKt.isImportantForAccessibility(semanticsNode));
        boolean zIsRequestFromAccessibilityTool = isRequestFromAccessibilityTool();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui.get(i6);
            if (getCurrentSemanticsNodes().RemoteActionCompatParcelizer(semanticsNode3.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(semanticsNode3.getLayoutNode$ui());
                if (semanticsNode3.getId() != -1) {
                    if (androidViewHolder != null) {
                        accessibilityNodeInfo.addChild(androidViewHolder);
                    } else {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().serializer(semanticsNode3.getId());
                        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode2 = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null || (config = semanticsNode2.getConfig()) == null) {
                            zBooleanValue = false;
                        } else {
                            int i7 = read + 41;
                            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                            if (i7 % 2 == 0) {
                                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getIsSensitiveData()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                        }
                        if (zIsRequestFromAccessibilityTool || !zBooleanValue) {
                            accessibilityNodeInfo.addChild(this.view, semanticsNode3.getId());
                        }
                    }
                    this.drawingOrder.IconCompatParcelizer(semanticsNode3.getId(), i5);
                    i5++;
                } else {
                    continue;
                }
            }
        }
        if (i == this.accessibilityFocusedVirtualViewId) {
            accessibilityNodeInfo.setAccessibilityFocused(true);
            focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.write);
        } else {
            accessibilityNodeInfo.setAccessibilityFocused(false);
            focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.IconCompatParcelizer);
        }
        setText(semanticsNode, focusRestorerKtsaveFocusedChild11);
        setContentInvalid(semanticsNode, focusRestorerKtsaveFocusedChild11);
        String infoStateDescriptionOrNull = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoStateDescriptionOrNull(semanticsNode, resources2);
        if (Build.VERSION.SDK_INT >= 30) {
            getFocusRect.read(accessibilityNodeInfo, infoStateDescriptionOrNull);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", infoStateDescriptionOrNull);
        }
        accessibilityNodeInfo.setCheckable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoIsCheckable(semanticsNode));
        SemanticsConfiguration unmergedConfig$ui2 = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui2, semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                accessibilityNodeInfo.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                accessibilityNodeInfo.setChecked(false);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            int iM2821getTabo7Vup1c = Role.Companion.m2821getTabo7Vup1c();
            if (role != null && Role.m2810equalsimpl0(role.m2813unboximpl(), iM2821getTabo7Vup1c)) {
                accessibilityNodeInfo.setSelected(zBooleanValue2);
            } else {
                accessibilityNodeInfo.setChecked(zBooleanValue2);
            }
        }
        if (!semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties2.getContentDescription());
            if (list != null) {
                int i8 = IconCompatParcelizer + 95;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                str = (String) onContentCardDismissed.MediaMetadataCompat(list);
            } else {
                str = null;
            }
            accessibilityNodeInfo.setContentDescription(str);
        }
        String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties2.getTestTag());
        if (str2 != null) {
            for (SemanticsNode parent2 = semanticsNode; parent2 != null; parent2 = parent2.getParent()) {
                SemanticsConfiguration unmergedConfig$ui3 = parent2.getUnmergedConfig$ui();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig$ui3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    if (!((Boolean) parent2.getUnmergedConfig$ui().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue()) {
                        break;
                    }
                    accessibilityNodeInfo.setViewIdResourceName(str2);
                    break;
                }
            }
        }
        SemanticsConfiguration unmergedConfig$ui4 = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((createFromParcel) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui4, semanticsProperties3.getHeading())) != null) {
            accessibilityNodeInfo.setHeading(true);
        }
        if (((createFromParcel) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getTextEntryKey())) != null) {
            focusRestorerKtsaveFocusedChild11.read();
        }
        if (i != -1) {
            int iSerializer = this.drawingOrder.serializer(semanticsNode.getId());
            if (iSerializer != -1) {
                accessibilityNodeInfo.setDrawingOrder(iSerializer);
            } else {
                SentryLogcatAdapter.IconCompatParcelizer(LogTag, "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
            }
        }
        accessibilityNodeInfo.setPassword(semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getPassword()));
        Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getIsEditable());
        Boolean bool2 = Boolean.TRUE;
        accessibilityNodeInfo.setEditable(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{orNull, bool2}, getCieXyz.write())).booleanValue());
        Integer num = (Integer) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getMaxTextLength());
        accessibilityNodeInfo.setMaxTextLength(num != null ? num.intValue() : -1);
        accessibilityNodeInfo.setEnabled(AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode));
        accessibilityNodeInfo.setFocusable(semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getFocused()));
        if (accessibilityNodeInfo.isFocusable()) {
            accessibilityNodeInfo.setFocused(((Boolean) semanticsNode.getUnmergedConfig$ui().get(semanticsProperties3.getFocused())).booleanValue());
            if (accessibilityNodeInfo.isFocused()) {
                focusRestorerKtsaveFocusedChild11.write(2);
                this.focusedVirtualViewId = i;
                z = true;
            } else {
                z = true;
                focusRestorerKtsaveFocusedChild11.write(1);
            }
        } else {
            z = true;
        }
        accessibilityNodeInfo.setVisibleToUser(SemanticsOwnerKt.isHidden(semanticsNode) ^ z);
        if (ComposeUiFlags.isAccessibilityShouldIncludeOffscreenChildrenEnabled) {
            if (semanticsNode.isFake$ui()) {
                parent = semanticsNode.getParent();
                parent.getClass();
            } else {
                parent = semanticsNode;
            }
            setInvisibleIfEmptyBounds(focusRestorerKtsaveFocusedChild11, parent);
        }
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int iM2804unboximpl = liveRegionMode.m2804unboximpl();
            LiveRegionMode.Companion companion2 = LiveRegionMode.Companion;
            accessibilityNodeInfo.setLiveRegion((!LiveRegionMode.m2801equalsimpl0(iM2804unboximpl, companion2.m2806getPolite0phEisY()) && LiveRegionMode.m2801equalsimpl0(iM2804unboximpl, companion2.m2805getAssertive0phEisY())) ? 2 : 1);
        }
        accessibilityNodeInfo.setClickable(false);
        SemanticsConfiguration unmergedConfig$ui5 = semanticsNode.getUnmergedConfig$ui();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean zBooleanValue3 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getSelected()), bool2}, getCieXyz.write())).booleanValue();
            Role.Companion companion3 = Role.Companion;
            int iM2821getTabo7Vup1c2 = companion3.m2821getTabo7Vup1c();
            if (role != null && Role.m2810equalsimpl0(role.m2813unboximpl(), iM2821getTabo7Vup1c2)) {
                z2 = true;
            } else {
                int iM2819getRadioButtono7Vup1c = companion3.m2819getRadioButtono7Vup1c();
                if (role != null && Role.m2810equalsimpl0(role.m2813unboximpl(), iM2819getRadioButtono7Vup1c)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            accessibilityNodeInfo.setClickable(!z2 || (z2 && !zBooleanValue3));
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                int i10 = read + 115;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (accessibilityNodeInfo.isClickable()) {
                    focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(16, accessibilityAction.getLabel()));
                }
            }
        }
        accessibilityNodeInfo.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            accessibilityNodeInfo.setLongClickable(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(32, accessibilityAction2.getLabel()));
            }
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(Fields.Clip, accessibilityAction3.getLabel()));
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(2097152, accessibilityAction4.getLabel()));
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getOnImeAction());
            if (accessibilityAction5 != null) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getCutText());
            if (accessibilityAction6 != null) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(65536, accessibilityAction6.getLabel()));
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getPasteText());
            if (accessibilityAction7 != null && accessibilityNodeInfo.isFocused() && this.view.getClipboardManager().hasText()) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(Fields.CompositingStrategy, accessibilityAction7.getLabel()));
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            accessibilityNodeInfo.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions.getSetSelection());
            focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(Fields.RenderEffect, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            focusRestorerKtsaveFocusedChild11.write(Fields.RotationX);
            focusRestorerKtsaveFocusedChild11.write(Fields.RotationY);
            accessibilityNodeInfo.setMovementGranularities(11);
            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties3.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getGetTextLayoutResult()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode)) {
                accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities() | 20);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExtraDataIdKey);
        CharSequence charSequenceWrite = focusRestorerKtsaveFocusedChild11.write();
        if (charSequenceWrite != null && charSequenceWrite.length() != 0 && semanticsNode.getUnmergedConfig$ui().contains(semanticsActions.getGetTextLayoutResult())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getTestTag())) {
            arrayList.add(ExtraDataTestTagKey);
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties3.getShape())) {
            arrayList.add(ExtraDataShapeTypeKey);
            arrayList.add(ExtraDataShapeRectKey);
            arrayList.add(ExtraDataShapeRectCornersKey);
            arrayList.add(ExtraDataShapeRegionKey);
        }
        awaitTouchSlopOrCancellationjO51t88 accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig$ui().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui != null) {
            Object[] objArr7 = accessibilityExtraKeys$ui.RemoteActionCompatParcelizer;
            long[] jArr = accessibilityExtraKeys$ui.IconCompatParcelizer;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j = jArr[i12];
                    resources = resources2;
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        long j2 = j;
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j2 & 255) < 128 && (accessibilityExtraKey$ui = ((SemanticsPropertyKey) objArr7[(i12 << 3) + i14]).getAccessibilityExtraKey$ui()) != null) {
                                arrayList.add(accessibilityExtraKey$ui);
                            }
                            j2 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        }
                        if (i12 != length) {
                            break;
                        }
                        i12++;
                        resources2 = resources;
                    } else if (i12 != length) {
                        break;
                        break;
                    } else {
                        i12++;
                        resources2 = resources;
                    }
                }
            } else {
                resources = resources2;
            }
        } else {
            resources = resources2;
        }
        accessibilityNodeInfo.setAvailableExtraData(arrayList);
        SemanticsConfiguration unmergedConfig$ui6 = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties4 = SemanticsProperties.INSTANCE;
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui6, semanticsProperties4.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            SemanticsConfiguration unmergedConfig$ui7 = semanticsNode.getUnmergedConfig$ui();
            SemanticsActions semanticsActions2 = SemanticsActions.INSTANCE;
            if (unmergedConfig$ui7.contains(semanticsActions2.getSetProgress())) {
                focusRestorerKtsaveFocusedChild11.read("android.widget.SeekBar");
            } else {
                focusRestorerKtsaveFocusedChild11.read("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.Companion.getIndeterminate()) {
                accessibilityNodeInfo.setRangeInfo((AccessibilityNodeInfo.RangeInfo) setVerticalGravity.serializer(((Number) progressBarRangeInfo.getRange().RemoteActionCompatParcelizer()).floatValue(), ((Number) progressBarRangeInfo.getRange().IconCompatParcelizer()).floatValue(), progressBarRangeInfo.getCurrent()).read);
            }
            if (semanticsNode.getUnmergedConfig$ui().contains(semanticsActions2.getSetProgress()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                float current = progressBarRangeInfo.getCurrent();
                float fFloatValue = ((Number) progressBarRangeInfo.getRange().IconCompatParcelizer()).floatValue();
                float fFloatValue2 = ((Number) progressBarRangeInfo.getRange().RemoteActionCompatParcelizer()).floatValue();
                if (fFloatValue < fFloatValue2) {
                    fFloatValue = fFloatValue2;
                }
                if (current < fFloatValue) {
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.ParcelableVolumeInfo);
                }
                float current2 = progressBarRangeInfo.getCurrent();
                float fFloatValue3 = ((Number) progressBarRangeInfo.getRange().RemoteActionCompatParcelizer()).floatValue();
                float fFloatValue4 = ((Number) progressBarRangeInfo.getRange().IconCompatParcelizer()).floatValue();
                if (fFloatValue3 > fFloatValue4) {
                    fFloatValue3 = fFloatValue4;
                }
                if (current2 > fFloatValue3) {
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaSessionCompatQueueItem);
                }
            }
        }
        Api24Impl.addSetProgressAction(focusRestorerKtsaveFocusedChild11, semanticsNode);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, focusRestorerKtsaveFocusedChild11);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, focusRestorerKtsaveFocusedChild11);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties4.getHorizontalScrollAxisRange());
        SemanticsConfiguration unmergedConfig$ui8 = semanticsNode.getUnmergedConfig$ui();
        SemanticsActions semanticsActions3 = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui8, semanticsActions3.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            int i15 = IconCompatParcelizer + 99;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                focusRestorerKtsaveFocusedChild11.read("android.widget.HorizontalScrollView");
            }
            if (((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() > 0.0f) {
                focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.ParcelableVolumeInfo);
                    focusRestorerKtsaveFocusedChild11.write(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode) ? FocusRestorerNode.PlaybackStateCompatCustomAction : FocusRestorerNode.PlaybackStateCompat);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaSessionCompatQueueItem);
                    focusRestorerKtsaveFocusedChild11.write(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode) ? FocusRestorerNode.PlaybackStateCompat : FocusRestorerNode.PlaybackStateCompatCustomAction);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties4.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                focusRestorerKtsaveFocusedChild11.read("android.widget.ScrollView");
            }
            if (((Number) scrollAxisRange2.getMaxValue().invoke()).floatValue() > 0.0f) {
                int i17 = IconCompatParcelizer + 65;
                read = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.ParcelableVolumeInfo);
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaDescriptionCompat);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    int i19 = IconCompatParcelizer + 75;
                    read = i19 % Fields.SpotShadowColor;
                    if (i19 % 2 != 0) {
                        focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaSessionCompatQueueItem);
                        focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                        throw null;
                    }
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaSessionCompatQueueItem);
                    focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.addPageActions(focusRestorerKtsaveFocusedChild11, semanticsNode);
        }
        accessibilityNodeInfo.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsProperties4.getPaneTitle()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            int i20 = read + 117;
            IconCompatParcelizer = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions3.getExpand());
            if (accessibilityAction10 != null) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(Fields.ColorFilter, accessibilityAction10.getLabel()));
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions3.getCollapse());
            if (accessibilityAction11 != null) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(Fields.BlendMode, accessibilityAction11.getLabel()));
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsActions3.getDismiss());
            if (accessibilityAction12 != null) {
                focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(1048576, accessibilityAction12.getLabel()));
            }
            if (semanticsNode.getUnmergedConfig$ui().contains(semanticsActions3.getCustomActions())) {
                List list3 = (List) semanticsNode.getUnmergedConfig$ui().get(semanticsActions3.getCustomActions());
                int size2 = list3.size();
                ScrollingLayoutElement scrollingLayoutElement = AccessibilityActionsResourceIds;
                if (size2 >= scrollingLayoutElement.RemoteActionCompatParcelizer) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(af$$ExternalSyntheticOutline0.m(scrollingLayoutElement.RemoteActionCompatParcelizer, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                    return;
                }
                accessprocessDragStart accessprocessdragstart = new accessprocessDragStart(0);
                AnchoredDraggableState anchoredDraggableState = ContentInViewNodeKt.read;
                AnchoredDraggableState anchoredDraggableState2 = new AnchoredDraggableState();
                accessprocessDragStart accessprocessdragstart2 = this.labelToActionId;
                if (accessprocessdragstart2.write) {
                    int i22 = IconCompatParcelizer + 31;
                    read = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    isInterested.read(accessprocessdragstart2);
                }
                if (DragGestureNodestartListeningForEvents1.serializer(accessprocessdragstart2.IconCompatParcelizer, accessprocessdragstart2.serializer, i) >= 0) {
                    accessprocessDragStart accessprocessdragstart3 = this.labelToActionId;
                    accessprocessdragstart3.getClass();
                    AnchoredDraggableState anchoredDraggableState3 = (AnchoredDraggableState) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart3, i);
                    AnchoredDraggableKt anchoredDraggableKt = new AnchoredDraggableKt();
                    int[] iArr = scrollingLayoutElement.read;
                    int i24 = scrollingLayoutElement.RemoteActionCompatParcelizer;
                    for (int i25 = 0; i25 < i24; i25++) {
                        anchoredDraggableKt.IconCompatParcelizer(iArr[i25]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i26 = 0;
                    for (int size3 = list3.size(); i26 < size3; size3 = size3) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i26);
                        anchoredDraggableState3.getClass();
                        if (anchoredDraggableState3.serializer(customAccessibilityAction.getLabel()) >= 0) {
                            int iRemoteActionCompatParcelizer = anchoredDraggableState3.RemoteActionCompatParcelizer(customAccessibilityAction.getLabel());
                            accessprocessdragstart.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer, customAccessibilityAction.getLabel());
                            anchoredDraggableState2.write(iRemoteActionCompatParcelizer, customAccessibilityAction.getLabel());
                            int[] iArr2 = anchoredDraggableKt.read;
                            int i27 = anchoredDraggableKt.RemoteActionCompatParcelizer;
                            int i28 = 0;
                            while (true) {
                                if (i28 >= i27) {
                                    i28 = -1;
                                    break;
                                }
                                int i29 = i27;
                                if (iRemoteActionCompatParcelizer == iArr2[i28]) {
                                    break;
                                }
                                i28++;
                                i27 = i29;
                            }
                            if (i28 >= 0) {
                                anchoredDraggableKt.read(i28);
                            }
                            focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(iRemoteActionCompatParcelizer, customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                        i26++;
                        anchoredDraggableState3 = anchoredDraggableState3;
                    }
                    int size4 = arrayList2.size();
                    for (int i30 = 0; i30 < size4; i30++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i30);
                        int iRemoteActionCompatParcelizer2 = anchoredDraggableKt.RemoteActionCompatParcelizer(i30);
                        accessprocessdragstart.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer2, customAccessibilityAction2.getLabel());
                        anchoredDraggableState2.write(iRemoteActionCompatParcelizer2, customAccessibilityAction2.getLabel());
                        focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(iRemoteActionCompatParcelizer2, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i31 = 0; i31 < size5; i31++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i31);
                        int iRemoteActionCompatParcelizer3 = AccessibilityActionsResourceIds.RemoteActionCompatParcelizer(i31);
                        accessprocessdragstart.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer3, customAccessibilityAction3.getLabel());
                        anchoredDraggableState2.write(iRemoteActionCompatParcelizer3, customAccessibilityAction3.getLabel());
                        focusRestorerKtsaveFocusedChild11.write(new FocusRestorerNode(iRemoteActionCompatParcelizer3, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.RemoteActionCompatParcelizer(i, accessprocessdragstart);
                this.labelToActionId.RemoteActionCompatParcelizer(i, anchoredDraggableState2);
            }
        }
        accessibilityNodeInfo.setScreenReaderFocusable(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isScreenReaderFocusable(semanticsNode, resources));
        int iSerializer2 = this.idToBeforeMap.serializer(i);
        if (iSerializer2 != -1) {
            View viewSemanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), iSerializer2);
            if (viewSemanticsIdToView2 != null) {
                accessibilityNodeInfo.setTraversalBefore(viewSemanticsIdToView2);
            } else {
                accessibilityNodeInfo.setTraversalBefore(this.view, iSerializer2);
            }
            addExtraDataToAccessibilityNodeInfoHelper(i, focusRestorerKtsaveFocusedChild11, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int iSerializer3 = this.idToAfterMap.serializer(i);
        if (iSerializer3 != -1 && (viewSemanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui(), iSerializer3)) != null) {
            accessibilityNodeInfo.setTraversalAfter(viewSemanticsIdToView);
            addExtraDataToAccessibilityNodeInfoHelper(i, focusRestorerKtsaveFocusedChild11, this.ExtraDataTestTraversalAfterVal, null);
        }
        String str3 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName());
        if (str3 != null) {
            focusRestorerKtsaveFocusedChild11.read(str3);
        }
    }

    static void IconCompatParcelizer() {
        write = (byte) -112;
    }
}

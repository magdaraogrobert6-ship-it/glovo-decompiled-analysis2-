package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.cancelPendingWebViewPause;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class HoverIconModifierNode extends Modifier.Node implements TraversableNode, PointerInputModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean cursorInBoundsOfNode;
    private DpTouchBoundsExpansion dpTouchBoundsExpansion;
    private PointerIcon icon;
    private boolean overrideDescendants;

    private final void onEnter() {
        this.cursorInBoundsOfNode = true;
        displayIconIfDescendantsDoNotHavePriority();
    }

    public abstract void displayIcon(PointerIcon pointerIcon);

    public final DpTouchBoundsExpansion getDpTouchBoundsExpansion() {
        return this.dpTouchBoundsExpansion;
    }

    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    /* JADX INFO: renamed from: isRelevantPointerType-uerMTgs, reason: not valid java name */
    public abstract boolean mo1975isRelevantPointerTypeuerMTgs(int i);

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        onExit();
    }

    public final void setDpTouchBoundsExpansion(DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
    }

    private final void displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon() {
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        TraversableNodeKt.traverseAncestors(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (createinappmessageeventsubscriber.IconCompatParcelizer == null && hoverIconModifierNode.cursorInBoundsOfNode) {
                    createinappmessageeventsubscriber.IconCompatParcelizer = hoverIconModifierNode;
                } else if (createinappmessageeventsubscriber.IconCompatParcelizer != null && hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    createinappmessageeventsubscriber.IconCompatParcelizer = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }

            {
                super(1);
            }
        });
        HoverIconModifierNode hoverIconModifierNode = (HoverIconModifierNode) createinappmessageeventsubscriber.IconCompatParcelizer;
        if (hoverIconModifierNode != null) {
            hoverIconModifierNode.displayIcon();
        } else {
            displayIcon(null);
        }
    }

    private final void displayIconIfDescendantsDoNotHavePriority() {
        final cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        cancelpendingwebviewpause.IconCompatParcelizer = true;
        if (!this.overrideDescendants) {
            TraversableNodeKt.traverseDescendants(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.displayIconIfDescendantsDoNotHavePriority.1
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                    if (!hoverIconModifierNode.cursorInBoundsOfNode) {
                        return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                    }
                    cancelpendingwebviewpause.IconCompatParcelizer = false;
                    return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
                }
            });
        }
        if (cancelpendingwebviewpause.IconCompatParcelizer) {
            displayIcon();
        }
    }

    private final HoverIconModifierNode findDescendantNodeWithCursorInBounds() {
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        TraversableNodeKt.traverseDescendants(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.findDescendantNodeWithCursorInBounds.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final TraversableNode.Companion.TraverseDescendantsAction invoke(HoverIconModifierNode hoverIconModifierNode) {
                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                if (hoverIconModifierNode.cursorInBoundsOfNode) {
                    createinappmessageeventsubscriber.IconCompatParcelizer = hoverIconModifierNode;
                    if (hoverIconModifierNode.getOverrideDescendants()) {
                        return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
                    }
                }
                return traverseDescendantsAction;
            }

            {
                super(1);
            }
        });
        return (HoverIconModifierNode) createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    private final HoverIconModifierNode findOverridingAncestorNode() {
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        TraversableNodeKt.traverseAncestors(this, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.pointer.HoverIconModifierNode.findOverridingAncestorNode.1
            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(HoverIconModifierNode hoverIconModifierNode) {
                if (hoverIconModifierNode.getOverrideDescendants() && hoverIconModifierNode.cursorInBoundsOfNode) {
                    createinappmessageeventsubscriber.IconCompatParcelizer = hoverIconModifierNode;
                }
                return Boolean.TRUE;
            }
        });
        return (HoverIconModifierNode) createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    public final void setIcon(PointerIcon pointerIcon) {
        Object[] objArr = {this.icon, pointerIcon};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.icon = pointerIcon;
        if (this.cursorInBoundsOfNode) {
            displayIconIfDescendantsDoNotHavePriority();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        onExit();
        super.onDetach();
    }

    public final PointerIconService getPointerIconService() {
        return (PointerIconService) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalPointerIconService());
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public long mo1974getTouchBoundsExpansionRZrCHBk() {
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.dpTouchBoundsExpansion;
        return dpTouchBoundsExpansion != null ? dpTouchBoundsExpansion.m2429roundToTouchBoundsExpansionTW6G1oQ(DelegatableNodeKt.requireDensity(this)) : TouchBoundsExpansion.Companion.m2652getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                if (mo1975isRelevantPointerTypeuerMTgs(changes.get(i).m2074getTypeT8wyACA())) {
                    int iM2004getType7fucELk = pointerEvent.m2004getType7fucELk();
                    PointerEventType.Companion companion = PointerEventType.Companion;
                    if (PointerEventType.m2011equalsimpl0(iM2004getType7fucELk, companion.m2015getEnter7fucELk())) {
                        onEnter();
                        return;
                    } else {
                        if (PointerEventType.m2011equalsimpl0(pointerEvent.m2004getType7fucELk(), companion.m2016getExit7fucELk())) {
                            onExit();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void setOverrideDescendants(boolean z) {
        if (this.overrideDescendants != z) {
            this.overrideDescendants = z;
            boolean z2 = this.cursorInBoundsOfNode;
            if (z) {
                if (z2) {
                    displayIcon();
                }
            } else if (z2) {
                displayIconFromCurrentNodeOrDescendantsWithCursorInBounds();
            }
        }
    }

    private final void displayIconFromCurrentNodeOrDescendantsWithCursorInBounds() {
        HoverIconModifierNode hoverIconModifierNodeFindDescendantNodeWithCursorInBounds;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (hoverIconModifierNodeFindDescendantNodeWithCursorInBounds = findDescendantNodeWithCursorInBounds()) == null) {
                hoverIconModifierNodeFindDescendantNodeWithCursorInBounds = this;
            }
            hoverIconModifierNodeFindDescendantNodeWithCursorInBounds.displayIcon();
        }
    }

    private final void onExit() {
        if (this.cursorInBoundsOfNode) {
            this.cursorInBoundsOfNode = false;
            if (isAttached()) {
                displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon();
            }
        }
    }

    private final void displayIcon() {
        PointerIcon pointerIcon;
        HoverIconModifierNode hoverIconModifierNodeFindOverridingAncestorNode = findOverridingAncestorNode();
        if (hoverIconModifierNodeFindOverridingAncestorNode == null || (pointerIcon = hoverIconModifierNodeFindOverridingAncestorNode.icon) == null) {
            pointerIcon = this.icon;
        }
        displayIcon(pointerIcon);
    }

    public /* synthetic */ HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pointerIcon, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    public HoverIconModifierNode(PointerIcon pointerIcon, boolean z, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.dpTouchBoundsExpansion = dpTouchBoundsExpansion;
        this.icon = pointerIcon;
        this.overrideDescendants = z;
    }
}

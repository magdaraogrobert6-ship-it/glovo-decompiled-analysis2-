package androidx.compose.ui.semantics;

import android.os.Trace;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.StretchOverscrollNode;
import o.VerticalScrollableClipShape;
import o.animateToWithDecay;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsOwnerKt {
    private static final Rect DefaultFakeNodeBounds = new Rect(0.0f, 0.0f, 10.0f, 10.0f);

    public static /* synthetic */ void isHidden$annotations(SemanticsNode semanticsNode) {
    }

    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        return onContentCardDismissed.PlaybackStateCompat(getAllSemanticsNodesToMap(semanticsOwner, !z, z2).values());
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SemanticsNode unmergedRootSemanticsNode = z ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode();
        if (z2 && unmergedRootSemanticsNode.getLayoutNode$ui().isDeactivated()) {
            return linkedHashMap;
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, z2, unmergedRootSemanticsNode);
        return linkedHashMap;
    }

    public static final StretchOverscrollNode getAllUncoveredSemanticsNodesToIntObjectMap(SemanticsOwner semanticsOwner, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
            if (unmergedRootSemanticsNode.getLayoutNode$ui().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui().isAttached()) {
                Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
                animateToWithDecay animatetowithdecay = new animateToWithDecay(48);
                SemanticsRegion SemanticsRegion = SemanticsRegion_androidKt.SemanticsRegion();
                SemanticsRegion.set(IntRectKt.roundToIntRect(boundsInRoot));
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(unmergedRootSemanticsNode, animatetowithdecay, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, unmergedRootSemanticsNode, SemanticsRegion_androidKt.SemanticsRegion(), SemanticsRegion);
                return animatetowithdecay;
            }
            animateToWithDecay animatetowithdecay2 = VerticalScrollableClipShape.IconCompatParcelizer;
            animatetowithdecay2.getClass();
            return animatetowithdecay2;
        } finally {
            Trace.endSection();
        }
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(SemanticsNode semanticsNode, animateToWithDecay animatetowithdecay, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, SemanticsNode semanticsNode2, SemanticsRegion semanticsRegion, SemanticsRegion semanticsRegion2) {
        boolean z = (semanticsNode2.getLayoutNode$ui().isPlaced() && semanticsNode2.getLayoutNode$ui().isAttached()) ? false : true;
        if (!semanticsRegion2.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z || semanticsNode2.isFake$ui()) {
                IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(semanticsNode2.getTouchBoundsInRoot());
                semanticsRegion.set(intRectRoundToIntRect);
                int allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId = getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i, semanticsNode2);
                if (semanticsRegion.intersect(semanticsRegion2)) {
                    animatetowithdecay.IconCompatParcelizer(allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion.getBounds()));
                    List<SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
                    if (ComposeUiFlags.isAccessibilityShouldIncludeOffscreenChildrenEnabled && semanticsNode2.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() && isPartiallyOffscreenInScrollParent(semanticsNode2)) {
                        SemanticsRegion SemanticsRegion = SemanticsRegion_androidKt.SemanticsRegion();
                        SemanticsRegion.set(IntRectKt.roundToIntRect(semanticsNode2.getUnclippedBoundsInRoot$ui()));
                        for (int size = replacedChildren$ui.size() - 1; -1 < size; size--) {
                            if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(replacedChildren$ui.get(size))).booleanValue()) {
                                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(animatetowithdecay, r8lambdaunavo3sxub_pc9xroryotnrlvsm, semanticsNode, i, replacedChildren$ui.get(size), SemanticsRegion_androidKt.SemanticsRegion(), SemanticsRegion);
                            }
                        }
                    } else {
                        for (int size2 = replacedChildren$ui.size() - 1; -1 < size2; size2--) {
                            if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(replacedChildren$ui.get(size2))).booleanValue()) {
                                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$findAllSemanticNodesRecursive(semanticsNode, animatetowithdecay, r8lambdaunavo3sxub_pc9xroryotnrlvsm, i, replacedChildren$ui.get(size2), semanticsRegion, semanticsRegion2);
                            }
                        }
                    }
                    if (isImportantForAccessibility(semanticsNode2)) {
                        semanticsRegion2.difference(intRectRoundToIntRect);
                        return;
                    }
                    return;
                }
                if (semanticsNode2.isFake$ui()) {
                    getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(animatetowithdecay, semanticsNode, i, semanticsNode2);
                } else if (allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId == i) {
                    animatetowithdecay.IconCompatParcelizer(allUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId, new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion.getBounds()));
                }
            }
        }
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(animateToWithDecay animatetowithdecay, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2, SemanticsRegion semanticsRegion, SemanticsRegion semanticsRegion2) {
        if (!semanticsNode2.getLayoutNode$ui().isPlaced() || !semanticsNode2.getLayoutNode$ui().isAttached() || semanticsRegion2.isEmpty()) {
            if (semanticsNode2.isFake$ui()) {
                getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(animatetowithdecay, semanticsNode, i, semanticsNode2);
                return;
            }
            return;
        }
        Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
        if (touchBoundsInRoot.isEmpty()) {
            touchBoundsInRoot = semanticsNode2.getUnclippedBoundsInRoot$ui();
        }
        IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(touchBoundsInRoot);
        semanticsRegion.set(intRectRoundToIntRect);
        if (semanticsRegion.intersect(semanticsRegion2)) {
            animatetowithdecay.IconCompatParcelizer(getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i, semanticsNode2), new SemanticsNodeWithAdjustedBounds(semanticsNode2, semanticsRegion.getBounds()));
            List<SemanticsNode> replacedChildren$ui = semanticsNode2.getReplacedChildren$ui();
            for (int size = replacedChildren$ui.size() - 1; -1 < size; size--) {
                if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(replacedChildren$ui.get(size))).booleanValue()) {
                    getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addDescendantsOfMergingNodePartiallyVisibleInScrollParent(animatetowithdecay, r8lambdaunavo3sxub_pc9xroryotnrlvsm, semanticsNode, i, replacedChildren$ui.get(size), semanticsRegion, semanticsRegion2);
                }
            }
            if (isImportantForAccessibility(semanticsNode2)) {
                semanticsRegion2.difference(intRectRoundToIntRect);
            }
        }
    }

    private static final int getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2) {
        return semanticsNode2.getId() == semanticsNode.getId() ? i : semanticsNode2.getId();
    }

    private static final boolean isScrollNode(SemanticsNode semanticsNode) {
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return unmergedConfig$ui.contains(semanticsProperties.getVerticalScrollAxisRange()) || semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getHorizontalScrollAxisRange());
    }

    public static /* synthetic */ List getAllSemanticsNodes$default(SemanticsOwner semanticsOwner, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodes(semanticsOwner, z, z2);
    }

    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$addFakeNode(animateToWithDecay animatetowithdecay, SemanticsNode semanticsNode, int i, SemanticsNode semanticsNode2) {
        LayoutInfo layoutInfo;
        SemanticsNode parent = semanticsNode2.getParent();
        animatetowithdecay.IconCompatParcelizer(getAllUncoveredSemanticsNodesToIntObjectMap$lambda$0$virtualViewId(semanticsNode, i, semanticsNode2), new SemanticsNodeWithAdjustedBounds(semanticsNode2, IntRectKt.roundToIntRect((parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? DefaultFakeNodeBounds : parent.getBoundsInRoot())));
    }

    private static final SemanticsNode getScrollableParent(SemanticsNode semanticsNode) {
        for (SemanticsNode parent = semanticsNode.getParent(); parent != null; parent = parent.getParent()) {
            if (isScrollNode(parent)) {
                return parent;
            }
        }
        return null;
    }

    public static final boolean isHidden(SemanticsNode semanticsNode) {
        if (semanticsNode.isTransparent$ui()) {
            return true;
        }
        SemanticsConfiguration unmergedConfig$ui = semanticsNode.getUnmergedConfig$ui();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return unmergedConfig$ui.contains(semanticsProperties.getHideFromAccessibility()) || semanticsNode.getUnmergedConfig$ui().contains(semanticsProperties.getInvisibleToUser());
    }

    public static final boolean isImportantForAccessibility(SemanticsNode semanticsNode) {
        if (isHidden(semanticsNode)) {
            return false;
        }
        return semanticsNode.getUnmergedConfig$ui().isMergingSemanticsOfDescendants() || semanticsNode.getUnmergedConfig$ui().containsImportantForAccessibility$ui();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    private static final boolean isPartiallyOffscreenInScrollParent(SemanticsNode semanticsNode) {
        LayoutCoordinates coordinates;
        SemanticsNode scrollableParent = getScrollableParent(semanticsNode);
        if (scrollableParent != null) {
            NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = semanticsNode.findCoordinatorToGetBounds$ui();
            LayoutCoordinates coordinates2 = null;
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui == null) {
                coordinates = null;
            } else {
                if (!nodeCoordinatorFindCoordinatorToGetBounds$ui.isAttached()) {
                    nodeCoordinatorFindCoordinatorToGetBounds$ui = null;
                }
                if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
                    coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui.getCoordinates();
                } else {
                    coordinates = null;
                }
            }
            NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui2 = scrollableParent.findCoordinatorToGetBounds$ui();
            if (nodeCoordinatorFindCoordinatorToGetBounds$ui2 != null) {
                if (!nodeCoordinatorFindCoordinatorToGetBounds$ui2.isAttached()) {
                    nodeCoordinatorFindCoordinatorToGetBounds$ui2 = null;
                }
                if (nodeCoordinatorFindCoordinatorToGetBounds$ui2 != null) {
                    coordinates2 = nodeCoordinatorFindCoordinatorToGetBounds$ui2.getCoordinates();
                }
            }
            if (coordinates != null && coordinates2 != null) {
                Rect rectLocalBoundingBoxOf = coordinates2.localBoundingBoxOf(coordinates, false);
                return !rectLocalBoundingBoxOf.equals(rectLocalBoundingBoxOf.intersect(RectKt.m517Recttz77jQw(Offset.Companion.m493getZeroF1C5BW0(), IntSizeKt.m3856toSizeozmzZPI(coordinates2.mo2217getSizeYbymL2g()))));
            }
        }
        return false;
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> map, boolean z, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List children$ui$default = SemanticsNode.getChildren$ui$default(semanticsNode, false, false, !z, 3, null);
        int size = children$ui$default.size();
        for (int i = 0; i < size; i++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, z, (SemanticsNode) children$ui$default.get(i));
        }
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z, z2);
    }
}

package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class ScrollCapture_androidKt {
    private static final List<SemanticsNode> getChildrenForSearch(SemanticsNode semanticsNode) {
        return semanticsNode.getChildren$ui(false, false, false);
    }

    private static final boolean getCanScrollVertically(SemanticsNode semanticsNode) {
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 scrollCaptureScrollByAction = getScrollCaptureScrollByAction(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        return (scrollCaptureScrollByAction == null || scrollAxisRange == null || ((Number) scrollAxisRange.getMaxValue().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    public static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getScrollCaptureScrollByAction(SemanticsNode semanticsNode) {
        return (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getScrollByOffset());
    }

    private static final void visitDescendants(SemanticsNode semanticsNode, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new SemanticsNode[16]);
        oncreatevirtualviewtranslationrequests.read(oncreatevirtualviewtranslationrequests.read, (List) getChildrenForSearch(semanticsNode));
        while (true) {
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return;
            }
            SemanticsNode semanticsNode2 = (SemanticsNode) oncreatevirtualviewtranslationrequests.write(i - 1);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(semanticsNode2)).booleanValue()) {
                oncreatevirtualviewtranslationrequests.read(oncreatevirtualviewtranslationrequests.read, (List) getChildrenForSearch(semanticsNode2));
            }
        }
    }

    private static final void visitScrollCaptureCandidates(SemanticsNode semanticsNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        SemanticsNode semanticsNode2;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new SemanticsNode[16]);
        List<SemanticsNode> childrenForSearch = getChildrenForSearch(semanticsNode);
        while (true) {
            oncreatevirtualviewtranslationrequests.read(oncreatevirtualviewtranslationrequests.read, (List) childrenForSearch);
            while (true) {
                int i2 = oncreatevirtualviewtranslationrequests.read;
                if (i2 == 0) {
                    return;
                }
                semanticsNode2 = (SemanticsNode) oncreatevirtualviewtranslationrequests.write(i2 - 1);
                if (!SemanticsOwnerKt.isHidden(semanticsNode2) && !semanticsNode2.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getDisabled())) {
                    NodeCoordinator nodeCoordinatorFindCoordinatorToGetBounds$ui = semanticsNode2.findCoordinatorToGetBounds$ui();
                    if (nodeCoordinatorFindCoordinatorToGetBounds$ui != null) {
                        LayoutCoordinates coordinates = nodeCoordinatorFindCoordinatorToGetBounds$ui.getCoordinates();
                        IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(LayoutCoordinatesKt.boundsInWindow$default(coordinates, false, 1, null));
                        if (intRectRoundToIntRect.isEmpty()) {
                            continue;
                        } else {
                            if (!getCanScrollVertically(semanticsNode2)) {
                                break;
                            }
                            int i3 = 1 + i;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new ScrollCaptureCandidate(semanticsNode2, i3, intRectRoundToIntRect, coordinates));
                            visitScrollCaptureCandidates(semanticsNode2, i3, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        }
                    } else {
                        throw c8$$ExternalSyntheticOutline0.m("Expected semantics node to have a coordinator.");
                    }
                }
            }
            childrenForSearch = getChildrenForSearch(semanticsNode2);
        }
    }

    public static /* synthetic */ void visitScrollCaptureCandidates$default(SemanticsNode semanticsNode, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        visitScrollCaptureCandidates(semanticsNode, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}

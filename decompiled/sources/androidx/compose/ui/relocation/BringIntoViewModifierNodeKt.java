package androidx.compose.ui.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class BringIntoViewModifierNodeKt {
    public static final Object bringIntoView(DelegatableNode delegatableNode, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        Object obj;
        final LayoutCoordinates layoutCoordinatesRequireLayoutCoordinates;
        Object objBringIntoView;
        NodeChain nodes$ui;
        if (delegatableNode.getNode().isAttached()) {
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.BlendMode);
            if (!delegatableNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
            loop0: while (true) {
                obj = null;
                if (layoutNodeRequireLayoutNode == null) {
                    break;
                }
                if ((r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(layoutNodeRequireLayoutNode) & iM2551constructorimpl) != 0) {
                    while (parent$ui != null) {
                        if ((parent$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            Modifier.Node nodePop = parent$ui;
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = null;
                            while (nodePop != null) {
                                if (nodePop instanceof BringIntoViewModifierNode) {
                                    obj = nodePop;
                                    break loop0;
                                }
                                if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
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
                        }
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
            }
            BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
            if (bringIntoViewModifierNode != null && (objBringIntoView = bringIntoViewModifierNode.bringIntoView((layoutCoordinatesRequireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode)), new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt.bringIntoView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Rect invoke() {
                    Rect rect;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                    if (r8lambdardpfsr94j4iebcwx_kpqzpm8k1 != null && (rect = (Rect) r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke()) != null) {
                        return rect;
                    }
                    LayoutCoordinates layoutCoordinates = layoutCoordinatesRequireLayoutCoordinates;
                    if (!layoutCoordinates.isAttached()) {
                        layoutCoordinates = null;
                    }
                    if (layoutCoordinates != null) {
                        return SizeKt.m567toRectuvyYCjk(IntSizeKt.m3856toSizeozmzZPI(layoutCoordinates.mo2217getSizeYbymL2g()));
                    }
                    return null;
                }
            }, shortNewsContentCardView)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objBringIntoView;
            }
        }
        return createFromParcel.INSTANCE;
    }

    public static /* synthetic */ Object bringIntoView$default(DelegatableNode delegatableNode, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, ShortNewsContentCardView shortNewsContentCardView, int i, Object obj) {
        if ((i & 1) != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = null;
        }
        return bringIntoView(delegatableNode, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView);
    }
}

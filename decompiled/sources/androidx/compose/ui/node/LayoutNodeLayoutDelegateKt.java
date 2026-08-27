package androidx.compose.ui.node;

import androidx.compose.ui.layout.Measurable;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutNodeLayoutDelegateKt {
    public static final String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final <T extends Measurable> void updateChildMeasurables(LayoutNode layoutNode, onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = layoutNode.get_children$ui();
        Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
        int i = oncreatevirtualviewtranslationrequests2.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode2 = (LayoutNode) objArr[i2];
            if (oncreatevirtualviewtranslationrequests.read <= i2) {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(layoutNode2));
            } else {
                oncreatevirtualviewtranslationrequests.write(i2, r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(layoutNode2));
            }
        }
        oncreatevirtualviewtranslationrequests.write(layoutNode.getChildren$ui().size(), oncreatevirtualviewtranslationrequests.read);
    }

    public static final boolean isOutMostLookaheadRoot(LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot$ui() == null) {
            return false;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui != null ? parent$ui.getLookaheadRoot$ui() : null) == null || layoutNode.getLayoutDelegate$ui().getDetachedFromParentLookaheadPass$ui();
    }
}

package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onCreateVirtualViewTranslationRequests;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRequester {
    public static final int $stable = 0;
    private final onCreateVirtualViewTranslationRequests focusRequesterNodes = new onCreateVirtualViewTranslationRequests(new FocusRequesterModifierNode[16]);
    public static final Companion Companion = new Companion(null);
    private static final FocusRequester Default = new FocusRequester();
    private static final FocusRequester Cancel = new FocusRequester();
    private static final FocusRequester Redirect = new FocusRequester();

    public final onCreateVirtualViewTranslationRequests getFocusRequesterNodes$ui() {
        return this.focusRequesterNodes;
    }

    public final boolean captureFocus() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.focusRequesterNodes;
        int i = oncreatevirtualviewtranslationrequests.read;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        for (int i2 = 0; i2 < i; i2++) {
            if (FocusRequesterModifierNodeKt.captureFocus((FocusRequesterModifierNode) objArr[i2])) {
                return true;
            }
        }
        return false;
    }

    public final boolean findFocusTarget$ui(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Companion companion = Companion;
        if (this == companion.getDefault()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (this == companion.getCancel()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (getFocusRequesterNodes$ui().read == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        onCreateVirtualViewTranslationRequests focusRequesterNodes$ui = getFocusRequesterNodes$ui();
        Object[] objArr = focusRequesterNodes$ui.write;
        int i = focusRequesterNodes$ui.read;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            FocusRequesterModifierNode focusRequesterModifierNode = (FocusRequesterModifierNode) objArr[i2];
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!focusRequesterModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            int i3 = 16;
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
            Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
            if (child$ui == null) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, focusRequesterModifierNode.getNode(), false);
            } else {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
            }
            while (true) {
                int i4 = oncreatevirtualviewtranslationrequests.read;
                if (i4 == 0) {
                    break;
                }
                Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i4 - 1);
                if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, nodePop, false);
                } else {
                    while (nodePop != null) {
                        if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((FocusTargetNode) nodePop)).booleanValue()) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui();
                                        int i5 = 0;
                                        while (delegate$ui != null) {
                                            if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    nodePop = delegate$ui;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests2 == null) {
                                                        oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[i3]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                                }
                                            }
                                            delegate$ui = delegate$ui.getChild$ui();
                                            i3 = 16;
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    i3 = 16;
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                                i3 = 16;
                            }
                            break;
                        }
                        nodePop = nodePop.getChild$ui();
                        i3 = 16;
                    }
                }
            }
        }
        return z;
    }

    public final boolean freeFocus() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.focusRequesterNodes;
        int i = oncreatevirtualviewtranslationrequests.read;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        for (int i2 = 0; i2 < i; i2++) {
            if (FocusRequesterModifierNodeKt.freeFocus((FocusRequesterModifierNode) objArr[i2])) {
                return true;
            }
        }
        return false;
    }

    @onItemDismisslambda0
    public final /* synthetic */ void requestFocus() {
        m381requestFocus3ESFkO8(FocusDirection.Companion.m354getEnterdhqQ8s());
    }

    /* JADX INFO: renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    public final boolean m381requestFocus3ESFkO8(int i) {
        Companion companion = Companion;
        if (this == companion.getDefault()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (this == companion.getCancel()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (getFocusRequesterNodes$ui().read == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        onCreateVirtualViewTranslationRequests focusRequesterNodes$ui = getFocusRequesterNodes$ui();
        Object[] objArr = focusRequesterNodes$ui.write;
        int i2 = focusRequesterNodes$ui.read;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusRequesterModifierNode focusRequesterModifierNode = (FocusRequesterModifierNode) objArr[i3];
            int iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.RotationZ);
            if (!focusRequesterModifierNode.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
            }
            int i4 = 16;
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
            Modifier.Node child$ui = focusRequesterModifierNode.getNode().getChild$ui();
            if (child$ui == null) {
                DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, focusRequesterModifierNode.getNode(), false);
            } else {
                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
            }
            while (true) {
                int i5 = oncreatevirtualviewtranslationrequests.read;
                if (i5 == 0) {
                    break;
                }
                Modifier.Node nodePop = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i5 - 1);
                if ((nodePop.getAggregateChildKindSet$ui() & iM2551constructorimpl) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, nodePop, false);
                } else {
                    while (nodePop != null) {
                        if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    if (((FocusTargetNode) nodePop).mo384requestFocus3ESFkO8(i)) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    if ((nodePop.getKindSet$ui() & iM2551constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                        Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui();
                                        int i6 = 0;
                                        while (delegate$ui != null) {
                                            if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    nodePop = delegate$ui;
                                                } else {
                                                    if (oncreatevirtualviewtranslationrequests2 == null) {
                                                        oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[i4]);
                                                    }
                                                    if (nodePop != null) {
                                                        oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(nodePop);
                                                        nodePop = null;
                                                    }
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                                }
                                            }
                                            delegate$ui = delegate$ui.getChild$ui();
                                            i4 = 16;
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    i4 = 16;
                                }
                                nodePop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                                i4 = 16;
                            }
                            break;
                        }
                        nodePop = nodePop.getChild$ui();
                        i4 = 16;
                    }
                }
            }
        }
        return z;
    }

    public final boolean restoreFocusedChild() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.focusRequesterNodes;
        int i = oncreatevirtualviewtranslationrequests.read;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            z = FocusRequesterModifierNodeKt.restoreFocusedChild((FocusRequesterModifierNode) objArr[i2]) || z;
        }
        return z;
    }

    public final boolean saveFocusedChild() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.focusRequesterNodes;
        int i = oncreatevirtualviewtranslationrequests.read;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        for (int i2 = 0; i2 < i; i2++) {
            if (FocusRequesterModifierNodeKt.saveFocusedChild((FocusRequesterModifierNode) objArr[i2])) {
                return true;
            }
        }
        return false;
    }

    public static final class Companion {

        /* JADX INFO: loaded from: classes4.dex */
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            private FocusRequesterFactory() {
            }

            public final FocusRequester component1() {
                return new FocusRequester();
            }

            public final FocusRequester component10() {
                return new FocusRequester();
            }

            public final FocusRequester component11() {
                return new FocusRequester();
            }

            public final FocusRequester component12() {
                return new FocusRequester();
            }

            public final FocusRequester component13() {
                return new FocusRequester();
            }

            public final FocusRequester component14() {
                return new FocusRequester();
            }

            public final FocusRequester component15() {
                return new FocusRequester();
            }

            public final FocusRequester component16() {
                return new FocusRequester();
            }

            public final FocusRequester component2() {
                return new FocusRequester();
            }

            public final FocusRequester component3() {
                return new FocusRequester();
            }

            public final FocusRequester component4() {
                return new FocusRequester();
            }

            public final FocusRequester component5() {
                return new FocusRequester();
            }

            public final FocusRequester component6() {
                return new FocusRequester();
            }

            public final FocusRequester component7() {
                return new FocusRequester();
            }

            public final FocusRequester component8() {
                return new FocusRequester();
            }

            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        public final FocusRequester getCancel() {
            return FocusRequester.Cancel;
        }

        public final FocusRequester getDefault() {
            return FocusRequester.Default;
        }

        public final FocusRequester getRedirect$ui() {
            return FocusRequester.Redirect;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    public static /* synthetic */ boolean m380requestFocus3ESFkO8$default(FocusRequester focusRequester, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = FocusDirection.Companion.m354getEnterdhqQ8s();
        }
        return focusRequester.m381requestFocus3ESFkO8(i);
    }
}

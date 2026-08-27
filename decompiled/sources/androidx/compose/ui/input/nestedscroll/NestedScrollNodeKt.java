package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class NestedScrollNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> T findNearestAttachedAncestor(T t) {
        final createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        TraversableNodeKt.traverseAncestors(t, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.findNearestAttachedAncestor.1
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Boolean invoke(TraversableNode traversableNode) {
                boolean z;
                if (traversableNode.getNode().isAttached()) {
                    createinappmessageeventsubscriber.IconCompatParcelizer = traversableNode;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        return (T) createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    public static final DelegatableNode nestedScrollModifierNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}

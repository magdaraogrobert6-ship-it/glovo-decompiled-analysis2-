package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import o.onCreateVirtualViewTranslationRequests;

/* JADX INFO: loaded from: classes.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m2391requireCoordinator64DMado(drawModifierNode, NodeKind.m2551constructorimpl(1)).invalidateLayer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void dispatchDraw(DelegatableNode delegatableNode, ContentDrawScope contentDrawScope) {
        ?? node = delegatableNode.getNode();
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(4);
        ?? oncreatevirtualviewtranslationrequests = 0;
        while (node != 0) {
            if (node instanceof DrawModifierNode) {
                ((DrawModifierNode) node).draw(contentDrawScope);
            } else if ((node.getKindSet$ui() & iM2551constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
                int i = 0;
                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                node = node;
                while (delegate$ui != null) {
                    if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                            node = delegate$ui;
                        } else {
                            if (oncreatevirtualviewtranslationrequests == 0) {
                                oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                            }
                            if (node != 0) {
                                oncreatevirtualviewtranslationrequests.IconCompatParcelizer(node);
                                node = 0;
                            }
                            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(delegate$ui);
                        }
                    }
                    delegate$ui = delegate$ui.getChild$ui();
                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequests;
                    node = node;
                }
                if (i == 1) {
                }
            }
            node = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests);
        }
    }
}

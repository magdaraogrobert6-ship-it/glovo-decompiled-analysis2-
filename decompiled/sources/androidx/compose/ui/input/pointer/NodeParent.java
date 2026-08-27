package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import o.ContentInViewNode;
import o.ContextMenuSpec;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public class NodeParent {
    public static final int $stable = 8;
    private final onCreateVirtualViewTranslationRequests children = new onCreateVirtualViewTranslationRequests(new Node[16]);
    private final ContentInViewNode removeMatchingPointerInputModifierNodeList = new ContentInViewNode(10);

    public final onCreateVirtualViewTranslationRequests getChildren() {
        return this.children;
    }

    public boolean buildCache(ContextMenuSpec contextMenuSpec, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.children;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((Node) objArr[i2]).buildCache(contextMenuSpec, layoutCoordinates, internalPointerEvent, z) || z2;
        }
        return z2;
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        for (int i = this.children.read - 1; -1 < i; i--) {
            if (((Node) this.children.write[i]).getPointerIds().isEmpty()) {
                this.children.write(i);
            }
        }
    }

    public final void clear() {
        this.children.RemoteActionCompatParcelizer();
    }

    public void dispatchCancel() {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.children;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).dispatchCancel();
        }
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.children;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            z = ((Node) objArr[i2]).dispatchFinalEventPass(internalPointerEvent) || z;
        }
        cleanUpHits(internalPointerEvent);
        return z;
    }

    public boolean dispatchMainEventPass(ContextMenuSpec contextMenuSpec, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.children;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((Node) objArr[i2]).dispatchMainEventPass(contextMenuSpec, layoutCoordinates, internalPointerEvent, z) || z2;
        }
        return z2;
    }

    public void removeInvalidPointerIdsAndChanges(long j, ContentInViewNode contentInViewNode) {
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.children;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            ((Node) objArr[i2]).removeInvalidPointerIdsAndChanges(j, contentInViewNode);
        }
    }

    public void removePointerInputModifierNode(Modifier.Node node) {
        this.removeMatchingPointerInputModifierNodeList.IconCompatParcelizer();
        this.removeMatchingPointerInputModifierNodeList.read(this);
        while (this.removeMatchingPointerInputModifierNodeList.RemoteActionCompatParcelizer()) {
            ContentInViewNode contentInViewNode = this.removeMatchingPointerInputModifierNodeList;
            NodeParent nodeParent = (NodeParent) contentInViewNode.write(contentInViewNode.IconCompatParcelizer - 1);
            int i = 0;
            while (true) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = nodeParent.children;
                if (i < oncreatevirtualviewtranslationrequests.read) {
                    Node node2 = (Node) oncreatevirtualviewtranslationrequests.write[i];
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{node2.getModifierNode(), node}, getCieXyz.write())).booleanValue()) {
                        nodeParent.children.RemoteActionCompatParcelizer(node2);
                        node2.dispatchCancel();
                    } else {
                        this.removeMatchingPointerInputModifierNodeList.read(node2);
                        i++;
                    }
                }
            }
        }
    }
}

package androidx.compose.ui.node;

import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onCreateVirtualViewTranslationRequests;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class OnPositionedDispatcher {
    private static final int MinArraySize = 16;
    private LayoutNode[] cachedNodes;
    private final onCreateVirtualViewTranslationRequests layoutNodes = new onCreateVirtualViewTranslationRequests(new LayoutNode[16]);
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class DepthComparator implements Comparator<LayoutNode> {
            public static final DepthComparator INSTANCE = new DepthComparator();

            private DepthComparator() {
            }

            @Override // java.util.Comparator
            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                int iSerializer = removeNodeAtDepth.serializer(layoutNode2.getDepth$ui(), layoutNode.getDepth$ui());
                return iSerializer != 0 ? iSerializer : removeNodeAtDepth.serializer(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatch() {
        LayoutNode[] layoutNodeArr;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = this.layoutNodes;
        Companion.DepthComparator depthComparator = Companion.DepthComparator.INSTANCE;
        Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
        int i = oncreatevirtualviewtranslationrequests2.read;
        depthComparator.getClass();
        int i2 = 0;
        Arrays.sort(objArr, 0, i, depthComparator);
        int i3 = this.layoutNodes.read;
        LayoutNode[] layoutNodeArr2 = this.cachedNodes;
        if (layoutNodeArr2 == null || layoutNodeArr2.length < i3) {
            layoutNodeArr = layoutNodeArr2;
            layoutNodeArr = new LayoutNode[Math.max(16, i3)];
        }
        layoutNodeArr = layoutNodeArr2;
        this.cachedNodes = null;
        while (true) {
            oncreatevirtualviewtranslationrequests = this.layoutNodes;
            if (i2 >= i3) {
                break;
            }
            layoutNodeArr[i2] = oncreatevirtualviewtranslationrequests.write[i2];
            i2++;
        }
        oncreatevirtualviewtranslationrequests.RemoteActionCompatParcelizer();
        while (true) {
            i3--;
            if (-1 >= i3) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[i3];
            layoutNode.getClass();
            if (layoutNode.getNeedsOnGloballyPositionedDispatch$ui()) {
                dispatchHierarchy(layoutNode);
            }
            layoutNodeArr[i3] = 0;
        }
    }

    public final boolean isNotEmpty() {
        return this.layoutNodes.read != 0;
    }

    public final void remove(LayoutNode layoutNode) {
        this.layoutNodes.RemoteActionCompatParcelizer(layoutNode);
    }

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            layoutNode.dispatchOnPositionedCallbacks$ui();
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(false);
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = layoutNode.get_children$ui();
            Object[] objArr = oncreatevirtualviewtranslationrequests.write;
            int i = oncreatevirtualviewtranslationrequests.read;
            for (int i2 = 0; i2 < i; i2++) {
                dispatchHierarchy((LayoutNode) objArr[i2]);
            }
        }
    }

    public final void onNodePositioned(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.IconCompatParcelizer(layoutNode);
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }

    public final void onRootNodePositioned(LayoutNode layoutNode) {
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            this.layoutNodes.RemoteActionCompatParcelizer();
            this.layoutNodes.IconCompatParcelizer(layoutNode);
            layoutNode.setNeedsOnGloballyPositionedDispatch$ui(true);
        }
    }
}

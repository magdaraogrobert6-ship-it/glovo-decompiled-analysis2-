package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import o.AnchoredDraggableState;
import o.ContentInViewNodeKt;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;
    private final boolean extraAssertions;
    private AnchoredDraggableState mapOfOriginalDepth;
    private final SortedSet<LayoutNode> set = new SortedSet<>(DepthSortedSetKt.DepthComparator);

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean zContains = this.set.contains(layoutNode);
        if (this.extraAssertions) {
            if (zContains == (safeMapOfOriginalDepth().serializer(layoutNode) >= 0)) {
                return zContains;
            }
            InlineClassHelperKt.throwIllegalStateException("inconsistency in TreeSet");
        }
        return zContains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final LayoutNode pop() {
        LayoutNode layoutNodeFirst = this.set.first();
        remove(layoutNodeFirst);
        return layoutNodeFirst;
    }

    public String toString() {
        return this.set.toString();
    }

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
    }

    private final AnchoredDraggableState safeMapOfOriginalDepth() {
        if (this.mapOfOriginalDepth == null) {
            AnchoredDraggableState anchoredDraggableState = ContentInViewNodeKt.read;
            this.mapOfOriginalDepth = new AnchoredDraggableState();
        }
        AnchoredDraggableState anchoredDraggableState2 = this.mapOfOriginalDepth;
        anchoredDraggableState2.getClass();
        return anchoredDraggableState2;
    }

    public final void popEach(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        while (!isEmpty()) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(pop());
        }
    }

    public final void add(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.add called on an unattached node");
        }
        if (this.extraAssertions) {
            AnchoredDraggableState anchoredDraggableStateSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            int iSerializer = anchoredDraggableStateSafeMapOfOriginalDepth.serializer(layoutNode);
            int i = iSerializer >= 0 ? anchoredDraggableStateSafeMapOfOriginalDepth.MediaMetadataCompat[iSerializer] : Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                anchoredDraggableStateSafeMapOfOriginalDepth.write(layoutNode.getDepth$ui(), layoutNode);
            } else if (i != layoutNode.getDepth$ui()) {
                InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        this.set.add(layoutNode);
    }

    public final boolean remove(LayoutNode layoutNode) {
        if (!layoutNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.set.remove(layoutNode);
        if (this.extraAssertions) {
            AnchoredDraggableState anchoredDraggableStateSafeMapOfOriginalDepth = safeMapOfOriginalDepth();
            if (anchoredDraggableStateSafeMapOfOriginalDepth.serializer(layoutNode) >= 0) {
                int iRemoteActionCompatParcelizer = anchoredDraggableStateSafeMapOfOriginalDepth.RemoteActionCompatParcelizer(layoutNode);
                int iSerializer = anchoredDraggableStateSafeMapOfOriginalDepth.serializer(layoutNode);
                if (iSerializer >= 0) {
                    anchoredDraggableStateSafeMapOfOriginalDepth.IconCompatParcelizer(iSerializer);
                }
                if (iRemoteActionCompatParcelizer == (zRemove ? layoutNode.getDepth$ui() : Integer.MAX_VALUE)) {
                    return zRemove;
                }
                InlineClassHelperKt.throwIllegalStateException("invalid node depth");
            }
        }
        return zRemove;
    }
}

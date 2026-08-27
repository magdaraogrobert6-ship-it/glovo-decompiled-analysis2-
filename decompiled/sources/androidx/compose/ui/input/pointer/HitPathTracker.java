package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import o.AnchoredDraggableKtanimateToWithDecay2;
import o.ContentInViewNode;
import o.createFromParcel;
import o.getCieXyz;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class HitPathTracker {
    public static final int $stable = 8;
    private boolean clearNodeCacheAfterDispatchedEvent;
    private boolean dispatchCancelAfterDispatchedEvent;
    private boolean dispatchingEvent;
    private boolean removeSpecificNodesAfterDispatchedEvent;
    private final LayoutCoordinates rootCoordinates;
    private final ContentInViewNode nodesToRemove = new ContentInViewNode();
    private final NodeParent root = new NodeParent();
    private final AnchoredDraggableKtanimateToWithDecay2 hitPointerIdsAndNodesForPruningNonMatches = new AnchoredDraggableKtanimateToWithDecay2(10);

    public final NodeParent getRoot$ui() {
        return this.root;
    }

    private final void removeInvalidPointerIdsAndChanges(long j, ContentInViewNode contentInViewNode) {
        this.root.removeInvalidPointerIdsAndChanges(j, contentInViewNode);
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean z) {
        ContentInViewNode contentInViewNode;
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z)) {
            return false;
        }
        boolean z2 = true;
        this.dispatchingEvent = true;
        boolean zDispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z);
        if (!this.root.dispatchFinalEventPass(internalPointerEvent) && !zDispatchMainEventPass) {
            z2 = false;
        }
        this.dispatchingEvent = false;
        if (this.removeSpecificNodesAfterDispatchedEvent) {
            this.removeSpecificNodesAfterDispatchedEvent = false;
            int i = this.nodesToRemove.IconCompatParcelizer;
            int i2 = 0;
            while (true) {
                contentInViewNode = this.nodesToRemove;
                if (i2 >= i) {
                    break;
                }
                removePointerInputModifierNode((Modifier.Node) contentInViewNode.RemoteActionCompatParcelizer(i2));
                i2++;
            }
            contentInViewNode.IconCompatParcelizer();
        }
        if (this.dispatchCancelAfterDispatchedEvent) {
            this.dispatchCancelAfterDispatchedEvent = false;
            processCancel();
        }
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = false;
            clearPreviouslyHitModifierNodeCache();
        }
        return z2;
    }

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        this.rootCoordinates = layoutCoordinates;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0109 A[LOOP:2: B:37:0x00d0->B:47:0x0109, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x010c A[EDGE_INSN: B:57:0x010c->B:48:0x010c BREAK  A[LOOP:2: B:37:0x00d0->B:47:0x0109], SYNTHETIC] */
    /* JADX INFO: renamed from: addHitPath-QJqDSyo, reason: not valid java name */
    public final void m1972addHitPathQJqDSyo(long j, List<? extends Modifier.Node> list, boolean z) {
        Node node;
        AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2;
        Object objSerializer;
        Object obj;
        NodeParent nodeParent = this.root;
        int size = list.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            final Modifier.Node node2 = list.get(i);
            if (node2.isAttached()) {
                node2.setDetachedListener$ui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.input.pointer.HitPathTracker$addHitPath$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1973invoke() {
                        this.this$0.removePointerInputModifierNode(node2);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1973invoke();
                        return createFromParcel.INSTANCE;
                    }
                });
                if (z2) {
                    onCreateVirtualViewTranslationRequests children = nodeParent.getChildren();
                    Object[] objArr = children.write;
                    int i2 = children.read;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((Node) obj).getModifierNode(), node2}, getCieXyz.write())).booleanValue()) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    Node node3 = (Node) obj;
                    if (node3 != null) {
                        node3.markIsIn();
                        node3.getPointerIds().add(j);
                        if (z) {
                            AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay3 = this.hitPointerIdsAndNodesForPruningNonMatches;
                            Object objSerializer2 = anchoredDraggableKtanimateToWithDecay3.serializer(j);
                            if (objSerializer2 == null) {
                                objSerializer2 = new ContentInViewNode();
                                anchoredDraggableKtanimateToWithDecay3.read(j, objSerializer2);
                            }
                            ((ContentInViewNode) objSerializer2).read(node3);
                        }
                        nodeParent = node3;
                    } else {
                        z2 = false;
                        node = new Node(node2);
                        node.getPointerIds().add(j);
                        if (z) {
                            anchoredDraggableKtanimateToWithDecay2 = this.hitPointerIdsAndNodesForPruningNonMatches;
                            objSerializer = anchoredDraggableKtanimateToWithDecay2.serializer(j);
                            if (objSerializer == null) {
                                objSerializer = new ContentInViewNode();
                                anchoredDraggableKtanimateToWithDecay2.read(j, objSerializer);
                            }
                            ((ContentInViewNode) objSerializer).read(node);
                        }
                        nodeParent.getChildren().IconCompatParcelizer(node);
                        nodeParent = node;
                    }
                } else {
                    node = new Node(node2);
                    node.getPointerIds().add(j);
                    if (z) {
                        anchoredDraggableKtanimateToWithDecay2 = this.hitPointerIdsAndNodesForPruningNonMatches;
                        objSerializer = anchoredDraggableKtanimateToWithDecay2.serializer(j);
                        if (objSerializer == null) {
                            objSerializer = new ContentInViewNode();
                            anchoredDraggableKtanimateToWithDecay2.read(j, objSerializer);
                        }
                        ((ContentInViewNode) objSerializer).read(node);
                    }
                    nodeParent.getChildren().IconCompatParcelizer(node);
                    nodeParent = node;
                }
            }
        }
        if (z) {
            AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay4 = this.hitPointerIdsAndNodesForPruningNonMatches;
            long[] jArr = anchoredDraggableKtanimateToWithDecay4.write;
            Object[] objArr2 = anchoredDraggableKtanimateToWithDecay4.MediaDescriptionCompat;
            long[] jArr2 = anchoredDraggableKtanimateToWithDecay4.read;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr2[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 != length) {
                            break;
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j2) < 128) {
                                int i7 = (i4 << 3) + i6;
                                removeInvalidPointerIdsAndChanges(jArr[i7], (ContentInViewNode) objArr2[i7]);
                            }
                            j2 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        } else if (i4 != length) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        this.hitPointerIdsAndNodesForPruningNonMatches.write();
    }

    /* JADX INFO: renamed from: addHitPath-QJqDSyo$default, reason: not valid java name */
    public static /* synthetic */ void m1971addHitPathQJqDSyo$default(HitPathTracker hitPathTracker, long j, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        hitPathTracker.m1972addHitPathQJqDSyo(j, list, z);
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePointerInputModifierNode(Modifier.Node node) {
        if (!this.dispatchingEvent) {
            this.root.removePointerInputModifierNode(node);
        } else {
            this.removeSpecificNodesAfterDispatchedEvent = true;
            this.nodesToRemove.read(node);
        }
    }

    public final void clearPreviouslyHitModifierNodeCache() {
        if (this.clearNodeCacheAfterDispatchedEvent) {
            this.clearNodeCacheAfterDispatchedEvent = true;
        } else {
            this.root.clear();
        }
    }

    public final void processCancel() {
        if (this.dispatchingEvent) {
            this.dispatchCancelAfterDispatchedEvent = true;
        } else {
            this.root.dispatchCancel();
            clearPreviouslyHitModifierNodeCache();
        }
    }
}

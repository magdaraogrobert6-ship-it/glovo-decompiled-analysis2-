package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import o.createFromParcel;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierLocalManager {
    public static final int $stable = 8;
    private boolean invalidated;
    private final Owner owner;
    private final onCreateVirtualViewTranslationRequests inserted = new onCreateVirtualViewTranslationRequests(new BackwardsCompatNode[16]);
    private final onCreateVirtualViewTranslationRequests insertedLocal = new onCreateVirtualViewTranslationRequests(new ModifierLocal[16]);
    private final onCreateVirtualViewTranslationRequests removed = new onCreateVirtualViewTranslationRequests(new LayoutNode[16]);
    private final onCreateVirtualViewTranslationRequests removedLocal = new onCreateVirtualViewTranslationRequests(new ModifierLocal[16]);

    public final Owner getOwner() {
        return this.owner;
    }

    public final void triggerUpdates() {
        this.invalidated = false;
        HashSet hashSet = new HashSet();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.removed;
        Object[] objArr = oncreatevirtualviewtranslationrequests.write;
        int i = oncreatevirtualviewtranslationrequests.read;
        for (int i2 = 0; i2 < i; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            ModifierLocal<?> modifierLocal = (ModifierLocal) this.removedLocal.write[i2];
            if (layoutNode.getNodes$ui().getHead$ui().isAttached()) {
                invalidateConsumersOfNodeForKey(layoutNode.getNodes$ui().getHead$ui(), modifierLocal, hashSet);
            }
        }
        this.removed.RemoteActionCompatParcelizer();
        this.removedLocal.RemoteActionCompatParcelizer();
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = this.inserted;
        Object[] objArr2 = oncreatevirtualviewtranslationrequests2.write;
        int i3 = oncreatevirtualviewtranslationrequests2.read;
        for (int i4 = 0; i4 < i3; i4++) {
            Modifier.Node node = (BackwardsCompatNode) objArr2[i4];
            ModifierLocal<?> modifierLocal2 = (ModifierLocal) this.insertedLocal.write[i4];
            if (node.isAttached()) {
                invalidateConsumersOfNodeForKey(node, modifierLocal2, hashSet);
            }
        }
        this.inserted.RemoteActionCompatParcelizer();
        this.insertedLocal.RemoteActionCompatParcelizer();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).updateModifierLocalConsumer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.Set, java.util.Set<androidx.compose.ui.node.BackwardsCompatNode>] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o.onCreateVirtualViewTranslationRequests] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> modifierLocal, Set<BackwardsCompatNode> set) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(32);
        if (!node.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
        Modifier.Node child$ui = node.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node.getNode(), false);
        } else {
            oncreatevirtualviewtranslationrequests.IconCompatParcelizer(child$ui);
        }
        while (true) {
            int i = oncreatevirtualviewtranslationrequests.read;
            if (i == 0) {
                return;
            }
            Modifier.Node node2 = (Modifier.Node) oncreatevirtualviewtranslationrequests.write(i - 1);
            if ((node2.getAggregateChildKindSet$ui() & iM2551constructorimpl) != 0) {
                Modifier.Node child$ui2 = node2;
                while (true) {
                    if (child$ui2 != null && child$ui2.isAttached()) {
                        if ((child$ui2.getKindSet$ui() & iM2551constructorimpl) != 0) {
                            ?? Pop = child$ui2;
                            ?? oncreatevirtualviewtranslationrequests2 = 0;
                            while (Pop != 0) {
                                if (Pop instanceof ModifierLocalModifierNode) {
                                    ModifierLocalModifierNode modifierLocalModifierNode = (ModifierLocalModifierNode) Pop;
                                    if (modifierLocalModifierNode instanceof BackwardsCompatNode) {
                                        BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalModifierNode;
                                        if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(modifierLocal)) {
                                            set.add(modifierLocalModifierNode);
                                        }
                                    }
                                    if (modifierLocalModifierNode.getProvidedValues().contains$ui(modifierLocal)) {
                                        break;
                                    }
                                } else if ((Pop.getKindSet$ui() & iM2551constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui = ((DelegatingNode) Pop).getDelegate$ui();
                                    int i2 = 0;
                                    Pop = Pop;
                                    oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                    while (delegate$ui != null) {
                                        if ((delegate$ui.getKindSet$ui() & iM2551constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                                Pop = delegate$ui;
                                            } else {
                                                if (oncreatevirtualviewtranslationrequests2 == 0) {
                                                    oncreatevirtualviewtranslationrequests2 = new onCreateVirtualViewTranslationRequests(new Modifier.Node[16]);
                                                }
                                                if (Pop != 0) {
                                                    oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(Pop);
                                                    Pop = 0;
                                                }
                                                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(delegate$ui);
                                            }
                                        }
                                        delegate$ui = delegate$ui.getChild$ui();
                                        Pop = Pop;
                                        oncreatevirtualviewtranslationrequests2 = oncreatevirtualviewtranslationrequests2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(oncreatevirtualviewtranslationrequests2);
                            }
                        }
                        child$ui2 = child$ui2.getChild$ui();
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(oncreatevirtualviewtranslationrequests, node2, false);
        }
    }

    public final void insertedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.inserted.IconCompatParcelizer(backwardsCompatNode);
        this.insertedLocal.IconCompatParcelizer(modifierLocal);
        invalidate();
    }

    public final void removedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.removed.IconCompatParcelizer(DelegatableNodeKt.requireLayoutNode(backwardsCompatNode));
        this.removedLocal.IconCompatParcelizer(modifierLocal);
        invalidate();
    }

    public final void updatedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        this.inserted.IconCompatParcelizer(backwardsCompatNode);
        this.insertedLocal.IconCompatParcelizer(modifierLocal);
        invalidate();
    }

    public ModifierLocalManager(Owner owner) {
        this.owner = owner;
    }

    public final void invalidate() {
        if (this.invalidated) {
            return;
        }
        this.invalidated = true;
        this.owner.registerOnEndApplyChangesListener(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.modifier.ModifierLocalManager.invalidate.1
            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2369invoke();
                return createFromParcel.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2369invoke() {
                ModifierLocalManager.this.triggerUpdates();
            }
        });
    }
}

package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import o.SelectionHandleIcon;
import o.getCieXyz;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode> {
    public final SelectionHandleIcon IconCompatParcelizer;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;
    public final AnchoredDraggableState write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        DraggableAnchorsNode draggableAnchorsNode = new DraggableAnchorsNode();
        draggableAnchorsNode.read = this.write;
        draggableAnchorsNode.serializer = this.RemoteActionCompatParcelizer;
        draggableAnchorsNode.IconCompatParcelizer = this.IconCompatParcelizer;
        return draggableAnchorsNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return this.IconCompatParcelizer.hashCode() + ((this.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        DraggableAnchorsNode draggableAnchorsNode = (DraggableAnchorsNode) node;
        draggableAnchorsNode.read = this.write;
        draggableAnchorsNode.serializer = this.RemoteActionCompatParcelizer;
        draggableAnchorsNode.IconCompatParcelizer = this.IconCompatParcelizer;
    }

    public DraggableAnchorsElement(AnchoredDraggableState anchoredDraggableState, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, SelectionHandleIcon selectionHandleIcon) {
        this.write = anchoredDraggableState;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.IconCompatParcelizer = selectionHandleIcon;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, draggableAnchorsElement.write}, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == draggableAnchorsElement.RemoteActionCompatParcelizer && this.IconCompatParcelizer == draggableAnchorsElement.IconCompatParcelizer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            return;
        }
        InspectableValueKt.getNoInspectorInfo();
    }
}

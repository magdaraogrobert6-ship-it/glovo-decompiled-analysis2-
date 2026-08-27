package o;

/* JADX INFO: loaded from: classes.dex */
final class PersistentVector extends androidx.compose.ui.node.ModifierNodeElement<SnapshotIdSetiterator1> {
    public final androidx.compose.foundation.relocation.BringIntoViewRequesterImpl read;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        SnapshotIdSetiterator1 snapshotIdSetiterator1 = new SnapshotIdSetiterator1();
        snapshotIdSetiterator1.read = this.read;
        return snapshotIdSetiterator1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersistentVector)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, ((PersistentVector) obj).read}, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.read);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        SnapshotIdSetiterator1 snapshotIdSetiterator1 = (SnapshotIdSetiterator1) node;
        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl = snapshotIdSetiterator1.read;
        if (bringIntoViewRequesterImpl instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) {
            bringIntoViewRequesterImpl.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(snapshotIdSetiterator1);
        }
        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl2 = this.read;
        if (bringIntoViewRequesterImpl2 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) {
            bringIntoViewRequesterImpl2.RemoteActionCompatParcelizer.IconCompatParcelizer(snapshotIdSetiterator1);
        }
        snapshotIdSetiterator1.read = bringIntoViewRequesterImpl2;
    }

    public PersistentVector(androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl) {
        this.read = bringIntoViewRequesterImpl;
    }
}

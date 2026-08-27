package o;

/* JADX INFO: loaded from: classes.dex */
public final class SnapshotIdSetiterator1 extends androidx.compose.ui.Modifier.Node {
    public androidx.compose.foundation.relocation.BringIntoViewRequesterImpl read;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl = this.read;
        boolean z = bringIntoViewRequesterImpl instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
        if (z) {
            bringIntoViewRequesterImpl.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
        if (z) {
            bringIntoViewRequesterImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(this);
        }
        this.read = bringIntoViewRequesterImpl;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.foundation.relocation.BringIntoViewRequesterImpl bringIntoViewRequesterImpl = this.read;
        if (bringIntoViewRequesterImpl instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) {
            bringIntoViewRequesterImpl.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
    }
}

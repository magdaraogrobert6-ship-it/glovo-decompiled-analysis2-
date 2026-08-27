package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
final class SwitchTokens extends androidx.compose.ui.node.ModifierNodeElement<SheetBottomTokens> {
    public final SelectionHandleIcon IconCompatParcelizer;
    public final SmallIconButtonTokens read;
    public final boolean serializer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final androidx.compose.ui.Modifier.Node create() {
        return new SheetBottomTokens(this.write, this.read, this.IconCompatParcelizer, this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        return Boolean.hashCode(false) + d$$ExternalSyntheticOutline0.m((this.IconCompatParcelizer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31, 31, this.serializer);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.ui.Modifier.Node node) {
        SheetBottomTokens sheetBottomTokens = (SheetBottomTokens) node;
        sheetBottomTokens.write = this.write;
        sheetBottomTokens.MediaSessionCompatQueueItem = this.read;
        SelectionHandleIcon selectionHandleIcon = sheetBottomTokens.serializer;
        SelectionHandleIcon selectionHandleIcon2 = this.IconCompatParcelizer;
        if (selectionHandleIcon != selectionHandleIcon2) {
            sheetBottomTokens.serializer = selectionHandleIcon2;
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(sheetBottomTokens);
        }
        boolean z = sheetBottomTokens.MediaBrowserCompatMediaItem;
        boolean z2 = this.serializer;
        if (z == z2) {
            return;
        }
        sheetBottomTokens.MediaBrowserCompatMediaItem = z2;
        sheetBottomTokens.write();
        androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(sheetBottomTokens);
    }

    public SwitchTokens(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SmallIconButtonTokens smallIconButtonTokens, SelectionHandleIcon selectionHandleIcon, boolean z) {
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.read = smallIconButtonTokens;
        this.IconCompatParcelizer = selectionHandleIcon;
        this.serializer = z;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchTokens)) {
            return false;
        }
        SwitchTokens switchTokens = (SwitchTokens) obj;
        if (this.write != switchTokens.write) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, switchTokens.read}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == switchTokens.IconCompatParcelizer && this.serializer == switchTokens.serializer;
    }
}

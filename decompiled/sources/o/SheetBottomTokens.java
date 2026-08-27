package o;

/* JADX INFO: loaded from: classes.dex */
public final class SheetBottomTokens extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.SemanticsModifierNode {
    public final SnackbarTokens IconCompatParcelizer = new SnackbarTokens(this, 0);
    public boolean MediaBrowserCompatMediaItem;
    public SmallIconButtonTokens MediaSessionCompatQueueItem;
    public SnackbarTokens RemoteActionCompatParcelizer;
    public androidx.compose.ui.semantics.ScrollAxisRange read;
    public SelectionHandleIcon serializer;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.indexForKey(semanticsPropertyReceiver, this.IconCompatParcelizer);
        SelectionHandleIcon selectionHandleIcon = this.serializer;
        SelectionHandleIcon selectionHandleIcon2 = SelectionHandleIcon.Vertical;
        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = this.read;
        if (selectionHandleIcon == selectionHandleIcon2) {
            if (scrollAxisRange == null) {
                removeNodeAtDepth.serializer("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            if (scrollAxisRange == null) {
                removeNodeAtDepth.serializer("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
        }
        SnackbarTokens snackbarTokens = this.RemoteActionCompatParcelizer;
        if (snackbarTokens != null) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.scrollToIndex$default(semanticsPropertyReceiver, null, snackbarTokens, 1, null);
        }
        androidx.compose.ui.semantics.SemanticsPropertiesKt.getScrollViewportLength$default(semanticsPropertyReceiver, null, new getRoot(this, 2), 1, null);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, this.MediaSessionCompatQueueItem.serializer());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public SheetBottomTokens(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SmallIconButtonTokens smallIconButtonTokens, SelectionHandleIcon selectionHandleIcon, boolean z) {
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = smallIconButtonTokens;
        this.serializer = selectionHandleIcon;
        this.MediaBrowserCompatMediaItem = z;
        write();
    }

    public final void write() {
        int i = 1;
        this.read = new androidx.compose.ui.semantics.ScrollAxisRange(new getRoot(this, 0), new getRoot(this, 1), false);
        this.RemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem ? new SnackbarTokens(this, i) : null;
    }
}

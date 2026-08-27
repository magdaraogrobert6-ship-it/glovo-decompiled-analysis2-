package o;

/* JADX INFO: loaded from: classes.dex */
public final class ExtendedFabLargeTokens implements androidx.compose.ui.layout.PinnableContainer, androidx.compose.ui.layout.PinnableContainer.PinnedHandle, ElevationTokens {
    public androidx.compose.ui.layout.PinnableContainer.PinnedHandle IconCompatParcelizer;
    public final androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final Object read;
    public boolean write;
    public int serializer = -1;
    public final PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(null);

    public ExtendedFabLargeTokens(Object obj, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.read = obj;
        this.MediaDescriptionCompat = lazyLayoutPinnedItemList;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public final void release() {
        if (this.write) {
            return;
        }
        if (this.MediaMetadataCompat <= 0) {
            TriStateCheckbox.RemoteActionCompatParcelizer("Release should only be called once");
        }
        int i = this.MediaMetadataCompat - 1;
        this.MediaMetadataCompat = i;
        if (i == 0) {
            this.MediaDescriptionCompat.read.remove(this);
            androidx.compose.ui.layout.PinnableContainer.PinnedHandle pinnedHandle = this.IconCompatParcelizer;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.IconCompatParcelizer = null;
        }
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public final androidx.compose.ui.layout.PinnableContainer.PinnedHandle pin() {
        if (this.write) {
            TriStateCheckbox.RemoteActionCompatParcelizer("Pin should not be called on an already disposed item ");
        }
        if (this.MediaMetadataCompat == 0) {
            this.MediaDescriptionCompat.read.add(this);
            androidx.compose.ui.layout.PinnableContainer pinnableContainer = (androidx.compose.ui.layout.PinnableContainer) ((onShowTranslationui) this.RemoteActionCompatParcelizer).getValue();
            this.IconCompatParcelizer = pinnableContainer != null ? pinnableContainer.pin() : null;
        }
        this.MediaMetadataCompat++;
        return this;
    }
}

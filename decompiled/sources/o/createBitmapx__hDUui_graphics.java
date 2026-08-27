package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class createBitmapx__hDUui_graphics {
    public computeHorizontalBoundsdefault IconCompatParcelizer;
    public boolean MediaMetadataCompat;
    public clampValidRootInUnitRange RemoteActionCompatParcelizer;

    public abstract void read();

    public abstract void read(composeColorSpaceui_graphics composecolorspaceui_graphics);

    public abstract void serializer(composeColorSpaceui_graphics composecolorspaceui_graphics);

    public abstract void write();

    public final void serializer() {
        clampValidRootInUnitRange clampvalidrootinunitrange = this.RemoteActionCompatParcelizer;
        if (clampvalidrootinunitrange == null || !clampvalidrootinunitrange.write.remove(this)) {
            return;
        }
        computeHorizontalBounds computehorizontalbounds = clampvalidrootinunitrange.read;
        computehorizontalbounds.getClass();
        if (equals(computehorizontalbounds.MediaMetadataCompat)) {
            if (computehorizontalbounds.MediaSessionCompatQueueItem == -1) {
                write();
            }
            computehorizontalbounds.MediaMetadataCompat = null;
            computehorizontalbounds.MediaSessionCompatQueueItem = 0;
            computehorizontalbounds.PlaybackStateCompatCustomAction = null;
        }
        computehorizontalbounds.ParcelableVolumeInfo.remove(this);
        computehorizontalbounds.RemoteActionCompatParcelizer.remove(this);
        this.RemoteActionCompatParcelizer = null;
        computehorizontalbounds.read();
    }

    public final void read(boolean z) {
        computeHorizontalBounds computehorizontalbounds;
        if (this.MediaMetadataCompat == z) {
            return;
        }
        this.MediaMetadataCompat = z;
        clampValidRootInUnitRange clampvalidrootinunitrange = this.RemoteActionCompatParcelizer;
        if (clampvalidrootinunitrange == null || (computehorizontalbounds = clampvalidrootinunitrange.read) == null) {
            return;
        }
        computehorizontalbounds.read();
    }
}

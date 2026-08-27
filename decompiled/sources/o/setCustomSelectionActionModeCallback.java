package o;

/* JADX INFO: loaded from: classes.dex */
public final class setCustomSelectionActionModeCallback {
    public boolean IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaSessionCompatQueueItem;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public boolean serializer;
    public int write;

    public final void write(int i, int i2) {
        this.RatingCompat = i;
        this.write = i2;
        this.IconCompatParcelizer = true;
        if (this.serializer) {
            if (i2 != Integer.MIN_VALUE) {
                this.MediaBrowserCompatMediaItem = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.MediaSessionCompatQueueItem = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.MediaBrowserCompatMediaItem = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.MediaSessionCompatQueueItem = i2;
        }
    }
}

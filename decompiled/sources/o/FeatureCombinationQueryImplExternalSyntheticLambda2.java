package o;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureCombinationQueryImplExternalSyntheticLambda2 extends getTitleTextView {
    public final int MediaMetadataCompat;
    public final Object MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final setTitleMarginStart write;

    @Override // o.getTitleTextView, o.getInflatedId
    public final int RatingCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // o.getTitleTextView, o.getInflatedId
    public final setTitleMarginStart read() {
        return this.write;
    }

    @Override // o.getTitleTextView, o.getInflatedId
    public final int serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(android.graphics.Rect rect) {
        if (rect != null) {
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            if (!rect2.intersect(0, 0, this.MediaMetadataCompat, this.RemoteActionCompatParcelizer)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.MediaSessionCompatQueueItem) {
        }
    }

    public FeatureCombinationQueryImplExternalSyntheticLambda2(getInflatedId getinflatedid, android.util.Size size, setTitleMarginStart settitlemarginstart) {
        super(getinflatedid);
        this.MediaSessionCompatQueueItem = new Object();
        if (size == null) {
            this.MediaMetadataCompat = this.IconCompatParcelizer.RatingCompat();
            this.RemoteActionCompatParcelizer = this.IconCompatParcelizer.serializer();
        } else {
            this.MediaMetadataCompat = size.getWidth();
            this.RemoteActionCompatParcelizer = size.getHeight();
        }
        this.write = settitlemarginstart;
    }
}

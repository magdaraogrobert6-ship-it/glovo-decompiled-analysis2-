package o;

/* JADX INFO: loaded from: classes.dex */
public class createGraphicsLayer extends releaseGraphicsLayer {
    public int MediaSessionCompatResultReceiverWrapper;

    public createGraphicsLayer(component50d7_KjU component50d7_kju) {
        super(component50d7_kju);
        if (component50d7_kju instanceof component40d7_KjU) {
            this.RatingCompat = setGraphicsContext.HORIZONTAL_DIMENSION;
        } else {
            this.RatingCompat = setGraphicsContext.VERTICAL_DIMENSION;
        }
    }

    @Override // o.releaseGraphicsLayer
    public final void IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        this.MediaBrowserCompatMediaItem = true;
        this.PlaybackStateCompat = i;
        for (releaseGraphicsLayers releasegraphicslayers : this.RemoteActionCompatParcelizer) {
            releasegraphicslayers.IconCompatParcelizer(releasegraphicslayers);
        }
    }
}

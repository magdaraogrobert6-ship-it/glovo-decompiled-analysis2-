package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setCountrylambda1 {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public Object MediaSessionCompatQueueItem;
    public Object PlaybackStateCompatCustomAction;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public setCustomWebViewActivityClass read() {
        if (((Long) this.RemoteActionCompatParcelizer) == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'timestamp' is missing");
            return null;
        }
        if (((createNotification) this.write) != null) {
            return new setCustomWebViewActivityClass(this);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required field 'sensor_data' is missing");
        return null;
    }
}

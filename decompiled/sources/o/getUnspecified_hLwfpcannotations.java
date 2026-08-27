package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class getUnspecified_hLwfpcannotations {
    public int[] IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public boolean write;

    public final void read() {
        if (this.serializer == 0) {
            if (this.MediaDescriptionCompat > 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Rounded corners are not supported in contiguous indeterminate animation.");
            } else {
                if (this.IconCompatParcelizer.length >= 3) {
                    return;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}

package o;

import android.content.Context;
import android.view.GestureDetector;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class CombinedClickableNodehandleDownEvent1 {
    public float IconCompatParcelizer;
    public final GestureDetector MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public float MediaSessionCompatToken;
    public final int ParcelableVolumeInfo;
    public final StreamSharing$$ExternalSyntheticLambda0 PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public float RemoteActionCompatParcelizer;
    public int read;
    public float serializer;
    public boolean write;

    public final boolean read() {
        return this.read != 0;
    }

    public CombinedClickableNodehandleDownEvent1(Context context, StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0) {
        context.getClass();
        this.ParcelableVolumeInfo = android.view.ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.PlaybackStateCompatCustomAction = streamSharing$$ExternalSyntheticLambda0;
        this.MediaMetadataCompat = true;
        this.RatingCompat = true;
        this.MediaBrowserCompatMediaItem = new GestureDetector(context, new GestureNodeKtExternalSyntheticLambda0(this));
    }

    public final float write() {
        if (!read()) {
            float f = this.MediaSessionCompatToken;
            if (f > 0.0f) {
                return this.IconCompatParcelizer / f;
            }
            return 1.0f;
        }
        boolean z = this.write;
        boolean z2 = (z && this.IconCompatParcelizer < this.MediaSessionCompatToken) || (!z && this.IconCompatParcelizer > this.MediaSessionCompatToken);
        float fAbs = Math.abs(1.0f - (this.IconCompatParcelizer / this.MediaSessionCompatToken)) * 0.5f;
        if (this.MediaSessionCompatToken <= this.ParcelableVolumeInfo) {
            return 1.0f;
        }
        return z2 ? fAbs + 1.0f : 1.0f - fAbs;
    }
}

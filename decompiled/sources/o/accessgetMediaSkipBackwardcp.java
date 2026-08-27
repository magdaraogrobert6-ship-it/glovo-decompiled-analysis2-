package o;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMediaSkipBackwardcp {
    public float ComponentActivity;
    public int IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public int RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public float ResultReceiver;
    public boolean read;
    public int write;
    public int PlaybackStateCompat = Integer.MAX_VALUE;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Integer.MAX_VALUE;
    public int PlaybackStateCompatCustomAction = Integer.MIN_VALUE;
    public int serializer = Integer.MIN_VALUE;
    public final ArrayList MediaBrowserCompatMediaItem = new ArrayList();

    public final int serializer() {
        return this.MediaDescriptionCompat - this.MediaMetadataCompat;
    }

    public final void read(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.PlaybackStateCompat = Math.min(this.PlaybackStateCompat, (view.getLeft() - flexItem.MediaSessionCompatQueueItem()) - i);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = Math.min(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, (view.getTop() - flexItem.MediaDescriptionCompat()) - i2);
        this.PlaybackStateCompatCustomAction = Math.max(this.PlaybackStateCompatCustomAction, view.getRight() + flexItem.MediaMetadataCompat() + i3);
        this.serializer = Math.max(this.serializer, view.getBottom() + flexItem.RatingCompat() + i4);
    }
}

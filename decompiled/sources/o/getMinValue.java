package o;

import android.graphics.PointF;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getMinValue {
    public float IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public toXyui_graphics MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public float ParcelableVolumeInfo;
    public String PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public int RemoteActionCompatParcelizer;
    public PointF read;
    public PointF serializer;
    public String write;

    public final int hashCode() {
        int iM = (int) (af$$ExternalSyntheticOutline0.m(this.PlaybackStateCompatCustomAction.hashCode() * 31, 31, this.write) + this.MediaSessionCompatQueueItem);
        int iOrdinal = this.MediaMetadataCompat.ordinal();
        int i = this.MediaSessionCompatResultReceiverWrapper;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.MediaBrowserCompatMediaItem);
        return ((((((iOrdinal + (iM * 31)) * 31) + i) * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.RemoteActionCompatParcelizer;
    }
}

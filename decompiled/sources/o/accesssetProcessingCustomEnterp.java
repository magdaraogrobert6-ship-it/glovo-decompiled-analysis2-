package o;

/* JADX INFO: loaded from: classes.dex */
public final class accesssetProcessingCustomEnterp {
    public long IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public float MediaSessionCompatQueueItem;
    public long RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public long serializer;
    public int write;

    public final float write(long j) {
        long j2 = this.serializer;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.RatingCompat;
        if (j3 < 0 || j < j3) {
            return fetchFocusRectui.serializer((j - j2) / this.write, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.MediaDescriptionCompat;
        return (fetchFocusRectui.serializer((j - j3) / this.RemoteActionCompatParcelizer, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}

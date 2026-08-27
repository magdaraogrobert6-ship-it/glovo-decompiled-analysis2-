package o;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomJsonAdapter {
    public int IconCompatParcelizer;
    public FeatureInfoJsonAdapter MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    public final int RemoteActionCompatParcelizer() {
        boolean z = this.MediaDescriptionCompat;
        int i = this.read;
        return z ? ((this.MediaSessionCompatQueueItem / 8) - ((i - 1) / 8)) * i : (i * this.serializer) / 8;
    }
}

package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getDiagonalSizeimpl {
    public Boolean IconCompatParcelizer;
    public Integer MediaBrowserCompatMediaItem;
    public Integer MediaDescriptionCompat;
    public Integer MediaMetadataCompat;
    public Float MediaSessionCompatQueueItem;
    public Integer MediaSessionCompatToken;
    public Float RatingCompat;
    public Integer RemoteActionCompatParcelizer;
    public Boolean read;
    public Integer serializer;
    public Boolean write;

    public final int IconCompatParcelizer() {
        return (int) (this.MediaSessionCompatQueueItem.floatValue() * this.RemoteActionCompatParcelizer.intValue());
    }

    public final int RemoteActionCompatParcelizer() {
        return (int) (this.RatingCompat.floatValue() * this.serializer.intValue());
    }

    public static PinnableContainerKtLocalPinnableContainer1 write() {
        return new PinnableContainerKtLocalPinnableContainer1(25);
    }
}

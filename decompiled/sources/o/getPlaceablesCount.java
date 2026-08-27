package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getPlaceablesCount {
    public final long IconCompatParcelizer;
    public final Long MediaBrowserCompatMediaItem;
    public final long MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final Long MediaSessionCompatQueueItem;
    public final Boolean MediaSessionCompatResultReceiverWrapper;
    public final Long RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final long serializer;
    public final String write;

    public final getPlaceablesCount IconCompatParcelizer(long j) {
        return new getPlaceablesCount(this.RemoteActionCompatParcelizer, this.write, this.serializer, this.read, this.IconCompatParcelizer, j, this.MediaDescriptionCompat, this.RatingCompat, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem, this.MediaSessionCompatResultReceiverWrapper);
    }

    public final getPlaceablesCount RemoteActionCompatParcelizer(Long l, Long l2, Boolean bool) {
        return new getPlaceablesCount(this.RemoteActionCompatParcelizer, this.write, this.serializer, this.read, this.IconCompatParcelizer, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.RatingCompat, l, l2, bool);
    }

    public getPlaceablesCount(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(j >= 0);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(j2 >= 0);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(j3 >= 0);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(j5 >= 0);
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.serializer = j;
        this.read = j2;
        this.IconCompatParcelizer = j3;
        this.MediaMetadataCompat = j4;
        this.MediaDescriptionCompat = j5;
        this.RatingCompat = l;
        this.MediaBrowserCompatMediaItem = l2;
        this.MediaSessionCompatQueueItem = l3;
        this.MediaSessionCompatResultReceiverWrapper = bool;
    }
}

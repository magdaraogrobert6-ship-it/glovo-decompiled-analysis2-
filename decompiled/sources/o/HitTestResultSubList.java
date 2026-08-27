package o;

/* JADX INFO: loaded from: classes2.dex */
public final class HitTestResultSubList {
    public static final HitTestResultSubList IconCompatParcelizer;
    public static final HitTestResultSubList MediaBrowserCompatMediaItem;
    public static final HitTestResultSubList MediaDescriptionCompat;
    public static final HitTestResultSubList MediaMetadataCompat;
    public static final HitTestResultSubList MediaSessionCompatQueueItem;
    public static final HitTestResultSubList MediaSessionCompatResultReceiverWrapper;
    public static final HitTestResultSubList PlaybackStateCompatCustomAction;
    public static final HitTestResultSubList RatingCompat;
    public static final HitTestResultSubList RemoteActionCompatParcelizer;
    public static final HitTestResultSubList read;
    public static final HitTestResultSubList serializer;
    public static final HitTestResultSubList write;
    public final String MediaSessionCompatToken;
    public final /* synthetic */ int PlaybackStateCompat;

    public /* synthetic */ HitTestResultSubList(String str, int i) {
        this.PlaybackStateCompat = i;
        this.MediaSessionCompatToken = str;
    }

    public final String toString() {
        return this.MediaSessionCompatToken;
    }

    static {
        String str = "TINK";
        int i = 0;
        MediaSessionCompatQueueItem = new HitTestResultSubList(str, i);
        String str2 = "CRUNCHY";
        RemoteActionCompatParcelizer = new HitTestResultSubList(str2, i);
        String str3 = "NO_PREFIX";
        read = new HitTestResultSubList(str3, i);
        int i2 = 1;
        MediaBrowserCompatMediaItem = new HitTestResultSubList(str, i2);
        serializer = new HitTestResultSubList(str2, i2);
        MediaMetadataCompat = new HitTestResultSubList(str3, i2);
        int i3 = 2;
        MediaSessionCompatResultReceiverWrapper = new HitTestResultSubList(str, i3);
        IconCompatParcelizer = new HitTestResultSubList(str2, i3);
        MediaDescriptionCompat = new HitTestResultSubList(str3, i3);
        int i4 = 3;
        PlaybackStateCompatCustomAction = new HitTestResultSubList(str, i4);
        write = new HitTestResultSubList(str2, i4);
        RatingCompat = new HitTestResultSubList(str3, i4);
    }
}

package o;

/* JADX INFO: loaded from: classes2.dex */
public final class calculateSemanticsConfiguration {
    public static final calculateSemanticsConfiguration IconCompatParcelizer;
    public static final calculateSemanticsConfiguration MediaBrowserCompatMediaItem;
    public static final calculateSemanticsConfiguration MediaDescriptionCompat;
    public static final calculateSemanticsConfiguration MediaMetadataCompat;
    public static final calculateSemanticsConfiguration MediaSessionCompatQueueItem;
    public static final calculateSemanticsConfiguration MediaSessionCompatResultReceiverWrapper;
    public static final calculateSemanticsConfiguration MediaSessionCompatToken;
    public static final calculateSemanticsConfiguration PlaybackStateCompat;
    public static final calculateSemanticsConfiguration RatingCompat;
    public static final calculateSemanticsConfiguration RemoteActionCompatParcelizer;
    public static final calculateSemanticsConfiguration read;
    public static final calculateSemanticsConfiguration serializer;
    public static final calculateSemanticsConfiguration write;
    public final /* synthetic */ int ParcelableVolumeInfo;
    public final String PlaybackStateCompatCustomAction;

    public /* synthetic */ calculateSemanticsConfiguration(String str, int i) {
        this.ParcelableVolumeInfo = i;
        this.PlaybackStateCompatCustomAction = str;
    }

    public final String toString() {
        return this.PlaybackStateCompatCustomAction;
    }

    static {
        String str = "TINK";
        int i = 1;
        PlaybackStateCompat = new calculateSemanticsConfiguration(str, i);
        String str2 = "CRUNCHY";
        write = new calculateSemanticsConfiguration(str2, i);
        String str3 = "LEGACY";
        serializer = new calculateSemanticsConfiguration(str3, i);
        String str4 = "NO_PREFIX";
        MediaBrowserCompatMediaItem = new calculateSemanticsConfiguration(str4, i);
        int i2 = 2;
        MediaSessionCompatQueueItem = new calculateSemanticsConfiguration("SHA1", i2);
        MediaMetadataCompat = new calculateSemanticsConfiguration("SHA224", i2);
        RatingCompat = new calculateSemanticsConfiguration("SHA256", i2);
        MediaDescriptionCompat = new calculateSemanticsConfiguration("SHA384", i2);
        MediaSessionCompatToken = new calculateSemanticsConfiguration("SHA512", i2);
        int i3 = 0;
        MediaSessionCompatResultReceiverWrapper = new calculateSemanticsConfiguration(str, i3);
        IconCompatParcelizer = new calculateSemanticsConfiguration(str2, i3);
        RemoteActionCompatParcelizer = new calculateSemanticsConfiguration(str3, i3);
        read = new calculateSemanticsConfiguration(str4, i3);
    }
}

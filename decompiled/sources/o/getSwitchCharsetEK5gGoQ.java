package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getSwitchCharsetEK5gGoQ {
    public final /* synthetic */ int MediaSessionCompatResultReceiverWrapper;
    public static final getSwitchCharsetEK5gGoQ read = new getSwitchCharsetEK5gGoQ(0);
    public static final getSwitchCharsetEK5gGoQ IconCompatParcelizer = new getSwitchCharsetEK5gGoQ(1);
    public static final getSwitchCharsetEK5gGoQ MediaMetadataCompat = new getSwitchCharsetEK5gGoQ(2);
    public static final getSwitchCharsetEK5gGoQ RatingCompat = new getSwitchCharsetEK5gGoQ(3);
    public static final getSwitchCharsetEK5gGoQ MediaDescriptionCompat = new getSwitchCharsetEK5gGoQ(4);
    public static final getSwitchCharsetEK5gGoQ MediaSessionCompatQueueItem = new getSwitchCharsetEK5gGoQ(5);
    public static final getSwitchCharsetEK5gGoQ ParcelableVolumeInfo = new getSwitchCharsetEK5gGoQ(6);
    public static final getSwitchCharsetEK5gGoQ MediaSessionCompatToken = new getSwitchCharsetEK5gGoQ(7);
    public static final getSwitchCharsetEK5gGoQ PlaybackStateCompatCustomAction = new getSwitchCharsetEK5gGoQ(8);
    public static final getSwitchCharsetEK5gGoQ PlaybackStateCompat = new getSwitchCharsetEK5gGoQ(9);
    public static final getSwitchCharsetEK5gGoQ write = new getSwitchCharsetEK5gGoQ(10);
    public static final getSwitchCharsetEK5gGoQ serializer = new getSwitchCharsetEK5gGoQ(11);
    public static final getSwitchCharsetEK5gGoQ RemoteActionCompatParcelizer = new getSwitchCharsetEK5gGoQ(12);
    public static final getSwitchCharsetEK5gGoQ MediaBrowserCompatMediaItem = new getSwitchCharsetEK5gGoQ(13);

    public /* synthetic */ getSwitchCharsetEK5gGoQ(int i) {
        this.MediaSessionCompatResultReceiverWrapper = i;
    }

    public final boolean IconCompatParcelizer(int i) {
        switch (this.MediaSessionCompatResultReceiverWrapper) {
            case 0:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 1:
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return i == 0 || i == 1 || i == 2;
            case 3:
                return getThumbsDownEK5gGoQ.RemoteActionCompatParcelizer(i) != 0;
            case 4:
                return i == 0 || i == 1 || i == 2;
            case 5:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 6:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            case 7:
                return i == 0 || i == 1 || i == 2;
            case 8:
                return i == 0 || i == 1;
            case 9:
                return i == 1 || i == 2;
            case 10:
                return getWindowEK5gGoQ.zzb(i) != null;
            case 11:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
            case 12:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
        }
    }
}

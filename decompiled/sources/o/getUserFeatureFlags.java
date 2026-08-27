package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getUserFeatureFlags {
    public final int MediaSessionCompatResultReceiverWrapper;
    public final CustomJsonAdapter MediaSessionCompatToken;
    public final String PlaybackStateCompatCustomAction;
    public static final getUserFeatureFlags read = new getUserFeatureFlags("mceliece348864", 12, 3488, 64, false);
    public static final getUserFeatureFlags RemoteActionCompatParcelizer = new getUserFeatureFlags("mceliece348864f", 12, 3488, 64, true);
    public static final getUserFeatureFlags write = new getUserFeatureFlags("mceliece460896", 13, 4608, 96, false);
    public static final getUserFeatureFlags serializer = new getUserFeatureFlags("mceliece460896f", 13, 4608, 96, true);
    public static final getUserFeatureFlags MediaMetadataCompat = new getUserFeatureFlags("mceliece6688128", 13, 6688, androidx.compose.ui.graphics.Fields.SpotShadowColor, false);
    public static final getUserFeatureFlags IconCompatParcelizer = new getUserFeatureFlags("mceliece6688128f", 13, 6688, androidx.compose.ui.graphics.Fields.SpotShadowColor, true);
    public static final getUserFeatureFlags MediaDescriptionCompat = new getUserFeatureFlags("mceliece6960119", 13, 6960, 119, false);
    public static final getUserFeatureFlags MediaBrowserCompatMediaItem = new getUserFeatureFlags("mceliece6960119f", 13, 6960, 119, true);
    public static final getUserFeatureFlags MediaSessionCompatQueueItem = new getUserFeatureFlags("mceliece8192128", 13, 8192, androidx.compose.ui.graphics.Fields.SpotShadowColor, false);
    public static final getUserFeatureFlags RatingCompat = new getUserFeatureFlags("mceliece8192128f", 13, 8192, androidx.compose.ui.graphics.Fields.SpotShadowColor, true);

    public getUserFeatureFlags(String str, int i, int i2, int i3, boolean z) {
        this.PlaybackStateCompatCustomAction = str;
        this.MediaSessionCompatResultReceiverWrapper = i3;
        CustomJsonAdapter customJsonAdapter = new CustomJsonAdapter();
        customJsonAdapter.MediaMetadataCompat = z;
        customJsonAdapter.MediaSessionCompatQueueItem = i2;
        customJsonAdapter.RatingCompat = i3;
        customJsonAdapter.write = i;
        customJsonAdapter.IconCompatParcelizer = i3 * 2;
        int i4 = i3 * i;
        customJsonAdapter.read = i4;
        customJsonAdapter.serializer = i2 - i4;
        char c = 1;
        customJsonAdapter.RemoteActionCompatParcelizer = (1 << i) - 1;
        customJsonAdapter.MediaBrowserCompatMediaItem = i == 12 ? new FeatureInfoJsonAdapter(0) : new FeatureInfoJsonAdapter(c == true ? 1 : 0);
        customJsonAdapter.MediaDescriptionCompat = i3 % 8 != 0;
        this.MediaSessionCompatToken = customJsonAdapter;
    }
}

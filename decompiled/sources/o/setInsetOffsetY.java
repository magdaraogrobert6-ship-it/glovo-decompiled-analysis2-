package o;

/* JADX INFO: loaded from: classes3.dex */
public final class setInsetOffsetY {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public static final setInsetOffsetY RemoteActionCompatParcelizer = new setInsetOffsetY(true, true);
    public static final setInsetOffsetY serializer = new setInsetOffsetY(false, false);
    public static final setInsetOffsetY write = new setInsetOffsetY(false, false);
    public final boolean IconCompatParcelizer;
    public final boolean read;

    static {
        int i = MediaSessionCompatQueueItem + 61;
        MediaBrowserCompatMediaItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public setInsetOffsetY(boolean z, boolean z2) {
        this.IconCompatParcelizer = z;
        this.read = z2;
    }
}

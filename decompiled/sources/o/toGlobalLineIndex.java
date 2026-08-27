package o;

/* JADX INFO: loaded from: classes3.dex */
public final class toGlobalLineIndex implements toGlobal {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat = 1;
    private static int serializer;
    public final /* synthetic */ int read;
    public static final toGlobalLineIndex write = new toGlobalLineIndex(1);
    public static final toGlobalLineIndex RemoteActionCompatParcelizer = new toGlobalLineIndex(0);
    public static final toGlobalLineIndex IconCompatParcelizer = new toGlobalLineIndex(2);

    public /* synthetic */ toGlobalLineIndex(int i) {
        this.read = i;
    }

    static {
        int i = serializer + 27;
        RatingCompat = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.toGlobal
    public final Throwable read() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.read != 0) {
            return null;
        }
        int i4 = i3 + 31;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public final class LocaleListSaverlambda0 implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    private static int read;
    public static final LocaleListSaverlambda0 serializer = new LocaleListSaverlambda0(0);
    public static final LocaleListSaverlambda0 write = new LocaleListSaverlambda0(1);
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ LocaleListSaverlambda0(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    static {
        int i = IconCompatParcelizer + 95;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 9;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.RemoteActionCompatParcelizer == 0) {
            return new LocaleListSaverlambda1();
        }
        LocaleListSaverlambda1 localeListSaverlambda1 = new LocaleListSaverlambda1();
        int i3 = MediaSessionCompatQueueItem + 79;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return localeListSaverlambda1;
        }
        throw null;
    }
}

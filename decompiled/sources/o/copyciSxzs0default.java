package o;

/* JADX INFO: loaded from: classes3.dex */
public final class copyciSxzs0default extends Paragraph_EkL_Ydefault {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public static final copyciSxzs0default IconCompatParcelizer = new copyciSxzs0default(0);
    public static final copyciSxzs0default RemoteActionCompatParcelizer = new copyciSxzs0default(1);

    public /* synthetic */ copyciSxzs0default(int i) {
        this.read = i;
    }

    static {
        int i = write + 33;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.Paragraph_EkL_Ydefault
    public final String read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        if (this.read == 0) {
            return "customer_chat_close";
        }
        int i5 = i3 + 17;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "customer_chat_message_sent";
    }
}

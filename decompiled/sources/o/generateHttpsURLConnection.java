package o;

/* JADX INFO: loaded from: classes3.dex */
public final class generateHttpsURLConnection implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final generateHttpsURLConnection read = new generateHttpsURLConnection();
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = serializer + 9;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return createfromparcel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

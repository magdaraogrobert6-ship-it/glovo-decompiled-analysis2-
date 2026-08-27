package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class lambdasetPushToken33 {
    private static int read = 1;
    private static int serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[lambdaremoveGlobalPartnerParameter26.values().length];
        try {
            iArr[lambdaremoveGlobalPartnerParameter26.DISCONNECTED.ordinal()] = 1;
            int i = read + 113;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lambdaremoveGlobalPartnerParameter26.CONNECTED.ordinal()] = 2;
            int i4 = serializer + 45;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
    }
}

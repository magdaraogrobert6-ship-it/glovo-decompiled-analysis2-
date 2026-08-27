package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class re {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int read = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[createDeeplinkIntentI.values().length];
        try {
            iArr[createDeeplinkIntentI.OPEN_APP.ordinal()] = 1;
            int i = 2 % 2;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[createDeeplinkIntentI.OPEN_SENDBIRD.ordinal()] = 2;
            int i2 = serializer + 97;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[createDeeplinkIntentI.OPEN_HELP_CENTER_CHAT.ordinal()] = 3;
            int i5 = read + 57;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused3) {
        }
        IconCompatParcelizer = iArr;
    }
}

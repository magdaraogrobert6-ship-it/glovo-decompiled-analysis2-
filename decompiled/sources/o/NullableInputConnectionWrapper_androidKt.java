package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class NullableInputConnectionWrapper_androidKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[PasswordVisualTransformation.values().length];
        try {
            iArr[PasswordVisualTransformation.LIKE_PRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PasswordVisualTransformation.LIKE_UNPRESSED.ordinal()] = 2;
            int i = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PasswordVisualTransformation.DISLIKE_PRESSED.ordinal()] = 3;
            int i2 = serializer + 23;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 2 / 5;
            } else {
                int i4 = 2 % 2;
            }
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PasswordVisualTransformation.DISLIKE_UNPRESSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        write = iArr;
        int i5 = IconCompatParcelizer + 43;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class hideSoftwareKeyboard {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[PasswordVisualTransformation.values().length];
        try {
            iArr[PasswordVisualTransformation.LIKE_PRESSED.ordinal()] = 1;
            int i = IconCompatParcelizer + 49;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PasswordVisualTransformation.LIKE_UNPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PasswordVisualTransformation.DISLIKE_PRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PasswordVisualTransformation.DISLIKE_UNPRESSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        read = iArr;
        int[] iArr2 = new int[showSoftInput.values().length];
        try {
            iArr2[showSoftInput.EXPANDED.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[showSoftInput.COLLAPSED.ordinal()] = 2;
            int i4 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        serializer = iArr2;
        int i5 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

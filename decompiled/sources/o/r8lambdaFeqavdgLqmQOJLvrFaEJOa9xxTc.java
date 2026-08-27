package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaFeqavdgLqmQOJLvrFaEJOa9xxTc {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final /* synthetic */ int[] serializer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.values().length];
        try {
            iArr[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.BIOMETRIC_AUTHENTICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r8lambda7pyt14UIEAHlPrgfcZvSQChoL6U.SAFETY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        write = iArr;
        int[] iArr2 = new int[r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.values().length];
        try {
            iArr2[r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.CHAT_LANGUAGE.ordinal()] = 1;
        } catch (Exception e) {
            throw e;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.APPEARANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.NAVIGATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.OPEN_SOURCE_LICENSES.ordinal()] = 4;
            int i = read + 77;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 5 / 4;
            } else {
                int i3 = 2 % 2;
            }
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.DEVELOPER_MENU.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[r8lambda5weVaLnJrZw3JZ5gurH6kjpdo.DATA_PRIVACY_SETTINGS.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        serializer = iArr2;
        int[] iArr3 = new int[r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4.values().length];
        try {
            iArr3[r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4.DEVICE_SETTINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        IconCompatParcelizer = iArr3;
        int i4 = read + 125;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

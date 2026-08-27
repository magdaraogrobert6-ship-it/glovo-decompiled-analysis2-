package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PasswordVisualTransformation {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ PasswordVisualTransformation[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public static final PasswordVisualTransformation LIKE_PRESSED = new PasswordVisualTransformation("LIKE_PRESSED", 0);
    public static final PasswordVisualTransformation LIKE_UNPRESSED = new PasswordVisualTransformation("LIKE_UNPRESSED", 1);
    public static final PasswordVisualTransformation DISLIKE_PRESSED = new PasswordVisualTransformation("DISLIKE_PRESSED", 2);
    public static final PasswordVisualTransformation DISLIKE_UNPRESSED = new PasswordVisualTransformation("DISLIKE_UNPRESSED", 3);

    private PasswordVisualTransformation(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 31;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        PasswordVisualTransformation[] passwordVisualTransformationArr$values = $values();
        $VALUES = passwordVisualTransformationArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) passwordVisualTransformationArr$values);
        int i = write + 79;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static PasswordVisualTransformation valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        PasswordVisualTransformation passwordVisualTransformation = (PasswordVisualTransformation) Enum.valueOf(PasswordVisualTransformation.class, str);
        int i3 = IconCompatParcelizer + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return passwordVisualTransformation;
    }

    public static PasswordVisualTransformation[] values() {
        int i = 2 % 2;
        int i2 = read + 69;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PasswordVisualTransformation[] passwordVisualTransformationArr = (PasswordVisualTransformation[]) $VALUES.clone();
        int i4 = read + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return passwordVisualTransformationArr;
    }

    private static final /* synthetic */ PasswordVisualTransformation[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        PasswordVisualTransformation[] passwordVisualTransformationArr = {LIKE_PRESSED, LIKE_UNPRESSED, DISLIKE_PRESSED, DISLIKE_UNPRESSED};
        int i5 = i2 + 53;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return passwordVisualTransformationArr;
    }
}

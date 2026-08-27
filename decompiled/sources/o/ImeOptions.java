package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ImeOptions {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ImeOptions[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String rawValue;
    public static final ImeOptions LIKE = new ImeOptions("LIKE", 0, "like");
    public static final ImeOptions DISLIKE = new ImeOptions("DISLIKE", 1, "dislike");
    public static final ImeOptions SWIPE_RIGHT = new ImeOptions("SWIPE_RIGHT", 2, "swipe right");
    public static final ImeOptions SWIPE_LEFT = new ImeOptions("SWIPE_LEFT", 3, "swipe left");
    public static final ImeOptions ADD_PHOTO = new ImeOptions("ADD_PHOTO", 4, "add photo");
    public static final ImeOptions EXPAND_NOTES = new ImeOptions("EXPAND_NOTES", 5, "expand notes");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getRawValue() {
        int i = 2 % 2;
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.rawValue;
        int i5 = i3 + 27;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private ImeOptions(String str, int i, String str2) {
        super(str, i);
        this.rawValue = str2;
    }

    static {
        ImeOptions[] imeOptionsArr$values = $values();
        $VALUES = imeOptionsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) imeOptionsArr$values);
        int i = write + 15;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static ImeOptions valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 55;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (ImeOptions) Enum.valueOf(ImeOptions.class, str);
        }
        throw null;
    }

    public static ImeOptions[] values() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (ImeOptions[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ ImeOptions[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 125;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ImeOptions[] imeOptionsArr = {LIKE, DISLIKE, SWIPE_RIGHT, SWIPE_LEFT, ADD_PHOTO, EXPAND_NOTES};
        int i5 = i2 + 87;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return imeOptionsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

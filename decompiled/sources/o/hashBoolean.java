package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hashBoolean {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ hashBoolean[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public static final hashBoolean START = new hashBoolean("START", 0);
    public static final hashBoolean END = new hashBoolean("END", 1);

    private hashBoolean(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 89 / 0;
        return $ENTRIES;
    }

    static {
        hashBoolean[] hashbooleanArr$values = $values();
        $VALUES = hashbooleanArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) hashbooleanArr$values);
        int i = IconCompatParcelizer + 83;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ hashBoolean[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new hashBoolean[]{START, END};
        }
        hashBoolean hashboolean = START;
        hashBoolean hashboolean2 = END;
        hashBoolean[] hashbooleanArr = new hashBoolean[3];
        hashbooleanArr[0] = hashboolean;
        hashbooleanArr[0] = hashboolean2;
        return hashbooleanArr;
    }

    public static hashBoolean valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hashBoolean hashboolean = (hashBoolean) Enum.valueOf(hashBoolean.class, str);
        int i4 = write + 107;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return hashboolean;
    }

    public static hashBoolean[] values() {
        int i = 2 % 2;
        int i2 = write + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hashBoolean[] hashbooleanArr = (hashBoolean[]) $VALUES.clone();
        int i4 = write + 85;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return hashbooleanArr;
    }
}

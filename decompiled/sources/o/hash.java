package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hash {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ hash[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public static final hash START = new hash("START", 0);
    public static final hash END = new hash("END", 1);

    private hash(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        hash[] hashVarArr$values = $values();
        $VALUES = hashVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) hashVarArr$values);
        int i = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ hash[] $values() {
        int i = 2 % 2;
        int i2 = read + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        hash[] hashVarArr = {START, END};
        int i5 = i3 + 109;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return hashVarArr;
    }

    public static hash valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hash hashVar = (hash) Enum.valueOf(hash.class, str);
        int i4 = write + 15;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return hashVar;
    }

    public static hash[] values() {
        int i = 2 % 2;
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hash[] hashVarArr = (hash[]) $VALUES.clone();
        int i4 = read + 119;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return hashVarArr;
    }
}

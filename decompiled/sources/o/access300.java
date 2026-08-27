package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class access300 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ access300[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final access300 BottomSheet = new access300("BottomSheet", 0);
    public static final access300 Map = new access300("Map", 1);
    public static final access300 FloatingLayer = new access300("FloatingLayer", 2);

    private access300(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 13;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 35 / 0;
        return $ENTRIES;
    }

    static {
        access300[] access300VarArr$values = $values();
        $VALUES = access300VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) access300VarArr$values);
        int i = write + 51;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static access300 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        access300 access300Var = (access300) Enum.valueOf(access300.class, str);
        int i4 = read + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return access300Var;
    }

    public static access300[] values() {
        int i = 2 % 2;
        int i2 = serializer + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        access300[] access300VarArr = (access300[]) $VALUES.clone();
        int i4 = serializer + 65;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return access300VarArr;
    }

    private static final /* synthetic */ access300[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 11;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        access300[] access300VarArr = {BottomSheet, Map, FloatingLayer};
        int i5 = i2 + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return access300VarArr;
        }
        throw null;
    }
}

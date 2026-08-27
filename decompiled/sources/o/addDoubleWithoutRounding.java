package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class addDoubleWithoutRounding {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ addDoubleWithoutRounding[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public static final addDoubleWithoutRounding ONGOING = new addDoubleWithoutRounding("ONGOING", 0);
    public static final addDoubleWithoutRounding FAILING = new addDoubleWithoutRounding("FAILING", 1);
    public static final addDoubleWithoutRounding NONE = new addDoubleWithoutRounding("NONE", 2);

    private addDoubleWithoutRounding(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        addDoubleWithoutRounding[] adddoublewithoutroundingArr$values = $values();
        $VALUES = adddoublewithoutroundingArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) adddoublewithoutroundingArr$values);
        int i = write + 55;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 56 / 0;
        }
    }

    public static addDoubleWithoutRounding valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 97;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (addDoubleWithoutRounding) Enum.valueOf(addDoubleWithoutRounding.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static addDoubleWithoutRounding[] values() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        addDoubleWithoutRounding[] adddoublewithoutroundingArr = (addDoubleWithoutRounding[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 59;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return adddoublewithoutroundingArr;
    }

    private static final /* synthetic */ addDoubleWithoutRounding[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 15;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        addDoubleWithoutRounding[] adddoublewithoutroundingArr = {ONGOING, FAILING, NONE};
        int i5 = i2 + 31;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return adddoublewithoutroundingArr;
    }
}

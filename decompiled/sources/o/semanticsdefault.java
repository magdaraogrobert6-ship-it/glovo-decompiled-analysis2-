package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class semanticsdefault {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ semanticsdefault[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    public static final semanticsdefault NEUTRAL = new semanticsdefault("NEUTRAL", 0);
    public static final semanticsdefault WARNING = new semanticsdefault("WARNING", 1);
    public static final semanticsdefault URGENT = new semanticsdefault("URGENT", 2);

    private semanticsdefault(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        semanticsdefault[] semanticsdefaultVarArr$values = $values();
        $VALUES = semanticsdefaultVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) semanticsdefaultVarArr$values);
        int i = RemoteActionCompatParcelizer + 81;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static semanticsdefault valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (semanticsdefault) Enum.valueOf(semanticsdefault.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static semanticsdefault[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        semanticsdefault[] semanticsdefaultVarArr = (semanticsdefault[]) $VALUES.clone();
        int i4 = serializer + 53;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return semanticsdefaultVarArr;
    }

    private static final /* synthetic */ semanticsdefault[] $values() {
        semanticsdefault[] semanticsdefaultVarArr;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 97;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            semanticsdefault semanticsdefaultVar = NEUTRAL;
            semanticsdefault semanticsdefaultVar2 = WARNING;
            semanticsdefault semanticsdefaultVar3 = URGENT;
            semanticsdefaultVarArr = new semanticsdefault[3];
            semanticsdefaultVarArr[1] = semanticsdefaultVar;
            semanticsdefaultVarArr[1] = semanticsdefaultVar2;
            semanticsdefaultVarArr[3] = semanticsdefaultVar3;
        } else {
            semanticsdefaultVarArr = new semanticsdefault[]{NEUTRAL, WARNING, URGENT};
        }
        int i4 = i2 + 21;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return semanticsdefaultVarArr;
        }
        throw null;
    }
}

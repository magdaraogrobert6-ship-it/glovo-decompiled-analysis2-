package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fc {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ fc[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public static final fc CENTER = new fc("CENTER", 0);
    public static final fc LEFT = new fc("LEFT", 1);
    public static final fc RIGHT = new fc("RIGHT", 2);
    public static final fc TOP = new fc("TOP", 3);
    public static final fc BOTTOM = new fc("BOTTOM", 4);
    public static final fc TOP_LEFT = new fc("TOP_LEFT", 5);
    public static final fc TOP_RIGHT = new fc("TOP_RIGHT", 6);
    public static final fc BOTTOM_LEFT = new fc("BOTTOM_LEFT", 7);
    public static final fc BOTTOM_RIGHT = new fc("BOTTOM_RIGHT", 8);

    private fc(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 87;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 77;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        fc[] fcVarArr$values = $values();
        $VALUES = fcVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fcVarArr$values);
        int i = IconCompatParcelizer + 117;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static fc valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        fc fcVar = (fc) Enum.valueOf(fc.class, str);
        int i3 = serializer + 13;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return fcVar;
        }
        throw null;
    }

    public static fc[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fc[] fcVarArr = (fc[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return fcVarArr;
    }

    private static final /* synthetic */ fc[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 79;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        fc[] fcVarArr = {CENTER, LEFT, RIGHT, TOP, BOTTOM, TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT};
        int i5 = i2 + 71;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return fcVarArr;
    }
}

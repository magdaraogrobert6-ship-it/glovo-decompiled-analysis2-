package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class serialize {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ serialize[] $VALUES;
    private static int IconCompatParcelizer = 0;
    public static final serialize NAVIGATION = new serialize("NAVIGATION", 0);
    public static final serialize OVERVIEW = new serialize("OVERVIEW", 1);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;

    private serialize(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 109;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 83 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        serialize[] serializeVarArr$values = $values();
        $VALUES = serializeVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) serializeVarArr$values);
        int i = IconCompatParcelizer + 123;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 95 / 0;
        }
    }

    private static final /* synthetic */ serialize[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        serialize[] serializeVarArr = {NAVIGATION, OVERVIEW};
        int i5 = i3 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
        return serializeVarArr;
    }

    public static serialize valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        serialize serializeVar = (serialize) Enum.valueOf(serialize.class, str);
        int i4 = serializer + 79;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return serializeVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static serialize[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        serialize[] serializeVarArr = (serialize[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 15;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return serializeVarArr;
    }
}

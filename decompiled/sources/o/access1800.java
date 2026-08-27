package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class access1800 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ access1800[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final access1800 GMS = new access1800("GMS", 0);
    public static final access1800 HMS = new access1800("HMS", 1);
    public static final access1800 None = new access1800("None", 2);

    private access1800(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = serializer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 96 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 55;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        access1800[] access1800VarArr$values = $values();
        $VALUES = access1800VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) access1800VarArr$values);
        int i = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static access1800 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 3;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        access1800 access1800Var = (access1800) Enum.valueOf(access1800.class, str);
        int i3 = write + 71;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 44 / 0;
        }
        return access1800Var;
    }

    public static access1800[] values() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        access1800[] access1800VarArr = (access1800[]) $VALUES.clone();
        int i4 = write + 121;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return access1800VarArr;
    }

    private static final /* synthetic */ access1800[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 7;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        access1800[] access1800VarArr = {GMS, HMS, None};
        int i5 = i2 + 39;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return access1800VarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fb {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ fb[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final fb POLYLINE = new fb("POLYLINE", 0);
    public static final fb ARC = new fb("ARC", 1);

    private fb(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 55;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        fb[] fbVarArr$values = $values();
        $VALUES = fbVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fbVarArr$values);
        int i = RemoteActionCompatParcelizer + 93;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ fb[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 33;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        fb[] fbVarArr = {POLYLINE, ARC};
        int i5 = i2 + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return fbVarArr;
    }

    public static fb valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 9;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fb fbVar = (fb) Enum.valueOf(fb.class, str);
        int i4 = serializer + 29;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return fbVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static fb[] values() {
        int i = 2 % 2;
        int i2 = write + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (fb[]) $VALUES.clone();
        }
        int i3 = 33 / 0;
        return (fb[]) $VALUES.clone();
    }
}

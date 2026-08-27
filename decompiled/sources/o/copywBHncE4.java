package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class copywBHncE4 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ copywBHncE4[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    public static final copywBHncE4 Alert = new copywBHncE4("Alert", 0);
    public static final copywBHncE4 Success = new copywBHncE4("Success", 1);

    private copywBHncE4(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 17;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        copywBHncE4[] copywbhnce4Arr$values = $values();
        $VALUES = copywbhnce4Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) copywbhnce4Arr$values);
        int i = IconCompatParcelizer + 71;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ copywBHncE4[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        copywBHncE4[] copywbhnce4Arr = {Alert, Success};
        int i5 = i3 + 39;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return copywbhnce4Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static copywBHncE4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 27;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copywBHncE4 copywbhnce4 = (copywBHncE4) Enum.valueOf(copywBHncE4.class, str);
        int i4 = serializer + 55;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return copywbhnce4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static copywBHncE4[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        copywBHncE4[] copywbhnce4Arr = (copywBHncE4[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return copywbhnce4Arr;
    }
}

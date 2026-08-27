package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class requestBannersRefreshlambda0 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ requestBannersRefreshlambda0[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    private final String value;
    public static final requestBannersRefreshlambda0 SUCCESS = new requestBannersRefreshlambda0("SUCCESS", 0, "success");
    public static final requestBannersRefreshlambda0 ABANDONED = new requestBannersRefreshlambda0("ABANDONED", 1, "abandoned");
    public static final requestBannersRefreshlambda0 FAILED = new requestBannersRefreshlambda0("FAILED", 2, "failed");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 115;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 97 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i2 + 61;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = read + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private requestBannersRefreshlambda0(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        requestBannersRefreshlambda0[] requestbannersrefreshlambda0Arr$values = $values();
        $VALUES = requestbannersrefreshlambda0Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) requestbannersrefreshlambda0Arr$values);
        int i = RemoteActionCompatParcelizer + 39;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static requestBannersRefreshlambda0 valueOf(String str) {
        requestBannersRefreshlambda0 requestbannersrefreshlambda0;
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            requestbannersrefreshlambda0 = (requestBannersRefreshlambda0) Enum.valueOf(requestBannersRefreshlambda0.class, str);
            int i3 = 61 / 0;
        } else {
            requestbannersrefreshlambda0 = (requestBannersRefreshlambda0) Enum.valueOf(requestBannersRefreshlambda0.class, str);
        }
        int i4 = write + 95;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return requestbannersrefreshlambda0;
    }

    public static requestBannersRefreshlambda0[] values() {
        int i = 2 % 2;
        int i2 = write + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        requestBannersRefreshlambda0[] requestbannersrefreshlambda0Arr = (requestBannersRefreshlambda0[]) $VALUES.clone();
        int i4 = read + 77;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return requestbannersrefreshlambda0Arr;
    }

    private static final /* synthetic */ requestBannersRefreshlambda0[] $values() {
        requestBannersRefreshlambda0[] requestbannersrefreshlambda0Arr;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 101;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            requestBannersRefreshlambda0 requestbannersrefreshlambda0 = SUCCESS;
            requestBannersRefreshlambda0 requestbannersrefreshlambda1 = ABANDONED;
            requestBannersRefreshlambda0 requestbannersrefreshlambda2 = FAILED;
            requestbannersrefreshlambda0Arr = new requestBannersRefreshlambda0[3];
            requestbannersrefreshlambda0Arr[0] = requestbannersrefreshlambda0;
            requestbannersrefreshlambda0Arr[1] = requestbannersrefreshlambda1;
            requestbannersrefreshlambda0Arr[5] = requestbannersrefreshlambda2;
        } else {
            requestbannersrefreshlambda0Arr = new requestBannersRefreshlambda0[]{SUCCESS, ABANDONED, FAILED};
        }
        int i4 = i2 + 107;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return requestbannersrefreshlambda0Arr;
    }
}

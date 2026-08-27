package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ResponseData1 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ResponseData1[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public static final ResponseData1 PRIMARY = new ResponseData1("PRIMARY", 0);
    public static final ResponseData1 SECONDARY = new ResponseData1("SECONDARY", 1);
    public static final ResponseData1 DESTRUCTIVE = new ResponseData1("DESTRUCTIVE", 2);
    public static final ResponseData1 SMALL_PRIMARY = new ResponseData1("SMALL_PRIMARY", 3);
    public static final ResponseData1 SMALL_SECONDARY = new ResponseData1("SMALL_SECONDARY", 4);

    private ResponseData1(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 97;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        ResponseData1[] responseData1Arr$values = $values();
        $VALUES = responseData1Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) responseData1Arr$values);
        int i = write + 17;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static ResponseData1 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ResponseData1 responseData1 = (ResponseData1) Enum.valueOf(ResponseData1.class, str);
        int i4 = serializer + 31;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return responseData1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ResponseData1[] values() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ResponseData1[] responseData1Arr = (ResponseData1[]) $VALUES.clone();
        int i4 = serializer + 51;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return responseData1Arr;
        }
        throw null;
    }

    private static final /* synthetic */ ResponseData1[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        ResponseData1[] responseData1Arr = {PRIMARY, SECONDARY, DESTRUCTIVE, SMALL_PRIMARY, SMALL_SECONDARY};
        int i5 = i3 + 73;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return responseData1Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

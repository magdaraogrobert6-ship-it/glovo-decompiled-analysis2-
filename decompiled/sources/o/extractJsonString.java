package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class extractJsonString {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ extractJsonString[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    private final int value;
    public static final extractJsonString Text = new extractJsonString("Text", 0, 1);
    public static final extractJsonString NumberDecimal = new extractJsonString("NumberDecimal", 1, 8194);
    public static final extractJsonString Email = new extractJsonString("Email", 2, 33);
    public static final extractJsonString Phone = new extractJsonString("Phone", 3, 3);
    public static final extractJsonString Password = new extractJsonString("Password", 4, 129);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final int getValue() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        int i3 = 96 / 0;
        return this.value;
    }

    private extractJsonString(String str, int i, int i2) {
        super(str, i);
        this.value = i2;
    }

    static {
        extractJsonString[] extractjsonstringArr$values = $values();
        $VALUES = extractjsonstringArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) extractjsonstringArr$values);
        int i = serializer + 31;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static extractJsonString valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (extractJsonString) Enum.valueOf(extractJsonString.class, str);
        }
        throw null;
    }

    public static extractJsonString[] values() {
        extractJsonString[] extractjsonstringArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            extractjsonstringArr = (extractJsonString[]) $VALUES.clone();
            int i3 = 75 / 0;
        } else {
            extractjsonstringArr = (extractJsonString[]) $VALUES.clone();
        }
        int i4 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return extractjsonstringArr;
    }

    private static final /* synthetic */ extractJsonString[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        extractJsonString[] extractjsonstringArr = {Text, NumberDecimal, Email, Phone, Password};
        int i5 = i2 + 13;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return extractjsonstringArr;
        }
        throw null;
    }
}

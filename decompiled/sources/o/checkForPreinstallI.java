package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class checkForPreinstallI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ checkForPreinstallI[] $VALUES;
    public static final checkAttributionStateI Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private final String value;
    public static final checkForPreinstallI MIN = new checkForPreinstallI("MIN", 0, "min");
    public static final checkForPreinstallI LOW = new checkForPreinstallI("LOW", 1, com.adjust.sdk.Constants.LOW);
    public static final checkForPreinstallI NORMAL = new checkForPreinstallI("NORMAL", 2, com.adjust.sdk.Constants.NORMAL);
    public static final checkForPreinstallI HIGH = new checkForPreinstallI("HIGH", 3, com.adjust.sdk.Constants.HIGH);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 97;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 91;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = read + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            str = this.value;
            int i4 = 44 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private checkForPreinstallI(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        checkForPreinstallI[] checkforpreinstalliArr$values = $values();
        $VALUES = checkforpreinstalliArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) checkforpreinstalliArr$values);
        Companion = new checkAttributionStateI();
        int i = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static checkForPreinstallI valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 97;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        checkForPreinstallI checkforpreinstalli = (checkForPreinstallI) Enum.valueOf(checkForPreinstallI.class, str);
        int i3 = read + 35;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return checkforpreinstalli;
    }

    public static checkForPreinstallI[] values() {
        int i = 2 % 2;
        int i2 = read + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (checkForPreinstallI[]) $VALUES.clone();
        }
        throw null;
    }

    private static final /* synthetic */ checkForPreinstallI[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 115;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        checkForPreinstallI[] checkforpreinstalliArr = {MIN, LOW, NORMAL, HIGH};
        int i5 = i2 + 5;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return checkforpreinstalliArr;
        }
        throw null;
    }
}

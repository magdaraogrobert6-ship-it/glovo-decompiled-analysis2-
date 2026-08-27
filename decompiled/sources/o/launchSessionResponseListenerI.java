package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class launchSessionResponseListenerI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ launchSessionResponseListenerI[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    private final String value;
    public static final launchSessionResponseListenerI VENDOR = new launchSessionResponseListenerI("VENDOR", 0, "vendor");
    public static final launchSessionResponseListenerI CUSTOMER = new launchSessionResponseListenerI("CUSTOMER", 1, "customer");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 31;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 105;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 0 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        int i3 = 26 / 0;
        return this.value;
    }

    private launchSessionResponseListenerI(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    private static final /* synthetic */ launchSessionResponseListenerI[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 99;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        launchSessionResponseListenerI[] launchsessionresponselisteneriArr = {VENDOR, CUSTOMER};
        int i5 = i2 + 107;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return launchsessionresponselisteneriArr;
        }
        throw null;
    }

    static {
        launchSessionResponseListenerI[] launchsessionresponselisteneriArr$values = $values();
        $VALUES = launchsessionresponselisteneriArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) launchsessionresponselisteneriArr$values);
        int i = RemoteActionCompatParcelizer + 15;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static launchSessionResponseListenerI valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 7;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        launchSessionResponseListenerI launchsessionresponselisteneri = (launchSessionResponseListenerI) Enum.valueOf(launchSessionResponseListenerI.class, str);
        int i4 = serializer + 17;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return launchsessionresponselisteneri;
    }

    public static launchSessionResponseListenerI[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        launchSessionResponseListenerI[] launchsessionresponselisteneriArr = (launchSessionResponseListenerI[]) $VALUES.clone();
        int i3 = serializer + 65;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return launchsessionresponselisteneriArr;
    }
}

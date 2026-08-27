package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getRtls_7Xco {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getRtls_7Xco[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final getRtls_7Xco DISABLED = new getRtls_7Xco("DISABLED", 0);
    public static final getRtls_7Xco ON = new getRtls_7Xco("ON", 1);
    public static final getRtls_7Xco OFF = new getRtls_7Xco("OFF", 2);

    private getRtls_7Xco(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 25;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        getRtls_7Xco[] getrtls_7xcoArr$values = $values();
        $VALUES = getrtls_7xcoArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getrtls_7xcoArr$values);
        int i = IconCompatParcelizer + 5;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getRtls_7Xco valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getRtls_7Xco getrtls_7xco = (getRtls_7Xco) Enum.valueOf(getRtls_7Xco.class, str);
        int i4 = RemoteActionCompatParcelizer + 39;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getrtls_7xco;
    }

    public static getRtls_7Xco[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getRtls_7Xco[] getrtls_7xcoArr = (getRtls_7Xco[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 71;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return getrtls_7xcoArr;
    }

    private static final /* synthetic */ getRtls_7Xco[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getRtls_7Xco[] getrtls_7xcoArr = {DISABLED, ON, OFF};
        int i5 = i2 + 79;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getrtls_7xcoArr;
    }
}

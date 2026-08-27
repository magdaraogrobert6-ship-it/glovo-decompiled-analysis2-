package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsSortKt {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ SemanticsSortKt[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final SemanticsSortKt ENCRYPTION = new SemanticsSortKt("ENCRYPTION", 0);
    public static final SemanticsSortKt DECRYPTION = new SemanticsSortKt("DECRYPTION", 1);

    private SemanticsSortKt(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        SemanticsSortKt[] semanticsSortKtArr$values = $values();
        $VALUES = semanticsSortKtArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) semanticsSortKtArr$values);
        int i = serializer + 57;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ SemanticsSortKt[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        SemanticsSortKt[] semanticsSortKtArr = {ENCRYPTION, DECRYPTION};
        int i5 = i3 + 67;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return semanticsSortKtArr;
    }

    public static SemanticsSortKt valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (SemanticsSortKt) Enum.valueOf(SemanticsSortKt.class, str);
        }
        int i3 = 48 / 0;
        return (SemanticsSortKt) Enum.valueOf(SemanticsSortKt.class, str);
    }

    public static SemanticsSortKt[] values() {
        SemanticsSortKt[] semanticsSortKtArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            semanticsSortKtArr = (SemanticsSortKt[]) $VALUES.clone();
            int i3 = 46 / 0;
        } else {
            semanticsSortKtArr = (SemanticsSortKt[]) $VALUES.clone();
        }
        int i4 = RemoteActionCompatParcelizer + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return semanticsSortKtArr;
        }
        throw null;
    }
}

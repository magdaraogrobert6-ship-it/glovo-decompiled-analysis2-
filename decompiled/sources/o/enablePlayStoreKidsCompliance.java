package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class enablePlayStoreKidsCompliance {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ enablePlayStoreKidsCompliance[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public static final enablePlayStoreKidsCompliance GO_BACK = new enablePlayStoreKidsCompliance("GO_BACK", 0);
    public static final enablePlayStoreKidsCompliance RETRY = new enablePlayStoreKidsCompliance("RETRY", 1);
    public static final enablePlayStoreKidsCompliance GRANT_PERMISSIONS = new enablePlayStoreKidsCompliance("GRANT_PERMISSIONS", 2);

    private enablePlayStoreKidsCompliance(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 93;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    static {
        enablePlayStoreKidsCompliance[] enableplaystorekidscomplianceArr$values = $values();
        $VALUES = enableplaystorekidscomplianceArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) enableplaystorekidscomplianceArr$values);
        int i = IconCompatParcelizer + 83;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static enablePlayStoreKidsCompliance valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enablePlayStoreKidsCompliance enableplaystorekidscompliance = (enablePlayStoreKidsCompliance) Enum.valueOf(enablePlayStoreKidsCompliance.class, str);
        int i4 = serializer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enableplaystorekidscompliance;
    }

    public static enablePlayStoreKidsCompliance[] values() {
        int i = 2 % 2;
        int i2 = write + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enablePlayStoreKidsCompliance[] enableplaystorekidscomplianceArr = (enablePlayStoreKidsCompliance[]) $VALUES.clone();
        int i4 = write + 29;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return enableplaystorekidscomplianceArr;
    }

    private static final /* synthetic */ enablePlayStoreKidsCompliance[] $values() {
        int i = 2 % 2;
        int i2 = write + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        enablePlayStoreKidsCompliance[] enableplaystorekidscomplianceArr = {GO_BACK, RETRY, GRANT_PERMISSIONS};
        int i5 = i3 + 39;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return enableplaystorekidscomplianceArr;
        }
        throw null;
    }
}

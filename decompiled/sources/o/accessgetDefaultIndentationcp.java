package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class accessgetDefaultIndentationcp {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ accessgetDefaultIndentationcp[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public static final accessgetDefaultIndentationcp NOT_READY = new accessgetDefaultIndentationcp("NOT_READY", 0);
    public static final accessgetDefaultIndentationcp COOKIE_MISMATCH = new accessgetDefaultIndentationcp("COOKIE_MISMATCH", 1);
    public static final accessgetDefaultIndentationcp EXCEPTION = new accessgetDefaultIndentationcp("EXCEPTION", 2);

    private accessgetDefaultIndentationcp(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 105;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 71;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        accessgetDefaultIndentationcp[] accessgetdefaultindentationcpArr$values = $values();
        $VALUES = accessgetdefaultindentationcpArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) accessgetdefaultindentationcpArr$values);
        int i = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static accessgetDefaultIndentationcp valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        accessgetDefaultIndentationcp accessgetdefaultindentationcp = (accessgetDefaultIndentationcp) Enum.valueOf(accessgetDefaultIndentationcp.class, str);
        int i3 = write + 51;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return accessgetdefaultindentationcp;
    }

    public static accessgetDefaultIndentationcp[] values() {
        int i = 2 % 2;
        int i2 = serializer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        accessgetDefaultIndentationcp[] accessgetdefaultindentationcpArr = (accessgetDefaultIndentationcp[]) $VALUES.clone();
        int i3 = serializer + 11;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return accessgetdefaultindentationcpArr;
    }

    private static final /* synthetic */ accessgetDefaultIndentationcp[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 83;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        accessgetDefaultIndentationcp[] accessgetdefaultindentationcpArr = {NOT_READY, COOKIE_MISMATCH, EXCEPTION};
        int i5 = i3 + 71;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return accessgetdefaultindentationcpArr;
    }
}

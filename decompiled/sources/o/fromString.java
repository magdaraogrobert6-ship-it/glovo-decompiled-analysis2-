package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fromString {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ fromString[] $VALUES;
    public static final getClickTimeInMilliseconds Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String code;
    public static final fromString UnexpectedError = new fromString("UnexpectedError", 0, "0001");
    public static final fromString PassVerificationFailed = new fromString("PassVerificationFailed", 1, "0002");
    public static final fromString BaeminAccountNotFound = new fromString("BaeminAccountNotFound", 2, "0003");
    public static final fromString BaeminAccountBlocked = new fromString("BaeminAccountBlocked", 3, "0004");
    public static final fromString BrmsAccountUnavailable = new fromString("BrmsAccountUnavailable", 4, "0005");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 59;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 65;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.code;
        int i4 = i2 + 69;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private fromString(String str, int i, String str2) {
        super(str, i);
        this.code = str2;
    }

    static {
        fromString[] fromstringArr$values = $values();
        $VALUES = fromstringArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) fromstringArr$values);
        Companion = new getClickTimeInMilliseconds();
        int i = write + 33;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static fromString valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        fromString fromstring = (fromString) Enum.valueOf(fromString.class, str);
        int i4 = read + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return fromstring;
        }
        throw null;
    }

    public static fromString[] values() {
        int i = 2 % 2;
        int i2 = read + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        fromString[] fromstringArr = (fromString[]) $VALUES.clone();
        int i3 = read + 93;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return fromstringArr;
    }

    private static final /* synthetic */ fromString[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 83;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        fromString[] fromstringArr = {UnexpectedError, PassVerificationFailed, BaeminAccountNotFound, BaeminAccountBlocked, BrmsAccountUnavailable};
        int i5 = i2 + 49;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return fromstringArr;
        }
        throw null;
    }
}

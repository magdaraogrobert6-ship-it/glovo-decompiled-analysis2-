package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Transacter {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ Transacter[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    private final String paramKey;
    private final String type;
    public static final Transacter SMS = new Transacter("SMS", 0, "resetPasswordType", "sms");
    public static final Transacter EMAIL = new Transacter("EMAIL", 1, "resetPasswordType", "email");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 93;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getParamKey() {
        String str;
        int i = 2 % 2;
        int i2 = write + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            str = this.paramKey;
            int i4 = 77 / 0;
        } else {
            str = this.paramKey;
        }
        int i5 = i3 + 69;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String getType() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 21;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.type;
            int i4 = 88 / 0;
        } else {
            str = this.type;
        }
        int i5 = i2 + 121;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private Transacter(String str, int i, String str2, String str3) {
        super(str, i);
        this.paramKey = str2;
        this.type = str3;
    }

    private static final /* synthetic */ Transacter[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        Transacter[] transacterArr = {SMS, EMAIL};
        int i5 = i3 + 45;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return transacterArr;
    }

    public static Transacter valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Transacter transacter = (Transacter) Enum.valueOf(Transacter.class, str);
        int i4 = RemoteActionCompatParcelizer + 35;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return transacter;
    }

    public static Transacter[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        Transacter[] transacterArr = (Transacter[]) $VALUES.clone();
        int i3 = RemoteActionCompatParcelizer + 25;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return transacterArr;
    }

    static {
        Transacter[] transacterArr$values = $values();
        $VALUES = transacterArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) transacterArr$values);
        int i = serializer + 89;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
    }
}

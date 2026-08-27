package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getTryInstallReferrer implements writeGlobalCallbackParametersI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getTryInstallReferrer[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String variantName;
    public static final getTryInstallReferrer NO_POLLING_BUTTON_VISIBLE = new getTryInstallReferrer("NO_POLLING_BUTTON_VISIBLE", 0, "no_polling_button_visible");
    public static final getTryInstallReferrer NO_POLLING_BUTTON_PLACEBO = new getTryInstallReferrer("NO_POLLING_BUTTON_PLACEBO", 1, "no_polling_button_placebo");
    public static final getTryInstallReferrer NO_POLLING_BUTTON_HIDDEN = new getTryInstallReferrer("NO_POLLING_BUTTON_HIDDEN", 2, "no_polling_button_hidden");
    public static final getTryInstallReferrer POLLING_BUTTON_VISIBLE = new getTryInstallReferrer("POLLING_BUTTON_VISIBLE", 3, "polling_button_visible");
    public static final getTryInstallReferrer POLLING_BUTTON_PLACEBO = new getTryInstallReferrer("POLLING_BUTTON_PLACEBO", 4, "polling_button_placebo");
    public static final getTryInstallReferrer POLLING_BUTTON_HIDDEN = new getTryInstallReferrer("POLLING_BUTTON_HIDDEN", 5, "polling_button_hidden");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 51;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 13;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 82 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    @Override // o.writeGlobalCallbackParametersI
    public String getVariantName() {
        int i = 2 % 2;
        int i2 = read + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.variantName;
        int i5 = i3 + 71;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private getTryInstallReferrer(String str, int i, String str2) {
        super(str, i);
        this.variantName = str2;
    }

    static {
        getTryInstallReferrer[] gettryinstallreferrerArr$values = $values();
        $VALUES = gettryinstallreferrerArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) gettryinstallreferrerArr$values);
        int i = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static getTryInstallReferrer valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getTryInstallReferrer gettryinstallreferrer = (getTryInstallReferrer) Enum.valueOf(getTryInstallReferrer.class, str);
        int i4 = write + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return gettryinstallreferrer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getTryInstallReferrer[] values() {
        int i = 2 % 2;
        int i2 = write + 99;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getTryInstallReferrer[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ getTryInstallReferrer[] $values() {
        int i = 2 % 2;
        int i2 = read + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        getTryInstallReferrer[] gettryinstallreferrerArr = {NO_POLLING_BUTTON_VISIBLE, NO_POLLING_BUTTON_PLACEBO, NO_POLLING_BUTTON_HIDDEN, POLLING_BUTTON_VISIBLE, POLLING_BUTTON_PLACEBO, POLLING_BUTTON_HIDDEN};
        int i5 = i3 + 25;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 77 / 0;
        }
        return gettryinstallreferrerArr;
    }
}

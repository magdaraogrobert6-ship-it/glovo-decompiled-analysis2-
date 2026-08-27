package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class verifyPlayStorePurchaseI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ verifyPlayStorePurchaseI[] $VALUES;
    public static final updateThirdPartySharingSettingsI Companion;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    private final String value;
    public static final verifyPlayStorePurchaseI PHONE = new verifyPlayStorePurchaseI("PHONE", 0, "phone");
    public static final verifyPlayStorePurchaseI EMAIL = new verifyPlayStorePurchaseI("EMAIL", 1, "email");
    public static final verifyPlayStorePurchaseI EMAIL_OR_PHONE = new verifyPlayStorePurchaseI("EMAIL_OR_PHONE", 2, "email_or_phone");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        throw null;
    }

    private verifyPlayStorePurchaseI(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        verifyPlayStorePurchaseI[] verifyplaystorepurchaseiArr$values = $values();
        $VALUES = verifyplaystorepurchaseiArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) verifyplaystorepurchaseiArr$values);
        Companion = new updateThirdPartySharingSettingsI();
        int i = read + 71;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 88 / 0;
        }
    }

    public static verifyPlayStorePurchaseI valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        verifyPlayStorePurchaseI verifyplaystorepurchasei = (verifyPlayStorePurchaseI) Enum.valueOf(verifyPlayStorePurchaseI.class, str);
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return verifyplaystorepurchasei;
    }

    public static verifyPlayStorePurchaseI[] values() {
        int i = 2 % 2;
        int i2 = write + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        verifyPlayStorePurchaseI[] verifyplaystorepurchaseiArr = (verifyPlayStorePurchaseI[]) $VALUES.clone();
        int i3 = RemoteActionCompatParcelizer + 19;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return verifyplaystorepurchaseiArr;
    }

    private static final /* synthetic */ verifyPlayStorePurchaseI[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new verifyPlayStorePurchaseI[]{PHONE, EMAIL, EMAIL_OR_PHONE};
        }
        verifyPlayStorePurchaseI verifyplaystorepurchasei = PHONE;
        verifyPlayStorePurchaseI verifyplaystorepurchasei2 = EMAIL;
        verifyPlayStorePurchaseI verifyplaystorepurchasei3 = EMAIL_OR_PHONE;
        verifyPlayStorePurchaseI[] verifyplaystorepurchaseiArr = new verifyPlayStorePurchaseI[3];
        verifyplaystorepurchaseiArr[1] = verifyplaystorepurchasei;
        verifyplaystorepurchaseiArr[1] = verifyplaystorepurchasei2;
        verifyplaystorepurchaseiArr[3] = verifyplaystorepurchasei3;
        return verifyplaystorepurchaseiArr;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class BrazeExternalSyntheticLambda4 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ BrazeExternalSyntheticLambda4[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final BrazeExternalSyntheticLambda4 TELEGRAM = new BrazeExternalSyntheticLambda4("TELEGRAM", 0, "Telegram", com.logistics.rider.glovo.R.string.no_messaging_app_found_message_title, com.logistics.rider.glovo.R.string.no_messaging_app_found_message_description);
    public static final BrazeExternalSyntheticLambda4 WHATSAPP = new BrazeExternalSyntheticLambda4("WHATSAPP", 1, "WhatsApp", com.logistics.rider.glovo.R.string.no_messaging_app_found_message_title, com.logistics.rider.glovo.R.string.no_messaging_app_found_message_description);
    private static int read = 0;
    private static int serializer = 1;
    private final String appName;
    private final int descriptionRes;
    private final int titleRes;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 49;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 107;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAppName() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.appName;
        int i5 = i3 + 65;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final int getDescriptionRes() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 113;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.descriptionRes;
        int i6 = i2 + 119;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return i5;
    }

    public final int getTitleRes() {
        int i = 2 % 2;
        int i2 = read + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        int i5 = this.titleRes;
        int i6 = i3 + 121;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    private BrazeExternalSyntheticLambda4(String str, int i, String str2, int i2, int i3) {
        super(str, i);
        this.appName = str2;
        this.titleRes = i2;
        this.descriptionRes = i3;
    }

    private static final /* synthetic */ BrazeExternalSyntheticLambda4[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        BrazeExternalSyntheticLambda4[] brazeExternalSyntheticLambda4Arr = {TELEGRAM, WHATSAPP};
        int i5 = i3 + 105;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 54 / 0;
        }
        return brazeExternalSyntheticLambda4Arr;
    }

    public static BrazeExternalSyntheticLambda4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (BrazeExternalSyntheticLambda4) Enum.valueOf(BrazeExternalSyntheticLambda4.class, str);
        }
        int i3 = 45 / 0;
        return (BrazeExternalSyntheticLambda4) Enum.valueOf(BrazeExternalSyntheticLambda4.class, str);
    }

    public static BrazeExternalSyntheticLambda4[] values() {
        int i = 2 % 2;
        int i2 = read + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BrazeExternalSyntheticLambda4[] brazeExternalSyntheticLambda4Arr = (BrazeExternalSyntheticLambda4[]) $VALUES.clone();
        int i4 = serializer + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return brazeExternalSyntheticLambda4Arr;
        }
        throw null;
    }

    static {
        BrazeExternalSyntheticLambda4[] brazeExternalSyntheticLambda4Arr$values = $values();
        $VALUES = brazeExternalSyntheticLambda4Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) brazeExternalSyntheticLambda4Arr$values);
        int i = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class insertOrUpdateTransformedNodeSubhierarchy {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ insertOrUpdateTransformedNodeSubhierarchy[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    private final String loggingName;
    public static final insertOrUpdateTransformedNodeSubhierarchy LOGIN = new insertOrUpdateTransformedNodeSubhierarchy("LOGIN", 0, "first_time_password");
    public static final insertOrUpdateTransformedNodeSubhierarchy MAGIC_LINK = new insertOrUpdateTransformedNodeSubhierarchy("MAGIC_LINK", 1, "email");
    public static final insertOrUpdateTransformedNodeSubhierarchy OTP = new insertOrUpdateTransformedNodeSubhierarchy("OTP", 2, "sms");
    public static final insertOrUpdateTransformedNodeSubhierarchy TWO_FA = new insertOrUpdateTransformedNodeSubhierarchy("TWO_FA", 3, "two_fa");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = write + 113;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 89 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getLoggingName() {
        int i = 2 % 2;
        int i2 = write + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.loggingName;
        int i5 = i3 + 65;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private insertOrUpdateTransformedNodeSubhierarchy(String str, int i, String str2) {
        super(str, i);
        this.loggingName = str2;
    }

    static {
        insertOrUpdateTransformedNodeSubhierarchy[] insertorupdatetransformednodesubhierarchyArr$values = $values();
        $VALUES = insertorupdatetransformednodesubhierarchyArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) insertorupdatetransformednodesubhierarchyArr$values);
        int i = serializer + 101;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static insertOrUpdateTransformedNodeSubhierarchy valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        insertOrUpdateTransformedNodeSubhierarchy insertorupdatetransformednodesubhierarchy = (insertOrUpdateTransformedNodeSubhierarchy) Enum.valueOf(insertOrUpdateTransformedNodeSubhierarchy.class, str);
        int i4 = write + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return insertorupdatetransformednodesubhierarchy;
        }
        throw null;
    }

    public static insertOrUpdateTransformedNodeSubhierarchy[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        insertOrUpdateTransformedNodeSubhierarchy[] insertorupdatetransformednodesubhierarchyArr = (insertOrUpdateTransformedNodeSubhierarchy[]) $VALUES.clone();
        int i3 = write + 25;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return insertorupdatetransformednodesubhierarchyArr;
    }

    private static final /* synthetic */ insertOrUpdateTransformedNodeSubhierarchy[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 37;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        insertOrUpdateTransformedNodeSubhierarchy[] insertorupdatetransformednodesubhierarchyArr = {LOGIN, MAGIC_LINK, OTP, TWO_FA};
        int i5 = i2 + 101;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return insertorupdatetransformednodesubhierarchyArr;
    }
}

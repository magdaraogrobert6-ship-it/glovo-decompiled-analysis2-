package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setToggleableState {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setToggleableState[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private final String type;
    public static final setToggleableState FACE = new setToggleableState("FACE", 0, "face");
    public static final setToggleableState FINGERPRINT = new setToggleableState("FINGERPRINT", 1, HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT);
    public static final setToggleableState BIOMETRICS = new setToggleableState("BIOMETRICS", 2, "biometrics");
    public static final setToggleableState CREDENTIAL = new setToggleableState("CREDENTIAL", 3, "credentials");
    public static final setToggleableState NONE = new setToggleableState("NONE", 4, "none");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 11;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 71;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = serializer + 33;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.type;
        int i5 = i3 + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private setToggleableState(String str, int i, String str2) {
        super(str, i);
        this.type = str2;
    }

    static {
        setToggleableState[] settoggleablestateArr$values = $values();
        $VALUES = settoggleablestateArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) settoggleablestateArr$values);
        int i = read + 29;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setToggleableState valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (setToggleableState) Enum.valueOf(setToggleableState.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static setToggleableState[] values() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setToggleableState[] settoggleablestateArr = (setToggleableState[]) $VALUES.clone();
        int i4 = serializer + 65;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return settoggleablestateArr;
    }

    private static final /* synthetic */ setToggleableState[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 31;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        setToggleableState[] settoggleablestateArr = {FACE, FINGERPRINT, BIOMETRICS, CREDENTIAL, NONE};
        int i5 = i2 + 115;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return settoggleablestateArr;
    }
}

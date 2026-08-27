package o;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s8 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ s8[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final s8 RUSH_BONUS = new s8("RUSH_BONUS", 0);
    public static final s8 BAD_WEATHER = new s8("BAD_WEATHER", 1);
    public static final s8 NIGHT_BONUS = new s8("NIGHT_BONUS", 2);
    public static final s8 HOLIDAY_BONUS = new s8("HOLIDAY_BONUS", 3);
    public static final s8 UNKNOWN = new s8(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);

    private s8(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 117;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i2 + 35;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        obj.hashCode();
        throw null;
    }

    static {
        s8[] s8VarArr$values = $values();
        $VALUES = s8VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) s8VarArr$values);
        int i = read + 53;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
        }
    }

    public static s8 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        s8 s8Var = (s8) Enum.valueOf(s8.class, str);
        int i4 = RemoteActionCompatParcelizer + 51;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return s8Var;
    }

    public static s8[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (s8[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ s8[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        s8[] s8VarArr = {RUSH_BONUS, BAD_WEATHER, NIGHT_BONUS, HOLIDAY_BONUS, UNKNOWN};
        int i5 = i3 + 9;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return s8VarArr;
        }
        throw null;
    }
}

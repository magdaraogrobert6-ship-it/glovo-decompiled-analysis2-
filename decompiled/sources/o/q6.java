package o;

import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q6 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ q6[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final String value;
    public static final q6 CLOUDFLARE = new q6("CLOUDFLARE", 0, "cloudflare");
    public static final q6 BACKEND = new q6("BACKEND", 1, "backend");
    public static final q6 UNKNOWN = new q6(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, SystemUtils.UNKNOWN);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 11;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 57;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 49;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    private q6(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        q6[] q6VarArr$values = $values();
        $VALUES = q6VarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) q6VarArr$values);
        int i = serializer + 27;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static q6 valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 23;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        q6 q6Var = (q6) Enum.valueOf(q6.class, str);
        int i4 = read + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return q6Var;
    }

    public static q6[] values() {
        int i = 2 % 2;
        int i2 = read + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        q6[] q6VarArr = (q6[]) $VALUES.clone();
        int i4 = read + 11;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return q6VarArr;
    }

    private static final /* synthetic */ q6[] $values() {
        q6[] q6VarArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 33;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            q6 q6Var = CLOUDFLARE;
            q6 q6Var2 = BACKEND;
            q6 q6Var3 = UNKNOWN;
            q6VarArr = new q6[4];
            q6VarArr[1] = q6Var;
            q6VarArr[1] = q6Var2;
            q6VarArr[2] = q6Var3;
        } else {
            q6VarArr = new q6[]{CLOUDFLARE, BACKEND, UNKNOWN};
        }
        int i4 = i2 + 17;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return q6VarArr;
    }
}

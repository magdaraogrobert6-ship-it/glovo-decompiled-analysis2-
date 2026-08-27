package o;

import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class enableCoppaCompliance {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ enableCoppaCompliance[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String value;
    public static final enableCoppaCompliance SAD = new enableCoppaCompliance("SAD", 0, "sad");
    public static final enableCoppaCompliance HAPPY = new enableCoppaCompliance("HAPPY", 1, "happy");
    public static final enableCoppaCompliance UNKNOWN = new enableCoppaCompliance(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, SystemUtils.UNKNOWN);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 1;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 5;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 101;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 15;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private enableCoppaCompliance(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        enableCoppaCompliance[] enablecoppacomplianceArr$values = $values();
        $VALUES = enablecoppacomplianceArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) enablecoppacomplianceArr$values);
        int i = IconCompatParcelizer + 107;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static enableCoppaCompliance valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        enableCoppaCompliance enablecoppacompliance = (enableCoppaCompliance) Enum.valueOf(enableCoppaCompliance.class, str);
        int i4 = write + 121;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return enablecoppacompliance;
    }

    public static enableCoppaCompliance[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (enableCoppaCompliance[]) $VALUES.clone();
        }
        int i3 = 22 / 0;
        return (enableCoppaCompliance[]) $VALUES.clone();
    }

    private static final /* synthetic */ enableCoppaCompliance[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new enableCoppaCompliance[]{SAD, HAPPY, UNKNOWN};
        }
        enableCoppaCompliance enablecoppacompliance = SAD;
        enableCoppaCompliance enablecoppacompliance2 = HAPPY;
        enableCoppaCompliance enablecoppacompliance3 = UNKNOWN;
        enableCoppaCompliance[] enablecoppacomplianceArr = new enableCoppaCompliance[4];
        enablecoppacomplianceArr[0] = enablecoppacompliance;
        enablecoppacomplianceArr[0] = enablecoppacompliance2;
        enablecoppacomplianceArr[3] = enablecoppacompliance3;
        return enablecoppacomplianceArr;
    }
}

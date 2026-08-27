package o;

import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class onServiceConnected {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ onServiceConnected[] $VALUES;
    public static final GooglePlayServicesClientGooglePlayServicesInfo Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    private final String value;
    public static final onServiceConnected WORK_NOW = new onServiceConnected("WORK_NOW", 0, "work_now");
    public static final onServiceConnected WORK_NOW_LOW_FILL = new onServiceConnected("WORK_NOW_LOW_FILL", 1, "work_now_low_fill");
    public static final onServiceConnected GO_AND_START_NOW = new onServiceConnected("GO_AND_START_NOW", 2, "go_and_work_low_fill");
    public static final onServiceConnected UNKNOWN = new onServiceConnected(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3, SystemUtils.UNKNOWN);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 53;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        int i3 = 54 / 0;
        return $ENTRIES;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 81;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            str = this.value;
            int i4 = 51 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 25;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private onServiceConnected(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        onServiceConnected[] onserviceconnectedArr$values = $values();
        $VALUES = onserviceconnectedArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) onserviceconnectedArr$values);
        Companion = new GooglePlayServicesClientGooglePlayServicesInfo();
        int i = RemoteActionCompatParcelizer + 15;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static onServiceConnected valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 71;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        onServiceConnected onserviceconnected = (onServiceConnected) Enum.valueOf(onServiceConnected.class, str);
        int i3 = IconCompatParcelizer + 19;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
        }
        return onserviceconnected;
    }

    public static onServiceConnected[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        onServiceConnected[] onserviceconnectedArr = (onServiceConnected[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onserviceconnectedArr;
    }

    private static final /* synthetic */ onServiceConnected[] $values() {
        int i = 2 % 2;
        int i2 = read + 115;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new onServiceConnected[]{WORK_NOW, WORK_NOW_LOW_FILL, GO_AND_START_NOW, UNKNOWN};
        }
        onServiceConnected onserviceconnected = WORK_NOW;
        onServiceConnected onserviceconnected2 = WORK_NOW_LOW_FILL;
        onServiceConnected onserviceconnected3 = GO_AND_START_NOW;
        onServiceConnected onserviceconnected4 = UNKNOWN;
        onServiceConnected[] onserviceconnectedArr = new onServiceConnected[4];
        onserviceconnectedArr[1] = onserviceconnected;
        onserviceconnectedArr[0] = onserviceconnected2;
        onserviceconnectedArr[5] = onserviceconnected3;
        onserviceconnectedArr[3] = onserviceconnected4;
        return onserviceconnectedArr;
    }
}

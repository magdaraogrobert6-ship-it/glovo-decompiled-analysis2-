package o;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class PlatformTextStyle {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ PlatformTextStyle[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final PlatformTextStyle CAR = new PlatformTextStyle("CAR", 0);
    public static final PlatformTextStyle BIKE = new PlatformTextStyle("BIKE", 1);
    public static final PlatformTextStyle WALKER = new PlatformTextStyle("WALKER", 2);
    public static final PlatformTextStyle UNKNOWN = new PlatformTextStyle(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);

    private PlatformTextStyle(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 1;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        PlatformTextStyle[] platformTextStyleArr$values = $values();
        $VALUES = platformTextStyleArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) platformTextStyleArr$values);
        int i = serializer + 13;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
        }
    }

    public static PlatformTextStyle valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) Enum.valueOf(PlatformTextStyle.class, str);
        int i4 = read + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return platformTextStyle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PlatformTextStyle[] values() {
        int i = 2 % 2;
        int i2 = write + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PlatformTextStyle[] platformTextStyleArr = (PlatformTextStyle[]) $VALUES.clone();
        int i4 = read + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return platformTextStyleArr;
    }

    private static final /* synthetic */ PlatformTextStyle[] $values() {
        int i = 2 % 2;
        int i2 = read + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        PlatformTextStyle[] platformTextStyleArr = {CAR, BIKE, WALKER, UNKNOWN};
        int i5 = i3 + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 35 / 0;
        }
        return platformTextStyleArr;
    }
}

package o;

import fwfd.com.fwfsdk.util.FWFHelper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ef {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ef[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    private final String trackingValue;
    public static final ef ANDROID = new ef("ANDROID", 0, FWFHelper.fwfDeviceOS);
    public static final ef MAPBOX = new ef("MAPBOX", 1, "mapbox");
    public static final ef NAVER = new ef("NAVER", 2, "naver");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getTrackingValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.trackingValue;
        }
        throw null;
    }

    private ef(String str, int i, String str2) {
        super(str, i);
        this.trackingValue = str2;
    }

    static {
        ef[] efVarArr$values = $values();
        $VALUES = efVarArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) efVarArr$values);
        int i = write + 5;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static ef valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ef efVar = (ef) Enum.valueOf(ef.class, str);
        int i4 = serializer + 81;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return efVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ef[] values() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ef[] efVarArr = (ef[]) $VALUES.clone();
        int i4 = serializer + 19;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return efVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ ef[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        ef[] efVarArr = {ANDROID, MAPBOX, NAVER};
        int i5 = i3 + 33;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return efVarArr;
        }
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RoomOpenHelperDelegate {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ RoomOpenHelperDelegate[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;
    private final String value;
    public static final RoomOpenHelperDelegate HeadLeft = new RoomOpenHelperDelegate("HeadLeft", 0, "head_left");
    public static final RoomOpenHelperDelegate HeadRight = new RoomOpenHelperDelegate("HeadRight", 1, "head_right");
    public static final RoomOpenHelperDelegate Smile = new RoomOpenHelperDelegate("Smile", 2, "smile");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 13;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 85;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = write + 31;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            str = this.value;
            int i4 = 42 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 111;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    private RoomOpenHelperDelegate(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        RoomOpenHelperDelegate[] roomOpenHelperDelegateArr$values = $values();
        $VALUES = roomOpenHelperDelegateArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) roomOpenHelperDelegateArr$values);
        int i = IconCompatParcelizer + 11;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    public static RoomOpenHelperDelegate valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RoomOpenHelperDelegate roomOpenHelperDelegate = (RoomOpenHelperDelegate) Enum.valueOf(RoomOpenHelperDelegate.class, str);
        int i4 = write + 29;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return roomOpenHelperDelegate;
    }

    public static RoomOpenHelperDelegate[] values() {
        int i = 2 % 2;
        int i2 = write + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RoomOpenHelperDelegate[] roomOpenHelperDelegateArr = (RoomOpenHelperDelegate[]) $VALUES.clone();
        int i4 = read + 99;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return roomOpenHelperDelegateArr;
    }

    private static final /* synthetic */ RoomOpenHelperDelegate[] $values() {
        int i = 2 % 2;
        int i2 = read + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        RoomOpenHelperDelegate[] roomOpenHelperDelegateArr = {HeadLeft, HeadRight, Smile};
        int i5 = i3 + 63;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return roomOpenHelperDelegateArr;
    }
}

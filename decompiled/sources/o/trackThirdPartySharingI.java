package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class trackThirdPartySharingI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ trackThirdPartySharingI[] $VALUES;
    public static final trackPlayStoreSubscriptionI Companion;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    private static int write;
    private final String value;
    public static final trackThirdPartySharingI DROP_OFF = new trackThirdPartySharingI("DROP_OFF", 0, "dropoff");
    public static final trackThirdPartySharingI PICK_UP = new trackThirdPartySharingI("PICK_UP", 1, "pickup");
    public static final trackThirdPartySharingI NOT_AVAILABLE = new trackThirdPartySharingI("NOT_AVAILABLE", 2, "");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private trackThirdPartySharingI(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        trackThirdPartySharingI[] trackthirdpartysharingiArr$values = $values();
        $VALUES = trackthirdpartysharingiArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) trackthirdpartysharingiArr$values);
        Companion = new trackPlayStoreSubscriptionI();
        int i = write + 3;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static trackThirdPartySharingI valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (trackThirdPartySharingI) Enum.valueOf(trackThirdPartySharingI.class, str);
        }
        throw null;
    }

    public static trackThirdPartySharingI[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        trackThirdPartySharingI[] trackthirdpartysharingiArr = (trackThirdPartySharingI[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 77;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return trackthirdpartysharingiArr;
    }

    private static final /* synthetic */ trackThirdPartySharingI[] $values() {
        trackThirdPartySharingI[] trackthirdpartysharingiArr;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 73;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            trackThirdPartySharingI trackthirdpartysharingi = DROP_OFF;
            trackThirdPartySharingI trackthirdpartysharingi2 = PICK_UP;
            trackThirdPartySharingI trackthirdpartysharingi3 = NOT_AVAILABLE;
            trackthirdpartysharingiArr = new trackThirdPartySharingI[5];
            trackthirdpartysharingiArr[0] = trackthirdpartysharingi;
            trackthirdpartysharingiArr[1] = trackthirdpartysharingi2;
            trackthirdpartysharingiArr[4] = trackthirdpartysharingi3;
        } else {
            trackthirdpartysharingiArr = new trackThirdPartySharingI[]{DROP_OFF, PICK_UP, NOT_AVAILABLE};
        }
        int i4 = i2 + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return trackthirdpartysharingiArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToPushNotificationEventslambda0 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ subscribeToPushNotificationEventslambda0[] $VALUES;
    public static final subscribeToPushNotificationEventslambda0 DF_PICK_UP = new subscribeToPushNotificationEventslambda0("DF_PICK_UP", 0, "DF Pick Up");
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 55 / 0;
        return $ENTRIES;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.value;
        }
        int i3 = 52 / 0;
        return this.value;
    }

    private subscribeToPushNotificationEventslambda0(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    private static final /* synthetic */ subscribeToPushNotificationEventslambda0[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        subscribeToPushNotificationEventslambda0[] subscribetopushnotificationeventslambda0Arr = {DF_PICK_UP};
        int i5 = i3 + 53;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return subscribetopushnotificationeventslambda0Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        subscribeToPushNotificationEventslambda0[] subscribetopushnotificationeventslambda0Arr$values = $values();
        $VALUES = subscribetopushnotificationeventslambda0Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) subscribetopushnotificationeventslambda0Arr$values);
        int i = read + 105;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static subscribeToPushNotificationEventslambda0 valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 109;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        subscribeToPushNotificationEventslambda0 subscribetopushnotificationeventslambda0 = (subscribeToPushNotificationEventslambda0) Enum.valueOf(subscribeToPushNotificationEventslambda0.class, str);
        int i4 = IconCompatParcelizer + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return subscribetopushnotificationeventslambda0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static subscribeToPushNotificationEventslambda0[] values() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        subscribeToPushNotificationEventslambda0[] subscribetopushnotificationeventslambda0Arr = (subscribeToPushNotificationEventslambda0[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 95;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return subscribetopushnotificationeventslambda0Arr;
    }
}

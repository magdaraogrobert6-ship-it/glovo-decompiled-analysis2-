package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class childSerializers {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ childSerializers[] $VALUES;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final childSerializers UNAVAILABLE = new childSerializers("UNAVAILABLE", 0);
    public static final childSerializers ENABLED = new childSerializers("ENABLED", 1);
    public static final childSerializers DISABLED = new childSerializers("DISABLED", 2);

    private childSerializers(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        int i3 = 51 / 0;
        return $ENTRIES;
    }

    static {
        childSerializers[] childserializersArr$values = $values();
        $VALUES = childserializersArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) childserializersArr$values);
        int i = write + 33;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static childSerializers valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (childSerializers) Enum.valueOf(childSerializers.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static childSerializers[] values() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        childSerializers[] childserializersArr = (childSerializers[]) $VALUES.clone();
        int i4 = serializer + 107;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return childserializersArr;
    }

    private static final /* synthetic */ childSerializers[] $values() {
        childSerializers[] childserializersArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            childSerializers childserializers = UNAVAILABLE;
            childSerializers childserializers2 = ENABLED;
            childSerializers childserializers3 = DISABLED;
            childserializersArr = new childSerializers[5];
            childserializersArr[0] = childserializers;
            childserializersArr[1] = childserializers2;
            childserializersArr[3] = childserializers3;
        } else {
            childserializersArr = new childSerializers[]{UNAVAILABLE, ENABLED, DISABLED};
        }
        int i4 = i3 + 93;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return childserializersArr;
    }
}

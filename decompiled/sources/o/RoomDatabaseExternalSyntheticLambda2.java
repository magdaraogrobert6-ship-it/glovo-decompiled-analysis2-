package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RoomDatabaseExternalSyntheticLambda2 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ RoomDatabaseExternalSyntheticLambda2[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    private final String value;
    public static final RoomDatabaseExternalSyntheticLambda2 INTRO = new RoomDatabaseExternalSyntheticLambda2("INTRO", 0, "intro");
    public static final RoomDatabaseExternalSyntheticLambda2 FACE_DETECTION = new RoomDatabaseExternalSyntheticLambda2("FACE_DETECTION", 1, "face_detection");
    public static final RoomDatabaseExternalSyntheticLambda2 LIVENESS_DETECTION = new RoomDatabaseExternalSyntheticLambda2("LIVENESS_DETECTION", 2, "liveness_detection");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 107;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 95;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    private RoomDatabaseExternalSyntheticLambda2(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        RoomDatabaseExternalSyntheticLambda2[] roomDatabaseExternalSyntheticLambda2Arr$values = $values();
        $VALUES = roomDatabaseExternalSyntheticLambda2Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) roomDatabaseExternalSyntheticLambda2Arr$values);
        int i = read + 97;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RoomDatabaseExternalSyntheticLambda2 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RoomDatabaseExternalSyntheticLambda2 roomDatabaseExternalSyntheticLambda2 = (RoomDatabaseExternalSyntheticLambda2) Enum.valueOf(RoomDatabaseExternalSyntheticLambda2.class, str);
        int i4 = serializer + 1;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return roomDatabaseExternalSyntheticLambda2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RoomDatabaseExternalSyntheticLambda2[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RoomDatabaseExternalSyntheticLambda2[] roomDatabaseExternalSyntheticLambda2Arr = (RoomDatabaseExternalSyntheticLambda2[]) $VALUES.clone();
        int i4 = IconCompatParcelizer + 15;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return roomDatabaseExternalSyntheticLambda2Arr;
    }

    private static final /* synthetic */ RoomDatabaseExternalSyntheticLambda2[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 97;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        RoomDatabaseExternalSyntheticLambda2[] roomDatabaseExternalSyntheticLambda2Arr = {INTRO, FACE_DETECTION, LIVENESS_DETECTION};
        int i5 = i2 + 83;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return roomDatabaseExternalSyntheticLambda2Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RoomDatabaseperformClear11 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ RoomDatabaseperformClear11[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String value;
    public static final RoomDatabaseperformClear11 NO_FACE = new RoomDatabaseperformClear11("NO_FACE", 0, "no_face");
    public static final RoomDatabaseperformClear11 MULTIPLE_FACES = new RoomDatabaseperformClear11("MULTIPLE_FACES", 1, "multiple_faces");
    public static final RoomDatabaseperformClear11 CAMERA_ERROR = new RoomDatabaseperformClear11("CAMERA_ERROR", 2, "camera_error");
    public static final RoomDatabaseperformClear11 MLKIT_ERROR = new RoomDatabaseperformClear11("MLKIT_ERROR", 3, "mlkit_error");
    public static final RoomDatabaseperformClear11 TIMER_PASSED = new RoomDatabaseperformClear11("TIMER_PASSED", 4, "timer_passed");
    public static final RoomDatabaseperformClear11 MAX_WRONG_MOVEMENT_COUNT = new RoomDatabaseperformClear11("MAX_WRONG_MOVEMENT_COUNT", 5, "max_wrong_movement_count");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 115;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = read + 85;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 49;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private RoomDatabaseperformClear11(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        RoomDatabaseperformClear11[] roomDatabaseperformClear11Arr$values = $values();
        $VALUES = roomDatabaseperformClear11Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) roomDatabaseperformClear11Arr$values);
        int i = write + 65;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static RoomDatabaseperformClear11 valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 5;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RoomDatabaseperformClear11 roomDatabaseperformClear11 = (RoomDatabaseperformClear11) Enum.valueOf(RoomDatabaseperformClear11.class, str);
        int i4 = serializer + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return roomDatabaseperformClear11;
    }

    public static RoomDatabaseperformClear11[] values() {
        int i = 2 % 2;
        int i2 = read + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RoomDatabaseperformClear11[] roomDatabaseperformClear11Arr = (RoomDatabaseperformClear11[]) $VALUES.clone();
        int i4 = read + 79;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return roomDatabaseperformClear11Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ RoomDatabaseperformClear11[] $values() {
        int i = 2 % 2;
        int i2 = read + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        RoomDatabaseperformClear11[] roomDatabaseperformClear11Arr = {NO_FACE, MULTIPLE_FACES, CAMERA_ERROR, MLKIT_ERROR, TIMER_PASSED, MAX_WRONG_MOVEMENT_COUNT};
        int i5 = i3 + 125;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return roomDatabaseperformClear11Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class FlowUtilcreateFlowinlinedmap1 {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    static {
        int[] iArr = new int[RoomDatabaseperformClear11.values().length];
        try {
            iArr[RoomDatabaseperformClear11.NO_FACE.ordinal()] = 1;
            int i = serializer + 89;
            RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RoomDatabaseperformClear11.MULTIPLE_FACES.ordinal()] = 2;
            int i4 = RemoteActionCompatParcelizer + 75;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RoomDatabaseperformClear11.CAMERA_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RoomDatabaseperformClear11.MLKIT_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RoomDatabaseperformClear11.TIMER_PASSED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RoomDatabaseperformClear11.MAX_WRONG_MOVEMENT_COUNT.ordinal()] = 6;
            int i7 = 2 % 2;
        } catch (NoSuchFieldError unused6) {
        }
        IconCompatParcelizer = iArr;
    }
}

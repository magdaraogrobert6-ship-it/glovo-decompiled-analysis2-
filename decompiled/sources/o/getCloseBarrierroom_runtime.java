package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getCloseBarrierroom_runtime {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getCloseBarrierroom_runtime[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public static final getCloseBarrierroom_runtime NEW_LINE = new getCloseBarrierroom_runtime("NEW_LINE", 0);
    public static final getCloseBarrierroom_runtime COMMA = new getCloseBarrierroom_runtime("COMMA", 1);

    private getCloseBarrierroom_runtime(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        int i3 = 41 / 0;
        return $ENTRIES;
    }

    static {
        getCloseBarrierroom_runtime[] getclosebarrierroom_runtimeArr$values = $values();
        $VALUES = getclosebarrierroom_runtimeArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getclosebarrierroom_runtimeArr$values);
        int i = RemoteActionCompatParcelizer + 55;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ getCloseBarrierroom_runtime[] $values() {
        getCloseBarrierroom_runtime[] getclosebarrierroom_runtimeArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            getCloseBarrierroom_runtime getclosebarrierroom_runtime = NEW_LINE;
            getCloseBarrierroom_runtime getclosebarrierroom_runtime2 = COMMA;
            getclosebarrierroom_runtimeArr = new getCloseBarrierroom_runtime[4];
            getclosebarrierroom_runtimeArr[1] = getclosebarrierroom_runtime;
            getclosebarrierroom_runtimeArr[0] = getclosebarrierroom_runtime2;
        } else {
            getclosebarrierroom_runtimeArr = new getCloseBarrierroom_runtime[]{NEW_LINE, COMMA};
        }
        int i4 = i2 + 103;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getclosebarrierroom_runtimeArr;
    }

    public static getCloseBarrierroom_runtime valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getCloseBarrierroom_runtime) Enum.valueOf(getCloseBarrierroom_runtime.class, str);
        }
        int i3 = 49 / 0;
        return (getCloseBarrierroom_runtime) Enum.valueOf(getCloseBarrierroom_runtime.class, str);
    }

    public static getCloseBarrierroom_runtime[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (getCloseBarrierroom_runtime[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

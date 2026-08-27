package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class endRearDisplaySession {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ endRearDisplaySession[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public static final endRearDisplaySession PRIORITY_HIGH_ACCURACY = new endRearDisplaySession("PRIORITY_HIGH_ACCURACY", 0);
    public static final endRearDisplaySession PRIORITY_BALANCED_POWER_ACCURACY = new endRearDisplaySession("PRIORITY_BALANCED_POWER_ACCURACY", 1);
    public static final endRearDisplaySession PRIORITY_LOW_POWER = new endRearDisplaySession("PRIORITY_LOW_POWER", 2);
    public static final endRearDisplaySession PRIORITY_NO_POWER = new endRearDisplaySession("PRIORITY_NO_POWER", 3);

    private endRearDisplaySession(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 123;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        endRearDisplaySession[] endreardisplaysessionArr$values = $values();
        $VALUES = endreardisplaysessionArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) endreardisplaysessionArr$values);
        int i = serializer + 101;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    public static endRearDisplaySession valueOf(String str) {
        endRearDisplaySession endreardisplaysession;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            endreardisplaysession = (endRearDisplaySession) Enum.valueOf(endRearDisplaySession.class, str);
            int i3 = 59 / 0;
        } else {
            endreardisplaysession = (endRearDisplaySession) Enum.valueOf(endRearDisplaySession.class, str);
        }
        int i4 = RemoteActionCompatParcelizer + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return endreardisplaysession;
        }
        throw null;
    }

    public static endRearDisplaySession[] values() {
        int i = 2 % 2;
        int i2 = write + 19;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (endRearDisplaySession[]) $VALUES.clone();
        }
        int i3 = 46 / 0;
        return (endRearDisplaySession[]) $VALUES.clone();
    }

    private static final /* synthetic */ endRearDisplaySession[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        endRearDisplaySession[] endreardisplaysessionArr = {PRIORITY_HIGH_ACCURACY, PRIORITY_BALANCED_POWER_ACCURACY, PRIORITY_LOW_POWER, PRIORITY_NO_POWER};
        int i5 = i2 + 103;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return endreardisplaysessionArr;
    }
}

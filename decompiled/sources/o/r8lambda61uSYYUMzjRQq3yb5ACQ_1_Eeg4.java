package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4[] $VALUES;
    public static final r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4 DEVICE_SETTINGS = new r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4("DEVICE_SETTINGS", 0);
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int write = 1;

    private r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4[] r8lambda61usyyumzjrqq3yb5acq_1_eeg4Arr$values = $values();
        $VALUES = r8lambda61usyyumzjrqq3yb5acq_1_eeg4Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambda61usyyumzjrqq3yb5acq_1_eeg4Arr$values);
        int i = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 31;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4[] r8lambda61usyyumzjrqq3yb5acq_1_eeg4Arr = {DEVICE_SETTINGS};
        int i5 = i2 + 69;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambda61usyyumzjrqq3yb5acq_1_eeg4Arr;
    }

    public static r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4 valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 117;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4 r8lambda61usyyumzjrqq3yb5acq_1_eeg4 = (r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4) Enum.valueOf(r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4.class, str);
        int i3 = read + 99;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 45 / 0;
        }
        return r8lambda61usyyumzjrqq3yb5acq_1_eeg4;
    }

    public static r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4[] values() {
        int i = 2 % 2;
        int i2 = write + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (r8lambda61uSYYUMzjRQq3yb5ACQ_1_Eeg4[]) $VALUES.clone();
        }
        throw null;
    }
}

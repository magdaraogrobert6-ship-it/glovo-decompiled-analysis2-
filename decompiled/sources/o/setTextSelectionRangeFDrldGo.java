package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class setTextSelectionRangeFDrldGo {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ setTextSelectionRangeFDrldGo[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final String status;
    public static final setTextSelectionRangeFDrldGo AVAILABLE = new setTextSelectionRangeFDrldGo("AVAILABLE", 0, "available");
    public static final setTextSelectionRangeFDrldGo NOT_ENROLLED = new setTextSelectionRangeFDrldGo("NOT_ENROLLED", 1, "not enrolled");
    public static final setTextSelectionRangeFDrldGo NOT_SUPPORTED = new setTextSelectionRangeFDrldGo("NOT_SUPPORTED", 2, "not supported");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.status;
        int i4 = i3 + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    private setTextSelectionRangeFDrldGo(String str, int i, String str2) {
        super(str, i);
        this.status = str2;
    }

    static {
        setTextSelectionRangeFDrldGo[] settextselectionrangefdrldgoArr$values = $values();
        $VALUES = settextselectionrangefdrldgoArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) settextselectionrangefdrldgoArr$values);
        int i = IconCompatParcelizer + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }

    public static setTextSelectionRangeFDrldGo valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (setTextSelectionRangeFDrldGo) Enum.valueOf(setTextSelectionRangeFDrldGo.class, str);
        }
        throw null;
    }

    public static setTextSelectionRangeFDrldGo[] values() {
        int i = 2 % 2;
        int i2 = read + 23;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        setTextSelectionRangeFDrldGo[] settextselectionrangefdrldgoArr = (setTextSelectionRangeFDrldGo[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 31;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return settextselectionrangefdrldgoArr;
    }

    private static final /* synthetic */ setTextSelectionRangeFDrldGo[] $values() {
        setTextSelectionRangeFDrldGo[] settextselectionrangefdrldgoArr;
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 73;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            setTextSelectionRangeFDrldGo settextselectionrangefdrldgo = AVAILABLE;
            setTextSelectionRangeFDrldGo settextselectionrangefdrldgo2 = NOT_ENROLLED;
            setTextSelectionRangeFDrldGo settextselectionrangefdrldgo3 = NOT_SUPPORTED;
            settextselectionrangefdrldgoArr = new setTextSelectionRangeFDrldGo[2];
            settextselectionrangefdrldgoArr[1] = settextselectionrangefdrldgo;
            settextselectionrangefdrldgoArr[1] = settextselectionrangefdrldgo2;
            settextselectionrangefdrldgoArr[3] = settextselectionrangefdrldgo3;
        } else {
            settextselectionrangefdrldgoArr = new setTextSelectionRangeFDrldGo[]{AVAILABLE, NOT_ENROLLED, NOT_SUPPORTED};
        }
        int i4 = i2 + 75;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return settextselectionrangefdrldgoArr;
    }
}

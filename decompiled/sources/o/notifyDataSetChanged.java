package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class notifyDataSetChanged {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ notifyDataSetChanged[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public static final notifyDataSetChanged PRIMARY_BIG = new notifyDataSetChanged("PRIMARY_BIG", 0);
    public static final notifyDataSetChanged PRIMARY_SMALL = new notifyDataSetChanged("PRIMARY_SMALL", 1);
    public static final notifyDataSetChanged SECONDARY_BIG = new notifyDataSetChanged("SECONDARY_BIG", 2);
    public static final notifyDataSetChanged SECONDARY_SMALL = new notifyDataSetChanged("SECONDARY_SMALL", 3);

    private notifyDataSetChanged(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 103;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 79;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        notifyDataSetChanged[] notifydatasetchangedArr$values = $values();
        $VALUES = notifydatasetchangedArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) notifydatasetchangedArr$values);
        int i = write + 95;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static notifyDataSetChanged valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        notifyDataSetChanged notifydatasetchanged = (notifyDataSetChanged) Enum.valueOf(notifyDataSetChanged.class, str);
        int i4 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return notifydatasetchanged;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static notifyDataSetChanged[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        notifyDataSetChanged[] notifydatasetchangedArr = (notifyDataSetChanged[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return notifydatasetchangedArr;
    }

    private static final /* synthetic */ notifyDataSetChanged[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 95;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        notifyDataSetChanged[] notifydatasetchangedArr = {PRIMARY_BIG, PRIMARY_SMALL, SECONDARY_BIG, SECONDARY_SMALL};
        int i5 = i2 + 29;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return notifydatasetchangedArr;
    }
}

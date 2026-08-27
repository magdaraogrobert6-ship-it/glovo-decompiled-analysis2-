package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class addID {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ addID[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final addID INVALID = new addID("INVALID", 0);
    public static final addID CORRUPT = new addID("CORRUPT", 1);
    public static final addID VALID = new addID("VALID", 2);

    private addID(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 7;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 51;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        addID[] addidArr$values = $values();
        $VALUES = addidArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) addidArr$values);
        int i = read + 115;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static addID valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        addID addid = (addID) Enum.valueOf(addID.class, str);
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return addid;
        }
        throw null;
    }

    public static addID[] values() {
        int i = 2 % 2;
        int i2 = write + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        addID[] addidArr = (addID[]) $VALUES.clone();
        int i3 = write + 87;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return addidArr;
        }
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ addID[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        addID[] addidArr = {INVALID, CORRUPT, VALID};
        int i5 = i2 + 113;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return addidArr;
    }
}

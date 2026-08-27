package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getCharSequenceBounds {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getCharSequenceBounds[] $VALUES;
    public static final getCharSequenceBounds ANCHORED = new getCharSequenceBounds("ANCHORED", 0);
    public static final getCharSequenceBounds DISMISSED = new getCharSequenceBounds("DISMISSED", 1);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    private getCharSequenceBounds(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 65;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 79;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        getCharSequenceBounds[] getcharsequenceboundsArr$values = $values();
        $VALUES = getcharsequenceboundsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getcharsequenceboundsArr$values);
        int i = serializer + 27;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ getCharSequenceBounds[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 7;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getCharSequenceBounds[] getcharsequenceboundsArr = {ANCHORED, DISMISSED};
        int i5 = i2 + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getcharsequenceboundsArr;
    }

    public static getCharSequenceBounds valueOf(String str) {
        getCharSequenceBounds getcharsequencebounds;
        int i = 2 % 2;
        int i2 = read + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getcharsequencebounds = (getCharSequenceBounds) Enum.valueOf(getCharSequenceBounds.class, str);
            int i3 = 14 / 0;
        } else {
            getcharsequencebounds = (getCharSequenceBounds) Enum.valueOf(getCharSequenceBounds.class, str);
        }
        int i4 = read + 99;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getcharsequencebounds;
        }
        throw null;
    }

    public static getCharSequenceBounds[] values() {
        int i = 2 % 2;
        int i2 = read + 31;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getCharSequenceBounds[] getcharsequenceboundsArr = (getCharSequenceBounds[]) $VALUES.clone();
        int i4 = write + 89;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getcharsequenceboundsArr;
    }
}

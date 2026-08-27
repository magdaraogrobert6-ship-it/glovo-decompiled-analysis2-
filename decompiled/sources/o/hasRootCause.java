package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hasRootCause {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ hasRootCause[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public static final hasRootCause START = new hasRootCause("START", 0);
    public static final hasRootCause END = new hasRootCause("END", 1);

    private hasRootCause(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 5;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 29;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        hasRootCause[] hasrootcauseArr$values = $values();
        $VALUES = hasrootcauseArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) hasrootcauseArr$values);
        int i = write + 83;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ hasRootCause[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        hasRootCause[] hasrootcauseArr = {START, END};
        int i5 = i3 + 31;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return hasrootcauseArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static hasRootCause valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hasRootCause hasrootcause = (hasRootCause) Enum.valueOf(hasRootCause.class, str);
        int i4 = RemoteActionCompatParcelizer + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return hasrootcause;
    }

    public static hasRootCause[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        hasRootCause[] hasrootcauseArr = (hasRootCause[]) $VALUES.clone();
        int i4 = serializer + 115;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return hasrootcauseArr;
    }
}

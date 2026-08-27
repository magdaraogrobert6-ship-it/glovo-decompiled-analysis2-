package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getMnc {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getMnc[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    public static final getMnc SESSION_STARTED = new getMnc("SESSION_STARTED", 0);
    public static final getMnc SESSION_ENDED = new getMnc("SESSION_ENDED", 1);

    private getMnc(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 17;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return $ENTRIES;
        }
        int i3 = 84 / 0;
        return $ENTRIES;
    }

    static {
        getMnc[] getmncArr$values = $values();
        $VALUES = getmncArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getmncArr$values);
        int i = RemoteActionCompatParcelizer + 59;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final /* synthetic */ getMnc[] $values() {
        int i = 2 % 2;
        int i2 = read + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        getMnc[] getmncArr = {SESSION_STARTED, SESSION_ENDED};
        int i5 = i3 + 19;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getmncArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getMnc valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getMnc getmnc = (getMnc) Enum.valueOf(getMnc.class, str);
        int i3 = read + 45;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getmnc;
    }

    public static getMnc[] values() {
        int i = 2 % 2;
        int i2 = read + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getMnc[] getmncArr = (getMnc[]) $VALUES.clone();
        int i4 = write + 105;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getmncArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

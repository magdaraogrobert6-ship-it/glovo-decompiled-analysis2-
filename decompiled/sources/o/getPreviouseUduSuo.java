package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getPreviouseUduSuo {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getPreviouseUduSuo[] $VALUES;
    public static final getPreviouseUduSuo ADD_PHOTOS = new getPreviouseUduSuo("ADD_PHOTOS", 0);
    public static final getPreviouseUduSuo PHOTOS_AVAILABLE = new getPreviouseUduSuo("PHOTOS_AVAILABLE", 1);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    private getPreviouseUduSuo(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 51;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 103;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        getPreviouseUduSuo[] getpreviouseudusuoArr$values = $values();
        $VALUES = getpreviouseudusuoArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getpreviouseudusuoArr$values);
        int i = RemoteActionCompatParcelizer + 7;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    private static final /* synthetic */ getPreviouseUduSuo[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        getPreviouseUduSuo[] getpreviouseudusuoArr = {ADD_PHOTOS, PHOTOS_AVAILABLE};
        int i5 = i3 + 5;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return getpreviouseudusuoArr;
    }

    public static getPreviouseUduSuo valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getPreviouseUduSuo getpreviouseudusuo = (getPreviouseUduSuo) Enum.valueOf(getPreviouseUduSuo.class, str);
        int i3 = serializer + 65;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getpreviouseudusuo;
    }

    public static getPreviouseUduSuo[] values() {
        getPreviouseUduSuo[] getpreviouseudusuoArr;
        int i = 2 % 2;
        int i2 = write + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            getpreviouseudusuoArr = (getPreviouseUduSuo[]) $VALUES.clone();
            int i3 = 33 / 0;
        } else {
            getpreviouseudusuoArr = (getPreviouseUduSuo[]) $VALUES.clone();
        }
        int i4 = write + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getpreviouseudusuoArr;
    }
}

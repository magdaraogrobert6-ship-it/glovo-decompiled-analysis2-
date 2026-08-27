package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getSearcheUduSuo {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getSearcheUduSuo[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write;
    private final String rawValue;
    public static final getSearcheUduSuo CLICK = new getSearcheUduSuo("CLICK", 0, "click");
    public static final getSearcheUduSuo REPORT = new getSearcheUduSuo("REPORT", 1, "report");
    public static final getSearcheUduSuo REPORT_AND_BLOCK = new getSearcheUduSuo("REPORT_AND_BLOCK", 2, "report_and_block");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 63;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getRawValue() {
        int i = 2 % 2;
        int i2 = write + 77;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.rawValue;
        int i5 = i3 + 21;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    private getSearcheUduSuo(String str, int i, String str2) {
        super(str, i);
        this.rawValue = str2;
    }

    static {
        getSearcheUduSuo[] getsearcheudusuoArr$values = $values();
        $VALUES = getsearcheudusuoArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getsearcheudusuoArr$values);
        int i = RemoteActionCompatParcelizer + 17;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static getSearcheUduSuo valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        getSearcheUduSuo getsearcheudusuo = (getSearcheUduSuo) Enum.valueOf(getSearcheUduSuo.class, str);
        int i3 = serializer + 93;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getsearcheudusuo;
    }

    public static getSearcheUduSuo[] values() {
        int i = 2 % 2;
        int i2 = write + 119;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getSearcheUduSuo[] getsearcheudusuoArr = (getSearcheUduSuo[]) $VALUES.clone();
        int i4 = serializer + 67;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getsearcheudusuoArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ getSearcheUduSuo[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return new getSearcheUduSuo[]{CLICK, REPORT, REPORT_AND_BLOCK};
        }
        getSearcheUduSuo getsearcheudusuo = CLICK;
        getSearcheUduSuo getsearcheudusuo2 = REPORT;
        getSearcheUduSuo getsearcheudusuo3 = REPORT_AND_BLOCK;
        getSearcheUduSuo[] getsearcheudusuoArr = new getSearcheUduSuo[4];
        getsearcheudusuoArr[0] = getsearcheudusuo;
        getsearcheudusuoArr[0] = getsearcheudusuo2;
        getsearcheudusuoArr[2] = getsearcheudusuo3;
        return getsearcheudusuoArr;
    }
}

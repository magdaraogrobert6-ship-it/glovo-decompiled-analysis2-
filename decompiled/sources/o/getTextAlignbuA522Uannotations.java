package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getTextAlignbuA522Uannotations {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getTextAlignbuA522Uannotations[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final getTextAlignbuA522Uannotations LOCAL_ACTIVE = new getTextAlignbuA522Uannotations("LOCAL_ACTIVE", 0);
    public static final getTextAlignbuA522Uannotations CDN_ACTIVE = new getTextAlignbuA522Uannotations("CDN_ACTIVE", 1);

    private getTextAlignbuA522Uannotations(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 29;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        getTextAlignbuA522Uannotations[] gettextalignbua522uannotationsArr$values = $values();
        $VALUES = gettextalignbua522uannotationsArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) gettextalignbua522uannotationsArr$values);
        int i = read + 117;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ getTextAlignbuA522Uannotations[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        getTextAlignbuA522Uannotations[] gettextalignbua522uannotationsArr = {LOCAL_ACTIVE, CDN_ACTIVE};
        int i5 = i3 + 45;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return gettextalignbua522uannotationsArr;
    }

    public static getTextAlignbuA522Uannotations valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getTextAlignbuA522Uannotations gettextalignbua522uannotations = (getTextAlignbuA522Uannotations) Enum.valueOf(getTextAlignbuA522Uannotations.class, str);
        int i4 = serializer + 9;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return gettextalignbua522uannotations;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getTextAlignbuA522Uannotations[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getTextAlignbuA522Uannotations[] gettextalignbua522uannotationsArr = (getTextAlignbuA522Uannotations[]) $VALUES.clone();
        int i4 = serializer + 11;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return gettextalignbua522uannotationsArr;
        }
        throw null;
    }
}

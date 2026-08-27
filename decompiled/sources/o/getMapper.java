package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getMapper {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getMapper[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    public static final getMapper UI_LOAD = new getMapper("UI_LOAD", 0, "ui.load");
    private static int read = 1;
    private static int serializer;
    private final String value;

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 93;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 65;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private getMapper(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    private static final /* synthetic */ getMapper[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        getMapper[] getmapperArr = {UI_LOAD};
        int i5 = i3 + 33;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getmapperArr;
    }

    static {
        getMapper[] getmapperArr$values = $values();
        $VALUES = getmapperArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getmapperArr$values);
        int i = read + 121;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static getMapper valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getMapper) Enum.valueOf(getMapper.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getMapper[] values() {
        getMapper[] getmapperArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            getmapperArr = (getMapper[]) $VALUES.clone();
            int i3 = 84 / 0;
        } else {
            getmapperArr = (getMapper[]) $VALUES.clone();
        }
        int i4 = RemoteActionCompatParcelizer + 21;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getmapperArr;
    }
}

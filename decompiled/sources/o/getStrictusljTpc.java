package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getStrictusljTpc {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getStrictusljTpc[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String value;
    public static final getStrictusljTpc OVERVIEW = new getStrictusljTpc("OVERVIEW", 0, "overview");
    public static final getStrictusljTpc NAVIGATION = new getStrictusljTpc("NAVIGATION", 1, "navigation");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = write + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 1;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = write + 65;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            str = this.value;
            int i4 = 74 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 53;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getStrictusljTpc(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        getStrictusljTpc[] getstrictusljtpcArr$values = $values();
        $VALUES = getstrictusljtpcArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getstrictusljtpcArr$values);
        int i = RemoteActionCompatParcelizer + 45;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
        }
    }

    private static final /* synthetic */ getStrictusljTpc[] $values() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 61;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getStrictusljTpc[] getstrictusljtpcArr = {OVERVIEW, NAVIGATION};
        int i5 = i2 + 103;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getstrictusljtpcArr;
    }

    public static getStrictusljTpc valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        getStrictusljTpc getstrictusljtpc = (getStrictusljTpc) Enum.valueOf(getStrictusljTpc.class, str);
        int i3 = write + 63;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return getstrictusljtpc;
    }

    public static getStrictusljTpc[] values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getStrictusljTpc[] getstrictusljtpcArr = (getStrictusljTpc[]) $VALUES.clone();
        int i4 = write + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return getstrictusljtpcArr;
    }
}

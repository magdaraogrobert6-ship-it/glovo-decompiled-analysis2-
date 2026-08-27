package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedeUduSuo {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ getUnspecifiedeUduSuo[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String rawValue;
    public static final getUnspecifiedeUduSuo BACKEND_SUCCESS = new getUnspecifiedeUduSuo("BACKEND_SUCCESS", 0, "backend success");
    public static final getUnspecifiedeUduSuo FRONTEND_SUCCESS = new getUnspecifiedeUduSuo("FRONTEND_SUCCESS", 1, "frontend success");
    public static final getUnspecifiedeUduSuo AGREE_AND_CONTINUE = new getUnspecifiedeUduSuo("AGREE_AND_CONTINUE", 2, "agree and continue");
    public static final getUnspecifiedeUduSuo AGREE_AND_POST = new getUnspecifiedeUduSuo("AGREE_AND_POST", 3, "agree and post");
    public static final getUnspecifiedeUduSuo CANCEL_WITHOUT_SAVING = new getUnspecifiedeUduSuo("CANCEL_WITHOUT_SAVING", 4, "cancel without saving");
    public static final getUnspecifiedeUduSuo ADD_MORE_IMAGE = new getUnspecifiedeUduSuo("ADD_MORE_IMAGE", 5, "add more image");
    public static final getUnspecifiedeUduSuo DELETE_IMAGE = new getUnspecifiedeUduSuo("DELETE_IMAGE", 6, "delete image");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRawValue() {
        String str;
        int i = 2 % 2;
        int i2 = serializer + 109;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            str = this.rawValue;
            int i4 = 36 / 0;
        } else {
            str = this.rawValue;
        }
        int i5 = i3 + 59;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private getUnspecifiedeUduSuo(String str, int i, String str2) {
        super(str, i);
        this.rawValue = str2;
    }

    static {
        getUnspecifiedeUduSuo[] getunspecifiedeudusuoArr$values = $values();
        $VALUES = getunspecifiedeudusuoArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) getunspecifiedeudusuoArr$values);
        int i = write + 105;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static getUnspecifiedeUduSuo valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (getUnspecifiedeUduSuo) Enum.valueOf(getUnspecifiedeUduSuo.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static getUnspecifiedeUduSuo[] values() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getUnspecifiedeUduSuo[] getunspecifiedeudusuoArr = (getUnspecifiedeUduSuo[]) $VALUES.clone();
        int i4 = serializer + 109;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getunspecifiedeudusuoArr;
    }

    private static final /* synthetic */ getUnspecifiedeUduSuo[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 57;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getUnspecifiedeUduSuo[] getunspecifiedeudusuoArr = {BACKEND_SUCCESS, FRONTEND_SUCCESS, AGREE_AND_CONTINUE, AGREE_AND_POST, CANCEL_WITHOUT_SAVING, ADD_MORE_IMAGE, DELETE_IMAGE};
        int i5 = i2 + 101;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getunspecifiedeudusuoArr;
    }
}

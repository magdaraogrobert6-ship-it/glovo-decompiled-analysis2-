package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RectListDebuggerModifierElement {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ RectListDebuggerModifierElement[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 0;
    private static int write = 1;
    private final String value;
    public static final RectListDebuggerModifierElement GET = new RectListDebuggerModifierElement("GET", 0, "get");
    public static final RectListDebuggerModifierElement POST = new RectListDebuggerModifierElement("POST", 1, "post");
    public static final RectListDebuggerModifierElement PUT = new RectListDebuggerModifierElement("PUT", 2, "put");
    public static final RectListDebuggerModifierElement PATCH = new RectListDebuggerModifierElement("PATCH", 3, "patch");
    public static final RectListDebuggerModifierElement DELETE = new RectListDebuggerModifierElement("DELETE", 4, "delete");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i4 = i3 + 65;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = read + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 != 0) {
            str = this.value;
            int i4 = 26 / 0;
        } else {
            str = this.value;
        }
        int i5 = i3 + 59;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private RectListDebuggerModifierElement(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        RectListDebuggerModifierElement[] rectListDebuggerModifierElementArr$values = $values();
        $VALUES = rectListDebuggerModifierElementArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) rectListDebuggerModifierElementArr$values);
        int i = RemoteActionCompatParcelizer + 85;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static RectListDebuggerModifierElement valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        RectListDebuggerModifierElement rectListDebuggerModifierElement = (RectListDebuggerModifierElement) Enum.valueOf(RectListDebuggerModifierElement.class, str);
        int i3 = read + 83;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return rectListDebuggerModifierElement;
    }

    public static RectListDebuggerModifierElement[] values() {
        int i = 2 % 2;
        int i2 = read + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        RectListDebuggerModifierElement[] rectListDebuggerModifierElementArr = (RectListDebuggerModifierElement[]) $VALUES.clone();
        int i4 = read + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return rectListDebuggerModifierElementArr;
    }

    private static final /* synthetic */ RectListDebuggerModifierElement[] $values() {
        int i = 2 % 2;
        int i2 = serializer + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        RectListDebuggerModifierElement[] rectListDebuggerModifierElementArr = {GET, POST, PUT, PATCH, DELETE};
        int i5 = i3 + 69;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return rectListDebuggerModifierElementArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidIndirectPointerEvent {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ AndroidIndirectPointerEvent[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final AndroidIndirectPointerEvent Start = new AndroidIndirectPointerEvent("Start", 0);
    public static final AndroidIndirectPointerEvent Stop = new AndroidIndirectPointerEvent("Stop", 1);
    private static int read;
    private static int write;

    private AndroidIndirectPointerEvent(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return $ENTRIES;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        AndroidIndirectPointerEvent[] androidIndirectPointerEventArr$values = $values();
        $VALUES = androidIndirectPointerEventArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) androidIndirectPointerEventArr$values);
        int i = write + 113;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    private static final /* synthetic */ AndroidIndirectPointerEvent[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        AndroidIndirectPointerEvent[] androidIndirectPointerEventArr = {Start, Stop};
        int i5 = i3 + 27;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return androidIndirectPointerEventArr;
    }

    public static AndroidIndirectPointerEvent valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (AndroidIndirectPointerEvent) Enum.valueOf(AndroidIndirectPointerEvent.class, str);
        }
        throw null;
    }

    public static AndroidIndirectPointerEvent[] values() {
        int i = 2 % 2;
        int i2 = read + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        AndroidIndirectPointerEvent[] androidIndirectPointerEventArr = (AndroidIndirectPointerEvent[]) $VALUES.clone();
        int i3 = IconCompatParcelizer + 63;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return androidIndirectPointerEventArr;
        }
        obj.hashCode();
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class showSoftInput {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ showSoftInput[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int write;
    private final int iconRes;
    public static final showSoftInput EXPANDED = new showSoftInput("EXPANDED", 0, com.logistics.rider.glovo.R.drawable.ic_bold_large_collapse_default);
    public static final showSoftInput COLLAPSED = new showSoftInput("COLLAPSED", 1, com.logistics.rider.glovo.R.drawable.ic_bold_large_open_in_full_default);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        int i = 2 % 2;
        int i2 = write + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
            int i4 = 81 / 0;
        } else {
            r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        }
        int i5 = i3 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 13;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.iconRes;
        int i6 = i2 + 59;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    private showSoftInput(String str, int i, int i2) {
        super(str, i);
        this.iconRes = i2;
    }

    private static final /* synthetic */ showSoftInput[] $values() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 37;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        showSoftInput[] showsoftinputArr = {EXPANDED, COLLAPSED};
        int i5 = i2 + 19;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return showsoftinputArr;
    }

    static {
        showSoftInput[] showsoftinputArr$values = $values();
        $VALUES = showsoftinputArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) showsoftinputArr$values);
        int i = RemoteActionCompatParcelizer + 125;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static showSoftInput valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        showSoftInput showsoftinput = (showSoftInput) Enum.valueOf(showSoftInput.class, str);
        int i3 = read + 19;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return showsoftinput;
        }
        throw null;
    }

    public static showSoftInput[] values() {
        int i = 2 % 2;
        int i2 = write + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (showSoftInput[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

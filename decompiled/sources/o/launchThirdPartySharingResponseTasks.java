package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class launchThirdPartySharingResponseTasks {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ launchThirdPartySharingResponseTasks[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    private final String value;
    public static final launchThirdPartySharingResponseTasks OPEN = new launchThirdPartySharingResponseTasks("OPEN", 0, "open");
    public static final launchThirdPartySharingResponseTasks CLOSED = new launchThirdPartySharingResponseTasks("CLOSED", 1, "closed");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = serializer + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 83;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = serializer + 115;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private launchThirdPartySharingResponseTasks(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        launchThirdPartySharingResponseTasks[] launchthirdpartysharingresponsetasksArr$values = $values();
        $VALUES = launchthirdpartysharingresponsetasksArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) launchthirdpartysharingresponsetasksArr$values);
        int i = read + 107;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final /* synthetic */ launchThirdPartySharingResponseTasks[] $values() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 39;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        launchThirdPartySharingResponseTasks[] launchthirdpartysharingresponsetasksArr = {OPEN, CLOSED};
        int i5 = i2 + 77;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return launchthirdpartysharingresponsetasksArr;
    }

    public static launchThirdPartySharingResponseTasks valueOf(String str) {
        int i = 2 % 2;
        int i2 = serializer + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        launchThirdPartySharingResponseTasks launchthirdpartysharingresponsetasks = (launchThirdPartySharingResponseTasks) Enum.valueOf(launchThirdPartySharingResponseTasks.class, str);
        int i3 = RemoteActionCompatParcelizer + 35;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return launchthirdpartysharingresponsetasks;
    }

    public static launchThirdPartySharingResponseTasks[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        launchThirdPartySharingResponseTasks[] launchthirdpartysharingresponsetasksArr = (launchThirdPartySharingResponseTasks[]) $VALUES.clone();
        int i4 = RemoteActionCompatParcelizer + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return launchthirdpartysharingresponsetasksArr;
        }
        throw null;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[] $VALUES;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public static final r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs BACK = new r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs("BACK", 0);
    public static final r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs CLOSE = new r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs("CLOSE", 1);
    public static final r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs NONE = new r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs("NONE", 2);

    private r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 107;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[] r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr$values = $values();
        $VALUES = r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr$values);
        int i = RemoteActionCompatParcelizer + 9;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 90 / 0;
        }
    }

    public static r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs valueOf(String str) {
        int i = 2 % 2;
        int i2 = read + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys = (r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs) Enum.valueOf(r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs.class, str);
        int i4 = read + 27;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return r8lambdagcpcuhbei3f7gmv4pjjfd18owys;
        }
        throw null;
    }

    public static r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[] values() {
        int i = 2 % 2;
        int i2 = read + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[]) $VALUES.clone();
        }
        int i3 = 68 / 0;
        return (r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[]) $VALUES.clone();
    }

    private static final /* synthetic */ r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[] $values() {
        r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[] r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys = BACK;
            r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys2 = CLOSE;
            r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs r8lambdagcpcuhbei3f7gmv4pjjfd18owys3 = NONE;
            r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr = new r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[4];
            r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr[0] = r8lambdagcpcuhbei3f7gmv4pjjfd18owys;
            r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr[0] = r8lambdagcpcuhbei3f7gmv4pjjfd18owys2;
            r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr[2] = r8lambdagcpcuhbei3f7gmv4pjjfd18owys3;
        } else {
            r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr = new r8lambdaGcPCuHbeI3f7gmV4PjjFd18oWYs[]{BACK, CLOSE, NONE};
        }
        int i4 = i3 + 73;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return r8lambdagcpcuhbei3f7gmv4pjjfd18owysArr;
    }
}

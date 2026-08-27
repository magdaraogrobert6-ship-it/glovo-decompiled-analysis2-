package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class createDeeplinkIntentI {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ createDeeplinkIntentI[] $VALUES;
    public static final deleteActivityState Companion;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    private final String value;
    public static final createDeeplinkIntentI OPEN_APP = new createDeeplinkIntentI("OPEN_APP", 0, "open_app");
    public static final createDeeplinkIntentI OPEN_SENDBIRD = new createDeeplinkIntentI("OPEN_SENDBIRD", 1, "open_Sendbird");
    public static final createDeeplinkIntentI OPEN_HELP_CENTER_CHAT = new createDeeplinkIntentI("OPEN_HELP_CENTER_CHAT", 2, "open_help_center");

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i3 + 53;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 61;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 117;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    private createDeeplinkIntentI(String str, int i, String str2) {
        super(str, i);
        this.value = str2;
    }

    static {
        createDeeplinkIntentI[] createdeeplinkintentiArr$values = $values();
        $VALUES = createdeeplinkintentiArr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) createdeeplinkintentiArr$values);
        Companion = new deleteActivityState();
        int i = write + 35;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static createDeeplinkIntentI valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (createDeeplinkIntentI) Enum.valueOf(createDeeplinkIntentI.class, str);
        }
        throw null;
    }

    public static createDeeplinkIntentI[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        createDeeplinkIntentI[] createdeeplinkintentiArr = (createDeeplinkIntentI[]) $VALUES.clone();
        int i4 = serializer + 91;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createdeeplinkintentiArr;
    }

    private static final /* synthetic */ createDeeplinkIntentI[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 41;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        createDeeplinkIntentI[] createdeeplinkintentiArr = {OPEN_APP, OPEN_SENDBIRD, OPEN_HELP_CENTER_CHAT};
        int i5 = i2 + 117;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createdeeplinkintentiArr;
    }
}

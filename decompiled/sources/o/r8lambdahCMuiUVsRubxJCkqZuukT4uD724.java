package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdahCMuiUVsRubxJCkqZuukT4uD724 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ r8lambdahCMuiUVsRubxJCkqZuukT4uD724[] $VALUES;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final r8lambdahCMuiUVsRubxJCkqZuukT4uD724 NEUTRAL = new r8lambdahCMuiUVsRubxJCkqZuukT4uD724("NEUTRAL", 0);
    public static final r8lambdahCMuiUVsRubxJCkqZuukT4uD724 SUCCESS = new r8lambdahCMuiUVsRubxJCkqZuukT4uD724("SUCCESS", 1);
    public static final r8lambdahCMuiUVsRubxJCkqZuukT4uD724 CRITICAL = new r8lambdahCMuiUVsRubxJCkqZuukT4uD724("CRITICAL", 2);
    public static final r8lambdahCMuiUVsRubxJCkqZuukT4uD724 ALERT = new r8lambdahCMuiUVsRubxJCkqZuukT4uD724("ALERT", 3);

    private r8lambdahCMuiUVsRubxJCkqZuukT4uD724(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 13;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 29;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        r8lambdahCMuiUVsRubxJCkqZuukT4uD724[] r8lambdahcmuiuvsrubxjckqzuukt4ud724Arr$values = $values();
        $VALUES = r8lambdahcmuiuvsrubxjckqzuukt4ud724Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) r8lambdahcmuiuvsrubxjckqzuukt4ud724Arr$values);
        int i = serializer + 109;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static r8lambdahCMuiUVsRubxJCkqZuukT4uD724 valueOf(String str) {
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        r8lambdahCMuiUVsRubxJCkqZuukT4uD724 r8lambdahcmuiuvsrubxjckqzuukt4ud724 = (r8lambdahCMuiUVsRubxJCkqZuukT4uD724) Enum.valueOf(r8lambdahCMuiUVsRubxJCkqZuukT4uD724.class, str);
        int i3 = RemoteActionCompatParcelizer + 61;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return r8lambdahcmuiuvsrubxjckqzuukt4ud724;
    }

    public static r8lambdahCMuiUVsRubxJCkqZuukT4uD724[] values() {
        int i = 2 % 2;
        int i2 = write + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        r8lambdahCMuiUVsRubxJCkqZuukT4uD724[] r8lambdahcmuiuvsrubxjckqzuukt4ud724Arr = (r8lambdahCMuiUVsRubxJCkqZuukT4uD724[]) $VALUES.clone();
        int i4 = write + 55;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return r8lambdahcmuiuvsrubxjckqzuukt4ud724Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final /* synthetic */ r8lambdahCMuiUVsRubxJCkqZuukT4uD724[] $values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        r8lambdahCMuiUVsRubxJCkqZuukT4uD724[] r8lambdahcmuiuvsrubxjckqzuukt4ud724Arr = {NEUTRAL, SUCCESS, CRITICAL, ALERT};
        int i5 = i3 + 71;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdahcmuiuvsrubxjckqzuukt4ud724Arr;
    }
}

package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler46 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ActivityHandler46[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int write;
    public static final ActivityHandler46 WELCOME = new ActivityHandler46("WELCOME", 0);
    public static final ActivityHandler46 LOGIN = new ActivityHandler46("LOGIN", 1);

    private ActivityHandler46(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 73;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 43;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
    }

    static {
        ActivityHandler46[] activityHandler46Arr$values = $values();
        $VALUES = activityHandler46Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) activityHandler46Arr$values);
        int i = read + 87;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static final /* synthetic */ ActivityHandler46[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return new ActivityHandler46[]{WELCOME, LOGIN};
        }
        ActivityHandler46 activityHandler46 = WELCOME;
        ActivityHandler46 activityHandler47 = LOGIN;
        ActivityHandler46[] activityHandler46Arr = new ActivityHandler46[3];
        activityHandler46Arr[0] = activityHandler46;
        activityHandler46Arr[1] = activityHandler47;
        return activityHandler46Arr;
    }

    public static ActivityHandler46 valueOf(String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ActivityHandler46 activityHandler46 = (ActivityHandler46) Enum.valueOf(ActivityHandler46.class, str);
        int i4 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return activityHandler46;
    }

    public static ActivityHandler46[] values() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (ActivityHandler46[]) $VALUES.clone();
        }
        int i3 = 99 / 0;
        return (ActivityHandler46[]) $VALUES.clone();
    }
}

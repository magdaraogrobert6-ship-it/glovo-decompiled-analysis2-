package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler23 {
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
    private static final /* synthetic */ ActivityHandler23[] $VALUES;
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public static final ActivityHandler23 ACCOUNT_EXISTS = new ActivityHandler23("ACCOUNT_EXISTS", 0);
    public static final ActivityHandler23 INCOMPLETE_APPLICANT = new ActivityHandler23("INCOMPLETE_APPLICANT", 1);
    public static final ActivityHandler23 ACTIVE = new ActivityHandler23("ACTIVE", 2);
    public static final ActivityHandler23 APPROVED = new ActivityHandler23("APPROVED", 3);
    public static final ActivityHandler23 REJECTED = new ActivityHandler23("REJECTED", 4);
    public static final ActivityHandler23 MULTIPLE = new ActivityHandler23("MULTIPLE", 5);
    public static final ActivityHandler23 BLACKLISTED = new ActivityHandler23("BLACKLISTED", 6);

    private ActivityHandler23(String str, int i) {
        super(str, i);
    }

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 79;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
        int i5 = i2 + 109;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
        }
        throw null;
    }

    static {
        ActivityHandler23[] activityHandler23Arr$values = $values();
        $VALUES = activityHandler23Arr$values;
        $ENTRIES = coil3.util.UtilsKt.read((Enum[]) activityHandler23Arr$values);
        int i = read + 43;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static ActivityHandler23 valueOf(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        ActivityHandler23 activityHandler23 = (ActivityHandler23) Enum.valueOf(ActivityHandler23.class, str);
        int i3 = IconCompatParcelizer + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return activityHandler23;
    }

    public static ActivityHandler23[] values() {
        ActivityHandler23[] activityHandler23Arr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            activityHandler23Arr = (ActivityHandler23[]) $VALUES.clone();
            int i3 = 77 / 0;
        } else {
            activityHandler23Arr = (ActivityHandler23[]) $VALUES.clone();
        }
        int i4 = IconCompatParcelizer + 113;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return activityHandler23Arr;
    }

    private static final /* synthetic */ ActivityHandler23[] $values() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 87;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ActivityHandler23[] activityHandler23Arr = {ACCOUNT_EXISTS, INCOMPLETE_APPLICANT, ACTIVE, APPROVED, REJECTED, MULTIPLE, BLACKLISTED};
        int i5 = i2 + 7;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return activityHandler23Arr;
    }
}
